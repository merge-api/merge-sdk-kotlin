/**
 * Merge ATS API
 *
 * The unified API for building rich integrations with multiple Applicant Tracking System platforms.
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

package dev.merge.client.ats.models

import dev.merge.client.ats.models.PhoneNumberTypeEnum

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * # The PhoneNumber Object ### Description The `PhoneNumber` object is used to represent a candidate's phone number. ### Usage Example Fetch from the `GET Candidate` endpoint and view their phone numbers.
 *
 * @param `value` The phone number.
 * @param phoneNumberType The type of phone number.
 */

data class PhoneNumber (

    /* The phone number. */
    @field:JsonProperty("value")
    val `value`: kotlin.String? = null,

    /* The type of phone number. */
    @field:JsonProperty("phone_number_type")
    val phoneNumberType: PhoneNumberTypeEnum? = null

)
