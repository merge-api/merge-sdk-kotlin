# EeocsApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eeocsList**](EeocsApi.md#eeocsList) | **GET** /eeocs | 
[**eeocsRetrieve**](EeocsApi.md#eeocsRetrieve) | **GET** /eeocs/{id} | 


<a name="eeocsList"></a>
# **eeocsList**
> PaginatedEEOCList eeocsList(candidateId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, showEnumOrigins)



Returns a list of &#x60;EEOC&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = EeocsApi()
val candidateId : kotlin.String = candidateId_example // kotlin.String | If provided, will only return EEOC info for this candidate.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = candidate // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteFields : kotlin.String = disability_status,gender,race,veteran_status // kotlin.String | Deprecated. Use show_enum_origins.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val showEnumOrigins : kotlin.String = disability_status,gender,race,veteran_status // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : PaginatedEEOCList = apiInstance.eeocsList(candidateId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EeocsApi#eeocsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EeocsApi#eeocsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **candidateId** | **kotlin.String**| If provided, will only return EEOC info for this candidate. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: candidate]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: disability_status, disability_status,gender, disability_status,gender,race, disability_status,gender,race,veteran_status, disability_status,gender,veteran_status, disability_status,race, disability_status,race,veteran_status, disability_status,veteran_status, gender, gender,race, gender,race,veteran_status, gender,veteran_status, race, race,veteran_status, veteran_status]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: disability_status, disability_status,gender, disability_status,gender,race, disability_status,gender,race,veteran_status, disability_status,gender,veteran_status, disability_status,race, disability_status,race,veteran_status, disability_status,veteran_status, gender, gender,race, gender,race,veteran_status, gender,veteran_status, race, race,veteran_status, veteran_status]

### Return type

[**PaginatedEEOCList**](PaginatedEEOCList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eeocsRetrieve"></a>
# **eeocsRetrieve**
> EEOC eeocsRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)



Returns an &#x60;EEOC&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = EeocsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = candidate // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = disability_status,gender,race,veteran_status // kotlin.String | Deprecated. Use show_enum_origins.
val showEnumOrigins : kotlin.String = disability_status,gender,race,veteran_status // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : EEOC = apiInstance.eeocsRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EeocsApi#eeocsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EeocsApi#eeocsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: candidate]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: disability_status, disability_status,gender, disability_status,gender,race, disability_status,gender,race,veteran_status, disability_status,gender,veteran_status, disability_status,race, disability_status,race,veteran_status, disability_status,veteran_status, gender, gender,race, gender,race,veteran_status, gender,veteran_status, race, race,veteran_status, veteran_status]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: disability_status, disability_status,gender, disability_status,gender,race, disability_status,gender,race,veteran_status, disability_status,gender,veteran_status, disability_status,race, disability_status,race,veteran_status, disability_status,veteran_status, gender, gender,race, gender,race,veteran_status, gender,veteran_status, race, race,veteran_status, veteran_status]

### Return type

[**EEOC**](EEOC.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

