
# Application

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**candidate** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**job** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**appliedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the application was submitted. |  [optional]
**rejectedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the application was rejected. |  [optional]
**source** | **kotlin.String** | The application&#39;s source. |  [optional]
**creditedTo** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**currentStage** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**rejectReason** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**customFields** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Custom fields configured for a given model. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]



