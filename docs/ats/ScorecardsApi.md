# ScorecardsApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**scorecardsList**](ScorecardsApi.md#scorecardsList) | **GET** /scorecards | 
[**scorecardsRetrieve**](ScorecardsApi.md#scorecardsRetrieve) | **GET** /scorecards/{id} | 


<a name="scorecardsList"></a>
# **scorecardsList**
> PaginatedScorecardList scorecardsList(applicationId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, interviewId, interviewerId, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, showEnumOrigins)



Returns a list of &#x60;Scorecard&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = ScorecardsApi()
val applicationId : kotlin.String = applicationId_example // kotlin.String | If provided, will only return scorecards for this application.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = application,interview,interviewer // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val interviewId : kotlin.String = interviewId_example // kotlin.String | If provided, will only return scorecards for this interview.
val interviewerId : kotlin.String = interviewerId_example // kotlin.String | If provided, will only return scorecards for this interviewer.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteFields : kotlin.String = overall_recommendation // kotlin.String | Deprecated. Use show_enum_origins.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val showEnumOrigins : kotlin.String = overall_recommendation // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : PaginatedScorecardList = apiInstance.scorecardsList(applicationId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, interviewId, interviewerId, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScorecardsApi#scorecardsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScorecardsApi#scorecardsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **kotlin.String**| If provided, will only return scorecards for this application. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: application, application,interview, application,interview,interviewer, application,interviewer, interview, interview,interviewer, interviewer]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **interviewId** | **kotlin.String**| If provided, will only return scorecards for this interview. | [optional]
 **interviewerId** | **kotlin.String**| If provided, will only return scorecards for this interviewer. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: overall_recommendation]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: overall_recommendation]

### Return type

[**PaginatedScorecardList**](PaginatedScorecardList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="scorecardsRetrieve"></a>
# **scorecardsRetrieve**
> Scorecard scorecardsRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)



Returns a &#x60;Scorecard&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = ScorecardsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = application,interview,interviewer // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = overall_recommendation // kotlin.String | Deprecated. Use show_enum_origins.
val showEnumOrigins : kotlin.String = overall_recommendation // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : Scorecard = apiInstance.scorecardsRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScorecardsApi#scorecardsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScorecardsApi#scorecardsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: application, application,interview, application,interview,interviewer, application,interviewer, interview, interview,interviewer, interviewer]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: overall_recommendation]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: overall_recommendation]

### Return type

[**Scorecard**](Scorecard.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

