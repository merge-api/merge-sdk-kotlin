# IssuesApi

All URIs are relative to *https://api.merge.dev/api/accounting/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**issuesList**](IssuesApi.md#issuesList) | **GET** /issues | 
[**issuesRetrieve**](IssuesApi.md#issuesRetrieve) | **GET** /issues/{id} | 


<a name="issuesList"></a>
# **issuesList**
> PaginatedIssueList issuesList(accountToken, cursor, endDate, endUserOrganizationName, firstIncidentTimeAfter, firstIncidentTimeBefore, includeMuted, integrationName, lastIncidentTimeAfter, lastIncidentTimeBefore, pageSize, startDate, status)



Gets issues.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = IssuesApi()
val accountToken : kotlin.String = accountToken_example // kotlin.String | 
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val endDate : kotlin.String = endDate_example // kotlin.String | If included, will only include issues whose most recent action occurred before this time
val endUserOrganizationName : kotlin.String = endUserOrganizationName_example // kotlin.String | 
val firstIncidentTimeAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return issues whose first incident time was after this datetime.
val firstIncidentTimeBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return issues whose first incident time was before this datetime.
val includeMuted : kotlin.String = includeMuted_example // kotlin.String | If True, will include muted issues
val integrationName : kotlin.String = integrationName_example // kotlin.String | 
val lastIncidentTimeAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return issues whose last incident time was after this datetime.
val lastIncidentTimeBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return issues whose last incident time was before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val startDate : kotlin.String = startDate_example // kotlin.String | If included, will only include issues whose most recent action occurred after this time
val status : kotlin.String = status_example // kotlin.String | Status of the issue. Options: ('ONGOING', 'RESOLVED')  * `ONGOING` - ONGOING * `RESOLVED` - RESOLVED
try {
    val result : PaginatedIssueList = apiInstance.issuesList(accountToken, cursor, endDate, endUserOrganizationName, firstIncidentTimeAfter, firstIncidentTimeBefore, includeMuted, integrationName, lastIncidentTimeAfter, lastIncidentTimeBefore, pageSize, startDate, status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountToken** | **kotlin.String**|  | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **endDate** | **kotlin.String**| If included, will only include issues whose most recent action occurred before this time | [optional]
 **endUserOrganizationName** | **kotlin.String**|  | [optional]
 **firstIncidentTimeAfter** | **java.time.OffsetDateTime**| If provided, will only return issues whose first incident time was after this datetime. | [optional]
 **firstIncidentTimeBefore** | **java.time.OffsetDateTime**| If provided, will only return issues whose first incident time was before this datetime. | [optional]
 **includeMuted** | **kotlin.String**| If True, will include muted issues | [optional]
 **integrationName** | **kotlin.String**|  | [optional]
 **lastIncidentTimeAfter** | **java.time.OffsetDateTime**| If provided, will only return issues whose last incident time was after this datetime. | [optional]
 **lastIncidentTimeBefore** | **java.time.OffsetDateTime**| If provided, will only return issues whose last incident time was before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **startDate** | **kotlin.String**| If included, will only include issues whose most recent action occurred after this time | [optional]
 **status** | **kotlin.String**| Status of the issue. Options: (&#39;ONGOING&#39;, &#39;RESOLVED&#39;)  * &#x60;ONGOING&#x60; - ONGOING * &#x60;RESOLVED&#x60; - RESOLVED | [optional] [enum: ONGOING, RESOLVED]

### Return type

[**PaginatedIssueList**](PaginatedIssueList.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="issuesRetrieve"></a>
# **issuesRetrieve**
> Issue issuesRetrieve(id)



Get a specific issue.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = IssuesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Issue = apiInstance.issuesRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**Issue**](Issue.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

