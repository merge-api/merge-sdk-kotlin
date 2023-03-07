
# VendorCredit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**number** | **kotlin.String** | The vendor credit&#39;s number. |  [optional]
**transactionDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The vendor credit&#39;s transaction date. |  [optional]
**vendor** | [**java.util.UUID**](java.util.UUID.md) | The vendor that owes the gift or refund. |  [optional]
**totalAmount** | **kotlin.Float** | The vendor credit&#39;s total amount. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The vendor credit&#39;s currency. |  [optional]
**exchangeRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The vendor credit&#39;s exchange rate. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the vendor credit belongs to. |  [optional]
**lines** | [**kotlin.collections.List&lt;VendorCreditLine&gt;**](VendorCreditLine.md) |  |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



