
# ContactRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **kotlin.String** | The contact&#39;s first name. |  [optional]
**lastName** | **kotlin.String** | The contact&#39;s last name. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The contact&#39;s account. |  [optional]
**addresses** | [**kotlin.collections.List&lt;AddressRequest&gt;**](AddressRequest.md) |  |  [optional]
**emailAddresses** | [**kotlin.collections.List&lt;EmailAddressRequest&gt;**](EmailAddressRequest.md) |  |  [optional]
**phoneNumbers** | [**kotlin.collections.List&lt;PhoneNumberRequest&gt;**](PhoneNumberRequest.md) |  |  [optional]
**lastActivityAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the contact&#39;s last activity occurred. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**remoteFields** | [**kotlin.collections.List&lt;RemoteFieldRequest&gt;**](RemoteFieldRequest.md) |  |  [optional]



