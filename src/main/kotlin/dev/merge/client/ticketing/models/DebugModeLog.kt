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

import dev.merge.client.ticketing.models.DebugModelLogSummary

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param logId 
 * @param dashboardView 
 * @param logSummary 
 */

data class DebugModeLog (

    @field:JsonProperty("log_id")
    val logId: kotlin.String,

    @field:JsonProperty("dashboard_view")
    val dashboardView: kotlin.String,

    @field:JsonProperty("log_summary")
    val logSummary: DebugModelLogSummary

)

