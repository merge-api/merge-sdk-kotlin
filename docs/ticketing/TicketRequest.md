
# TicketRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**name** | **kotlin.String** | The ticket&#39;s name. |  [optional]
**assignees** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**creator** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**dueDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The ticket&#39;s due date. |  [optional]
**status** | [**TicketStatusEnum**](TicketStatusEnum.md) | The current status of the ticket. |  [optional]
**description** | **kotlin.String** | The ticket’s description. HTML version of description is mapped if supported by the third-party platform. |  [optional]
**project** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**ticketType** | **kotlin.String** | The ticket&#39;s type. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**parentTicket** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**attachments** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s ticket was created. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s ticket was updated. |  [optional]
**completedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the ticket was completed. |  [optional]
**ticketUrl** | [**java.net.URI**](java.net.URI.md) | The 3rd party url of the Ticket. |  [optional]
**priority** | [**PriorityEnum**](PriorityEnum.md) | The priority or urgency of the Ticket. Possible values include: URGENT, HIGH, NORMAL, LOW - in cases where there is no clear mapping - the original value passed through. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



