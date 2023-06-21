/**
 * Merge CRM API
 *
 * The unified API for building rich integrations with multiple CRM platforms.
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

package dev.merge.client.crm.apis

import dev.merge.client.crm.models.CRMCustomObjectEndpointRequest
import dev.merge.client.crm.models.CRMCustomObjectResponse
import dev.merge.client.crm.models.CustomObject
import dev.merge.client.crm.models.MetaResponse
import dev.merge.client.crm.models.PatchedCRMCustomObjectEndpointRequest

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

open class CustomObjectsApi(
baseUrl: String = ApiClient.BASE_URL + "crm/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class CustomObjectClassesCustomObjectsCreateRequest (
        val customObjectClassId: java.util.UUID,
        val crMCustomObjectEndpointRequest: CRMCustomObjectEndpointRequest,
        val isDebugMode: kotlin.Boolean? = null,
        val runAsync: kotlin.Boolean? = null
    )

    data class CustomObjectClassesCustomObjectsListRequest (
        val customObjectClassId: java.util.UUID,
        val createdAfter: java.time.OffsetDateTime? = null,
        val createdBefore: java.time.OffsetDateTime? = null,
        val cursor: kotlin.String? = null,
        val includeDeletedData: kotlin.Boolean? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val includeRemoteFields: kotlin.Boolean? = null,
        val modifiedAfter: java.time.OffsetDateTime? = null,
        val modifiedBefore: java.time.OffsetDateTime? = null,
        val pageSize: kotlin.Int? = null,
        val remoteId: kotlin.String? = null
    )

    data class CustomObjectClassesCustomObjectsMetaPatchRetrieveRequest (
        val customObjectClassId: java.util.UUID,
        val id: java.util.UUID
    )

    data class CustomObjectClassesCustomObjectsMetaPostRetrieveRequest (
        val customObjectClassId: java.util.UUID
    )

    data class CustomObjectClassesCustomObjectsPartialUpdateRequest (
        val customObjectClassId: java.util.UUID,
        val id: java.util.UUID,
        val patchedCRMCustomObjectEndpointRequest: PatchedCRMCustomObjectEndpointRequest,
        val isDebugMode: kotlin.Boolean? = null,
        val runAsync: kotlin.Boolean? = null
    )

    data class CustomObjectClassesCustomObjectsRetrieveRequest (
        val customObjectClassId: java.util.UUID,
        val id: java.util.UUID,
        val includeRemoteData: kotlin.Boolean? = null,
        val includeRemoteFields: kotlin.Boolean? = null
    )

    /**
    * 
    * Creates a &#x60;CustomObject&#x60; object with the given values.
     * @param customObjectClassId  
     * @param crMCustomObjectEndpointRequest  
     * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @return CRMCustomObjectResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesCustomObjectsCreate(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsCreateRequest): CRMCustomObjectResponse {
        return customObjectClassesCustomObjectsCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesCustomObjectsCreateAsync(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsCreateRequest): CompletableFuture<CRMCustomObjectResponse> = GlobalScope.future {
        customObjectClassesCustomObjectsCreate(requestModel)
    }

    /**
     * @param customObjectClassId   * @param crMCustomObjectEndpointRequest   * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional) * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesCustomObjectsCreateExpanded(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsCreateRequest): CRMCustomObjectResponse.Expanded {
        return customObjectClassesCustomObjectsCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesCustomObjectsCreateExpandedAsync(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsCreateRequest): CompletableFuture<CRMCustomObjectResponse.Expanded> = GlobalScope.future {
        customObjectClassesCustomObjectsCreateExpanded(requestModel)
    }

    private suspend inline fun <reified T> customObjectClassesCustomObjectsCreateImpl(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsCreateRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.crMCustomObjectEndpointRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.isDebugMode?.apply { localVariableQuery["is_debug_mode"] = listOf("$this") }
            requestModel.runAsync?.apply { localVariableQuery["run_async"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/custom-object-classes/{custom_object_class_id}/custom-objects".replace("{" + "custom_object_class_id" + "}", "${ requestModel.customObjectClassId }"),
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
    * Returns a list of &#x60;CustomObject&#x60; objects.
     * @param customObjectClassId  
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param includeRemoteFields Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. (optional)
     * @param modifiedAfter If provided, only objects synced by Merge after this date time will be returned. (optional)
     * @param modifiedBefore If provided, only objects synced by Merge before this date time will be returned. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return PaginatedCustomObjectList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesCustomObjectsList(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsListRequest): MergePaginatedResponse<CustomObject> {
        return customObjectClassesCustomObjectsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesCustomObjectsListAsync(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsListRequest): CompletableFuture<MergePaginatedResponse<CustomObject>> = GlobalScope.future {
        customObjectClassesCustomObjectsList(requestModel)
    }

    /**
     * @param customObjectClassId   * @param createdAfter If provided, will only return objects created after this datetime. (optional) * @param createdBefore If provided, will only return objects created before this datetime. (optional) * @param cursor The pagination cursor value. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param includeRemoteFields Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. (optional) * @param modifiedAfter If provided, only objects synced by Merge after this date time will be returned. (optional) * @param modifiedBefore If provided, only objects synced by Merge before this date time will be returned. (optional) * @param pageSize Number of results to return per page. (optional) * @param remoteId The API provider&#39;s ID for the given object. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesCustomObjectsListExpanded(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsListRequest): MergePaginatedResponse<CustomObject.Expanded> {
        return customObjectClassesCustomObjectsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesCustomObjectsListExpandedAsync(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsListRequest): CompletableFuture<MergePaginatedResponse<CustomObject.Expanded>> = GlobalScope.future {
        customObjectClassesCustomObjectsListExpanded(requestModel)
    }

    private suspend inline fun <reified T> customObjectClassesCustomObjectsListImpl(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.createdAfter?.apply { localVariableQuery["created_after"] = listOf("$this") }
            requestModel.createdBefore?.apply { localVariableQuery["created_before"] = listOf("$this") }
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf(this) }
            requestModel.includeDeletedData?.apply { localVariableQuery["include_deleted_data"] = listOf("$this") }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.includeRemoteFields?.apply { localVariableQuery["include_remote_fields"] = listOf("$this") }
            requestModel.modifiedAfter?.apply { localVariableQuery["modified_after"] = listOf("$this") }
            requestModel.modifiedBefore?.apply { localVariableQuery["modified_before"] = listOf("$this") }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }
            requestModel.remoteId?.apply { localVariableQuery["remote_id"] = listOf(this) }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/custom-object-classes/{custom_object_class_id}/custom-objects".replace("{" + "custom_object_class_id" + "}", "${ requestModel.customObjectClassId }"),
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
    * Returns metadata for &#x60;CRMCustomObject&#x60; PATCHs.
     * @param customObjectClassId  
     * @param id  
     * @return MetaResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesCustomObjectsMetaPatchRetrieve(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsMetaPatchRetrieveRequest): MetaResponse {
        return customObjectClassesCustomObjectsMetaPatchRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesCustomObjectsMetaPatchRetrieveAsync(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsMetaPatchRetrieveRequest): CompletableFuture<MetaResponse> = GlobalScope.future {
        customObjectClassesCustomObjectsMetaPatchRetrieve(requestModel)
    }

    /**
     * @param customObjectClassId   * @param id  
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesCustomObjectsMetaPatchRetrieveExpanded(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsMetaPatchRetrieveRequest): MetaResponse.Expanded {
        return customObjectClassesCustomObjectsMetaPatchRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesCustomObjectsMetaPatchRetrieveExpandedAsync(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsMetaPatchRetrieveRequest): CompletableFuture<MetaResponse.Expanded> = GlobalScope.future {
        customObjectClassesCustomObjectsMetaPatchRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> customObjectClassesCustomObjectsMetaPatchRetrieveImpl(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsMetaPatchRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/custom-object-classes/{custom_object_class_id}/custom-objects/meta/patch/{id}".replace("{" + "custom_object_class_id" + "}", "${ requestModel.customObjectClassId }").replace("{" + "id" + "}", "${ requestModel.id }"),
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
    * Returns metadata for &#x60;CRMCustomObject&#x60; POSTs.
     * @param customObjectClassId  
     * @return MetaResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesCustomObjectsMetaPostRetrieve(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsMetaPostRetrieveRequest): MetaResponse {
        return customObjectClassesCustomObjectsMetaPostRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesCustomObjectsMetaPostRetrieveAsync(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsMetaPostRetrieveRequest): CompletableFuture<MetaResponse> = GlobalScope.future {
        customObjectClassesCustomObjectsMetaPostRetrieve(requestModel)
    }

    /**
     * @param customObjectClassId  
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesCustomObjectsMetaPostRetrieveExpanded(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsMetaPostRetrieveRequest): MetaResponse.Expanded {
        return customObjectClassesCustomObjectsMetaPostRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesCustomObjectsMetaPostRetrieveExpandedAsync(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsMetaPostRetrieveRequest): CompletableFuture<MetaResponse.Expanded> = GlobalScope.future {
        customObjectClassesCustomObjectsMetaPostRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> customObjectClassesCustomObjectsMetaPostRetrieveImpl(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsMetaPostRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/custom-object-classes/{custom_object_class_id}/custom-objects/meta/post".replace("{" + "custom_object_class_id" + "}", "${ requestModel.customObjectClassId }"),
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
    * Updates a &#x60;CustomObject&#x60; object with the given &#x60;id&#x60;.
     * @param customObjectClassId  
     * @param id  
     * @param patchedCRMCustomObjectEndpointRequest  
     * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @return CRMCustomObjectResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesCustomObjectsPartialUpdate(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsPartialUpdateRequest): CRMCustomObjectResponse {
        return customObjectClassesCustomObjectsPartialUpdateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesCustomObjectsPartialUpdateAsync(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsPartialUpdateRequest): CompletableFuture<CRMCustomObjectResponse> = GlobalScope.future {
        customObjectClassesCustomObjectsPartialUpdate(requestModel)
    }

    /**
     * @param customObjectClassId   * @param id   * @param patchedCRMCustomObjectEndpointRequest   * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional) * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesCustomObjectsPartialUpdateExpanded(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsPartialUpdateRequest): CRMCustomObjectResponse.Expanded {
        return customObjectClassesCustomObjectsPartialUpdateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesCustomObjectsPartialUpdateExpandedAsync(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsPartialUpdateRequest): CompletableFuture<CRMCustomObjectResponse.Expanded> = GlobalScope.future {
        customObjectClassesCustomObjectsPartialUpdateExpanded(requestModel)
    }

    private suspend inline fun <reified T> customObjectClassesCustomObjectsPartialUpdateImpl(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsPartialUpdateRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.patchedCRMCustomObjectEndpointRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.isDebugMode?.apply { localVariableQuery["is_debug_mode"] = listOf("$this") }
            requestModel.runAsync?.apply { localVariableQuery["run_async"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.PATCH,
        "/custom-object-classes/{custom_object_class_id}/custom-objects/{id}".replace("{" + "custom_object_class_id" + "}", "${ requestModel.customObjectClassId }").replace("{" + "id" + "}", "${ requestModel.id }"),
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
    * Returns a &#x60;CustomObject&#x60; object with the given &#x60;id&#x60;.
     * @param customObjectClassId  
     * @param id  
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param includeRemoteFields Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. (optional)
     * @return CustomObject
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesCustomObjectsRetrieve(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsRetrieveRequest): CustomObject {
        return customObjectClassesCustomObjectsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesCustomObjectsRetrieveAsync(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsRetrieveRequest): CompletableFuture<CustomObject> = GlobalScope.future {
        customObjectClassesCustomObjectsRetrieve(requestModel)
    }

    /**
     * @param customObjectClassId   * @param id   * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param includeRemoteFields Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesCustomObjectsRetrieveExpanded(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsRetrieveRequest): CustomObject.Expanded {
        return customObjectClassesCustomObjectsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesCustomObjectsRetrieveExpandedAsync(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsRetrieveRequest): CompletableFuture<CustomObject.Expanded> = GlobalScope.future {
        customObjectClassesCustomObjectsRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> customObjectClassesCustomObjectsRetrieveImpl(requestModel: CustomObjectsApi.CustomObjectClassesCustomObjectsRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.includeRemoteFields?.apply { localVariableQuery["include_remote_fields"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/custom-object-classes/{custom_object_class_id}/custom-objects/{id}".replace("{" + "custom_object_class_id" + "}", "${ requestModel.customObjectClassId }").replace("{" + "id" + "}", "${ requestModel.id }"),
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
