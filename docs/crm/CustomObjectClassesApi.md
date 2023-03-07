# CustomObjectClassesApi

All URIs are relative to *https://api.merge.dev/api/crm/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customObjectClassesAssociationTypesCreate**](CustomObjectClassesApi.md#customObjectClassesAssociationTypesCreate) | **POST** /custom-object-classes/{custom_object_class_id}/association-types | 
[**customObjectClassesAssociationTypesList**](CustomObjectClassesApi.md#customObjectClassesAssociationTypesList) | **GET** /custom-object-classes/{custom_object_class_id}/association-types | 
[**customObjectClassesAssociationTypesMetaPostRetrieve**](CustomObjectClassesApi.md#customObjectClassesAssociationTypesMetaPostRetrieve) | **GET** /custom-object-classes/{custom_object_class_id}/association-types/meta/post | 
[**customObjectClassesAssociationTypesRetrieve**](CustomObjectClassesApi.md#customObjectClassesAssociationTypesRetrieve) | **GET** /custom-object-classes/{custom_object_class_id}/association-types/{id} | 
[**customObjectClassesCustomObjectsAssociationsList**](CustomObjectClassesApi.md#customObjectClassesCustomObjectsAssociationsList) | **GET** /custom-object-classes/{custom_object_class_id}/custom-objects/{object_id}/associations | 
[**customObjectClassesCustomObjectsAssociationsUpdate**](CustomObjectClassesApi.md#customObjectClassesCustomObjectsAssociationsUpdate) | **PUT** /custom-object-classes/{source_class_id}/custom-objects/{source_object_id}/associations/{target_class_id}/{target_object_id}/{association_type_id} | 
[**customObjectClassesCustomObjectsCreate**](CustomObjectClassesApi.md#customObjectClassesCustomObjectsCreate) | **POST** /custom-object-classes/{custom_object_class_id}/custom-objects | 
[**customObjectClassesCustomObjectsList**](CustomObjectClassesApi.md#customObjectClassesCustomObjectsList) | **GET** /custom-object-classes/{custom_object_class_id}/custom-objects | 
[**customObjectClassesCustomObjectsMetaPatchRetrieve**](CustomObjectClassesApi.md#customObjectClassesCustomObjectsMetaPatchRetrieve) | **GET** /custom-object-classes/{custom_object_class_id}/custom-objects/meta/patch/{id} | 
[**customObjectClassesCustomObjectsMetaPostRetrieve**](CustomObjectClassesApi.md#customObjectClassesCustomObjectsMetaPostRetrieve) | **GET** /custom-object-classes/{custom_object_class_id}/custom-objects/meta/post | 
[**customObjectClassesCustomObjectsPartialUpdate**](CustomObjectClassesApi.md#customObjectClassesCustomObjectsPartialUpdate) | **PATCH** /custom-object-classes/{custom_object_class_id}/custom-objects/{id} | 
[**customObjectClassesCustomObjectsRetrieve**](CustomObjectClassesApi.md#customObjectClassesCustomObjectsRetrieve) | **GET** /custom-object-classes/{custom_object_class_id}/custom-objects/{id} | 
[**customObjectClassesGeneratorUpdate**](CustomObjectClassesApi.md#customObjectClassesGeneratorUpdate) | **PUT** /custom-object-classes/generator/{generator_id} | 
[**customObjectClassesList**](CustomObjectClassesApi.md#customObjectClassesList) | **GET** /custom-object-classes | 
[**customObjectClassesRetrieve**](CustomObjectClassesApi.md#customObjectClassesRetrieve) | **GET** /custom-object-classes/{id} | 


<a name="customObjectClassesAssociationTypesCreate"></a>
# **customObjectClassesAssociationTypesCreate**
> CRMAssociationTypeResponse customObjectClassesAssociationTypesCreate(customObjectClassId, crMAssociationTypeEndpointRequest, isDebugMode, runAsync)



Creates an &#x60;AssociationType&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = CustomObjectClassesApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val crMAssociationTypeEndpointRequest : CRMAssociationTypeEndpointRequest =  // CRMAssociationTypeEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : CRMAssociationTypeResponse = apiInstance.customObjectClassesAssociationTypesCreate(customObjectClassId, crMAssociationTypeEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectClassesApi#customObjectClassesAssociationTypesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectClassesApi#customObjectClassesAssociationTypesCreate")
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

val apiInstance = CustomObjectClassesApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = target_object_classes // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedAssociationTypeList = apiInstance.customObjectClassesAssociationTypesList(customObjectClassId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectClassesApi#customObjectClassesAssociationTypesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectClassesApi#customObjectClassesAssociationTypesList")
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
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
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

val apiInstance = CustomObjectClassesApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : MetaResponse = apiInstance.customObjectClassesAssociationTypesMetaPostRetrieve(customObjectClassId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectClassesApi#customObjectClassesAssociationTypesMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectClassesApi#customObjectClassesAssociationTypesMetaPostRetrieve")
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

val apiInstance = CustomObjectClassesApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = target_object_classes // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
try {
    val result : AssociationType = apiInstance.customObjectClassesAssociationTypesRetrieve(customObjectClassId, id, expand, includeRemoteData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectClassesApi#customObjectClassesAssociationTypesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectClassesApi#customObjectClassesAssociationTypesRetrieve")
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

<a name="customObjectClassesCustomObjectsAssociationsList"></a>
# **customObjectClassesCustomObjectsAssociationsList**
> PaginatedAssociationList customObjectClassesCustomObjectsAssociationsList(customObjectClassId, objectId, associationTypeId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId)



Returns a list of &#x60;Association&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = CustomObjectClassesApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val objectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val associationTypeId : kotlin.String = associationTypeId_example // kotlin.String | If provided, will only return opportunities with this association_type.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = association_type // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedAssociationList = apiInstance.customObjectClassesCustomObjectsAssociationsList(customObjectClassId, objectId, associationTypeId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectClassesApi#customObjectClassesCustomObjectsAssociationsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectClassesApi#customObjectClassesCustomObjectsAssociationsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customObjectClassId** | **java.util.UUID**|  |
 **objectId** | **java.util.UUID**|  |
 **associationTypeId** | **kotlin.String**| If provided, will only return opportunities with this association_type. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: association_type]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedAssociationList**](PaginatedAssociationList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="customObjectClassesCustomObjectsAssociationsUpdate"></a>
# **customObjectClassesCustomObjectsAssociationsUpdate**
> Association customObjectClassesCustomObjectsAssociationsUpdate(associationTypeId, sourceClassId, sourceObjectId, targetClassId, targetObjectId, isDebugMode, runAsync)



Creates an Association between &#x60;source_object_id&#x60; and &#x60;target_object_id&#x60; of type &#x60;association_type_id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = CustomObjectClassesApi()
val associationTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val sourceClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val sourceObjectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val targetClassId : kotlin.String = targetClassId_example // kotlin.String | 
val targetObjectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : Association = apiInstance.customObjectClassesCustomObjectsAssociationsUpdate(associationTypeId, sourceClassId, sourceObjectId, targetClassId, targetObjectId, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectClassesApi#customObjectClassesCustomObjectsAssociationsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectClassesApi#customObjectClassesCustomObjectsAssociationsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **associationTypeId** | **java.util.UUID**|  |
 **sourceClassId** | **java.util.UUID**|  |
 **sourceObjectId** | **java.util.UUID**|  |
 **targetClassId** | **kotlin.String**|  |
 **targetObjectId** | **java.util.UUID**|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**Association**](Association.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="customObjectClassesCustomObjectsCreate"></a>
# **customObjectClassesCustomObjectsCreate**
> CRMCustomObjectResponse customObjectClassesCustomObjectsCreate(customObjectClassId, crMCustomObjectEndpointRequest, isDebugMode, runAsync)



Creates a &#x60;CustomObject&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = CustomObjectClassesApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val crMCustomObjectEndpointRequest : CRMCustomObjectEndpointRequest =  // CRMCustomObjectEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : CRMCustomObjectResponse = apiInstance.customObjectClassesCustomObjectsCreate(customObjectClassId, crMCustomObjectEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectClassesApi#customObjectClassesCustomObjectsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectClassesApi#customObjectClassesCustomObjectsCreate")
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

val apiInstance = CustomObjectClassesApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val includeRemoteFields : kotlin.Boolean = true // kotlin.Boolean | Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedCustomObjectList = apiInstance.customObjectClassesCustomObjectsList(customObjectClassId, createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, includeRemoteFields, modifiedAfter, modifiedBefore, pageSize, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectClassesApi#customObjectClassesCustomObjectsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectClassesApi#customObjectClassesCustomObjectsList")
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
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
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

val apiInstance = CustomObjectClassesApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : MetaResponse = apiInstance.customObjectClassesCustomObjectsMetaPatchRetrieve(customObjectClassId, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectClassesApi#customObjectClassesCustomObjectsMetaPatchRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectClassesApi#customObjectClassesCustomObjectsMetaPatchRetrieve")
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

val apiInstance = CustomObjectClassesApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : MetaResponse = apiInstance.customObjectClassesCustomObjectsMetaPostRetrieve(customObjectClassId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectClassesApi#customObjectClassesCustomObjectsMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectClassesApi#customObjectClassesCustomObjectsMetaPostRetrieve")
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

val apiInstance = CustomObjectClassesApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patchedCRMCustomObjectEndpointRequest : PatchedCRMCustomObjectEndpointRequest =  // PatchedCRMCustomObjectEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : CRMCustomObjectResponse = apiInstance.customObjectClassesCustomObjectsPartialUpdate(customObjectClassId, id, patchedCRMCustomObjectEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectClassesApi#customObjectClassesCustomObjectsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectClassesApi#customObjectClassesCustomObjectsPartialUpdate")
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

val apiInstance = CustomObjectClassesApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val includeRemoteFields : kotlin.Boolean = true // kotlin.Boolean | Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format.
try {
    val result : CustomObject = apiInstance.customObjectClassesCustomObjectsRetrieve(customObjectClassId, id, includeRemoteData, includeRemoteFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectClassesApi#customObjectClassesCustomObjectsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectClassesApi#customObjectClassesCustomObjectsRetrieve")
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

<a name="customObjectClassesGeneratorUpdate"></a>
# **customObjectClassesGeneratorUpdate**
> CustomObjectClass customObjectClassesGeneratorUpdate(generatorId, isDebugMode, runAsync)



Updates a &#x60;CustomObjectClass&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = CustomObjectClassesApi()
val generatorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : CustomObjectClass = apiInstance.customObjectClassesGeneratorUpdate(generatorId, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectClassesApi#customObjectClassesGeneratorUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectClassesApi#customObjectClassesGeneratorUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generatorId** | **java.util.UUID**|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**CustomObjectClass**](CustomObjectClass.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="customObjectClassesList"></a>
# **customObjectClassesList**
> PaginatedCustomObjectClassList customObjectClassesList(createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId)



Returns a list of &#x60;CustomObjectClass&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = CustomObjectClassesApi()
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = fields // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedCustomObjectClassList = apiInstance.customObjectClassesList(createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectClassesApi#customObjectClassesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectClassesApi#customObjectClassesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: fields]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedCustomObjectClassList**](PaginatedCustomObjectClassList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="customObjectClassesRetrieve"></a>
# **customObjectClassesRetrieve**
> CustomObjectClass customObjectClassesRetrieve(id, expand, includeRemoteData)



Returns a &#x60;CustomObjectClass&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = CustomObjectClassesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = fields // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
try {
    val result : CustomObjectClass = apiInstance.customObjectClassesRetrieve(id, expand, includeRemoteData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomObjectClassesApi#customObjectClassesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomObjectClassesApi#customObjectClassesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: fields]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]

### Return type

[**CustomObjectClass**](CustomObjectClass.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

