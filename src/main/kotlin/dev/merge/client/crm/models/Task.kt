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

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * # The Task Object ### Description The `Task` object is used to represent a task in the remote system. ### Usage Example TODO
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param subject The task's subject.
 * @param content The task's content.
 * @param owner 
 * @param account 
 * @param completedDate When the task is completed.
 * @param dueDate When the task is due.
 * @param status The task's status.
 * @param remoteData 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

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

    @field:JsonProperty("owner")
    val owner: java.util.UUID? = null,

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
    val remoteWasDeleted: kotlin.Boolean? = null

)
