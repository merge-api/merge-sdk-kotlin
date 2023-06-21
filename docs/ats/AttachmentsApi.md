# AttachmentsApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachmentsCreate**](AttachmentsApi.md#attachmentsCreate) | **POST** /attachments | 
[**attachmentsList**](AttachmentsApi.md#attachmentsList) | **GET** /attachments | 
[**attachmentsMetaPostRetrieve**](AttachmentsApi.md#attachmentsMetaPostRetrieve) | **GET** /attachments/meta/post | 
[**attachmentsRetrieve**](AttachmentsApi.md#attachmentsRetrieve) | **GET** /attachments/{id} | 


<a name="attachmentsCreate"></a>
# **attachmentsCreate**
> AttachmentResponse attachmentsCreate(attachmentEndpointRequest, isDebugMode, runAsync)



Creates an &#x60;Attachment&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = AttachmentsApi()
val attachmentEndpointRequest : AttachmentEndpointRequest =  // AttachmentEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : AttachmentResponse = apiInstance.attachmentsCreate(attachmentEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentsApi#attachmentsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentsApi#attachmentsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentEndpointRequest** | [**AttachmentEndpointRequest**](AttachmentEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**AttachmentResponse**](AttachmentResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="attachmentsList"></a>
# **attachmentsList**
> PaginatedAttachmentList attachmentsList(candidateId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, showEnumOrigins)



Returns a list of &#x60;Attachment&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = AttachmentsApi()
val candidateId : kotlin.String = candidateId_example // kotlin.String | If provided, will only return attachments for this candidate.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = candidate // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteFields : kotlin.String = attachment_type // kotlin.String | Deprecated. Use show_enum_origins.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val showEnumOrigins : kotlin.String = attachment_type // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : PaginatedAttachmentList = apiInstance.attachmentsList(candidateId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentsApi#attachmentsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentsApi#attachmentsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **candidateId** | **kotlin.String**| If provided, will only return attachments for this candidate. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: candidate]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: attachment_type]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: attachment_type]

### Return type

[**PaginatedAttachmentList**](PaginatedAttachmentList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="attachmentsMetaPostRetrieve"></a>
# **attachmentsMetaPostRetrieve**
> MetaResponse attachmentsMetaPostRetrieve()



Returns metadata for &#x60;Attachment&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = AttachmentsApi()
try {
    val result : MetaResponse = apiInstance.attachmentsMetaPostRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentsApi#attachmentsMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentsApi#attachmentsMetaPostRetrieve")
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

<a name="attachmentsRetrieve"></a>
# **attachmentsRetrieve**
> Attachment attachmentsRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)



Returns an &#x60;Attachment&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = AttachmentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = candidate // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = attachment_type // kotlin.String | Deprecated. Use show_enum_origins.
val showEnumOrigins : kotlin.String = attachment_type // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : Attachment = apiInstance.attachmentsRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentsApi#attachmentsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentsApi#attachmentsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: candidate]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: attachment_type]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: attachment_type]

### Return type

[**Attachment**](Attachment.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

