
# Payment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**transactionDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The payment&#39;s transaction date. |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**totalAmount** | **kotlin.Float** | The payment&#39;s total amount. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s payment entry was updated. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



