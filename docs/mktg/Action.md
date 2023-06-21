
# Action

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emails** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The marketing emails sent by this action. | 
**messages** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The messages sent by this action. | 
**name** | **kotlin.String** | The action&#39;s name. |  [optional]
**type** | [**TypeEnum**](TypeEnum.md) | The action&#39;s type.  * &#x60;EMAIL&#x60; - EMAIL * &#x60;MESSAGE&#x60; - MESSAGE |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | **kotlin.collections.List&lt;kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;&gt;** |  |  [optional]



