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

import dev.merge.client.mktg.models.TypeEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Action Object ### Description The `Action` object is used to represent an action executed within an automation. ### Usage Example Fetch from the `GET /api/mktg/v1/actions` endpoint and view their types.
 *
 * @param emails The marketing emails sent by this action.
 * @param messages The messages sent by this action.
 * @param name The action's name.
 * @param type The action's type.  * `EMAIL` - EMAIL * `MESSAGE` - MESSAGE
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param modifiedAt This is the datetime that this object was last updated by Merge
 * @param fieldMappings 
 * @param remoteData 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Action (

    /* The marketing emails sent by this action. */
    @field:JsonProperty("emails")
    val emails: kotlin.collections.List<java.util.UUID>,

    /* The messages sent by this action. */
    @field:JsonProperty("messages")
    val messages: kotlin.collections.List<java.util.UUID>,

    /* The action's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The action's type.  * `EMAIL` - EMAIL * `MESSAGE` - MESSAGE */
    @field:JsonProperty("type")
    val type: TypeEnum? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null,

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* This is the datetime that this object was last updated by Merge */
    @field:JsonProperty("modified_at")
    val modifiedAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("field_mappings")
    val fieldMappings: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("emails")
        val emails: kotlin.collections.List<JsonNode>,

        @field:JsonProperty("messages")
        val messages: kotlin.collections.List<JsonNode>,

        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("type")
        val type: JsonNode?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?,

        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("modified_at")
        val modifiedAt: JsonNode?,

        @field:JsonProperty("field_mappings")
        val fieldMappings: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Action.Expanded): Action {
            return Action(
                emails = ApiClient.jsonConvertRequiredSafe(expanded.emails),
                messages = ApiClient.jsonConvertRequiredSafe(expanded.messages),
                name = ApiClient.jsonConvertSafe(expanded.name),
                type = ApiClient.jsonConvertSafe(expanded.type),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted),
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                modifiedAt = ApiClient.jsonConvertSafe(expanded.modifiedAt),
                fieldMappings = ApiClient.jsonConvertSafe(expanded.fieldMappings),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData)
            )
        }
    }
}

