# TimeOffBalancesApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**timeOffBalancesList**](TimeOffBalancesApi.md#timeOffBalancesList) | **GET** /time-off-balances | 
[**timeOffBalancesRetrieve**](TimeOffBalancesApi.md#timeOffBalancesRetrieve) | **GET** /time-off-balances/{id} | 


<a name="timeOffBalancesList"></a>
# **timeOffBalancesList**
> PaginatedTimeOffBalanceList timeOffBalancesList(createdAfter, createdBefore, cursor, employeeId, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, policyType, remoteFields, remoteId, showEnumOrigins)



Returns a list of &#x60;TimeOffBalance&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = TimeOffBalancesApi()
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val employeeId : kotlin.String = employeeId_example // kotlin.String | If provided, will only return time off balances for this employee.
val expand : kotlin.String = employee // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val policyType : kotlin.String = policyType_example // kotlin.String | If provided, will only return TimeOffBalance with this policy type. Options: ('VACATION', 'SICK', 'PERSONAL', 'JURY_DUTY', 'VOLUNTEER', 'BEREAVEMENT')  * `VACATION` - VACATION * `SICK` - SICK * `PERSONAL` - PERSONAL * `JURY_DUTY` - JURY_DUTY * `VOLUNTEER` - VOLUNTEER * `BEREAVEMENT` - BEREAVEMENT
val remoteFields : kotlin.String = policy_type // kotlin.String | Deprecated. Use show_enum_origins.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val showEnumOrigins : kotlin.String = policy_type // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : PaginatedTimeOffBalanceList = apiInstance.timeOffBalancesList(createdAfter, createdBefore, cursor, employeeId, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, policyType, remoteFields, remoteId, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeOffBalancesApi#timeOffBalancesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeOffBalancesApi#timeOffBalancesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **employeeId** | **kotlin.String**| If provided, will only return time off balances for this employee. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: employee]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **policyType** | **kotlin.String**| If provided, will only return TimeOffBalance with this policy type. Options: (&#39;VACATION&#39;, &#39;SICK&#39;, &#39;PERSONAL&#39;, &#39;JURY_DUTY&#39;, &#39;VOLUNTEER&#39;, &#39;BEREAVEMENT&#39;)  * &#x60;VACATION&#x60; - VACATION * &#x60;SICK&#x60; - SICK * &#x60;PERSONAL&#x60; - PERSONAL * &#x60;JURY_DUTY&#x60; - JURY_DUTY * &#x60;VOLUNTEER&#x60; - VOLUNTEER * &#x60;BEREAVEMENT&#x60; - BEREAVEMENT | [optional] [enum: BEREAVEMENT, JURY_DUTY, PERSONAL, SICK, VACATION, VOLUNTEER]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: policy_type]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: policy_type]

### Return type

[**PaginatedTimeOffBalanceList**](PaginatedTimeOffBalanceList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="timeOffBalancesRetrieve"></a>
# **timeOffBalancesRetrieve**
> TimeOffBalance timeOffBalancesRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)



Returns a &#x60;TimeOffBalance&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = TimeOffBalancesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = employee // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = policy_type // kotlin.String | Deprecated. Use show_enum_origins.
val showEnumOrigins : kotlin.String = policy_type // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : TimeOffBalance = apiInstance.timeOffBalancesRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeOffBalancesApi#timeOffBalancesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeOffBalancesApi#timeOffBalancesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: employee]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: policy_type]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: policy_type]

### Return type

[**TimeOffBalance**](TimeOffBalance.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

