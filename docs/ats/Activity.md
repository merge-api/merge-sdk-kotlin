
# Activity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**user** | [**java.util.UUID**](java.util.UUID.md) | The user that performed the action. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s activity was created. |  [optional]
**activityType** | [**ActivityTypeEnum**](ActivityTypeEnum.md) | The activity&#39;s type.  * &#x60;NOTE&#x60; - NOTE * &#x60;EMAIL&#x60; - EMAIL * &#x60;OTHER&#x60; - OTHER |  [optional]
**subject** | **kotlin.String** | The activity&#39;s subject. |  [optional]
**body** | **kotlin.String** | The activity&#39;s body. |  [optional]
**visibility** | [**VisibilityEnum**](VisibilityEnum.md) | The activity&#39;s visibility.  * &#x60;ADMIN_ONLY&#x60; - ADMIN_ONLY * &#x60;PUBLIC&#x60; - PUBLIC * &#x60;PRIVATE&#x60; - PRIVATE |  [optional]
**candidate** | **kotlin.String** | The activity’s candidate. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



