
# VendorCredit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**number** | **kotlin.String** | The vendor credit&#39;s number. |  [optional]
**transactionDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The vendor credit&#39;s transaction date. |  [optional]
**vendor** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**totalAmount** | **kotlin.Float** | The vendor credit&#39;s total amount. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The vendor credit&#39;s currency. |  [optional]
**lines** | [**kotlin.collections.List&lt;VendorCreditLine&gt;**](VendorCreditLine.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



