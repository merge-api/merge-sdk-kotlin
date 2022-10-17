
# Contact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**firstName** | **kotlin.String** | The contact&#39;s first name. |  [optional]
**lastName** | **kotlin.String** | The contact&#39;s last name. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**addresses** | [**kotlin.collections.List&lt;Address&gt;**](Address.md) |  |  [optional]
**emailAddresses** | [**kotlin.collections.List&lt;EmailAddress&gt;**](EmailAddress.md) |  |  [optional]
**phoneNumbers** | [**kotlin.collections.List&lt;PhoneNumber&gt;**](PhoneNumber.md) |  |  [optional]
**lastActivityAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the contact&#39;s last activity occurred. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s contact was created. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]



