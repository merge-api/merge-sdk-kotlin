
# Employment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**employee** | [**java.util.UUID**](java.util.UUID.md) | The employee holding this position. |  [optional]
**jobTitle** | **kotlin.String** | The position&#39;s title. |  [optional]
**payRate** | **kotlin.Float** | The position&#39;s pay rate in dollars. |  [optional]
**payPeriod** | [**PayPeriodEnum**](PayPeriodEnum.md) | The time period this pay rate encompasses. |  [optional]
**payFrequency** | [**PayFrequencyEnum**](PayFrequencyEnum.md) | The position&#39;s pay frequency. |  [optional]
**payCurrency** | [**PayCurrencyEnum**](PayCurrencyEnum.md) | The position&#39;s currency code. |  [optional]
**payGroup** | [**java.util.UUID**](java.util.UUID.md) | The employment&#39;s pay group |  [optional]
**flsaStatus** | [**FlsaStatusEnum**](FlsaStatusEnum.md) | The position&#39;s FLSA status. |  [optional]
**effectiveDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The position&#39;s effective date. |  [optional]
**employmentType** | [**EmploymentTypeEnum**](EmploymentTypeEnum.md) | The position&#39;s type of employment. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



