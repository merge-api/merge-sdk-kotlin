
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
**status** | [**MarketingEmailStatusEnum**](MarketingEmailStatusEnum.md) | The marketing email&#39;s status. |  [optional]
**sendDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the marketing email was sent. |  [optional]
**template** | [**java.util.UUID**](java.util.UUID.md) | The marketing email&#39;s template. |  [optional]
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]



