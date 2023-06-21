# ApplicationsApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applicationsChangeStageCreate**](ApplicationsApi.md#applicationsChangeStageCreate) | **POST** /applications/{id}/change-stage | 
[**applicationsCreate**](ApplicationsApi.md#applicationsCreate) | **POST** /applications | 
[**applicationsList**](ApplicationsApi.md#applicationsList) | **GET** /applications | 
[**applicationsMetaPostRetrieve**](ApplicationsApi.md#applicationsMetaPostRetrieve) | **GET** /applications/meta/post | 
[**applicationsRetrieve**](ApplicationsApi.md#applicationsRetrieve) | **GET** /applications/{id} | 


<a name="applicationsChangeStageCreate"></a>
# **applicationsChangeStageCreate**
> ApplicationResponse applicationsChangeStageCreate(id, isDebugMode, runAsync, updateApplicationStageRequest)



Updates the &#x60;current_stage&#x60; field of an &#x60;Application&#x60; object

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = ApplicationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
val updateApplicationStageRequest : UpdateApplicationStageRequest =  // UpdateApplicationStageRequest | 
try {
    val result : ApplicationResponse = apiInstance.applicationsChangeStageCreate(id, isDebugMode, runAsync, updateApplicationStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#applicationsChangeStageCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#applicationsChangeStageCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]
 **updateApplicationStageRequest** | [**UpdateApplicationStageRequest**](UpdateApplicationStageRequest.md)|  | [optional]

### Return type

[**ApplicationResponse**](ApplicationResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="applicationsCreate"></a>
# **applicationsCreate**
> ApplicationResponse applicationsCreate(applicationEndpointRequest, isDebugMode, runAsync)



Creates an &#x60;Application&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = ApplicationsApi()
val applicationEndpointRequest : ApplicationEndpointRequest =  // ApplicationEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : ApplicationResponse = apiInstance.applicationsCreate(applicationEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#applicationsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#applicationsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationEndpointRequest** | [**ApplicationEndpointRequest**](ApplicationEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**ApplicationResponse**](ApplicationResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="applicationsList"></a>
# **applicationsList**
> PaginatedApplicationList applicationsList(candidateId, createdAfter, createdBefore, creditedToId, currentStageId, cursor, expand, includeDeletedData, includeRemoteData, jobId, modifiedAfter, modifiedBefore, pageSize, rejectReasonId, remoteId, source)



Returns a list of &#x60;Application&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = ApplicationsApi()
val candidateId : kotlin.String = candidateId_example // kotlin.String | If provided, will only return applications for this candidate.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val creditedToId : kotlin.String = creditedToId_example // kotlin.String | If provided, will only return applications credited to this user.
val currentStageId : kotlin.String = currentStageId_example // kotlin.String | If provided, will only return applications at this interview stage.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = candidate,job,credited_to,current_stage,reject_reason // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val jobId : kotlin.String = jobId_example // kotlin.String | If provided, will only return applications for this job.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val rejectReasonId : kotlin.String = rejectReasonId_example // kotlin.String | If provided, will only return applications with this reject reason.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val source : kotlin.String = source_example // kotlin.String | If provided, will only return applications with this source.
try {
    val result : PaginatedApplicationList = apiInstance.applicationsList(candidateId, createdAfter, createdBefore, creditedToId, currentStageId, cursor, expand, includeDeletedData, includeRemoteData, jobId, modifiedAfter, modifiedBefore, pageSize, rejectReasonId, remoteId, source)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#applicationsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#applicationsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **candidateId** | **kotlin.String**| If provided, will only return applications for this candidate. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **creditedToId** | **kotlin.String**| If provided, will only return applications credited to this user. | [optional]
 **currentStageId** | **kotlin.String**| If provided, will only return applications at this interview stage. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: candidate, candidate,credited_to, candidate,credited_to,current_stage, candidate,credited_to,current_stage,reject_reason, candidate,credited_to,reject_reason, candidate,current_stage, candidate,current_stage,reject_reason, candidate,job, candidate,job,credited_to, candidate,job,credited_to,current_stage, candidate,job,credited_to,current_stage,reject_reason, candidate,job,credited_to,reject_reason, candidate,job,current_stage, candidate,job,current_stage,reject_reason, candidate,job,reject_reason, candidate,reject_reason, credited_to, credited_to,current_stage, credited_to,current_stage,reject_reason, credited_to,reject_reason, current_stage, current_stage,reject_reason, job, job,credited_to, job,credited_to,current_stage, job,credited_to,current_stage,reject_reason, job,credited_to,reject_reason, job,current_stage, job,current_stage,reject_reason, job,reject_reason, reject_reason]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **jobId** | **kotlin.String**| If provided, will only return applications for this job. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **rejectReasonId** | **kotlin.String**| If provided, will only return applications with this reject reason. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **source** | **kotlin.String**| If provided, will only return applications with this source. | [optional]

### Return type

[**PaginatedApplicationList**](PaginatedApplicationList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="applicationsMetaPostRetrieve"></a>
# **applicationsMetaPostRetrieve**
> MetaResponse applicationsMetaPostRetrieve(applicationRemoteTemplateId)



Returns metadata for &#x60;Application&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = ApplicationsApi()
val applicationRemoteTemplateId : kotlin.String = applicationRemoteTemplateId_example // kotlin.String | The template ID associated with the nested application in the request.
try {
    val result : MetaResponse = apiInstance.applicationsMetaPostRetrieve(applicationRemoteTemplateId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#applicationsMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#applicationsMetaPostRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationRemoteTemplateId** | **kotlin.String**| The template ID associated with the nested application in the request. | [optional]

### Return type

[**MetaResponse**](MetaResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="applicationsRetrieve"></a>
# **applicationsRetrieve**
> Application applicationsRetrieve(id, expand, includeRemoteData)



Returns an &#x60;Application&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = ApplicationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = candidate,job,credited_to,current_stage,reject_reason // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
try {
    val result : Application = apiInstance.applicationsRetrieve(id, expand, includeRemoteData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#applicationsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#applicationsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: candidate, candidate,credited_to, candidate,credited_to,current_stage, candidate,credited_to,current_stage,reject_reason, candidate,credited_to,reject_reason, candidate,current_stage, candidate,current_stage,reject_reason, candidate,job, candidate,job,credited_to, candidate,job,credited_to,current_stage, candidate,job,credited_to,current_stage,reject_reason, candidate,job,credited_to,reject_reason, candidate,job,current_stage, candidate,job,current_stage,reject_reason, candidate,job,reject_reason, candidate,reject_reason, credited_to, credited_to,current_stage, credited_to,current_stage,reject_reason, credited_to,reject_reason, current_stage, current_stage,reject_reason, job, job,credited_to, job,credited_to,current_stage, job,credited_to,current_stage,reject_reason, job,credited_to,reject_reason, job,current_stage, job,current_stage,reject_reason, job,reject_reason, reject_reason]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]

### Return type

[**Application**](Application.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

