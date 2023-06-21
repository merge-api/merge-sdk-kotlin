
# AssociationType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceObjectClass** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**targetObjectClasses** | [**kotlin.collections.List&lt;AssociationSubType&gt;**](AssociationSubType.md) |  |  [optional] [readonly]
**remoteKeyName** | **kotlin.String** |  |  [optional]
**displayName** | **kotlin.String** |  |  [optional]
**cardinality** | [**CardinalityEnum**](CardinalityEnum.md) |  |  [optional]
**isRequired** | **kotlin.Boolean** |  |  [optional]
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]



