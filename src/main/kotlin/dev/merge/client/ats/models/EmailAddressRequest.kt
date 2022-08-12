/**
 * Merge ATS API
 *
 * The unified API for building rich integrations with multiple Applicant Tracking System platforms.
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

package dev.merge.client.ats.models

import dev.merge.client.ats.models.EmailAddressTypeEnum

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * # The EmailAddress Object ### Description The `EmailAddress` object is used to represent a candidate's email address. ### Usage Example Fetch from the `GET Candidate` endpoint and view their email addresses.
 *
 * @param `value` The email address.
 * @param emailAddressType The type of email address.
 */

data class EmailAddressRequest (

    /* The email address. */
    @field:JsonProperty("value")
    val `value`: kotlin.String? = null,

    /* The type of email address. */
    @field:JsonProperty("email_address_type")
    val emailAddressType: EmailAddressTypeEnum? = null

)

