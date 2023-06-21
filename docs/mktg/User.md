
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The user&#39;s full name. |  [optional]
**username** | **kotlin.String** | The user&#39;s username. |  [optional]
**email** | **kotlin.String** | The user&#39;s email. |  [optional]
**role** | [**RoleEnum**](RoleEnum.md) | The user&#39;s role.  * &#x60;ADMIN&#x60; - ADMIN * &#x60;MANAGER&#x60; - MANAGER * &#x60;CONTRIBUTOR&#x60; - CONTRIBUTOR * &#x60;VIEWER&#x60; - VIEWER |  [optional]
**timezone** | **kotlin.String** | The user&#39;s timezone. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



