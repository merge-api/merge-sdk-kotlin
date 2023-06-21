
# Benefit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**employee** | [**java.util.UUID**](java.util.UUID.md) | The employee on the plan. |  [optional]
**providerName** | **kotlin.String** | The name of the benefit provider. |  [optional]
**benefitPlanType** | **kotlin.String** | The type of benefit plan |  [optional]
**employeeContribution** | **kotlin.Double** | The employee&#39;s contribution. |  [optional]
**companyContribution** | **kotlin.Double** | The company&#39;s contribution. |  [optional]
**startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The day and time the benefit started. |  [optional]
**endDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The day and time the benefit ended. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



