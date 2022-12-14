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

import dev.merge.client.crm.models.AssociationSubType
import dev.merge.client.crm.models.CardinalityEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param remoteId The third-party API ID of the matching object.
 * @param id 
 * @param sourceObjectClass 
 * @param targetObjectClasses 
 * @param remoteKeyName 
 * @param displayName 
 * @param cardinality 
 * @param isRequired 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class AssociationType (

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    @field:JsonProperty("source_object_class")
    val sourceObjectClass: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("target_object_classes")
    val targetObjectClasses: kotlin.collections.List<AssociationSubType>? = null,

    @field:JsonProperty("remote_key_name")
    val remoteKeyName: kotlin.String? = null,

    @field:JsonProperty("display_name")
    val displayName: kotlin.String? = null,

    @field:JsonProperty("cardinality")
    val cardinality: CardinalityEnum? = null,

    @field:JsonProperty("is_required")
    val isRequired: kotlin.Boolean? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("source_object_class")
        val sourceObjectClass: JsonNode?,

        @field:JsonProperty("target_object_classes")
        val targetObjectClasses: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_key_name")
        val remoteKeyName: JsonNode?,

        @field:JsonProperty("display_name")
        val displayName: JsonNode?,

        @field:JsonProperty("cardinality")
        val cardinality: JsonNode?,

        @field:JsonProperty("is_required")
        val isRequired: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: AssociationType.Expanded): AssociationType {
            return AssociationType(
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                id = ApiClient.jsonConvertSafe(expanded.id),
                sourceObjectClass = ApiClient.jsonConvertSafe(expanded.sourceObjectClass),
                targetObjectClasses = ApiClient.jsonConvertSafe(expanded.targetObjectClasses),
                remoteKeyName = ApiClient.jsonConvertSafe(expanded.remoteKeyName),
                displayName = ApiClient.jsonConvertSafe(expanded.displayName),
                cardinality = ApiClient.jsonConvertSafe(expanded.cardinality),
                isRequired = ApiClient.jsonConvertSafe(expanded.isRequired)
            )
        }
    }
}

