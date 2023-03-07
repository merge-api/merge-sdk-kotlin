
# Item

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**name** | **kotlin.String** | The item&#39;s name. |  [optional]
**status** | [**Status7d1Enum**](Status7d1Enum.md) | The item&#39;s status. |  [optional]
**unitPrice** | **kotlin.Float** | The item&#39;s unit price. |  [optional]
**purchasePrice** | **kotlin.Float** | The price at which the item is purchased from a vendor. |  [optional]
**purchaseAccount** | [**java.util.UUID**](java.util.UUID.md) | References the default account used to record a purchase of the item. |  [optional]
**salesAccount** | [**java.util.UUID**](java.util.UUID.md) | References the default account used to record a sale. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the item belongs to. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s item note was updated. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



