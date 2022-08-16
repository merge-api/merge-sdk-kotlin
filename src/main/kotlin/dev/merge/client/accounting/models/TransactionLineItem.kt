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


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param memo A memo attached to the line item.
 * @param unitPrice The line item's unit price.
 * @param quantity The line item's quantity.
 * @param item 
 * @param account The line item's account.
 * @param trackingCategory The line's associated tracking category.
 * @param totalLineAmount The line item's total.
 * @param taxRate The line item's tax rate.
 * @param remoteId The third-party API ID of the matching object.
 */

data class TransactionLineItem (

    /* A memo attached to the line item. */
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

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null

)
