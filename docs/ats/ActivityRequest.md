
# ActivityRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user** | [**java.util.UUID**](java.util.UUID.md) | The user that performed the action. |  [optional]
**activityType** | [**ActivityTypeEnum**](ActivityTypeEnum.md) | The activity&#39;s type.  * &#x60;NOTE&#x60; - NOTE * &#x60;EMAIL&#x60; - EMAIL * &#x60;OTHER&#x60; - OTHER |  [optional]
**subject** | **kotlin.String** | The activity&#39;s subject. |  [optional]
**body** | **kotlin.String** | The activity&#39;s body. |  [optional]
**visibility** | [**VisibilityEnum**](VisibilityEnum.md) | The activity&#39;s visibility.  * &#x60;ADMIN_ONLY&#x60; - ADMIN_ONLY * &#x60;PUBLIC&#x60; - PUBLIC * &#x60;PRIVATE&#x60; - PRIVATE |  [optional]
**candidate** | **kotlin.String** | The activity’s candidate. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



