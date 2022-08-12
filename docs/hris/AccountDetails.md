
# AccountDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**integration** | **kotlin.String** |  |  [optional] [readonly]
**integrationSlug** | **kotlin.String** |  |  [optional] [readonly]
**category** | [**CategoryEnum**](CategoryEnum.md) |  |  [optional]
**endUserOriginId** | **kotlin.String** |  |  [optional] [readonly]
**endUserOrganizationName** | **kotlin.String** |  |  [optional] [readonly]
**endUserEmailAddress** | **kotlin.String** |  |  [optional] [readonly]
**status** | **kotlin.String** |  |  [optional] [readonly]
**webhookListenerUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional] [readonly]
**isDuplicate** | **kotlin.Boolean** | Whether a Production Linked Account&#39;s credentials match another existing Production Linked Account. This field is &#x60;null&#x60; for Test Linked Accounts, incomplete Production Linked Accounts, and ignored duplicate Production Linked Account sets. |  [optional] [readonly]



