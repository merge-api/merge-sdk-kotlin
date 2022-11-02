
# CommentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**user** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**body** | **kotlin.String** | The comment&#39;s text body. |  [optional]
**htmlBody** | **kotlin.String** | The comment&#39;s text body formatted as html. |  [optional]
**ticket** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**isPrivate** | **kotlin.Boolean** | Whether or not the comment is internal. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s comment was created. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



