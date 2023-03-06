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
 * # The Tax Object ### Description The `Tax` object is used to represent an array of the tax deductions for a given employee's payroll run.  ### Usage Example Fetch from the `LIST Taxes` endpoint and filter by `ID` to show all taxes.
 *
 * @param id 
 * @param employeePayrollRun 
 * @param name The tax's name.
 * @param amount The tax amount.
 * @param employerTax Whether or not the employer is responsible for paying the tax.
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Tax (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    @field:JsonProperty("employee_payroll_run")
    val employeePayrollRun: java.util.UUID? = null,

    /* The tax's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The tax amount. */
    @field:JsonProperty("amount")
    val amount: kotlin.Float? = null,

    /* Whether or not the employer is responsible for paying the tax. */
    @field:JsonProperty("employer_tax")
    val employerTax: kotlin.Boolean? = null,

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

        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("amount")
        val amount: JsonNode?,

        @field:JsonProperty("employer_tax")
        val employerTax: JsonNode?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Tax.Expanded): Tax {
            return Tax(
                id = ApiClient.jsonConvertSafe(expanded.id),
                employeePayrollRun = ApiClient.jsonConvertSafe(expanded.employeePayrollRun),
                name = ApiClient.jsonConvertSafe(expanded.name),
                amount = ApiClient.jsonConvertSafe(expanded.amount),
                employerTax = ApiClient.jsonConvertSafe(expanded.employerTax),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

