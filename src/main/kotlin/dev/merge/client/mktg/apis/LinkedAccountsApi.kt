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

import dev.merge.client.mktg.models.AccountDetailsAndActions

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

open class LinkedAccountsApi(
baseUrl: String = ApiClient.BASE_URL + "mktg/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class LinkedAccountsListRequest (
        val category: kotlin.String? = null,
        val cursor: kotlin.String? = null,
        val endUserEmailAddress: kotlin.String? = null,
        val endUserOrganizationName: kotlin.String? = null,
        val endUserOriginId: kotlin.String? = null,
        val endUserOriginIds: kotlin.String? = null,
        val id: java.util.UUID? = null,
        val ids: kotlin.String? = null,
        val includeDuplicates: kotlin.Boolean? = null,
        val integrationName: kotlin.String? = null,
        val isTestAccount: kotlin.String? = null,
        val pageSize: kotlin.Int? = null,
        val status: kotlin.String? = null
    )

    /**
    * 
    * List linked accounts for your organization.
     * @param category Options: (&#39;hris&#39;, &#39;ats&#39;, &#39;accounting&#39;, &#39;ticketing&#39;, &#39;crm&#39;, &#39;mktg&#39;, &#39;filestorage&#39;)  * &#x60;hris&#x60; - hris * &#x60;ats&#x60; - ats * &#x60;accounting&#x60; - accounting * &#x60;ticketing&#x60; - ticketing * &#x60;crm&#x60; - crm * &#x60;mktg&#x60; - mktg * &#x60;filestorage&#x60; - filestorage (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param endUserEmailAddress If provided, will only return linked accounts associated with the given email address. (optional)
     * @param endUserOrganizationName If provided, will only return linked accounts associated with the given organization name. (optional)
     * @param endUserOriginId If provided, will only return linked accounts associated with the given origin ID. (optional)
     * @param endUserOriginIds Comma-separated list of EndUser origin IDs, making it possible to specify multiple EndUsers at once. (optional)
     * @param id  (optional)
     * @param ids Comma-separated list of LinkedAccount IDs, making it possible to specify multiple LinkedAccounts at once. (optional)
     * @param includeDuplicates If &#x60;true&#x60;, will include complete production duplicates of the account specified by the &#x60;id&#x60; query parameter in the response. &#x60;id&#x60; must be for a complete production linked account. (optional)
     * @param integrationName If provided, will only return linked accounts associated with the given integration name. (optional)
     * @param isTestAccount If included, will only include test linked accounts. If not included, will only include non-test linked accounts. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param status Filter by status. Options: &#x60;COMPLETE&#x60;, &#x60;INCOMPLETE&#x60;, &#x60;RELINK_NEEDED&#x60; (optional)
     * @return PaginatedAccountDetailsAndActionsList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun linkedAccountsList(requestModel: LinkedAccountsApi.LinkedAccountsListRequest): MergePaginatedResponse<AccountDetailsAndActions> {
        return linkedAccountsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun linkedAccountsListAsync(requestModel: LinkedAccountsApi.LinkedAccountsListRequest): CompletableFuture<MergePaginatedResponse<AccountDetailsAndActions>> = GlobalScope.future {
        linkedAccountsList(requestModel)
    }

    /**
     * @param category Options: (&#39;hris&#39;, &#39;ats&#39;, &#39;accounting&#39;, &#39;ticketing&#39;, &#39;crm&#39;, &#39;mktg&#39;, &#39;filestorage&#39;)  * &#x60;hris&#x60; - hris * &#x60;ats&#x60; - ats * &#x60;accounting&#x60; - accounting * &#x60;ticketing&#x60; - ticketing * &#x60;crm&#x60; - crm * &#x60;mktg&#x60; - mktg * &#x60;filestorage&#x60; - filestorage (optional) * @param cursor The pagination cursor value. (optional) * @param endUserEmailAddress If provided, will only return linked accounts associated with the given email address. (optional) * @param endUserOrganizationName If provided, will only return linked accounts associated with the given organization name. (optional) * @param endUserOriginId If provided, will only return linked accounts associated with the given origin ID. (optional) * @param endUserOriginIds Comma-separated list of EndUser origin IDs, making it possible to specify multiple EndUsers at once. (optional) * @param id  (optional) * @param ids Comma-separated list of LinkedAccount IDs, making it possible to specify multiple LinkedAccounts at once. (optional) * @param includeDuplicates If &#x60;true&#x60;, will include complete production duplicates of the account specified by the &#x60;id&#x60; query parameter in the response. &#x60;id&#x60; must be for a complete production linked account. (optional) * @param integrationName If provided, will only return linked accounts associated with the given integration name. (optional) * @param isTestAccount If included, will only include test linked accounts. If not included, will only include non-test linked accounts. (optional) * @param pageSize Number of results to return per page. (optional) * @param status Filter by status. Options: &#x60;COMPLETE&#x60;, &#x60;INCOMPLETE&#x60;, &#x60;RELINK_NEEDED&#x60; (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun linkedAccountsListExpanded(requestModel: LinkedAccountsApi.LinkedAccountsListRequest): MergePaginatedResponse<AccountDetailsAndActions.Expanded> {
        return linkedAccountsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun linkedAccountsListExpandedAsync(requestModel: LinkedAccountsApi.LinkedAccountsListRequest): CompletableFuture<MergePaginatedResponse<AccountDetailsAndActions.Expanded>> = GlobalScope.future {
        linkedAccountsListExpanded(requestModel)
    }

    private suspend inline fun <reified T> linkedAccountsListImpl(requestModel: LinkedAccountsApi.LinkedAccountsListRequest): T {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.category?.apply { localVariableQuery["category"] = listOf(this) }
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf(this) }
            requestModel.endUserEmailAddress?.apply { localVariableQuery["end_user_email_address"] = listOf(this) }
            requestModel.endUserOrganizationName?.apply { localVariableQuery["end_user_organization_name"] = listOf(this) }
            requestModel.endUserOriginId?.apply { localVariableQuery["end_user_origin_id"] = listOf(this) }
            requestModel.endUserOriginIds?.apply { localVariableQuery["end_user_origin_ids"] = listOf(this) }
            requestModel.id?.apply { localVariableQuery["id"] = listOf("$this") }
            requestModel.ids?.apply { localVariableQuery["ids"] = listOf(this) }
            requestModel.includeDuplicates?.apply { localVariableQuery["include_duplicates"] = listOf("$this") }
            requestModel.integrationName?.apply { localVariableQuery["integration_name"] = listOf(this) }
            requestModel.isTestAccount?.apply { localVariableQuery["is_test_account"] = listOf(this) }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }
            requestModel.status?.apply { localVariableQuery["status"] = listOf(this) }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/linked-accounts",
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
