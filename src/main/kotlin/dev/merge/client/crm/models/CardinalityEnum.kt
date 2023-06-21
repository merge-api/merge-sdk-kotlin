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


import com.fasterxml.jackson.annotation.JsonEnumDefaultValue
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * * `ONE_TO_ONE` - ONE_TO_ONE * `MANY_TO_ONE` - MANY_TO_ONE * `MANY_TO_MANY` - MANY_TO_MANY * `ONE_TO_MANY` - ONE_TO_MANY
 *
 * Values: ONE_TO_ONE,MANY_TO_ONE,MANY_TO_MANY,ONE_TO_MANY
 */
enum class CardinalityEnum(val value: kotlin.String) {

    @JsonEnumDefaultValue
    @JsonProperty(value = "MERGE_NONSTANDARD_VALUE")
    MERGE_NONSTANDARD_VALUE("MERGE_NONSTANDARD_VALUE"),


    @JsonProperty(value = "ONE_TO_ONE")
    ONE_TO_ONE("ONE_TO_ONE"),


    @JsonProperty(value = "MANY_TO_ONE")
    MANY_TO_ONE("MANY_TO_ONE"),


    @JsonProperty(value = "MANY_TO_MANY")
    MANY_TO_MANY("MANY_TO_MANY"),


    @JsonProperty(value = "ONE_TO_MANY")
    ONE_TO_MANY("ONE_TO_MANY");


    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise. We do not encode to
         * MERGE_NONSTANDARD_VALUE since the API never expects to receive this value, so encoding it is not valid.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is CardinalityEnum) "$data" else null

        /**
         * Returns a valid [CardinalityEnum] for [data], MERGE_NONSTANDARD_VALUE otherwise
         */
        fun decode(data: kotlin.Any?): CardinalityEnum = data?.let {
          val normalizedData = "$it".lowercase()
          return values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          } ?: MERGE_NONSTANDARD_VALUE
        } ?: MERGE_NONSTANDARD_VALUE
    }
}

