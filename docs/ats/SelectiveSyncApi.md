# SelectiveSyncApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**selectiveSyncConfigurationsList**](SelectiveSyncApi.md#selectiveSyncConfigurationsList) | **GET** /selective-sync/configurations | 
[**selectiveSyncConfigurationsUpdate**](SelectiveSyncApi.md#selectiveSyncConfigurationsUpdate) | **PUT** /selective-sync/configurations | 
[**selectiveSyncMetaList**](SelectiveSyncApi.md#selectiveSyncMetaList) | **GET** /selective-sync/meta | 


<a name="selectiveSyncConfigurationsList"></a>
# **selectiveSyncConfigurationsList**
> kotlin.collections.List&lt;LinkedAccountSelectiveSyncConfiguration&gt; selectiveSyncConfigurationsList()



Get a linked account&#39;s selective syncs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = SelectiveSyncApi()
try {
    val result : kotlin.collections.List<LinkedAccountSelectiveSyncConfiguration> = apiInstance.selectiveSyncConfigurationsList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SelectiveSyncApi#selectiveSyncConfigurationsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SelectiveSyncApi#selectiveSyncConfigurationsList")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;LinkedAccountSelectiveSyncConfiguration&gt;**](LinkedAccountSelectiveSyncConfiguration.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="selectiveSyncConfigurationsUpdate"></a>
# **selectiveSyncConfigurationsUpdate**
> kotlin.collections.List&lt;LinkedAccountSelectiveSyncConfiguration&gt; selectiveSyncConfigurationsUpdate(linkedAccountSelectiveSyncConfigurationListRequest)



Replace a linked account&#39;s selective syncs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = SelectiveSyncApi()
val linkedAccountSelectiveSyncConfigurationListRequest : LinkedAccountSelectiveSyncConfigurationListRequest = {"linked_account_conditons":[{"condition_schema_id":"123e4567-e89b-12d3-a456-426655440000","operator":"GREATER_THAN_OR_EQUAL","value":"2022-01-01T00:00:00Z"}]} // LinkedAccountSelectiveSyncConfigurationListRequest | 
try {
    val result : kotlin.collections.List<LinkedAccountSelectiveSyncConfiguration> = apiInstance.selectiveSyncConfigurationsUpdate(linkedAccountSelectiveSyncConfigurationListRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SelectiveSyncApi#selectiveSyncConfigurationsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SelectiveSyncApi#selectiveSyncConfigurationsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkedAccountSelectiveSyncConfigurationListRequest** | [**LinkedAccountSelectiveSyncConfigurationListRequest**](LinkedAccountSelectiveSyncConfigurationListRequest.md)|  |

### Return type

[**kotlin.collections.List&lt;LinkedAccountSelectiveSyncConfiguration&gt;**](LinkedAccountSelectiveSyncConfiguration.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selectiveSyncMetaList"></a>
# **selectiveSyncMetaList**
> PaginatedConditionSchemaList selectiveSyncMetaList(commonModel, cursor, pageSize)



Get metadata for the conditions available to a linked account.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ats.models.*

val apiInstance = SelectiveSyncApi()
val commonModel : kotlin.String = commonModel_example // kotlin.String | 
val cursor : kotlin.Int = 56 // kotlin.Int | The pagination cursor value.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
try {
    val result : PaginatedConditionSchemaList = apiInstance.selectiveSyncMetaList(commonModel, cursor, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SelectiveSyncApi#selectiveSyncMetaList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SelectiveSyncApi#selectiveSyncMetaList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commonModel** | **kotlin.String**|  | [optional]
 **cursor** | **kotlin.Int**| The pagination cursor value. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]

### Return type

[**PaginatedConditionSchemaList**](PaginatedConditionSchemaList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

