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


import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param `operator` The operator for which an operator schema is defined.
 * @param isUnique Whether the operator can be repeated multiple times.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class OperatorSchema (

    /* The operator for which an operator schema is defined. */
    @field:JsonProperty("operator")
    val `operator`: kotlin.String? = null,

    /* Whether the operator can be repeated multiple times. */
    @field:JsonProperty("is_unique")
    val isUnique: kotlin.Boolean? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("operator")
        val `operator`: JsonNode?,

        @field:JsonProperty("is_unique")
        val isUnique: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: OperatorSchema.Expanded): OperatorSchema {
            return OperatorSchema(
                `operator` = ApiClient.jsonConvertSafe(expanded.`operator`),
                isUnique = ApiClient.jsonConvertSafe(expanded.isUnique)
            )
        }
    }
}

