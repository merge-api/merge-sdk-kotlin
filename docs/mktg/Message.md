
# Message

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromName** | **kotlin.String** | The message&#39;s from-name. |  [optional]
**sendDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the message was sent. |  [optional]
**body** | **kotlin.String** | The message&#39;s body. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



