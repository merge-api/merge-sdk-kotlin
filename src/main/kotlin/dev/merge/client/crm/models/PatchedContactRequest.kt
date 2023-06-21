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

import dev.merge.client.crm.models.AddressRequest
import dev.merge.client.crm.models.EmailAddressRequest
import dev.merge.client.crm.models.PhoneNumberRequest
import dev.merge.client.crm.models.RemoteFieldRequest

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Contact Object ### Description The `Contact` object is used to represent an existing point of contact at a company in a CRM system. ### Usage Example TODO
 *
 * @param firstName The contact's first name.
 * @param lastName The contact's last name.
 * @param account The contact's account.
 * @param addresses 
 * @param emailAddresses 
 * @param phoneNumbers 
 * @param lastActivityAt When the contact's last activity occurred.
 * @param integrationParams 
 * @param linkedAccountParams 
 * @param remoteFields 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class PatchedContactRequest (

    /* The contact's first name. */
    @field:JsonProperty("first_name")
    val firstName: kotlin.String? = null,

    /* The contact's last name. */
    @field:JsonProperty("last_name")
    val lastName: kotlin.String? = null,

    /* The contact's account. */
    @field:JsonProperty("account")
    val account: java.util.UUID? = null,

    @field:JsonProperty("addresses")
    val addresses: kotlin.collections.List<AddressRequest>? = null,

    @field:JsonProperty("email_addresses")
    val emailAddresses: kotlin.collections.List<EmailAddressRequest>? = null,

    @field:JsonProperty("phone_numbers")
    val phoneNumbers: kotlin.collections.List<PhoneNumberRequest>? = null,

    /* When the contact's last activity occurred. */
    @field:JsonProperty("last_activity_at")
    val lastActivityAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("remote_fields")
    val remoteFields: kotlin.collections.List<RemoteFieldRequest>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("first_name")
        val firstName: JsonNode?,

        @field:JsonProperty("last_name")
        val lastName: JsonNode?,

        @field:JsonProperty("account")
        val account: JsonNode?,

        @field:JsonProperty("addresses")
        val addresses: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("email_addresses")
        val emailAddresses: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("phone_numbers")
        val phoneNumbers: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("last_activity_at")
        val lastActivityAt: JsonNode?,

        @field:JsonProperty("integration_params")
        val integrationParams: JsonNode?,

        @field:JsonProperty("linked_account_params")
        val linkedAccountParams: JsonNode?,

        @field:JsonProperty("remote_fields")
        val remoteFields: kotlin.collections.List<JsonNode>?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: PatchedContactRequest.Expanded): PatchedContactRequest {
            return PatchedContactRequest(
                firstName = ApiClient.jsonConvertSafe(expanded.firstName),
                lastName = ApiClient.jsonConvertSafe(expanded.lastName),
                account = ApiClient.jsonConvertSafe(expanded.account),
                addresses = ApiClient.jsonConvertSafe(expanded.addresses),
                emailAddresses = ApiClient.jsonConvertSafe(expanded.emailAddresses),
                phoneNumbers = ApiClient.jsonConvertSafe(expanded.phoneNumbers),
                lastActivityAt = ApiClient.jsonConvertSafe(expanded.lastActivityAt),
                integrationParams = ApiClient.jsonConvertSafe(expanded.integrationParams),
                linkedAccountParams = ApiClient.jsonConvertSafe(expanded.linkedAccountParams),
                remoteFields = ApiClient.jsonConvertSafe(expanded.remoteFields)
            )
        }
    }
}

