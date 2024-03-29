/**
 * Merge Marketing Automation API
 *
 * The unified API for building rich integrations with multiple Marketing Automation platforms.
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

package dev.merge.client.mktg.models


import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The ModelOperation Object ### Description The `ModelOperation` object is used to represent the operations that are currently supported for a given model.  ### Usage Example View what operations are supported for the `Candidate` endpoint.
 *
 * @param modelName 
 * @param availableOperations 
 * @param requiredPostParameters 
 * @param supportedFields 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class ModelOperation (

    @field:JsonProperty("model_name")
    val modelName: kotlin.String,

    @field:JsonProperty("available_operations")
    val availableOperations: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("required_post_parameters")
    val requiredPostParameters: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("supported_fields")
    val supportedFields: kotlin.collections.List<kotlin.String>

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("model_name")
        val modelName: JsonNode,

        @field:JsonProperty("available_operations")
        val availableOperations: kotlin.collections.List<JsonNode>,

        @field:JsonProperty("required_post_parameters")
        val requiredPostParameters: kotlin.collections.List<JsonNode>,

        @field:JsonProperty("supported_fields")
        val supportedFields: kotlin.collections.List<JsonNode>

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: ModelOperation.Expanded): ModelOperation {
            return ModelOperation(
                modelName = ApiClient.jsonConvertRequiredSafe(expanded.modelName),
                availableOperations = ApiClient.jsonConvertRequiredSafe(expanded.availableOperations),
                requiredPostParameters = ApiClient.jsonConvertRequiredSafe(expanded.requiredPostParameters),
                supportedFields = ApiClient.jsonConvertRequiredSafe(expanded.supportedFields)
            )
        }
    }
}

