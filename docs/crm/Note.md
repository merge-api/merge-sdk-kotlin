
# Note

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**owner** | [**java.util.UUID**](java.util.UUID.md) | The note&#39;s owner. |  [optional]
**content** | **kotlin.String** | The note&#39;s content. |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) | The note&#39;s contact. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The note&#39;s account. |  [optional]
**opportunity** | [**java.util.UUID**](java.util.UUID.md) | The note&#39;s opportunity. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s lead was updated. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s lead was created. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteFields** | [**kotlin.collections.List&lt;RemoteField&gt;**](RemoteField.md) |  |  [optional] [readonly]



