
# TrackingCategory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The tracking category&#39;s name. |  [optional]
**status** | [**Status7d1Enum**](Status7d1Enum.md) | The tracking category&#39;s status.  * &#x60;ACTIVE&#x60; - ACTIVE * &#x60;ARCHIVED&#x60; - ARCHIVED |  [optional]
**categoryType** | [**CategoryTypeEnum**](CategoryTypeEnum.md) | The tracking category’s type.  * &#x60;CLASS&#x60; - CLASS * &#x60;DEPARTMENT&#x60; - DEPARTMENT |  [optional]
**parentCategory** | [**java.util.UUID**](java.util.UUID.md) | ID of the parent tracking category. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the tracking category belongs to. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



