/**
 * Merge ATS API
 *
 * The unified API for building rich integrations with multiple Applicant Tracking System platforms.
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

package dev.merge.client.ats.models

import dev.merge.client.ats.models.OfferStatusEnum
import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Offer Object ### Description The `Offer` object is used to represent an offer for an application. ### Usage Example Fetch from the `LIST Offers` endpoint and filter by `ID` to show all offers.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param application 
 * @param creator 
 * @param remoteCreatedAt When the third party's offer was created.
 * @param closedAt When the offer was closed.
 * @param sentAt When the offer was sent.
 * @param startDate The employment start date on the offer.
 * @param status The offer's status.
 * @param remoteData 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

data class Offer (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("application")
    val application: java.util.UUID? = null,

    @field:JsonProperty("creator")
    val creator: java.util.UUID? = null,

    /* When the third party's offer was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    /* When the offer was closed. */
    @field:JsonProperty("closed_at")
    val closedAt: java.time.OffsetDateTime? = null,

    /* When the offer was sent. */
    @field:JsonProperty("sent_at")
    val sentAt: java.time.OffsetDateTime? = null,

    /* The employment start date on the offer. */
    @field:JsonProperty("start_date")
    val startDate: java.time.OffsetDateTime? = null,

    /* The offer's status. */
    @field:JsonProperty("status")
    val status: OfferStatusEnum? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null

) {

    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("application")
        val application: JsonNode?,

        @field:JsonProperty("creator")
        val creator: JsonNode?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("closed_at")
        val closedAt: JsonNode?,

        @field:JsonProperty("sent_at")
        val sentAt: JsonNode?,

        @field:JsonProperty("start_date")
        val startDate: JsonNode?,

        @field:JsonProperty("status")
        val status: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Offer.Expanded): Offer {
            return Offer(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                application = ApiClient.jsonConvertSafe(expanded.application),
                creator = ApiClient.jsonConvertSafe(expanded.creator),
                remoteCreatedAt = ApiClient.jsonConvertSafe(expanded.remoteCreatedAt),
                closedAt = ApiClient.jsonConvertSafe(expanded.closedAt),
                sentAt = ApiClient.jsonConvertSafe(expanded.sentAt),
                startDate = ApiClient.jsonConvertSafe(expanded.startDate),
                status = ApiClient.jsonConvertSafe(expanded.status),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

