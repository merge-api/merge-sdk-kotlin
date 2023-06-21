
# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**owner** | [**java.util.UUID**](java.util.UUID.md) | The account&#39;s owner. |  [optional]
**name** | **kotlin.String** | The account&#39;s name. |  [optional]
**description** | **kotlin.String** | The account&#39;s description. |  [optional]
**industry** | **kotlin.String** | The account&#39;s industry. |  [optional]
**website** | [**java.net.URI**](java.net.URI.md) | The account&#39;s website. |  [optional]
**numberOfEmployees** | **kotlin.Int** | The account&#39;s number of employees. |  [optional]
**addresses** | [**kotlin.collections.List&lt;Address&gt;**](Address.md) |  |  [optional] [readonly]
**phoneNumbers** | [**kotlin.collections.List&lt;PhoneNumber&gt;**](PhoneNumber.md) |  |  [optional] [readonly]
**lastActivityAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The last date (either most recent or furthest in the future) of when an activity occurs in an account. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the CRM system account data was last modified by a user with a login. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s account was created. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteFields** | [**kotlin.collections.List&lt;RemoteField&gt;**](RemoteField.md) |  |  [optional] [readonly]



