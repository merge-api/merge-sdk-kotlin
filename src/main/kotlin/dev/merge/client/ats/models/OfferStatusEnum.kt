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
 * * `DRAFT` - DRAFT * `APPROVAL-SENT` - APPROVAL-SENT * `APPROVED` - APPROVED * `SENT` - SENT * `SENT-MANUALLY` - SENT-MANUALLY * `OPENED` - OPENED * `DENIED` - DENIED * `SIGNED` - SIGNED * `DEPRECATED` - DEPRECATED
 *
 * Values: DRAFT,APPROVAL_MINUS_SENT,APPROVED,SENT,SENT_MINUS_MANUALLY,OPENED,DENIED,SIGNED,DEPRECATED
 */
enum class OfferStatusEnum(val value: kotlin.String) {

    @JsonEnumDefaultValue
    @JsonProperty(value = "MERGE_NONSTANDARD_VALUE")
    MERGE_NONSTANDARD_VALUE("MERGE_NONSTANDARD_VALUE"),


    @JsonProperty(value = "DRAFT")
    DRAFT("DRAFT"),


    @JsonProperty(value = "APPROVAL-SENT")
    APPROVAL_MINUS_SENT("APPROVAL-SENT"),


    @JsonProperty(value = "APPROVED")
    APPROVED("APPROVED"),


    @JsonProperty(value = "SENT")
    SENT("SENT"),


    @JsonProperty(value = "SENT-MANUALLY")
    SENT_MINUS_MANUALLY("SENT-MANUALLY"),


    @JsonProperty(value = "OPENED")
    OPENED("OPENED"),


    @JsonProperty(value = "DENIED")
    DENIED("DENIED"),


    @JsonProperty(value = "SIGNED")
    SIGNED("SIGNED"),


    @JsonProperty(value = "DEPRECATED")
    DEPRECATED("DEPRECATED");


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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is OfferStatusEnum) "$data" else null

        /**
         * Returns a valid [OfferStatusEnum] for [data], MERGE_NONSTANDARD_VALUE otherwise
         */
        fun decode(data: kotlin.Any?): OfferStatusEnum = data?.let {
          val normalizedData = "$it".lowercase()
          return values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          } ?: MERGE_NONSTANDARD_VALUE
        } ?: MERGE_NONSTANDARD_VALUE
    }
}

