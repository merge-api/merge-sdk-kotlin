# EmployeePayrollRunsApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**employeePayrollRunsList**](EmployeePayrollRunsApi.md#employeePayrollRunsList) | **GET** /employee-payroll-runs | 
[**employeePayrollRunsRetrieve**](EmployeePayrollRunsApi.md#employeePayrollRunsRetrieve) | **GET** /employee-payroll-runs/{id} | 


<a name="employeePayrollRunsList"></a>
# **employeePayrollRunsList**
> PaginatedEmployeePayrollRunList employeePayrollRunsList(createdAfter, createdBefore, cursor, employeeId, endedAfter, endedBefore, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, payrollRunId, remoteId, startedAfter, startedBefore)



Returns a list of &#x60;EmployeePayrollRun&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = EmployeePayrollRunsApi()
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val employeeId : kotlin.String = employeeId_example // kotlin.String | If provided, will only return employee payroll runs for this employee.
val endedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return employee payroll runs ended after this datetime.
val endedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return employee payroll runs ended before this datetime.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val payrollRunId : kotlin.String = payrollRunId_example // kotlin.String | If provided, will only return employee payroll runs for this employee.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val startedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return employee payroll runs started after this datetime.
val startedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return employee payroll runs started before this datetime.
try {
    val result : PaginatedEmployeePayrollRunList = apiInstance.employeePayrollRunsList(createdAfter, createdBefore, cursor, employeeId, endedAfter, endedBefore, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, payrollRunId, remoteId, startedAfter, startedBefore)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeePayrollRunsApi#employeePayrollRunsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeePayrollRunsApi#employeePayrollRunsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **employeeId** | **kotlin.String**| If provided, will only return employee payroll runs for this employee. | [optional]
 **endedAfter** | **java.time.OffsetDateTime**| If provided, will only return employee payroll runs ended after this datetime. | [optional]
 **endedBefore** | **java.time.OffsetDateTime**| If provided, will only return employee payroll runs ended before this datetime. | [optional]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **payrollRunId** | **kotlin.String**| If provided, will only return employee payroll runs for this employee. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **startedAfter** | **java.time.OffsetDateTime**| If provided, will only return employee payroll runs started after this datetime. | [optional]
 **startedBefore** | **java.time.OffsetDateTime**| If provided, will only return employee payroll runs started before this datetime. | [optional]

### Return type

[**PaginatedEmployeePayrollRunList**](PaginatedEmployeePayrollRunList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="employeePayrollRunsRetrieve"></a>
# **employeePayrollRunsRetrieve**
> EmployeePayrollRun employeePayrollRunsRetrieve(id, includeRemoteData)



Returns an &#x60;EmployeePayrollRun&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = EmployeePayrollRunsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
try {
    val result : EmployeePayrollRun = apiInstance.employeePayrollRunsRetrieve(id, includeRemoteData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeePayrollRunsApi#employeePayrollRunsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeePayrollRunsApi#employeePayrollRunsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]

### Return type

[**EmployeePayrollRun**](EmployeePayrollRun.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

