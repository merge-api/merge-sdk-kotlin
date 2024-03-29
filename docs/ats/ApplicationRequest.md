
# ApplicationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**candidate** | [**java.util.UUID**](java.util.UUID.md) | The candidate applying. |  [optional]
**job** | [**java.util.UUID**](java.util.UUID.md) | The job being applied for. |  [optional]
**appliedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the application was submitted. |  [optional]
**rejectedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the application was rejected. |  [optional]
**source** | **kotlin.String** | The application&#39;s source. |  [optional]
**creditedTo** | [**java.util.UUID**](java.util.UUID.md) | The user credited for this application. |  [optional]
**currentStage** | [**java.util.UUID**](java.util.UUID.md) | The application&#39;s current stage. |  [optional]
**rejectReason** | [**java.util.UUID**](java.util.UUID.md) | The application&#39;s reason for rejection. |  [optional]
**remoteTemplateId** | **kotlin.String** |  |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



