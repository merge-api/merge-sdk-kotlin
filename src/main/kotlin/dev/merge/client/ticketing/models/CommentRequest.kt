/**
 * Merge Ticketing API
 *
 * The unified API for building rich integrations with multiple Ticketing platforms.
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

package dev.merge.client.ticketing.models


import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Comment Object ### Description The `Comment` object is used to represent a comment on a ticket.  ### Usage Example TODO
 *
 * @param user The author of the Comment, if the author is a User.
 * @param contact The author of the Comment, if the author is a Contact.
 * @param body The comment's text body.
 * @param htmlBody The comment's text body formatted as html.
 * @param ticket The ticket associated with the comment. 
 * @param isPrivate Whether or not the comment is internal.
 * @param integrationParams 
 * @param linkedAccountParams 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class CommentRequest (

    /* The author of the Comment, if the author is a User. */
    @field:JsonProperty("user")
    val user: java.util.UUID? = null,

    /* The author of the Comment, if the author is a Contact. */
    @field:JsonProperty("contact")
    val contact: java.util.UUID? = null,

    /* The comment's text body. */
    @field:JsonProperty("body")
    val body: kotlin.String? = null,

    /* The comment's text body formatted as html. */
    @field:JsonProperty("html_body")
    val htmlBody: kotlin.String? = null,

    /* The ticket associated with the comment.  */
    @field:JsonProperty("ticket")
    val ticket: java.util.UUID? = null,

    /* Whether or not the comment is internal. */
    @field:JsonProperty("is_private")
    val isPrivate: kotlin.Boolean? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("user")
        val user: JsonNode?,

        @field:JsonProperty("contact")
        val contact: JsonNode?,

        @field:JsonProperty("body")
        val body: JsonNode?,

        @field:JsonProperty("html_body")
        val htmlBody: JsonNode?,

        @field:JsonProperty("ticket")
        val ticket: JsonNode?,

        @field:JsonProperty("is_private")
        val isPrivate: JsonNode?,

        @field:JsonProperty("integration_params")
        val integrationParams: JsonNode?,

        @field:JsonProperty("linked_account_params")
        val linkedAccountParams: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: CommentRequest.Expanded): CommentRequest {
            return CommentRequest(
                user = ApiClient.jsonConvertSafe(expanded.user),
                contact = ApiClient.jsonConvertSafe(expanded.contact),
                body = ApiClient.jsonConvertSafe(expanded.body),
                htmlBody = ApiClient.jsonConvertSafe(expanded.htmlBody),
                ticket = ApiClient.jsonConvertSafe(expanded.ticket),
                isPrivate = ApiClient.jsonConvertSafe(expanded.isPrivate),
                integrationParams = ApiClient.jsonConvertSafe(expanded.integrationParams),
                linkedAccountParams = ApiClient.jsonConvertSafe(expanded.linkedAccountParams)
            )
        }
    }
}

