
# Deduction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**employeePayrollRun** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**name** | **kotlin.String** | The deduction&#39;s name. |  [optional]
**employeeDeduction** | **kotlin.Float** | The amount the employee is deducting. |  [optional]
**companyDeduction** | **kotlin.Float** | The amount the company is deducting. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional]



