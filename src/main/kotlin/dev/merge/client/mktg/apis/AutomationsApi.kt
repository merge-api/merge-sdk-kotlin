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

import dev.merge.client.mktg.models.Automation
import dev.merge.client.mktg.models.MKTGAutomationEndpointRequest
import dev.merge.client.mktg.models.MKTGAutomationResponse
import dev.merge.client.mktg.models.MetaResponse
import dev.merge.client.mktg.models.Contact

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

open class AutomationsApi(
baseUrl: String = ApiClient.BASE_URL + "mktg/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class AutomationsCreateRequest (
        val mkTGAutomationEndpointRequest: MKTGAutomationEndpointRequest,
        val isDebugMode: kotlin.Boolean? = null,
        val runAsync: kotlin.Boolean? = null
    )

    data class AutomationsListRequest (
        val createdAfter: java.time.OffsetDateTime? = null,
        val createdBefore: java.time.OffsetDateTime? = null,
        val cursor: kotlin.String? = null,
        val includeDeletedData: kotlin.Boolean? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val modifiedAfter: java.time.OffsetDateTime? = null,
        val modifiedBefore: java.time.OffsetDateTime? = null,
        val pageSize: kotlin.Int? = null,
        val remoteId: kotlin.String? = null
    )

    data class AutomationsRecipientsListRequest (
        val parentId: java.util.UUID,
        val cursor: kotlin.String? = null,
        val includeDeletedData: kotlin.Boolean? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val pageSize: kotlin.Int? = null
    )

    data class AutomationsRetrieveRequest (
        val id: java.util.UUID,
        val includeRemoteData: kotlin.Boolean? = null
    )

    /**
    * 
    * Creates an &#x60;Automation&#x60; object with the given values.
     * @param mkTGAutomationEndpointRequest  
     * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @return MKTGAutomationResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun automationsCreate(requestModel: AutomationsApi.AutomationsCreateRequest): MKTGAutomationResponse {
        return automationsCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun automationsCreateAsync(requestModel: AutomationsApi.AutomationsCreateRequest): CompletableFuture<MKTGAutomationResponse> = GlobalScope.future {
        automationsCreate(requestModel)
    }

    /**
     * @param mkTGAutomationEndpointRequest   * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional) * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun automationsCreateExpanded(requestModel: AutomationsApi.AutomationsCreateRequest): MKTGAutomationResponse.Expanded {
        return automationsCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun automationsCreateExpandedAsync(requestModel: AutomationsApi.AutomationsCreateRequest): CompletableFuture<MKTGAutomationResponse.Expanded> = GlobalScope.future {
        automationsCreateExpanded(requestModel)
    }

    private suspend inline fun <reified T> automationsCreateImpl(requestModel: AutomationsApi.AutomationsCreateRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.mkTGAutomationEndpointRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.isDebugMode?.apply { localVariableQuery["is_debug_mode"] = listOf("$this") }
            requestModel.runAsync?.apply { localVariableQuery["run_async"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/automations",
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
    * Returns a list of &#x60;Automation&#x60; objects.
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, only objects synced by Merge after this date time will be returned. (optional)
     * @param modifiedBefore If provided, only objects synced by Merge before this date time will be returned. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return PaginatedAutomationList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun automationsList(requestModel: AutomationsApi.AutomationsListRequest): MergePaginatedResponse<Automation> {
        return automationsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun automationsListAsync(requestModel: AutomationsApi.AutomationsListRequest): CompletableFuture<MergePaginatedResponse<Automation>> = GlobalScope.future {
        automationsList(requestModel)
    }

    /**
     * @param createdAfter If provided, will only return objects created after this datetime. (optional) * @param createdBefore If provided, will only return objects created before this datetime. (optional) * @param cursor The pagination cursor value. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param modifiedAfter If provided, only objects synced by Merge after this date time will be returned. (optional) * @param modifiedBefore If provided, only objects synced by Merge before this date time will be returned. (optional) * @param pageSize Number of results to return per page. (optional) * @param remoteId The API provider&#39;s ID for the given object. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun automationsListExpanded(requestModel: AutomationsApi.AutomationsListRequest): MergePaginatedResponse<Automation.Expanded> {
        return automationsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun automationsListExpandedAsync(requestModel: AutomationsApi.AutomationsListRequest): CompletableFuture<MergePaginatedResponse<Automation.Expanded>> = GlobalScope.future {
        automationsListExpanded(requestModel)
    }

    private suspend inline fun <reified T> automationsListImpl(requestModel: AutomationsApi.AutomationsListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.createdAfter?.apply { localVariableQuery["created_after"] = listOf("$this") }
            requestModel.createdBefore?.apply { localVariableQuery["created_before"] = listOf("$this") }
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf(this) }
            requestModel.includeDeletedData?.apply { localVariableQuery["include_deleted_data"] = listOf("$this") }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.modifiedAfter?.apply { localVariableQuery["modified_after"] = listOf("$this") }
            requestModel.modifiedBefore?.apply { localVariableQuery["modified_before"] = listOf("$this") }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }
            requestModel.remoteId?.apply { localVariableQuery["remote_id"] = listOf(this) }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/automations",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return request(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

    /**
    * 
    * Returns metadata for &#x60;MKTGAutomation&#x60; POSTs.
     * @return MetaResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun automationsMetaPostRetrieve(): MetaResponse {
        return automationsMetaPostRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun automationsMetaPostRetrieveAsync(): CompletableFuture<MetaResponse> = GlobalScope.future {
        automationsMetaPostRetrieve()
    }

    /**
    
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun automationsMetaPostRetrieveExpanded(): MetaResponse.Expanded {
        return automationsMetaPostRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun automationsMetaPostRetrieveExpandedAsync(): CompletableFuture<MetaResponse.Expanded> = GlobalScope.future {
        automationsMetaPostRetrieveExpanded()
    }

    private suspend inline fun <reified T> automationsMetaPostRetrieveImpl(): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/automations/meta/post",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return request(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

    /**
    * 
    * Returns a list of &#x60;Contact&#x60; objects.
     * @param parentId  
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return PaginatedContactList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun automationsRecipientsList(requestModel: AutomationsApi.AutomationsRecipientsListRequest): MergePaginatedResponse<Contact> {
        return automationsRecipientsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun automationsRecipientsListAsync(requestModel: AutomationsApi.AutomationsRecipientsListRequest): CompletableFuture<MergePaginatedResponse<Contact>> = GlobalScope.future {
        automationsRecipientsList(requestModel)
    }

    /**
     * @param parentId   * @param cursor The pagination cursor value. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param pageSize Number of results to return per page. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun automationsRecipientsListExpanded(requestModel: AutomationsApi.AutomationsRecipientsListRequest): MergePaginatedResponse<Contact.Expanded> {
        return automationsRecipientsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun automationsRecipientsListExpandedAsync(requestModel: AutomationsApi.AutomationsRecipientsListRequest): CompletableFuture<MergePaginatedResponse<Contact.Expanded>> = GlobalScope.future {
        automationsRecipientsListExpanded(requestModel)
    }

    private suspend inline fun <reified T> automationsRecipientsListImpl(requestModel: AutomationsApi.AutomationsRecipientsListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf(this) }
            requestModel.includeDeletedData?.apply { localVariableQuery["include_deleted_data"] = listOf("$this") }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/automations/{parent_id}/recipients".replace("{" + "parent_id" + "}", "${ requestModel.parentId }"),
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return request(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

    /**
    * 
    * Returns an &#x60;Automation&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return Automation
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun automationsRetrieve(requestModel: AutomationsApi.AutomationsRetrieveRequest): Automation {
        return automationsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun automationsRetrieveAsync(requestModel: AutomationsApi.AutomationsRetrieveRequest): CompletableFuture<Automation> = GlobalScope.future {
        automationsRetrieve(requestModel)
    }

    /**
     * @param id   * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun automationsRetrieveExpanded(requestModel: AutomationsApi.AutomationsRetrieveRequest): Automation.Expanded {
        return automationsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun automationsRetrieveExpandedAsync(requestModel: AutomationsApi.AutomationsRetrieveRequest): CompletableFuture<Automation.Expanded> = GlobalScope.future {
        automationsRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> automationsRetrieveImpl(requestModel: AutomationsApi.AutomationsRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/automations/{id}".replace("{" + "id" + "}", "${ requestModel.id }"),
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
