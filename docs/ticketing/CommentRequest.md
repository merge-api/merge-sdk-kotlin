
# CommentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user** | [**java.util.UUID**](java.util.UUID.md) | The author of the Comment, if the author is a User. |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) | The author of the Comment, if the author is a Contact. |  [optional]
**body** | **kotlin.String** | The comment&#39;s text body. |  [optional]
**htmlBody** | **kotlin.String** | The comment&#39;s text body formatted as html. |  [optional]
**ticket** | [**java.util.UUID**](java.util.UUID.md) | The ticket associated with the comment.  |  [optional]
**isPrivate** | **kotlin.Boolean** | Whether or not the comment is internal. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



