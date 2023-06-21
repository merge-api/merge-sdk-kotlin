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


import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param itemType 
 * @param itemFormat 
 * @param itemChoices 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class RemoteFieldClassForCustomObjectClassItemSchema (

    @field:JsonProperty("item_type")
    val itemType: kotlin.String?,

    @field:JsonProperty("item_format")
    val itemFormat: kotlin.String?,

    @field:JsonProperty("item_choices")
    val itemChoices: kotlin.collections.List<kotlin.String>?

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("item_type")
        val itemType: JsonNode,

        @field:JsonProperty("item_format")
        val itemFormat: JsonNode,

        @field:JsonProperty("item_choices")
        val itemChoices: kotlin.collections.List<JsonNode>

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: RemoteFieldClassForCustomObjectClassItemSchema.Expanded): RemoteFieldClassForCustomObjectClassItemSchema {
            return RemoteFieldClassForCustomObjectClassItemSchema(
                itemType = ApiClient.jsonConvertRequiredSafe(expanded.itemType),
                itemFormat = ApiClient.jsonConvertRequiredSafe(expanded.itemFormat),
                itemChoices = ApiClient.jsonConvertRequiredSafe(expanded.itemChoices)
            )
        }
    }
}

