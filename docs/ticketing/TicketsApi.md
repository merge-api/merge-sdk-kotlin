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
> PaginatedTicketList ticketsList(accountId, assigneeIds, completedAfter, completedBefore, contactId, createdAfter, createdBefore, cursor, dueAfter, dueBefore, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, parentTicketId, priority, projectId, remoteFields, remoteId, status, tags, ticketType)



Returns a list of &#x60;Ticket&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.ticketing.models.*

val apiInstance = TicketsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | If provided, will only return tickets for this account.
val assigneeIds : kotlin.String = assigneeIds_example // kotlin.String | If provided, will only return tickets assigned to the assignee_ids; multiple assignee_ids can be separated by commas.
val completedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return tickets completed after this datetime.
val completedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return tickets completed before this datetime.
val contactId : kotlin.String = contactId_example // kotlin.String | If provided, will only return tickets for this contact.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val dueAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return tickets due after this datetime.
val dueBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return tickets due before this datetime.
val expand : kotlin.String = attachments,assignees,project,account,contact,creator,parent_ticket // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val parentTicketId : kotlin.String = parentTicketId_example // kotlin.String | If provided, will only return sub tickets of the parent_ticket_id.
val priority : kotlin.String = priority_example // kotlin.String | If provided, will only return tickets of this priority.
val projectId : kotlin.String = projectId_example // kotlin.String | If provided, will only return tickets for this project.
val remoteFields : kotlin.String = status // kotlin.String | Which fields should be returned in non-normalized form.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val status : kotlin.String = status_example // kotlin.String | If provided, will only return tickets of this status.
val tags : kotlin.String = tags_example // kotlin.String | If provided, will only return tickets matching the tags; multiple tags can be separated by commas.
val ticketType : kotlin.String = ticketType_example // kotlin.String | If provided, will only return tickets of this type.
try {
    val result : PaginatedTicketList = apiInstance.ticketsList(accountId, assigneeIds, completedAfter, completedBefore, contactId, createdAfter, createdBefore, cursor, dueAfter, dueBefore, expand, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, parentTicketId, priority, projectId, remoteFields, remoteId, status, tags, ticketType)
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
 **assigneeIds** | **kotlin.String**| If provided, will only return tickets assigned to the assignee_ids; multiple assignee_ids can be separated by commas. | [optional]
 **completedAfter** | **java.time.OffsetDateTime**| If provided, will only return tickets completed after this datetime. | [optional]
 **completedBefore** | **java.time.OffsetDateTime**| If provided, will only return tickets completed before this datetime. | [optional]
 **contactId** | **kotlin.String**| If provided, will only return tickets for this contact. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **dueAfter** | **java.time.OffsetDateTime**| If provided, will only return tickets due after this datetime. | [optional]
 **dueBefore** | **java.time.OffsetDateTime**| If provided, will only return tickets due before this datetime. | [optional]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: account, account,contact, account,contact,creator, account,contact,creator,parent_ticket, account,contact,parent_ticket, account,creator, account,creator,parent_ticket, account,parent_ticket, assignees, assignees,account, assignees,account,contact, assignees,account,contact,creator, assignees,account,contact,creator,parent_ticket, assignees,account,contact,parent_ticket, assignees,account,creator, assignees,account,creator,parent_ticket, assignees,account,parent_ticket, assignees,contact, assignees,contact,creator, assignees,contact,creator,parent_ticket, assignees,contact,parent_ticket, assignees,creator, assignees,creator,parent_ticket, assignees,parent_ticket, assignees,project, assignees,project,account, assignees,project,account,contact, assignees,project,account,contact,creator, assignees,project,account,contact,creator,parent_ticket, assignees,project,account,contact,parent_ticket, assignees,project,account,creator, assignees,project,account,creator,parent_ticket, assignees,project,account,parent_ticket, assignees,project,contact, assignees,project,contact,creator, assignees,project,contact,creator,parent_ticket, assignees,project,contact,parent_ticket, assignees,project,creator, assignees,project,creator,parent_ticket, assignees,project,parent_ticket, attachments, attachments,account, attachments,account,contact, attachments,account,contact,creator, attachments,account,contact,creator,parent_ticket, attachments,account,contact,parent_ticket, attachments,account,creator, attachments,account,creator,parent_ticket, attachments,account,parent_ticket, attachments,assignees, attachments,assignees,account, attachments,assignees,account,contact, attachments,assignees,account,contact,creator, attachments,assignees,account,contact,creator,parent_ticket, attachments,assignees,account,contact,parent_ticket, attachments,assignees,account,creator, attachments,assignees,account,creator,parent_ticket, attachments,assignees,account,parent_ticket, attachments,assignees,contact, attachments,assignees,contact,creator, attachments,assignees,contact,creator,parent_ticket, attachments,assignees,contact,parent_ticket, attachments,assignees,creator, attachments,assignees,creator,parent_ticket, attachments,assignees,parent_ticket, attachments,assignees,project, attachments,assignees,project,account, attachments,assignees,project,account,contact, attachments,assignees,project,account,contact,creator, attachments,assignees,project,account,contact,creator,parent_ticket, attachments,assignees,project,account,contact,parent_ticket, attachments,assignees,project,account,creator, attachments,assignees,project,account,creator,parent_ticket, attachments,assignees,project,account,parent_ticket, attachments,assignees,project,contact, attachments,assignees,project,contact,creator, attachments,assignees,project,contact,creator,parent_ticket, attachments,assignees,project,contact,parent_ticket, attachments,assignees,project,creator, attachments,assignees,project,creator,parent_ticket, attachments,assignees,project,parent_ticket, attachments,contact, attachments,contact,creator, attachments,contact,creator,parent_ticket, attachments,contact,parent_ticket, attachments,creator, attachments,creator,parent_ticket, attachments,parent_ticket, attachments,project, attachments,project,account, attachments,project,account,contact, attachments,project,account,contact,creator, attachments,project,account,contact,creator,parent_ticket, attachments,project,account,contact,parent_ticket, attachments,project,account,creator, attachments,project,account,creator,parent_ticket, attachments,project,account,parent_ticket, attachments,project,contact, attachments,project,contact,creator, attachments,project,contact,creator,parent_ticket, attachments,project,contact,parent_ticket, attachments,project,creator, attachments,project,creator,parent_ticket, attachments,project,parent_ticket, contact, contact,creator, contact,creator,parent_ticket, contact,parent_ticket, creator, creator,parent_ticket, parent_ticket, project, project,account, project,account,contact, project,account,contact,creator, project,account,contact,creator,parent_ticket, project,account,contact,parent_ticket, project,account,creator, project,account,creator,parent_ticket, project,account,parent_ticket, project,contact, project,contact,creator, project,contact,creator,parent_ticket, project,contact,parent_ticket, project,creator, project,creator,parent_ticket, project,parent_ticket]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **parentTicketId** | **kotlin.String**| If provided, will only return sub tickets of the parent_ticket_id. | [optional]
 **priority** | **kotlin.String**| If provided, will only return tickets of this priority. | [optional] [enum: HIGH, LOW, NORMAL, URGENT]
 **projectId** | **kotlin.String**| If provided, will only return tickets for this project. | [optional]
 **remoteFields** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: status]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **status** | **kotlin.String**| If provided, will only return tickets of this status. | [optional] [enum: CLOSED, IN_PROGRESS, ON_HOLD, OPEN]
 **tags** | **kotlin.String**| If provided, will only return tickets matching the tags; multiple tags can be separated by commas. | [optional]
 **ticketType** | **kotlin.String**| If provided, will only return tickets of this type. | [optional]

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



