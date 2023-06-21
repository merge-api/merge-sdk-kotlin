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

import dev.merge.client.crm.models.RemoteField

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The CustomObject Object ### Description The `Custom Object` record refers to an instance of a Custom Object Class. ### Usage Example TODO
 *
 * @param objectClass 
 * @param fields 
 * @param remoteId The third-party API ID of the matching object.
 * @param id 
 * @param modifiedAt This is the datetime that this object was last updated by Merge
 * @param remoteFields 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class CustomObject (

    @field:JsonProperty("object_class")
    val objectClass: java.util.UUID? = null,

    @field:JsonProperty("fields")
    val fields: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* This is the datetime that this object was last updated by Merge */
    @field:JsonProperty("modified_at")
    val modifiedAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("remote_fields")
    val remoteFields: kotlin.collections.List<RemoteField>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("object_class")
        val objectClass: JsonNode?,

        @field:JsonProperty("fields")
        val fields: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("modified_at")
        val modifiedAt: JsonNode?,

        @field:JsonProperty("remote_fields")
        val remoteFields: kotlin.collections.List<JsonNode>?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: CustomObject.Expanded): CustomObject {
            return CustomObject(
                objectClass = ApiClient.jsonConvertSafe(expanded.objectClass),
                fields = ApiClient.jsonConvertSafe(expanded.fields),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                id = ApiClient.jsonConvertSafe(expanded.id),
                modifiedAt = ApiClient.jsonConvertSafe(expanded.modifiedAt),
                remoteFields = ApiClient.jsonConvertSafe(expanded.remoteFields)
            )
        }
    }
}

