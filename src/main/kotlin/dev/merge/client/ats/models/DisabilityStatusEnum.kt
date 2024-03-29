/**
 * Merge ATS API
 *
 * The unified API for building rich integrations with multiple Applicant Tracking System platforms.
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

package dev.merge.client.ats.models


import com.fasterxml.jackson.annotation.JsonEnumDefaultValue
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * * `YES_I_HAVE_A_DISABILITY_OR_PREVIOUSLY_HAD_A_DISABILITY` - YES_I_HAVE_A_DISABILITY_OR_PREVIOUSLY_HAD_A_DISABILITY * `NO_I_DONT_HAVE_A_DISABILITY` - NO_I_DONT_HAVE_A_DISABILITY * `I_DONT_WISH_TO_ANSWER` - I_DONT_WISH_TO_ANSWER
 *
 * Values: YES_I_HAVE_A_DISABILITY_OR_PREVIOUSLY_HAD_A_DISABILITY,NO_I_DONT_HAVE_A_DISABILITY,I_DONT_WISH_TO_ANSWER
 */
enum class DisabilityStatusEnum(val value: kotlin.String) {

    @JsonEnumDefaultValue
    @JsonProperty(value = "MERGE_NONSTANDARD_VALUE")
    MERGE_NONSTANDARD_VALUE("MERGE_NONSTANDARD_VALUE"),


    @JsonProperty(value = "YES_I_HAVE_A_DISABILITY_OR_PREVIOUSLY_HAD_A_DISABILITY")
    YES_I_HAVE_A_DISABILITY_OR_PREVIOUSLY_HAD_A_DISABILITY("YES_I_HAVE_A_DISABILITY_OR_PREVIOUSLY_HAD_A_DISABILITY"),


    @JsonProperty(value = "NO_I_DONT_HAVE_A_DISABILITY")
    NO_I_DONT_HAVE_A_DISABILITY("NO_I_DONT_HAVE_A_DISABILITY"),


    @JsonProperty(value = "I_DONT_WISH_TO_ANSWER")
    I_DONT_WISH_TO_ANSWER("I_DONT_WISH_TO_ANSWER");


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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is DisabilityStatusEnum) "$data" else null

        /**
         * Returns a valid [DisabilityStatusEnum] for [data], MERGE_NONSTANDARD_VALUE otherwise
         */
        fun decode(data: kotlin.Any?): DisabilityStatusEnum = data?.let {
          val normalizedData = "$it".lowercase()
          return values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          } ?: MERGE_NONSTANDARD_VALUE
        } ?: MERGE_NONSTANDARD_VALUE
    }
}

