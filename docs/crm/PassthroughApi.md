# PassthroughApi

All URIs are relative to *https://api.merge.dev/api/crm/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**passthroughCreate**](PassthroughApi.md#passthroughCreate) | **POST** /passthrough | 


<a name="passthroughCreate"></a>
# **passthroughCreate**
> RemoteResponse passthroughCreate(dataPassthroughRequest)



Pull data from an endpoint not currently supported by Merge.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = PassthroughApi()
val dataPassthroughRequest : DataPassthroughRequest =  // DataPassthroughRequest | 
try {
    val result : RemoteResponse = apiInstance.passthroughCreate(dataPassthroughRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PassthroughApi#passthroughCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PassthroughApi#passthroughCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataPassthroughRequest** | [**DataPassthroughRequest**](DataPassthroughRequest.md)|  |

### Return type

[**RemoteResponse**](RemoteResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

