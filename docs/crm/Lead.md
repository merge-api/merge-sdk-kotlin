
# Lead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**owner** | [**java.util.UUID**](java.util.UUID.md) | The lead&#39;s owner. |  [optional]
**leadSource** | **kotlin.String** | The lead&#39;s source. |  [optional]
**title** | **kotlin.String** | The lead&#39;s title. |  [optional]
**company** | **kotlin.String** | The lead&#39;s company. |  [optional]
**firstName** | **kotlin.String** | The lead&#39;s first name. |  [optional]
**lastName** | **kotlin.String** | The lead&#39;s last name. |  [optional]
**addresses** | [**kotlin.collections.List&lt;Address&gt;**](Address.md) |  |  [optional] [readonly]
**emailAddresses** | [**kotlin.collections.List&lt;EmailAddress&gt;**](EmailAddress.md) |  |  [optional] [readonly]
**phoneNumbers** | [**kotlin.collections.List&lt;PhoneNumber&gt;**](PhoneNumber.md) |  |  [optional] [readonly]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s lead was updated. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s lead was created. |  [optional]
**convertedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the lead was converted. |  [optional]
**convertedContact** | [**java.util.UUID**](java.util.UUID.md) | The contact of the converted lead. |  [optional]
**convertedAccount** | [**java.util.UUID**](java.util.UUID.md) | The account of the converted lead. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]



