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


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * # The GenerateRemoteKey Object ### Description The `GenerateRemoteKey` object is used to represent a request for a new remote key.  ### Usage Example Post a `GenerateRemoteKey` to create a new remote key.
 *
 * @param name 
 */

data class GenerateRemoteKeyRequest (

    @field:JsonProperty("name")
    val name: kotlin.String

)

