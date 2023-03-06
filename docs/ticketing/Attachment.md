
# Attachment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**fileName** | **kotlin.String** | The attachment&#39;s name. It is required to include the file extension in the attachment&#39;s name. |  [optional]
**ticket** | [**java.util.UUID**](java.util.UUID.md) | The ticket associated with the attachment. |  [optional]
**fileUrl** | **kotlin.String** | The attachment&#39;s url. It is required to include the file extension in the file&#39;s URL. |  [optional]
**contentType** | **kotlin.String** | The attachment&#39;s file format. |  [optional]
**uploadedBy** | [**java.util.UUID**](java.util.UUID.md) | The user who uploaded the attachment. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s attachment was created. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



