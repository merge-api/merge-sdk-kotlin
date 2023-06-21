# AssociationTypesApi

All URIs are relative to *https://api.merge.dev/api/crm/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customObjectClassesAssociationTypesCreate**](AssociationTypesApi.md#customObjectClassesAssociationTypesCreate) | **POST** /custom-object-classes/{custom_object_class_id}/association-types | 
[**customObjectClassesAssociationTypesList**](AssociationTypesApi.md#customObjectClassesAssociationTypesList) | **GET** /custom-object-classes/{custom_object_class_id}/association-types | 
[**customObjectClassesAssociationTypesMetaPostRetrieve**](AssociationTypesApi.md#customObjectClassesAssociationTypesMetaPostRetrieve) | **GET** /custom-object-classes/{custom_object_class_id}/association-types/meta/post | 
[**customObjectClassesAssociationTypesRetrieve**](AssociationTypesApi.md#customObjectClassesAssociationTypesRetrieve) | **GET** /custom-object-classes/{custom_object_class_id}/association-types/{id} | 


<a name="customObjectClassesAssociationTypesCreate"></a>
# **customObjectClassesAssociationTypesCreate**
> CRMAssociationTypeResponse customObjectClassesAssociationTypesCreate(customObjectClassId, crMAssociationTypeEndpointRequest, isDebugMode, runAsync)



Creates an &#x60;AssociationType&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = AssociationTypesApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val crMAssociationTypeEndpointRequest : CRMAssociationTypeEndpointRequest =  // CRMAssociationTypeEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : CRMAssociationTypeResponse = apiInstance.customObjectClassesAssociationTypesCreate(customObjectClassId, crMAssociationTypeEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssociationTypesApi#customObjectClassesAssociationTypesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssociationTypesApi#customObjectClassesAssociationTypesCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customObjectClassId** | **java.util.UUID**|  |
 **crMAssociationTypeEndpointRequest** | [**CRMAssociationTypeEndpointRequest**](CRMAssociationTypeEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**CRMAssociationTypeResponse**](CRMAssociationTypeResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="customObjectClassesAssociationTypesList"></a>
# **customObjectClassesAssociationTypesList**
> PaginatedAssociationTypeList customObjectClassesAssociationTypesList(customObjectClassId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId)



Returns a list of &#x60;AssociationType&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = AssociationTypesApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = target_object_classes // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedAssociationTypeList = apiInstance.customObjectClassesAssociationTypesList(customObjectClassId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssociationTypesApi#customObjectClassesAssociationTypesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssociationTypesApi#customObjectClassesAssociationTypesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customObjectClassId** | **java.util.UUID**|  |
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: target_object_classes]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedAssociationTypeList**](PaginatedAssociationTypeList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="customObjectClassesAssociationTypesMetaPostRetrieve"></a>
# **customObjectClassesAssociationTypesMetaPostRetrieve**
> MetaResponse customObjectClassesAssociationTypesMetaPostRetrieve(customObjectClassId)



Returns metadata for &#x60;CRMAssociationType&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = AssociationTypesApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : MetaResponse = apiInstance.customObjectClassesAssociationTypesMetaPostRetrieve(customObjectClassId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssociationTypesApi#customObjectClassesAssociationTypesMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssociationTypesApi#customObjectClassesAssociationTypesMetaPostRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customObjectClassId** | **java.util.UUID**|  |

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

<a name="customObjectClassesAssociationTypesRetrieve"></a>
# **customObjectClassesAssociationTypesRetrieve**
> AssociationType customObjectClassesAssociationTypesRetrieve(customObjectClassId, id, expand, includeRemoteData)



Returns an &#x60;AssociationType&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = AssociationTypesApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = target_object_classes // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
try {
    val result : AssociationType = apiInstance.customObjectClassesAssociationTypesRetrieve(customObjectClassId, id, expand, includeRemoteData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssociationTypesApi#customObjectClassesAssociationTypesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssociationTypesApi#customObjectClassesAssociationTypesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customObjectClassId** | **java.util.UUID**|  |
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: target_object_classes]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]

### Return type

[**AssociationType**](AssociationType.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

