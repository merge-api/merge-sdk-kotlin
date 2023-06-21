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
> PaginatedTimeOffList timeOffList(approverId, createdAfter, createdBefore, cursor, employeeId, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, requestType, showEnumOrigins, status)



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
val expand : kotlin.String = employee,approver // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteFields : kotlin.String = request_type,status,units // kotlin.String | Deprecated. Use show_enum_origins.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val requestType : kotlin.String = requestType_example // kotlin.String | If provided, will only return TimeOff with this request type. Options: ('VACATION', 'SICK', 'PERSONAL', 'JURY_DUTY', 'VOLUNTEER', 'BEREAVEMENT')  * `VACATION` - VACATION * `SICK` - SICK * `PERSONAL` - PERSONAL * `JURY_DUTY` - JURY_DUTY * `VOLUNTEER` - VOLUNTEER * `BEREAVEMENT` - BEREAVEMENT
val showEnumOrigins : kotlin.String = request_type,status,units // kotlin.String | Which fields should be returned in non-normalized form.
val status : kotlin.String = status_example // kotlin.String | If provided, will only return TimeOff with this status. Options: ('REQUESTED', 'APPROVED', 'DECLINED', 'CANCELLED', 'DELETED')  * `REQUESTED` - REQUESTED * `APPROVED` - APPROVED * `DECLINED` - DECLINED * `CANCELLED` - CANCELLED * `DELETED` - DELETED
try {
    val result : PaginatedTimeOffList = apiInstance.timeOffList(approverId, createdAfter, createdBefore, cursor, employeeId, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, requestType, showEnumOrigins, status)
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
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: approver, employee, employee,approver]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: request_type, request_type,status, request_type,status,units, request_type,units, status, status,units, units]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **requestType** | **kotlin.String**| If provided, will only return TimeOff with this request type. Options: (&#39;VACATION&#39;, &#39;SICK&#39;, &#39;PERSONAL&#39;, &#39;JURY_DUTY&#39;, &#39;VOLUNTEER&#39;, &#39;BEREAVEMENT&#39;)  * &#x60;VACATION&#x60; - VACATION * &#x60;SICK&#x60; - SICK * &#x60;PERSONAL&#x60; - PERSONAL * &#x60;JURY_DUTY&#x60; - JURY_DUTY * &#x60;VOLUNTEER&#x60; - VOLUNTEER * &#x60;BEREAVEMENT&#x60; - BEREAVEMENT | [optional] [enum: BEREAVEMENT, JURY_DUTY, PERSONAL, SICK, VACATION, VOLUNTEER]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: request_type, request_type,status, request_type,status,units, request_type,units, status, status,units, units]
 **status** | **kotlin.String**| If provided, will only return TimeOff with this status. Options: (&#39;REQUESTED&#39;, &#39;APPROVED&#39;, &#39;DECLINED&#39;, &#39;CANCELLED&#39;, &#39;DELETED&#39;)  * &#x60;REQUESTED&#x60; - REQUESTED * &#x60;APPROVED&#x60; - APPROVED * &#x60;DECLINED&#x60; - DECLINED * &#x60;CANCELLED&#x60; - CANCELLED * &#x60;DELETED&#x60; - DELETED | [optional] [enum: APPROVED, CANCELLED, DECLINED, DELETED, REQUESTED]

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
> TimeOff timeOffRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)



Returns a &#x60;TimeOff&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = TimeOffApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = employee,approver // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = request_type,status,units // kotlin.String | Deprecated. Use show_enum_origins.
val showEnumOrigins : kotlin.String = request_type,status,units // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : TimeOff = apiInstance.timeOffRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)
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
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: approver, employee, employee,approver]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: request_type, request_type,status, request_type,status,units, request_type,units, status, status,units, units]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: request_type, request_type,status, request_type,status,units, request_type,units, status, status,units, units]

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

