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

import dev.merge.client.mktg.models.Contact
import dev.merge.client.mktg.models.MKTGContactEndpointRequest
import dev.merge.client.mktg.models.MKTGContactResponse
import dev.merge.client.mktg.models.MetaResponse

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

open class ContactsApi(
baseUrl: String = ApiClient.BASE_URL + "mktg/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class ContactsCreateRequest (
        val mkTGContactEndpointRequest: MKTGContactEndpointRequest,
        val isDebugMode: kotlin.Boolean? = null,
        val runAsync: kotlin.Boolean? = null
    )

    data class ContactsListRequest (
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

    data class ContactsRetrieveRequest (
        val id: java.util.UUID,
        val includeRemoteData: kotlin.Boolean? = null
    )

    /**
    * 
    * Creates a &#x60;Contact&#x60; object with the given values.
     * @param mkTGContactEndpointRequest  
     * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @return MKTGContactResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun contactsCreate(requestModel: ContactsApi.ContactsCreateRequest): MKTGContactResponse {
        return contactsCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun contactsCreateAsync(requestModel: ContactsApi.ContactsCreateRequest): CompletableFuture<MKTGContactResponse> = GlobalScope.future {
        contactsCreate(requestModel)
    }

    /**
     * @param mkTGContactEndpointRequest   * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional) * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun contactsCreateExpanded(requestModel: ContactsApi.ContactsCreateRequest): MKTGContactResponse.Expanded {
        return contactsCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun contactsCreateExpandedAsync(requestModel: ContactsApi.ContactsCreateRequest): CompletableFuture<MKTGContactResponse.Expanded> = GlobalScope.future {
        contactsCreateExpanded(requestModel)
    }

    private suspend inline fun <reified T> contactsCreateImpl(requestModel: ContactsApi.ContactsCreateRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.mkTGContactEndpointRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.isDebugMode?.apply { localVariableQuery["is_debug_mode"] = listOf("$this") }
            requestModel.runAsync?.apply { localVariableQuery["run_async"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/contacts",
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
    * Returns a list of &#x60;Contact&#x60; objects.
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, only objects synced by Merge after this date time will be returned. (optional)
     * @param modifiedBefore If provided, only objects synced by Merge before this date time will be returned. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return PaginatedContactList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun contactsList(requestModel: ContactsApi.ContactsListRequest): MergePaginatedResponse<Contact> {
        return contactsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun contactsListAsync(requestModel: ContactsApi.ContactsListRequest): CompletableFuture<MergePaginatedResponse<Contact>> = GlobalScope.future {
        contactsList(requestModel)
    }

    /**
     * @param createdAfter If provided, will only return objects created after this datetime. (optional) * @param createdBefore If provided, will only return objects created before this datetime. (optional) * @param cursor The pagination cursor value. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param modifiedAfter If provided, only objects synced by Merge after this date time will be returned. (optional) * @param modifiedBefore If provided, only objects synced by Merge before this date time will be returned. (optional) * @param pageSize Number of results to return per page. (optional) * @param remoteId The API provider&#39;s ID for the given object. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun contactsListExpanded(requestModel: ContactsApi.ContactsListRequest): MergePaginatedResponse<Contact.Expanded> {
        return contactsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun contactsListExpandedAsync(requestModel: ContactsApi.ContactsListRequest): CompletableFuture<MergePaginatedResponse<Contact.Expanded>> = GlobalScope.future {
        contactsListExpanded(requestModel)
    }

    private suspend inline fun <reified T> contactsListImpl(requestModel: ContactsApi.ContactsListRequest): T {

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
        "/contacts",
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
    * Returns metadata for &#x60;MKTGContact&#x60; POSTs.
     * @return MetaResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun contactsMetaPostRetrieve(): MetaResponse {
        return contactsMetaPostRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun contactsMetaPostRetrieveAsync(): CompletableFuture<MetaResponse> = GlobalScope.future {
        contactsMetaPostRetrieve()
    }

    /**
    
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun contactsMetaPostRetrieveExpanded(): MetaResponse.Expanded {
        return contactsMetaPostRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun contactsMetaPostRetrieveExpandedAsync(): CompletableFuture<MetaResponse.Expanded> = GlobalScope.future {
        contactsMetaPostRetrieveExpanded()
    }

    private suspend inline fun <reified T> contactsMetaPostRetrieveImpl(): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/contacts/meta/post",
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
    * Returns a &#x60;Contact&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return Contact
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun contactsRetrieve(requestModel: ContactsApi.ContactsRetrieveRequest): Contact {
        return contactsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun contactsRetrieveAsync(requestModel: ContactsApi.ContactsRetrieveRequest): CompletableFuture<Contact> = GlobalScope.future {
        contactsRetrieve(requestModel)
    }

    /**
     * @param id   * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun contactsRetrieveExpanded(requestModel: ContactsApi.ContactsRetrieveRequest): Contact.Expanded {
        return contactsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun contactsRetrieveExpandedAsync(requestModel: ContactsApi.ContactsRetrieveRequest): CompletableFuture<Contact.Expanded> = GlobalScope.future {
        contactsRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> contactsRetrieveImpl(requestModel: ContactsApi.ContactsRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/contacts/{id}".replace("{" + "id" + "}", "${ requestModel.id }"),
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
