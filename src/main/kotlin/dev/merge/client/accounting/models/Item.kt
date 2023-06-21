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

import dev.merge.client.shared.RemoteData
import dev.merge.client.accounting.models.Status7d1Enum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Item Object ### Description The `Item` object refers to the goods involved in a transaction.  ### Usage Example Fetch from the `LIST Items` endpoint and view a company's items.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param name The item's name.
 * @param status The item's status.  * `ACTIVE` - ACTIVE * `ARCHIVED` - ARCHIVED
 * @param unitPrice The item's unit price.
 * @param purchasePrice The price at which the item is purchased from a vendor.
 * @param purchaseAccount References the default account used to record a purchase of the item.
 * @param salesAccount References the default account used to record a sale.
 * @param company The company the item belongs to.
 * @param remoteUpdatedAt When the third party's item note was updated.
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 * @param modifiedAt This is the datetime that this object was last updated by Merge
 * @param fieldMappings 
 * @param remoteData 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Item (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The item's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The item's status.  * `ACTIVE` - ACTIVE * `ARCHIVED` - ARCHIVED */
    @field:JsonProperty("status")
    val status: Status7d1Enum? = null,

    /* The item's unit price. */
    @field:JsonProperty("unit_price")
    val unitPrice: kotlin.Double? = null,

    /* The price at which the item is purchased from a vendor. */
    @field:JsonProperty("purchase_price")
    val purchasePrice: kotlin.Double? = null,

    /* References the default account used to record a purchase of the item. */
    @field:JsonProperty("purchase_account")
    val purchaseAccount: java.util.UUID? = null,

    /* References the default account used to record a sale. */
    @field:JsonProperty("sales_account")
    val salesAccount: java.util.UUID? = null,

    /* The company the item belongs to. */
    @field:JsonProperty("company")
    val company: java.util.UUID? = null,

    /* When the third party's item note was updated. */
    @field:JsonProperty("remote_updated_at")
    val remoteUpdatedAt: java.time.OffsetDateTime? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null,

    /* This is the datetime that this object was last updated by Merge */
    @field:JsonProperty("modified_at")
    val modifiedAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("field_mappings")
    val fieldMappings: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("status")
        val status: JsonNode?,

        @field:JsonProperty("unit_price")
        val unitPrice: JsonNode?,

        @field:JsonProperty("purchase_price")
        val purchasePrice: JsonNode?,

        @field:JsonProperty("purchase_account")
        val purchaseAccount: JsonNode?,

        @field:JsonProperty("sales_account")
        val salesAccount: JsonNode?,

        @field:JsonProperty("company")
        val company: JsonNode?,

        @field:JsonProperty("remote_updated_at")
        val remoteUpdatedAt: JsonNode?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?,

        @field:JsonProperty("modified_at")
        val modifiedAt: JsonNode?,

        @field:JsonProperty("field_mappings")
        val fieldMappings: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Item.Expanded): Item {
            return Item(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                name = ApiClient.jsonConvertSafe(expanded.name),
                status = ApiClient.jsonConvertSafe(expanded.status),
                unitPrice = ApiClient.jsonConvertSafe(expanded.unitPrice),
                purchasePrice = ApiClient.jsonConvertSafe(expanded.purchasePrice),
                purchaseAccount = ApiClient.jsonConvertSafe(expanded.purchaseAccount),
                salesAccount = ApiClient.jsonConvertSafe(expanded.salesAccount),
                company = ApiClient.jsonConvertSafe(expanded.company),
                remoteUpdatedAt = ApiClient.jsonConvertSafe(expanded.remoteUpdatedAt),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted),
                modifiedAt = ApiClient.jsonConvertSafe(expanded.modifiedAt),
                fieldMappings = ApiClient.jsonConvertSafe(expanded.fieldMappings),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData)
            )
        }
    }
}

