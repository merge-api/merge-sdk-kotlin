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

import dev.merge.client.ticketing.models.CategoriesEnum
import dev.merge.client.ticketing.models.ModelOperation

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param name 
 * @param categories 
 * @param color 
 * @param slug 
 * @param passthroughAvailable 
 * @param image 
 * @param squareImage 
 * @param availableModelOperations 
 */

data class AccountDetailsAndActionsIntegration (

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("categories")
    val categories: kotlin.collections.List<CategoriesEnum>,

    @field:JsonProperty("color")
    val color: kotlin.String,

    @field:JsonProperty("slug")
    val slug: kotlin.String,

    @field:JsonProperty("passthrough_available")
    val passthroughAvailable: kotlin.Boolean,

    @field:JsonProperty("image")
    val image: kotlin.String? = null,

    @field:JsonProperty("square_image")
    val squareImage: kotlin.String? = null,

    @field:JsonProperty("available_model_operations")
    val availableModelOperations: kotlin.collections.List<ModelOperation>? = null

) {

    data class Expanded(
        @field:JsonProperty("name")
        val name: JsonNode,

        @field:JsonProperty("categories")
        val categories: kotlin.collections.List<JsonNode>,

        @field:JsonProperty("color")
        val color: JsonNode,

        @field:JsonProperty("slug")
        val slug: JsonNode,

        @field:JsonProperty("passthrough_available")
        val passthroughAvailable: JsonNode,

        @field:JsonProperty("image")
        val image: JsonNode?,

        @field:JsonProperty("square_image")
        val squareImage: JsonNode?,

        @field:JsonProperty("available_model_operations")
        val availableModelOperations: kotlin.collections.List<JsonNode>?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: AccountDetailsAndActionsIntegration.Expanded): AccountDetailsAndActionsIntegration {
            return AccountDetailsAndActionsIntegration(
                name = ApiClient.jsonConvertRequiredSafe(expanded.name),
                categories = ApiClient.jsonConvertRequiredSafe(expanded.categories),
                color = ApiClient.jsonConvertRequiredSafe(expanded.color),
                slug = ApiClient.jsonConvertRequiredSafe(expanded.slug),
                passthroughAvailable = ApiClient.jsonConvertRequiredSafe(expanded.passthroughAvailable),
                image = ApiClient.jsonConvertSafe(expanded.image),
                squareImage = ApiClient.jsonConvertSafe(expanded.squareImage),
                availableModelOperations = ApiClient.jsonConvertSafe(expanded.availableModelOperations)
            )
        }
    }
}

