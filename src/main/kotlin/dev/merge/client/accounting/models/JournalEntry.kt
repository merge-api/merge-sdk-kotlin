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

import dev.merge.client.accounting.models.CurrencyEnum
import dev.merge.client.accounting.models.JournalLine
import dev.merge.client.accounting.models.PostingStatusEnum
import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The JournalEntry Object ### Description The `JournalEntry` object is used to get a record of all manually created entries made in a company’s general ledger. The journal line items for each journal entry should sum to zero.  ### Usage Example Fetch from the `GET JournalEntry` endpoint and view a company's journey entry.
 *
 * @param transactionDate The journal entry's transaction date.
 * @param remoteCreatedAt When the third party's journal entry was created.
 * @param remoteUpdatedAt When the third party's journal entry was updated.
 * @param payments Array of `Payment` object IDs.
 * @param memo The journal entry's private note.
 * @param currency The journal's currency.
 * @param exchangeRate The journal entry's exchange rate.
 * @param company The company the journal entry belongs to.
 * @param lines 
 * @param remoteWasDeleted 
 * @param postingStatus The journal's posting status.
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param fieldMappings 
 * @param remoteData 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class JournalEntry (

    /* The journal entry's transaction date. */
    @field:JsonProperty("transaction_date")
    val transactionDate: java.time.OffsetDateTime? = null,

    /* When the third party's journal entry was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    /* When the third party's journal entry was updated. */
    @field:JsonProperty("remote_updated_at")
    val remoteUpdatedAt: java.time.OffsetDateTime? = null,

    /* Array of `Payment` object IDs. */
    @field:JsonProperty("payments")
    val payments: kotlin.collections.List<java.util.UUID>? = null,

    /* The journal entry's private note. */
    @field:JsonProperty("memo")
    val memo: kotlin.String? = null,

    /* The journal's currency. */
    @field:JsonProperty("currency")
    val currency: CurrencyEnum? = null,

    /* The journal entry's exchange rate. */
    @field:JsonProperty("exchange_rate")
    val exchangeRate: java.math.BigDecimal? = null,

    /* The company the journal entry belongs to. */
    @field:JsonProperty("company")
    val company: java.util.UUID? = null,

    @field:JsonProperty("lines")
    val lines: kotlin.collections.List<JournalLine>? = null,

    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null,

    /* The journal's posting status. */
    @field:JsonProperty("posting_status")
    val postingStatus: PostingStatusEnum? = null,

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("field_mappings")
    val fieldMappings: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("transaction_date")
        val transactionDate: JsonNode?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("remote_updated_at")
        val remoteUpdatedAt: JsonNode?,

        @field:JsonProperty("payments")
        val payments: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("memo")
        val memo: JsonNode?,

        @field:JsonProperty("currency")
        val currency: JsonNode?,

        @field:JsonProperty("exchange_rate")
        val exchangeRate: JsonNode?,

        @field:JsonProperty("company")
        val company: JsonNode?,

        @field:JsonProperty("lines")
        val lines: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?,

        @field:JsonProperty("posting_status")
        val postingStatus: JsonNode?,

        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("field_mappings")
        val fieldMappings: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: JournalEntry.Expanded): JournalEntry {
            return JournalEntry(
                transactionDate = ApiClient.jsonConvertSafe(expanded.transactionDate),
                remoteCreatedAt = ApiClient.jsonConvertSafe(expanded.remoteCreatedAt),
                remoteUpdatedAt = ApiClient.jsonConvertSafe(expanded.remoteUpdatedAt),
                payments = ApiClient.jsonConvertSafe(expanded.payments),
                memo = ApiClient.jsonConvertSafe(expanded.memo),
                currency = ApiClient.jsonConvertSafe(expanded.currency),
                exchangeRate = ApiClient.jsonConvertSafe(expanded.exchangeRate),
                company = ApiClient.jsonConvertSafe(expanded.company),
                lines = ApiClient.jsonConvertSafe(expanded.lines),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted),
                postingStatus = ApiClient.jsonConvertSafe(expanded.postingStatus),
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                fieldMappings = ApiClient.jsonConvertSafe(expanded.fieldMappings),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData)
            )
        }
    }
}

