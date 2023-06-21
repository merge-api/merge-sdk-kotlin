
# JournalLine

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**netAmount** | **kotlin.Double** | The value of the line item including taxes and other fees. |  [optional]
**trackingCategory** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**trackingCategories** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**description** | **kotlin.String** | The line&#39;s description. |  [optional]
**exchangeRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The journal line item&#39;s exchange rate. |  [optional]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]



