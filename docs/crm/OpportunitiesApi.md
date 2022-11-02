# OpportunitiesApi

All URIs are relative to *https://api.merge.dev/api/crm/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**opportunitiesCreate**](OpportunitiesApi.md#opportunitiesCreate) | **POST** /opportunities | 
[**opportunitiesList**](OpportunitiesApi.md#opportunitiesList) | **GET** /opportunities | 
[**opportunitiesMetaPatchRetrieve**](OpportunitiesApi.md#opportunitiesMetaPatchRetrieve) | **GET** /opportunities/meta/patch/{id} | 
[**opportunitiesMetaPostRetrieve**](OpportunitiesApi.md#opportunitiesMetaPostRetrieve) | **GET** /opportunities/meta/post | 
[**opportunitiesPartialUpdate**](OpportunitiesApi.md#opportunitiesPartialUpdate) | **PATCH** /opportunities/{id} | 
[**opportunitiesRetrieve**](OpportunitiesApi.md#opportunitiesRetrieve) | **GET** /opportunities/{id} | 


<a name="opportunitiesCreate"></a>
# **opportunitiesCreate**
> OpportunityResponse opportunitiesCreate(opportunityEndpointRequest, isDebugMode, runAsync)



Creates an &#x60;Opportunity&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = OpportunitiesApi()
val opportunityEndpointRequest : OpportunityEndpointRequest =  // OpportunityEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : OpportunityResponse = apiInstance.opportunitiesCreate(opportunityEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpportunitiesApi#opportunitiesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpportunitiesApi#opportunitiesCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **opportunityEndpointRequest** | [**OpportunityEndpointRequest**](OpportunityEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**OpportunityResponse**](OpportunityResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="opportunitiesList"></a>
# **opportunitiesList**
> PaginatedOpportunityList opportunitiesList(accountId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, ownerId, pageSize, remoteFields, remoteId, stageId, status)



Returns a list of &#x60;Opportunity&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = OpportunitiesApi()
val accountId : kotlin.String = accountId_example // kotlin.String | If provided, will only return opportunities with this account.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = owner,stage,account // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val ownerId : kotlin.String = ownerId_example // kotlin.String | If provided, will only return opportunities with this owner.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteFields : kotlin.String = status // kotlin.String | Which fields should be returned in non-normalized form.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val stageId : kotlin.String = stageId_example // kotlin.String | If provided, will only return opportunities with this stage.
val status : kotlin.String = status_example // kotlin.String | If provided, will only return opportunities with this status. Options: ('OPEN', 'WON', 'LOST')
try {
    val result : PaginatedOpportunityList = apiInstance.opportunitiesList(accountId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, ownerId, pageSize, remoteFields, remoteId, stageId, status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpportunitiesApi#opportunitiesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpportunitiesApi#opportunitiesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| If provided, will only return opportunities with this account. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: account, owner, owner,account, owner,stage, owner,stage,account, stage, stage,account]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **ownerId** | **kotlin.String**| If provided, will only return opportunities with this owner. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteFields** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: status]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **stageId** | **kotlin.String**| If provided, will only return opportunities with this stage. | [optional]
 **status** | **kotlin.String**| If provided, will only return opportunities with this status. Options: (&#39;OPEN&#39;, &#39;WON&#39;, &#39;LOST&#39;) | [optional] [enum: LOST, OPEN, WON]

### Return type

[**PaginatedOpportunityList**](PaginatedOpportunityList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="opportunitiesMetaPatchRetrieve"></a>
# **opportunitiesMetaPatchRetrieve**
> MetaResponse opportunitiesMetaPatchRetrieve(id)



Returns metadata for &#x60;Opportunity&#x60; PATCHs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = OpportunitiesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : MetaResponse = apiInstance.opportunitiesMetaPatchRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpportunitiesApi#opportunitiesMetaPatchRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpportunitiesApi#opportunitiesMetaPatchRetrieve")
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

<a name="opportunitiesMetaPostRetrieve"></a>
# **opportunitiesMetaPostRetrieve**
> MetaResponse opportunitiesMetaPostRetrieve()



Returns metadata for &#x60;Opportunity&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = OpportunitiesApi()
try {
    val result : MetaResponse = apiInstance.opportunitiesMetaPostRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpportunitiesApi#opportunitiesMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpportunitiesApi#opportunitiesMetaPostRetrieve")
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

<a name="opportunitiesPartialUpdate"></a>
# **opportunitiesPartialUpdate**
> OpportunityResponse opportunitiesPartialUpdate(id, patchedOpportunityEndpointRequest, isDebugMode, runAsync)



Updates an &#x60;Opportunity&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = OpportunitiesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patchedOpportunityEndpointRequest : PatchedOpportunityEndpointRequest =  // PatchedOpportunityEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : OpportunityResponse = apiInstance.opportunitiesPartialUpdate(id, patchedOpportunityEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpportunitiesApi#opportunitiesPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpportunitiesApi#opportunitiesPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **patchedOpportunityEndpointRequest** | [**PatchedOpportunityEndpointRequest**](PatchedOpportunityEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**OpportunityResponse**](OpportunityResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="opportunitiesRetrieve"></a>
# **opportunitiesRetrieve**
> Opportunity opportunitiesRetrieve(id, expand, includeRemoteData, remoteFields)



Returns an &#x60;Opportunity&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = OpportunitiesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = owner,stage,account // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = status // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : Opportunity = apiInstance.opportunitiesRetrieve(id, expand, includeRemoteData, remoteFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpportunitiesApi#opportunitiesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpportunitiesApi#opportunitiesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: account, owner, owner,account, owner,stage, owner,stage,account, stage, stage,account]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: status]

### Return type

[**Opportunity**](Opportunity.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

