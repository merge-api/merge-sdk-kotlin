# TimeOffApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**timeOffCreate**](TimeOffApi.md#timeOffCreate) | **POST** /time-off | 
[**timeOffList**](TimeOffApi.md#timeOffList) | **GET** /time-off | 
[**timeOffMetaPostRetrieve**](TimeOffApi.md#timeOffMetaPostRetrieve) | **GET** /time-off/meta/post | 
[**timeOffRetrieve**](TimeOffApi.md#timeOffRetrieve) | **GET** /time-off/{id} | 


<a name="timeOffCreate"></a>
# **timeOffCreate**
> TimeOffResponse timeOffCreate(timeOffEndpointRequest, isDebugMode, runAsync)



Creates a &#x60;TimeOff&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = TimeOffApi()
val timeOffEndpointRequest : TimeOffEndpointRequest =  // TimeOffEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : TimeOffResponse = apiInstance.timeOffCreate(timeOffEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeOffApi#timeOffCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeOffApi#timeOffCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeOffEndpointRequest** | [**TimeOffEndpointRequest**](TimeOffEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**TimeOffResponse**](TimeOffResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="timeOffList"></a>
# **timeOffList**
> PaginatedTimeOffList timeOffList(approverId, createdAfter, createdBefore, cursor, employeeId, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, requestType, status)



Returns a list of &#x60;TimeOff&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = TimeOffApi()
val approverId : kotlin.String = approverId_example // kotlin.String | If provided, will only return time off for this approver.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val employeeId : kotlin.String = employeeId_example // kotlin.String | If provided, will only return time off for this employee.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteFields : kotlin.String = request_type,status,units // kotlin.String | Which fields should be returned in non-normalized form.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val requestType : kotlin.String = requestType_example // kotlin.String | If provided, will only return TimeOff with this request type. Options: ('VACATION', 'SICK', 'PERSONAL', 'JURY_DUTY', 'VOLUNTEER', 'BEREAVEMENT')
val status : kotlin.String = status_example // kotlin.String | If provided, will only return TimeOff with this status. Options: ('REQUESTED', 'APPROVED', 'DECLINED', 'CANCELLED', 'DELETED')
try {
    val result : PaginatedTimeOffList = apiInstance.timeOffList(approverId, createdAfter, createdBefore, cursor, employeeId, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, requestType, status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeOffApi#timeOffList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeOffApi#timeOffList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **approverId** | **kotlin.String**| If provided, will only return time off for this approver. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **employeeId** | **kotlin.String**| If provided, will only return time off for this employee. | [optional]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteFields** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: request_type, request_type,status, request_type,status,units, request_type,units, status, status,units, units]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **requestType** | **kotlin.String**| If provided, will only return TimeOff with this request type. Options: (&#39;VACATION&#39;, &#39;SICK&#39;, &#39;PERSONAL&#39;, &#39;JURY_DUTY&#39;, &#39;VOLUNTEER&#39;, &#39;BEREAVEMENT&#39;) | [optional] [enum: BEREAVEMENT, JURY_DUTY, PERSONAL, SICK, VACATION, VOLUNTEER]
 **status** | **kotlin.String**| If provided, will only return TimeOff with this status. Options: (&#39;REQUESTED&#39;, &#39;APPROVED&#39;, &#39;DECLINED&#39;, &#39;CANCELLED&#39;, &#39;DELETED&#39;) | [optional] [enum: APPROVED, CANCELLED, DECLINED, DELETED, REQUESTED]

### Return type

[**PaginatedTimeOffList**](PaginatedTimeOffList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="timeOffMetaPostRetrieve"></a>
# **timeOffMetaPostRetrieve**
> MetaResponse timeOffMetaPostRetrieve()



Returns metadata for &#x60;TimeOff&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = TimeOffApi()
try {
    val result : MetaResponse = apiInstance.timeOffMetaPostRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeOffApi#timeOffMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeOffApi#timeOffMetaPostRetrieve")
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

<a name="timeOffRetrieve"></a>
# **timeOffRetrieve**
> TimeOff timeOffRetrieve(id, includeRemoteData, remoteFields)



Returns a &#x60;TimeOff&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = TimeOffApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = request_type,status,units // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : TimeOff = apiInstance.timeOffRetrieve(id, includeRemoteData, remoteFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeOffApi#timeOffRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeOffApi#timeOffRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: request_type, request_type,status, request_type,status,units, request_type,units, status, status,units, units]

### Return type

[**TimeOff**](TimeOff.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

