# BankInfoApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bankInfoList**](BankInfoApi.md#bankInfoList) | **GET** /bank-info | 
[**bankInfoRetrieve**](BankInfoApi.md#bankInfoRetrieve) | **GET** /bank-info/{id} | 


<a name="bankInfoList"></a>
# **bankInfoList**
> PaginatedBankInfoList bankInfoList(accountType, bankName, createdAfter, createdBefore, cursor, employeeId, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, orderBy, pageSize, remoteFields, remoteId)



Returns a list of &#x60;BankInfo&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = BankInfoApi()
val accountType : kotlin.String = accountType_example // kotlin.String | If provided, will only return BankInfo's with this account type. Options: ('SAVINGS', 'CHECKING')
val bankName : kotlin.String = bankName_example // kotlin.String | If provided, will only return BankInfo's with this bank name.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val employeeId : kotlin.String = employeeId_example // kotlin.String | If provided, will only return bank accounts for this employee.
val expand : kotlin.String = employee // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val orderBy : kotlin.String = orderBy_example // kotlin.String | Overrides the default ordering for this endpoint.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteFields : kotlin.String = account_type // kotlin.String | Which fields should be returned in non-normalized form.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedBankInfoList = apiInstance.bankInfoList(accountType, bankName, createdAfter, createdBefore, cursor, employeeId, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, orderBy, pageSize, remoteFields, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankInfoApi#bankInfoList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankInfoApi#bankInfoList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountType** | **kotlin.String**| If provided, will only return BankInfo&#39;s with this account type. Options: (&#39;SAVINGS&#39;, &#39;CHECKING&#39;) | [optional] [enum: CHECKING, SAVINGS]
 **bankName** | **kotlin.String**| If provided, will only return BankInfo&#39;s with this bank name. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **employeeId** | **kotlin.String**| If provided, will only return bank accounts for this employee. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: employee]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **orderBy** | **kotlin.String**| Overrides the default ordering for this endpoint. | [optional] [enum: -remote_created_at, remote_created_at]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteFields** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: account_type]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedBankInfoList**](PaginatedBankInfoList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bankInfoRetrieve"></a>
# **bankInfoRetrieve**
> BankInfo bankInfoRetrieve(id, expand, includeRemoteData, remoteFields)



Returns a &#x60;BankInfo&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = BankInfoApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = employee // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = account_type // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : BankInfo = apiInstance.bankInfoRetrieve(id, expand, includeRemoteData, remoteFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankInfoApi#bankInfoRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankInfoApi#bankInfoRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: employee]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: account_type]

### Return type

[**BankInfo**](BankInfo.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

