# CandidatesApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**candidatesCreate**](CandidatesApi.md#candidatesCreate) | **POST** /candidates | 
[**candidatesIgnoreCreate**](CandidatesApi.md#candidatesIgnoreCreate) | **POST** /candidates/ignore/{model_id} | 
[**candidatesList**](CandidatesApi.md#candidatesList) | **GET** /candidates | 
[**candidatesMetaPostRetrieve**](CandidatesApi.md#candidatesMetaPostRetrieve) | **GET** /candidates/meta/post | 
[**candidatesRetrieve**](CandidatesApi.md#candidatesRetrieve) | **GET** /candidates/{id} | 


<a name="candidatesCreate"></a>
# **candidatesCreate**
> CandidateResponse candidatesCreate(candidateEndpointRequest, isDebugMode, runAsync)



Creates a &#x60;Candidate&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = CandidatesApi()
val candidateEndpointRequest : CandidateEndpointRequest =  // CandidateEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : CandidateResponse = apiInstance.candidatesCreate(candidateEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CandidatesApi#candidatesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CandidatesApi#candidatesCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **candidateEndpointRequest** | [**CandidateEndpointRequest**](CandidateEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**CandidateResponse**](CandidateResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="candidatesIgnoreCreate"></a>
# **candidatesIgnoreCreate**
> IgnoreCommonModel candidatesIgnoreCreate(modelId, ignoreCommonModelRequest)



Ignores a specific row based on the &#x60;model_id&#x60; in the url. These records will have their properties set to null, and will not be updated in future syncs. The \&quot;reason\&quot; and \&quot;message\&quot; fields in the request body will be stored for audit purposes.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = CandidatesApi()
val modelId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val ignoreCommonModelRequest : IgnoreCommonModelRequest =  // IgnoreCommonModelRequest | 
try {
    val result : IgnoreCommonModel = apiInstance.candidatesIgnoreCreate(modelId, ignoreCommonModelRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CandidatesApi#candidatesIgnoreCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CandidatesApi#candidatesIgnoreCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **java.util.UUID**|  |
 **ignoreCommonModelRequest** | [**IgnoreCommonModelRequest**](IgnoreCommonModelRequest.md)|  |

### Return type

[**IgnoreCommonModel**](IgnoreCommonModel.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="candidatesList"></a>
# **candidatesList**
> PaginatedCandidateList candidatesList(createdAfter, createdBefore, cursor, emailAddresses, expand, firstName, includeDeletedData, includeRemoteData, lastName, modifiedAfter, modifiedBefore, pageSize, remoteId, tags)



Returns a list of &#x60;Candidate&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = CandidatesApi()
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val emailAddresses : kotlin.String = emailAddresses_example // kotlin.String | If provided, will only return candidates with these email addresses; multiple addresses can be separated by commas.
val expand : kotlin.String = applications,attachments // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val firstName : kotlin.String = firstName_example // kotlin.String | If provided, will only return candidates with this first name.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val lastName : kotlin.String = lastName_example // kotlin.String | If provided, will only return candidates with this last name.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val tags : kotlin.String = tags_example // kotlin.String | If provided, will only return candidates with these tags; multiple tags can be separated by commas.
try {
    val result : PaginatedCandidateList = apiInstance.candidatesList(createdAfter, createdBefore, cursor, emailAddresses, expand, firstName, includeDeletedData, includeRemoteData, lastName, modifiedAfter, modifiedBefore, pageSize, remoteId, tags)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CandidatesApi#candidatesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CandidatesApi#candidatesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **emailAddresses** | **kotlin.String**| If provided, will only return candidates with these email addresses; multiple addresses can be separated by commas. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: applications, applications,attachments, attachments]
 **firstName** | **kotlin.String**| If provided, will only return candidates with this first name. | [optional]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **lastName** | **kotlin.String**| If provided, will only return candidates with this last name. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **tags** | **kotlin.String**| If provided, will only return candidates with these tags; multiple tags can be separated by commas. | [optional]

### Return type

[**PaginatedCandidateList**](PaginatedCandidateList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="candidatesMetaPostRetrieve"></a>
# **candidatesMetaPostRetrieve**
> MetaResponse candidatesMetaPostRetrieve()



Returns metadata for &#x60;Candidate&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = CandidatesApi()
try {
    val result : MetaResponse = apiInstance.candidatesMetaPostRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CandidatesApi#candidatesMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CandidatesApi#candidatesMetaPostRetrieve")
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

<a name="candidatesRetrieve"></a>
# **candidatesRetrieve**
> Candidate candidatesRetrieve(id, expand, includeRemoteData)



Returns a &#x60;Candidate&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = CandidatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = applications,attachments // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
try {
    val result : Candidate = apiInstance.candidatesRetrieve(id, expand, includeRemoteData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CandidatesApi#candidatesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CandidatesApi#candidatesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: applications, applications,attachments, attachments]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]

### Return type

[**Candidate**](Candidate.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

