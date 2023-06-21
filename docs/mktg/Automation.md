
# Automation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The actions performed by this automation. | 
**name** | **kotlin.String** | The automation&#39;s name. |  [optional]
**triggerType** | [**TriggerTypeEnum**](TriggerTypeEnum.md) | The trigger type for running this automation.  * &#x60;TRIGGER_EVENT&#x60; - TRIGGER_EVENT * &#x60;RECURRENCE&#x60; - RECURRENCE |  [optional]
**startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The automation&#39;s start date. |  [optional]
**endDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The automation&#39;s end date. |  [optional]
**description** | **kotlin.String** | The automation’s description. |  [optional]
**status** | **kotlin.String** | The automation&#39;s status. |  [optional]
**automationTrigger** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | The trigger configuraton for the automation. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | **kotlin.collections.List&lt;kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;&gt;** |  |  [optional]



