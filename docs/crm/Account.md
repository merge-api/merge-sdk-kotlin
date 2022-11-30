
# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**owner** | [**java.util.UUID**](java.util.UUID.md) | The account&#39;s owner. |  [optional]
**name** | **kotlin.String** | The account&#39;s name. |  [optional]
**description** | **kotlin.String** | The account&#39;s description. |  [optional]
**industry** | **kotlin.String** | The account&#39;s industry. |  [optional]
**website** | [**java.net.URI**](java.net.URI.md) | The account&#39;s website. |  [optional]
**numberOfEmployees** | **kotlin.Int** | The account&#39;s number of employees. |  [optional]
**addresses** | [**kotlin.collections.List&lt;Address&gt;**](Address.md) |  |  [optional] [readonly]
**phoneNumbers** | [**kotlin.collections.List&lt;PhoneNumber&gt;**](PhoneNumber.md) |  |  [optional] [readonly]
**lastActivityAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the account&#39;s last activity  occurred. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s account was updated. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s account was created. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]



