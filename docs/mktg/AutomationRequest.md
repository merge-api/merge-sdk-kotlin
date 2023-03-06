
# AutomationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The actions performed by this automation. | 
**name** | **kotlin.String** | The automation&#39;s name. |  [optional]
**triggerType** | [**TriggerTypeEnum**](TriggerTypeEnum.md) | The trigger type for running this automation. |  [optional]
**startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The automation&#39;s start date. |  [optional]
**endDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The automation&#39;s end date. |  [optional]
**description** | **kotlin.String** | The automation’s description. |  [optional]
**status** | **kotlin.String** | The automation&#39;s status. |  [optional]
**automationTrigger** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | The trigger configuraton for the automation. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



