/**
 * Merge Marketing Automation API
 *
 * The unified API for building rich integrations with multiple Marketing Automation platforms.
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

package dev.merge.client.mktg.models


import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param linkedAccountStatus 
 * @param canMakeRequest 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class LinkedAccountStatus (

    @field:JsonProperty("linked_account_status")
    val linkedAccountStatus: kotlin.String,

    @field:JsonProperty("can_make_request")
    val canMakeRequest: kotlin.Boolean

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("linked_account_status")
        val linkedAccountStatus: JsonNode,

        @field:JsonProperty("can_make_request")
        val canMakeRequest: JsonNode

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: LinkedAccountStatus.Expanded): LinkedAccountStatus {
            return LinkedAccountStatus(
                linkedAccountStatus = ApiClient.jsonConvertRequiredSafe(expanded.linkedAccountStatus),
                canMakeRequest = ApiClient.jsonConvertRequiredSafe(expanded.canMakeRequest)
            )
        }
    }
}
