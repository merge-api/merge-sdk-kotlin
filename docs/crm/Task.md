
# Task

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**subject** | **kotlin.String** | The task&#39;s subject. |  [optional]
**content** | **kotlin.String** | The task&#39;s content. |  [optional]
**owner** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**completedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the task is completed. |  [optional]
**dueDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the task is due. |  [optional]
**status** | [**TaskStatusEnum**](TaskStatusEnum.md) | The task&#39;s status. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



