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

package dev.merge.client.accounting.models


import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The ExpenseLine Object ### Description The `ExpenseLine` object is used to represent an expense's line items.  ### Usage Example Fetch from the `GET Expense` endpoint and view the expense's line items.
 *
 * @param remoteId The third-party API ID of the matching object.
 * @param item The line's item.
 * @param netAmount The line's net amount.
 * @param trackingCategory 
 * @param company The company the line belongs to.
 * @param account The expense's payment account.
 * @param description The line item's description.
 * @param integrationParams 
 * @param linkedAccountParams 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class ExpenseLineRequest (

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The line's item. */
    @field:JsonProperty("item")
    val item: java.util.UUID? = null,

    /* The line's net amount. */
    @field:JsonProperty("net_amount")
    val netAmount: kotlin.Float? = null,

    @field:JsonProperty("tracking_category")
    val trackingCategory: java.util.UUID? = null,

    /* The company the line belongs to. */
    @field:JsonProperty("company")
    val company: java.util.UUID? = null,

    /* The expense's payment account. */
    @field:JsonProperty("account")
    val account: java.util.UUID? = null,

    /* The line item's description. */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("item")
        val item: JsonNode?,

        @field:JsonProperty("net_amount")
        val netAmount: JsonNode?,

        @field:JsonProperty("tracking_category")
        val trackingCategory: JsonNode?,

        @field:JsonProperty("company")
        val company: JsonNode?,

        @field:JsonProperty("account")
        val account: JsonNode?,

        @field:JsonProperty("description")
        val description: JsonNode?,

        @field:JsonProperty("integration_params")
        val integrationParams: JsonNode?,

        @field:JsonProperty("linked_account_params")
        val linkedAccountParams: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: ExpenseLineRequest.Expanded): ExpenseLineRequest {
            return ExpenseLineRequest(
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                item = ApiClient.jsonConvertSafe(expanded.item),
                netAmount = ApiClient.jsonConvertSafe(expanded.netAmount),
                trackingCategory = ApiClient.jsonConvertSafe(expanded.trackingCategory),
                company = ApiClient.jsonConvertSafe(expanded.company),
                account = ApiClient.jsonConvertSafe(expanded.account),
                description = ApiClient.jsonConvertSafe(expanded.description),
                integrationParams = ApiClient.jsonConvertSafe(expanded.integrationParams),
                linkedAccountParams = ApiClient.jsonConvertSafe(expanded.linkedAccountParams)
            )
        }
    }
}

