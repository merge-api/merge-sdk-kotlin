# TrackingCategoriesApi

All URIs are relative to *https://api.merge.dev/api/accounting/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trackingCategoriesList**](TrackingCategoriesApi.md#trackingCategoriesList) | **GET** /tracking-categories | 
[**trackingCategoriesRetrieve**](TrackingCategoriesApi.md#trackingCategoriesRetrieve) | **GET** /tracking-categories/{id} | 


<a name="trackingCategoriesList"></a>
# **trackingCategoriesList**
> PaginatedTrackingCategoryList trackingCategoriesList(createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId)



Returns a list of &#x60;TrackingCategory&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = TrackingCategoriesApi()
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteFields : kotlin.String = status // kotlin.String | Which fields should be returned in non-normalized form.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedTrackingCategoryList = apiInstance.trackingCategoriesList(createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrackingCategoriesApi#trackingCategoriesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrackingCategoriesApi#trackingCategoriesList")
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
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteFields** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: status]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedTrackingCategoryList**](PaginatedTrackingCategoryList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="trackingCategoriesRetrieve"></a>
# **trackingCategoriesRetrieve**
> TrackingCategory trackingCategoriesRetrieve(id, includeRemoteData, remoteFields)



Returns a &#x60;TrackingCategory&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = TrackingCategoriesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = status // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : TrackingCategory = apiInstance.trackingCategoriesRetrieve(id, includeRemoteData, remoteFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrackingCategoriesApi#trackingCategoriesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrackingCategoriesApi#trackingCategoriesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: status]

### Return type

[**TrackingCategory**](TrackingCategory.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

