# PhoneNumbersApi

All URIs are relative to *https://api.merge.dev/api/accounting/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**phoneNumbersRetrieve**](PhoneNumbersApi.md#phoneNumbersRetrieve) | **GET** /phone-numbers/{id} | 


<a name="phoneNumbersRetrieve"></a>
# **phoneNumbersRetrieve**
> AccountingPhoneNumber phoneNumbersRetrieve(id, includeRemoteData)



Returns an &#x60;AccountingPhoneNumber&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = PhoneNumbersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
try {
    val result : AccountingPhoneNumber = apiInstance.phoneNumbersRetrieve(id, includeRemoteData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneNumbersApi#phoneNumbersRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneNumbersApi#phoneNumbersRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]

### Return type

[**AccountingPhoneNumber**](AccountingPhoneNumber.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

