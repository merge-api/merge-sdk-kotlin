# PaymentsApi

All URIs are relative to *https://api.merge.dev/api/accounting/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentsCreate**](PaymentsApi.md#paymentsCreate) | **POST** /payments | 
[**paymentsList**](PaymentsApi.md#paymentsList) | **GET** /payments | 
[**paymentsMetaPostRetrieve**](PaymentsApi.md#paymentsMetaPostRetrieve) | **GET** /payments/meta/post | 
[**paymentsRetrieve**](PaymentsApi.md#paymentsRetrieve) | **GET** /payments/{id} | 


<a name="paymentsCreate"></a>
# **paymentsCreate**
> PaymentResponse paymentsCreate(paymentEndpointRequest, isDebugMode, runAsync)



Creates a &#x60;Payment&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = PaymentsApi()
val paymentEndpointRequest : PaymentEndpointRequest =  // PaymentEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : PaymentResponse = apiInstance.paymentsCreate(paymentEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#paymentsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#paymentsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentEndpointRequest** | [**PaymentEndpointRequest**](PaymentEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**PaymentResponse**](PaymentResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="paymentsList"></a>
# **paymentsList**
> PaginatedPaymentList paymentsList(accountId, contactId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId)



Returns a list of &#x60;Payment&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = PaymentsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | If provided, will only return payments for this account.
val contactId : kotlin.String = contactId_example // kotlin.String | If provided, will only return payments for this contact.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = contact,account // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedPaymentList = apiInstance.paymentsList(accountId, contactId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#paymentsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#paymentsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| If provided, will only return payments for this account. | [optional]
 **contactId** | **kotlin.String**| If provided, will only return payments for this contact. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: account, contact, contact,account]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedPaymentList**](PaginatedPaymentList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentsMetaPostRetrieve"></a>
# **paymentsMetaPostRetrieve**
> MetaResponse paymentsMetaPostRetrieve()



Returns metadata for &#x60;Payment&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = PaymentsApi()
try {
    val result : MetaResponse = apiInstance.paymentsMetaPostRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#paymentsMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#paymentsMetaPostRetrieve")
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

<a name="paymentsRetrieve"></a>
# **paymentsRetrieve**
> Payment paymentsRetrieve(id, expand, includeRemoteData)



Returns a &#x60;Payment&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = PaymentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = contact,account // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
try {
    val result : Payment = apiInstance.paymentsRetrieve(id, expand, includeRemoteData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#paymentsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#paymentsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: account, contact, contact,account]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]

### Return type

[**Payment**](Payment.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

