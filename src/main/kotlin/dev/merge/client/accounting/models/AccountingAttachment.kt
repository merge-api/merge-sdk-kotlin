/**
 * Merge Accounting API
 *
 * The unified API for building rich integrations with multiple Accounting & Finance platforms.
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

package dev.merge.client.accounting.models

import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * # The Accounting Attachment Object ### Description The `AccountingAttachment` object is used to represent a company's attachments.  ### Usage Example Fetch from the `LIST AccountingAttachments` endpoint and view a company's attachments.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param remoteData 
 * @param fileName The attachment's name.
 * @param fileUrl The attachment's url.
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

data class AccountingAttachment (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* The attachment's name. */
    @field:JsonProperty("file_name")
    val fileName: kotlin.String? = null,

    /* The attachment's url. */
    @field:JsonProperty("file_url")
    val fileUrl: java.net.URI? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null

)

