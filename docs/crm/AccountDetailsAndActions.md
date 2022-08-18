
# AccountDetailsAndActions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  | 
**status** | [**AccountDetailsAndActionsStatusEnum**](AccountDetailsAndActionsStatusEnum.md) |  | 
**endUserOrganizationName** | **kotlin.String** |  | 
**endUserEmailAddress** | **kotlin.String** |  | 
**webhookListenerUrl** | **kotlin.String** |  | 
**category** | [**CategoryEnum**](CategoryEnum.md) |  |  [optional]
**statusDetail** | **kotlin.String** |  |  [optional]
**endUserOriginId** | **kotlin.String** |  |  [optional]
**isDuplicate** | **kotlin.Boolean** | Whether a Production Linked Account&#39;s credentials match another existing Production Linked Account. This field is &#x60;null&#x60; for Test Linked Accounts, incomplete Production Linked Accounts, and ignored duplicate Production Linked Account sets. |  [optional]
**integration** | [**AccountDetailsAndActionsIntegration**](AccountDetailsAndActionsIntegration.md) |  |  [optional]



