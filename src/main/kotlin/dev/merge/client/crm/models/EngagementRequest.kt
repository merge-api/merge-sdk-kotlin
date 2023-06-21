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

import dev.merge.client.crm.models.DirectionEnum
import dev.merge.client.crm.models.RemoteFieldRequest

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Engagement Object ### Description The `Engagement` object is used to represent an interaction noted in a CRM system. ### Usage Example TODO
 *
 * @param owner The engagement's owner.
 * @param content The engagement's content.
 * @param subject The engagement's subject.
 * @param direction The engagement's direction.  * `INBOUND` - INBOUND * `OUTBOUND` - OUTBOUND
 * @param engagementType The engagement type of the engagement.
 * @param startTime The time at which the engagement started.
 * @param endTime The time at which the engagement ended.
 * @param account The account of the engagement.
 * @param contacts 
 * @param integrationParams 
 * @param linkedAccountParams 
 * @param remoteFields 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class EngagementRequest (

    /* The engagement's owner. */
    @field:JsonProperty("owner")
    val owner: java.util.UUID? = null,

    /* The engagement's content. */
    @field:JsonProperty("content")
    val content: kotlin.String? = null,

    /* The engagement's subject. */
    @field:JsonProperty("subject")
    val subject: kotlin.String? = null,

    /* The engagement's direction.  * `INBOUND` - INBOUND * `OUTBOUND` - OUTBOUND */
    @field:JsonProperty("direction")
    val direction: DirectionEnum? = null,

    /* The engagement type of the engagement. */
    @field:JsonProperty("engagement_type")
    val engagementType: java.util.UUID? = null,

    /* The time at which the engagement started. */
    @field:JsonProperty("start_time")
    val startTime: java.time.OffsetDateTime? = null,

    /* The time at which the engagement ended. */
    @field:JsonProperty("end_time")
    val endTime: java.time.OffsetDateTime? = null,

    /* The account of the engagement. */
    @field:JsonProperty("account")
    val account: java.util.UUID? = null,

    @field:JsonProperty("contacts")
    val contacts: kotlin.collections.List<java.util.UUID>? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("remote_fields")
    val remoteFields: kotlin.collections.List<RemoteFieldRequest>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("owner")
        val owner: JsonNode?,

        @field:JsonProperty("content")
        val content: JsonNode?,

        @field:JsonProperty("subject")
        val subject: JsonNode?,

        @field:JsonProperty("direction")
        val direction: JsonNode?,

        @field:JsonProperty("engagement_type")
        val engagementType: JsonNode?,

        @field:JsonProperty("start_time")
        val startTime: JsonNode?,

        @field:JsonProperty("end_time")
        val endTime: JsonNode?,

        @field:JsonProperty("account")
        val account: JsonNode?,

        @field:JsonProperty("contacts")
        val contacts: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("integration_params")
        val integrationParams: JsonNode?,

        @field:JsonProperty("linked_account_params")
        val linkedAccountParams: JsonNode?,

        @field:JsonProperty("remote_fields")
        val remoteFields: kotlin.collections.List<JsonNode>?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: EngagementRequest.Expanded): EngagementRequest {
            return EngagementRequest(
                owner = ApiClient.jsonConvertSafe(expanded.owner),
                content = ApiClient.jsonConvertSafe(expanded.content),
                subject = ApiClient.jsonConvertSafe(expanded.subject),
                direction = ApiClient.jsonConvertSafe(expanded.direction),
                engagementType = ApiClient.jsonConvertSafe(expanded.engagementType),
                startTime = ApiClient.jsonConvertSafe(expanded.startTime),
                endTime = ApiClient.jsonConvertSafe(expanded.endTime),
                account = ApiClient.jsonConvertSafe(expanded.account),
                contacts = ApiClient.jsonConvertSafe(expanded.contacts),
                integrationParams = ApiClient.jsonConvertSafe(expanded.integrationParams),
                linkedAccountParams = ApiClient.jsonConvertSafe(expanded.linkedAccountParams),
                remoteFields = ApiClient.jsonConvertSafe(expanded.remoteFields)
            )
        }
    }
}

