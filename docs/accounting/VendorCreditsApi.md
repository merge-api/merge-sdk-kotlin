# VendorCreditsApi

All URIs are relative to *https://api.merge.dev/api/accounting/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vendorCreditsList**](VendorCreditsApi.md#vendorCreditsList) | **GET** /vendor-credits | 
[**vendorCreditsRetrieve**](VendorCreditsApi.md#vendorCreditsRetrieve) | **GET** /vendor-credits/{id} | 


<a name="vendorCreditsList"></a>
# **vendorCreditsList**
> PaginatedVendorCreditList vendorCreditsList(companyId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId, transactionDateAfter, transactionDateBefore)



Returns a list of &#x60;VendorCredit&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = VendorCreditsApi()
val companyId : kotlin.String = companyId_example // kotlin.String | If provided, will only return vendor credits for this company.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = lines,tracking_categories,vendor,company // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val transactionDateAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val transactionDateBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
try {
    val result : PaginatedVendorCreditList = apiInstance.vendorCreditsList(companyId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId, transactionDateAfter, transactionDateBefore)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VendorCreditsApi#vendorCreditsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VendorCreditsApi#vendorCreditsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| If provided, will only return vendor credits for this company. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: company, lines, lines,company, lines,tracking_categories, lines,tracking_categories,company, lines,tracking_categories,vendor, lines,tracking_categories,vendor,company, lines,vendor, lines,vendor,company, tracking_categories, tracking_categories,company, tracking_categories,vendor, tracking_categories,vendor,company, vendor, vendor,company]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **transactionDateAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **transactionDateBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]

### Return type

[**PaginatedVendorCreditList**](PaginatedVendorCreditList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="vendorCreditsRetrieve"></a>
# **vendorCreditsRetrieve**
> VendorCredit vendorCreditsRetrieve(id, expand, includeRemoteData)



Returns a &#x60;VendorCredit&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = VendorCreditsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = lines,tracking_categories,vendor,company // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
try {
    val result : VendorCredit = apiInstance.vendorCreditsRetrieve(id, expand, includeRemoteData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VendorCreditsApi#vendorCreditsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VendorCreditsApi#vendorCreditsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: company, lines, lines,company, lines,tracking_categories, lines,tracking_categories,company, lines,tracking_categories,vendor, lines,tracking_categories,vendor,company, lines,vendor, lines,vendor,company, tracking_categories, tracking_categories,company, tracking_categories,vendor, tracking_categories,vendor,company, vendor, vendor,company]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]

### Return type

[**VendorCredit**](VendorCredit.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

