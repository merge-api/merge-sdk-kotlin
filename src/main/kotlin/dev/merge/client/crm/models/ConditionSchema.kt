/**
 * Merge CRM API
 *
 * The unified API for building rich integrations with multiple CRM platforms.
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

package dev.merge.client.crm.models

import dev.merge.client.crm.models.ConditionTypeEnum
import dev.merge.client.crm.models.OperatorSchema

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param id The ID of the condition schema. This ID is used when updating selective syncs for a linked account.
 * @param nativeName User-facing *native condition* name. e.g. \"Skip Manager\".
 * @param fieldName The name of the field on the common model that this condition corresponds to, if they conceptually match. e.g. \"location_type\".
 * @param conditionType The type of value(s) that can be set for this condition.  * `BOOLEAN` - BOOLEAN * `DATE` - DATE * `DATE_TIME` - DATE_TIME * `INTEGER` - INTEGER * `FLOAT` - FLOAT * `STRING` - STRING * `LIST_OF_STRINGS` - LIST_OF_STRINGS
 * @param operators The schemas for the operators that can be used on a condition.
 * @param commonModel The common model for which a condition schema is defined.
 * @param isUnique Whether this condition can only be applied once. If false, the condition can be AND'd together multiple times.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class ConditionSchema (

    /* The ID of the condition schema. This ID is used when updating selective syncs for a linked account. */
    @field:JsonProperty("id")
    val id: java.util.UUID,

    /* User-facing *native condition* name. e.g. \"Skip Manager\". */
    @field:JsonProperty("native_name")
    val nativeName: kotlin.String?,

    /* The name of the field on the common model that this condition corresponds to, if they conceptually match. e.g. \"location_type\". */
    @field:JsonProperty("field_name")
    val fieldName: kotlin.String?,

    /* The type of value(s) that can be set for this condition.  * `BOOLEAN` - BOOLEAN * `DATE` - DATE * `DATE_TIME` - DATE_TIME * `INTEGER` - INTEGER * `FLOAT` - FLOAT * `STRING` - STRING * `LIST_OF_STRINGS` - LIST_OF_STRINGS */
    @field:JsonProperty("condition_type")
    val conditionType: ConditionTypeEnum?,

    /* The schemas for the operators that can be used on a condition. */
    @field:JsonProperty("operators")
    val operators: kotlin.collections.List<OperatorSchema>,

    /* The common model for which a condition schema is defined. */
    @field:JsonProperty("common_model")
    val commonModel: kotlin.String? = null,

    /* Whether this condition can only be applied once. If false, the condition can be AND'd together multiple times. */
    @field:JsonProperty("is_unique")
    val isUnique: kotlin.Boolean? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode,

        @field:JsonProperty("native_name")
        val nativeName: JsonNode,

        @field:JsonProperty("field_name")
        val fieldName: JsonNode,

        @field:JsonProperty("condition_type")
        val conditionType: JsonNode,

        @field:JsonProperty("operators")
        val operators: kotlin.collections.List<JsonNode>,

        @field:JsonProperty("common_model")
        val commonModel: JsonNode?,

        @field:JsonProperty("is_unique")
        val isUnique: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: ConditionSchema.Expanded): ConditionSchema {
            return ConditionSchema(
                id = ApiClient.jsonConvertRequiredSafe(expanded.id),
                nativeName = ApiClient.jsonConvertRequiredSafe(expanded.nativeName),
                fieldName = ApiClient.jsonConvertRequiredSafe(expanded.fieldName),
                conditionType = ApiClient.jsonConvertRequiredSafe(expanded.conditionType),
                operators = ApiClient.jsonConvertRequiredSafe(expanded.operators),
                commonModel = ApiClient.jsonConvertSafe(expanded.commonModel),
                isUnique = ApiClient.jsonConvertSafe(expanded.isUnique)
            )
        }
    }
}

