
# Task

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subject** | **kotlin.String** | The task&#39;s subject. |  [optional]
**content** | **kotlin.String** | The task&#39;s content. |  [optional]
**owner** | [**java.util.UUID**](java.util.UUID.md) | The task&#39;s owner. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The task&#39;s account. |  [optional]
**opportunity** | [**java.util.UUID**](java.util.UUID.md) | The task&#39;s opportunity. |  [optional]
**completedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the task is completed. |  [optional]
**dueDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the task is due. |  [optional]
**status** | [**TaskStatusEnum**](TaskStatusEnum.md) | The task&#39;s status.  * &#x60;OPEN&#x60; - OPEN * &#x60;CLOSED&#x60; - CLOSED |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteFields** | [**kotlin.collections.List&lt;RemoteField&gt;**](RemoteField.md) |  |  [optional] [readonly]



