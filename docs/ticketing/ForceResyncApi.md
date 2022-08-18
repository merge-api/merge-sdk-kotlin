# ForceResyncApi

All URIs are relative to *https://api.merge.dev/api/ticketing/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**syncStatusResyncCreate**](ForceResyncApi.md#syncStatusResyncCreate) | **POST** /sync-status/resync | 


<a name="syncStatusResyncCreate"></a>
# **syncStatusResyncCreate**
> kotlin.collections.List&lt;SyncStatus&gt; syncStatusResyncCreate()



Force re-sync of all models. This is only available for organizations on Merge&#39;s Grow and Expand plans.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ticketing.models.*

val apiInstance = ForceResyncApi()
try {
    val result : kotlin.collections.List<SyncStatus> = apiInstance.syncStatusResyncCreate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ForceResyncApi#syncStatusResyncCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ForceResyncApi#syncStatusResyncCreate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;SyncStatus&gt;**](SyncStatus.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

