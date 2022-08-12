
# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**transactionType** | **kotlin.String** | The type of general transaction. |  [optional]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**number** | **kotlin.String** | The transaction number. |  [optional]
**transactionDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The transaction date. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The transaction&#39;s account. |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) | The transaction&#39;s contact. |  [optional]
**totalAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The transaction&#39;s total amount. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The transaction&#39;s currency. |  [optional]
**lineItems** | [**kotlin.collections.List&lt;TransactionLineItem&gt;**](TransactionLineItem.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



