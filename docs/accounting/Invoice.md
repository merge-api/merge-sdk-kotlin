
# Invoice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**InvoiceTypeEnum**](InvoiceTypeEnum.md) | Whether the invoice is an accounts receivable or accounts payable. Accounts payable invoices are commonly referred to as Bills. |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) | The invoice&#39;s contact. |  [optional]
**number** | **kotlin.String** | The invoice&#39;s number. |  [optional]
**issueDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The invoice&#39;s issue date. |  [optional]
**dueDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The invoice&#39;s due date. |  [optional]
**paidOnDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The invoice&#39;s paid date. |  [optional]
**memo** | **kotlin.String** | The invoice&#39;s private note. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the invoice belongs to. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The invoice&#39;s currency. |  [optional]
**exchangeRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The invoice&#39;s exchange rate. |  [optional]
**totalDiscount** | **kotlin.Float** | The total discounts applied to the total cost. |  [optional]
**subTotal** | **kotlin.Float** | The total amount being paid before taxes. |  [optional]
**totalTaxAmount** | **kotlin.Float** | The total amount being paid in taxes. |  [optional]
**totalAmount** | **kotlin.Float** | The invoice&#39;s total amount. |  [optional]
**balance** | **kotlin.Float** | The invoice&#39;s remaining balance. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s invoice entry was updated. |  [optional]
**payments** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Array of &#x60;Payment&#x60; object IDs. |  [optional]
**lineItems** | [**kotlin.collections.List&lt;InvoiceLineItem&gt;**](InvoiceLineItem.md) |  |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



