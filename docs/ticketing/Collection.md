
# Collection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**name** | **kotlin.String** | The collection&#39;s name. |  [optional]
**description** | **kotlin.String** | The collection&#39;s description. |  [optional]
**collectionType** | [**CollectionTypeEnum**](CollectionTypeEnum.md) | The collection&#39;s type. |  [optional]
**parentCollection** | [**java.util.UUID**](java.util.UUID.md) | The parent collection for this collection. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]



