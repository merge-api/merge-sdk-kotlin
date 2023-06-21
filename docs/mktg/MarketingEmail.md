
# MarketingEmail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaigns** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The campaigns receiving this marketing email. | 
**name** | **kotlin.String** | The marketing email&#39;s name. |  [optional]
**subject** | **kotlin.String** | The marketing email&#39;s subject. |  [optional]
**body** | **kotlin.String** | The marketing email&#39;s body. |  [optional]
**htmlBody** | **kotlin.String** | The marketing email&#39;s html body. |  [optional]
**fromName** | **kotlin.String** | The marketing email&#39;s from name. |  [optional]
**fromEmail** | **kotlin.String** | The marketing email&#39;s from email. |  [optional]
**preview** | **kotlin.String** | The marketing email&#39;s preview. |  [optional]
**replyTo** | **kotlin.String** | The marketing email&#39;s reply-to. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the marketing email was created in the remote system. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the marketing email was last updated in the remote system. |  [optional]
**status** | [**MarketingEmailStatusEnum**](MarketingEmailStatusEnum.md) | The marketing email&#39;s status.  * &#x60;DRAFT&#x60; - DRAFT * &#x60;QUEUED&#x60; - QUEUED * &#x60;SENT&#x60; - SENT |  [optional]
**sendDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the marketing email was sent. |  [optional]
**template** | [**java.util.UUID**](java.util.UUID.md) | The marketing email&#39;s template. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



