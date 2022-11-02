# PurchaseOrdersApi

All URIs are relative to *https://api.merge.dev/api/accounting/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**purchaseOrdersCreate**](PurchaseOrdersApi.md#purchaseOrdersCreate) | **POST** /purchase-orders | 
[**purchaseOrdersList**](PurchaseOrdersApi.md#purchaseOrdersList) | **GET** /purchase-orders | 
[**purchaseOrdersMetaPostRetrieve**](PurchaseOrdersApi.md#purchaseOrdersMetaPostRetrieve) | **GET** /purchase-orders/meta/post | 
[**purchaseOrdersRetrieve**](PurchaseOrdersApi.md#purchaseOrdersRetrieve) | **GET** /purchase-orders/{id} | 


<a name="purchaseOrdersCreate"></a>
# **purchaseOrdersCreate**
> PurchaseOrderResponse purchaseOrdersCreate(purchaseOrderEndpointRequest, isDebugMode, runAsync)



Creates a &#x60;PurchaseOrder&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = PurchaseOrdersApi()
val purchaseOrderEndpointRequest : PurchaseOrderEndpointRequest =  // PurchaseOrderEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : PurchaseOrderResponse = apiInstance.purchaseOrdersCreate(purchaseOrderEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PurchaseOrdersApi#purchaseOrdersCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PurchaseOrdersApi#purchaseOrdersCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseOrderEndpointRequest** | [**PurchaseOrderEndpointRequest**](PurchaseOrderEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**PurchaseOrderResponse**](PurchaseOrderResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="purchaseOrdersList"></a>
# **purchaseOrdersList**
> PaginatedPurchaseOrderList purchaseOrdersList(createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId)



Returns a list of &#x60;PurchaseOrder&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = PurchaseOrdersApi()
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = line_items,delivery_address // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteFields : kotlin.String = status // kotlin.String | Which fields should be returned in non-normalized form.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedPurchaseOrderList = apiInstance.purchaseOrdersList(createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PurchaseOrdersApi#purchaseOrdersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PurchaseOrdersApi#purchaseOrdersList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: delivery_address, line_items, line_items,delivery_address]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteFields** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: status]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedPurchaseOrderList**](PaginatedPurchaseOrderList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="purchaseOrdersMetaPostRetrieve"></a>
# **purchaseOrdersMetaPostRetrieve**
> MetaResponse purchaseOrdersMetaPostRetrieve()



Returns metadata for &#x60;PurchaseOrder&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = PurchaseOrdersApi()
try {
    val result : MetaResponse = apiInstance.purchaseOrdersMetaPostRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PurchaseOrdersApi#purchaseOrdersMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PurchaseOrdersApi#purchaseOrdersMetaPostRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MetaResponse**](MetaResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="purchaseOrdersRetrieve"></a>
# **purchaseOrdersRetrieve**
> PurchaseOrder purchaseOrdersRetrieve(id, expand, includeRemoteData, remoteFields)



Returns a &#x60;PurchaseOrder&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = PurchaseOrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = line_items,delivery_address // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = status // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : PurchaseOrder = apiInstance.purchaseOrdersRetrieve(id, expand, includeRemoteData, remoteFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PurchaseOrdersApi#purchaseOrdersRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PurchaseOrdersApi#purchaseOrdersRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: delivery_address, line_items, line_items,delivery_address]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: status]

### Return type

[**PurchaseOrder**](PurchaseOrder.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

