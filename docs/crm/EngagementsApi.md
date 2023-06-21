# EngagementsApi

All URIs are relative to *https://api.merge.dev/api/crm/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**engagementsCreate**](EngagementsApi.md#engagementsCreate) | **POST** /engagements | 
[**engagementsList**](EngagementsApi.md#engagementsList) | **GET** /engagements | 
[**engagementsMetaPatchRetrieve**](EngagementsApi.md#engagementsMetaPatchRetrieve) | **GET** /engagements/meta/patch/{id} | 
[**engagementsMetaPostRetrieve**](EngagementsApi.md#engagementsMetaPostRetrieve) | **GET** /engagements/meta/post | 
[**engagementsPartialUpdate**](EngagementsApi.md#engagementsPartialUpdate) | **PATCH** /engagements/{id} | 
[**engagementsRemoteFieldClassesList**](EngagementsApi.md#engagementsRemoteFieldClassesList) | **GET** /engagements/remote-field-classes | 
[**engagementsRetrieve**](EngagementsApi.md#engagementsRetrieve) | **GET** /engagements/{id} | 


<a name="engagementsCreate"></a>
# **engagementsCreate**
> EngagementResponse engagementsCreate(engagementEndpointRequest, isDebugMode, runAsync)



Creates an &#x60;Engagement&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = EngagementsApi()
val engagementEndpointRequest : EngagementEndpointRequest =  // EngagementEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : EngagementResponse = apiInstance.engagementsCreate(engagementEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EngagementsApi#engagementsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EngagementsApi#engagementsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engagementEndpointRequest** | [**EngagementEndpointRequest**](EngagementEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**EngagementResponse**](EngagementResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="engagementsList"></a>
# **engagementsList**
> PaginatedEngagementList engagementsList(createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, includeRemoteFields, modifiedAfter, modifiedBefore, pageSize, remoteId)



Returns a list of &#x60;Engagement&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = EngagementsApi()
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = contacts,owner,account,engagement_type // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val includeRemoteFields : kotlin.Boolean = true // kotlin.Boolean | Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedEngagementList = apiInstance.engagementsList(createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, includeRemoteFields, modifiedAfter, modifiedBefore, pageSize, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EngagementsApi#engagementsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EngagementsApi#engagementsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: account, account,engagement_type, contacts, contacts,account, contacts,account,engagement_type, contacts,engagement_type, contacts,owner, contacts,owner,account, contacts,owner,account,engagement_type, contacts,owner,engagement_type, engagement_type, owner, owner,account, owner,account,engagement_type, owner,engagement_type]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeRemoteFields** | **kotlin.Boolean**| Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedEngagementList**](PaginatedEngagementList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="engagementsMetaPatchRetrieve"></a>
# **engagementsMetaPatchRetrieve**
> MetaResponse engagementsMetaPatchRetrieve(id)



Returns metadata for &#x60;Engagement&#x60; PATCHs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = EngagementsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : MetaResponse = apiInstance.engagementsMetaPatchRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EngagementsApi#engagementsMetaPatchRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EngagementsApi#engagementsMetaPatchRetrieve")
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

<a name="engagementsMetaPostRetrieve"></a>
# **engagementsMetaPostRetrieve**
> MetaResponse engagementsMetaPostRetrieve()



Returns metadata for &#x60;Engagement&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = EngagementsApi()
try {
    val result : MetaResponse = apiInstance.engagementsMetaPostRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EngagementsApi#engagementsMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EngagementsApi#engagementsMetaPostRetrieve")
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

<a name="engagementsPartialUpdate"></a>
# **engagementsPartialUpdate**
> EngagementResponse engagementsPartialUpdate(id, patchedEngagementEndpointRequest, isDebugMode, runAsync)



Updates an &#x60;Engagement&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = EngagementsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patchedEngagementEndpointRequest : PatchedEngagementEndpointRequest =  // PatchedEngagementEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : EngagementResponse = apiInstance.engagementsPartialUpdate(id, patchedEngagementEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EngagementsApi#engagementsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EngagementsApi#engagementsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **patchedEngagementEndpointRequest** | [**PatchedEngagementEndpointRequest**](PatchedEngagementEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**EngagementResponse**](EngagementResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="engagementsRemoteFieldClassesList"></a>
# **engagementsRemoteFieldClassesList**
> PaginatedRemoteFieldClassList engagementsRemoteFieldClassesList(cursor, includeDeletedData, includeRemoteData, includeRemoteFields, pageSize)



Returns a list of &#x60;RemoteFieldClass&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = EngagementsApi()
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val includeRemoteFields : kotlin.Boolean = true // kotlin.Boolean | Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
try {
    val result : PaginatedRemoteFieldClassList = apiInstance.engagementsRemoteFieldClassesList(cursor, includeDeletedData, includeRemoteData, includeRemoteFields, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EngagementsApi#engagementsRemoteFieldClassesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EngagementsApi#engagementsRemoteFieldClassesList")
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

<a name="engagementsRetrieve"></a>
# **engagementsRetrieve**
> Engagement engagementsRetrieve(id, expand, includeRemoteData, includeRemoteFields)



Returns an &#x60;Engagement&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = EngagementsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = contacts,owner,account,engagement_type // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val includeRemoteFields : kotlin.Boolean = true // kotlin.Boolean | Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format.
try {
    val result : Engagement = apiInstance.engagementsRetrieve(id, expand, includeRemoteData, includeRemoteFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EngagementsApi#engagementsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EngagementsApi#engagementsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: account, account,engagement_type, contacts, contacts,account, contacts,account,engagement_type, contacts,engagement_type, contacts,owner, contacts,owner,account, contacts,owner,account,engagement_type, contacts,owner,engagement_type, engagement_type, owner, owner,account, owner,account,engagement_type, owner,engagement_type]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeRemoteFields** | **kotlin.Boolean**| Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. | [optional]

### Return type

[**Engagement**](Engagement.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

