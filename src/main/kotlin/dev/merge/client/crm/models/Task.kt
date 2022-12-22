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

import dev.merge.client.shared.RemoteData
import dev.merge.client.crm.models.TaskStatusEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Task Object ### Description The `Task` object is used to represent a task in the remote system. ### Usage Example TODO
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param subject The task's subject.
 * @param content The task's content.
 * @param owner The task's owner.
 * @param account The task's account.
 * @param completedDate When the task is completed.
 * @param dueDate When the task is due.
 * @param status The task's status.
 * @param remoteData 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 * @param fieldMappings 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Task (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The task's subject. */
    @field:JsonProperty("subject")
    val subject: kotlin.String? = null,

    /* The task's content. */
    @field:JsonProperty("content")
    val content: kotlin.String? = null,

    /* The task's owner. */
    @field:JsonProperty("owner")
    val owner: java.util.UUID? = null,

    /* The task's account. */
    @field:JsonProperty("account")
    val account: java.util.UUID? = null,

    /* When the task is completed. */
    @field:JsonProperty("completed_date")
    val completedDate: java.time.OffsetDateTime? = null,

    /* When the task is due. */
    @field:JsonProperty("due_date")
    val dueDate: java.time.OffsetDateTime? = null,

    /* The task's status. */
    @field:JsonProperty("status")
    val status: TaskStatusEnum? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null,

    @field:JsonProperty("field_mappings")
    val fieldMappings: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("subject")
        val subject: JsonNode?,

        @field:JsonProperty("content")
        val content: JsonNode?,

        @field:JsonProperty("owner")
        val owner: JsonNode?,

        @field:JsonProperty("account")
        val account: JsonNode?,

        @field:JsonProperty("completed_date")
        val completedDate: JsonNode?,

        @field:JsonProperty("due_date")
        val dueDate: JsonNode?,

        @field:JsonProperty("status")
        val status: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?,

        @field:JsonProperty("field_mappings")
        val fieldMappings: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Task.Expanded): Task {
            return Task(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                subject = ApiClient.jsonConvertSafe(expanded.subject),
                content = ApiClient.jsonConvertSafe(expanded.content),
                owner = ApiClient.jsonConvertSafe(expanded.owner),
                account = ApiClient.jsonConvertSafe(expanded.account),
                completedDate = ApiClient.jsonConvertSafe(expanded.completedDate),
                dueDate = ApiClient.jsonConvertSafe(expanded.dueDate),
                status = ApiClient.jsonConvertSafe(expanded.status),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted),
                fieldMappings = ApiClient.jsonConvertSafe(expanded.fieldMappings)
            )
        }
    }
}

