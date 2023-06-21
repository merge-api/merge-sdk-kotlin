# LinkedAccountsApi

All URIs are relative to *https://api.merge.dev/api/mktg/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**linkedAccountsList**](LinkedAccountsApi.md#linkedAccountsList) | **GET** /linked-accounts | 


<a name="linkedAccountsList"></a>
# **linkedAccountsList**
> PaginatedAccountDetailsAndActionsList linkedAccountsList(category, cursor, endUserEmailAddress, endUserOrganizationName, endUserOriginId, endUserOriginIds, id, ids, includeDuplicates, integrationName, isTestAccount, pageSize, status)



List linked accounts for your organization.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.mktg.models.*

val apiInstance = LinkedAccountsApi()
val category : kotlin.String = category_example // kotlin.String | Options: ('hris', 'ats', 'accounting', 'ticketing', 'crm', 'mktg', 'filestorage')  * `hris` - hris * `ats` - ats * `accounting` - accounting * `ticketing` - ticketing * `crm` - crm * `mktg` - mktg * `filestorage` - filestorage
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val endUserEmailAddress : kotlin.String = endUserEmailAddress_example // kotlin.String | If provided, will only return linked accounts associated with the given email address.
val endUserOrganizationName : kotlin.String = endUserOrganizationName_example // kotlin.String | If provided, will only return linked accounts associated with the given organization name.
val endUserOriginId : kotlin.String = endUserOriginId_example // kotlin.String | If provided, will only return linked accounts associated with the given origin ID.
val endUserOriginIds : kotlin.String = endUserOriginIds_example // kotlin.String | Comma-separated list of EndUser origin IDs, making it possible to specify multiple EndUsers at once.
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val ids : kotlin.String = ids_example // kotlin.String | Comma-separated list of LinkedAccount IDs, making it possible to specify multiple LinkedAccounts at once.
val includeDuplicates : kotlin.Boolean = true // kotlin.Boolean | If `true`, will include complete production duplicates of the account specified by the `id` query parameter in the response. `id` must be for a complete production linked account.
val integrationName : kotlin.String = integrationName_example // kotlin.String | If provided, will only return linked accounts associated with the given integration name.
val isTestAccount : kotlin.String = isTestAccount_example // kotlin.String | If included, will only include test linked accounts. If not included, will only include non-test linked accounts.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val status : kotlin.String = status_example // kotlin.String | Filter by status. Options: `COMPLETE`, `INCOMPLETE`, `RELINK_NEEDED`
try {
    val result : PaginatedAccountDetailsAndActionsList = apiInstance.linkedAccountsList(category, cursor, endUserEmailAddress, endUserOrganizationName, endUserOriginId, endUserOriginIds, id, ids, includeDuplicates, integrationName, isTestAccount, pageSize, status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinkedAccountsApi#linkedAccountsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinkedAccountsApi#linkedAccountsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **kotlin.String**| Options: (&#39;hris&#39;, &#39;ats&#39;, &#39;accounting&#39;, &#39;ticketing&#39;, &#39;crm&#39;, &#39;mktg&#39;, &#39;filestorage&#39;)  * &#x60;hris&#x60; - hris * &#x60;ats&#x60; - ats * &#x60;accounting&#x60; - accounting * &#x60;ticketing&#x60; - ticketing * &#x60;crm&#x60; - crm * &#x60;mktg&#x60; - mktg * &#x60;filestorage&#x60; - filestorage | [optional] [enum: accounting, ats, crm, filestorage, hris, mktg, ticketing]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **endUserEmailAddress** | **kotlin.String**| If provided, will only return linked accounts associated with the given email address. | [optional]
 **endUserOrganizationName** | **kotlin.String**| If provided, will only return linked accounts associated with the given organization name. | [optional]
 **endUserOriginId** | **kotlin.String**| If provided, will only return linked accounts associated with the given origin ID. | [optional]
 **endUserOriginIds** | **kotlin.String**| Comma-separated list of EndUser origin IDs, making it possible to specify multiple EndUsers at once. | [optional]
 **id** | **java.util.UUID**|  | [optional]
 **ids** | **kotlin.String**| Comma-separated list of LinkedAccount IDs, making it possible to specify multiple LinkedAccounts at once. | [optional]
 **includeDuplicates** | **kotlin.Boolean**| If &#x60;true&#x60;, will include complete production duplicates of the account specified by the &#x60;id&#x60; query parameter in the response. &#x60;id&#x60; must be for a complete production linked account. | [optional]
 **integrationName** | **kotlin.String**| If provided, will only return linked accounts associated with the given integration name. | [optional]
 **isTestAccount** | **kotlin.String**| If included, will only include test linked accounts. If not included, will only include non-test linked accounts. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **status** | **kotlin.String**| Filter by status. Options: &#x60;COMPLETE&#x60;, &#x60;INCOMPLETE&#x60;, &#x60;RELINK_NEEDED&#x60; | [optional]

### Return type

[**PaginatedAccountDetailsAndActionsList**](PaginatedAccountDetailsAndActionsList.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

