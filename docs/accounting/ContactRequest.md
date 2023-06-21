
# ContactRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The contact&#39;s name. |  [optional]
**isSupplier** | **kotlin.Boolean** | Whether the contact is a supplier. |  [optional]
**isCustomer** | **kotlin.Boolean** | Whether the contact is a customer. |  [optional]
**emailAddress** | **kotlin.String** | The contact&#39;s email address. |  [optional]
**taxNumber** | **kotlin.String** | The contact&#39;s tax number. |  [optional]
**status** | [**Status7d1Enum**](Status7d1Enum.md) | The contact&#39;s status  * &#x60;ACTIVE&#x60; - ACTIVE * &#x60;ARCHIVED&#x60; - ARCHIVED |  [optional]
**currency** | **kotlin.String** | The currency the contact&#39;s transactions are in. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The company the contact belongs to. |  [optional]
**addresses** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | &#x60;Address&#x60; object IDs for the given &#x60;Contacts&#x60; object. |  [optional]
**phoneNumbers** | [**kotlin.collections.List&lt;AccountingPhoneNumberRequest&gt;**](AccountingPhoneNumberRequest.md) | &#x60;AccountingPhoneNumber&#x60; object for the given &#x60;Contacts&#x60; object. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



