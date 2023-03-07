
# AccountRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The account&#39;s name. |  [optional]
**description** | **kotlin.String** | The account&#39;s description. |  [optional]
**classification** | [**ClassificationEnum**](ClassificationEnum.md) | The account&#39;s broadest grouping. |  [optional]
**type** | **kotlin.String** | The account&#39;s type is a narrower and more specific grouping within the account&#39;s classification. |  [optional]
**status** | [**AccountStatusEnum**](AccountStatusEnum.md) | The account&#39;s status. |  [optional]
**currentBalance** | **kotlin.Float** | The account&#39;s current balance. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The account&#39;s currency. |  [optional]
**accountNumber** | **kotlin.String** | The account&#39;s number. |  [optional]
**parentAccount** | [**java.util.UUID**](java.util.UUID.md) | ID of the parent account. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the account belongs to. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



