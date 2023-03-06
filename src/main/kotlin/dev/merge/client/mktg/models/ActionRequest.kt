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
 * @param type The action's type.
 * @param integrationParams 
 * @param linkedAccountParams 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class ActionRequest (

    /* The marketing emails sent by this action. */
    @field:JsonProperty("emails")
    val emails: kotlin.collections.List<java.util.UUID>,

    /* The messages sent by this action. */
    @field:JsonProperty("messages")
    val messages: kotlin.collections.List<java.util.UUID>,

    /* The action's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The action's type. */
    @field:JsonProperty("type")
    val type: TypeEnum? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

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

        @field:JsonProperty("integration_params")
        val integrationParams: JsonNode?,

        @field:JsonProperty("linked_account_params")
        val linkedAccountParams: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: ActionRequest.Expanded): ActionRequest {
            return ActionRequest(
                emails = ApiClient.jsonConvertRequiredSafe(expanded.emails),
                messages = ApiClient.jsonConvertRequiredSafe(expanded.messages),
                name = ApiClient.jsonConvertSafe(expanded.name),
                type = ApiClient.jsonConvertSafe(expanded.type),
                integrationParams = ApiClient.jsonConvertSafe(expanded.integrationParams),
                linkedAccountParams = ApiClient.jsonConvertSafe(expanded.linkedAccountParams)
            )
        }
    }
}

