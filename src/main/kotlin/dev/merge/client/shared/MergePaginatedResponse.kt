/**
 * Merge API
 *
 * The unified API for building rich integrations with multiple Accounting & Finance platforms.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: hello@merge.dev
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package dev.merge.client.shared

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty


/**
 * 
 *
 * @param next 
 * @param previous 
 * @param results 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class MergePaginatedResponse<T> (

    @field:JsonProperty("next")
    val next: kotlin.String? = null,

    @field:JsonProperty("previous")
    val previous: kotlin.String? = null,

    @field:JsonProperty("results")
    val results: kotlin.collections.List<T>? = null

)

