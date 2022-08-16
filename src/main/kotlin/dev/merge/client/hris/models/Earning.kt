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

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * # The Earning Object ### Description The `Earning` object is used to represent an earning for a given employee's payroll run. One run could include several earnings.  ### Usage Example Fetch from the `LIST Earnings` endpoint and filter by `ID` to show all earnings.
 *
 * @param id 
 * @param employeePayrollRun 
 * @param amount The amount earned.
 * @param type The type of earning.
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

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

)
