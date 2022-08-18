# JobInterviewStagesApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobInterviewStagesList**](JobInterviewStagesApi.md#jobInterviewStagesList) | **GET** /job-interview-stages | 
[**jobInterviewStagesRetrieve**](JobInterviewStagesApi.md#jobInterviewStagesRetrieve) | **GET** /job-interview-stages/{id} | 


<a name="jobInterviewStagesList"></a>
# **jobInterviewStagesList**
> PaginatedJobInterviewStageList jobInterviewStagesList(createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, jobId, modifiedAfter, modifiedBefore, pageSize, remoteId)



Returns a list of &#x60;JobInterviewStage&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = JobInterviewStagesApi()
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = job // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val jobId : kotlin.String = jobId_example // kotlin.String | If provided, will only return interview stages for this job.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedJobInterviewStageList = apiInstance.jobInterviewStagesList(createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, jobId, modifiedAfter, modifiedBefore, pageSize, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobInterviewStagesApi#jobInterviewStagesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobInterviewStagesApi#jobInterviewStagesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: job]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **jobId** | **kotlin.String**| If provided, will only return interview stages for this job. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedJobInterviewStageList**](PaginatedJobInterviewStageList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="jobInterviewStagesRetrieve"></a>
# **jobInterviewStagesRetrieve**
> JobInterviewStage jobInterviewStagesRetrieve(id, expand, includeRemoteData)



Returns a &#x60;JobInterviewStage&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = JobInterviewStagesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = job // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
try {
    val result : JobInterviewStage = apiInstance.jobInterviewStagesRetrieve(id, expand, includeRemoteData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobInterviewStagesApi#jobInterviewStagesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobInterviewStagesApi#jobInterviewStagesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: job]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]

### Return type

[**JobInterviewStage**](JobInterviewStage.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

