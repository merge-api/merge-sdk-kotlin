
# Invoice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**type** | [**InvoiceTypeEnum**](InvoiceTypeEnum.md) | The invoice&#39;s type. |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) | The invoice&#39;s contact. |  [optional]
**number** | **kotlin.String** | The invoice&#39;s number. |  [optional]
**issueDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The invoice&#39;s issue date. |  [optional]
**dueDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The invoice&#39;s due date. |  [optional]
**paidOnDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The invoice&#39;s paid date. |  [optional]
**memo** | **kotlin.String** | The invoice&#39;s private note. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the invoice belongs to. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The invoice&#39;s currency. |  [optional]
**exchangeRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The invoice&#39;s exchange rate. |  [optional]
**totalDiscount** | **kotlin.Float** | The invoice&#39;s total discount. |  [optional]
**subTotal** | **kotlin.Float** | The invoice&#39;s sub-total. |  [optional]
**totalTaxAmount** | **kotlin.Float** | The invoice&#39;s total tax amount. |  [optional]
**totalAmount** | **kotlin.Float** | The invoice&#39;s total amount. |  [optional]
**balance** | **kotlin.Float** | The invoice&#39;s remaining balance. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s invoice entry was updated. |  [optional]
**payments** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Array of &#x60;Payment&#x60; object IDs. |  [optional]
**lineItems** | [**kotlin.collections.List&lt;InvoiceLineItem&gt;**](InvoiceLineItem.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]



