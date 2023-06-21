/**
 * Merge Accounting API
 *
 * The unified API for building rich integrations with multiple Accounting & Finance platforms.
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

package dev.merge.client.accounting.apis

import dev.merge.client.accounting.models.AccountingAttachment
import dev.merge.client.accounting.models.AccountingAttachmentEndpointRequest
import dev.merge.client.accounting.models.AccountingAttachmentResponse
import dev.merge.client.accounting.models.MetaResponse

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

open class AttachmentsApi(
baseUrl: String = ApiClient.BASE_URL + "accounting/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class AttachmentsCreateRequest (
        val accountingAttachmentEndpointRequest: AccountingAttachmentEndpointRequest,
        val isDebugMode: kotlin.Boolean? = null,
        val runAsync: kotlin.Boolean? = null
    )

    data class AttachmentsListRequest (
        val companyId: kotlin.String? = null,
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

    data class AttachmentsRetrieveRequest (
        val id: java.util.UUID,
        val includeRemoteData: kotlin.Boolean? = null
    )

    /**
    * 
    * Creates an &#x60;AccountingAttachment&#x60; object with the given values.
     * @param accountingAttachmentEndpointRequest  
     * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @return AccountingAttachmentResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun attachmentsCreate(requestModel: AttachmentsApi.AttachmentsCreateRequest): AccountingAttachmentResponse {
        return attachmentsCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun attachmentsCreateAsync(requestModel: AttachmentsApi.AttachmentsCreateRequest): CompletableFuture<AccountingAttachmentResponse> = GlobalScope.future {
        attachmentsCreate(requestModel)
    }

    /**
     * @param accountingAttachmentEndpointRequest   * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional) * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun attachmentsCreateExpanded(requestModel: AttachmentsApi.AttachmentsCreateRequest): AccountingAttachmentResponse.Expanded {
        return attachmentsCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun attachmentsCreateExpandedAsync(requestModel: AttachmentsApi.AttachmentsCreateRequest): CompletableFuture<AccountingAttachmentResponse.Expanded> = GlobalScope.future {
        attachmentsCreateExpanded(requestModel)
    }

    private suspend inline fun <reified T> attachmentsCreateImpl(requestModel: AttachmentsApi.AttachmentsCreateRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.accountingAttachmentEndpointRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.isDebugMode?.apply { localVariableQuery["is_debug_mode"] = listOf("$this") }
            requestModel.runAsync?.apply { localVariableQuery["run_async"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/attachments",
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
    * Returns a list of &#x60;AccountingAttachment&#x60; objects.
     * @param companyId If provided, will only return accounting attachments for this company. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, only objects synced by Merge after this date time will be returned. (optional)
     * @param modifiedBefore If provided, only objects synced by Merge before this date time will be returned. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return PaginatedAccountingAttachmentList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun attachmentsList(requestModel: AttachmentsApi.AttachmentsListRequest): MergePaginatedResponse<AccountingAttachment> {
        return attachmentsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun attachmentsListAsync(requestModel: AttachmentsApi.AttachmentsListRequest): CompletableFuture<MergePaginatedResponse<AccountingAttachment>> = GlobalScope.future {
        attachmentsList(requestModel)
    }

    /**
     * @param companyId If provided, will only return accounting attachments for this company. (optional) * @param createdAfter If provided, will only return objects created after this datetime. (optional) * @param createdBefore If provided, will only return objects created before this datetime. (optional) * @param cursor The pagination cursor value. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param modifiedAfter If provided, only objects synced by Merge after this date time will be returned. (optional) * @param modifiedBefore If provided, only objects synced by Merge before this date time will be returned. (optional) * @param pageSize Number of results to return per page. (optional) * @param remoteId The API provider&#39;s ID for the given object. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun attachmentsListExpanded(requestModel: AttachmentsApi.AttachmentsListRequest): MergePaginatedResponse<AccountingAttachment.Expanded> {
        return attachmentsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun attachmentsListExpandedAsync(requestModel: AttachmentsApi.AttachmentsListRequest): CompletableFuture<MergePaginatedResponse<AccountingAttachment.Expanded>> = GlobalScope.future {
        attachmentsListExpanded(requestModel)
    }

    private suspend inline fun <reified T> attachmentsListImpl(requestModel: AttachmentsApi.AttachmentsListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.companyId?.apply { localVariableQuery["company_id"] = listOf(this) }
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
        "/attachments",
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
    * Returns metadata for &#x60;AccountingAttachment&#x60; POSTs.
     * @return MetaResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun attachmentsMetaPostRetrieve(): MetaResponse {
        return attachmentsMetaPostRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun attachmentsMetaPostRetrieveAsync(): CompletableFuture<MetaResponse> = GlobalScope.future {
        attachmentsMetaPostRetrieve()
    }

    /**
    
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun attachmentsMetaPostRetrieveExpanded(): MetaResponse.Expanded {
        return attachmentsMetaPostRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun attachmentsMetaPostRetrieveExpandedAsync(): CompletableFuture<MetaResponse.Expanded> = GlobalScope.future {
        attachmentsMetaPostRetrieveExpanded()
    }

    private suspend inline fun <reified T> attachmentsMetaPostRetrieveImpl(): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/attachments/meta/post",
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
    * Returns an &#x60;AccountingAttachment&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return AccountingAttachment
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun attachmentsRetrieve(requestModel: AttachmentsApi.AttachmentsRetrieveRequest): AccountingAttachment {
        return attachmentsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun attachmentsRetrieveAsync(requestModel: AttachmentsApi.AttachmentsRetrieveRequest): CompletableFuture<AccountingAttachment> = GlobalScope.future {
        attachmentsRetrieve(requestModel)
    }

    /**
     * @param id   * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun attachmentsRetrieveExpanded(requestModel: AttachmentsApi.AttachmentsRetrieveRequest): AccountingAttachment.Expanded {
        return attachmentsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun attachmentsRetrieveExpandedAsync(requestModel: AttachmentsApi.AttachmentsRetrieveRequest): CompletableFuture<AccountingAttachment.Expanded> = GlobalScope.future {
        attachmentsRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> attachmentsRetrieveImpl(requestModel: AttachmentsApi.AttachmentsRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/attachments/{id}".replace("{" + "id" + "}", "${ requestModel.id }"),
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
