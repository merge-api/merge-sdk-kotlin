/**
 * Merge Ticketing API
 *
 * The unified API for building rich integrations with multiple Ticketing platforms.
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

package dev.merge.client.ticketing.models

import dev.merge.client.ticketing.models.TicketStatusEnum

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * # The Ticket Object ### Description The `Ticket` object is used to represent a ticket or a task within a system.  ### Usage Example TODO
 *
 * @param remoteId The third-party API ID of the matching object.
 * @param name The ticket's name.
 * @param assignees 
 * @param dueDate The ticket's due date.
 * @param status The current status of the ticket.
 * @param description The ticket's description.
 * @param project 
 * @param ticketType The ticket's type.
 * @param account 
 * @param contact 
 * @param parentTicket 
 * @param attachments 
 * @param tags 
 * @param remoteCreatedAt When the third party's ticket was created.
 * @param remoteUpdatedAt When the third party's ticket was updated.
 */

data class TicketRequest (

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The ticket's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("assignees")
    val assignees: kotlin.collections.List<java.util.UUID>? = null,

    /* The ticket's due date. */
    @field:JsonProperty("due_date")
    val dueDate: java.time.OffsetDateTime? = null,

    /* The current status of the ticket. */
    @field:JsonProperty("status")
    val status: TicketStatusEnum? = null,

    /* The ticket's description. */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("project")
    val project: java.util.UUID? = null,

    /* The ticket's type. */
    @field:JsonProperty("ticket_type")
    val ticketType: kotlin.String? = null,

    @field:JsonProperty("account")
    val account: java.util.UUID? = null,

    @field:JsonProperty("contact")
    val contact: java.util.UUID? = null,

    @field:JsonProperty("parent_ticket")
    val parentTicket: java.util.UUID? = null,

    @field:JsonProperty("attachments")
    val attachments: kotlin.collections.List<java.util.UUID>? = null,

    @field:JsonProperty("tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    /* When the third party's ticket was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    /* When the third party's ticket was updated. */
    @field:JsonProperty("remote_updated_at")
    val remoteUpdatedAt: java.time.OffsetDateTime? = null

)

