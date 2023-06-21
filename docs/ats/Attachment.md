
# Attachment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**fileName** | **kotlin.String** | The attachment&#39;s name. |  [optional]
**fileUrl** | [**java.net.URI**](java.net.URI.md) | The attachment&#39;s url. |  [optional]
**candidate** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**attachmentType** | [**AttachmentTypeEnum**](AttachmentTypeEnum.md) | The attachment&#39;s type.  * &#x60;RESUME&#x60; - RESUME * &#x60;COVER_LETTER&#x60; - COVER_LETTER * &#x60;OFFER_LETTER&#x60; - OFFER_LETTER * &#x60;OTHER&#x60; - OTHER |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



