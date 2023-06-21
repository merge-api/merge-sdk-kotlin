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
 * @param trackingCategories 
 * @param company The company the line belongs to.
 * @param account The expense's payment account.
 * @param contact The expense's contact.
 * @param description The description of the item that was purchased by the company.
 * @param exchangeRate The expense line item's exchange rate.
 * @param modifiedAt This is the datetime that this object was last updated by Merge
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class ExpenseLine (

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The line's item. */
    @field:JsonProperty("item")
    val item: java.util.UUID? = null,

    /* The line's net amount. */
    @field:JsonProperty("net_amount")
    val netAmount: kotlin.Double? = null,

    @field:JsonProperty("tracking_category")
    val trackingCategory: java.util.UUID? = null,

    @field:JsonProperty("tracking_categories")
    val trackingCategories: kotlin.collections.List<java.util.UUID>? = null,

    /* The company the line belongs to. */
    @field:JsonProperty("company")
    val company: java.util.UUID? = null,

    /* The expense's payment account. */
    @field:JsonProperty("account")
    val account: java.util.UUID? = null,

    /* The expense's contact. */
    @field:JsonProperty("contact")
    val contact: java.util.UUID? = null,

    /* The description of the item that was purchased by the company. */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    /* The expense line item's exchange rate. */
    @field:JsonProperty("exchange_rate")
    val exchangeRate: java.math.BigDecimal? = null,

    /* This is the datetime that this object was last updated by Merge */
    @field:JsonProperty("modified_at")
    val modifiedAt: java.time.OffsetDateTime? = null

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

        @field:JsonProperty("tracking_categories")
        val trackingCategories: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("company")
        val company: JsonNode?,

        @field:JsonProperty("account")
        val account: JsonNode?,

        @field:JsonProperty("contact")
        val contact: JsonNode?,

        @field:JsonProperty("description")
        val description: JsonNode?,

        @field:JsonProperty("exchange_rate")
        val exchangeRate: JsonNode?,

        @field:JsonProperty("modified_at")
        val modifiedAt: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: ExpenseLine.Expanded): ExpenseLine {
            return ExpenseLine(
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                item = ApiClient.jsonConvertSafe(expanded.item),
                netAmount = ApiClient.jsonConvertSafe(expanded.netAmount),
                trackingCategory = ApiClient.jsonConvertSafe(expanded.trackingCategory),
                trackingCategories = ApiClient.jsonConvertSafe(expanded.trackingCategories),
                company = ApiClient.jsonConvertSafe(expanded.company),
                account = ApiClient.jsonConvertSafe(expanded.account),
                contact = ApiClient.jsonConvertSafe(expanded.contact),
                description = ApiClient.jsonConvertSafe(expanded.description),
                exchangeRate = ApiClient.jsonConvertSafe(expanded.exchangeRate),
                modifiedAt = ApiClient.jsonConvertSafe(expanded.modifiedAt)
            )
        }
    }
}

