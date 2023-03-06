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

import dev.merge.client.mktg.models.Campaign
import dev.merge.client.mktg.models.MKTGCampaignEndpointRequest
import dev.merge.client.mktg.models.MKTGCampaignResponse
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

open class CampaignsApi(
baseUrl: String = ApiClient.BASE_URL + "mktg/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class CampaignsContactsListRequest (
        val parentId: java.util.UUID,
        val cursor: kotlin.String? = null,
        val includeDeletedData: kotlin.Boolean? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val pageSize: kotlin.Int? = null
    )

    data class CampaignsCreateRequest (
        val mkTGCampaignEndpointRequest: MKTGCampaignEndpointRequest,
        val isDebugMode: kotlin.Boolean? = null,
        val runAsync: kotlin.Boolean? = null
    )

    data class CampaignsListRequest (
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

    data class CampaignsRetrieveRequest (
        val id: java.util.UUID,
        val includeRemoteData: kotlin.Boolean? = null
    )

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
    open suspend fun campaignsContactsList(requestModel: CampaignsApi.CampaignsContactsListRequest): MergePaginatedResponse<Contact> {
        return campaignsContactsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun campaignsContactsListAsync(requestModel: CampaignsApi.CampaignsContactsListRequest): CompletableFuture<MergePaginatedResponse<Contact>> = GlobalScope.future {
        campaignsContactsList(requestModel)
    }

    /**
     * @param parentId   * @param cursor The pagination cursor value. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param pageSize Number of results to return per page. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun campaignsContactsListExpanded(requestModel: CampaignsApi.CampaignsContactsListRequest): MergePaginatedResponse<Contact.Expanded> {
        return campaignsContactsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun campaignsContactsListExpandedAsync(requestModel: CampaignsApi.CampaignsContactsListRequest): CompletableFuture<MergePaginatedResponse<Contact.Expanded>> = GlobalScope.future {
        campaignsContactsListExpanded(requestModel)
    }

    private suspend inline fun <reified T> campaignsContactsListImpl(requestModel: CampaignsApi.CampaignsContactsListRequest): T {

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
        "/campaigns/{parent_id}/contacts".replace("{" + "parent_id" + "}", "${ requestModel.parentId }"),
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
    * Creates a &#x60;Campaign&#x60; object with the given values.
     * @param mkTGCampaignEndpointRequest  
     * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @return MKTGCampaignResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun campaignsCreate(requestModel: CampaignsApi.CampaignsCreateRequest): MKTGCampaignResponse {
        return campaignsCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun campaignsCreateAsync(requestModel: CampaignsApi.CampaignsCreateRequest): CompletableFuture<MKTGCampaignResponse> = GlobalScope.future {
        campaignsCreate(requestModel)
    }

    /**
     * @param mkTGCampaignEndpointRequest   * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional) * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun campaignsCreateExpanded(requestModel: CampaignsApi.CampaignsCreateRequest): MKTGCampaignResponse.Expanded {
        return campaignsCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun campaignsCreateExpandedAsync(requestModel: CampaignsApi.CampaignsCreateRequest): CompletableFuture<MKTGCampaignResponse.Expanded> = GlobalScope.future {
        campaignsCreateExpanded(requestModel)
    }

    private suspend inline fun <reified T> campaignsCreateImpl(requestModel: CampaignsApi.CampaignsCreateRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.mkTGCampaignEndpointRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.isDebugMode?.apply { localVariableQuery["is_debug_mode"] = listOf("$this") }
            requestModel.runAsync?.apply { localVariableQuery["run_async"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/campaigns",
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
    * Returns a list of &#x60;Campaign&#x60; objects.
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return PaginatedCampaignList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun campaignsList(requestModel: CampaignsApi.CampaignsListRequest): MergePaginatedResponse<Campaign> {
        return campaignsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun campaignsListAsync(requestModel: CampaignsApi.CampaignsListRequest): CompletableFuture<MergePaginatedResponse<Campaign>> = GlobalScope.future {
        campaignsList(requestModel)
    }

    /**
     * @param createdAfter If provided, will only return objects created after this datetime. (optional) * @param createdBefore If provided, will only return objects created before this datetime. (optional) * @param cursor The pagination cursor value. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional) * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional) * @param pageSize Number of results to return per page. (optional) * @param remoteId The API provider&#39;s ID for the given object. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun campaignsListExpanded(requestModel: CampaignsApi.CampaignsListRequest): MergePaginatedResponse<Campaign.Expanded> {
        return campaignsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun campaignsListExpandedAsync(requestModel: CampaignsApi.CampaignsListRequest): CompletableFuture<MergePaginatedResponse<Campaign.Expanded>> = GlobalScope.future {
        campaignsListExpanded(requestModel)
    }

    private suspend inline fun <reified T> campaignsListImpl(requestModel: CampaignsApi.CampaignsListRequest): T {

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
        "/campaigns",
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
    * Returns metadata for &#x60;MKTGCampaign&#x60; POSTs.
     * @return MetaResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun campaignsMetaPostRetrieve(): MetaResponse {
        return campaignsMetaPostRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun campaignsMetaPostRetrieveAsync(): CompletableFuture<MetaResponse> = GlobalScope.future {
        campaignsMetaPostRetrieve()
    }

    /**
    
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun campaignsMetaPostRetrieveExpanded(): MetaResponse.Expanded {
        return campaignsMetaPostRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun campaignsMetaPostRetrieveExpandedAsync(): CompletableFuture<MetaResponse.Expanded> = GlobalScope.future {
        campaignsMetaPostRetrieveExpanded()
    }

    private suspend inline fun <reified T> campaignsMetaPostRetrieveImpl(): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/campaigns/meta/post",
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
    * Returns a &#x60;Campaign&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return Campaign
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun campaignsRetrieve(requestModel: CampaignsApi.CampaignsRetrieveRequest): Campaign {
        return campaignsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun campaignsRetrieveAsync(requestModel: CampaignsApi.CampaignsRetrieveRequest): CompletableFuture<Campaign> = GlobalScope.future {
        campaignsRetrieve(requestModel)
    }

    /**
     * @param id   * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun campaignsRetrieveExpanded(requestModel: CampaignsApi.CampaignsRetrieveRequest): Campaign.Expanded {
        return campaignsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun campaignsRetrieveExpandedAsync(requestModel: CampaignsApi.CampaignsRetrieveRequest): CompletableFuture<Campaign.Expanded> = GlobalScope.future {
        campaignsRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> campaignsRetrieveImpl(requestModel: CampaignsApi.CampaignsRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/campaigns/{id}".replace("{" + "id" + "}", "${ requestModel.id }"),
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