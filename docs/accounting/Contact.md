
# Contact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**name** | **kotlin.String** | The contact&#39;s name. |  [optional]
**isSupplier** | **kotlin.Boolean** | Whether the contact is a supplier. |  [optional]
**isCustomer** | **kotlin.Boolean** | Whether the contact is a customer. |  [optional]
**emailAddress** | **kotlin.String** | The contact&#39;s email address. |  [optional]
**taxNumber** | **kotlin.String** | The contact&#39;s tax number. |  [optional]
**status** | [**Status7d1Enum**](Status7d1Enum.md) | The contact&#39;s status |  [optional]
**currency** | **kotlin.String** | The currency the contact&#39;s transactions are in. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s contact was updated. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the contact belongs to. |  [optional]
**addresses** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | &#x60;Address&#x60; object IDs for the given &#x60;Contacts&#x60; object. |  [optional]
**phoneNumbers** | [**kotlin.collections.List&lt;AccountingPhoneNumber&gt;**](AccountingPhoneNumber.md) | &#x60;AccountingPhoneNumber&#x60; object for the given &#x60;Contacts&#x60; object. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



