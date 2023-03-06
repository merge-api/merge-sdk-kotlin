
# Contact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **kotlin.String** | The contact&#39;s first name. |  [optional]
**lastName** | **kotlin.String** | The contact&#39;s last name. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The contact&#39;s account. |  [optional]
**addresses** | [**kotlin.collections.List&lt;Address&gt;**](Address.md) |  |  [optional]
**emailAddresses** | [**kotlin.collections.List&lt;EmailAddress&gt;**](EmailAddress.md) |  |  [optional]
**phoneNumbers** | [**kotlin.collections.List&lt;PhoneNumber&gt;**](PhoneNumber.md) |  |  [optional]
**lastActivityAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the contact&#39;s last activity occurred. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s contact was created. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteFields** | [**kotlin.collections.List&lt;RemoteField&gt;**](RemoteField.md) |  |  [optional] [readonly]