Updates a &#x60;Ticket&#x60; object with the given &#x60;id&#x60;.

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
val expand : kotlin.String = attachments,assignees,project,account,contact,creator,parent_ticket // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
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
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: account, account,contact, account,contact,creator, account,contact,creator,parent_ticket, account,contact,parent_ticket, account,creator, account,creator,parent_ticket, account,parent_ticket, assignees, assignees,account, assignees,account,contact, assignees,account,contact,creator, assignees,account,contact,creator,parent_ticket, assignees,account,contact,parent_ticket, assignees,account,creator, assignees,account,creator,parent_ticket, assignees,account,parent_ticket, assignees,contact, assignees,contact,creator, assignees,contact,creator,parent_ticket, assignees,contact,parent_ticket, assignees,creator, assignees,creator,parent_ticket, assignees,parent_ticket, assignees,project, assignees,project,account, assignees,project,account,contact, assignees,project,account,contact,creator, assignees,project,account,contact,creator,parent_ticket, assignees,project,account,contact,parent_ticket, assignees,project,account,creator, assignees,project,account,creator,parent_ticket, assignees,project,account,parent_ticket, assignees,project,contact, assignees,project,contact,creator, assignees,project,contact,creator,parent_ticket, assignees,project,contact,parent_ticket, assignees,project,creator, assignees,project,creator,parent_ticket, assignees,project,parent_ticket, attachments, attachments,account, attachments,account,contact, attachments,account,contact,creator, attachments,account,contact,creator,parent_ticket, attachments,account,contact,parent_ticket, attachments,account,creator, attachments,account,creator,parent_ticket, attachments,account,parent_ticket, attachments,assignees, attachments,assignees,account, attachments,assignees,account,contact, attachments,assignees,account,contact,creator, attachments,assignees,account,contact,creator,parent_ticket, attachments,assignees,account,contact,parent_ticket, attachments,assignees,account,creator, attachments,assignees,account,creator,parent_ticket, attachments,assignees,account,parent_ticket, attachments,assignees,contact, attachments,assignees,contact,creator, attachments,assignees,contact,creator,parent_ticket, attachments,assignees,contact,parent_ticket, attachments,assignees,creator, attachments,assignees,creator,parent_ticket, attachments,assignees,parent_ticket, attachments,assignees,project, attachments,assignees,project,account, attachments,assignees,project,account,contact, attachments,assignees,project,account,contact,creator, attachments,assignees,project,account,contact,creator,parent_ticket, attachments,assignees,project,account,contact,parent_ticket, attachments,assignees,project,account,creator, attachments,assignees,project,account,creator,parent_ticket, attachments,assignees,project,account,parent_ticket, attachments,assignees,project,contact, attachments,assignees,project,contact,creator, attachments,assignees,project,contact,creator,parent_ticket, attachments,assignees,project,contact,parent_ticket, attachments,assignees,project,creator, attachments,assignees,project,creator,parent_ticket, attachments,assignees,project,parent_ticket, attachments,contact, attachments,contact,creator, attachments,contact,creator,parent_ticket, attachments,contact,parent_ticket, attachments,creator, attachments,creator,parent_ticket, attachments,parent_ticket, attachments,project, attachments,project,account, attachments,project,account,contact, attachments,project,account,contact,creator, attachments,project,account,contact,creator,parent_ticket, attachments,project,account,contact,parent_ticket, attachments,project,account,creator, attachments,project,account,creator,parent_ticket, attachments,project,account,parent_ticket, attachments,project,contact, attachments,project,contact,creator, attachments,project,contact,creator,parent_ticket, attachments,project,contact,parent_ticket, attachments,project,creator, attachments,project,creator,parent_ticket, attachments,project,parent_ticket, contact, contact,creator, contact,creator,parent_ticket, contact,parent_ticket, creator, creator,parent_ticket, parent_ticket, project, project,account, project,account,contact, project,account,contact,creator, project,account,contact,creator,parent_ticket, project,account,contact,parent_ticket, project,account,creator, project,account,creator,parent_ticket, project,account,parent_ticket, project,contact, project,contact,creator, project,contact,creator,parent_ticket, project,contact,parent_ticket, project,creator, project,creator,parent_ticket, project,parent_ticket]
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

