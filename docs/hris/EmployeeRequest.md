
# EmployeeRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**employeeNumber** | **kotlin.String** | The employee&#39;s number that appears in the remote UI. Note: This is distinct from the remote_id field, which is a unique identifier for the employee set by the remote API, and is not exposed to the user. This value can also change in many API providers. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**firstName** | **kotlin.String** | The employee&#39;s first name. |  [optional]
**lastName** | **kotlin.String** | The employee&#39;s last name. |  [optional]
**displayFullName** | **kotlin.String** | The employee&#39;s full name, to use for display purposes. If a preferred first name is available, the full name will include the preferred first name. |  [optional]
**username** | **kotlin.String** | The employee&#39;s username that appears in the remote UI. |  [optional]
**groups** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**workEmail** | **kotlin.String** | The employee&#39;s work email. |  [optional]
**personalEmail** | **kotlin.String** | The employee&#39;s personal email. |  [optional]
**mobilePhoneNumber** | **kotlin.String** | The employee&#39;s mobile phone number. |  [optional]
**employments** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Array of &#x60;Employment&#x60; IDs for this Employee. |  [optional]
**homeLocation** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**workLocation** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**manager** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**team** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**payGroup** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**ssn** | **kotlin.String** | The employee&#39;s social security number. |  [optional]
**gender** | [**GenderEnum**](GenderEnum.md) | The employee&#39;s gender. |  [optional]
**ethnicity** | [**EthnicityEnum**](EthnicityEnum.md) | The employee&#39;s ethnicity. |  [optional]
**maritalStatus** | [**MaritalStatusEnum**](MaritalStatusEnum.md) | The employee&#39;s marital status. |  [optional]
**dateOfBirth** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The employee&#39;s date of birth. |  [optional]
**hireDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date that the employee was hired, usually the day that an offer letter is signed. If an employee has multiple hire dates from previous employments, this represents the most recent hire date. Note: If you&#39;re looking for the employee&#39;s start date, refer to the start_date field. |  [optional]
**startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date that the employee started working. If an employee has multiple start dates from previous employments, this represents the most recent start date. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s employee was created. |  [optional]
**employmentStatus** | [**EmploymentStatusEnum**](EmploymentStatusEnum.md) | The employment status of the employee. |  [optional]
**terminationDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The employee&#39;s termination date. |  [optional]
**avatar** | [**java.net.URI**](java.net.URI.md) | The URL of the employee&#39;s avatar image. |  [optional]
**customFields** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Custom fields configured for a given model. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



