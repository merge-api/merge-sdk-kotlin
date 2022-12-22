# EmployeesApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**employeesCreate**](EmployeesApi.md#employeesCreate) | **POST** /employees | 
[**employeesIgnoreCreate**](EmployeesApi.md#employeesIgnoreCreate) | **POST** /employees/ignore/{model_id} | 
[**employeesList**](EmployeesApi.md#employeesList) | **GET** /employees | 
[**employeesMetaPostRetrieve**](EmployeesApi.md#employeesMetaPostRetrieve) | **GET** /employees/meta/post | 
[**employeesRetrieve**](EmployeesApi.md#employeesRetrieve) | **GET** /employees/{id} | 


<a name="employeesCreate"></a>
# **employeesCreate**
> EmployeeResponse employeesCreate(employeeEndpointRequest, isDebugMode, runAsync)



Creates an &#x60;Employee&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = EmployeesApi()
val employeeEndpointRequest : EmployeeEndpointRequest =  // EmployeeEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : EmployeeResponse = apiInstance.employeesCreate(employeeEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeesApi#employeesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeesApi#employeesCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employeeEndpointRequest** | [**EmployeeEndpointRequest**](EmployeeEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**EmployeeResponse**](EmployeeResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="employeesIgnoreCreate"></a>
# **employeesIgnoreCreate**
> IgnoreCommonModel employeesIgnoreCreate(modelId, ignoreCommonModelRequest)



Ignores a specific row based on the &#x60;model_id&#x60; in the url. These records will have their properties set to null, and will not be updated in future syncs. The \&quot;reason\&quot; and \&quot;message\&quot; fields in the request body will be stored for audit purposes.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = EmployeesApi()
val modelId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val ignoreCommonModelRequest : IgnoreCommonModelRequest =  // IgnoreCommonModelRequest | 
try {
    val result : IgnoreCommonModel = apiInstance.employeesIgnoreCreate(modelId, ignoreCommonModelRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeesApi#employeesIgnoreCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeesApi#employeesIgnoreCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **java.util.UUID**|  |
 **ignoreCommonModelRequest** | [**IgnoreCommonModelRequest**](IgnoreCommonModelRequest.md)|  |

### Return type

[**IgnoreCommonModel**](IgnoreCommonModel.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="employeesList"></a>
# **employeesList**
> PaginatedEmployeeList employeesList(companyId, createdAfter, createdBefore, cursor, displayFullName, employmentStatus, expand, firstName, groups, includeDeletedData, includeRemoteData, includeSensitiveFields, lastName, managerId, modifiedAfter, modifiedBefore, pageSize, payGroupId, personalEmail, remoteFields, remoteId, teamId, workEmail, workLocationId)



Returns a list of &#x60;Employee&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = EmployeesApi()
val companyId : kotlin.String = companyId_example // kotlin.String | If provided, will only return employees for this company.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val displayFullName : kotlin.String = displayFullName_example // kotlin.String | If provided, will only return employees with this display name.
val employmentStatus : kotlin.String = employmentStatus_example // kotlin.String | If provided, will only return employees with this employment status.
val expand : kotlin.String = employments,groups,home_location,work_location,manager,team,company,pay_group // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val firstName : kotlin.String = firstName_example // kotlin.String | If provided, will only return employees with this first name.
val groups : kotlin.String = groups_example // kotlin.String | If provided, will only return employees matching the group ids; multiple groups can be separated by commas.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val includeSensitiveFields : kotlin.Boolean = true // kotlin.Boolean | Whether to include sensitive fields (such as social security numbers) in the response.
val lastName : kotlin.String = lastName_example // kotlin.String | If provided, will only return employees with this last name.
val managerId : kotlin.String = managerId_example // kotlin.String | If provided, will only return employees for this manager.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val payGroupId : kotlin.String = payGroupId_example // kotlin.String | If provided, will only return employees for this pay group
val personalEmail : kotlin.String = personalEmail_example // kotlin.String | If provided, will only return Employees with this personal email
val remoteFields : kotlin.String = employment_status,ethnicity,gender,marital_status // kotlin.String | Which fields should be returned in non-normalized form.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
val teamId : kotlin.String = teamId_example // kotlin.String | If provided, will only return employees for this team.
val workEmail : kotlin.String = workEmail_example // kotlin.String | If provided, will only return Employees with this work email
val workLocationId : kotlin.String = workLocationId_example // kotlin.String | If provided, will only return employees for this location.
try {
    val result : PaginatedEmployeeList = apiInstance.employeesList(companyId, createdAfter, createdBefore, cursor, displayFullName, employmentStatus, expand, firstName, groups, includeDeletedData, includeRemoteData, includeSensitiveFields, lastName, managerId, modifiedAfter, modifiedBefore, pageSize, payGroupId, personalEmail, remoteFields, remoteId, teamId, workEmail, workLocationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeesApi#employeesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeesApi#employeesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| If provided, will only return employees for this company. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **displayFullName** | **kotlin.String**| If provided, will only return employees with this display name. | [optional]
 **employmentStatus** | **kotlin.String**| If provided, will only return employees with this employment status. | [optional] [enum: ACTIVE, INACTIVE, PENDING]
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: company, company,pay_group, employments, employments,company, employments,company,pay_group, employments,groups, employments,groups,company, employments,groups,company,pay_group, employments,groups,home_location, employments,groups,home_location,company, employments,groups,home_location,company,pay_group, employments,groups,home_location,manager, employments,groups,home_location,manager,company, employments,groups,home_location,manager,company,pay_group, employments,groups,home_location,manager,pay_group, employments,groups,home_location,manager,team, employments,groups,home_location,manager,team,company, employments,groups,home_location,manager,team,company,pay_group, employments,groups,home_location,manager,team,pay_group, employments,groups,home_location,pay_group, employments,groups,home_location,team, employments,groups,home_location,team,company, employments,groups,home_location,team,company,pay_group, employments,groups,home_location,team,pay_group, employments,groups,home_location,work_location, employments,groups,home_location,work_location,company, employments,groups,home_location,work_location,company,pay_group, employments,groups,home_location,work_location,manager, employments,groups,home_location,work_location,manager,company, employments,groups,home_location,work_location,manager,company,pay_group, employments,groups,home_location,work_location,manager,pay_group, employments,groups,home_location,work_location,manager,team, employments,groups,home_location,work_location,manager,team,company, employments,groups,home_location,work_location,manager,team,company,pay_group, employments,groups,home_location,work_location,manager,team,pay_group, employments,groups,home_location,work_location,pay_group, employments,groups,home_location,work_location,team, employments,groups,home_location,work_location,team,company, employments,groups,home_location,work_location,team,company,pay_group, employments,groups,home_location,work_location,team,pay_group, employments,groups,manager, employments,groups,manager,company, employments,groups,manager,company,pay_group, employments,groups,manager,pay_group, employments,groups,manager,team, employments,groups,manager,team,company, employments,groups,manager,team,company,pay_group, employments,groups,manager,team,pay_group, employments,groups,pay_group, employments,groups,team, employments,groups,team,company, employments,groups,team,company,pay_group, employments,groups,team,pay_group, employments,groups,work_location, employments,groups,work_location,company, employments,groups,work_location,company,pay_group, employments,groups,work_location,manager, employments,groups,work_location,manager,company, employments,groups,work_location,manager,company,pay_group, employments,groups,work_location,manager,pay_group, employments,groups,work_location,manager,team, employments,groups,work_location,manager,team,company, employments,groups,work_location,manager,team,company,pay_group, employments,groups,work_location,manager,team,pay_group, employments,groups,work_location,pay_group, employments,groups,work_location,team, employments,groups,work_location,team,company, employments,groups,work_location,team,company,pay_group, employments,groups,work_location,team,pay_group, employments,home_location, employments,home_location,company, employments,home_location,company,pay_group, employments,home_location,manager, employments,home_location,manager,company, employments,home_location,manager,company,pay_group, employments,home_location,manager,pay_group, employments,home_location,manager,team, employments,home_location,manager,team,company, employments,home_location,manager,team,company,pay_group, employments,home_location,manager,team,pay_group, employments,home_location,pay_group, employments,home_location,team, employments,home_location,team,company, employments,home_location,team,company,pay_group, employments,home_location,team,pay_group, employments,home_location,work_location, employments,home_location,work_location,company, employments,home_location,work_location,company,pay_group, employments,home_location,work_location,manager, employments,home_location,work_location,manager,company, employments,home_location,work_location,manager,company,pay_group, employments,home_location,work_location,manager,pay_group, employments,home_location,work_location,manager,team, employments,home_location,work_location,manager,team,company, employments,home_location,work_location,manager,team,company,pay_group, employments,home_location,work_location,manager,team,pay_group, employments,home_location,work_location,pay_group, employments,home_location,work_location,team, employments,home_location,work_location,team,company, employments,home_location,work_location,team,company,pay_group, employments,home_location,work_location,team,pay_group, employments,manager, employments,manager,company, employments,manager,company,pay_group, employments,manager,pay_group, employments,manager,team, employments,manager,team,company, employments,manager,team,company,pay_group, employments,manager,team,pay_group, employments,pay_group, employments,team, employments,team,company, employments,team,company,pay_group, employments,team,pay_group, employments,work_location, employments,work_location,company, employments,work_location,company,pay_group, employments,work_location,manager, employments,work_location,manager,company, employments,work_location,manager,company,pay_group, employments,work_location,manager,pay_group, employments,work_location,manager,team, employments,work_location,manager,team,company, employments,work_location,manager,team,company,pay_group, employments,work_location,manager,team,pay_group, employments,work_location,pay_group, employments,work_location,team, employments,work_location,team,company, employments,work_location,team,company,pay_group, employments,work_location,team,pay_group, groups, groups,company, groups,company,pay_group, groups,home_location, groups,home_location,company, groups,home_location,company,pay_group, groups,home_location,manager, groups,home_location,manager,company, groups,home_location,manager,company,pay_group, groups,home_location,manager,pay_group, groups,home_location,manager,team, groups,home_location,manager,team,company, groups,home_location,manager,team,company,pay_group, groups,home_location,manager,team,pay_group, groups,home_location,pay_group, groups,home_location,team, groups,home_location,team,company, groups,home_location,team,company,pay_group, groups,home_location,team,pay_group, groups,home_location,work_location, groups,home_location,work_location,company, groups,home_location,work_location,company,pay_group, groups,home_location,work_location,manager, groups,home_location,work_location,manager,company, groups,home_location,work_location,manager,company,pay_group, groups,home_location,work_location,manager,pay_group, groups,home_location,work_location,manager,team, groups,home_location,work_location,manager,team,company, groups,home_location,work_location,manager,team,company,pay_group, groups,home_location,work_location,manager,team,pay_group, groups,home_location,work_location,pay_group, groups,home_location,work_location,team, groups,home_location,work_location,team,company, groups,home_location,work_location,team,company,pay_group, groups,home_location,work_location,team,pay_group, groups,manager, groups,manager,company, groups,manager,company,pay_group, groups,manager,pay_group, groups,manager,team, groups,manager,team,company, groups,manager,team,company,pay_group, groups,manager,team,pay_group, groups,pay_group, groups,team, groups,team,company, groups,team,company,pay_group, groups,team,pay_group, groups,work_location, groups,work_location,company, groups,work_location,company,pay_group, groups,work_location,manager, groups,work_location,manager,company, groups,work_location,manager,company,pay_group, groups,work_location,manager,pay_group, groups,work_location,manager,team, groups,work_location,manager,team,company, groups,work_location,manager,team,company,pay_group, groups,work_location,manager,team,pay_group, groups,work_location,pay_group, groups,work_location,team, groups,work_location,team,company, groups,work_location,team,company,pay_group, groups,work_location,team,pay_group, home_location, home_location,company, home_location,company,pay_group, home_location,manager, home_location,manager,company, home_location,manager,company,pay_group, home_location,manager,pay_group, home_location,manager,team, home_location,manager,team,company, home_location,manager,team,company,pay_group, home_location,manager,team,pay_group, home_location,pay_group, home_location,team, home_location,team,company, home_location,team,company,pay_group, home_location,team,pay_group, home_location,work_location, home_location,work_location,company, home_location,work_location,company,pay_group, home_location,work_location,manager, home_location,work_location,manager,company, home_location,work_location,manager,company,pay_group, home_location,work_location,manager,pay_group, home_location,work_location,manager,team, home_location,work_location,manager,team,company, home_location,work_location,manager,team,company,pay_group, home_location,work_location,manager,team,pay_group, home_location,work_location,pay_group, home_location,work_location,team, home_location,work_location,team,company, home_location,work_location,team,company,pay_group, home_location,work_location,team,pay_group, manager, manager,company, manager,company,pay_group, manager,pay_group, manager,team, manager,team,company, manager,team,company,pay_group, manager,team,pay_group, pay_group, team, team,company, team,company,pay_group, team,pay_group, work_location, work_location,company, work_location,company,pay_group, work_location,manager, work_location,manager,company, work_location,manager,company,pay_group, work_location,manager,pay_group, work_location,manager,team, work_location,manager,team,company, work_location,manager,team,company,pay_group, work_location,manager,team,pay_group, work_location,pay_group, work_location,team, work_location,team,company, work_location,team,company,pay_group, work_location,team,pay_group]
 **firstName** | **kotlin.String**| If provided, will only return employees with this first name. | [optional]
 **groups** | **kotlin.String**| If provided, will only return employees matching the group ids; multiple groups can be separated by commas. | [optional]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeSensitiveFields** | **kotlin.Boolean**| Whether to include sensitive fields (such as social security numbers) in the response. | [optional]
 **lastName** | **kotlin.String**| If provided, will only return employees with this last name. | [optional]
 **managerId** | **kotlin.String**| If provided, will only return employees for this manager. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **payGroupId** | **kotlin.String**| If provided, will only return employees for this pay group | [optional]
 **personalEmail** | **kotlin.String**| If provided, will only return Employees with this personal email | [optional]
 **remoteFields** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: employment_status, employment_status,ethnicity, employment_status,ethnicity,gender, employment_status,ethnicity,gender,marital_status, employment_status,ethnicity,marital_status, employment_status,gender, employment_status,gender,marital_status, employment_status,marital_status, ethnicity, ethnicity,gender, ethnicity,gender,marital_status, ethnicity,marital_status, gender, gender,marital_status, marital_status]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]
 **teamId** | **kotlin.String**| If provided, will only return employees for this team. | [optional]
 **workEmail** | **kotlin.String**| If provided, will only return Employees with this work email | [optional]
 **workLocationId** | **kotlin.String**| If provided, will only return employees for this location. | [optional]

### Return type

[**PaginatedEmployeeList**](PaginatedEmployeeList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="employeesMetaPostRetrieve"></a>
# **employeesMetaPostRetrieve**
> MetaResponse employeesMetaPostRetrieve()



Returns metadata for &#x60;Employee&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = EmployeesApi()
try {
    val result : MetaResponse = apiInstance.employeesMetaPostRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeesApi#employeesMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeesApi#employeesMetaPostRetrieve")
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

<a name="employeesRetrieve"></a>
# **employeesRetrieve**
> Employee employeesRetrieve(id, expand, includeRemoteData, includeSensitiveFields, remoteFields)



Returns an &#x60;Employee&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.hris.models.*

val apiInstance = EmployeesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expand : kotlin.String = employments,groups,home_location,work_location,manager,team,company,pay_group // kotlin.String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val includeSensitiveFields : kotlin.Boolean = true // kotlin.Boolean | Whether to include sensitive fields (such as social security numbers) in the response.
val remoteFields : kotlin.String = employment_status,ethnicity,gender,marital_status // kotlin.String | Which fields should be returned in non-normalized form.
try {
    val result : Employee = apiInstance.employeesRetrieve(id, expand, includeRemoteData, includeSensitiveFields, remoteFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeesApi#employeesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeesApi#employeesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **expand** | **kotlin.String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: company, company,pay_group, employments, employments,company, employments,company,pay_group, employments,groups, employments,groups,company, employments,groups,company,pay_group, employments,groups,home_location, employments,groups,home_location,company, employments,groups,home_location,company,pay_group, employments,groups,home_location,manager, employments,groups,home_location,manager,company, employments,groups,home_location,manager,company,pay_group, employments,groups,home_location,manager,pay_group, employments,groups,home_location,manager,team, employments,groups,home_location,manager,team,company, employments,groups,home_location,manager,team,company,pay_group, employments,groups,home_location,manager,team,pay_group, employments,groups,home_location,pay_group, employments,groups,home_location,team, employments,groups,home_location,team,company, employments,groups,home_location,team,company,pay_group, employments,groups,home_location,team,pay_group, employments,groups,home_location,work_location, employments,groups,home_location,work_location,company, employments,groups,home_location,work_location,company,pay_group, employments,groups,home_location,work_location,manager, employments,groups,home_location,work_location,manager,company, employments,groups,home_location,work_location,manager,company,pay_group, employments,groups,home_location,work_location,manager,pay_group, employments,groups,home_location,work_location,manager,team, employments,groups,home_location,work_location,manager,team,company, employments,groups,home_location,work_location,manager,team,company,pay_group, employments,groups,home_location,work_location,manager,team,pay_group, employments,groups,home_location,work_location,pay_group, employments,groups,home_location,work_location,team, employments,groups,home_location,work_location,team,company, employments,groups,home_location,work_location,team,company,pay_group, employments,groups,home_location,work_location,team,pay_group, employments,groups,manager, employments,groups,manager,company, employments,groups,manager,company,pay_group, employments,groups,manager,pay_group, employments,groups,manager,team, employments,groups,manager,team,company, employments,groups,manager,team,company,pay_group, employments,groups,manager,team,pay_group, employments,groups,pay_group, employments,groups,team, employments,groups,team,company, employments,groups,team,company,pay_group, employments,groups,team,pay_group, employments,groups,work_location, employments,groups,work_location,company, employments,groups,work_location,company,pay_group, employments,groups,work_location,manager, employments,groups,work_location,manager,company, employments,groups,work_location,manager,company,pay_group, employments,groups,work_location,manager,pay_group, employments,groups,work_location,manager,team, employments,groups,work_location,manager,team,company, employments,groups,work_location,manager,team,company,pay_group, employments,groups,work_location,manager,team,pay_group, employments,groups,work_location,pay_group, employments,groups,work_location,team, employments,groups,work_location,team,company, employments,groups,work_location,team,company,pay_group, employments,groups,work_location,team,pay_group, employments,home_location, employments,home_location,company, employments,home_location,company,pay_group, employments,home_location,manager, employments,home_location,manager,company, employments,home_location,manager,company,pay_group, employments,home_location,manager,pay_group, employments,home_location,manager,team, employments,home_location,manager,team,company, employments,home_location,manager,team,company,pay_group, employments,home_location,manager,team,pay_group, employments,home_location,pay_group, employments,home_location,team, employments,home_location,team,company, employments,home_location,team,company,pay_group, employments,home_location,team,pay_group, employments,home_location,work_location, employments,home_location,work_location,company, employments,home_location,work_location,company,pay_group, employments,home_location,work_location,manager, employments,home_location,work_location,manager,company, employments,home_location,work_location,manager,company,pay_group, employments,home_location,work_location,manager,pay_group, employments,home_location,work_location,manager,team, employments,home_location,work_location,manager,team,company, employments,home_location,work_location,manager,team,company,pay_group, employments,home_location,work_location,manager,team,pay_group, employments,home_location,work_location,pay_group, employments,home_location,work_location,team, employments,home_location,work_location,team,company, employments,home_location,work_location,team,company,pay_group, employments,home_location,work_location,team,pay_group, employments,manager, employments,manager,company, employments,manager,company,pay_group, employments,manager,pay_group, employments,manager,team, employments,manager,team,company, employments,manager,team,company,pay_group, employments,manager,team,pay_group, employments,pay_group, employments,team, employments,team,company, employments,team,company,pay_group, employments,team,pay_group, employments,work_location, employments,work_location,company, employments,work_location,company,pay_group, employments,work_location,manager, employments,work_location,manager,company, employments,work_location,manager,company,pay_group, employments,work_location,manager,pay_group, employments,work_location,manager,team, employments,work_location,manager,team,company, employments,work_location,manager,team,company,pay_group, employments,work_location,manager,team,pay_group, employments,work_location,pay_group, employments,work_location,team, employments,work_location,team,company, employments,work_location,team,company,pay_group, employments,work_location,team,pay_group, groups, groups,company, groups,company,pay_group, groups,home_location, groups,home_location,company, groups,home_location,company,pay_group, groups,home_location,manager, groups,home_location,manager,company, groups,home_location,manager,company,pay_group, groups,home_location,manager,pay_group, groups,home_location,manager,team, groups,home_location,manager,team,company, groups,home_location,manager,team,company,pay_group, groups,home_location,manager,team,pay_group, groups,home_location,pay_group, groups,home_location,team, groups,home_location,team,company, groups,home_location,team,company,pay_group, groups,home_location,team,pay_group, groups,home_location,work_location, groups,home_location,work_location,company, groups,home_location,work_location,company,pay_group, groups,home_location,work_location,manager, groups,home_location,work_location,manager,company, groups,home_location,work_location,manager,company,pay_group, groups,home_location,work_location,manager,pay_group, groups,home_location,work_location,manager,team, groups,home_location,work_location,manager,team,company, groups,home_location,work_location,manager,team,company,pay_group, groups,home_location,work_location,manager,team,pay_group, groups,home_location,work_location,pay_group, groups,home_location,work_location,team, groups,home_location,work_location,team,company, groups,home_location,work_location,team,company,pay_group, groups,home_location,work_location,team,pay_group, groups,manager, groups,manager,company, groups,manager,company,pay_group, groups,manager,pay_group, groups,manager,team, groups,manager,team,company, groups,manager,team,company,pay_group, groups,manager,team,pay_group, groups,pay_group, groups,team, groups,team,company, groups,team,company,pay_group, groups,team,pay_group, groups,work_location, groups,work_location,company, groups,work_location,company,pay_group, groups,work_location,manager, groups,work_location,manager,company, groups,work_location,manager,company,pay_group, groups,work_location,manager,pay_group, groups,work_location,manager,team, groups,work_location,manager,team,company, groups,work_location,manager,team,company,pay_group, groups,work_location,manager,team,pay_group, groups,work_location,pay_group, groups,work_location,team, groups,work_location,team,company, groups,work_location,team,company,pay_group, groups,work_location,team,pay_group, home_location, home_location,company, home_location,company,pay_group, home_location,manager, home_location,manager,company, home_location,manager,company,pay_group, home_location,manager,pay_group, home_location,manager,team, home_location,manager,team,company, home_location,manager,team,company,pay_group, home_location,manager,team,pay_group, home_location,pay_group, home_location,team, home_location,team,company, home_location,team,company,pay_group, home_location,team,pay_group, home_location,work_location, home_location,work_location,company, home_location,work_location,company,pay_group, home_location,work_location,manager, home_location,work_location,manager,company, home_location,work_location,manager,company,pay_group, home_location,work_location,manager,pay_group, home_location,work_location,manager,team, home_location,work_location,manager,team,company, home_location,work_location,manager,team,company,pay_group, home_location,work_location,manager,team,pay_group, home_location,work_location,pay_group, home_location,work_location,team, home_location,work_location,team,company, home_location,work_location,team,company,pay_group, home_location,work_location,team,pay_group, manager, manager,company, manager,company,pay_group, manager,pay_group, manager,team, manager,team,company, manager,team,company,pay_group, manager,team,pay_group, pay_group, team, team,company, team,company,pay_group, team,pay_group, work_location, work_location,company, work_location,company,pay_group, work_location,manager, work_location,manager,company, work_location,manager,company,pay_group, work_location,manager,pay_group, work_location,manager,team, work_location,manager,team,company, work_location,manager,team,company,pay_group, work_location,manager,team,pay_group, work_location,pay_group, work_location,team, work_location,team,company, work_location,team,company,pay_group, work_location,team,pay_group]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeSensitiveFields** | **kotlin.Boolean**| Whether to include sensitive fields (such as social security numbers) in the response. | [optional]
 **remoteFields** | **kotlin.String**| Which fields should be returned in non-normalized form. | [optional] [enum: employment_status, employment_status,ethnicity, employment_status,ethnicity,gender, employment_status,ethnicity,gender,marital_status, employment_status,ethnicity,marital_status, employment_status,gender, employment_status,gender,marital_status, employment_status,marital_status, ethnicity, ethnicity,gender, ethnicity,gender,marital_status, ethnicity,marital_status, gender, gender,marital_status, marital_status]

### Return type

[**Employee**](Employee.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

