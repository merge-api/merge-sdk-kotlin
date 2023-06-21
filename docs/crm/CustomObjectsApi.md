# CustomObjectsApi

All URIs are relative to *https://api.merge.dev/api/crm/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customObjectClassesCustomObjectsCreate**](CustomObjectsApi.md#customObjectClassesCustomObjectsCreate) | **POST** /custom-object-classes/{custom_object_class_id}/custom-objects | 
[**customObjectClassesCustomObjectsList**](CustomObjectsApi.md#customObjectClassesCustomObjectsList) | **GET** /custom-object-classes/{custom_object_class_id}/custom-objects | 
[**customObjectClassesCustomObjectsMetaPatchRetrieve**](CustomObjectsApi.md#customObjectClassesCustomObjectsMetaPatchRetrieve) | **GET** /custom-object-classes/{custom_object_class_id}/custom-objects/meta/patch/{id} | 
[**customObjectClassesCustomObjectsMetaPostRetrieve**](CustomObjectsApi.md#customObjectClassesCustomObjectsMetaPostRetrieve) | **GET** /custom-object-classes/{custom_object_class_id}/custom-objects/meta/post | 
[**customObjectClassesCustomObjectsPartialUpdate**](CustomObjectsApi.md#customObjectClassesCustomObjectsPartialUpdate) | **PATCH** /custom-object-classes/{custom_object_class_id}/custom-objects/{id} | 
[**customObjectClassesCustomObjectsRetrieve**](CustomObjectsApi.md#customObjectClassesCustomObjectsRetrieve) | **GET** /custom-object-classes/{custom_object_class_id}/custom-objects/{id} | 


<a name="customObjectClassesCustomObjectsCreate"></a>
# **customObjectClassesCustomObjectsCreate**
> CRMCustomObjectResponse customObjectClassesCustomObjectsCreate(customObjectClassId, crMCustomObjectEndpointRequest, isDebugMode, runAsync)



Creates a &#x60;CustomObject&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = CustomObjectsApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val crMCustomObjectEndpointRequest : CRMCustomObjectEndpointRequest =  // CRMCustomObjectEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : CRMCustomObjectResponse = apiInstance.customObjectClassesCustomObjectsCreate(customObjectClassId, crMCustomObjectEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectsApi#customObjectClassesCustomObjectsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectsApi#customObjectClassesCustomObjectsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customObjectClassId** | **java.util.UUID**|  |
 **crMCustomObjectEndpointRequest** | [**CRMCustomObjectEndpointRequest**](CRMCustomObjectEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**CRMCustomObjectResponse**](CRMCustomObjectResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="customObjectClassesCustomObjectsList"></a>
# **customObjectClassesCustomObjectsList**
> PaginatedCustomObjectList customObjectClassesCustomObjectsList(customObjectClassId, createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, includeRemoteFields, modifiedAfter, modifiedBefore, pageSize, remoteId)



Returns a list of &#x60;CustomObject&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = CustomObjectsApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
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
    val result : PaginatedCustomObjectList = apiInstance.customObjectClassesCustomObjectsList(customObjectClassId, createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, includeRemoteFields, modifiedAfter, modifiedBefore, pageSize, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectsApi#customObjectClassesCustomObjectsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectsApi#customObjectClassesCustomObjectsList")
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
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeRemoteFields** | **kotlin.Boolean**| Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedCustomObjectList**](PaginatedCustomObjectList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="customObjectClassesCustomObjectsMetaPatchRetrieve"></a>
# **customObjectClassesCustomObjectsMetaPatchRetrieve**
> MetaResponse customObjectClassesCustomObjectsMetaPatchRetrieve(customObjectClassId, id)



Returns metadata for &#x60;CRMCustomObject&#x60; PATCHs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = CustomObjectsApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : MetaResponse = apiInstance.customObjectClassesCustomObjectsMetaPatchRetrieve(customObjectClassId, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectsApi#customObjectClassesCustomObjectsMetaPatchRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectsApi#customObjectClassesCustomObjectsMetaPatchRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customObjectClassId** | **java.util.UUID**|  |
 **id** | **java.util.UUID**|  |

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

<a name="customObjectClassesCustomObjectsMetaPostRetrieve"></a>
# **customObjectClassesCustomObjectsMetaPostRetrieve**
> MetaResponse customObjectClassesCustomObjectsMetaPostRetrieve(customObjectClassId)



Returns metadata for &#x60;CRMCustomObject&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = CustomObjectsApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : MetaResponse = apiInstance.customObjectClassesCustomObjectsMetaPostRetrieve(customObjectClassId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectsApi#customObjectClassesCustomObjectsMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectsApi#customObjectClassesCustomObjectsMetaPostRetrieve")
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

<a name="customObjectClassesCustomObjectsPartialUpdate"></a>
# **customObjectClassesCustomObjectsPartialUpdate**
> CRMCustomObjectResponse customObjectClassesCustomObjectsPartialUpdate(customObjectClassId, id, patchedCRMCustomObjectEndpointRequest, isDebugMode, runAsync)



Updates a &#x60;CustomObject&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = CustomObjectsApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patchedCRMCustomObjectEndpointRequest : PatchedCRMCustomObjectEndpointRequest =  // PatchedCRMCustomObjectEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : CRMCustomObjectResponse = apiInstance.customObjectClassesCustomObjectsPartialUpdate(customObjectClassId, id, patchedCRMCustomObjectEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectsApi#customObjectClassesCustomObjectsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectsApi#customObjectClassesCustomObjectsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customObjectClassId** | **java.util.UUID**|  |
 **id** | **java.util.UUID**|  |
 **patchedCRMCustomObjectEndpointRequest** | [**PatchedCRMCustomObjectEndpointRequest**](PatchedCRMCustomObjectEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**CRMCustomObjectResponse**](CRMCustomObjectResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="customObjectClassesCustomObjectsRetrieve"></a>
# **customObjectClassesCustomObjectsRetrieve**
> CustomObject customObjectClassesCustomObjectsRetrieve(customObjectClassId, id, includeRemoteData, includeRemoteFields)



Returns a &#x60;CustomObject&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = CustomObjectsApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val includeRemoteFields : kotlin.Boolean = true // kotlin.Boolean | Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format.
try {
    val result : CustomObject = apiInstance.customObjectClassesCustomObjectsRetrieve(customObjectClassId, id, includeRemoteData, includeRemoteFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectsApi#customObjectClassesCustomObjectsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectsApi#customObjectClassesCustomObjectsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customObjectClassId** | **java.util.UUID**|  |
 **id** | **java.util.UUID**|  |
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeRemoteFields** | **kotlin.Boolean**| Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. | [optional]

### Return type

[**CustomObject**](CustomObject.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

