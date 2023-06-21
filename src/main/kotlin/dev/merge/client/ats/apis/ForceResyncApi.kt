/**
 * Merge ATS API
 *
 * The unified API for building rich integrations with multiple Applicant Tracking System platforms.
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

package dev.merge.client.ats.apis

import dev.merge.client.ats.models.SyncStatus

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

open class ForceResyncApi(
baseUrl: String = ApiClient.BASE_URL + "ats/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    /**
    * 
    * Force re-sync of all models. This is available for all organizations via the dashboard. Force re-sync is also available programmatically via API for monthly, quarterly, and highest sync frequency customers on the Core, Professional, or Enterprise plans. Doing so will consume a sync credit for the relevant linked account.
     * @return kotlin.collections.List<SyncStatus>
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun syncStatusResyncCreate(): kotlin.collections.List<SyncStatus> {
        return syncStatusResyncCreateImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun syncStatusResyncCreateAsync(): CompletableFuture<kotlin.collections.List<SyncStatus>> = GlobalScope.future {
        syncStatusResyncCreate()
    }

    /**
    
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun syncStatusResyncCreateExpanded(): kotlin.collections.List<SyncStatus.Expanded> {
        return syncStatusResyncCreateImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun syncStatusResyncCreateExpandedAsync(): CompletableFuture<kotlin.collections.List<SyncStatus.Expanded>> = GlobalScope.future {
        syncStatusResyncCreateExpanded()
    }

    private suspend inline fun <reified T> syncStatusResyncCreateImpl(): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/sync-status/resync",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return request(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

}
