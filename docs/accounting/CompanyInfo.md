
# CompanyInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**name** | **kotlin.String** | The company&#39;s name. |  [optional]
**legalName** | **kotlin.String** | The company&#39;s legal name. |  [optional]
**taxNumber** | **kotlin.String** | The company&#39;s tax number. |  [optional]
**fiscalYearEndMonth** | **kotlin.Int** | The company&#39;s fiscal year end month. |  [optional]
**fiscalYearEndDay** | **kotlin.Int** | The company&#39;s fiscal year end day. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The currency set in the company&#39;s accounting platform. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s company was created. |  [optional]
**urls** | **kotlin.collections.List&lt;kotlin.String&gt;** | The company&#39;s urls. |  [optional]
**addresses** | [**kotlin.collections.List&lt;Address&gt;**](Address.md) |  |  [optional]
**phoneNumbers** | [**kotlin.collections.List&lt;AccountingPhoneNumber&gt;**](AccountingPhoneNumber.md) |  |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]



