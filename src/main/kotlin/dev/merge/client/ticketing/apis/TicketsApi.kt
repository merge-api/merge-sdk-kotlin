/**
 * Merge Ticketing API
 *
 * The unified API for building rich integrations with multiple Ticketing platforms.
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

package dev.merge.client.ticketing.apis

import dev.merge.client.ticketing.models.MetaResponse
import dev.merge.client.ticketing.models.Ticket
import dev.merge.client.ticketing.models.User
import dev.merge.client.ticketing.models.PatchedTicketEndpointRequest
import dev.merge.client.ticketing.models.TicketEndpointRequest
import dev.merge.client.ticketing.models.TicketResponse

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

open class TicketsApi(
baseUrl: String = ApiClient.BASE_URL + "ticketing/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class TicketsCollaboratorsListRequest (
        val id: java.util.UUID,
        val cursor: kotlin.String? = null,
        val expand: kotlin.String? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val pageSize: kotlin.Int? = null
    )

    data class TicketsCreateRequest (
        val ticketEndpointRequest: TicketEndpointRequest,
        val isDebugMode: kotlin.Boolean? = null,
        val runAsync: kotlin.Boolean? = null
    )

    data class TicketsListRequest (
        val accountId: kotlin.String? = null,
        val assigneeIds: kotlin.String? = null,
        val completedAfter: java.time.OffsetDateTime? = null,
        val completedBefore: java.time.OffsetDateTime? = null,
        val contactId: kotlin.String? = null,
        val createdAfter: java.time.OffsetDateTime? = null,
        val createdBefore: java.time.OffsetDateTime? = null,
        val cursor: kotlin.String? = null,
        val dueAfter: java.time.OffsetDateTime? = null,
        val dueBefore: java.time.OffsetDateTime? = null,
        val expand: kotlin.String? = null,
        val includeDeletedData: kotlin.Boolean? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val modifiedAfter: java.time.OffsetDateTime? = null,
        val modifiedBefore: java.time.OffsetDateTime? = null,
        val pageSize: kotlin.Int? = null,
        val parentTicketId: kotlin.String? = null,
        val priority: kotlin.String? = null,
        val projectId: kotlin.String? = null,
        val remoteCreatedAfter: java.time.OffsetDateTime? = null,
        val remoteCreatedBefore: java.time.OffsetDateTime? = null,
        val remoteFields: kotlin.String? = null,
        val remoteId: kotlin.String? = null,
        val remoteUpdatedAfter: java.time.OffsetDateTime? = null,
        val remoteUpdatedBefore: java.time.OffsetDateTime? = null,
        val status: kotlin.String? = null,
        val tags: kotlin.String? = null,
        val ticketType: kotlin.String? = null
    )

    data class TicketsMetaPatchRetrieveRequest (
        val id: java.util.UUID
    )

    data class TicketsPartialUpdateRequest (
        val id: java.util.UUID,
        val patchedTicketEndpointRequest: PatchedTicketEndpointRequest,
        val isDebugMode: kotlin.Boolean? = null,
        val runAsync: kotlin.Boolean? = null
    )

    data class TicketsRetrieveRequest (
        val id: java.util.UUID,
        val expand: kotlin.String? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val remoteFields: kotlin.String? = null
    )

    /**
    * 
    * Returns a &#x60;User&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param cursor The pagination cursor value. (optional)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return PaginatedUserList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun ticketsCollaboratorsList(requestModel: TicketsApi.TicketsCollaboratorsListRequest): MergePaginatedResponse<User> {
        return ticketsCollaboratorsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun ticketsCollaboratorsListAsync(requestModel: TicketsApi.TicketsCollaboratorsListRequest): CompletableFuture<MergePaginatedResponse<User>> = GlobalScope.future {
        ticketsCollaboratorsList(requestModel)
    }

    /**
     * @param id   * @param cursor The pagination cursor value. (optional) * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param pageSize Number of results to return per page. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun ticketsCollaboratorsListExpanded(requestModel: TicketsApi.TicketsCollaboratorsListRequest): MergePaginatedResponse<User.Expanded> {
        return ticketsCollaboratorsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun ticketsCollaboratorsListExpandedAsync(requestModel: TicketsApi.TicketsCollaboratorsListRequest): CompletableFuture<MergePaginatedResponse<User.Expanded>> = GlobalScope.future {
        ticketsCollaboratorsListExpanded(requestModel)
    }

    private suspend inline fun <reified T> ticketsCollaboratorsListImpl(requestModel: TicketsApi.TicketsCollaboratorsListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf(this) }
            requestModel.expand?.apply { localVariableQuery["expand"] = listOf(this) }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/tickets/{id}/collaborators".replace("{" + "id" + "}", "${ requestModel.id }"),
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
    * Creates a &#x60;Ticket&#x60; object with the given values.
     * @param ticketEndpointRequest  
     * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @return TicketResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun ticketsCreate(requestModel: TicketsApi.TicketsCreateRequest): TicketResponse {
        return ticketsCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun ticketsCreateAsync(requestModel: TicketsApi.TicketsCreateRequest): CompletableFuture<TicketResponse> = GlobalScope.future {
        ticketsCreate(requestModel)
    }

    /**
     * @param ticketEndpointRequest   * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional) * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun ticketsCreateExpanded(requestModel: TicketsApi.TicketsCreateRequest): TicketResponse.Expanded {
        return ticketsCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun ticketsCreateExpandedAsync(requestModel: TicketsApi.TicketsCreateRequest): CompletableFuture<TicketResponse.Expanded> = GlobalScope.future {
        ticketsCreateExpanded(requestModel)
    }

    private suspend inline fun <reified T> ticketsCreateImpl(requestModel: TicketsApi.TicketsCreateRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.ticketEndpointRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.isDebugMode?.apply { localVariableQuery["is_debug_mode"] = listOf("$this") }
            requestModel.runAsync?.apply { localVariableQuery["run_async"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/tickets",
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
    * Returns a list of &#x60;Ticket&#x60; objects.
     * @param accountId If provided, will only return tickets for this account. (optional)
     * @param assigneeIds If provided, will only return tickets assigned to the assignee_ids; multiple assignee_ids can be separated by commas. (optional)
     * @param completedAfter If provided, will only return tickets completed after this datetime. (optional)
     * @param completedBefore If provided, will only return tickets completed before this datetime. (optional)
     * @param contactId If provided, will only return tickets for this contact. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param dueAfter If provided, will only return tickets due after this datetime. (optional)
     * @param dueBefore If provided, will only return tickets due before this datetime. (optional)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param parentTicketId If provided, will only return sub tickets of the parent_ticket_id. (optional)
     * @param priority If provided, will only return tickets of this priority. (optional)
     * @param projectId If provided, will only return tickets for this project. (optional)
     * @param remoteCreatedAfter If provided, will only return tickets created in the third party platform after this datetime. (optional)
     * @param remoteCreatedBefore If provided, will only return tickets created in the third party platform before this datetime. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param remoteUpdatedAfter If provided, will only return tickets updated in the third party platform after this datetime. (optional)
     * @param remoteUpdatedBefore If provided, will only return tickets updated in the third party platform before this datetime. (optional)
     * @param status If provided, will only return tickets of this status. (optional)
     * @param tags If provided, will only return tickets matching the tags; multiple tags can be separated by commas. (optional)
     * @param ticketType If provided, will only return tickets of this type. (optional)
     * @return PaginatedTicketList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun ticketsList(requestModel: TicketsApi.TicketsListRequest): MergePaginatedResponse<Ticket> {
        return ticketsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun ticketsListAsync(requestModel: TicketsApi.TicketsListRequest): CompletableFuture<MergePaginatedResponse<Ticket>> = GlobalScope.future {
        ticketsList(requestModel)
    }

    /**
     * @param accountId If provided, will only return tickets for this account. (optional) * @param assigneeIds If provided, will only return tickets assigned to the assignee_ids; multiple assignee_ids can be separated by commas. (optional) * @param completedAfter If provided, will only return tickets completed after this datetime. (optional) * @param completedBefore If provided, will only return tickets completed before this datetime. (optional) * @param contactId If provided, will only return tickets for this contact. (optional) * @param createdAfter If provided, will only return objects created after this datetime. (optional) * @param createdBefore If provided, will only return objects created before this datetime. (optional) * @param cursor The pagination cursor value. (optional) * @param dueAfter If provided, will only return tickets due after this datetime. (optional) * @param dueBefore If provided, will only return tickets due before this datetime. (optional) * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional) * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional) * @param pageSize Number of results to return per page. (optional) * @param parentTicketId If provided, will only return sub tickets of the parent_ticket_id. (optional) * @param priority If provided, will only return tickets of this priority. (optional) * @param projectId If provided, will only return tickets for this project. (optional) * @param remoteCreatedAfter If provided, will only return tickets created in the third party platform after this datetime. (optional) * @param remoteCreatedBefore If provided, will only return tickets created in the third party platform before this datetime. (optional) * @param remoteFields Which fields should be returned in non-normalized form. (optional) * @param remoteId The API provider&#39;s ID for the given object. (optional) * @param remoteUpdatedAfter If provided, will only return tickets updated in the third party platform after this datetime. (optional) * @param remoteUpdatedBefore If provided, will only return tickets updated in the third party platform before this datetime. (optional) * @param status If provided, will only return tickets of this status. (optional) * @param tags If provided, will only return tickets matching the tags; multiple tags can be separated by commas. (optional) * @param ticketType If provided, will only return tickets of this type. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun ticketsListExpanded(requestModel: TicketsApi.TicketsListRequest): MergePaginatedResponse<Ticket.Expanded> {
        return ticketsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun ticketsListExpandedAsync(requestModel: TicketsApi.TicketsListRequest): CompletableFuture<MergePaginatedResponse<Ticket.Expanded>> = GlobalScope.future {
        ticketsListExpanded(requestModel)
    }

    private suspend inline fun <reified T> ticketsListImpl(requestModel: TicketsApi.TicketsListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.accountId?.apply { localVariableQuery["account_id"] = listOf(this) }
            requestModel.assigneeIds?.apply { localVariableQuery["assignee_ids"] = listOf(this) }
            requestModel.completedAfter?.apply { localVariableQuery["completed_after"] = listOf("$this") }
            requestModel.completedBefore?.apply { localVariableQuery["completed_before"] = listOf("$this") }
            requestModel.contactId?.apply { localVariableQuery["contact_id"] = listOf(this) }
            requestModel.createdAfter?.apply { localVariableQuery["created_after"] = listOf("$this") }
            requestModel.createdBefore?.apply { localVariableQuery["created_before"] = listOf("$this") }
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf(this) }
            requestModel.dueAfter?.apply { localVariableQuery["due_after"] = listOf("$this") }
            requestModel.dueBefore?.apply { localVariableQuery["due_before"] = listOf("$this") }
            requestModel.expand?.apply { localVariableQuery["expand"] = listOf(this) }
            requestModel.includeDeletedData?.apply { localVariableQuery["include_deleted_data"] = listOf("$this") }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.modifiedAfter?.apply { localVariableQuery["modified_after"] = listOf("$this") }
            requestModel.modifiedBefore?.apply { localVariableQuery["modified_before"] = listOf("$this") }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }
            requestModel.parentTicketId?.apply { localVariableQuery["parent_ticket_id"] = listOf(this) }
            requestModel.priority?.apply { localVariableQuery["priority"] = listOf(this) }
            requestModel.projectId?.apply { localVariableQuery["project_id"] = listOf(this) }
            requestModel.remoteCreatedAfter?.apply { localVariableQuery["remote_created_after"] = listOf("$this") }
            requestModel.remoteCreatedBefore?.apply { localVariableQuery["remote_created_before"] = listOf("$this") }
            requestModel.remoteFields?.apply { localVariableQuery["remote_fields"] = listOf(this) }
            requestModel.remoteId?.apply { localVariableQuery["remote_id"] = listOf(this) }
            requestModel.remoteUpdatedAfter?.apply { localVariableQuery["remote_updated_after"] = listOf("$this") }
            requestModel.remoteUpdatedBefore?.apply { localVariableQuery["remote_updated_before"] = listOf("$this") }
            requestModel.status?.apply { localVariableQuery["status"] = listOf(this) }
            requestModel.tags?.apply { localVariableQuery["tags"] = listOf(this) }
            requestModel.ticketType?.apply { localVariableQuery["ticket_type"] = listOf(this) }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/tickets",
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
    * Returns metadata for &#x60;Ticket&#x60; PATCHs.
     * @param id  
     * @return MetaResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun ticketsMetaPatchRetrieve(requestModel: TicketsApi.TicketsMetaPatchRetrieveRequest): MetaResponse {
        return ticketsMetaPatchRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun ticketsMetaPatchRetrieveAsync(requestModel: TicketsApi.TicketsMetaPatchRetrieveRequest): CompletableFuture<MetaResponse> = GlobalScope.future {
        ticketsMetaPatchRetrieve(requestModel)
    }

    /**
     * @param id  
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun ticketsMetaPatchRetrieveExpanded(requestModel: TicketsApi.TicketsMetaPatchRetrieveRequest): MetaResponse.Expanded {
        return ticketsMetaPatchRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun ticketsMetaPatchRetrieveExpandedAsync(requestModel: TicketsApi.TicketsMetaPatchRetrieveRequest): CompletableFuture<MetaResponse.Expanded> = GlobalScope.future {
        ticketsMetaPatchRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> ticketsMetaPatchRetrieveImpl(requestModel: TicketsApi.TicketsMetaPatchRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/tickets/meta/patch/{id}".replace("{" + "id" + "}", "${ requestModel.id }"),
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
    * Returns metadata for &#x60;Ticket&#x60; POSTs.
     * @return MetaResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun ticketsMetaPostRetrieve(): MetaResponse {
        return ticketsMetaPostRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun ticketsMetaPostRetrieveAsync(): CompletableFuture<MetaResponse> = GlobalScope.future {
        ticketsMetaPostRetrieve()
    }

    /**
    
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun ticketsMetaPostRetrieveExpanded(): MetaResponse.Expanded {
        return ticketsMetaPostRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun ticketsMetaPostRetrieveExpandedAsync(): CompletableFuture<MetaResponse.Expanded> = GlobalScope.future {
        ticketsMetaPostRetrieveExpanded()
    }

    private suspend inline fun <reified T> ticketsMetaPostRetrieveImpl(): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/tickets/meta/post",
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
    * Updates a &#x60;Ticket&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param patchedTicketEndpointRequest  
     * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @return TicketResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun ticketsPartialUpdate(requestModel: TicketsApi.TicketsPartialUpdateRequest): TicketResponse {
        return ticketsPartialUpdateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun ticketsPartialUpdateAsync(requestModel: TicketsApi.TicketsPartialUpdateRequest): CompletableFuture<TicketResponse> = GlobalScope.future {
        ticketsPartialUpdate(requestModel)
    }

    /**
     * @param id   * @param patchedTicketEndpointRequest   * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional) * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun ticketsPartialUpdateExpanded(requestModel: TicketsApi.TicketsPartialUpdateRequest): TicketResponse.Expanded {
        return ticketsPartialUpdateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun ticketsPartialUpdateExpandedAsync(requestModel: TicketsApi.TicketsPartialUpdateRequest): CompletableFuture<TicketResponse.Expanded> = GlobalScope.future {
        ticketsPartialUpdateExpanded(requestModel)
    }

    private suspend inline fun <reified T> ticketsPartialUpdateImpl(requestModel: TicketsApi.TicketsPartialUpdateRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.patchedTicketEndpointRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.isDebugMode?.apply { localVariableQuery["is_debug_mode"] = listOf("$this") }
            requestModel.runAsync?.apply { localVariableQuery["run_async"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.PATCH,
        "/tickets/{id}".replace("{" + "id" + "}", "${ requestModel.id }"),
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
    * Returns a &#x60;Ticket&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @return Ticket
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun ticketsRetrieve(requestModel: TicketsApi.TicketsRetrieveRequest): Ticket {
        return ticketsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun ticketsRetrieveAsync(requestModel: TicketsApi.TicketsRetrieveRequest): CompletableFuture<Ticket> = GlobalScope.future {
        ticketsRetrieve(requestModel)
    }

    /**
     * @param id   * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param remoteFields Which fields should be returned in non-normalized form. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun ticketsRetrieveExpanded(requestModel: TicketsApi.TicketsRetrieveRequest): Ticket.Expanded {
        return ticketsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun ticketsRetrieveExpandedAsync(requestModel: TicketsApi.TicketsRetrieveRequest): CompletableFuture<Ticket.Expanded> = GlobalScope.future {
        ticketsRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> ticketsRetrieveImpl(requestModel: TicketsApi.TicketsRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.expand?.apply { localVariableQuery["expand"] = listOf(this) }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.remoteFields?.apply { localVariableQuery["remote_fields"] = listOf(this) }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/tickets/{id}".replace("{" + "id" + "}", "${ requestModel.id }"),
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
