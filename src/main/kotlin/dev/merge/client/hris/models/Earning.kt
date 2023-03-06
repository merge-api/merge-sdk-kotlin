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

import dev.merge.client.hris.models.EarningTypeEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Earning Object ### Description The `Earning` object is used to represent an array of different compensations that an employee receives within specific wage categories.  ### Usage Example Fetch from the `LIST Earnings` endpoint and filter by `ID` to show all earnings.
 *
 * @param id 
 * @param employeePayrollRun 
 * @param amount The amount earned.
 * @param type The type of earning.
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Earning (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    @field:JsonProperty("employee_payroll_run")
    val employeePayrollRun: java.util.UUID? = null,

    /* The amount earned. */
    @field:JsonProperty("amount")
    val amount: kotlin.Float? = null,

    /* The type of earning. */
    @field:JsonProperty("type")
    val type: EarningTypeEnum? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("employee_payroll_run")
        val employeePayrollRun: JsonNode?,

        @field:JsonProperty("amount")
        val amount: JsonNode?,

        @field:JsonProperty("type")
        val type: JsonNode?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Earning.Expanded): Earning {
            return Earning(
                id = ApiClient.jsonConvertSafe(expanded.id),
                employeePayrollRun = ApiClient.jsonConvertSafe(expanded.employeePayrollRun),
                amount = ApiClient.jsonConvertSafe(expanded.amount),
                type = ApiClient.jsonConvertSafe(expanded.type),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

