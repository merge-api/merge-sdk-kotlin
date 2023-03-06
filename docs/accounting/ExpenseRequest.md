
# ExpenseRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the transaction occurred. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The expense&#39;s payment account. |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) | The expense&#39;s contact. |  [optional]
**totalAmount** | **kotlin.Float** | The expense&#39;s total amount. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The expense&#39;s currency. |  [optional]
**exchangeRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The expense&#39;s exchange rate. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the expense belongs to. |  [optional]
**memo** | **kotlin.String** | The expense&#39;s private note. |  [optional]
**lines** | [**kotlin.collections.List&lt;ExpenseLineRequest&gt;**](ExpenseLineRequest.md) |  |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



