# RegenerateKeyApi

All URIs are relative to *https://api.merge.dev/api/accounting/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**regenerateKeyCreate**](RegenerateKeyApi.md#regenerateKeyCreate) | **POST** /regenerate-key | 


<a name="regenerateKeyCreate"></a>
# **regenerateKeyCreate**
> RemoteKey regenerateKeyCreate(remoteKeyForRegenerationRequest)



Exchange remote keys.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = RegenerateKeyApi()
val remoteKeyForRegenerationRequest : RemoteKeyForRegenerationRequest =  // RemoteKeyForRegenerationRequest | 
try {
    val result : RemoteKey = apiInstance.regenerateKeyCreate(remoteKeyForRegenerationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RegenerateKeyApi#regenerateKeyCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegenerateKeyApi#regenerateKeyCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **remoteKeyForRegenerationRequest** | [**RemoteKeyForRegenerationRequest**](RemoteKeyForRegenerationRequest.md)|  |

### Return type

[**RemoteKey**](RemoteKey.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

