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

import dev.merge.client.crm.models.MethodEnum
import dev.merge.client.crm.models.MultipartFormFieldRequest
import dev.merge.client.crm.models.RequestFormatEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The DataPassthrough Object ### Description The `DataPassthrough` object is used to send information to an otherwise-unsupported third-party endpoint.  ### Usage Example Create a `DataPassthrough` to get team hierarchies from your Rippling integration.
 *
 * @param method 
 * @param path 
 * @param baseUrlOverride 
 * @param `data` 
 * @param multipartFormData Pass an array of `MultipartFormField` objects in here instead of using the `data` param if `request_format` is set to `MULTIPART`.
 * @param headers The headers to use for the request (Merge will handle the account's authorization headers). `Content-Type` header is required for passthrough. Choose content type corresponding to expected format of receiving server.
 * @param requestFormat 
 * @param normalizeResponse Optional. If true, the response will always be an object of the form `{\"type\": T, \"value\": ...}` where `T` will be one of `string, boolean, number, null, array, object`.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class DataPassthroughRequest (

    @field:JsonProperty("method")
    val method: MethodEnum?,

    @field:JsonProperty("path")
    val path: kotlin.String,

    @field:JsonProperty("base_url_override")
    val baseUrlOverride: kotlin.String? = null,

    @field:JsonProperty("data")
    val `data`: kotlin.String? = null,

    /* Pass an array of `MultipartFormField` objects in here instead of using the `data` param if `request_format` is set to `MULTIPART`. */
    @field:JsonProperty("multipart_form_data")
    val multipartFormData: kotlin.collections.List<MultipartFormFieldRequest>? = null,

    /* The headers to use for the request (Merge will handle the account's authorization headers). `Content-Type` header is required for passthrough. Choose content type corresponding to expected format of receiving server. */
    @field:JsonProperty("headers")
    val headers: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("request_format")
    val requestFormat: RequestFormatEnum? = null,

    /* Optional. If true, the response will always be an object of the form `{\"type\": T, \"value\": ...}` where `T` will be one of `string, boolean, number, null, array, object`. */
    @field:JsonProperty("normalize_response")
    val normalizeResponse: kotlin.Boolean? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("method")
        val method: JsonNode,

        @field:JsonProperty("path")
        val path: JsonNode,

        @field:JsonProperty("base_url_override")
        val baseUrlOverride: JsonNode?,

        @field:JsonProperty("data")
        val `data`: JsonNode?,

        @field:JsonProperty("multipart_form_data")
        val multipartFormData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("headers")
        val headers: JsonNode?,

        @field:JsonProperty("request_format")
        val requestFormat: JsonNode?,

        @field:JsonProperty("normalize_response")
        val normalizeResponse: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: DataPassthroughRequest.Expanded): DataPassthroughRequest {
            return DataPassthroughRequest(
                method = ApiClient.jsonConvertRequiredSafe(expanded.method),
                path = ApiClient.jsonConvertRequiredSafe(expanded.path),
                baseUrlOverride = ApiClient.jsonConvertSafe(expanded.baseUrlOverride),
                `data` = ApiClient.jsonConvertSafe(expanded.`data`),
                multipartFormData = ApiClient.jsonConvertSafe(expanded.multipartFormData),
                headers = ApiClient.jsonConvertSafe(expanded.headers),
                requestFormat = ApiClient.jsonConvertSafe(expanded.requestFormat),
                normalizeResponse = ApiClient.jsonConvertSafe(expanded.normalizeResponse)
            )
        }
    }
}

