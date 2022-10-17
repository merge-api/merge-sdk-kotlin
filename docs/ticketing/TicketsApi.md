# TicketsApi

All URIs are relative to *https://api.merge.dev/api/ticketing/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ticketsCollaboratorsList**](TicketsApi.md#ticketsCollaboratorsList) | **GET** /tickets/{id}/collaborators | 
[**ticketsCreate**](TicketsApi.md#ticketsCreate) | **POST** /tickets | 
[**ticketsList**](TicketsApi.md#ticketsList) | **GET** /tickets | 
[**ticketsMetaPatchRetrieve**](TicketsApi.md#ticketsMetaPatchRetrieve) | **GET** /tickets/meta/patch/{id} | 
[**ticketsMetaPostRetrieve**](TicketsApi.md#ticketsMetaPostRetrieve) | **GET** /tickets/meta/post | 
[**ticketsPartialUpdate**](TicketsApi.md#ticketsPartialUpdate) | **PATCH** /tickets/{id} | 
[**ticketsRetrieve**](TicketsApi.md#ticketsRetrieve) | **GET** /tickets/{id} | 


<a name="ticketsCollaboratorsList"></a>
# **ticketsCollaboratorsList**
> PaginatedUserList ticketsCollaboratorsList(id, cursor, expand, includeRemoteData, pageSize)



Returns a &#x60;User&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ticketing.models.*

val apiInstance = TicketsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = teams // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
try {
    val result : PaginatedUserList = apiInstance.ticketsCollaboratorsList(id, cursor, expand, includeRemoteData, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketsApi#ticketsCollaboratorsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketsApi#ticketsCollaboratorsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: teams]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]

### Return type

[**PaginatedUserList**](PaginatedUserList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ticketsCreate"></a>
# **ticketsCreate**
> TicketResponse ticketsCreate(ticketEndpointRequest, isDebugMode, runAsync)



Creates a &#x60;Ticket&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ticketing.models.*

val apiInstance = TicketsApi()
val ticketEndpointRequest : TicketEndpointRequest =  // TicketEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : TicketResponse = apiInstance.ticketsCreate(ticketEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketsApi#ticketsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketsApi#ticketsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticketEndpointRequest** | [**TicketEndpointRequest**](TicketEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**TicketResponse**](TicketResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="ticketsList"></a>
# **ticketsList**
> PaginatedTicketList ticketsList(accountId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, projectId, remoteFields, remoteId)



Returns a list of &#x60;Ticket&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ticketing.models.*

val apiInstance = TicketsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | If provided, will only return tickets for this account.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val expand : kotlin.String = attachments,assignees,project,account,contact,parent_ticket // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val projectId : kotlin.String = projectId_example // kotlin.String | If provided, will only return tickets for this project.
val remoteFields : kotlin.String = status // kotlin.String | Which fields should be returned in non-normalized form.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedTicketList = apiInstance.ticketsList(accountId, createdAfter, createdBefore, cursor, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, projectId, remoteFields, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketsApi#ticketsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketsApi#ticketsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| If provided, will only return tickets for this account. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: account, account,contact, account,contact,parent_ticket, account,parent_ticket, assignees, assignees,account, assignees,account,contact, assignees,account,contact,parent_ticket, assignees,account,parent_ticket, assignees,contact, assignees,contact,parent_ticket, assignees,parent_ticket, assignees,project, assignees,project,account, assignees,project,account,contact, assignees,project,account,contact,parent_ticket, assignees,project,account,parent_ticket, assignees,project,contact, assignees,project,contact,parent_ticket, assignees,project,parent_ticket, attachments, attachments,account, attachments,account,contact, attachments,account,contact,parent_ticket, attachments,account,parent_ticket, attachments,assignees, attachments,assignees,account, attachments,assignees,account,contact, attachments,assignees,account,contact,parent_ticket, attachments,assignees,account,parent_ticket, attachments,assignees,contact, attachments,assignees,contact,parent_ticket, attachments,assignees,parent_ticket, attachments,assignees,project, attachments,assignees,project,account, attachments,assignees,project,account,contact, attachments,assignees,project,account,contact,parent_ticket, attachments,assignees,project,account,parent_ticket, attachments,assignees,project,contact, attachments,assignees,project,contact,parent_ticket, attachments,assignees,project,parent_ticket, attachments,contact, attachments,contact,parent_ticket, attachments,parent_ticket, attachments,project, attachments,project,account, attachments,project,account,contact, attachments,project,account,contact,parent_ticket, attachments,project,account,parent_ticket, attachments,project,contact, attachments,project,contact,parent_ticket, attachments,project,parent_ticket, contact, contact,parent_ticket, parent_ticket, project, project,account, project,account,contact, project,account,contact,parent_ticket, project,account,parent_ticket, project,contact, project,contact,parent_ticket, project,parent_ticket]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **projectId** | **kotlin.String**| If provided, will only return tickets for this project. | [optional]
 **remoteFields** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: status]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedTicketList**](PaginatedTicketList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ticketsMetaPatchRetrieve"></a>
# **ticketsMetaPatchRetrieve**
> MetaResponse ticketsMetaPatchRetrieve(id)



Returns metadata for &#x60;Ticket&#x60; PATCHs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ticketing.models.*

val apiInstance = TicketsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : MetaResponse = apiInstance.ticketsMetaPatchRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketsApi#ticketsMetaPatchRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketsApi#ticketsMetaPatchRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

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

<a name="ticketsMetaPostRetrieve"></a>
# **ticketsMetaPostRetrieve**
> MetaResponse ticketsMetaPostRetrieve()



Returns metadata for &#x60;Ticket&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ticketing.models.*

val apiInstance = TicketsApi()
try {
    val result : MetaResponse = apiInstance.ticketsMetaPostRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketsApi#ticketsMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketsApi#ticketsMetaPostRetrieve")
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

<a name="ticketsPartialUpdate"></a>
# **ticketsPartialUpdate**
> TicketResponse ticketsPartialUpdate(id, patchedTicketEndpointRequest, isDebugMode, runAsync)



### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ticketing.models.*

val apiInstance = TicketsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patchedTicketEndpointRequest : PatchedTicketEndpointRequest =  // PatchedTicketEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : TicketResponse = apiInstance.ticketsPartialUpdate(id, patchedTicketEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketsApi#ticketsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketsApi#ticketsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **patchedTicketEndpointRequest** | [**PatchedTicketEndpointRequest**](PatchedTicketEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**TicketResponse**](TicketResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="ticketsRetrieve"></a>
# **ticketsRetrieve**
> Ticket ticketsRetrieve(id, expand, includeRemoteData, remoteFields)



Returns a &#x60;Ticket&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ticketing.models.*

val apiInstance = TicketsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = attachments,assignees,project,account,contact,parent_ticket // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val remoteFields : kotlin.String = status // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : Ticket = apiInstance.ticketsRetrieve(id, expand, includeRemoteData, remoteFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketsApi#ticketsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketsApi#ticketsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: account, account,contact, account,contact,parent_ticket, account,parent_ticket, assignees, assignees,account, assignees,account,contact, assignees,account,contact,parent_ticket, assignees,account,parent_ticket, assignees,contact, assignees,contact,parent_ticket, assignees,parent_ticket, assignees,project, assignees,project,account, assignees,project,account,contact, assignees,project,account,contact,parent_ticket, assignees,project,account,parent_ticket, assignees,project,contact, assignees,project,contact,parent_ticket, assignees,project,parent_ticket, attachments, attachments,account, attachments,account,contact, attachments,account,contact,parent_ticket, attachments,account,parent_ticket, attachments,assignees, attachments,assignees,account, attachments,assignees,account,contact, attachments,assignees,account,contact,parent_ticket, attachments,assignees,account,parent_ticket, attachments,assignees,contact, attachments,assignees,contact,parent_ticket, attachments,assignees,parent_ticket, attachments,assignees,project, attachments,assignees,project,account, attachments,assignees,project,account,contact, attachments,assignees,project,account,contact,parent_ticket, attachments,assignees,project,account,parent_ticket, attachments,assignees,project,contact, attachments,assignees,project,contact,parent_ticket, attachments,assignees,project,parent_ticket, attachments,contact, attachments,contact,parent_ticket, attachments,parent_ticket, attachments,project, attachments,project,account, attachments,project,account,contact, attachments,project,account,contact,parent_ticket, attachments,project,account,parent_ticket, attachments,project,contact, attachments,project,contact,parent_ticket, attachments,project,parent_ticket, contact, contact,parent_ticket, parent_ticket, project, project,account, project,account,contact, project,account,contact,parent_ticket, project,account,parent_ticket, project,contact, project,contact,parent_ticket, project,parent_ticket]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: status]

### Return type

[**Ticket**](Ticket.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

