/**
 * Merge Ticketing API
 *
 * The unified API for building rich integrations with multiple Ticketing platforms.
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

package dev.merge.client.ticketing.models

import dev.merge.client.ticketing.models.LinkedAccountStatus

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param requestSchema 
 * @param hasConditionalParams 
 * @param hasRequiredLinkedAccountParams 
 * @param status 
 */

data class MetaResponse (

    @field:JsonProperty("request_schema")
    val requestSchema: kotlin.collections.Map<kotlin.String, kotlin.Any>,

    @field:JsonProperty("has_conditional_params")
    val hasConditionalParams: kotlin.Boolean,

    @field:JsonProperty("has_required_linked_account_params")
    val hasRequiredLinkedAccountParams: kotlin.Boolean,

    @field:JsonProperty("status")
    val status: LinkedAccountStatus? = null

)

