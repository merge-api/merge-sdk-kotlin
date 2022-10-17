
# IncomeStatement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**name** | **kotlin.String** | The income statement&#39;s name. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The income statement&#39;s currency. |  [optional]
**startPeriod** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The income statement&#39;s start period. |  [optional]
**endPeriod** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The income statement&#39;s end period. |  [optional]
**income** | [**kotlin.collections.List&lt;ReportItem&gt;**](ReportItem.md) |  |  [optional] [readonly]
**costOfSales** | [**kotlin.collections.List&lt;ReportItem&gt;**](ReportItem.md) |  |  [optional] [readonly]
**grossProfit** | **kotlin.Float** | The income statement&#39;s gross profit. |  [optional]
**operatingExpenses** | [**kotlin.collections.List&lt;ReportItem&gt;**](ReportItem.md) |  |  [optional] [readonly]
**netOperatingIncome** | **kotlin.Float** | The income statement&#39;s net operating profit. |  [optional]
**nonOperatingExpenses** | [**kotlin.collections.List&lt;ReportItem&gt;**](ReportItem.md) |  |  [optional] [readonly]
**netIncome** | **kotlin.Float** | The income statement&#39;s net income. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



