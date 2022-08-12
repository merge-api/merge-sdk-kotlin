# AccountDetailsApi

All URIs are relative to *https://api.merge.dev/api/ticketing/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountDetailsRetrieve**](AccountDetailsApi.md#accountDetailsRetrieve) | **GET** /account-details | 


<a name="accountDetailsRetrieve"></a>
# **accountDetailsRetrieve**
> AccountDetails accountDetailsRetrieve()



Get details for a linked account.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ticketing.models.*

val apiInstance = AccountDetailsApi()
try {
    val result : AccountDetails = apiInstance.accountDetailsRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountDetailsApi#accountDetailsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountDetailsApi#accountDetailsRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountDetails**](AccountDetails.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

