
# TimeOff

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**employee** | [**java.util.UUID**](java.util.UUID.md) | The employee requesting time off. |  [optional]
**approver** | [**java.util.UUID**](java.util.UUID.md) | The Merge ID of the employee with the ability to approve the time off request. |  [optional]
**status** | [**TimeOffStatusEnum**](TimeOffStatusEnum.md) | The status of this time off request. |  [optional]
**employeeNote** | **kotlin.String** | The employee note for this time off request. |  [optional]
**units** | [**UnitsEnum**](UnitsEnum.md) | The measurement that the third-party integration uses to count time requested. |  [optional]
**amount** | **kotlin.Float** | The time off quantity measured by the prescribed “units”. |  [optional]
**requestType** | [**RequestTypeEnum**](RequestTypeEnum.md) | The type of time off request. |  [optional]
**startTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The day and time of the start of the time requested off. |  [optional]
**endTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The day and time of the end of the time requested off. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



