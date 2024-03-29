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
import dev.merge.client.crm.models.RemoteField
import dev.merge.client.crm.models.TaskStatusEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Task Object ### Description The `Task` object is used to represent a task, such as a to-do item. ### Usage Example TODO
 *
 * @param subject The task's subject.
 * @param content The task's content.
 * @param owner The task's owner.
 * @param account The task's account.
 * @param opportunity The task's opportunity.
 * @param completedDate When the task is completed.
 * @param dueDate When the task is due.
 * @param status The task's status.  * `OPEN` - OPEN * `CLOSED` - CLOSED
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param modifiedAt This is the datetime that this object was last updated by Merge
 * @param fieldMappings 
 * @param remoteData 
 * @param remoteFields 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Task (

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

    /* The task's opportunity. */
    @field:JsonProperty("opportunity")
    val opportunity: java.util.UUID? = null,

    /* When the task is completed. */
    @field:JsonProperty("completed_date")
    val completedDate: java.time.OffsetDateTime? = null,

    /* When the task is due. */
    @field:JsonProperty("due_date")
    val dueDate: java.time.OffsetDateTime? = null,

    /* The task's status.  * `OPEN` - OPEN * `CLOSED` - CLOSED */
    @field:JsonProperty("status")
    val status: TaskStatusEnum? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null,

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* This is the datetime that this object was last updated by Merge */
    @field:JsonProperty("modified_at")
    val modifiedAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("field_mappings")
    val fieldMappings: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    @field:JsonProperty("remote_fields")
    val remoteFields: kotlin.collections.List<RemoteField>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("subject")
        val subject: JsonNode?,

        @field:JsonProperty("content")
        val content: JsonNode?,

        @field:JsonProperty("owner")
        val owner: JsonNode?,

        @field:JsonProperty("account")
        val account: JsonNode?,

        @field:JsonProperty("opportunity")
        val opportunity: JsonNode?,

        @field:JsonProperty("completed_date")
        val completedDate: JsonNode?,

        @field:JsonProperty("due_date")
        val dueDate: JsonNode?,

        @field:JsonProperty("status")
        val status: JsonNode?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?,

        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("modified_at")
        val modifiedAt: JsonNode?,

        @field:JsonProperty("field_mappings")
        val fieldMappings: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_fields")
        val remoteFields: kotlin.collections.List<JsonNode>?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Task.Expanded): Task {
            return Task(
                subject = ApiClient.jsonConvertSafe(expanded.subject),
                content = ApiClient.jsonConvertSafe(expanded.content),
                owner = ApiClient.jsonConvertSafe(expanded.owner),
                account = ApiClient.jsonConvertSafe(expanded.account),
                opportunity = ApiClient.jsonConvertSafe(expanded.opportunity),
                completedDate = ApiClient.jsonConvertSafe(expanded.completedDate),
                dueDate = ApiClient.jsonConvertSafe(expanded.dueDate),
                status = ApiClient.jsonConvertSafe(expanded.status),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted),
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                modifiedAt = ApiClient.jsonConvertSafe(expanded.modifiedAt),
                fieldMappings = ApiClient.jsonConvertSafe(expanded.fieldMappings),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                remoteFields = ApiClient.jsonConvertSafe(expanded.remoteFields)
            )
        }
    }
}

