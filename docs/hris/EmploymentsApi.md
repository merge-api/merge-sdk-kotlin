# EmploymentsApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**employmentsList**](EmploymentsApi.md#employmentsList) | **GET** /employments | 
[**employmentsRetrieve**](EmploymentsApi.md#employmentsRetrieve) | **GET** /employments/{id} | 


<a name="employmentsList"></a>
# **employmentsList**
> PaginatedEmploymentList employmentsList(createdAfter, createdBefore, cursor, employeeId, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, orderBy, pageSize, remoteFields, remoteId, showEnumOrigins)



Returns a list of &#x60;Employment&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = EmploymentsApi()
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val employeeId : kotlin.String = employeeId_example // kotlin.String | If provided, will only return employments for this employee.
val expand : kotlin.String = employee,pay_group // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val orderBy : kotlin.String = orderBy_example // kotlin.String | Overrides the default ordering for this endpoint.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteFields : kotlin.String = employment_type,flsa_status,pay_frequency,pay_period // kotlin.String | Deprecated. Use show_enum_origins.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val showEnumOrigins : kotlin.String = employment_type,flsa_status,pay_frequency,pay_period // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : PaginatedEmploymentList = apiInstance.employmentsList(createdAfter, createdBefore, cursor, employeeId, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, orderBy, pageSize, remoteFields, remoteId, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmploymentsApi#employmentsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmploymentsApi#employmentsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **employeeId** | **kotlin.String**| If provided, will only return employments for this employee. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: employee, employee,pay_group, pay_group]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **orderBy** | **kotlin.String**| Overrides the default ordering for this endpoint. | [optional] [enum: -effective_date, effective_date]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: employment_type, employment_type,flsa_status, employment_type,flsa_status,pay_frequency, employment_type,flsa_status,pay_frequency,pay_period, employment_type,flsa_status,pay_period, employment_type,pay_frequency, employment_type,pay_frequency,pay_period, employment_type,pay_period, flsa_status, flsa_status,pay_frequency, flsa_status,pay_frequency,pay_period, flsa_status,pay_period, pay_frequency, pay_frequency,pay_period, pay_period]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: employment_type, employment_type,flsa_status, employment_type,flsa_status,pay_frequency, employment_type,flsa_status,pay_frequency,pay_period, employment_type,flsa_status,pay_period, employment_type,pay_frequency, employment_type,pay_frequency,pay_period, employment_type,pay_period, flsa_status, flsa_status,pay_frequency, flsa_status,pay_frequency,pay_period, flsa_status,pay_period, pay_frequency, pay_frequency,pay_period, pay_period]

### Return type

[**PaginatedEmploymentList**](PaginatedEmploymentList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="employmentsRetrieve"></a>
# **employmentsRetrieve**
> Employment employmentsRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)



Returns an &#x60;Employment&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = EmploymentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = employee,pay_group // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = employment_type,flsa_status,pay_frequency,pay_period // kotlin.String | Deprecated. Use show_enum_origins.
val showEnumOrigins : kotlin.String = employment_type,flsa_status,pay_frequency,pay_period // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : Employment = apiInstance.employmentsRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmploymentsApi#employmentsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmploymentsApi#employmentsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: employee, employee,pay_group, pay_group]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: employment_type, employment_type,flsa_status, employment_type,flsa_status,pay_frequency, employment_type,flsa_status,pay_frequency,pay_period, employment_type,flsa_status,pay_period, employment_type,pay_frequency, employment_type,pay_frequency,pay_period, employment_type,pay_period, flsa_status, flsa_status,pay_frequency, flsa_status,pay_frequency,pay_period, flsa_status,pay_period, pay_frequency, pay_frequency,pay_period, pay_period]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: employment_type, employment_type,flsa_status, employment_type,flsa_status,pay_frequency, employment_type,flsa_status,pay_frequency,pay_period, employment_type,flsa_status,pay_period, employment_type,pay_frequency, employment_type,pay_frequency,pay_period, employment_type,pay_period, flsa_status, flsa_status,pay_frequency, flsa_status,pay_frequency,pay_period, flsa_status,pay_period, pay_frequency, pay_frequency,pay_period, pay_period]

### Return type

[**Employment**](Employment.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

