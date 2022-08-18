# AccountTokenApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountTokenRetrieve**](AccountTokenApi.md#accountTokenRetrieve) | **GET** /account-token/{public_token} | 


<a name="accountTokenRetrieve"></a>
# **accountTokenRetrieve**
> AccountToken accountTokenRetrieve(publicToken)



Returns the account token for the end user with the provided public token.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = AccountTokenApi()
val publicToken : kotlin.String = publicToken_example // kotlin.String | 
try {
    val result : AccountToken = apiInstance.accountTokenRetrieve(publicToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountTokenApi#accountTokenRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountTokenApi#accountTokenRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **publicToken** | **kotlin.String**|  |

### Return type

[**AccountToken**](AccountToken.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

