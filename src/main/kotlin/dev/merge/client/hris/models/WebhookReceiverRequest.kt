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


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param event 
 * @param isActive 
 * @param key 
 */

data class WebhookReceiverRequest (

    @field:JsonProperty("event")
    val event: kotlin.String,

    @field:JsonProperty("is_active")
    val isActive: kotlin.Boolean,

    @field:JsonProperty("key")
    val key: kotlin.String? = null

)
