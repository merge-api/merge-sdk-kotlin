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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The TaxRate Object ### Description The `TaxRate` object is used to represent a tax rate.  ### Usage Example Fetch from the `LIST TaxRates` endpoint and view tax rates relevant to a company.
 *
 * @param description The tax rate's description.
 * @param totalTaxRate The tax rate's total tax rate.
 * @param effectiveTaxRate The tax rate's effective tax rate.
 * @param company The company the tax rate belongs to.
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param fieldMappings 
 * @param remoteData 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class TaxRate (

    /* The tax rate's description. */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    /* The tax rate's total tax rate. */
    @field:JsonProperty("total_tax_rate")
    val totalTaxRate: kotlin.Float? = null,

    /* The tax rate's effective tax rate. */
    @field:JsonProperty("effective_tax_rate")
    val effectiveTaxRate: kotlin.Float? = null,

    /* The company the tax rate belongs to. */
    @field:JsonProperty("company")
    val company: java.util.UUID? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null,

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
        @field:JsonProperty("description")
        val description: JsonNode?,

        @field:JsonProperty("total_tax_rate")
        val totalTaxRate: JsonNode?,

        @field:JsonProperty("effective_tax_rate")
        val effectiveTaxRate: JsonNode?,

        @field:JsonProperty("company")
        val company: JsonNode?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?,

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
        fun normalize(expanded: TaxRate.Expanded): TaxRate {
            return TaxRate(
                description = ApiClient.jsonConvertSafe(expanded.description),
                totalTaxRate = ApiClient.jsonConvertSafe(expanded.totalTaxRate),
                effectiveTaxRate = ApiClient.jsonConvertSafe(expanded.effectiveTaxRate),
                company = ApiClient.jsonConvertSafe(expanded.company),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted),
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                fieldMappings = ApiClient.jsonConvertSafe(expanded.fieldMappings),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData)
            )
        }
    }
}

