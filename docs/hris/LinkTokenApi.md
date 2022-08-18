# LinkTokenApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**linkTokenCreate**](LinkTokenApi.md#linkTokenCreate) | **POST** /link-token | 


<a name="linkTokenCreate"></a>
# **linkTokenCreate**
> LinkToken linkTokenCreate(endUserDetailsRequest)



Creates a link token to be used when linking a new end user.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = LinkTokenApi()
val endUserDetailsRequest : EndUserDetailsRequest =  // EndUserDetailsRequest | 
try {
    val result : LinkToken = apiInstance.linkTokenCreate(endUserDetailsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinkTokenApi#linkTokenCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinkTokenApi#linkTokenCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endUserDetailsRequest** | [**EndUserDetailsRequest**](EndUserDetailsRequest.md)|  |

### Return type

[**LinkToken**](LinkToken.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

