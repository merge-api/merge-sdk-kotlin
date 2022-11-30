
# InvoiceLineItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**description** | **kotlin.String** | The line item&#39;s description. |  [optional]
**unitPrice** | **kotlin.Float** | The line item&#39;s unit price. |  [optional]
**quantity** | **kotlin.Float** | The line item&#39;s quantity. |  [optional]
**totalAmount** | **kotlin.Float** | The line item&#39;s total amount. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The line item&#39;s currency. |  [optional]
**exchangeRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The line item&#39;s exchange rate. |  [optional]
**item** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**trackingCategory** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the line item belongs to. |  [optional]



