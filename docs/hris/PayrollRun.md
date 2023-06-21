
# PayrollRun

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**runState** | [**RunStateEnum**](RunStateEnum.md) | The state of the payroll run  * &#x60;PAID&#x60; - PAID * &#x60;DRAFT&#x60; - DRAFT * &#x60;APPROVED&#x60; - APPROVED * &#x60;FAILED&#x60; - FAILED * &#x60;CLOSED&#x60; - CLOSED |  [optional]
**runType** | [**RunTypeEnum**](RunTypeEnum.md) | The type of the payroll run  * &#x60;REGULAR&#x60; - REGULAR * &#x60;OFF_CYCLE&#x60; - OFF_CYCLE * &#x60;CORRECTION&#x60; - CORRECTION * &#x60;TERMINATION&#x60; - TERMINATION * &#x60;SIGN_ON_BONUS&#x60; - SIGN_ON_BONUS |  [optional]
**startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The day and time the payroll run started. |  [optional]
**endDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The day and time the payroll run ended. |  [optional]
**checkDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The day and time the payroll run was checked. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



