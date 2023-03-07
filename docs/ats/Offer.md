
# Offer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**application** | [**java.util.UUID**](java.util.UUID.md) | The application who is receiving the offer. |  [optional]
**creator** | [**java.util.UUID**](java.util.UUID.md) | The user who created the offer. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s offer was created. |  [optional]
**closedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the offer was closed. |  [optional]
**sentAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the offer was sent. |  [optional]
**startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The employment start date on the offer. |  [optional]
**status** | [**OfferStatusEnum**](OfferStatusEnum.md) | The offer&#39;s status. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



