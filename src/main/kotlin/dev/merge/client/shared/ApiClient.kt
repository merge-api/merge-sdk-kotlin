package dev.merge.client.shared

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import dev.merge.client.shared.auth.*
import io.ktor.client.*
import io.ktor.client.engine.*
import io.ktor.client.engine.apache.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.request.forms.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.http.content.*
import io.ktor.serialization.jackson.*
import io.ktor.util.*
import io.ktor.util.reflect.*
import io.ktor.utils.io.core.*

open class ApiClient(
        private val baseUrl: String,
        httpClientEngine: HttpClientEngine?,
        httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
        json: ObjectMapper,
) {

    private val client: HttpClient by lazy {
        httpClientEngine?.let {
            HttpClient(it, httpClientConfig ?: {
                install(ContentNegotiation) {
                    jackson {
                        registerModule(JavaTimeModule())
                        findAndRegisterModules()
                    }
                }
                expectSuccess = true
            })
        } ?: HttpClient(Apache, httpClientConfig ?: {
            install(ContentNegotiation) {
                jackson {
                    registerModule(JavaTimeModule())
                    findAndRegisterModules()
                }
            }
            expectSuccess = true
        })
    }

    private val authentications: kotlin.collections.Map<String, Authentication> by lazy {
        mapOf(
                "bearerAuth" to HttpBearerAuth(),
                "accountTokenAuth" to AccountTokenAuth())
    }

    private val json: ObjectMapper by lazy {
        json
    }

    companion object {
        const val BASE_URL = "https://api.merge.dev/api/"
        val JSON_DEFAULT = ObjectMapper()
        protected val UNSAFE_HEADERS = listOf(HttpHeaders.ContentType)

        init {
            JSON_DEFAULT.findAndRegisterModules()
            JSON_DEFAULT.enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE);
        }

        inline fun <reified T> jsonConvertSafe(raw: List<JsonNode>?): List<T>? {
            if (raw == null) {
                return null
            }

            return raw.map {
                jsonConvertSafe<T>(it)
            }.toList().filterNotNull()
        }

        inline fun <reified T> jsonConvertSafe(raw: JsonNode?): T? {
            try {
                return JSON_DEFAULT.convertValue(raw, T::class.java)
            } catch (exc: Exception) { }
            return null
        }

        inline fun <reified T> jsonConvertRequiredSafe(raw: List<JsonNode>): List<T> {
            if (raw.isEmpty()) {
                return listOf()
            }

            return raw.map {
                jsonConvertSafe<T>(it)
            }.toList().filterNotNull()
        }

        inline fun <reified T> jsonConvertRequiredSafe(raw: JsonNode): T {
            return JSON_DEFAULT.convertValue(raw, T::class.java)
        }
    }

    /**
     * Set the API key value for the first API key authentication.
     *
     * @param apiKey API key
     * @param paramName The name of the API key parameter, or null or set the first key.
     */
    fun setApiKey(apiKey: String) {
        val auth = authentications?.values?.firstOrNull { it is HttpBearerAuth } as HttpBearerAuth?
                ?: throw Exception("No API key authentication configured")
        auth.bearerToken = apiKey
    }

    /**
     * Set the access token for the first Bearer authentication.
     *
     * @param bearerToken The bearer token.
     */
    fun setAccountToken(accountToken: String) {
        val auth = authentications?.values?.firstOrNull { it is AccountTokenAuth } as AccountTokenAuth?
                ?: throw Exception("No account token authentication configured")
        auth.accountToken = accountToken
    }

    protected suspend fun <T: Any?> multipartFormRequest(requestConfig: RequestConfig<T>, body: kotlin.collections.List<PartData>?, authNames: kotlin.collections.List<String>): HttpResponse {
        return request(requestConfig, MultiPartFormDataContent(body ?: listOf()), authNames)
    }

    protected suspend fun <T: Any?> urlEncodedFormRequest(requestConfig: RequestConfig<T>, body: Parameters?, authNames: kotlin.collections.List<String>): HttpResponse {
        return request(requestConfig, FormDataContent(body ?: Parameters.Empty), authNames)
    }

    protected suspend fun <T: Any?> jsonRequest(requestConfig: RequestConfig<T>, body: Any? = null, authNames: kotlin.collections.List<String>): HttpResponse {
        val contentType = (requestConfig.headers[HttpHeaders.ContentType]?.let { ContentType.parse(it) }
                ?: ContentType.Application.Json)
        return if (body != null) request(requestConfig, body, authNames)
        else request(requestConfig, authNames = authNames)
    }

    @Throws(ResponseException::class)
    protected suspend fun <T: Any?> request(requestConfig: RequestConfig<T>, body: Any? = null, authNames: kotlin.collections.List<String>): HttpResponse {
        requestConfig.updateForAuth<T>(authNames)
        val headers = requestConfig.headers

        return client.request {
            this.url {
                this.takeFrom(URLBuilder(baseUrl))
                appendPath(requestConfig.path.trimStart('/').split('/'))
                requestConfig.query.forEach { query ->
                    query.value.forEach { value ->
                        parameter(query.key, value)
                    }
                }
            }
            this.method = requestConfig.method.httpMethod
            headers.filter { header -> !UNSAFE_HEADERS.contains(header.key) }.forEach { header -> this.header(header.key, header.value) }
            if (requestConfig.method in listOf(RequestMethod.PUT, RequestMethod.POST, RequestMethod.PATCH))
                this.setBody(body)

        }
    }

    private fun <T: Any?> RequestConfig<T>.updateForAuth(authNames: kotlin.collections.List<String>) {
        for (authName in authNames) {
            val auth = authentications?.get(authName) ?: throw Exception("Authentication undefined: $authName")
            auth.apply(query, headers)
        }
    }

    private fun URLBuilder.appendPath(components: kotlin.collections.List<String>): URLBuilder = apply {
        encodedPath = encodedPath.trimEnd('/') + components.joinToString("/", prefix = "/") { it.encodeURLQueryComponent() }
    }

    private val RequestMethod.httpMethod: HttpMethod
        get() = when (this) {
            RequestMethod.DELETE -> HttpMethod.Delete
            RequestMethod.GET -> HttpMethod.Get
            RequestMethod.HEAD -> HttpMethod.Head
            RequestMethod.PATCH -> HttpMethod.Patch
            RequestMethod.PUT -> HttpMethod.Put
            RequestMethod.POST -> HttpMethod.Post
            RequestMethod.OPTIONS -> HttpMethod.Options
        }
}