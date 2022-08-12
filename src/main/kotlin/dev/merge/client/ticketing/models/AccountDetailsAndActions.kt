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

import dev.merge.client.ticketing.models.AccountDetailsAndActionsIntegration
import dev.merge.client.ticketing.models.AccountDetailsAndActionsStatusEnum
import dev.merge.client.ticketing.models.CategoryEnum

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * # The LinkedAccount Object ### Description The `LinkedAccount` object is used to represent an end user's link with a specific integration.  ### Usage Example View a list of your organization's `LinkedAccount` objects.
 *
 * @param id 
 * @param status 
 * @param endUserOrganizationName 
 * @param endUserEmailAddress 
 * @param webhookListenerUrl 
 * @param category 
 * @param statusDetail 
 * @param endUserOriginId 
 * @param isDuplicate Whether a Production Linked Account's credentials match another existing Production Linked Account. This field is `null` for Test Linked Accounts, incomplete Production Linked Accounts, and ignored duplicate Production Linked Account sets.
 * @param integration 
 */

data class AccountDetailsAndActions (

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("status")
    val status: AccountDetailsAndActionsStatusEnum?,

    @field:JsonProperty("end_user_organization_name")
    val endUserOrganizationName: kotlin.String,

    @field:JsonProperty("end_user_email_address")
    val endUserEmailAddress: kotlin.String,

    @field:JsonProperty("webhook_listener_url")
    val webhookListenerUrl: kotlin.String,

    @field:JsonProperty("category")
    val category: CategoryEnum? = null,

    @field:JsonProperty("status_detail")
    val statusDetail: kotlin.String? = null,

    @field:JsonProperty("end_user_origin_id")
    val endUserOriginId: kotlin.String? = null,

    /* Whether a Production Linked Account's credentials match another existing Production Linked Account. This field is `null` for Test Linked Accounts, incomplete Production Linked Accounts, and ignored duplicate Production Linked Account sets. */
    @field:JsonProperty("is_duplicate")
    val isDuplicate: kotlin.Boolean? = null,

    @field:JsonProperty("integration")
    val integration: AccountDetailsAndActionsIntegration? = null

)

