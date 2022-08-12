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

import dev.merge.client.ats.models.CategoryEnum

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param id 
 * @param integration 
 * @param integrationSlug 
 * @param category 
 * @param endUserOriginId 
 * @param endUserOrganizationName 
 * @param endUserEmailAddress 
 * @param status 
 * @param webhookListenerUrl 
 * @param isDuplicate Whether a Production Linked Account's credentials match another existing Production Linked Account. This field is `null` for Test Linked Accounts, incomplete Production Linked Accounts, and ignored duplicate Production Linked Account sets.
 */

data class AccountDetails (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    @field:JsonProperty("integration")
    val integration: kotlin.String? = null,

    @field:JsonProperty("integration_slug")
    val integrationSlug: kotlin.String? = null,

    @field:JsonProperty("category")
    val category: CategoryEnum? = null,

    @field:JsonProperty("end_user_origin_id")
    val endUserOriginId: kotlin.String? = null,

    @field:JsonProperty("end_user_organization_name")
    val endUserOrganizationName: kotlin.String? = null,

    @field:JsonProperty("end_user_email_address")
    val endUserEmailAddress: kotlin.String? = null,

    @field:JsonProperty("status")
    val status: kotlin.String? = null,

    @field:JsonProperty("webhook_listener_url")
    val webhookListenerUrl: java.net.URI? = null,

    /* Whether a Production Linked Account's credentials match another existing Production Linked Account. This field is `null` for Test Linked Accounts, incomplete Production Linked Accounts, and ignored duplicate Production Linked Account sets. */
    @field:JsonProperty("is_duplicate")
    val isDuplicate: kotlin.Boolean? = null

)

