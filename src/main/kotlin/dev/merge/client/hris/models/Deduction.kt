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


import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Deduction Object ### Description The `Deduction` object is used to represent a deduction for a given employee's payroll run. One run could include several deductions.  ### Usage Example Fetch from the `LIST Deductions` endpoint and filter by `ID` to show all deductions.
 *
 * @param id 
 * @param employeePayrollRun 
 * @param name The deduction's name.
 * @param employeeDeduction The amount the employee is deducting.
 * @param companyDeduction The amount the company is deducting.
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 * @param fieldMappings 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Deduction (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    @field:JsonProperty("employee_payroll_run")
    val employeePayrollRun: java.util.UUID? = null,

    /* The deduction's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The amount the employee is deducting. */
    @field:JsonProperty("employee_deduction")
    val employeeDeduction: kotlin.Float? = null,

    /* The amount the company is deducting. */
    @field:JsonProperty("company_deduction")
    val companyDeduction: kotlin.Float? = null,

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

        @field:JsonProperty("employee_payroll_run")
        val employeePayrollRun: JsonNode?,

        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("employee_deduction")
        val employeeDeduction: JsonNode?,

        @field:JsonProperty("company_deduction")
        val companyDeduction: JsonNode?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?,

        @field:JsonProperty("field_mappings")
        val fieldMappings: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Deduction.Expanded): Deduction {
            return Deduction(
                id = ApiClient.jsonConvertSafe(expanded.id),
                employeePayrollRun = ApiClient.jsonConvertSafe(expanded.employeePayrollRun),
                name = ApiClient.jsonConvertSafe(expanded.name),
                employeeDeduction = ApiClient.jsonConvertSafe(expanded.employeeDeduction),
                companyDeduction = ApiClient.jsonConvertSafe(expanded.companyDeduction),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted),
                fieldMappings = ApiClient.jsonConvertSafe(expanded.fieldMappings)
            )
        }
    }
}

