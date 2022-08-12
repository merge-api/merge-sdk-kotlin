
# Benefit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**employee** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**providerName** | **kotlin.String** | The name of the benefit provider. |  [optional]
**benefitPlanType** | **kotlin.String** | The type of benefit plan |  [optional]
**employeeContribution** | **kotlin.Float** | The employee&#39;s contribution. |  [optional]
**companyContribution** | **kotlin.Float** | The company&#39;s contribution. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



