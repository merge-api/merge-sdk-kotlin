
# EngagementRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**owner** | [**java.util.UUID**](java.util.UUID.md) | The engagement&#39;s owner. |  [optional]
**content** | **kotlin.String** | The engagement&#39;s content. |  [optional]
**subject** | **kotlin.String** | The engagement&#39;s subject. |  [optional]
**direction** | [**DirectionEnum**](DirectionEnum.md) | The engagement&#39;s direction. |  [optional]
**engagementType** | [**java.util.UUID**](java.util.UUID.md) | The engagement type of the engagement. |  [optional]
**startTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The time at which the engagement started. |  [optional]
**endTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The time at which the engagement ended. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The account of the engagement. |  [optional]
**contacts** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



