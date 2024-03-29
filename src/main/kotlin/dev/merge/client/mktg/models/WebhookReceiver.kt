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
 * @param event 
 * @param isActive 
 * @param key 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class WebhookReceiver (

    @field:JsonProperty("event")
    val event: kotlin.String,

    @field:JsonProperty("is_active")
    val isActive: kotlin.Boolean,

    @field:JsonProperty("key")
    val key: kotlin.String? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("event")
        val event: JsonNode,

        @field:JsonProperty("is_active")
        val isActive: JsonNode,

        @field:JsonProperty("key")
        val key: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: WebhookReceiver.Expanded): WebhookReceiver {
            return WebhookReceiver(
                event = ApiClient.jsonConvertRequiredSafe(expanded.event),
                isActive = ApiClient.jsonConvertRequiredSafe(expanded.isActive),
                key = ApiClient.jsonConvertSafe(expanded.key)
            )
        }
    }
}

