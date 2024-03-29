/**
 * Merge HRIS API
 *
 * The unified API for building rich integrations with multiple HR Information System platforms.
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

package dev.merge.client.hris.apis

import dev.merge.client.hris.models.CommonModelScopes
import dev.merge.client.hris.models.CommonModelScopesUpdateSerializer

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

open class CommonModelScopesApi(
baseUrl: String = ApiClient.BASE_URL + "hris/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class CommonModelScopesCreateRequest (
        val commonModelScopesUpdateSerializer: CommonModelScopesUpdateSerializer,
        val linkedAccountId: kotlin.String? = null
    )

    data class CommonModelScopesRetrieveRequest (
        val linkedAccountId: kotlin.String? = null
    )

    /**
    * 
    * Update the configuration of what data is saved by Merge when syncing. Common model scopes are set as a default across all linked accounts, but can be updated to have greater granularity per account.
     * @param commonModelScopesUpdateSerializer  
     * @param linkedAccountId ID of specific linked account to fetch (optional)
     * @return CommonModelScopes
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun commonModelScopesCreate(requestModel: CommonModelScopesApi.CommonModelScopesCreateRequest): CommonModelScopes {
        return commonModelScopesCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun commonModelScopesCreateAsync(requestModel: CommonModelScopesApi.CommonModelScopesCreateRequest): CompletableFuture<CommonModelScopes> = GlobalScope.future {
        commonModelScopesCreate(requestModel)
    }

    /**
     * @param commonModelScopesUpdateSerializer   * @param linkedAccountId ID of specific linked account to fetch (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun commonModelScopesCreateExpanded(requestModel: CommonModelScopesApi.CommonModelScopesCreateRequest): CommonModelScopes.Expanded {
        return commonModelScopesCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun commonModelScopesCreateExpandedAsync(requestModel: CommonModelScopesApi.CommonModelScopesCreateRequest): CompletableFuture<CommonModelScopes.Expanded> = GlobalScope.future {
        commonModelScopesCreateExpanded(requestModel)
    }

    private suspend inline fun <reified T> commonModelScopesCreateImpl(requestModel: CommonModelScopesApi.CommonModelScopesCreateRequest): T {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = requestModel.commonModelScopesUpdateSerializer

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.linkedAccountId?.apply { localVariableQuery["linked_account_id"] = listOf(this) }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/common-model-scopes",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return jsonRequest(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

    /**
    * 
    * Fetch the configuration of what data is saved by Merge when syncing. Common model scopes are set as a default across all linked accounts, but can be updated to have greater granularity per account.
     * @param linkedAccountId ID of specific linked account to fetch (optional)
     * @return CommonModelScopes
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun commonModelScopesRetrieve(requestModel: CommonModelScopesApi.CommonModelScopesRetrieveRequest): CommonModelScopes {
        return commonModelScopesRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun commonModelScopesRetrieveAsync(requestModel: CommonModelScopesApi.CommonModelScopesRetrieveRequest): CompletableFuture<CommonModelScopes> = GlobalScope.future {
        commonModelScopesRetrieve(requestModel)
    }

    /**
     * @param linkedAccountId ID of specific linked account to fetch (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun commonModelScopesRetrieveExpanded(requestModel: CommonModelScopesApi.CommonModelScopesRetrieveRequest): CommonModelScopes.Expanded {
        return commonModelScopesRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun commonModelScopesRetrieveExpandedAsync(requestModel: CommonModelScopesApi.CommonModelScopesRetrieveRequest): CompletableFuture<CommonModelScopes.Expanded> = GlobalScope.future {
        commonModelScopesRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> commonModelScopesRetrieveImpl(requestModel: CommonModelScopesApi.CommonModelScopesRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.linkedAccountId?.apply { localVariableQuery["linked_account_id"] = listOf(this) }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/common-model-scopes",
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
