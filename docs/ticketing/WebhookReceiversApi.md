# WebhookReceiversApi

All URIs are relative to *https://api.merge.dev/api/ticketing/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhookReceiversCreate**](WebhookReceiversApi.md#webhookReceiversCreate) | **POST** /webhook-receivers | 
[**webhookReceiversList**](WebhookReceiversApi.md#webhookReceiversList) | **GET** /webhook-receivers | 


<a name="webhookReceiversCreate"></a>
# **webhookReceiversCreate**
> WebhookReceiver webhookReceiversCreate(webhookReceiverRequest)



Creates a &#x60;WebhookReceiver&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ticketing.models.*

val apiInstance = WebhookReceiversApi()
val webhookReceiverRequest : WebhookReceiverRequest =  // WebhookReceiverRequest | 
try {
    val result : WebhookReceiver = apiInstance.webhookReceiversCreate(webhookReceiverRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookReceiversApi#webhookReceiversCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookReceiversApi#webhookReceiversCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookReceiverRequest** | [**WebhookReceiverRequest**](WebhookReceiverRequest.md)|  |

### Return type

[**WebhookReceiver**](WebhookReceiver.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="webhookReceiversList"></a>
# **webhookReceiversList**
> kotlin.collections.List&lt;WebhookReceiver&gt; webhookReceiversList()



Returns a list of &#x60;WebhookReceiver&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ticketing.models.*

val apiInstance = WebhookReceiversApi()
try {
    val result : kotlin.collections.List<WebhookReceiver> = apiInstance.webhookReceiversList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookReceiversApi#webhookReceiversList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookReceiversApi#webhookReceiversList")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;WebhookReceiver&gt;**](WebhookReceiver.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

