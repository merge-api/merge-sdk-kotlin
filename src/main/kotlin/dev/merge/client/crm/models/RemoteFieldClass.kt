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

import dev.merge.client.crm.models.ItemFormatEnum
import dev.merge.client.crm.models.ItemTypeEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param displayName 
 * @param remoteKeyName 
 * @param isRequired 
 * @param isNestedList 
 * @param itemType 
 * @param itemFormat 
 * @param itemChoices 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class RemoteFieldClass (

    @field:JsonProperty("display_name")
    val displayName: kotlin.String? = null,

    @field:JsonProperty("remote_key_name")
    val remoteKeyName: kotlin.String? = null,

    @field:JsonProperty("is_required")
    val isRequired: kotlin.Boolean? = null,

    @field:JsonProperty("is_nested_list")
    val isNestedList: kotlin.Boolean? = null,

    @field:JsonProperty("item_type")
    val itemType: ItemTypeEnum? = null,

    @field:JsonProperty("item_format")
    val itemFormat: ItemFormatEnum? = null,

    @field:JsonProperty("item_choices")
    val itemChoices: kotlin.collections.List<kotlin.String>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("display_name")
        val displayName: JsonNode?,

        @field:JsonProperty("remote_key_name")
        val remoteKeyName: JsonNode?,

        @field:JsonProperty("is_required")
        val isRequired: JsonNode?,

        @field:JsonProperty("is_nested_list")
        val isNestedList: JsonNode?,

        @field:JsonProperty("item_type")
        val itemType: JsonNode?,

        @field:JsonProperty("item_format")
        val itemFormat: JsonNode?,

        @field:JsonProperty("item_choices")
        val itemChoices: kotlin.collections.List<JsonNode>?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: RemoteFieldClass.Expanded): RemoteFieldClass {
            return RemoteFieldClass(
                displayName = ApiClient.jsonConvertSafe(expanded.displayName),
                remoteKeyName = ApiClient.jsonConvertSafe(expanded.remoteKeyName),
                isRequired = ApiClient.jsonConvertSafe(expanded.isRequired),
                isNestedList = ApiClient.jsonConvertSafe(expanded.isNestedList),
                itemType = ApiClient.jsonConvertSafe(expanded.itemType),
                itemFormat = ApiClient.jsonConvertSafe(expanded.itemFormat),
                itemChoices = ApiClient.jsonConvertSafe(expanded.itemChoices)
            )
        }
    }
}
