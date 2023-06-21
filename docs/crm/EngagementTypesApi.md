# EngagementTypesApi

All URIs are relative to *https://api.merge.dev/api/crm/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**engagementTypesList**](EngagementTypesApi.md#engagementTypesList) | **GET** /engagement-types | 
[**engagementTypesRemoteFieldClassesList**](EngagementTypesApi.md#engagementTypesRemoteFieldClassesList) | **GET** /engagement-types/remote-field-classes | 
[**engagementTypesRetrieve**](EngagementTypesApi.md#engagementTypesRetrieve) | **GET** /engagement-types/{id} | 


<a name="engagementTypesList"></a>
# **engagementTypesList**
> PaginatedEngagementTypeList engagementTypesList(createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, includeRemoteFields, modifiedAfter, modifiedBefore, pageSize, remoteId)



Returns a list of &#x60;EngagementType&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = EngagementTypesApi()
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val includeRemoteFields : kotlin.Boolean = true // kotlin.Boolean | Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedEngagementTypeList = apiInstance.engagementTypesList(createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, includeRemoteFields, modifiedAfter, modifiedBefore, pageSize, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EngagementTypesApi#engagementTypesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EngagementTypesApi#engagementTypesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeRemoteFields** | **kotlin.Boolean**| Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedEngagementTypeList**](PaginatedEngagementTypeList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="engagementTypesRemoteFieldClassesList"></a>
# **engagementTypesRemoteFieldClassesList**
> PaginatedRemoteFieldClassList engagementTypesRemoteFieldClassesList(cursor, includeDeletedData, includeRemoteData, includeRemoteFields, pageSize)



Returns a list of &#x60;RemoteFieldClass&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = EngagementTypesApi()
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val includeRemoteFields : kotlin.Boolean = true // kotlin.Boolean | Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
try {
    val result : PaginatedRemoteFieldClassList = apiInstance.engagementTypesRemoteFieldClassesList(cursor, includeDeletedData, includeRemoteData, includeRemoteFields, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EngagementTypesApi#engagementTypesRemoteFieldClassesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EngagementTypesApi#engagementTypesRemoteFieldClassesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeRemoteFields** | **kotlin.Boolean**| Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]

### Return type

[**PaginatedRemoteFieldClassList**](PaginatedRemoteFieldClassList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="engagementTypesRetrieve"></a>
# **engagementTypesRetrieve**
> EngagementType engagementTypesRetrieve(id, includeRemoteData, includeRemoteFields)



Returns an &#x60;EngagementType&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = EngagementTypesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val includeRemoteFields : kotlin.Boolean = true // kotlin.Boolean | Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format.
try {
    val result : EngagementType = apiInstance.engagementTypesRetrieve(id, includeRemoteData, includeRemoteFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EngagementTypesApi#engagementTypesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EngagementTypesApi#engagementTypesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeRemoteFields** | **kotlin.Boolean**| Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. | [optional]

### Return type

[**EngagementType**](EngagementType.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

