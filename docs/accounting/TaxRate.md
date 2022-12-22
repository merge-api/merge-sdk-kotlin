
# TaxRate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**description** | **kotlin.String** | The tax rate&#39;s description. |  [optional]
**totalTaxRate** | **kotlin.Float** | The tax rate&#39;s total tax rate. |  [optional]
**effectiveTaxRate** | **kotlin.Float** | The tax rate&#39;s effective tax rate. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the tax rate belongs to. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]



