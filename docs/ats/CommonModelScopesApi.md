# CommonModelScopesApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commonModelScopesRetrieve**](CommonModelScopesApi.md#commonModelScopesRetrieve) | **GET** /common-model-scopes | 
[**commonModelScopesUpdate**](CommonModelScopesApi.md#commonModelScopesUpdate) | **PUT** /common-model-scopes | 


<a name="commonModelScopesRetrieve"></a>
# **commonModelScopesRetrieve**
> CommonModelScopes commonModelScopesRetrieve(integrationSlug, linkedAccountId)



Fetch the configuration of what data is saved by Merge when syncing. Common model scopes are set as a default across all linked accounts, but can be updated to have greater granularity per integration or account.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = CommonModelScopesApi()
val integrationSlug : kotlin.String = integrationSlug_example // kotlin.String | Slug of the integration to fetch
val linkedAccountId : kotlin.String = linkedAccountId_example // kotlin.String | ID of specific linked account to fetch
try {
    val result : CommonModelScopes = apiInstance.commonModelScopesRetrieve(integrationSlug, linkedAccountId)
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
 **integrationSlug** | **kotlin.String**| Slug of the integration to fetch | [optional]
 **linkedAccountId** | **kotlin.String**| ID of specific linked account to fetch | [optional]

### Return type

[**CommonModelScopes**](CommonModelScopes.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commonModelScopesUpdate"></a>
# **commonModelScopesUpdate**
> CommonModelScopes commonModelScopesUpdate(commonModelScopesUpdateSerializer, integrationSlug, linkedAccountId)



Update the configuration of what data is saved by Merge when syncing. Common model scopes are set as a default across all linked accounts, but can be updated to have greater granularity per integration or account.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = CommonModelScopesApi()
val commonModelScopesUpdateSerializer : CommonModelScopesUpdateSerializer =  // CommonModelScopesUpdateSerializer | 
val integrationSlug : kotlin.String = integrationSlug_example // kotlin.String | Slug of the integration to fetch
val linkedAccountId : kotlin.String = linkedAccountId_example // kotlin.String | ID of specific linked account to fetch
try {
    val result : CommonModelScopes = apiInstance.commonModelScopesUpdate(commonModelScopesUpdateSerializer, integrationSlug, linkedAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommonModelScopesApi#commonModelScopesUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommonModelScopesApi#commonModelScopesUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commonModelScopesUpdateSerializer** | [**CommonModelScopesUpdateSerializer**](CommonModelScopesUpdateSerializer.md)|  |
 **integrationSlug** | **kotlin.String**| Slug of the integration to fetch | [optional]
 **linkedAccountId** | **kotlin.String**| ID of specific linked account to fetch | [optional]

### Return type

[**CommonModelScopes**](CommonModelScopes.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

