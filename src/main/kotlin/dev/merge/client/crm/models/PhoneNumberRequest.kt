/**
 * Merge CRM API
 *
 * The unified API for building rich integrations with multiple CRM platforms.
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

package dev.merge.client.crm.models


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * # The PhoneNumber Object ### Description The `PhoneNumber` object is used to represent an entity's phone number. ### Usage Example Fetch from the `GET Contact` endpoint and view their phone numbers.
 *
 * @param phoneNumber The phone number.
 * @param phoneNumberType The phone number's type.
 */

data class PhoneNumberRequest (

    /* The phone number. */
    @field:JsonProperty("phone_number")
    val phoneNumber: kotlin.String? = null,

    /* The phone number's type. */
    @field:JsonProperty("phone_number_type")
    val phoneNumberType: kotlin.String? = null

)

