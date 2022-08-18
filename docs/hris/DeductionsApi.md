# DeductionsApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deductionsList**](DeductionsApi.md#deductionsList) | **GET** /deductions | 
[**deductionsRetrieve**](DeductionsApi.md#deductionsRetrieve) | **GET** /deductions/{id} | 


<a name="deductionsList"></a>
# **deductionsList**
> PaginatedDeductionList deductionsList(createdAfter, createdBefore, cursor, employeePayrollRunId, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId)



Returns a list of &#x60;Deduction&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = DeductionsApi()
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val employeePayrollRunId : kotlin.String = employeePayrollRunId_example // kotlin.String | If provided, will only return deductions for this employee payroll run.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedDeductionList = apiInstance.deductionsList(createdAfter, createdBefore, cursor, employeePayrollRunId, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeductionsApi#deductionsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeductionsApi#deductionsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **employeePayrollRunId** | **kotlin.String**| If provided, will only return deductions for this employee payroll run. | [optional]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedDeductionList**](PaginatedDeductionList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deductionsRetrieve"></a>
# **deductionsRetrieve**
> Deduction deductionsRetrieve(id, includeRemoteData)



Returns a &#x60;Deduction&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = DeductionsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
try {
    val result : Deduction = apiInstance.deductionsRetrieve(id, includeRemoteData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeductionsApi#deductionsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeductionsApi#deductionsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]

### Return type

[**Deduction**](Deduction.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

