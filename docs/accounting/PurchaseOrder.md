
# PurchaseOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**PurchaseOrderStatusEnum**](PurchaseOrderStatusEnum.md) | The purchase order&#39;s status. |  [optional]
**issueDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The purchase order&#39;s issue date. |  [optional]
**deliveryDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The purchase order&#39;s delivery date. |  [optional]
**deliveryAddress** | [**java.util.UUID**](java.util.UUID.md) | The purchase order&#39;s delivery address. |  [optional]
**customer** | [**java.util.UUID**](java.util.UUID.md) | The contact making the purchase order. |  [optional]
**vendor** | [**java.util.UUID**](java.util.UUID.md) | The party fulfilling the purchase order. |  [optional]
**memo** | **kotlin.String** | A memo attached to the purchase order. |  [optional]
**totalAmount** | **kotlin.Float** | The purchase order&#39;s total amount. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The purchase order&#39;s currency. |  [optional]
**exchangeRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The purchase order&#39;s exchange rate. |  [optional]
**lineItems** | [**kotlin.collections.List&lt;PurchaseOrderLineItem&gt;**](PurchaseOrderLineItem.md) |  |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s purchase order note was created. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s purchase order note was updated. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



