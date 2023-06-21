# InterviewsApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**interviewsCreate**](InterviewsApi.md#interviewsCreate) | **POST** /interviews | 
[**interviewsList**](InterviewsApi.md#interviewsList) | **GET** /interviews | 
[**interviewsMetaPostRetrieve**](InterviewsApi.md#interviewsMetaPostRetrieve) | **GET** /interviews/meta/post | 
[**interviewsRetrieve**](InterviewsApi.md#interviewsRetrieve) | **GET** /interviews/{id} | 


<a name="interviewsCreate"></a>
# **interviewsCreate**
> ScheduledInterviewResponse interviewsCreate(scheduledInterviewEndpointRequest, isDebugMode, runAsync)



Creates a &#x60;ScheduledInterview&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = InterviewsApi()
val scheduledInterviewEndpointRequest : ScheduledInterviewEndpointRequest =  // ScheduledInterviewEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : ScheduledInterviewResponse = apiInstance.interviewsCreate(scheduledInterviewEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterviewsApi#interviewsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterviewsApi#interviewsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduledInterviewEndpointRequest** | [**ScheduledInterviewEndpointRequest**](ScheduledInterviewEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**ScheduledInterviewResponse**](ScheduledInterviewResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="interviewsList"></a>
# **interviewsList**
> PaginatedScheduledInterviewList interviewsList(applicationId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, jobInterviewStageId, modifiedAfter, modifiedBefore, organizerId, pageSize, remoteFields, remoteId, showEnumOrigins)



Returns a list of &#x60;ScheduledInterview&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = InterviewsApi()
val applicationId : kotlin.String = applicationId_example // kotlin.String | If provided, will only return interviews for this application.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = interviewers,organizer,application,job_interview_stage // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val jobInterviewStageId : kotlin.String = jobInterviewStageId_example // kotlin.String | If provided, will only return interviews at this stage.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val organizerId : kotlin.String = organizerId_example // kotlin.String | If provided, will only return interviews organized by this user.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteFields : kotlin.String = status // kotlin.String | Deprecated. Use show_enum_origins.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val showEnumOrigins : kotlin.String = status // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : PaginatedScheduledInterviewList = apiInstance.interviewsList(applicationId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, jobInterviewStageId, modifiedAfter, modifiedBefore, organizerId, pageSize, remoteFields, remoteId, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterviewsApi#interviewsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterviewsApi#interviewsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **kotlin.String**| If provided, will only return interviews for this application. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: application, application,job_interview_stage, interviewers, interviewers,application, interviewers,application,job_interview_stage, interviewers,job_interview_stage, interviewers,organizer, interviewers,organizer,application, interviewers,organizer,application,job_interview_stage, interviewers,organizer,job_interview_stage, job_interview_stage, organizer, organizer,application, organizer,application,job_interview_stage, organizer,job_interview_stage]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **jobInterviewStageId** | **kotlin.String**| If provided, will only return interviews at this stage. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **organizerId** | **kotlin.String**| If provided, will only return interviews organized by this user. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: status]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: status]

### Return type

[**PaginatedScheduledInterviewList**](PaginatedScheduledInterviewList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="interviewsMetaPostRetrieve"></a>
# **interviewsMetaPostRetrieve**
> MetaResponse interviewsMetaPostRetrieve()



Returns metadata for &#x60;ScheduledInterview&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = InterviewsApi()
try {
    val result : MetaResponse = apiInstance.interviewsMetaPostRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterviewsApi#interviewsMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterviewsApi#interviewsMetaPostRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

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

<a name="interviewsRetrieve"></a>
# **interviewsRetrieve**
> ScheduledInterview interviewsRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)



Returns a &#x60;ScheduledInterview&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = InterviewsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = interviewers,organizer,application,job_interview_stage // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = status // kotlin.String | Deprecated. Use show_enum_origins.
val showEnumOrigins : kotlin.String = status // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : ScheduledInterview = apiInstance.interviewsRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InterviewsApi#interviewsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InterviewsApi#interviewsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: application, application,job_interview_stage, interviewers, interviewers,application, interviewers,application,job_interview_stage, interviewers,job_interview_stage, interviewers,organizer, interviewers,organizer,application, interviewers,organizer,application,job_interview_stage, interviewers,organizer,job_interview_stage, job_interview_stage, organizer, organizer,application, organizer,application,job_interview_stage, organizer,job_interview_stage]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: status]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: status]

### Return type

[**ScheduledInterview**](ScheduledInterview.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

