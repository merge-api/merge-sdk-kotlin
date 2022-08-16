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

import dev.merge.client.ats.models.AccessRoleEnum
import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * # The RemoteUser Object ### Description The `RemoteUser` object is used to represent a third party user. ### Usage Example Fetch from the `LIST RemoteUsers` endpoint to show all users for a third party.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param firstName The user's first name.
 * @param lastName The user's last name.
 * @param email The user's email.
 * @param disabled Whether the user's account had been disabled.
 * @param remoteCreatedAt When the third party's user was created.
 * @param accessRole The user's role.
 * @param remoteData 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

data class RemoteUser (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The user's first name. */
    @field:JsonProperty("first_name")
    val firstName: kotlin.String? = null,

    /* The user's last name. */
    @field:JsonProperty("last_name")
    val lastName: kotlin.String? = null,

    /* The user's email. */
    @field:JsonProperty("email")
    val email: kotlin.String? = null,

    /* Whether the user's account had been disabled. */
    @field:JsonProperty("disabled")
    val disabled: kotlin.Boolean? = null,

    /* When the third party's user was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    /* The user's role. */
    @field:JsonProperty("access_role")
    val accessRole: AccessRoleEnum? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null

)
