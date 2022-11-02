
# ConditionSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) | The ID of the condition schema. This ID is used when updating selective syncs for a linked account. | 
**nativeName** | **kotlin.String** | User-facing *native condition* name. e.g. \&quot;Skip Manager\&quot;. | 
**fieldName** | **kotlin.String** | The name of the field on the common model that this condition corresponds to, if they conceptually match. e.g. \&quot;location_type\&quot;. | 
**conditionType** | [**ConditionTypeEnum**](ConditionTypeEnum.md) |  | 
**operators** | [**kotlin.collections.List&lt;OperatorSchema&gt;**](OperatorSchema.md) | The schemas for the operators that can be used on a condition. | 
**commonModel** | **kotlin.String** | The common model for which a condition schema is defined. |  [optional] [readonly]
**isUnique** | **kotlin.Boolean** | Whether this condition can only be applied once. If false, the condition can be AND&#39;d together multiple times. |  [optional]



