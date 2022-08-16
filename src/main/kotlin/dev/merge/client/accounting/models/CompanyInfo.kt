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

import dev.merge.client.accounting.models.AccountingPhoneNumber
import dev.merge.client.accounting.models.Address
import dev.merge.client.accounting.models.CurrencyEnum
import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * # The CompanyInfo Object ### Description The `CompanyInfo` object is used to represent a company's information.  ### Usage Example Fetch from the `GET CompanyInfo` endpoint and view a company's information.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param remoteData 
 * @param name The company's name.
 * @param legalName The company's legal name.
 * @param taxNumber The company's tax number.
 * @param fiscalYearEndMonth The company's fiscal year end month.
 * @param fiscalYearEndDay The company's fiscal year end day.
 * @param currency The currency set in the company's accounting platform.
 * @param remoteCreatedAt When the third party's company was created.
 * @param urls The company's urls.
 * @param addresses 
 * @param phoneNumbers 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

data class CompanyInfo (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* The company's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The company's legal name. */
    @field:JsonProperty("legal_name")
    val legalName: kotlin.String? = null,

    /* The company's tax number. */
    @field:JsonProperty("tax_number")
    val taxNumber: kotlin.String? = null,

    /* The company's fiscal year end month. */
    @field:JsonProperty("fiscal_year_end_month")
    val fiscalYearEndMonth: kotlin.Int? = null,

    /* The company's fiscal year end day. */
    @field:JsonProperty("fiscal_year_end_day")
    val fiscalYearEndDay: kotlin.Int? = null,

    /* The currency set in the company's accounting platform. */
    @field:JsonProperty("currency")
    val currency: CurrencyEnum? = null,

    /* When the third party's company was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    /* The company's urls. */
    @field:JsonProperty("urls")
    val urls: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("addresses")
    val addresses: kotlin.collections.List<Address>? = null,

    @field:JsonProperty("phone_numbers")
    val phoneNumbers: kotlin.collections.List<AccountingPhoneNumber>? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null

)
