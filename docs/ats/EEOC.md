
# EEOC

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**candidate** | [**java.util.UUID**](java.util.UUID.md) | The candidate being represented. |  [optional]
**submittedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the information was submitted. |  [optional]
**race** | [**RaceEnum**](RaceEnum.md) | The candidate&#39;s race. |  [optional]
**gender** | [**GenderEnum**](GenderEnum.md) | The candidate&#39;s gender. |  [optional]
**veteranStatus** | [**VeteranStatusEnum**](VeteranStatusEnum.md) | The candidate&#39;s veteran status. |  [optional]
**disabilityStatus** | [**DisabilityStatusEnum**](DisabilityStatusEnum.md) | The candidate&#39;s disability status. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



