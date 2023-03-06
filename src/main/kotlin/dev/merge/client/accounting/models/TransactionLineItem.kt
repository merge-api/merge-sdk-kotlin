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
 * # The TransactionLineItem Object ### Description The `TransactionLineItem` object is used to represent a transaction's line items.  ### Usage Example Fetch from the `GET TransactionLineItem` endpoint and view the transaction's line items.
 *
 * @param trackingCategories The line's associated tracking categories.
 * @param memo An internal note used by the business to clarify purpose of the transaction.
 * @param unitPrice The line item's unit price.
 * @param quantity The line item's quantity.
 * @param item 
 * @param account The line item's account.
 * @param trackingCategory The line's associated tracking category.
 * @param totalLineAmount The line item's total.
 * @param taxRate The line item's tax rate.
 * @param currency The line item's currency.
 * @param exchangeRate The line item's exchange rate.
 * @param company The company the line belongs to.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class TransactionLineItem (

    /* The line's associated tracking categories. */
    @field:JsonProperty("tracking_categories")
    val trackingCategories: kotlin.collections.List<java.util.UUID>,

    /* An internal note used by the business to clarify purpose of the transaction. */
    @field:JsonProperty("memo")
    val memo: kotlin.String? = null,

    /* The line item's unit price. */
    @field:JsonProperty("unit_price")
    val unitPrice: java.math.BigDecimal? = null,

    /* The line item's quantity. */
    @field:JsonProperty("quantity")
    val quantity: java.math.BigDecimal? = null,

    @field:JsonProperty("item")
    val item: java.util.UUID? = null,

    /* The line item's account. */
    @field:JsonProperty("account")
    val account: java.util.UUID? = null,

    /* The line's associated tracking category. */
    @field:JsonProperty("tracking_category")
    val trackingCategory: java.util.UUID? = null,

    /* The line item's total. */
    @field:JsonProperty("total_line_amount")
    val totalLineAmount: java.math.BigDecimal? = null,

    /* The line item's tax rate. */
    @field:JsonProperty("tax_rate")
    val taxRate: java.util.UUID? = null,

    /* The line item's currency. */
    @field:JsonProperty("currency")
    val currency: CurrencyEnum? = null,

    /* The line item's exchange rate. */
    @field:JsonProperty("exchange_rate")
    val exchangeRate: java.math.BigDecimal? = null,

    /* The company the line belongs to. */
    @field:JsonProperty("company")
    val company: java.util.UUID? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("tracking_categories")
        val trackingCategories: kotlin.collections.List<JsonNode>,

        @field:JsonProperty("memo")
        val memo: JsonNode?,

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

        @field:JsonProperty("total_line_amount")
        val totalLineAmount: JsonNode?,

        @field:JsonProperty("tax_rate")
        val taxRate: JsonNode?,

        @field:JsonProperty("currency")
        val currency: JsonNode?,

        @field:JsonProperty("exchange_rate")
        val exchangeRate: JsonNode?,

        @field:JsonProperty("company")
        val company: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: TransactionLineItem.Expanded): TransactionLineItem {
            return TransactionLineItem(
                trackingCategories = ApiClient.jsonConvertRequiredSafe(expanded.trackingCategories),
                memo = ApiClient.jsonConvertSafe(expanded.memo),
                unitPrice = ApiClient.jsonConvertSafe(expanded.unitPrice),
                quantity = ApiClient.jsonConvertSafe(expanded.quantity),
                item = ApiClient.jsonConvertSafe(expanded.item),
                account = ApiClient.jsonConvertSafe(expanded.account),
                trackingCategory = ApiClient.jsonConvertSafe(expanded.trackingCategory),
                totalLineAmount = ApiClient.jsonConvertSafe(expanded.totalLineAmount),
                taxRate = ApiClient.jsonConvertSafe(expanded.taxRate),
                currency = ApiClient.jsonConvertSafe(expanded.currency),
                exchangeRate = ApiClient.jsonConvertSafe(expanded.exchangeRate),
                company = ApiClient.jsonConvertSafe(expanded.company)
            )
        }
    }
}

