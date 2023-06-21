
# JobInterviewStage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**name** | **kotlin.String** | Standard stage names are offered by ATS systems but can be modified by users. |  [optional]
**job** | [**java.util.UUID**](java.util.UUID.md) | This field is populated only if the stage is specific to a particular job. If the stage is generic, this field will not be populated. |  [optional]
**stageOrder** | **kotlin.Int** | The stage’s order, with the lowest values ordered first. If the third-party does not return details on the order of stages, this field will not be populated. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



