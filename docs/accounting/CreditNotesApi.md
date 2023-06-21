# CreditNotesApi

All URIs are relative to *https://api.merge.dev/api/accounting/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**creditNotesList**](CreditNotesApi.md#creditNotesList) | **GET** /credit-notes | 
[**creditNotesRetrieve**](CreditNotesApi.md#creditNotesRetrieve) | **GET** /credit-notes/{id} | 


<a name="creditNotesList"></a>
# **creditNotesList**
> PaginatedCreditNoteList creditNotesList(companyId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, showEnumOrigins, transactionDateAfter, transactionDateBefore)



Returns a list of &#x60;CreditNote&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = CreditNotesApi()
val companyId : kotlin.String = companyId_example // kotlin.String | If provided, will only return credit notes for this company.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = payments,line_items,tracking_categories // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge after this date time will be returned.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, only objects synced by Merge before this date time will be returned.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteFields : kotlin.String = status,type // kotlin.String | Deprecated. Use show_enum_origins.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val showEnumOrigins : kotlin.String = status,type // kotlin.String | Which fields should be returned in non-normalized form.
val transactionDateAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val transactionDateBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
try {
    val result : PaginatedCreditNoteList = apiInstance.creditNotesList(companyId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId, showEnumOrigins, transactionDateAfter, transactionDateBefore)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreditNotesApi#creditNotesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreditNotesApi#creditNotesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| If provided, will only return credit notes for this company. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: line_items, line_items,tracking_categories, payments, payments,line_items, payments,line_items,tracking_categories, payments,tracking_categories, tracking_categories]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge after this date time will be returned. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, only objects synced by Merge before this date time will be returned. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: status, status,type, type]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: status, status,type, type]
 **transactionDateAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **transactionDateBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]

### Return type

[**PaginatedCreditNoteList**](PaginatedCreditNoteList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="creditNotesRetrieve"></a>
# **creditNotesRetrieve**
> CreditNote creditNotesRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)



Returns a &#x60;CreditNote&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = CreditNotesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = payments,line_items,tracking_categories // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = status,type // kotlin.String | Deprecated. Use show_enum_origins.
val showEnumOrigins : kotlin.String = status,type // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : CreditNote = apiInstance.creditNotesRetrieve(id, expand, includeRemoteData, remoteFields, showEnumOrigins)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreditNotesApi#creditNotesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreditNotesApi#creditNotesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: line_items, line_items,tracking_categories, payments, payments,line_items, payments,line_items,tracking_categories, payments,tracking_categories, tracking_categories]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Deprecated. Use show_enum_origins. | [optional] [enum: status, status,type, type]
 **showEnumOrigins** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: status, status,type, type]

### Return type

[**CreditNote**](CreditNote.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

