
# ContactRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**firstName** | **kotlin.String** | The contact&#39;s first name. |  [optional]
**lastName** | **kotlin.String** | The contact&#39;s last name. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**addresses** | [**kotlin.collections.List&lt;AddressRequest&gt;**](AddressRequest.md) |  |  [optional]
**emailAddresses** | [**kotlin.collections.List&lt;EmailAddressRequest&gt;**](EmailAddressRequest.md) |  |  [optional]
**phoneNumbers** | [**kotlin.collections.List&lt;PhoneNumberRequest&gt;**](PhoneNumberRequest.md) |  |  [optional]
**lastActivityAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the contact&#39;s last activity occurred. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s contact was created. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



