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

import dev.merge.client.mktg.models.CampaignRequest

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param model 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class MKTGCampaignEndpointRequest (

    @field:JsonProperty("model")
    val model: CampaignRequest

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("model")
        val model: JsonNode

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: MKTGCampaignEndpointRequest.Expanded): MKTGCampaignEndpointRequest {
            return MKTGCampaignEndpointRequest(
                model = ApiClient.jsonConvertRequiredSafe(expanded.model)
            )
        }
    }
}

