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


import com.fasterxml.jackson.annotation.JsonEnumDefaultValue
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * * `MALE` - MALE * `FEMALE` - FEMALE * `NON-BINARY` - NON-BINARY * `OTHER` - OTHER * `PREFER_NOT_TO_DISCLOSE` - PREFER_NOT_TO_DISCLOSE
 *
 * Values: MALE,FEMALE,NON_MINUS_BINARY,OTHER,PREFER_NOT_TO_DISCLOSE
 */
enum class GenderEnum(val value: kotlin.String) {

    @JsonEnumDefaultValue
    @JsonProperty(value = "MERGE_NONSTANDARD_VALUE")
    MERGE_NONSTANDARD_VALUE("MERGE_NONSTANDARD_VALUE"),


    @JsonProperty(value = "MALE")
    MALE("MALE"),


    @JsonProperty(value = "FEMALE")
    FEMALE("FEMALE"),


    @JsonProperty(value = "NON-BINARY")
    NON_MINUS_BINARY("NON-BINARY"),


    @JsonProperty(value = "OTHER")
    OTHER("OTHER"),


    @JsonProperty(value = "PREFER_NOT_TO_DISCLOSE")
    PREFER_NOT_TO_DISCLOSE("PREFER_NOT_TO_DISCLOSE");


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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is GenderEnum) "$data" else null

        /**
         * Returns a valid [GenderEnum] for [data], MERGE_NONSTANDARD_VALUE otherwise
         */
        fun decode(data: kotlin.Any?): GenderEnum = data?.let {
          val normalizedData = "$it".lowercase()
          return values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          } ?: MERGE_NONSTANDARD_VALUE
        } ?: MERGE_NONSTANDARD_VALUE
    }
}

