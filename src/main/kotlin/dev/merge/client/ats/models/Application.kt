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

import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * # The Application Object ### Description The `Application` object is used to represent an Application for a job position. This is separate from the Candidate object, although some systems may only allow a Candidate to have one Application.  Please note: Application objects are constructed if the object does not exist in the remote system.  ### Usage Example Fetch from the `LIST Applications` endpoint and filter by `ID` to show all applications.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param candidate 
 * @param job 
 * @param appliedAt When the application was submitted.
 * @param rejectedAt When the application was rejected.
 * @param source The application's source.
 * @param creditedTo 
 * @param currentStage 
 * @param rejectReason 
 * @param remoteData 
 * @param customFields Custom fields configured for a given model.
 * @param remoteWasDeleted 
 */

data class Application (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("candidate")
    val candidate: java.util.UUID? = null,

    @field:JsonProperty("job")
    val job: java.util.UUID? = null,

    /* When the application was submitted. */
    @field:JsonProperty("applied_at")
    val appliedAt: java.time.OffsetDateTime? = null,

    /* When the application was rejected. */
    @field:JsonProperty("rejected_at")
    val rejectedAt: java.time.OffsetDateTime? = null,

    /* The application's source. */
    @field:JsonProperty("source")
    val source: kotlin.String? = null,

    @field:JsonProperty("credited_to")
    val creditedTo: java.util.UUID? = null,

    @field:JsonProperty("current_stage")
    val currentStage: java.util.UUID? = null,

    @field:JsonProperty("reject_reason")
    val rejectReason: java.util.UUID? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* Custom fields configured for a given model. */
    @field:JsonProperty("custom_fields")
    val customFields: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null

)

