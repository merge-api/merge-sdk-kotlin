
# PaymentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The payment&#39;s transaction date. |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) | The supplier, or customer involved in the payment. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The supplier’s or customer’s account in which the payment is made. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The payment&#39;s currency. |  [optional]
**exchangeRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The payment&#39;s exchange rate. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the payment belongs to. |  [optional]
**totalAmount** | **kotlin.Float** | The total amount of money being paid to the supplier, or customer, after taxes. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



