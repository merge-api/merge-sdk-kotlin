
# PayrollRun

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**runState** | [**RunStateEnum**](RunStateEnum.md) | The state of the payroll run |  [optional]
**runType** | [**RunTypeEnum**](RunTypeEnum.md) | The type of the payroll run |  [optional]
**startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The day and time the payroll run started. |  [optional]
**endDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The day and time the payroll run ended. |  [optional]
**checkDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The day and time the payroll run was checked. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]



