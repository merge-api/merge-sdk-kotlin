
# Opportunity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**name** | **kotlin.String** | The opportunity&#39;s name. |  [optional]
**description** | **kotlin.String** | The opportunity&#39;s description. |  [optional]
**amount** | **kotlin.Int** | The opportunity&#39;s amount. |  [optional]
**owner** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**stage** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**status** | [**OpportunityStatusEnum**](OpportunityStatusEnum.md) | The opportunity&#39;s status. |  [optional]
**lastActivityAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the opportunity&#39;s last activity occurred. |  [optional]
**closeDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the opportunity was closed. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s opportunity was created. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]



