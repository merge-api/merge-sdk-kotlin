
# TransactionLineItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trackingCategories** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The line&#39;s associated tracking categories. | 
**memo** | **kotlin.String** | An internal note used by the business to clarify purpose of the transaction. |  [optional]
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



