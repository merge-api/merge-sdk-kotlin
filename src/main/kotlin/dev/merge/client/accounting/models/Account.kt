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

import dev.merge.client.accounting.models.AccountStatusEnum
import dev.merge.client.accounting.models.ClassificationEnum
import dev.merge.client.accounting.models.CurrencyEnum
import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Account Object ### Description The `Account` object is what businesses use to track transactions. Accountants often call accounts \"ledgers\".  ### Usage Example Fetch from the `LIST Accounts` endpoint and view a company's accounts.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param remoteData 
 * @param name The account's name.
 * @param description The account's description.
 * @param classification The account's classification.
 * @param type The account's type.
 * @param status The account's status.
 * @param currentBalance The account's current balance.
 * @param currency The account's currency.
 * @param accountNumber The account's number.
 * @param parentAccount ID of the parent account.
 * @param company The company the account belongs to.
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 * @param fieldMappings 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Account (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* The account's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The account's description. */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    /* The account's classification. */
    @field:JsonProperty("classification")
    val classification: ClassificationEnum? = null,

    /* The account's type. */
    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    /* The account's status. */
    @field:JsonProperty("status")
    val status: AccountStatusEnum? = null,

    /* The account's current balance. */
    @field:JsonProperty("current_balance")
    val currentBalance: kotlin.Float? = null,

    /* The account's currency. */
    @field:JsonProperty("currency")
    val currency: CurrencyEnum? = null,

    /* The account's number. */
    @field:JsonProperty("account_number")
    val accountNumber: kotlin.String? = null,

    /* ID of the parent account. */
    @field:JsonProperty("parent_account")
    val parentAccount: java.util.UUID? = null,

    /* The company the account belongs to. */
    @field:JsonProperty("company")
    val company: java.util.UUID? = null,

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

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("description")
        val description: JsonNode?,

        @field:JsonProperty("classification")
        val classification: JsonNode?,

        @field:JsonProperty("type")
        val type: JsonNode?,

        @field:JsonProperty("status")
        val status: JsonNode?,

        @field:JsonProperty("current_balance")
        val currentBalance: JsonNode?,

        @field:JsonProperty("currency")
        val currency: JsonNode?,

        @field:JsonProperty("account_number")
        val accountNumber: JsonNode?,

        @field:JsonProperty("parent_account")
        val parentAccount: JsonNode?,

        @field:JsonProperty("company")
        val company: JsonNode?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?,

        @field:JsonProperty("field_mappings")
        val fieldMappings: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Account.Expanded): Account {
            return Account(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                name = ApiClient.jsonConvertSafe(expanded.name),
                description = ApiClient.jsonConvertSafe(expanded.description),
                classification = ApiClient.jsonConvertSafe(expanded.classification),
                type = ApiClient.jsonConvertSafe(expanded.type),
                status = ApiClient.jsonConvertSafe(expanded.status),
                currentBalance = ApiClient.jsonConvertSafe(expanded.currentBalance),
                currency = ApiClient.jsonConvertSafe(expanded.currency),
                accountNumber = ApiClient.jsonConvertSafe(expanded.accountNumber),
                parentAccount = ApiClient.jsonConvertSafe(expanded.parentAccount),
                company = ApiClient.jsonConvertSafe(expanded.company),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted),
                fieldMappings = ApiClient.jsonConvertSafe(expanded.fieldMappings)
            )
        }
    }
}

