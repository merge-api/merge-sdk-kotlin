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

import dev.merge.client.accounting.models.CurrencyEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The PurchaseOrderLineItem Object ### Description The `PurchaseOrderLineItem` object is used to represent a purchase order's line item.  ### Usage Example Fetch from the `GET PurchaseOrder` endpoint and view a company's purchase orders.
 *
 * @param description The line item's description.
 * @param unitPrice The line item's unit price.
 * @param quantity The line item's quantity.
 * @param item 
 * @param account The purchase order line item's account.
 * @param trackingCategory The purchase order line item's associated tracking category.
 * @param taxAmount The purchase order line item's tax amount.
 * @param totalLineAmount The purchase order line item's total amount.
 * @param currency The purchase order line item's currency.
 * @param exchangeRate The purchase order line item's exchange rate.
 * @param company The company the purchase order line item belongs to.
 * @param integrationParams 
 * @param linkedAccountParams 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class PurchaseOrderLineItemRequest (

    /* The line item's description. */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    /* The line item's unit price. */
    @field:JsonProperty("unit_price")
    val unitPrice: kotlin.Float? = null,

    /* The line item's quantity. */
    @field:JsonProperty("quantity")
    val quantity: kotlin.Float? = null,

    @field:JsonProperty("item")
    val item: java.util.UUID? = null,

    /* The purchase order line item's account. */
    @field:JsonProperty("account")
    val account: java.util.UUID? = null,

    /* The purchase order line item's associated tracking category. */
    @field:JsonProperty("tracking_category")
    val trackingCategory: java.util.UUID? = null,

    /* The purchase order line item's tax amount. */
    @field:JsonProperty("tax_amount")
    val taxAmount: java.math.BigDecimal? = null,

    /* The purchase order line item's total amount. */
    @field:JsonProperty("total_line_amount")
    val totalLineAmount: java.math.BigDecimal? = null,

    /* The purchase order line item's currency. */
    @field:JsonProperty("currency")
    val currency: CurrencyEnum? = null,

    /* The purchase order line item's exchange rate. */
    @field:JsonProperty("exchange_rate")
    val exchangeRate: java.math.BigDecimal? = null,

    /* The company the purchase order line item belongs to. */
    @field:JsonProperty("company")
    val company: java.util.UUID? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("description")
        val description: JsonNode?,

        @field:JsonProperty("unit_price")
        val unitPrice: JsonNode?,

        @field:JsonProperty("quantity")
        val quantity: JsonNode?,

        @field:JsonProperty("item")
        val item: JsonNode?,

        @field:JsonProperty("account")
        val account: JsonNode?,

        @field:JsonProperty("tracking_category")
        val trackingCategory: JsonNode?,

        @field:JsonProperty("tax_amount")
        val taxAmount: JsonNode?,

        @field:JsonProperty("total_line_amount")
        val totalLineAmount: JsonNode?,

        @field:JsonProperty("currency")
        val currency: JsonNode?,

        @field:JsonProperty("exchange_rate")
        val exchangeRate: JsonNode?,

        @field:JsonProperty("company")
        val company: JsonNode?,

        @field:JsonProperty("integration_params")
        val integrationParams: JsonNode?,

        @field:JsonProperty("linked_account_params")
        val linkedAccountParams: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: PurchaseOrderLineItemRequest.Expanded): PurchaseOrderLineItemRequest {
            return PurchaseOrderLineItemRequest(
                description = ApiClient.jsonConvertSafe(expanded.description),
                unitPrice = ApiClient.jsonConvertSafe(expanded.unitPrice),
                quantity = ApiClient.jsonConvertSafe(expanded.quantity),
                item = ApiClient.jsonConvertSafe(expanded.item),
                account = ApiClient.jsonConvertSafe(expanded.account),
                trackingCategory = ApiClient.jsonConvertSafe(expanded.trackingCategory),
                taxAmount = ApiClient.jsonConvertSafe(expanded.taxAmount),
                totalLineAmount = ApiClient.jsonConvertSafe(expanded.totalLineAmount),
                currency = ApiClient.jsonConvertSafe(expanded.currency),
                exchangeRate = ApiClient.jsonConvertSafe(expanded.exchangeRate),
                company = ApiClient.jsonConvertSafe(expanded.company),
                integrationParams = ApiClient.jsonConvertSafe(expanded.integrationParams),
                linkedAccountParams = ApiClient.jsonConvertSafe(expanded.linkedAccountParams)
            )
        }
    }
}

