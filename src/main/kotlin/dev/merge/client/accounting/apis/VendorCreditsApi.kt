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

import dev.merge.client.accounting.models.VendorCredit

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

open class VendorCreditsApi(
baseUrl: String = ApiClient.BASE_URL + "accounting/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class VendorCreditsListRequest (
        val companyId: kotlin.String? = null,
        val createdAfter: java.time.OffsetDateTime? = null,
        val createdBefore: java.time.OffsetDateTime? = null,
        val cursor: kotlin.String? = null,
        val expand: kotlin.String? = null,
        val includeDeletedData: kotlin.Boolean? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val modifiedAfter: java.time.OffsetDateTime? = null,
        val modifiedBefore: java.time.OffsetDateTime? = null,
        val pageSize: kotlin.Int? = null,
        val remoteId: kotlin.String? = null,
        val transactionDateAfter: java.time.OffsetDateTime? = null,
        val transactionDateBefore: java.time.OffsetDateTime? = null
    )

    data class VendorCreditsRetrieveRequest (
        val id: java.util.UUID,
        val expand: kotlin.String? = null,
        val includeRemoteData: kotlin.Boolean? = null
    )

    /**
    * 
    * Returns a list of &#x60;VendorCredit&#x60; objects.
     * @param companyId If provided, will only return vendor credits for this company. (optional)
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
     * @param transactionDateAfter If provided, will only return objects created after this datetime. (optional)
     * @param transactionDateBefore If provided, will only return objects created before this datetime. (optional)
     * @return PaginatedVendorCreditList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun vendorCreditsList(requestModel: VendorCreditsApi.VendorCreditsListRequest): MergePaginatedResponse<VendorCredit> {
        return vendorCreditsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun vendorCreditsListAsync(requestModel: VendorCreditsApi.VendorCreditsListRequest): CompletableFuture<MergePaginatedResponse<VendorCredit>> = GlobalScope.future {
        vendorCreditsList(requestModel)
    }

    /**
     * @param companyId If provided, will only return vendor credits for this company. (optional) * @param createdAfter If provided, will only return objects created after this datetime. (optional) * @param createdBefore If provided, will only return objects created before this datetime. (optional) * @param cursor The pagination cursor value. (optional) * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param modifiedAfter If provided, only objects synced by Merge after this date time will be returned. (optional) * @param modifiedBefore If provided, only objects synced by Merge before this date time will be returned. (optional) * @param pageSize Number of results to return per page. (optional) * @param remoteId The API provider&#39;s ID for the given object. (optional) * @param transactionDateAfter If provided, will only return objects created after this datetime. (optional) * @param transactionDateBefore If provided, will only return objects created before this datetime. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun vendorCreditsListExpanded(requestModel: VendorCreditsApi.VendorCreditsListRequest): MergePaginatedResponse<VendorCredit.Expanded> {
        return vendorCreditsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun vendorCreditsListExpandedAsync(requestModel: VendorCreditsApi.VendorCreditsListRequest): CompletableFuture<MergePaginatedResponse<VendorCredit.Expanded>> = GlobalScope.future {
        vendorCreditsListExpanded(requestModel)
    }

    private suspend inline fun <reified T> vendorCreditsListImpl(requestModel: VendorCreditsApi.VendorCreditsListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.companyId?.apply { localVariableQuery["company_id"] = listOf(this) }
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
            requestModel.transactionDateAfter?.apply { localVariableQuery["transaction_date_after"] = listOf("$this") }
            requestModel.transactionDateBefore?.apply { localVariableQuery["transaction_date_before"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/vendor-credits",
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
    * Returns a &#x60;VendorCredit&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return VendorCredit
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun vendorCreditsRetrieve(requestModel: VendorCreditsApi.VendorCreditsRetrieveRequest): VendorCredit {
        return vendorCreditsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun vendorCreditsRetrieveAsync(requestModel: VendorCreditsApi.VendorCreditsRetrieveRequest): CompletableFuture<VendorCredit> = GlobalScope.future {
        vendorCreditsRetrieve(requestModel)
    }

    /**
     * @param id   * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun vendorCreditsRetrieveExpanded(requestModel: VendorCreditsApi.VendorCreditsRetrieveRequest): VendorCredit.Expanded {
        return vendorCreditsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun vendorCreditsRetrieveExpandedAsync(requestModel: VendorCreditsApi.VendorCreditsRetrieveRequest): CompletableFuture<VendorCredit.Expanded> = GlobalScope.future {
        vendorCreditsRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> vendorCreditsRetrieveImpl(requestModel: VendorCreditsApi.VendorCreditsRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.expand?.apply { localVariableQuery["expand"] = listOf(this) }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/vendor-credits/{id}".replace("{" + "id" + "}", "${ requestModel.id }"),
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
