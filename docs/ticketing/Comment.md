
# Comment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**user** | [**java.util.UUID**](java.util.UUID.md) | The author of the Comment, if the author is a User. |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) | The author of the Comment, if the author is a Contact. |  [optional]
**body** | **kotlin.String** | The comment&#39;s text body. |  [optional]
**htmlBody** | **kotlin.String** | The comment&#39;s text body formatted as html. |  [optional]
**ticket** | [**java.util.UUID**](java.util.UUID.md) | The ticket associated with the comment.  |  [optional]
**isPrivate** | **kotlin.Boolean** | Whether or not the comment is internal. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s comment was created. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



