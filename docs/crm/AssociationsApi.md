# AssociationsApi

All URIs are relative to *https://api.merge.dev/api/crm/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customObjectClassesCustomObjectsAssociationsList**](AssociationsApi.md#customObjectClassesCustomObjectsAssociationsList) | **GET** /custom-object-classes/{custom_object_class_id}/custom-objects/{object_id}/associations | 
[**customObjectClassesCustomObjectsAssociationsUpdate**](AssociationsApi.md#customObjectClassesCustomObjectsAssociationsUpdate) | **PUT** /custom-object-classes/{source_class_id}/custom-objects/{source_object_id}/associations/{target_class_id}/{target_object_id}/{association_type_id} | 


<a name="customObjectClassesCustomObjectsAssociationsList"></a>
# **customObjectClassesCustomObjectsAssociationsList**
> PaginatedAssociationList customObjectClassesCustomObjectsAssociationsList(customObjectClassId, objectId, associationTypeId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId)



Returns a list of &#x60;Association&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = AssociationsApi()
val customObjectClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val objectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val associationTypeId : kotlin.String = associationTypeId_example // kotlin.String | If provided, will only return opportunities with this association_type.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = association_type // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedAssociationList = apiInstance.customObjectClassesCustomObjectsAssociationsList(customObjectClassId, objectId, associationTypeId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssociationsApi#customObjectClassesCustomObjectsAssociationsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssociationsApi#customObjectClassesCustomObjectsAssociationsList")
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
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
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

val apiInstance = AssociationsApi()
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
    println("4xx response calling AssociationsApi#customObjectClassesCustomObjectsAssociationsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssociationsApi#customObjectClassesCustomObjectsAssociationsUpdate")
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

