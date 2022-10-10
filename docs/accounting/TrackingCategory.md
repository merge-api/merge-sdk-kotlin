
# TrackingCategory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**name** | **kotlin.String** | The tracking category&#39;s name. |  [optional]
**status** | [**Status7d1Enum**](Status7d1Enum.md) | The tracking category&#39;s status. |  [optional]
**categoryType** | [**CategoryTypeEnum**](CategoryTypeEnum.md) | The tracking category’s type. |  [optional]
**parentCategory** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



