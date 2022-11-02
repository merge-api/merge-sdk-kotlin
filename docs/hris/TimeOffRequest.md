
# TimeOffRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**employee** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**approver** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**status** | [**TimeOffStatusEnum**](TimeOffStatusEnum.md) | The status of this time off request. |  [optional]
**employeeNote** | **kotlin.String** | The employee note for this time off request. |  [optional]
**units** | [**UnitsEnum**](UnitsEnum.md) | The unit of time requested. |  [optional]
**amount** | **kotlin.Float** | The number of time off units requested. |  [optional]
**requestType** | [**RequestTypeEnum**](RequestTypeEnum.md) | The type of time off request. |  [optional]
**startTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The day and time of the start of the time requested off. |  [optional]
**endTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The day and time of the end of the time requested off. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



