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
import dev.merge.client.accounting.models.PurchaseOrderStatusEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The PurchaseOrder Object ### Description The `PurchaseOrder` object is used to represent a company's purchase orders.  ### Usage Example Fetch from the `LIST PurchaseOrders` endpoint and view a company's purchase orders.
 *
 * @param remoteId The third-party API ID of the matching object.
 * @param status The purchase order's status.
 * @param issueDate The purchase order's issue date.
 * @param deliveryDate The purchase order's delivery date.
 * @param deliveryAddress The purchase order's delivery address.
 * @param customer The purchase order's customer.
 * @param vendor The purchase_order's vendor.
 * @param memo A memo attached to the purchase order.
 * @param totalAmount The purchase order's total amount.
 * @param currency The purchase order's currency.
 * @param exchangeRate The purchase order's exchange rate.
 * @param remoteCreatedAt When the third party's purchase order note was created.
 * @param remoteUpdatedAt When the third party's purchase order note was updated.
 * @param integrationParams 
 * @param linkedAccountParams 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class PurchaseOrderRequest (

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The purchase order's status. */
    @field:JsonProperty("status")
    val status: PurchaseOrderStatusEnum? = null,

    /* The purchase order's issue date. */
    @field:JsonProperty("issue_date")
    val issueDate: java.time.OffsetDateTime? = null,

    /* The purchase order's delivery date. */
    @field:JsonProperty("delivery_date")
    val deliveryDate: java.time.OffsetDateTime? = null,

    /* The purchase order's delivery address. */
    @field:JsonProperty("delivery_address")
    val deliveryAddress: java.util.UUID? = null,

    /* The purchase order's customer. */
    @field:JsonProperty("customer")
    val customer: java.util.UUID? = null,

    /* The purchase_order's vendor. */
    @field:JsonProperty("vendor")
    val vendor: java.util.UUID? = null,

    /* A memo attached to the purchase order. */
    @field:JsonProperty("memo")
    val memo: kotlin.String? = null,

    /* The purchase order's total amount. */
    @field:JsonProperty("total_amount")
    val totalAmount: kotlin.Float? = null,

    /* The purchase order's currency. */
    @field:JsonProperty("currency")
    val currency: CurrencyEnum? = null,

    /* The purchase order's exchange rate. */
    @field:JsonProperty("exchange_rate")
    val exchangeRate: java.math.BigDecimal? = null,

    /* When the third party's purchase order note was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    /* When the third party's purchase order note was updated. */
    @field:JsonProperty("remote_updated_at")
    val remoteUpdatedAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("status")
        val status: JsonNode?,

        @field:JsonProperty("issue_date")
        val issueDate: JsonNode?,

        @field:JsonProperty("delivery_date")
        val deliveryDate: JsonNode?,

        @field:JsonProperty("delivery_address")
        val deliveryAddress: JsonNode?,

        @field:JsonProperty("customer")
        val customer: JsonNode?,

        @field:JsonProperty("vendor")
        val vendor: JsonNode?,

        @field:JsonProperty("memo")
        val memo: JsonNode?,

        @field:JsonProperty("total_amount")
        val totalAmount: JsonNode?,

        @field:JsonProperty("currency")
        val currency: JsonNode?,

        @field:JsonProperty("exchange_rate")
        val exchangeRate: JsonNode?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("remote_updated_at")
        val remoteUpdatedAt: JsonNode?,

        @field:JsonProperty("integration_params")
        val integrationParams: JsonNode?,

        @field:JsonProperty("linked_account_params")
        val linkedAccountParams: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: PurchaseOrderRequest.Expanded): PurchaseOrderRequest {
            return PurchaseOrderRequest(
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                status = ApiClient.jsonConvertSafe(expanded.status),
                issueDate = ApiClient.jsonConvertSafe(expanded.issueDate),
                deliveryDate = ApiClient.jsonConvertSafe(expanded.deliveryDate),
                deliveryAddress = ApiClient.jsonConvertSafe(expanded.deliveryAddress),
                customer = ApiClient.jsonConvertSafe(expanded.customer),
                vendor = ApiClient.jsonConvertSafe(expanded.vendor),
                memo = ApiClient.jsonConvertSafe(expanded.memo),
                totalAmount = ApiClient.jsonConvertSafe(expanded.totalAmount),
                currency = ApiClient.jsonConvertSafe(expanded.currency),
                exchangeRate = ApiClient.jsonConvertSafe(expanded.exchangeRate),
                remoteCreatedAt = ApiClient.jsonConvertSafe(expanded.remoteCreatedAt),
                remoteUpdatedAt = ApiClient.jsonConvertSafe(expanded.remoteUpdatedAt),
                integrationParams = ApiClient.jsonConvertSafe(expanded.integrationParams),
                linkedAccountParams = ApiClient.jsonConvertSafe(expanded.linkedAccountParams)
            )
        }
    }
}
