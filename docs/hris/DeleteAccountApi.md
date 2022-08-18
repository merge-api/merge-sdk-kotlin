# DeleteAccountApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAccountCreate**](DeleteAccountApi.md#deleteAccountCreate) | **POST** /delete-account | 


<a name="deleteAccountCreate"></a>
# **deleteAccountCreate**
> deleteAccountCreate()



Delete a linked account.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = DeleteAccountApi()
try {
    apiInstance.deleteAccountCreate()
} catch (e: ClientException) {
    println("4xx response calling DeleteAccountApi#deleteAccountCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeleteAccountApi#deleteAccountCreate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

