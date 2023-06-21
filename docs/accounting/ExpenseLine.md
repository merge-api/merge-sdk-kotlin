
# ExpenseLine

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**item** | [**java.util.UUID**](java.util.UUID.md) | The line&#39;s item. |  [optional]
**netAmount** | **kotlin.Double** | The line&#39;s net amount. |  [optional]
**trackingCategory** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**trackingCategories** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the line belongs to. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The expense&#39;s payment account. |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) | The expense&#39;s contact. |  [optional]
**description** | **kotlin.String** | The description of the item that was purchased by the company. |  [optional]
**exchangeRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The expense line item&#39;s exchange rate. |  [optional]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]



