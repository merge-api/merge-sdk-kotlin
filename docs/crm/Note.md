
# Note

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**owner** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**content** | **kotlin.String** | The note&#39;s content. |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**opportunity** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s lead was updated. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s lead was created. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]



