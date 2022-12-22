
# Expense

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**transactionDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the transaction occurred. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the expense was created. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The expense&#39;s payment account. |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) | The expense&#39;s contact. |  [optional]
**totalAmount** | **kotlin.Float** | The expense&#39;s total amount. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The expense&#39;s currency. |  [optional]
**exchangeRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The expense&#39;s exchange rate. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the expense belongs to. |  [optional]
**memo** | **kotlin.String** | The expense&#39;s private note. |  [optional]
**lines** | [**kotlin.collections.List&lt;ExpenseLine&gt;**](ExpenseLine.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]



