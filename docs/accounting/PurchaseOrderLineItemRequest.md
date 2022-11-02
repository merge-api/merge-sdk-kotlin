
# PurchaseOrderLineItemRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **kotlin.String** | The line item&#39;s description. |  [optional]
**unitPrice** | **kotlin.Float** | The line item&#39;s unit price. |  [optional]
**quantity** | **kotlin.Float** | The line item&#39;s quantity. |  [optional]
**item** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The purchase order line item&#39;s account. |  [optional]
**trackingCategory** | [**java.util.UUID**](java.util.UUID.md) | The purchase order line item&#39;s associated tracking category. |  [optional]
**taxAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The purchase order line item&#39;s tax amount. |  [optional]
**totalLineAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The purchase order line item&#39;s total amount. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



