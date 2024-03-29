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

import dev.merge.client.crm.models.AssociationType
import dev.merge.client.crm.models.CRMAssociationTypeEndpointRequest
import dev.merge.client.crm.models.CRMAssociationTypeResponse
import dev.merge.client.crm.models.MetaResponse

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

open class AssociationTypesApi(
baseUrl: String = ApiClient.BASE_URL + "crm/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class CustomObjectClassesAssociationTypesCreateRequest (
        val customObjectClassId: java.util.UUID,
        val crMAssociationTypeEndpointRequest: CRMAssociationTypeEndpointRequest,
        val isDebugMode: kotlin.Boolean? = null,
        val runAsync: kotlin.Boolean? = null
    )

    data class CustomObjectClassesAssociationTypesListRequest (
        val customObjectClassId: java.util.UUID,
        val createdAfter: java.time.OffsetDateTime? = null,
        val createdBefore: java.time.OffsetDateTime? = null,
        val cursor: kotlin.String? = null,
        val expand: kotlin.String? = null,
        val includeDeletedData: kotlin.Boolean? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val modifiedAfter: java.time.OffsetDateTime? = null,
        val modifiedBefore: java.time.OffsetDateTime? = null,
        val pageSize: kotlin.Int? = null,
        val remoteId: kotlin.String? = null
    )

    data class CustomObjectClassesAssociationTypesMetaPostRetrieveRequest (
        val customObjectClassId: java.util.UUID
    )

    data class CustomObjectClassesAssociationTypesRetrieveRequest (
        val customObjectClassId: java.util.UUID,
        val id: java.util.UUID,
        val expand: kotlin.String? = null,
        val includeRemoteData: kotlin.Boolean? = null
    )

    /**
    * 
    * Creates an &#x60;AssociationType&#x60; object with the given values.
     * @param customObjectClassId  
     * @param crMAssociationTypeEndpointRequest  
     * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @return CRMAssociationTypeResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesAssociationTypesCreate(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesCreateRequest): CRMAssociationTypeResponse {
        return customObjectClassesAssociationTypesCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesAssociationTypesCreateAsync(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesCreateRequest): CompletableFuture<CRMAssociationTypeResponse> = GlobalScope.future {
        customObjectClassesAssociationTypesCreate(requestModel)
    }

    /**
     * @param customObjectClassId   * @param crMAssociationTypeEndpointRequest   * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional) * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesAssociationTypesCreateExpanded(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesCreateRequest): CRMAssociationTypeResponse.Expanded {
        return customObjectClassesAssociationTypesCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesAssociationTypesCreateExpandedAsync(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesCreateRequest): CompletableFuture<CRMAssociationTypeResponse.Expanded> = GlobalScope.future {
        customObjectClassesAssociationTypesCreateExpanded(requestModel)
    }

    private suspend inline fun <reified T> customObjectClassesAssociationTypesCreateImpl(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesCreateRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.crMAssociationTypeEndpointRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.isDebugMode?.apply { localVariableQuery["is_debug_mode"] = listOf("$this") }
            requestModel.runAsync?.apply { localVariableQuery["run_async"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/custom-object-classes/{custom_object_class_id}/association-types".replace("{" + "custom_object_class_id" + "}", "${ requestModel.customObjectClassId }"),
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
    * Returns a list of &#x60;AssociationType&#x60; objects.
     * @param customObjectClassId  
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, only objects synced by Merge after this date time will be returned. (optional)
     * @param modifiedBefore If provided, only objects synced by Merge before this date time will be returned. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return PaginatedAssociationTypeList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesAssociationTypesList(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesListRequest): MergePaginatedResponse<AssociationType> {
        return customObjectClassesAssociationTypesListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesAssociationTypesListAsync(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesListRequest): CompletableFuture<MergePaginatedResponse<AssociationType>> = GlobalScope.future {
        customObjectClassesAssociationTypesList(requestModel)
    }

    /**
     * @param customObjectClassId   * @param createdAfter If provided, will only return objects created after this datetime. (optional) * @param createdBefore If provided, will only return objects created before this datetime. (optional) * @param cursor The pagination cursor value. (optional) * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param modifiedAfter If provided, only objects synced by Merge after this date time will be returned. (optional) * @param modifiedBefore If provided, only objects synced by Merge before this date time will be returned. (optional) * @param pageSize Number of results to return per page. (optional) * @param remoteId The API provider&#39;s ID for the given object. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesAssociationTypesListExpanded(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesListRequest): MergePaginatedResponse<AssociationType.Expanded> {
        return customObjectClassesAssociationTypesListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesAssociationTypesListExpandedAsync(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesListRequest): CompletableFuture<MergePaginatedResponse<AssociationType.Expanded>> = GlobalScope.future {
        customObjectClassesAssociationTypesListExpanded(requestModel)
    }

    private suspend inline fun <reified T> customObjectClassesAssociationTypesListImpl(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.createdAfter?.apply { localVariableQuery["created_after"] = listOf("$this") }
            requestModel.createdBefore?.apply { localVariableQuery["created_before"] = listOf("$this") }
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf(this) }
            requestModel.expand?.apply { localVariableQuery["expand"] = listOf(this) }
            requestModel.includeDeletedData?.apply { localVariableQuery["include_deleted_data"] = listOf("$this") }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.modifiedAfter?.apply { localVariableQuery["modified_after"] = listOf("$this") }
            requestModel.modifiedBefore?.apply { localVariableQuery["modified_before"] = listOf("$this") }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }
            requestModel.remoteId?.apply { localVariableQuery["remote_id"] = listOf(this) }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/custom-object-classes/{custom_object_class_id}/association-types".replace("{" + "custom_object_class_id" + "}", "${ requestModel.customObjectClassId }"),
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
    * Returns metadata for &#x60;CRMAssociationType&#x60; POSTs.
     * @param customObjectClassId  
     * @return MetaResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesAssociationTypesMetaPostRetrieve(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesMetaPostRetrieveRequest): MetaResponse {
        return customObjectClassesAssociationTypesMetaPostRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesAssociationTypesMetaPostRetrieveAsync(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesMetaPostRetrieveRequest): CompletableFuture<MetaResponse> = GlobalScope.future {
        customObjectClassesAssociationTypesMetaPostRetrieve(requestModel)
    }

    /**
     * @param customObjectClassId  
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesAssociationTypesMetaPostRetrieveExpanded(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesMetaPostRetrieveRequest): MetaResponse.Expanded {
        return customObjectClassesAssociationTypesMetaPostRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesAssociationTypesMetaPostRetrieveExpandedAsync(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesMetaPostRetrieveRequest): CompletableFuture<MetaResponse.Expanded> = GlobalScope.future {
        customObjectClassesAssociationTypesMetaPostRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> customObjectClassesAssociationTypesMetaPostRetrieveImpl(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesMetaPostRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/custom-object-classes/{custom_object_class_id}/association-types/meta/post".replace("{" + "custom_object_class_id" + "}", "${ requestModel.customObjectClassId }"),
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
    * Returns an &#x60;AssociationType&#x60; object with the given &#x60;id&#x60;.
     * @param customObjectClassId  
     * @param id  
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return AssociationType
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesAssociationTypesRetrieve(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesRetrieveRequest): AssociationType {
        return customObjectClassesAssociationTypesRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesAssociationTypesRetrieveAsync(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesRetrieveRequest): CompletableFuture<AssociationType> = GlobalScope.future {
        customObjectClassesAssociationTypesRetrieve(requestModel)
    }

    /**
     * @param customObjectClassId   * @param id   * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesAssociationTypesRetrieveExpanded(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesRetrieveRequest): AssociationType.Expanded {
        return customObjectClassesAssociationTypesRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesAssociationTypesRetrieveExpandedAsync(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesRetrieveRequest): CompletableFuture<AssociationType.Expanded> = GlobalScope.future {
        customObjectClassesAssociationTypesRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> customObjectClassesAssociationTypesRetrieveImpl(requestModel: AssociationTypesApi.CustomObjectClassesAssociationTypesRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.expand?.apply { localVariableQuery["expand"] = listOf(this) }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/custom-object-classes/{custom_object_class_id}/association-types/{id}".replace("{" + "custom_object_class_id" + "}", "${ requestModel.customObjectClassId }").replace("{" + "id" + "}", "${ requestModel.id }"),
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
