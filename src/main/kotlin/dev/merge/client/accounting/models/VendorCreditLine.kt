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
 * # The VendorCreditLine Object ### Description The `VendorCreditLine` object is used to represent a vendor credit's line items.  ### Usage Example Fetch from the `GET VendorCredit` endpoint and view the vendor credit's line items.
 *
 * @param remoteId The third-party API ID of the matching object.
 * @param netAmount The line's net amount.
 * @param trackingCategory The line's associated tracking category.
 * @param description The line's description.
 * @param account The line's account.
 */

data class VendorCreditLine (

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The line's net amount. */
    @field:JsonProperty("net_amount")
    val netAmount: kotlin.Float? = null,

    /* The line's associated tracking category. */
    @field:JsonProperty("tracking_category")
    val trackingCategory: java.util.UUID? = null,

    /* The line's description. */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    /* The line's account. */
    @field:JsonProperty("account")
    val account: java.util.UUID? = null

)

