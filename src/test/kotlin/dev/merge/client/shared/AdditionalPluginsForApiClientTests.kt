package dev.merge.client.shared

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import dev.merge.client.shared.ExampleCustomKtorPlugin.Config
import io.ktor.client.HttpClient
import io.ktor.client.plugins.HttpClientPlugin
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.plugin
import io.ktor.client.statement.HttpResponsePipeline
import io.ktor.util.AttributeKey
import io.ktor.util.KtorDsl
import java.util.logging.Logger
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.superclasses
import kotlin.reflect.jvm.isAccessible
import kotlin.test.*

class AdditionalPluginsForApiClientTests {

    @Test
    fun `Should be able to install additional ktor plugins`() {
        // given
        val wrapper = TestApiClient()
        val configurationSpy = ConfigurationSpy()

        // when
        wrapper.addKtorPlugin(ExampleCustomKtorPlugin) { configurationSpy.configure() }

        // then
        val client = wrapper.getHttpClient()

        // first, prove the default content negotiation plugin is still installed.
        val contentNegotiationPlugin = client.plugin(ContentNegotiation)
        assertNotNull(contentNegotiationPlugin, "The base ContentNegotiation plugin should still be installed.")

        // now extract our extra plugin.
        val exampleCustomKtorPlugin = client.plugin(ExampleCustomKtorPlugin)
        assertNotNull(exampleCustomKtorPlugin, "The custom plugin should have been installed.")

        assertTrue(configurationSpy.configured, "Should have called any configuration required on the plugin.")
    }
}

class TestApiClient: ApiClient("https://example.com", null, null, jacksonObjectMapper()) {
    // extract the ktor http client for test purposes only.
    fun getHttpClient() =  this::class.superclasses
        .first { it.simpleName == "ApiClient" }
        .declaredMemberProperties.first { it.name == "client" }
        .apply{ isAccessible = true }.getter.call(this) as HttpClient
}

/**
 * Extremely basic request / response logging plugin.
 */
class ExampleCustomKtorPlugin internal constructor(private val config: Config) {

    class Config {
        val property: String = "my-value"
    }

    @KtorDsl
    companion object Plugin : HttpClientPlugin<Config, ExampleCustomKtorPlugin> {

        private val logger = Logger.getLogger("ExampleCustomKtorPlugin")

        override val key: AttributeKey<ExampleCustomKtorPlugin> = AttributeKey("ExampleCustomKtorPlugin")

        override fun install(plugin: ExampleCustomKtorPlugin, scope: HttpClient) {
            scope.responsePipeline.intercept(HttpResponsePipeline.After) {
                val request = context.request
                val response = context.response

                this@Plugin.logger.info("Request to ${request.url} complete with status: ${response.status}")
            }
        }

        override fun prepare(block: Config.() -> Unit): ExampleCustomKtorPlugin {
            val config = Config().apply(block)
            return ExampleCustomKtorPlugin(config)
        }
    }
}

/**
 * Lightweight spy object to ensure we are calling our configure function.
 */
class ConfigurationSpy() {
    var configured = false

    fun configure() {
        configured = true
    }
}
