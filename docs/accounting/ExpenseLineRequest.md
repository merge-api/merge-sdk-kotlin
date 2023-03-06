
# ExpenseLineRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | [**java.util.UUID**](java.util.UUID.md) | The line&#39;s item. |  [optional]
**netAmount** | **kotlin.Float** | The line&#39;s net amount. |  [optional]
**trackingCategory** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**trackingCategories** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the line belongs to. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The expense&#39;s payment account. |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) | The expense&#39;s contact. |  [optional]
**description** | **kotlin.String** | The description of the item that was purchased by the company. |  [optional]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



