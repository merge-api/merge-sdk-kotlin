
# CreditNoteLineItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trackingCategories** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The credit note line item&#39;s associated tracking categories. | 
**item** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**name** | **kotlin.String** | The credit note line item&#39;s name. |  [optional]
**description** | **kotlin.String** | The description of the item that is owed. |  [optional]
**quantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The credit note line item&#39;s quantity. |  [optional]
**memo** | **kotlin.String** | The credit note line item&#39;s memo. |  [optional]
**unitPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The credit note line item&#39;s unit price. |  [optional]
**taxRate** | [**java.util.UUID**](java.util.UUID.md) | The credit note line item&#39;s tax rate. |  [optional]
**totalLineAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The credit note line item&#39;s total. |  [optional]
**trackingCategory** | [**java.util.UUID**](java.util.UUID.md) | The credit note line item&#39;s associated tracking category. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The credit note line item&#39;s account. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the credit note belongs to. |  [optional]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]



