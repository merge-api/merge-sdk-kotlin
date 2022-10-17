
# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**name** | **kotlin.String** | The account&#39;s name. |  [optional]
**description** | **kotlin.String** | The account&#39;s description. |  [optional]
**classification** | [**ClassificationEnum**](ClassificationEnum.md) | The account&#39;s classification. |  [optional]
**type** | **kotlin.String** | The account&#39;s type. |  [optional]
**status** | [**AccountStatusEnum**](AccountStatusEnum.md) | The account&#39;s status. |  [optional]
**currentBalance** | **kotlin.Float** | The account&#39;s current balance. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The account&#39;s currency. |  [optional]
**accountNumber** | **kotlin.String** | The account&#39;s number. |  [optional]
**parentAccount** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



