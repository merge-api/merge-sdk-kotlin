
# PurchaseOrderRequest

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
**lineItems** | [**kotlin.collections.List&lt;PurchaseOrderLineItemRequest&gt;**](PurchaseOrderLineItemRequest.md) |  |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



