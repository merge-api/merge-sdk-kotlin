# JobsApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobsList**](JobsApi.md#jobsList) | **GET** /jobs | 
[**jobsRetrieve**](JobsApi.md#jobsRetrieve) | **GET** /jobs/{id} | 


<a name="jobsList"></a>
# **jobsList**
> PaginatedJobList jobsList(code, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, offices, pageSize, remoteFields, remoteId, showEnumOrigins, status)



Returns a list of &#x60;Job&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = JobsApi()
val code : kotlin.String = code_example // kotlin.String | If provided, will only return jobs with this code.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = departments,offices,hiring_managers,recruiters // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val offices : kotlin.String = offices_example // kotlin.String | If provided, will only return jobs for this office; multiple offices can be separated by commas.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteFields : kotlin.String = status // kotlin.String | Deprecated. Use show_enum_origins.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val showEnumOrigins : kotlin.String = status // kotlin.String | Which fields should be returned in non-normalized form.
val status : kotlin.String = status_example // kotlin.String | If provided, will only return jobs with this status. Options: ('OPEN', 'CLOSED', 'DRAFT', 'ARCHIVED', 'PENDING')  * `OPEN` - OPEN * `CLOSED` - CLOSED * `DRAFT` - DRAFT * `ARCHIVED` - ARCHIVED * `PENDING` - PENDING
try {
    val result : PaginatedJobList = apiInstance.jobsList(code, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, offices, pageSize, remoteFields, remoteId, showEnumOrigins, status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobsApi#jobsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobsApi#jobsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**| If provided, will only return jobs with this code. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: departments, departments,hiring_managers, departments,hiring_managers,recruiters, departments,offices, departments,offices,hiring_managers, departments,offices,hiring_managers,recruiters, departments,offices,recruiters, departments,recruiters, hiring_managers, hiring_managers,recruiters, offices, offices,hiring_managers, offices,hiring_managers,recruiters, offices,recruiters, recruiters]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **offices** | **kotlin.String**| If provided, will only return jobs for this office; multiple offices can be separated by commas. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: status]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: status]
 **status** | **kotlin.String**| If provided, will only return jobs with this status. Options: (&#39;OPEN&#39;, &#39;CLOSED&#39;, &#39;DRAFT&#39;, &#39;ARCHIVED&#39;, &#39;PENDING&#39;)  * &#x60;OPEN&#x60; - OPEN * &#x60;CLOSED&#x60; - CLOSED * &#x60;DRAFT&#x60; - DRAFT * &#x60;ARCHIVED&#x60; - ARCHIVED * &#x60;PENDING&#x60; - PENDING | [optional] [enum: ARCHIVED, CLOSED, DRAFT, OPEN, PENDING]

### Return type

[**PaginatedJobList**](PaginatedJobList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="jobsRetrieve"></a>
# **jobsRetrieve**
> Job jobsRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)



Returns a &#x60;Job&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = JobsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = departments,offices,hiring_managers,recruiters // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = status // kotlin.String | Deprecated. Use show_enum_origins.
val showEnumOrigins : kotlin.String = status // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : Job = apiInstance.jobsRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobsApi#jobsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobsApi#jobsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: departments, departments,hiring_managers, departments,hiring_managers,recruiters, departments,offices, departments,offices,hiring_managers, departments,offices,hiring_managers,recruiters, departments,offices,recruiters, departments,recruiters, hiring_managers, hiring_managers,recruiters, offices, offices,hiring_managers, offices,hiring_managers,recruiters, offices,recruiters, recruiters]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: status]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: status]

### Return type

[**Job**](Job.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

