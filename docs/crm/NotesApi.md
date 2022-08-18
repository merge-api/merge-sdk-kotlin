# NotesApi

All URIs are relative to *https://api.merge.dev/api/crm/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notesCreate**](NotesApi.md#notesCreate) | **POST** /notes | 
[**notesList**](NotesApi.md#notesList) | **GET** /notes | 
[**notesMetaPostRetrieve**](NotesApi.md#notesMetaPostRetrieve) | **GET** /notes/meta/post | 
[**notesRetrieve**](NotesApi.md#notesRetrieve) | **GET** /notes/{id} | 


<a name="notesCreate"></a>
# **notesCreate**
> NoteResponse notesCreate(noteEndpointRequest, isDebugMode, runAsync)



Creates a &#x60;Note&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = NotesApi()
val noteEndpointRequest : NoteEndpointRequest =  // NoteEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : NoteResponse = apiInstance.notesCreate(noteEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotesApi#notesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotesApi#notesCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **noteEndpointRequest** | [**NoteEndpointRequest**](NoteEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**NoteResponse**](NoteResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="notesList"></a>
# **notesList**
> PaginatedNoteList notesList(accountId, contactId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, opportunityId, ownerId, pageSize, remoteId)



Returns a list of &#x60;Note&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = NotesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | If provided, will only return notes with this account.
val contactId : kotlin.String = contactId_example // kotlin.String | If provided, will only return notes with this contact.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = owner,contact,account,opportunity // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val opportunityId : kotlin.String = opportunityId_example // kotlin.String | If provided, will only return notes with this opportunity.
val ownerId : kotlin.String = ownerId_example // kotlin.String | If provided, will only return notes with this owner.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedNoteList = apiInstance.notesList(accountId, contactId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, opportunityId, ownerId, pageSize, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotesApi#notesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotesApi#notesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| If provided, will only return notes with this account. | [optional]
 **contactId** | **kotlin.String**| If provided, will only return notes with this contact. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: account, account,opportunity, contact, contact,account, contact,account,opportunity, contact,opportunity, opportunity, owner, owner,account, owner,account,opportunity, owner,contact, owner,contact,account, owner,contact,account,opportunity, owner,contact,opportunity, owner,opportunity]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **opportunityId** | **kotlin.String**| If provided, will only return notes with this opportunity. | [optional]
 **ownerId** | **kotlin.String**| If provided, will only return notes with this owner. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedNoteList**](PaginatedNoteList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notesMetaPostRetrieve"></a>
# **notesMetaPostRetrieve**
> MetaResponse notesMetaPostRetrieve()



Returns metadata for &#x60;Note&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = NotesApi()
try {
    val result : MetaResponse = apiInstance.notesMetaPostRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotesApi#notesMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotesApi#notesMetaPostRetrieve")
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

<a name="notesRetrieve"></a>
# **notesRetrieve**
> Note notesRetrieve(id, expand, includeRemoteData)



Returns a &#x60;Note&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = NotesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = owner,contact,account,opportunity // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
try {
    val result : Note = apiInstance.notesRetrieve(id, expand, includeRemoteData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotesApi#notesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotesApi#notesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: account, account,opportunity, contact, contact,account, contact,account,opportunity, contact,opportunity, opportunity, owner, owner,account, owner,account,opportunity, owner,contact, owner,contact,account, owner,contact,account,opportunity, owner,contact,opportunity, owner,opportunity]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]

### Return type

[**Note**](Note.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

