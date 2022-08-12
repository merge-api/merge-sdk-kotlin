# GenerateKeyApi

All URIs are relative to *https://api.merge.dev/api/crm/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateKeyCreate**](GenerateKeyApi.md#generateKeyCreate) | **POST** /generate-key | 


<a name="generateKeyCreate"></a>
# **generateKeyCreate**
> RemoteKey generateKeyCreate(generateRemoteKeyRequest)



Create a remote key.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = GenerateKeyApi()
val generateRemoteKeyRequest : GenerateRemoteKeyRequest =  // GenerateRemoteKeyRequest | 
try {
    val result : RemoteKey = apiInstance.generateKeyCreate(generateRemoteKeyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GenerateKeyApi#generateKeyCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GenerateKeyApi#generateKeyCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateRemoteKeyRequest** | [**GenerateRemoteKeyRequest**](GenerateRemoteKeyRequest.md)|  |

### Return type

[**RemoteKey**](RemoteKey.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

