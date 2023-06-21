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
> PaginatedPurchaseOrderList purchaseOrdersList(companyId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, issueDateAfter, issueDateBefore, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, showEnumOrigins)



Returns a list of &#x60;PurchaseOrder&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = PurchaseOrdersApi()
val companyId : kotlin.String = companyId_example // kotlin.String | If provided, will only return purchase orders for this company.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = line_items,tracking_categories,delivery_address,vendor,company // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val issueDateAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val issueDateBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteFields : kotlin.String = status // kotlin.String | Deprecated. Use show_enum_origins.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val showEnumOrigins : kotlin.String = status // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : PaginatedPurchaseOrderList = apiInstance.purchaseOrdersList(companyId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, issueDateAfter, issueDateBefore, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, showEnumOrigins)
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
 **companyId** | **kotlin.String**| If provided, will only return purchase orders for this company. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: company, delivery_address, delivery_address,company, delivery_address,vendor, delivery_address,vendor,company, line_items, line_items,company, line_items,delivery_address, line_items,delivery_address,company, line_items,delivery_address,vendor, line_items,delivery_address,vendor,company, line_items,tracking_categories, line_items,tracking_categories,company, line_items,tracking_categories,delivery_address, line_items,tracking_categories,delivery_address,company, line_items,tracking_categories,delivery_address,vendor, line_items,tracking_categories,delivery_address,vendor,company, line_items,tracking_categories,vendor, line_items,tracking_categories,vendor,company, line_items,vendor, line_items,vendor,company, tracking_categories, tracking_categories,company, tracking_categories,delivery_address, tracking_categories,delivery_address,company, tracking_categories,delivery_address,vendor, tracking_categories,delivery_address,vendor,company, tracking_categories,vendor, tracking_categories,vendor,company, vendor, vendor,company]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **issueDateAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **issueDateBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: status]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: status]

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
> PurchaseOrder purchaseOrdersRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)



Returns a &#x60;PurchaseOrder&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = PurchaseOrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = line_items,tracking_categories,delivery_address,vendor,company // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = status // kotlin.String | Deprecated. Use show_enum_origins.
val showEnumOrigins : kotlin.String = status // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : PurchaseOrder = apiInstance.purchaseOrdersRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)
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
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: company, delivery_address, delivery_address,company, delivery_address,vendor, delivery_address,vendor,company, line_items, line_items,company, line_items,delivery_address, line_items,delivery_address,company, line_items,delivery_address,vendor, line_items,delivery_address,vendor,company, line_items,tracking_categories, line_items,tracking_categories,company, line_items,tracking_categories,delivery_address, line_items,tracking_categories,delivery_address,company, line_items,tracking_categories,delivery_address,vendor, line_items,tracking_categories,delivery_address,vendor,company, line_items,tracking_categories,vendor, line_items,tracking_categories,vendor,company, line_items,vendor, line_items,vendor,company, tracking_categories, tracking_categories,company, tracking_categories,delivery_address, tracking_categories,delivery_address,company, tracking_categories,delivery_address,vendor, tracking_categories,delivery_address,vendor,company, tracking_categories,vendor, tracking_categories,vendor,company, vendor, vendor,company]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: status]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: status]

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

