
# PurchaseOrderLineItemRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trackingCategories** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The purchase order line item&#39;s associated tracking categories. | 
**description** | **kotlin.String** | A description of the good being purchased. |  [optional]
**unitPrice** | **kotlin.Float** | The line item&#39;s unit price. |  [optional]
**quantity** | **kotlin.Float** | The line item&#39;s quantity. |  [optional]
**item** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The purchase order line item&#39;s account. |  [optional]
**trackingCategory** | [**java.util.UUID**](java.util.UUID.md) | The purchase order line item&#39;s associated tracking category. |  [optional]
**taxAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The purchase order line item&#39;s tax amount. |  [optional]
**totalLineAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The purchase order line item&#39;s total amount. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The purchase order line item&#39;s currency. |  [optional]
**exchangeRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The purchase order line item&#39;s exchange rate. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the purchase order line item belongs to. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



