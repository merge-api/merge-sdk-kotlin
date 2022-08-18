
# Engagement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**owner** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**content** | **kotlin.String** | The engagement&#39;s content. |  [optional]
**subject** | **kotlin.String** | The engagement&#39;s subject. |  [optional]
**direction** | [**DirectionEnum**](DirectionEnum.md) | The engagement&#39;s direction. |  [optional]
**engagementType** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**startTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The time at which the engagement started. |  [optional]
**endTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The time at which the engagement ended. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



