
# Location

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**name** | **kotlin.String** | The location&#39;s name. |  [optional]
**phoneNumber** | **kotlin.String** | The location&#39;s phone number. |  [optional]
**street1** | **kotlin.String** | Line 1 of the location&#39;s street address. |  [optional]
**street2** | **kotlin.String** | Line 2 of the location&#39;s street address. |  [optional]
**city** | **kotlin.String** | The location&#39;s city. |  [optional]
**state** | **kotlin.String** | The location&#39;s state. Represents a region if outside of the US. |  [optional]
**zipCode** | **kotlin.String** | The location&#39;s zip code or postal code. |  [optional]
**country** | [**CountryEnum**](CountryEnum.md) | The location&#39;s country. |  [optional]
**locationType** | [**LocationTypeEnum**](LocationTypeEnum.md) | The location&#39;s type. Can be either WORK or HOME |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



