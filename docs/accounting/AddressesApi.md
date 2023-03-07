# AddressesApi

All URIs are relative to *https://api.merge.dev/api/accounting/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addressesRetrieve**](AddressesApi.md#addressesRetrieve) | **GET** /addresses/{id} | 


<a name="addressesRetrieve"></a>
# **addressesRetrieve**
> Address addressesRetrieve(id, includeRemoteData, remoteFields, showEnumOrigins)



Returns an &#x60;Address&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = AddressesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = type // kotlin.String | Deprecated. Use show_enum_origins.
val showEnumOrigins : kotlin.String = type // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : Address = apiInstance.addressesRetrieve(id, includeRemoteData, remoteFields, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AddressesApi#addressesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AddressesApi#addressesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: type]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: type]

### Return type

[**Address**](Address.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

