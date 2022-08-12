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

import dev.merge.client.ats.models.AccountIntegration

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param accountToken 
 * @param integration 
 */

data class AccountToken (

    @field:JsonProperty("account_token")
    val accountToken: kotlin.String,

    @field:JsonProperty("integration")
    val integration: AccountIntegration

)

