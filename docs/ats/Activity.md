
# Activity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**user** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s activity was created. |  [optional]
**activityType** | [**ActivityTypeEnum**](ActivityTypeEnum.md) | The activity&#39;s type. |  [optional]
**subject** | **kotlin.String** | The activity&#39;s subject. |  [optional]
**body** | **kotlin.String** | The activity&#39;s body. |  [optional]
**visibility** | [**VisibilityEnum**](VisibilityEnum.md) | The activity&#39;s visibility. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



