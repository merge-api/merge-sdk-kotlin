
# EngagementRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**owner** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**content** | **kotlin.String** | The engagement&#39;s content. |  [optional]
**subject** | **kotlin.String** | The engagement&#39;s subject. |  [optional]
**direction** | [**DirectionEnum**](DirectionEnum.md) | The engagement&#39;s direction. |  [optional]
**engagementType** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**startTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The time at which the engagement started. |  [optional]
**endTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The time at which the engagement ended. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



