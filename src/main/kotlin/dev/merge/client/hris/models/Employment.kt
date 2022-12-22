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

import dev.merge.client.hris.models.EmploymentTypeEnum
import dev.merge.client.hris.models.FlsaStatusEnum
import dev.merge.client.hris.models.PayCurrencyEnum
import dev.merge.client.hris.models.PayFrequencyEnum
import dev.merge.client.hris.models.PayPeriodEnum
import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Employment Object ### Description The `Employment` object is used to represent an employment position at a company. These are associated with the employee filling the role.  Please note: Employment objects are constructed if the object does not exist in the remote system.  ### Usage Example Fetch from the `LIST Employments` endpoint and filter by `ID` to show all employees.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param employee The employee holding this position.
 * @param jobTitle The position's title.
 * @param payRate The position's pay rate in dollars.
 * @param payPeriod The time period this pay rate encompasses.
 * @param payFrequency The position's pay frequency.
 * @param payCurrency The position's currency code.
 * @param payGroup The employment's pay group
 * @param flsaStatus The position's FLSA status.
 * @param effectiveDate The position's effective date.
 * @param employmentType The position's type of employment.
 * @param remoteData 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 * @param fieldMappings 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Employment (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The employee holding this position. */
    @field:JsonProperty("employee")
    val employee: java.util.UUID? = null,

    /* The position's title. */
    @field:JsonProperty("job_title")
    val jobTitle: kotlin.String? = null,

    /* The position's pay rate in dollars. */
    @field:JsonProperty("pay_rate")
    val payRate: kotlin.Float? = null,

    /* The time period this pay rate encompasses. */
    @field:JsonProperty("pay_period")
    val payPeriod: PayPeriodEnum? = null,

    /* The position's pay frequency. */
    @field:JsonProperty("pay_frequency")
    val payFrequency: PayFrequencyEnum? = null,

    /* The position's currency code. */
    @field:JsonProperty("pay_currency")
    val payCurrency: PayCurrencyEnum? = null,

    /* The employment's pay group */
    @field:JsonProperty("pay_group")
    val payGroup: java.util.UUID? = null,

    /* The position's FLSA status. */
    @field:JsonProperty("flsa_status")
    val flsaStatus: FlsaStatusEnum? = null,

    /* The position's effective date. */
    @field:JsonProperty("effective_date")
    val effectiveDate: java.time.OffsetDateTime? = null,

    /* The position's type of employment. */
    @field:JsonProperty("employment_type")
    val employmentType: EmploymentTypeEnum? = null,

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

        @field:JsonProperty("job_title")
        val jobTitle: JsonNode?,

        @field:JsonProperty("pay_rate")
        val payRate: JsonNode?,

        @field:JsonProperty("pay_period")
        val payPeriod: JsonNode?,

        @field:JsonProperty("pay_frequency")
        val payFrequency: JsonNode?,

        @field:JsonProperty("pay_currency")
        val payCurrency: JsonNode?,

        @field:JsonProperty("pay_group")
        val payGroup: JsonNode?,

        @field:JsonProperty("flsa_status")
        val flsaStatus: JsonNode?,

        @field:JsonProperty("effective_date")
        val effectiveDate: JsonNode?,

        @field:JsonProperty("employment_type")
        val employmentType: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?,

        @field:JsonProperty("field_mappings")
        val fieldMappings: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Employment.Expanded): Employment {
            return Employment(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                employee = ApiClient.jsonConvertSafe(expanded.employee),
                jobTitle = ApiClient.jsonConvertSafe(expanded.jobTitle),
                payRate = ApiClient.jsonConvertSafe(expanded.payRate),
                payPeriod = ApiClient.jsonConvertSafe(expanded.payPeriod),
                payFrequency = ApiClient.jsonConvertSafe(expanded.payFrequency),
                payCurrency = ApiClient.jsonConvertSafe(expanded.payCurrency),
                payGroup = ApiClient.jsonConvertSafe(expanded.payGroup),
                flsaStatus = ApiClient.jsonConvertSafe(expanded.flsaStatus),
                effectiveDate = ApiClient.jsonConvertSafe(expanded.effectiveDate),
                employmentType = ApiClient.jsonConvertSafe(expanded.employmentType),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted),
                fieldMappings = ApiClient.jsonConvertSafe(expanded.fieldMappings)
            )
        }
    }
}

