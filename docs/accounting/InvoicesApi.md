# InvoicesApi

All URIs are relative to *https://api.merge.dev/api/accounting/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoicesCreate**](InvoicesApi.md#invoicesCreate) | **POST** /invoices | 
[**invoicesList**](InvoicesApi.md#invoicesList) | **GET** /invoices | 
[**invoicesMetaPostRetrieve**](InvoicesApi.md#invoicesMetaPostRetrieve) | **GET** /invoices/meta/post | 
[**invoicesRetrieve**](InvoicesApi.md#invoicesRetrieve) | **GET** /invoices/{id} | 


<a name="invoicesCreate"></a>
# **invoicesCreate**
> InvoiceResponse invoicesCreate(invoiceEndpointRequest, isDebugMode, runAsync)



Creates an &#x60;Invoice&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = InvoicesApi()
val invoiceEndpointRequest : InvoiceEndpointRequest =  // InvoiceEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : InvoiceResponse = apiInstance.invoicesCreate(invoiceEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#invoicesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#invoicesCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceEndpointRequest** | [**InvoiceEndpointRequest**](InvoiceEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="invoicesList"></a>
# **invoicesList**
> PaginatedInvoiceList invoicesList(companyId, contactId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, type)



Returns a list of &#x60;Invoice&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = InvoicesApi()
val companyId : kotlin.String = companyId_example // kotlin.String | If provided, will only return invoices for this company.
val contactId : kotlin.String = contactId_example // kotlin.String | If provided, will only return invoices for this contact.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = payments,line_items,contact,company // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteFields : kotlin.String = type // kotlin.String | Which fields should be returned in non-normalized form.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val type : kotlin.String = type_example // kotlin.String | If provided, will only return Invoices with this type
try {
    val result : PaginatedInvoiceList = apiInstance.invoicesList(companyId, contactId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#invoicesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#invoicesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| If provided, will only return invoices for this company. | [optional]
 **contactId** | **kotlin.String**| If provided, will only return invoices for this contact. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: company, contact, contact,company, line_items, line_items,company, line_items,contact, line_items,contact,company, payments, payments,company, payments,contact, payments,contact,company, payments,line_items, payments,line_items,company, payments,line_items,contact, payments,line_items,contact,company]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteFields** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: type]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **type** | **kotlin.String**| If provided, will only return Invoices with this type | [optional] [enum: ACCOUNTS_PAYABLE, ACCOUNTS_RECEIVABLE]

### Return type

[**PaginatedInvoiceList**](PaginatedInvoiceList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="invoicesMetaPostRetrieve"></a>
# **invoicesMetaPostRetrieve**
> MetaResponse invoicesMetaPostRetrieve()



Returns metadata for &#x60;Invoice&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = InvoicesApi()
try {
    val result : MetaResponse = apiInstance.invoicesMetaPostRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#invoicesMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#invoicesMetaPostRetrieve")
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

<a name="invoicesRetrieve"></a>
# **invoicesRetrieve**
> Invoice invoicesRetrieve(id, expand, includeRemoteData, remoteFields)



Returns an &#x60;Invoice&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = InvoicesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = payments,line_items,contact,company // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = type // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : Invoice = apiInstance.invoicesRetrieve(id, expand, includeRemoteData, remoteFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#invoicesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#invoicesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: company, contact, contact,company, line_items, line_items,company, line_items,contact, line_items,contact,company, payments, payments,company, payments,contact, payments,contact,company, payments,line_items, payments,line_items,company, payments,line_items,contact, payments,line_items,contact,company]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: type]

### Return type

[**Invoice**](Invoice.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

