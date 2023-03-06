
# CreditNote

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**transactionDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The credit note&#39;s transaction date. |  [optional]
**status** | [**CreditNoteStatusEnum**](CreditNoteStatusEnum.md) | The credit note&#39;s status. |  [optional]
**number** | **kotlin.String** | The credit note&#39;s number. |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) | The credit note&#39;s contact. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the credit note belongs to. |  [optional]
**totalAmount** | **kotlin.Float** | The credit note&#39;s total amount. |  [optional]
**remainingCredit** | **kotlin.Float** | The amount of value remaining in the credit note that the customer can use. |  [optional]
**lineItems** | [**kotlin.collections.List&lt;CreditNoteLineItem&gt;**](CreditNoteLineItem.md) |  |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The credit note&#39;s currency. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s credit note was created. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s credit note was updated. |  [optional]
**payments** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Array of &#x60;Payment&#x60; object IDs |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



