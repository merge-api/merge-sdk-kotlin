
# Group

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**parentGroup** | [**java.util.UUID**](java.util.UUID.md) | The parent group for this group. |  [optional]
**name** | **kotlin.String** | The group name. |  [optional]
**type** | [**GroupTypeEnum**](GroupTypeEnum.md) | The group type |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



