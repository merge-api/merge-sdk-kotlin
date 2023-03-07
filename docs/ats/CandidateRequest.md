
# CandidateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **kotlin.String** | The candidate&#39;s first name. |  [optional]
**lastName** | **kotlin.String** | The candidate&#39;s last name. |  [optional]
**company** | **kotlin.String** | The candidate&#39;s current company. |  [optional]
**title** | **kotlin.String** | The candidate&#39;s current title. |  [optional]
**lastInteractionAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the most recent interaction with the candidate occurred. |  [optional]
**isPrivate** | **kotlin.Boolean** | Whether or not the candidate is private. |  [optional]
**canEmail** | **kotlin.Boolean** | Whether or not the candidate can be emailed. |  [optional]
**locations** | **kotlin.collections.List&lt;kotlin.String&gt;** | The candidate&#39;s locations. |  [optional]
**phoneNumbers** | [**kotlin.collections.List&lt;PhoneNumberRequest&gt;**](PhoneNumberRequest.md) |  |  [optional]
**emailAddresses** | [**kotlin.collections.List&lt;EmailAddressRequest&gt;**](EmailAddressRequest.md) |  |  [optional]
**urls** | [**kotlin.collections.List&lt;UrlRequest&gt;**](UrlRequest.md) |  |  [optional]
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | Array of &#x60;Tag&#x60; names as strings. |  [optional]
**applications** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Array of &#x60;Application&#x60; object IDs. |  [optional]
**attachments** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Array of &#x60;Attachment&#x60; object IDs. |  [optional]
**remoteTemplateId** | **kotlin.String** |  |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



