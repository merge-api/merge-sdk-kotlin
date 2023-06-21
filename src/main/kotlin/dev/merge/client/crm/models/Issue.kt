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

import dev.merge.client.crm.models.IssueStatusEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param errorDescription 
 * @param id 
 * @param status Status of the issue. Options: ('ONGOING', 'RESOLVED')  * `ONGOING` - ONGOING * `RESOLVED` - RESOLVED
 * @param endUser 
 * @param firstIncidentTime 
 * @param lastIncidentTime 
 * @param isMuted 
 * @param errorDetails 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Issue (

    @field:JsonProperty("error_description")
    val errorDescription: kotlin.String,

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* Status of the issue. Options: ('ONGOING', 'RESOLVED')  * `ONGOING` - ONGOING * `RESOLVED` - RESOLVED */
    @field:JsonProperty("status")
    val status: IssueStatusEnum? = null,

    @field:JsonProperty("end_user")
    val endUser: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("first_incident_time")
    val firstIncidentTime: java.time.OffsetDateTime? = null,

    @field:JsonProperty("last_incident_time")
    val lastIncidentTime: java.time.OffsetDateTime? = null,

    @field:JsonProperty("is_muted")
    val isMuted: kotlin.Boolean? = null,

    @field:JsonProperty("error_details")
    val errorDetails: kotlin.collections.List<kotlin.String>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("error_description")
        val errorDescription: JsonNode,

        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("status")
        val status: JsonNode?,

        @field:JsonProperty("end_user")
        val endUser: JsonNode?,

        @field:JsonProperty("first_incident_time")
        val firstIncidentTime: JsonNode?,

        @field:JsonProperty("last_incident_time")
        val lastIncidentTime: JsonNode?,

        @field:JsonProperty("is_muted")
        val isMuted: JsonNode?,

        @field:JsonProperty("error_details")
        val errorDetails: kotlin.collections.List<JsonNode>?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Issue.Expanded): Issue {
            return Issue(
                errorDescription = ApiClient.jsonConvertRequiredSafe(expanded.errorDescription),
                id = ApiClient.jsonConvertSafe(expanded.id),
                status = ApiClient.jsonConvertSafe(expanded.status),
                endUser = ApiClient.jsonConvertSafe(expanded.endUser),
                firstIncidentTime = ApiClient.jsonConvertSafe(expanded.firstIncidentTime),
                lastIncidentTime = ApiClient.jsonConvertSafe(expanded.lastIncidentTime),
                isMuted = ApiClient.jsonConvertSafe(expanded.isMuted),
                errorDetails = ApiClient.jsonConvertSafe(expanded.errorDetails)
            )
        }
    }
}

