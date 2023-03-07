# PayrollRunsApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**payrollRunsList**](PayrollRunsApi.md#payrollRunsList) | **GET** /payroll-runs | 
[**payrollRunsRetrieve**](PayrollRunsApi.md#payrollRunsRetrieve) | **GET** /payroll-runs/{id} | 


<a name="payrollRunsList"></a>
# **payrollRunsList**
> PaginatedPayrollRunList payrollRunsList(createdAfter, createdBefore, cursor, endedAfter, endedBefore, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, runType, showEnumOrigins, startedAfter, startedBefore)



Returns a list of &#x60;PayrollRun&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = PayrollRunsApi()
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val endedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return payroll runs ended after this datetime.
val endedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return payroll runs ended before this datetime.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteFields : kotlin.String = run_state,run_type // kotlin.String | Deprecated. Use show_enum_origins.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val runType : kotlin.String = runType_example // kotlin.String | If provided, will only return PayrollRun's with this status. Options: ('REGULAR', 'OFF_CYCLE', 'CORRECTION', 'TERMINATION', 'SIGN_ON_BONUS')
val showEnumOrigins : kotlin.String = run_state,run_type // kotlin.String | Which fields should be returned in non-normalized form.
val startedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return payroll runs started after this datetime.
val startedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return payroll runs started before this datetime.
try {
    val result : PaginatedPayrollRunList = apiInstance.payrollRunsList(createdAfter, createdBefore, cursor, endedAfter, endedBefore, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, runType, showEnumOrigins, startedAfter, startedBefore)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayrollRunsApi#payrollRunsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayrollRunsApi#payrollRunsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **endedAfter** | **java.time.OffsetDateTime**| If provided, will only return payroll runs ended after this datetime. | [optional]
 **endedBefore** | **java.time.OffsetDateTime**| If provided, will only return payroll runs ended before this datetime. | [optional]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: run_state, run_state,run_type, run_type]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **runType** | **kotlin.String**| If provided, will only return PayrollRun&#39;s with this status. Options: (&#39;REGULAR&#39;, &#39;OFF_CYCLE&#39;, &#39;CORRECTION&#39;, &#39;TERMINATION&#39;, &#39;SIGN_ON_BONUS&#39;) | [optional] [enum: CORRECTION, OFF_CYCLE, REGULAR, SIGN_ON_BONUS, TERMINATION]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: run_state, run_state,run_type, run_type]
 **startedAfter** | **java.time.OffsetDateTime**| If provided, will only return payroll runs started after this datetime. | [optional]
 **startedBefore** | **java.time.OffsetDateTime**| If provided, will only return payroll runs started before this datetime. | [optional]

### Return type

[**PaginatedPayrollRunList**](PaginatedPayrollRunList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="payrollRunsRetrieve"></a>
# **payrollRunsRetrieve**
> PayrollRun payrollRunsRetrieve(id, includeRemoteData, remoteFields, showEnumOrigins)



Returns a &#x60;PayrollRun&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = PayrollRunsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = run_state,run_type // kotlin.String | Deprecated. Use show_enum_origins.
val showEnumOrigins : kotlin.String = run_state,run_type // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : PayrollRun = apiInstance.payrollRunsRetrieve(id, includeRemoteData, remoteFields, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayrollRunsApi#payrollRunsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayrollRunsApi#payrollRunsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: run_state, run_state,run_type, run_type]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: run_state, run_state,run_type, run_type]

### Return type

[**PayrollRun**](PayrollRun.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

