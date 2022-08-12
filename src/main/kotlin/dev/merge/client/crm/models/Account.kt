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

import dev.merge.client.crm.models.Address
import dev.merge.client.crm.models.PhoneNumber
import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * # The Account Object ### Description The `Account` object is used to represent an account in the remote system. ### Usage Example TODO
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param owner 
 * @param name The account's name.
 * @param description The account's description.
 * @param industry The account's industry.
 * @param website The account's website.
 * @param numberOfEmployees The account's number of employees.
 * @param addresses 
 * @param phoneNumbers 
 * @param lastActivityAt When the account's last activity  occurred.
 * @param remoteUpdatedAt When the third party's account was updated.
 * @param remoteCreatedAt When the third party's account was created.
 * @param remoteData 
 * @param remoteWasDeleted 
 */

data class Account (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("owner")
    val owner: java.util.UUID? = null,

    /* The account's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The account's description. */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    /* The account's industry. */
    @field:JsonProperty("industry")
    val industry: kotlin.String? = null,

    /* The account's website. */
    @field:JsonProperty("website")
    val website: java.net.URI? = null,

    /* The account's number of employees. */
    @field:JsonProperty("number_of_employees")
    val numberOfEmployees: kotlin.Int? = null,

    @field:JsonProperty("addresses")
    val addresses: kotlin.collections.List<Address>? = null,

    @field:JsonProperty("phone_numbers")
    val phoneNumbers: kotlin.collections.List<PhoneNumber>? = null,

    /* When the account's last activity  occurred. */
    @field:JsonProperty("last_activity_at")
    val lastActivityAt: java.time.OffsetDateTime? = null,

    /* When the third party's account was updated. */
    @field:JsonProperty("remote_updated_at")
    val remoteUpdatedAt: java.time.OffsetDateTime? = null,

    /* When the third party's account was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null

)

