
# JournalEntryRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The journal entry&#39;s transaction date. |  [optional]
**payments** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Array of &#x60;Payment&#x60; object IDs. |  [optional]
**memo** | **kotlin.String** | The journal entry&#39;s private note. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The journal&#39;s currency. |  [optional]
**exchangeRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The journal entry&#39;s exchange rate. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the journal entry belongs to. |  [optional]
**lines** | [**kotlin.collections.List&lt;JournalLineRequest&gt;**](JournalLineRequest.md) |  |  [optional]
**postingStatus** | [**PostingStatusEnum**](PostingStatusEnum.md) | The journal&#39;s posting status. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



