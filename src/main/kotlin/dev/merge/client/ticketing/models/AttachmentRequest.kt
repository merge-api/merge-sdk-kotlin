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


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * # The Attachment Object ### Description The `Attachment` object is used to represent an attachment for a ticket.  ### Usage Example TODO
 *
 * @param remoteId The third-party API ID of the matching object.
 * @param fileName The attachment's name.
 * @param ticket 
 * @param fileUrl The attachment's url.
 * @param contentType The attachment's file format.
 * @param uploadedBy 
 * @param remoteCreatedAt When the third party's attachment was created.
 */

data class AttachmentRequest (

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The attachment's name. */
    @field:JsonProperty("file_name")
    val fileName: kotlin.String? = null,

    @field:JsonProperty("ticket")
    val ticket: java.util.UUID? = null,

    /* The attachment's url. */
    @field:JsonProperty("file_url")
    val fileUrl: kotlin.String? = null,

    /* The attachment's file format. */
    @field:JsonProperty("content_type")
    val contentType: kotlin.String? = null,

    @field:JsonProperty("uploaded_by")
    val uploadedBy: java.util.UUID? = null,

    /* When the third party's attachment was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null

)

