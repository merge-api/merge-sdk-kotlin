# AvailableActionsApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**availableActionsRetrieve**](AvailableActionsApi.md#availableActionsRetrieve) | **GET** /available-actions | 


<a name="availableActionsRetrieve"></a>
# **availableActionsRetrieve**
> AvailableActions availableActionsRetrieve()



Returns a list of models and actions available for an account.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = AvailableActionsApi()
try {
    val result : AvailableActions = apiInstance.availableActionsRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvailableActionsApi#availableActionsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvailableActionsApi#availableActionsRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AvailableActions**](AvailableActions.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

