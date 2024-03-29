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

import dev.merge.client.ticketing.models.CommonModelScopeData

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param scopeOverrides 
 * @param organizationLevelScopes 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class CommonModelScopes (

    @field:JsonProperty("scope_overrides")
    val scopeOverrides: kotlin.collections.List<CommonModelScopeData>,

    @field:JsonProperty("organization_level_scopes")
    val organizationLevelScopes: CommonModelScopeData? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("scope_overrides")
        val scopeOverrides: kotlin.collections.List<JsonNode>,

        @field:JsonProperty("organization_level_scopes")
        val organizationLevelScopes: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: CommonModelScopes.Expanded): CommonModelScopes {
            return CommonModelScopes(
                scopeOverrides = ApiClient.jsonConvertRequiredSafe(expanded.scopeOverrides),
                organizationLevelScopes = ApiClient.jsonConvertSafe(expanded.organizationLevelScopes)
            )
        }
    }
}

