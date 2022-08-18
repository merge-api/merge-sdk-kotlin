
# Job

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**name** | **kotlin.String** | The job&#39;s name. |  [optional]
**description** | **kotlin.String** | The job&#39;s description. |  [optional]
**code** | **kotlin.String** | The job&#39;s code. Typically an additional identifier used to reference the particular job that is displayed on the ATS. |  [optional]
**status** | [**JobStatusEnum**](JobStatusEnum.md) | The job&#39;s status. |  [optional]
**jobPostingUrls** | [**kotlin.collections.List&lt;Url&gt;**](Url.md) |  |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s job was created. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s job was updated. |  [optional]
**confidential** | **kotlin.Boolean** | Whether the job is confidential. |  [optional]
**departments** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | IDs of &#x60;Department&#x60; objects for this &#x60;Job&#x60;. |  [optional]
**offices** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | IDs of &#x60;Office&#x60; objects for this &#x60;Job&#x60;. |  [optional]
**hiringManagers** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | IDs of &#x60;RemoteUser&#x60; objects that serve as hiring managers for this &#x60;Job&#x60;. |  [optional]
**recruiters** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | IDs of &#x60;RemoteUser&#x60; objects that serve as recruiters for this &#x60;Job&#x60;. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



