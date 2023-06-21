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

import dev.merge.client.crm.models.MetaResponse
import dev.merge.client.crm.models.Note
import dev.merge.client.crm.models.NoteEndpointRequest
import dev.merge.client.crm.models.NoteResponse
import dev.merge.client.crm.models.RemoteFieldClass

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

open class NotesApi(
baseUrl: String = ApiClient.BASE_URL + "crm/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class NotesCreateRequest (
        val noteEndpointRequest: NoteEndpointRequest,
        val isDebugMode: kotlin.Boolean? = null,
        val runAsync: kotlin.Boolean? = null
    )

    data class NotesListRequest (
        val accountId: kotlin.String? = null,
        val contactId: kotlin.String? = null,
        val createdAfter: java.time.OffsetDateTime? = null,
        val createdBefore: java.time.OffsetDateTime? = null,
        val cursor: kotlin.String? = null,
        val expand: kotlin.String? = null,
        val includeDeletedData: kotlin.Boolean? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val includeRemoteFields: kotlin.Boolean? = null,
        val modifiedAfter: java.time.OffsetDateTime? = null,
        val modifiedBefore: java.time.OffsetDateTime? = null,
        val opportunityId: kotlin.String? = null,
        val ownerId: kotlin.String? = null,
        val pageSize: kotlin.Int? = null,
        val remoteId: kotlin.String? = null
    )

    data class NotesRemoteFieldClassesListRequest (
        val cursor: kotlin.String? = null,
        val includeDeletedData: kotlin.Boolean? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val includeRemoteFields: kotlin.Boolean? = null,
        val pageSize: kotlin.Int? = null
    )

    data class NotesRetrieveRequest (
        val id: java.util.UUID,
        val expand: kotlin.String? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val includeRemoteFields: kotlin.Boolean? = null
    )

    /**
    * 
    * Creates a &#x60;Note&#x60; object with the given values.
     * @param noteEndpointRequest  
     * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @return NoteResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun notesCreate(requestModel: NotesApi.NotesCreateRequest): NoteResponse {
        return notesCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun notesCreateAsync(requestModel: NotesApi.NotesCreateRequest): CompletableFuture<NoteResponse> = GlobalScope.future {
        notesCreate(requestModel)
    }

    /**
     * @param noteEndpointRequest   * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional) * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun notesCreateExpanded(requestModel: NotesApi.NotesCreateRequest): NoteResponse.Expanded {
        return notesCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun notesCreateExpandedAsync(requestModel: NotesApi.NotesCreateRequest): CompletableFuture<NoteResponse.Expanded> = GlobalScope.future {
        notesCreateExpanded(requestModel)
    }

    private suspend inline fun <reified T> notesCreateImpl(requestModel: NotesApi.NotesCreateRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.noteEndpointRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.isDebugMode?.apply { localVariableQuery["is_debug_mode"] = listOf("$this") }
            requestModel.runAsync?.apply { localVariableQuery["run_async"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/notes",
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
    * Returns a list of &#x60;Note&#x60; objects.
     * @param accountId If provided, will only return notes with this account. (optional)
     * @param contactId If provided, will only return notes with this contact. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param includeRemoteFields Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. (optional)
     * @param modifiedAfter If provided, only objects synced by Merge after this date time will be returned. (optional)
     * @param modifiedBefore If provided, only objects synced by Merge before this date time will be returned. (optional)
     * @param opportunityId If provided, will only return notes with this opportunity. (optional)
     * @param ownerId If provided, will only return notes with this owner. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return PaginatedNoteList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun notesList(requestModel: NotesApi.NotesListRequest): MergePaginatedResponse<Note> {
        return notesListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun notesListAsync(requestModel: NotesApi.NotesListRequest): CompletableFuture<MergePaginatedResponse<Note>> = GlobalScope.future {
        notesList(requestModel)
    }

    /**
     * @param accountId If provided, will only return notes with this account. (optional) * @param contactId If provided, will only return notes with this contact. (optional) * @param createdAfter If provided, will only return objects created after this datetime. (optional) * @param createdBefore If provided, will only return objects created before this datetime. (optional) * @param cursor The pagination cursor value. (optional) * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param includeRemoteFields Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. (optional) * @param modifiedAfter If provided, only objects synced by Merge after this date time will be returned. (optional) * @param modifiedBefore If provided, only objects synced by Merge before this date time will be returned. (optional) * @param opportunityId If provided, will only return notes with this opportunity. (optional) * @param ownerId If provided, will only return notes with this owner. (optional) * @param pageSize Number of results to return per page. (optional) * @param remoteId The API provider&#39;s ID for the given object. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun notesListExpanded(requestModel: NotesApi.NotesListRequest): MergePaginatedResponse<Note.Expanded> {
        return notesListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun notesListExpandedAsync(requestModel: NotesApi.NotesListRequest): CompletableFuture<MergePaginatedResponse<Note.Expanded>> = GlobalScope.future {
        notesListExpanded(requestModel)
    }

    private suspend inline fun <reified T> notesListImpl(requestModel: NotesApi.NotesListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.accountId?.apply { localVariableQuery["account_id"] = listOf(this) }
            requestModel.contactId?.apply { localVariableQuery["contact_id"] = listOf(this) }
            requestModel.createdAfter?.apply { localVariableQuery["created_after"] = listOf("$this") }
            requestModel.createdBefore?.apply { localVariableQuery["created_before"] = listOf("$this") }
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf(this) }
            requestModel.expand?.apply { localVariableQuery["expand"] = listOf(this) }
            requestModel.includeDeletedData?.apply { localVariableQuery["include_deleted_data"] = listOf("$this") }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.includeRemoteFields?.apply { localVariableQuery["include_remote_fields"] = listOf("$this") }
            requestModel.modifiedAfter?.apply { localVariableQuery["modified_after"] = listOf("$this") }
            requestModel.modifiedBefore?.apply { localVariableQuery["modified_before"] = listOf("$this") }
            requestModel.opportunityId?.apply { localVariableQuery["opportunity_id"] = listOf(this) }
            requestModel.ownerId?.apply { localVariableQuery["owner_id"] = listOf(this) }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }
            requestModel.remoteId?.apply { localVariableQuery["remote_id"] = listOf(this) }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/notes",
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
    * Returns metadata for &#x60;Note&#x60; POSTs.
     * @return MetaResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun notesMetaPostRetrieve(): MetaResponse {
        return notesMetaPostRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun notesMetaPostRetrieveAsync(): CompletableFuture<MetaResponse> = GlobalScope.future {
        notesMetaPostRetrieve()
    }

    /**
    
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun notesMetaPostRetrieveExpanded(): MetaResponse.Expanded {
        return notesMetaPostRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun notesMetaPostRetrieveExpandedAsync(): CompletableFuture<MetaResponse.Expanded> = GlobalScope.future {
        notesMetaPostRetrieveExpanded()
    }

    private suspend inline fun <reified T> notesMetaPostRetrieveImpl(): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/notes/meta/post",
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
    * Returns a list of &#x60;RemoteFieldClass&#x60; objects.
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param includeRemoteFields Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return PaginatedRemoteFieldClassList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun notesRemoteFieldClassesList(requestModel: NotesApi.NotesRemoteFieldClassesListRequest): MergePaginatedResponse<RemoteFieldClass> {
        return notesRemoteFieldClassesListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun notesRemoteFieldClassesListAsync(requestModel: NotesApi.NotesRemoteFieldClassesListRequest): CompletableFuture<MergePaginatedResponse<RemoteFieldClass>> = GlobalScope.future {
        notesRemoteFieldClassesList(requestModel)
    }

    /**
     * @param cursor The pagination cursor value. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param includeRemoteFields Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. (optional) * @param pageSize Number of results to return per page. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun notesRemoteFieldClassesListExpanded(requestModel: NotesApi.NotesRemoteFieldClassesListRequest): MergePaginatedResponse<RemoteFieldClass.Expanded> {
        return notesRemoteFieldClassesListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun notesRemoteFieldClassesListExpandedAsync(requestModel: NotesApi.NotesRemoteFieldClassesListRequest): CompletableFuture<MergePaginatedResponse<RemoteFieldClass.Expanded>> = GlobalScope.future {
        notesRemoteFieldClassesListExpanded(requestModel)
    }

    private suspend inline fun <reified T> notesRemoteFieldClassesListImpl(requestModel: NotesApi.NotesRemoteFieldClassesListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf(this) }
            requestModel.includeDeletedData?.apply { localVariableQuery["include_deleted_data"] = listOf("$this") }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.includeRemoteFields?.apply { localVariableQuery["include_remote_fields"] = listOf("$this") }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/notes/remote-field-classes",
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
    * Returns a &#x60;Note&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param includeRemoteFields Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. (optional)
     * @return Note
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun notesRetrieve(requestModel: NotesApi.NotesRetrieveRequest): Note {
        return notesRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun notesRetrieveAsync(requestModel: NotesApi.NotesRetrieveRequest): CompletableFuture<Note> = GlobalScope.future {
        notesRetrieve(requestModel)
    }

    /**
     * @param id   * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param includeRemoteFields Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun notesRetrieveExpanded(requestModel: NotesApi.NotesRetrieveRequest): Note.Expanded {
        return notesRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun notesRetrieveExpandedAsync(requestModel: NotesApi.NotesRetrieveRequest): CompletableFuture<Note.Expanded> = GlobalScope.future {
        notesRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> notesRetrieveImpl(requestModel: NotesApi.NotesRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.expand?.apply { localVariableQuery["expand"] = listOf(this) }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.includeRemoteFields?.apply { localVariableQuery["include_remote_fields"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/notes/{id}".replace("{" + "id" + "}", "${ requestModel.id }"),
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
