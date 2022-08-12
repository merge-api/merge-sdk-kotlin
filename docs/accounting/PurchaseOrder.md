
# PurchaseOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**status** | [**PurchaseOrderStatusEnum**](PurchaseOrderStatusEnum.md) | The purchase order&#39;s status. |  [optional]
**issueDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The purchase order&#39;s issue date. |  [optional]
**deliveryDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The purchase order&#39;s delivery date. |  [optional]
**deliveryAddress** | [**java.util.UUID**](java.util.UUID.md) | The purchase order&#39;s delivery address. |  [optional]
**customer** | [**java.util.UUID**](java.util.UUID.md) | The purchase order&#39;s customer. |  [optional]
**vendor** | [**java.util.UUID**](java.util.UUID.md) | The purchase_order&#39;s vendor. |  [optional]
**memo** | **kotlin.String** | A memo attached to the purchase order. |  [optional]
**totalAmount** | **kotlin.Float** | The purchase order&#39;s total amount. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The purchase order&#39;s currency. |  [optional]
**lineItems** | [**kotlin.collections.List&lt;PurchaseOrderLineItem&gt;**](PurchaseOrderLineItem.md) |  |  [optional] [readonly]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s purchase order note was created. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s purchase order note was updated. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



