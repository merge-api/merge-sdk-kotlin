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


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * # The Note Object ### Description The `Note` object is used to represent a note in the remote system. ### Usage Example TODO
 *
 * @param remoteId The third-party API ID of the matching object.
 * @param owner 
 * @param content The note's content.
 * @param contact 
 * @param account 
 * @param opportunity 
 * @param remoteUpdatedAt When the third party's lead was updated.
 * @param remoteCreatedAt When the third party's lead was created.
 * @param integrationParams 
 * @param linkedAccountParams 
 */

data class NoteRequest (

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("owner")
    val owner: java.util.UUID? = null,

    /* The note's content. */
    @field:JsonProperty("content")
    val content: kotlin.String? = null,

    @field:JsonProperty("contact")
    val contact: java.util.UUID? = null,

    @field:JsonProperty("account")
    val account: java.util.UUID? = null,

    @field:JsonProperty("opportunity")
    val opportunity: java.util.UUID? = null,

    /* When the third party's lead was updated. */
    @field:JsonProperty("remote_updated_at")
    val remoteUpdatedAt: java.time.OffsetDateTime? = null,

    /* When the third party's lead was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

)

