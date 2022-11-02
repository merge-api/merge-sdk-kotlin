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

import dev.merge.client.ats.models.LinkedAccountConditionRequest

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param linkedAccountConditions The conditions belonging to a selective sync.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class LinkedAccountSelectiveSyncConfigurationRequest (

    /* The conditions belonging to a selective sync. */
    @field:JsonProperty("linked_account_conditions")
    val linkedAccountConditions: kotlin.collections.List<LinkedAccountConditionRequest>

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("linked_account_conditions")
        val linkedAccountConditions: kotlin.collections.List<JsonNode>

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: LinkedAccountSelectiveSyncConfigurationRequest.Expanded): LinkedAccountSelectiveSyncConfigurationRequest {
            return LinkedAccountSelectiveSyncConfigurationRequest(
                linkedAccountConditions = ApiClient.jsonConvertRequiredSafe(expanded.linkedAccountConditions)
            )
        }
    }
}

