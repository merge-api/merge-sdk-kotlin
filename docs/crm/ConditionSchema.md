
# ConditionSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) | The ID of the condition schema. This ID is used when updating selective syncs for a linked account. | 
**nativeName** | **kotlin.String** | User-facing *native condition* name. e.g. \&quot;Skip Manager\&quot;. | 
**fieldName** | **kotlin.String** | The name of the field on the common model that this condition corresponds to, if they conceptually match. e.g. \&quot;location_type\&quot;. | 
**conditionType** | [**ConditionTypeEnum**](ConditionTypeEnum.md) | The type of value(s) that can be set for this condition.  * &#x60;BOOLEAN&#x60; - BOOLEAN * &#x60;DATE&#x60; - DATE * &#x60;DATE_TIME&#x60; - DATE_TIME * &#x60;INTEGER&#x60; - INTEGER * &#x60;FLOAT&#x60; - FLOAT * &#x60;STRING&#x60; - STRING * &#x60;LIST_OF_STRINGS&#x60; - LIST_OF_STRINGS | 
**operators** | [**kotlin.collections.List&lt;OperatorSchema&gt;**](OperatorSchema.md) | The schemas for the operators that can be used on a condition. | 
**commonModel** | **kotlin.String** | The common model for which a condition schema is defined. |  [optional] [readonly]
**isUnique** | **kotlin.Boolean** | Whether this condition can only be applied once. If false, the condition can be AND&#39;d together multiple times. |  [optional]



