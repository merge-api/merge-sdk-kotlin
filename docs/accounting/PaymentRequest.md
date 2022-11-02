
# PaymentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**transactionDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The payment&#39;s transaction date. |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**totalAmount** | **kotlin.Float** | The payment&#39;s total amount. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s payment entry was updated. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



