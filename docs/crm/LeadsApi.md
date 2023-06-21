# LeadsApi

All URIs are relative to *https://api.merge.dev/api/crm/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadsCreate**](LeadsApi.md#leadsCreate) | **POST** /leads | 
[**leadsList**](LeadsApi.md#leadsList) | **GET** /leads | 
[**leadsMetaPostRetrieve**](LeadsApi.md#leadsMetaPostRetrieve) | **GET** /leads/meta/post | 
[**leadsRemoteFieldClassesList**](LeadsApi.md#leadsRemoteFieldClassesList) | **GET** /leads/remote-field-classes | 
[**leadsRetrieve**](LeadsApi.md#leadsRetrieve) | **GET** /leads/{id} | 


<a name="leadsCreate"></a>
# **leadsCreate**
> LeadResponse leadsCreate(leadEndpointRequest, isDebugMode, runAsync)



Creates a &#x60;Lead&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = LeadsApi()
val leadEndpointRequest : LeadEndpointRequest =  // LeadEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : LeadResponse = apiInstance.leadsCreate(leadEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeadsApi#leadsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeadsApi#leadsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leadEndpointRequest** | [**LeadEndpointRequest**](LeadEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**LeadResponse**](LeadResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="leadsList"></a>
# **leadsList**
> PaginatedLeadList leadsList(convertedAccountId, convertedContactId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, includeRemoteFields, modifiedAfter, modifiedBefore, ownerId, pageSize, remoteId)



Returns a list of &#x60;Lead&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = LeadsApi()
val convertedAccountId : kotlin.String = convertedAccountId_example // kotlin.String | If provided, will only return leads with this account.
val convertedContactId : kotlin.String = convertedContactId_example // kotlin.String | If provided, will only return leads with this contact.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = owner,converted_contact,converted_account // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val includeRemoteFields : kotlin.Boolean = true // kotlin.Boolean | Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val ownerId : kotlin.String = ownerId_example // kotlin.String | If provided, will only return leads with this owner.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedLeadList = apiInstance.leadsList(convertedAccountId, convertedContactId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, includeRemoteFields, modifiedAfter, modifiedBefore, ownerId, pageSize, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeadsApi#leadsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeadsApi#leadsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **convertedAccountId** | **kotlin.String**| If provided, will only return leads with this account. | [optional]
 **convertedContactId** | **kotlin.String**| If provided, will only return leads with this contact. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: converted_account, converted_contact, converted_contact,converted_account, owner, owner,converted_account, owner,converted_contact, owner,converted_contact,converted_account]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeRemoteFields** | **kotlin.Boolean**| Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **ownerId** | **kotlin.String**| If provided, will only return leads with this owner. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedLeadList**](PaginatedLeadList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leadsMetaPostRetrieve"></a>
# **leadsMetaPostRetrieve**
> MetaResponse leadsMetaPostRetrieve()



Returns metadata for &#x60;Lead&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = LeadsApi()
try {
    val result : MetaResponse = apiInstance.leadsMetaPostRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeadsApi#leadsMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeadsApi#leadsMetaPostRetrieve")
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

<a name="leadsRemoteFieldClassesList"></a>
# **leadsRemoteFieldClassesList**
> PaginatedRemoteFieldClassList leadsRemoteFieldClassesList(cursor, includeDeletedData, includeRemoteData, includeRemoteFields, pageSize)



Returns a list of &#x60;RemoteFieldClass&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = LeadsApi()
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val includeRemoteFields : kotlin.Boolean = true // kotlin.Boolean | Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
try {
    val result : PaginatedRemoteFieldClassList = apiInstance.leadsRemoteFieldClassesList(cursor, includeDeletedData, includeRemoteData, includeRemoteFields, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeadsApi#leadsRemoteFieldClassesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeadsApi#leadsRemoteFieldClassesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeRemoteFields** | **kotlin.Boolean**| Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]

### Return type

[**PaginatedRemoteFieldClassList**](PaginatedRemoteFieldClassList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leadsRetrieve"></a>
# **leadsRetrieve**
> Lead leadsRetrieve(id, expand, includeRemoteData, includeRemoteFields)



Returns a &#x60;Lead&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.crm.models.*

val apiInstance = LeadsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = owner,converted_contact,converted_account // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val includeRemoteFields : kotlin.Boolean = true // kotlin.Boolean | Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format.
try {
    val result : Lead = apiInstance.leadsRetrieve(id, expand, includeRemoteData, includeRemoteFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeadsApi#leadsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeadsApi#leadsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: converted_account, converted_contact, converted_contact,converted_account, owner, owner,converted_account, owner,converted_contact, owner,converted_contact,converted_account]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeRemoteFields** | **kotlin.Boolean**| Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format. | [optional]

### Return type

[**Lead**](Lead.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

