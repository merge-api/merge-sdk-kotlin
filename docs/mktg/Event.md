
# Event

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emails** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The marketing emails about this event. | 
**messages** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The messages about this event. | 
**name** | **kotlin.String** | The event&#39;s name. |  [optional]
**description** | **kotlin.String** | The event&#39;s description. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the event was created in the remote system. |  [optional]
**startTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the event starts. |  [optional]
**endTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the event ends. |  [optional]
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]



