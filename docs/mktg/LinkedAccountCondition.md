
# LinkedAccountCondition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditionSchemaId** | [**java.util.UUID**](java.util.UUID.md) | The ID indicating which condition schema to use for a specific condition. | 
**nativeName** | **kotlin.String** | User-facing *native condition* name. e.g. \&quot;Skip Manager\&quot;. | 
**&#x60;operator&#x60;** | **kotlin.String** | The operator for a specific condition. | 
**fieldName** | **kotlin.String** | The name of the field on the common model that this condition corresponds to, if they conceptually match. e.g. \&quot;location_type\&quot;. | 
**commonModel** | **kotlin.String** | The common model for a specific condition. |  [optional] [readonly]
**&#x60;value&#x60;** | [**kotlin.Any**](.md) | The value for a condition. |  [optional] [readonly]



