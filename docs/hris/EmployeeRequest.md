
# EmployeeRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**employeeNumber** | **kotlin.String** | The employee&#39;s number that appears in the third-party integration&#39;s UI. |  [optional]
**company** | [**java.util.UUID**](java.util.UUID.md) | The ID of the employee&#39;s company. |  [optional]
**firstName** | **kotlin.String** | The employee&#39;s first name. |  [optional]
**lastName** | **kotlin.String** | The employee&#39;s last name. |  [optional]
**displayFullName** | **kotlin.String** | The employee&#39;s full name, to use for display purposes. If a preferred first name is available, the full name will include the preferred first name. |  [optional]
**username** | **kotlin.String** | The employee&#39;s username that appears in the remote UI. |  [optional]
**groups** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]
**workEmail** | **kotlin.String** | The employee&#39;s work email. |  [optional]
**personalEmail** | **kotlin.String** | The employee&#39;s personal email. |  [optional]
**mobilePhoneNumber** | **kotlin.String** | The employee&#39;s mobile phone number. |  [optional]
**employments** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Array of &#x60;Employment&#x60; IDs for this Employee. |  [optional]
**homeLocation** | [**java.util.UUID**](java.util.UUID.md) | The employee&#39;s home address. |  [optional]
**workLocation** | [**java.util.UUID**](java.util.UUID.md) | The employee&#39;s work address. |  [optional]
**manager** | [**java.util.UUID**](java.util.UUID.md) | The employee ID of the employee&#39;s manager. |  [optional]
**team** | [**java.util.UUID**](java.util.UUID.md) | The employee&#39;s team. |  [optional]
**payGroup** | [**java.util.UUID**](java.util.UUID.md) | The employee&#39;s pay group |  [optional]
**ssn** | **kotlin.String** | The employee&#39;s social security number. |  [optional]
**gender** | [**GenderEnum**](GenderEnum.md) | The employee&#39;s gender.  * &#x60;MALE&#x60; - MALE * &#x60;FEMALE&#x60; - FEMALE * &#x60;NON-BINARY&#x60; - NON-BINARY * &#x60;OTHER&#x60; - OTHER * &#x60;PREFER_NOT_TO_DISCLOSE&#x60; - PREFER_NOT_TO_DISCLOSE |  [optional]
**ethnicity** | [**EthnicityEnum**](EthnicityEnum.md) | The employee&#39;s ethnicity.  * &#x60;AMERICAN_INDIAN_OR_ALASKA_NATIVE&#x60; - AMERICAN_INDIAN_OR_ALASKA_NATIVE * &#x60;ASIAN_OR_INDIAN_SUBCONTINENT&#x60; - ASIAN_OR_INDIAN_SUBCONTINENT * &#x60;BLACK_OR_AFRICAN_AMERICAN&#x60; - BLACK_OR_AFRICAN_AMERICAN * &#x60;HISPANIC_OR_LATINO&#x60; - HISPANIC_OR_LATINO * &#x60;NATIVE_HAWAIIAN_OR_OTHER_PACIFIC_ISLANDER&#x60; - NATIVE_HAWAIIAN_OR_OTHER_PACIFIC_ISLANDER * &#x60;TWO_OR_MORE_RACES&#x60; - TWO_OR_MORE_RACES * &#x60;WHITE&#x60; - WHITE * &#x60;PREFER_NOT_TO_DISCLOSE&#x60; - PREFER_NOT_TO_DISCLOSE |  [optional]
**maritalStatus** | [**MaritalStatusEnum**](MaritalStatusEnum.md) | The employee&#39;s filing status as related to marital status.  * &#x60;SINGLE&#x60; - SINGLE * &#x60;MARRIED_FILING_JOINTLY&#x60; - MARRIED_FILING_JOINTLY * &#x60;MARRIED_FILING_SEPARATELY&#x60; - MARRIED_FILING_SEPARATELY * &#x60;HEAD_OF_HOUSEHOLD&#x60; - HEAD_OF_HOUSEHOLD * &#x60;QUALIFYING_WIDOW_OR_WIDOWER_WITH_DEPENDENT_CHILD&#x60; - QUALIFYING_WIDOW_OR_WIDOWER_WITH_DEPENDENT_CHILD |  [optional]
**dateOfBirth** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The employee&#39;s date of birth. |  [optional]
**hireDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date that the employee was hired, usually the day that an offer letter is signed. If an employee has multiple hire dates from previous employments, this represents the most recent hire date. Note: If you&#39;re looking for the employee&#39;s start date, refer to the start_date field. |  [optional]
**startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date that the employee started working. If an employee was rehired, the most recent start date will be returned. |  [optional]
**employmentStatus** | [**EmploymentStatusEnum**](EmploymentStatusEnum.md) | The employment status of the employee.  * &#x60;ACTIVE&#x60; - ACTIVE * &#x60;PENDING&#x60; - PENDING * &#x60;INACTIVE&#x60; - INACTIVE |  [optional]
**terminationDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The employee&#39;s termination date. |  [optional]
**avatar** | [**java.net.URI**](java.net.URI.md) | The URL of the employee&#39;s avatar image. |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



