# CommonModelScopesApi

All URIs are relative to *https://api.merge.dev/api/accounting/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commonModelScopesCreate**](CommonModelScopesApi.md#commonModelScopesCreate) | **POST** /common-model-scopes | 
[**commonModelScopesRetrieve**](CommonModelScopesApi.md#commonModelScopesRetrieve) | **GET** /common-model-scopes | 


<a name="commonModelScopesCreate"></a>
# **commonModelScopesCreate**
> CommonModelScopes commonModelScopesCreate(commonModelScopesUpdateSerializer, linkedAccountId)



Update the configuration of what data is saved by Merge when syncing. Common model scopes are set as a default across all linked accounts, but can be updated to have greater granularity per account.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = CommonModelScopesApi()
val commonModelScopesUpdateSerializer : CommonModelScopesUpdateSerializer =  // CommonModelScopesUpdateSerializer | 
val linkedAccountId : kotlin.String = linkedAccountId_example // kotlin.String | ID of specific linked account to fetch
try {
    val result : CommonModelScopes = apiInstance.commonModelScopesCreate(commonModelScopesUpdateSerializer, linkedAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommonModelScopesApi#commonModelScopesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommonModelScopesApi#commonModelScopesCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commonModelScopesUpdateSerializer** | [**CommonModelScopesUpdateSerializer**](CommonModelScopesUpdateSerializer.md)|  |
 **linkedAccountId** | **kotlin.String**| ID of specific linked account to fetch | [optional]

### Return type

[**CommonModelScopes**](CommonModelScopes.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="commonModelScopesRetrieve"></a>
# **commonModelScopesRetrieve**
> CommonModelScopes commonModelScopesRetrieve(linkedAccountId)



Fetch the configuration of what data is saved by Merge when syncing. Common model scopes are set as a default across all linked accounts, but can be updated to have greater granularity per account.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = CommonModelScopesApi()
val linkedAccountId : kotlin.String = linkedAccountId_example // kotlin.String | ID of specific linked account to fetch
try {
    val result : CommonModelScopes = apiInstance.commonModelScopesRetrieve(linkedAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommonModelScopesApi#commonModelScopesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommonModelScopesApi#commonModelScopesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkedAccountId** | **kotlin.String**| ID of specific linked account to fetch | [optional]

### Return type

[**CommonModelScopes**](CommonModelScopes.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

