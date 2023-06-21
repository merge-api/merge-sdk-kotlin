# CollectionsApi

All URIs are relative to *https://api.merge.dev/api/ticketing/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**collectionsList**](CollectionsApi.md#collectionsList) | **GET** /collections | 
[**collectionsRetrieve**](CollectionsApi.md#collectionsRetrieve) | **GET** /collections/{id} | 
[**collectionsUsersList**](CollectionsApi.md#collectionsUsersList) | **GET** /collections/{parent_id}/users | 


<a name="collectionsList"></a>
# **collectionsList**
> PaginatedCollectionList collectionsList(collectionType, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, parentCollectionId, remoteFields, remoteId, showEnumOrigins)



Returns a list of &#x60;Collection&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ticketing.models.*

val apiInstance = CollectionsApi()
val collectionType : kotlin.String = collectionType_example // kotlin.String | If provided, will only return collections of the given type.  * `LIST` - LIST * `PROJECT` - PROJECT
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = parent_collection // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val parentCollectionId : kotlin.String = parentCollectionId_example // kotlin.String | If provided, will only return collections whose parent collection matches the given id.
val remoteFields : kotlin.String = collection_type // kotlin.String | Deprecated. Use show_enum_origins.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val showEnumOrigins : kotlin.String = collection_type // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : PaginatedCollectionList = apiInstance.collectionsList(collectionType, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, parentCollectionId, remoteFields, remoteId, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#collectionsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#collectionsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionType** | **kotlin.String**| If provided, will only return collections of the given type.  * &#x60;LIST&#x60; - LIST * &#x60;PROJECT&#x60; - PROJECT | [optional] [enum: LIST, PROJECT]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: parent_collection]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **parentCollectionId** | **kotlin.String**| If provided, will only return collections whose parent collection matches the given id. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: collection_type]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: collection_type]

### Return type

[**PaginatedCollectionList**](PaginatedCollectionList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="collectionsRetrieve"></a>
# **collectionsRetrieve**
> Collection collectionsRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)



Returns a &#x60;Collection&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ticketing.models.*

val apiInstance = CollectionsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = parent_collection // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = collection_type // kotlin.String | Deprecated. Use show_enum_origins.
val showEnumOrigins : kotlin.String = collection_type // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : Collection = apiInstance.collectionsRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#collectionsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#collectionsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: parent_collection]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: collection_type]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: collection_type]

### Return type

[**Collection**](Collection.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="collectionsUsersList"></a>
# **collectionsUsersList**
> PaginatedUserList collectionsUsersList(parentId, cursor, expand, includeDeletedData, includeRemoteData, pageSize)



Returns a list of &#x60;User&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ticketing.models.*

val apiInstance = CollectionsApi()
val parentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = teams // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
try {
    val result : PaginatedUserList = apiInstance.collectionsUsersList(parentId, cursor, expand, includeDeletedData, includeRemoteData, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#collectionsUsersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#collectionsUsersList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **java.util.UUID**|  |
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: teams]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]

### Return type

[**PaginatedUserList**](PaginatedUserList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

