
# Collection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**name** | **kotlin.String** | The collection&#39;s name. |  [optional]
**description** | **kotlin.String** | The collection&#39;s description. |  [optional]
**collectionType** | [**CollectionTypeEnum**](CollectionTypeEnum.md) | The collection&#39;s type.  * &#x60;LIST&#x60; - LIST * &#x60;PROJECT&#x60; - PROJECT |  [optional]
**parentCollection** | [**java.util.UUID**](java.util.UUID.md) | The parent collection for this collection. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



