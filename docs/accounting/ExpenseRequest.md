
# ExpenseRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**transactionDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the transaction occurred. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the expense was created. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**totalAmount** | **kotlin.Float** | The expense&#39;s total amount. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The expense&#39;s currency. |  [optional]
**memo** | **kotlin.String** | The expense&#39;s private note. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



