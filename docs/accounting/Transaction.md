
# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionType** | **kotlin.String** | The type of transaction, which can by any transaction object not already included in Merge’s common model. |  [optional]
**number** | **kotlin.String** | The transaction&#39;s number used for identifying purposes. |  [optional]
**transactionDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date upon which the transaction occurred. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The transaction&#39;s account. |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) | The contact to whom the transaction relates to. |  [optional]
**totalAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The total amount being paid after taxes. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The transaction&#39;s currency. |  [optional]
**exchangeRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The transaction&#39;s exchange rate. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the transaction belongs to. |  [optional]
**lineItems** | [**kotlin.collections.List&lt;TransactionLineItem&gt;**](TransactionLineItem.md) |  |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



