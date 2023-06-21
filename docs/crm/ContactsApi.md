# ContactsApi

All URIs are relative to *https://api.merge.dev/api/crm/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contactsCreate**](ContactsApi.md#contactsCreate) | **POST** /contacts | 
[**contactsIgnoreCreate**](ContactsApi.md#contactsIgnoreCreate) | **POST** /contacts/ignore/{model_id} | 
[**contactsList**](ContactsApi.md#contactsList) | **GET** /contacts | 
[**contactsMetaPatchRetrieve**](ContactsApi.md#contactsMetaPatchRetrieve) | **GET** /contacts/meta/patch/{id} | 
[**contactsMetaPostRetrieve**](ContactsApi.md#contactsMetaPostRetrieve) | **GET** /contacts/meta/post | 
[**contactsPartialUpdate**](ContactsApi.md#contactsPartialUpdate) | **PATCH** /contacts/{id} | 
[**contactsRemoteFieldClassesList**](ContactsApi.md#contactsRemoteFieldClassesList) | **GET** /contacts/remote-field-classes | 
[**contactsRetrieve**](ContactsApi.md#contactsRetrieve) | **GET** /contacts/{id} | 


<a name="contactsCreate"></a>
# **contactsCreate**
> CRMContactResponse contactsCreate(crMContactEndpointRequest, isDebugMode, runAsync)



Creates a &#x60;Contact&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = ContactsApi()
val crMContactEndpointRequest : CRMContactEndpointRequest =  // CRMContactEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : CRMContactResponse = apiInstance.contactsCreate(crMContactEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#contactsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#contactsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crMContactEndpointRequest** | [**CRMContactEndpointRequest**](CRMContactEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**CRMContactResponse**](CRMContactResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="contactsIgnoreCreate"></a>
# **contactsIgnoreCreate**
> contactsIgnoreCreate(modelId, ignoreCommonModelRequest)



Ignores a specific row based on the &#x60;model_id&#x60; in the url. These records will have their properties set to null, and will not be updated in future syncs. The \&quot;reason\&quot; and \&quot;message\&quot; fields in the request body will be stored for audit purposes.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = ContactsApi()
val modelId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val ignoreCommonModelRequest : IgnoreCommonModelRequest =  // IgnoreCommonModelRequest | 
try {
    apiInstance.contactsIgnoreCreate(modelId, ignoreCommonModelRequest)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#contactsIgnoreCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#contactsIgnoreCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **java.util.UUID**|  |
 **ignoreCommonModelRequest** | [**IgnoreCommonModelRequest**](IgnoreCommonModelRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: Not defined

<a name="contactsList"></a>
# **contactsList**
> PaginatedContactList contactsList(accountId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, includeRemoteFields, modifiedAfter, modifiedBefore, pageSize, remoteId)



Returns a list of &#x60;Contact&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = ContactsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | If provided, will only return contacts with this account.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = account // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val includeRemoteFields : kotlin.Boolean = true // kotlin.Boolean | Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedContactList = apiInstance.contactsList(accountId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, includeRemoteFields, modifiedAfter, modifiedBefore, pageSize, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#contactsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#contactsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| If provided, will only return contacts with this account. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: account]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeRemoteFields** | **kotlin.Boolean**| Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedContactList**](PaginatedContactList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contactsMetaPatchRetrieve"></a>
# **contactsMetaPatchRetrieve**
> MetaResponse contactsMetaPatchRetrieve(id)



Returns metadata for &#x60;CRMContact&#x60; PATCHs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = ContactsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : MetaResponse = apiInstance.contactsMetaPatchRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#contactsMetaPatchRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#contactsMetaPatchRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="contactsMetaPostRetrieve"></a>
# **contactsMetaPostRetrieve**
> MetaResponse contactsMetaPostRetrieve()



Returns metadata for &#x60;CRMContact&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = ContactsApi()
try {
    val result : MetaResponse = apiInstance.contactsMetaPostRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#contactsMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#contactsMetaPostRetrieve")
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

<a name="contactsPartialUpdate"></a>
# **contactsPartialUpdate**
> CRMContactResponse contactsPartialUpdate(id, patchedCRMContactEndpointRequest, isDebugMode, runAsync)



Updates a &#x60;Contact&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = ContactsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patchedCRMContactEndpointRequest : PatchedCRMContactEndpointRequest =  // PatchedCRMContactEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : CRMContactResponse = apiInstance.contactsPartialUpdate(id, patchedCRMContactEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#contactsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#contactsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **patchedCRMContactEndpointRequest** | [**PatchedCRMContactEndpointRequest**](PatchedCRMContactEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**CRMContactResponse**](CRMContactResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="contactsRemoteFieldClassesList"></a>
# **contactsRemoteFieldClassesList**
> PaginatedRemoteFieldClassList contactsRemoteFieldClassesList(cursor, includeDeletedData, includeRemoteData, includeRemoteFields, pageSize)



Returns a list of &#x60;RemoteFieldClass&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = ContactsApi()
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val includeRemoteFields : kotlin.Boolean = true // kotlin.Boolean | Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
try {
    val result : PaginatedRemoteFieldClassList = apiInstance.contactsRemoteFieldClassesList(cursor, includeDeletedData, includeRemoteData, includeRemoteFields, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#contactsRemoteFieldClassesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#contactsRemoteFieldClassesList")
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

<a name="contactsRetrieve"></a>
# **contactsRetrieve**
> Contact contactsRetrieve(id, expand, includeRemoteData, includeRemoteFields)



Returns a &#x60;Contact&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = ContactsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = account // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val includeRemoteFields : kotlin.Boolean = true // kotlin.Boolean | Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format.
try {
    val result : Contact = apiInstance.contactsRetrieve(id, expand, includeRemoteData, includeRemoteFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#contactsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#contactsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: account]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeRemoteFields** | **kotlin.Boolean**| Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. | [optional]

### Return type

[**Contact**](Contact.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

