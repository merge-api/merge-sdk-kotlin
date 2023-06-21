
# PatchedTaskRequest

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
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**remoteFields** | [**kotlin.collections.List&lt;RemoteFieldRequest&gt;**](RemoteFieldRequest.md) |  |  [optional]



