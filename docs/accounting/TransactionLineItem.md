
# TransactionLineItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**memo** | **kotlin.String** | A memo attached to the line item. |  [optional]
**unitPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The line item&#39;s unit price. |  [optional]
**quantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The line item&#39;s quantity. |  [optional]
**item** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The line item&#39;s account. |  [optional]
**trackingCategory** | [**java.util.UUID**](java.util.UUID.md) | The line&#39;s associated tracking category. |  [optional]
**totalLineAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The line item&#39;s total. |  [optional]
**taxRate** | [**java.util.UUID**](java.util.UUID.md) | The line item&#39;s tax rate. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The line item&#39;s currency. |  [optional]
**exchangeRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The line item&#39;s exchange rate. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the line belongs to. |  [optional]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]



