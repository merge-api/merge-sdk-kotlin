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

import dev.merge.client.ats.models.PatchedCandidateRequest

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param model 
 * @param remoteUserId 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class PatchedCandidateEndpointRequest (

    @field:JsonProperty("model")
    val model: PatchedCandidateRequest,

    @field:JsonProperty("remote_user_id")
    val remoteUserId: kotlin.String

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("model")
        val model: JsonNode,

        @field:JsonProperty("remote_user_id")
        val remoteUserId: JsonNode

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: PatchedCandidateEndpointRequest.Expanded): PatchedCandidateEndpointRequest {
            return PatchedCandidateEndpointRequest(
                model = ApiClient.jsonConvertRequiredSafe(expanded.model),
                remoteUserId = ApiClient.jsonConvertRequiredSafe(expanded.remoteUserId)
            )
        }
    }
}

