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

package dev.merge.client.hris.apis

import dev.merge.client.hris.models.RemoteKey
import dev.merge.client.hris.models.RemoteKeyForRegenerationRequest

import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder

import com.fasterxml.jackson.databind.ObjectMapper

import dev.merge.client.shared.*

open class RegenerateKeyApi(
baseUrl: String = ApiClient.BASE_URL + "hris/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class RegenerateKeyCreateRequest (
        val remoteKeyForRegenerationRequest: RemoteKeyForRegenerationRequest
    )

    /**
    * 
    * Exchange remote keys.
     * @param remoteKeyForRegenerationRequest  
     * @return RemoteKey
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun regenerateKeyCreate(requestModel: RegenerateKeyApi.RegenerateKeyCreateRequest): HttpResponse<RemoteKey> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = requestModel.remoteKeyForRegenerationRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/regenerate-key",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return jsonRequest(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).wrap()
    }

}
