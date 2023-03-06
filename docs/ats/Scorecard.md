
# Scorecard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**application** | [**java.util.UUID**](java.util.UUID.md) | The application being scored. |  [optional]
**interview** | [**java.util.UUID**](java.util.UUID.md) | The interview being scored. |  [optional]
**interviewer** | [**java.util.UUID**](java.util.UUID.md) | The interviewer doing the scoring. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s scorecard was created. |  [optional]
**submittedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the scorecard was submitted. |  [optional]
**overallRecommendation** | [**OverallRecommendationEnum**](OverallRecommendationEnum.md) | The inteviewer&#39;s recommendation. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



