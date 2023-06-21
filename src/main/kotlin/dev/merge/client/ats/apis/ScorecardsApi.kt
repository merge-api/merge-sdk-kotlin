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

package dev.merge.client.ats.apis

import dev.merge.client.ats.models.Scorecard

import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.jackson.jackson
import io.ktor.client.call.body
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.future.future
import java.util.concurrent.CompletableFuture

import com.fasterxml.jackson.databind.ObjectMapper

import dev.merge.client.shared.*

open class ScorecardsApi(
baseUrl: String = ApiClient.BASE_URL + "ats/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class ScorecardsListRequest (
        val applicationId: kotlin.String? = null,
        val createdAfter: java.time.OffsetDateTime? = null,
        val createdBefore: java.time.OffsetDateTime? = null,
        val cursor: kotlin.String? = null,
        val expand: kotlin.String? = null,
        val includeDeletedData: kotlin.Boolean? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val interviewId: kotlin.String? = null,
        val interviewerId: kotlin.String? = null,
        val modifiedAfter: java.time.OffsetDateTime? = null,
        val modifiedBefore: java.time.OffsetDateTime? = null,
        val pageSize: kotlin.Int? = null,
        val remoteFields: kotlin.String? = null,
        val remoteId: kotlin.String? = null,
        val showEnumOrigins: kotlin.String? = null
    )

    data class ScorecardsRetrieveRequest (
        val id: java.util.UUID,
        val expand: kotlin.String? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val remoteFields: kotlin.String? = null,
        val showEnumOrigins: kotlin.String? = null
    )

    /**
    * 
    * Returns a list of &#x60;Scorecard&#x60; objects.
     * @param applicationId If provided, will only return scorecards for this application. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param interviewId If provided, will only return scorecards for this interview. (optional)
     * @param interviewerId If provided, will only return scorecards for this interviewer. (optional)
     * @param modifiedAfter If provided, only objects synced by Merge after this date time will be returned. (optional)
     * @param modifiedBefore If provided, only objects synced by Merge before this date time will be returned. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteFields Deprecated. Use show_enum_origins. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param showEnumOrigins Which fields should be returned in non-normalized form. (optional)
     * @return PaginatedScorecardList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun scorecardsList(requestModel: ScorecardsApi.ScorecardsListRequest): MergePaginatedResponse<Scorecard> {
        return scorecardsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun scorecardsListAsync(requestModel: ScorecardsApi.ScorecardsListRequest): CompletableFuture<MergePaginatedResponse<Scorecard>> = GlobalScope.future {
        scorecardsList(requestModel)
    }

    /**
     * @param applicationId If provided, will only return scorecards for this application. (optional) * @param createdAfter If provided, will only return objects created after this datetime. (optional) * @param createdBefore If provided, will only return objects created before this datetime. (optional) * @param cursor The pagination cursor value. (optional) * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param interviewId If provided, will only return scorecards for this interview. (optional) * @param interviewerId If provided, will only return scorecards for this interviewer. (optional) * @param modifiedAfter If provided, only objects synced by Merge after this date time will be returned. (optional) * @param modifiedBefore If provided, only objects synced by Merge before this date time will be returned. (optional) * @param pageSize Number of results to return per page. (optional) * @param remoteFields Deprecated. Use show_enum_origins. (optional) * @param remoteId The API provider&#39;s ID for the given object. (optional) * @param showEnumOrigins Which fields should be returned in non-normalized form. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun scorecardsListExpanded(requestModel: ScorecardsApi.ScorecardsListRequest): MergePaginatedResponse<Scorecard.Expanded> {
        return scorecardsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun scorecardsListExpandedAsync(requestModel: ScorecardsApi.ScorecardsListRequest): CompletableFuture<MergePaginatedResponse<Scorecard.Expanded>> = GlobalScope.future {
        scorecardsListExpanded(requestModel)
    }

    private suspend inline fun <reified T> scorecardsListImpl(requestModel: ScorecardsApi.ScorecardsListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.applicationId?.apply { localVariableQuery["application_id"] = listOf(this) }
            requestModel.createdAfter?.apply { localVariableQuery["created_after"] = listOf("$this") }
            requestModel.createdBefore?.apply { localVariableQuery["created_before"] = listOf("$this") }
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf(this) }
            requestModel.expand?.apply { localVariableQuery["expand"] = listOf(this) }
            requestModel.includeDeletedData?.apply { localVariableQuery["include_deleted_data"] = listOf("$this") }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.interviewId?.apply { localVariableQuery["interview_id"] = listOf(this) }
            requestModel.interviewerId?.apply { localVariableQuery["interviewer_id"] = listOf(this) }
            requestModel.modifiedAfter?.apply { localVariableQuery["modified_after"] = listOf("$this") }
            requestModel.modifiedBefore?.apply { localVariableQuery["modified_before"] = listOf("$this") }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }
            requestModel.remoteFields?.apply { localVariableQuery["remote_fields"] = listOf(this) }
            requestModel.remoteId?.apply { localVariableQuery["remote_id"] = listOf(this) }
            requestModel.showEnumOrigins?.apply { localVariableQuery["show_enum_origins"] = listOf(this) }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/scorecards",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return request(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

    /**
    * 
    * Returns a &#x60;Scorecard&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param remoteFields Deprecated. Use show_enum_origins. (optional)
     * @param showEnumOrigins Which fields should be returned in non-normalized form. (optional)
     * @return Scorecard
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun scorecardsRetrieve(requestModel: ScorecardsApi.ScorecardsRetrieveRequest): Scorecard {
        return scorecardsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun scorecardsRetrieveAsync(requestModel: ScorecardsApi.ScorecardsRetrieveRequest): CompletableFuture<Scorecard> = GlobalScope.future {
        scorecardsRetrieve(requestModel)
    }

    /**
     * @param id   * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param remoteFields Deprecated. Use show_enum_origins. (optional) * @param showEnumOrigins Which fields should be returned in non-normalized form. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun scorecardsRetrieveExpanded(requestModel: ScorecardsApi.ScorecardsRetrieveRequest): Scorecard.Expanded {
        return scorecardsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun scorecardsRetrieveExpandedAsync(requestModel: ScorecardsApi.ScorecardsRetrieveRequest): CompletableFuture<Scorecard.Expanded> = GlobalScope.future {
        scorecardsRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> scorecardsRetrieveImpl(requestModel: ScorecardsApi.ScorecardsRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.expand?.apply { localVariableQuery["expand"] = listOf(this) }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.remoteFields?.apply { localVariableQuery["remote_fields"] = listOf(this) }
            requestModel.showEnumOrigins?.apply { localVariableQuery["show_enum_origins"] = listOf(this) }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/scorecards/{id}".replace("{" + "id" + "}", "${ requestModel.id }"),
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return request(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

}
