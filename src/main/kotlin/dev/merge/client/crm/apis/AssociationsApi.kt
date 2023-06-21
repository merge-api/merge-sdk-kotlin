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

import dev.merge.client.crm.models.Association

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

open class AssociationsApi(
baseUrl: String = ApiClient.BASE_URL + "crm/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class CustomObjectClassesCustomObjectsAssociationsListRequest (
        val customObjectClassId: java.util.UUID,
        val objectId: java.util.UUID,
        val associationTypeId: kotlin.String? = null,
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

    data class CustomObjectClassesCustomObjectsAssociationsUpdateRequest (
        val associationTypeId: java.util.UUID,
        val sourceClassId: java.util.UUID,
        val sourceObjectId: java.util.UUID,
        val targetClassId: kotlin.String,
        val targetObjectId: java.util.UUID,
        val isDebugMode: kotlin.Boolean? = null,
        val runAsync: kotlin.Boolean? = null
    )

    /**
    * 
    * Returns a list of &#x60;Association&#x60; objects.
     * @param customObjectClassId  
     * @param objectId  
     * @param associationTypeId If provided, will only return opportunities with this association_type. (optional)
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
     * @return PaginatedAssociationList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesCustomObjectsAssociationsList(requestModel: AssociationsApi.CustomObjectClassesCustomObjectsAssociationsListRequest): MergePaginatedResponse<Association> {
        return customObjectClassesCustomObjectsAssociationsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesCustomObjectsAssociationsListAsync(requestModel: AssociationsApi.CustomObjectClassesCustomObjectsAssociationsListRequest): CompletableFuture<MergePaginatedResponse<Association>> = GlobalScope.future {
        customObjectClassesCustomObjectsAssociationsList(requestModel)
    }

    /**
     * @param customObjectClassId   * @param objectId   * @param associationTypeId If provided, will only return opportunities with this association_type. (optional) * @param createdAfter If provided, will only return objects created after this datetime. (optional) * @param createdBefore If provided, will only return objects created before this datetime. (optional) * @param cursor The pagination cursor value. (optional) * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param modifiedAfter If provided, only objects synced by Merge after this date time will be returned. (optional) * @param modifiedBefore If provided, only objects synced by Merge before this date time will be returned. (optional) * @param pageSize Number of results to return per page. (optional) * @param remoteId The API provider&#39;s ID for the given object. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesCustomObjectsAssociationsListExpanded(requestModel: AssociationsApi.CustomObjectClassesCustomObjectsAssociationsListRequest): MergePaginatedResponse<Association.Expanded> {
        return customObjectClassesCustomObjectsAssociationsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesCustomObjectsAssociationsListExpandedAsync(requestModel: AssociationsApi.CustomObjectClassesCustomObjectsAssociationsListRequest): CompletableFuture<MergePaginatedResponse<Association.Expanded>> = GlobalScope.future {
        customObjectClassesCustomObjectsAssociationsListExpanded(requestModel)
    }

    private suspend inline fun <reified T> customObjectClassesCustomObjectsAssociationsListImpl(requestModel: AssociationsApi.CustomObjectClassesCustomObjectsAssociationsListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.associationTypeId?.apply { localVariableQuery["association_type_id"] = listOf(this) }
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
        "/custom-object-classes/{custom_object_class_id}/custom-objects/{object_id}/associations".replace("{" + "custom_object_class_id" + "}", "${ requestModel.customObjectClassId }").replace("{" + "object_id" + "}", "${ requestModel.objectId }"),
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
    * Creates an Association between &#x60;source_object_id&#x60; and &#x60;target_object_id&#x60; of type &#x60;association_type_id&#x60;.
     * @param associationTypeId  
     * @param sourceClassId  
     * @param sourceObjectId  
     * @param targetClassId  
     * @param targetObjectId  
     * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @return Association
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesCustomObjectsAssociationsUpdate(requestModel: AssociationsApi.CustomObjectClassesCustomObjectsAssociationsUpdateRequest): Association {
        return customObjectClassesCustomObjectsAssociationsUpdateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesCustomObjectsAssociationsUpdateAsync(requestModel: AssociationsApi.CustomObjectClassesCustomObjectsAssociationsUpdateRequest): CompletableFuture<Association> = GlobalScope.future {
        customObjectClassesCustomObjectsAssociationsUpdate(requestModel)
    }

    /**
     * @param associationTypeId   * @param sourceClassId   * @param sourceObjectId   * @param targetClassId   * @param targetObjectId   * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional) * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun customObjectClassesCustomObjectsAssociationsUpdateExpanded(requestModel: AssociationsApi.CustomObjectClassesCustomObjectsAssociationsUpdateRequest): Association.Expanded {
        return customObjectClassesCustomObjectsAssociationsUpdateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun customObjectClassesCustomObjectsAssociationsUpdateExpandedAsync(requestModel: AssociationsApi.CustomObjectClassesCustomObjectsAssociationsUpdateRequest): CompletableFuture<Association.Expanded> = GlobalScope.future {
        customObjectClassesCustomObjectsAssociationsUpdateExpanded(requestModel)
    }

    private suspend inline fun <reified T> customObjectClassesCustomObjectsAssociationsUpdateImpl(requestModel: AssociationsApi.CustomObjectClassesCustomObjectsAssociationsUpdateRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.isDebugMode?.apply { localVariableQuery["is_debug_mode"] = listOf("$this") }
            requestModel.runAsync?.apply { localVariableQuery["run_async"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.PUT,
        "/custom-object-classes/{source_class_id}/custom-objects/{source_object_id}/associations/{target_class_id}/{target_object_id}/{association_type_id}".replace("{" + "association_type_id" + "}", "${ requestModel.associationTypeId }").replace("{" + "source_class_id" + "}", "${ requestModel.sourceClassId }").replace("{" + "source_object_id" + "}", "${ requestModel.sourceObjectId }").replace("{" + "target_class_id" + "}", "${ requestModel.targetClassId }").replace("{" + "target_object_id" + "}", "${ requestModel.targetObjectId }"),
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