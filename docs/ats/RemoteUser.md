
# RemoteUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**firstName** | **kotlin.String** | The user&#39;s first name. |  [optional]
**lastName** | **kotlin.String** | The user&#39;s last name. |  [optional]
**email** | **kotlin.String** | The user&#39;s email. |  [optional]
**disabled** | **kotlin.Boolean** | Whether the user&#39;s account had been disabled. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s user was created. |  [optional]
**accessRole** | [**AccessRoleEnum**](AccessRoleEnum.md) | The user&#39;s role.  * &#x60;SUPER_ADMIN&#x60; - SUPER_ADMIN * &#x60;ADMIN&#x60; - ADMIN * &#x60;TEAM_MEMBER&#x60; - TEAM_MEMBER * &#x60;LIMITED_TEAM_MEMBER&#x60; - LIMITED_TEAM_MEMBER * &#x60;INTERVIEWER&#x60; - INTERVIEWER |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



