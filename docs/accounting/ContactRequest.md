
# ContactRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**name** | **kotlin.String** | The contact&#39;s name. |  [optional]
**isSupplier** | **kotlin.Boolean** | Whether the contact is a supplier. |  [optional]
**isCustomer** | **kotlin.Boolean** | Whether the contact is a customer. |  [optional]
**emailAddress** | **kotlin.String** | The contact&#39;s email address. |  [optional]
**taxNumber** | **kotlin.String** | The contact&#39;s tax number. |  [optional]
**status** | [**Status7d1Enum**](Status7d1Enum.md) | The contact&#39;s status |  [optional]
**currency** | **kotlin.String** | The currency the contact&#39;s transactions are in. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s contact was updated. |  [optional]
**addresses** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | &#x60;Address&#x60; object IDs for the given &#x60;Contacts&#x60; object. |  [optional]
**phoneNumbers** | [**kotlin.collections.List&lt;AccountingPhoneNumberRequest&gt;**](AccountingPhoneNumberRequest.md) | &#x60;AccountingPhoneNumber&#x60; object for the given &#x60;Contacts&#x60; object. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



