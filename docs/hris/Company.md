
# Company

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**legalName** | **kotlin.String** | The company&#39;s legal name. |  [optional]
**displayName** | **kotlin.String** | The company&#39;s display name. |  [optional]
**eins** | **kotlin.collections.List&lt;kotlin.String&gt;** | The company&#39;s Employer Identification Numbers. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



