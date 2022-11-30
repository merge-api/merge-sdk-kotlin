
# Attachment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**fileName** | **kotlin.String** | The attachment&#39;s name. |  [optional]
**ticket** | [**java.util.UUID**](java.util.UUID.md) | The ticket associated with the attachment. |  [optional]
**fileUrl** | **kotlin.String** | The attachment&#39;s url. |  [optional]
**contentType** | **kotlin.String** | The attachment&#39;s file format. |  [optional]
**uploadedBy** | [**java.util.UUID**](java.util.UUID.md) | The user who uploaded the attachment. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s attachment was created. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]



