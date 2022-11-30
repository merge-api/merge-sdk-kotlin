
# EmployeePayrollRun

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**employee** | [**java.util.UUID**](java.util.UUID.md) | The employee whose payroll is being run. |  [optional]
**payrollRun** | [**java.util.UUID**](java.util.UUID.md) | The payroll being run. |  [optional]
**grossPay** | **kotlin.Float** | The gross pay from the run. |  [optional]
**netPay** | **kotlin.Float** | The net pay from the run. |  [optional]
**startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The day and time the payroll run started. |  [optional]
**endDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The day and time the payroll run ended. |  [optional]
**checkDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The day and time the payroll run was checked. |  [optional]
**earnings** | [**kotlin.collections.List&lt;Earning&gt;**](Earning.md) |  |  [optional] [readonly]
**deductions** | [**kotlin.collections.List&lt;Deduction&gt;**](Deduction.md) |  |  [optional] [readonly]
**taxes** | [**kotlin.collections.List&lt;Tax&gt;**](Tax.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



