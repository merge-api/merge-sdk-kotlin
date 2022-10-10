
# JournalEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**transactionDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The journal entry&#39;s transaction date. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s journal entry was created. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s journal entry was updated. |  [optional]
**payments** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Array of &#x60;Payment&#x60; object IDs. |  [optional]
**memo** | **kotlin.String** | The journal entry&#39;s private note. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The journal&#39;s currency. |  [optional]
**lines** | [**kotlin.collections.List&lt;JournalLine&gt;**](JournalLine.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]



