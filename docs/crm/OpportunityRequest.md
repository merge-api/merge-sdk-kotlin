
# OpportunityRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The opportunity&#39;s name. |  [optional]
**description** | **kotlin.String** | The opportunity&#39;s description. |  [optional]
**amount** | **kotlin.Int** | The opportunity&#39;s amount. |  [optional]
**owner** | [**java.util.UUID**](java.util.UUID.md) | The opportunity&#39;s owner. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The account of the opportunity. |  [optional]
**stage** | [**java.util.UUID**](java.util.UUID.md) | The stage of the opportunity. |  [optional]
**status** | [**OpportunityStatusEnum**](OpportunityStatusEnum.md) | The opportunity&#39;s status. |  [optional]
**lastActivityAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the opportunity&#39;s last activity occurred. |  [optional]
**closeDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the opportunity was closed. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



