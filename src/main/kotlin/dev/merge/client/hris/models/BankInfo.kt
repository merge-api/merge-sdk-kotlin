/**
 * Merge HRIS API
 *
 * The unified API for building rich integrations with multiple HR Information System platforms.
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

package dev.merge.client.hris.models

import dev.merge.client.hris.models.AccountTypeEnum
import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The BankInfo Object ### Description The `BankInfo` object is used to represent the Bank Account information for an Employee. This is often referenced with an Employee object.  ### Usage Example Fetch from the `LIST BankInfo` endpoint and filter by `ID` to show all bank information.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param employee The employee with this bank account.
 * @param accountNumber The account number.
 * @param routingNumber The routing number.
 * @param bankName The bank name.
 * @param accountType The bank account type
 * @param remoteCreatedAt When the matching bank object was created in the third party system.
 * @param remoteData 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 * @param fieldMappings 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class BankInfo (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The employee with this bank account. */
    @field:JsonProperty("employee")
    val employee: java.util.UUID? = null,

    /* The account number. */
    @field:JsonProperty("account_number")
    val accountNumber: kotlin.String? = null,

    /* The routing number. */
    @field:JsonProperty("routing_number")
    val routingNumber: kotlin.String? = null,

    /* The bank name. */
    @field:JsonProperty("bank_name")
    val bankName: kotlin.String? = null,

    /* The bank account type */
    @field:JsonProperty("account_type")
    val accountType: AccountTypeEnum? = null,

    /* When the matching bank object was created in the third party system. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null,

    @field:JsonProperty("field_mappings")
    val fieldMappings: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("employee")
        val employee: JsonNode?,

        @field:JsonProperty("account_number")
        val accountNumber: JsonNode?,

        @field:JsonProperty("routing_number")
        val routingNumber: JsonNode?,

        @field:JsonProperty("bank_name")
        val bankName: JsonNode?,

        @field:JsonProperty("account_type")
        val accountType: JsonNode?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?,

        @field:JsonProperty("field_mappings")
        val fieldMappings: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: BankInfo.Expanded): BankInfo {
            return BankInfo(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                employee = ApiClient.jsonConvertSafe(expanded.employee),
                accountNumber = ApiClient.jsonConvertSafe(expanded.accountNumber),
                routingNumber = ApiClient.jsonConvertSafe(expanded.routingNumber),
                bankName = ApiClient.jsonConvertSafe(expanded.bankName),
                accountType = ApiClient.jsonConvertSafe(expanded.accountType),
                remoteCreatedAt = ApiClient.jsonConvertSafe(expanded.remoteCreatedAt),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted),
                fieldMappings = ApiClient.jsonConvertSafe(expanded.fieldMappings)
            )
        }
    }
}

