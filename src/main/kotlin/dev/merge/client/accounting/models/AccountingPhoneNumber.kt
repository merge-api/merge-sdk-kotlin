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
 * # The AccountingPhoneNumber Object ### Description The `AccountingPhoneNumber` object is used to represent a contact's or company's phone number.  ### Usage Example Fetch from the `GET CompanyInfo` endpoint and view the company's phone numbers.
 *
 * @param number The phone number.
 * @param type The phone number's type.
 */

data class AccountingPhoneNumber (

    /* The phone number. */
    @field:JsonProperty("number")
    val number: kotlin.String? = null,

    /* The phone number's type. */
    @field:JsonProperty("type")
    val type: kotlin.String? = null

)
