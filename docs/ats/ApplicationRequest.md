
# ApplicationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**candidate** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**job** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**appliedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the application was submitted. |  [optional]
**rejectedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the application was rejected. |  [optional]
**source** | **kotlin.String** | The application&#39;s source. |  [optional]
**creditedTo** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**currentStage** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**rejectReason** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**customFields** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Custom fields configured for a given model. |  [optional]
**remoteTemplateId** | **kotlin.String** |  |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



