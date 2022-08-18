# AccountsApi

All URIs are relative to *https://api.merge.dev/api/crm/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountsCreate**](AccountsApi.md#accountsCreate) | **POST** /accounts | 
[**accountsList**](AccountsApi.md#accountsList) | **GET** /accounts | 
[**accountsMetaPostRetrieve**](AccountsApi.md#accountsMetaPostRetrieve) | **GET** /accounts/meta/post | 
[**accountsRetrieve**](AccountsApi.md#accountsRetrieve) | **GET** /accounts/{id} | 


<a name="accountsCreate"></a>
# **accountsCreate**
> CRMAccountResponse accountsCreate(crMAccountEndpointRequest, isDebugMode, runAsync)



Creates an &#x60;Account&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = AccountsApi()
val crMAccountEndpointRequest : CRMAccountEndpointRequest =  // CRMAccountEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : CRMAccountResponse = apiInstance.accountsCreate(crMAccountEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#accountsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#accountsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crMAccountEndpointRequest** | [**CRMAccountEndpointRequest**](CRMAccountEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**CRMAccountResponse**](CRMAccountResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="accountsList"></a>
# **accountsList**
> PaginatedAccountList accountsList(createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, ownerId, pageSize, remoteId)



Returns a list of &#x60;Account&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = AccountsApi()
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = owner // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val ownerId : kotlin.String = ownerId_example // kotlin.String | If provided, will only return accounts with this owner.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedAccountList = apiInstance.accountsList(createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, ownerId, pageSize, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#accountsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#accountsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: owner]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **ownerId** | **kotlin.String**| If provided, will only return accounts with this owner. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedAccountList**](PaginatedAccountList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountsMetaPostRetrieve"></a>
# **accountsMetaPostRetrieve**
> MetaResponse accountsMetaPostRetrieve()



Returns metadata for &#x60;CRMAccount&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = AccountsApi()
try {
    val result : MetaResponse = apiInstance.accountsMetaPostRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#accountsMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#accountsMetaPostRetrieve")
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

<a name="accountsRetrieve"></a>
# **accountsRetrieve**
> Account accountsRetrieve(id, expand, includeRemoteData)



Returns an &#x60;Account&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = AccountsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = owner // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
try {
    val result : Account = apiInstance.accountsRetrieve(id, expand, includeRemoteData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#accountsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#accountsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: owner]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]

### Return type

[**Account**](Account.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

