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


import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Account Object ### Description The `Account` object is used to represent a company in a CRM system. ### Usage Example TODO
 *
 * @param owner The account's owner.
 * @param name The account's name.
 * @param description The account's description.
 * @param industry The account's industry.
 * @param website The account's website.
 * @param numberOfEmployees The account's number of employees.
 * @param lastActivityAt The last date (either most recent or furthest in the future) of when an activity occurs in an account.
 * @param integrationParams 
 * @param linkedAccountParams 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class PatchedAccountRequest (

    /* The account's owner. */
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

    /* The last date (either most recent or furthest in the future) of when an activity occurs in an account. */
    @field:JsonProperty("last_activity_at")
    val lastActivityAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("owner")
        val owner: JsonNode?,

        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("description")
        val description: JsonNode?,

        @field:JsonProperty("industry")
        val industry: JsonNode?,

        @field:JsonProperty("website")
        val website: JsonNode?,

        @field:JsonProperty("number_of_employees")
        val numberOfEmployees: JsonNode?,

        @field:JsonProperty("last_activity_at")
        val lastActivityAt: JsonNode?,

        @field:JsonProperty("integration_params")
        val integrationParams: JsonNode?,

        @field:JsonProperty("linked_account_params")
        val linkedAccountParams: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: PatchedAccountRequest.Expanded): PatchedAccountRequest {
            return PatchedAccountRequest(
                owner = ApiClient.jsonConvertSafe(expanded.owner),
                name = ApiClient.jsonConvertSafe(expanded.name),
                description = ApiClient.jsonConvertSafe(expanded.description),
                industry = ApiClient.jsonConvertSafe(expanded.industry),
                website = ApiClient.jsonConvertSafe(expanded.website),
                numberOfEmployees = ApiClient.jsonConvertSafe(expanded.numberOfEmployees),
                lastActivityAt = ApiClient.jsonConvertSafe(expanded.lastActivityAt),
                integrationParams = ApiClient.jsonConvertSafe(expanded.integrationParams),
                linkedAccountParams = ApiClient.jsonConvertSafe(expanded.linkedAccountParams)
            )
        }
    }
}

