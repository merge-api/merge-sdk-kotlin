
# EEOC

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**candidate** | [**java.util.UUID**](java.util.UUID.md) | The candidate being represented. |  [optional]
**submittedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the information was submitted. |  [optional]
**race** | [**RaceEnum**](RaceEnum.md) | The candidate&#39;s race.  * &#x60;AMERICAN_INDIAN_OR_ALASKAN_NATIVE&#x60; - AMERICAN_INDIAN_OR_ALASKAN_NATIVE * &#x60;ASIAN&#x60; - ASIAN * &#x60;BLACK_OR_AFRICAN_AMERICAN&#x60; - BLACK_OR_AFRICAN_AMERICAN * &#x60;HISPANIC_OR_LATINO&#x60; - HISPANIC_OR_LATINO * &#x60;WHITE&#x60; - WHITE * &#x60;NATIVE_HAWAIIAN_OR_OTHER_PACIFIC_ISLANDER&#x60; - NATIVE_HAWAIIAN_OR_OTHER_PACIFIC_ISLANDER * &#x60;TWO_OR_MORE_RACES&#x60; - TWO_OR_MORE_RACES * &#x60;DECLINE_TO_SELF_IDENTIFY&#x60; - DECLINE_TO_SELF_IDENTIFY |  [optional]
**gender** | [**GenderEnum**](GenderEnum.md) | The candidate&#39;s gender.  * &#x60;MALE&#x60; - MALE * &#x60;FEMALE&#x60; - FEMALE * &#x60;NON-BINARY&#x60; - NON-BINARY * &#x60;OTHER&#x60; - OTHER * &#x60;DECLINE_TO_SELF_IDENTIFY&#x60; - DECLINE_TO_SELF_IDENTIFY |  [optional]
**veteranStatus** | [**VeteranStatusEnum**](VeteranStatusEnum.md) | The candidate&#39;s veteran status.  * &#x60;I_AM_NOT_A_PROTECTED_VETERAN&#x60; - I_AM_NOT_A_PROTECTED_VETERAN * &#x60;I_IDENTIFY_AS_ONE_OR_MORE_OF_THE_CLASSIFICATIONS_OF_A_PROTECTED_VETERAN&#x60; - I_IDENTIFY_AS_ONE_OR_MORE_OF_THE_CLASSIFICATIONS_OF_A_PROTECTED_VETERAN * &#x60;I_DONT_WISH_TO_ANSWER&#x60; - I_DONT_WISH_TO_ANSWER |  [optional]
**disabilityStatus** | [**DisabilityStatusEnum**](DisabilityStatusEnum.md) | The candidate&#39;s disability status.  * &#x60;YES_I_HAVE_A_DISABILITY_OR_PREVIOUSLY_HAD_A_DISABILITY&#x60; - YES_I_HAVE_A_DISABILITY_OR_PREVIOUSLY_HAD_A_DISABILITY * &#x60;NO_I_DONT_HAVE_A_DISABILITY&#x60; - NO_I_DONT_HAVE_A_DISABILITY * &#x60;I_DONT_WISH_TO_ANSWER&#x60; - I_DONT_WISH_TO_ANSWER |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**modifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | This is the datetime that this object was last updated by Merge |  [optional] [readonly]
**fieldMappings** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



