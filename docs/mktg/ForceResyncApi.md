# ForceResyncApi

All URIs are relative to *https://api.merge.dev/api/mktg/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**syncStatusResyncCreate**](ForceResyncApi.md#syncStatusResyncCreate) | **POST** /sync-status/resync | 


<a name="syncStatusResyncCreate"></a>
# **syncStatusResyncCreate**
> kotlin.collections.List&lt;SyncStatus&gt; syncStatusResyncCreate()



Force re-sync of all models. This is available for all organizations via the dashboard. Force re-sync is also available programmatically via API for monthly, quarterly, and highest sync frequency customers on the Core, Professional, or Enterprise plans. Doing so will consume a sync credit for the relevant linked account.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.mktg.models.*

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

