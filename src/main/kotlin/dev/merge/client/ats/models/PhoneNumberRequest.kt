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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The PhoneNumber Object ### Description The `PhoneNumber` object is used to represent a candidate's phone number. ### Usage Example Fetch from the `GET Candidate` endpoint and view their phone numbers.
 *
 * @param `value` The phone number.
 * @param phoneNumberType The type of phone number.  * `HOME` - HOME * `WORK` - WORK * `MOBILE` - MOBILE * `SKYPE` - SKYPE * `OTHER` - OTHER
 * @param integrationParams 
 * @param linkedAccountParams 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class PhoneNumberRequest (

    /* The phone number. */
    @field:JsonProperty("value")
    val `value`: kotlin.String? = null,

    /* The type of phone number.  * `HOME` - HOME * `WORK` - WORK * `MOBILE` - MOBILE * `SKYPE` - SKYPE * `OTHER` - OTHER */
    @field:JsonProperty("phone_number_type")
    val phoneNumberType: PhoneNumberTypeEnum? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("value")
        val `value`: JsonNode?,

        @field:JsonProperty("phone_number_type")
        val phoneNumberType: JsonNode?,

        @field:JsonProperty("integration_params")
        val integrationParams: JsonNode?,

        @field:JsonProperty("linked_account_params")
        val linkedAccountParams: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: PhoneNumberRequest.Expanded): PhoneNumberRequest {
            return PhoneNumberRequest(
                `value` = ApiClient.jsonConvertSafe(expanded.`value`),
                phoneNumberType = ApiClient.jsonConvertSafe(expanded.phoneNumberType),
                integrationParams = ApiClient.jsonConvertSafe(expanded.integrationParams),
                linkedAccountParams = ApiClient.jsonConvertSafe(expanded.linkedAccountParams)
            )
        }
    }
}

