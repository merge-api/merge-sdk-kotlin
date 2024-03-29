/**
 * Merge Marketing Automation API
 *
 * The unified API for building rich integrations with multiple Marketing Automation platforms.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: hello@merge.dev
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package dev.merge.client.mktg.apis

import dev.merge.client.mktg.models.DataPassthroughRequest
import dev.merge.client.mktg.models.RemoteResponse

import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.jackson.jackson
import io.ktor.client.call.body
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.future.future
import java.util.concurrent.CompletableFuture

import com.fasterxml.jackson.databind.ObjectMapper

import dev.merge.client.shared.*

open class PassthroughApi(
baseUrl: String = ApiClient.BASE_URL + "mktg/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class PassthroughCreateRequest (
        val dataPassthroughRequest: DataPassthroughRequest
    )

    /**
    * 
    * Pull data from an endpoint not currently supported by Merge.
     * @param dataPassthroughRequest  
     * @return RemoteResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun passthroughCreate(requestModel: PassthroughApi.PassthroughCreateRequest): RemoteResponse {
        return passthroughCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun passthroughCreateAsync(requestModel: PassthroughApi.PassthroughCreateRequest): CompletableFuture<RemoteResponse> = GlobalScope.future {
        passthroughCreate(requestModel)
    }

    /**
     * @param dataPassthroughRequest  
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun passthroughCreateExpanded(requestModel: PassthroughApi.PassthroughCreateRequest): RemoteResponse.Expanded {
        return passthroughCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun passthroughCreateExpandedAsync(requestModel: PassthroughApi.PassthroughCreateRequest): CompletableFuture<RemoteResponse.Expanded> = GlobalScope.future {
        passthroughCreateExpanded(requestModel)
    }

    private suspend inline fun <reified T> passthroughCreateImpl(requestModel: PassthroughApi.PassthroughCreateRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.dataPassthroughRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/passthrough",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return jsonRequest(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

}
