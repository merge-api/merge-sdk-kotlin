
# ScheduledInterviewRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application** | [**java.util.UUID**](java.util.UUID.md) | The application being interviewed. |  [optional]
**jobInterviewStage** | [**java.util.UUID**](java.util.UUID.md) | The stage of the interview. |  [optional]
**organizer** | [**java.util.UUID**](java.util.UUID.md) | The user organizing the interview. |  [optional]
**interviewers** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Array of &#x60;RemoteUser&#x60; IDs. |  [optional]
**location** | **kotlin.String** | The interview&#39;s location. |  [optional]
**startAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the interview was started. |  [optional]
**endAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the interview was ended. |  [optional]
**status** | [**ScheduledInterviewStatusEnum**](ScheduledInterviewStatusEnum.md) | The interview&#39;s status.  * &#x60;SCHEDULED&#x60; - SCHEDULED * &#x60;AWAITING_FEEDBACK&#x60; - AWAITING_FEEDBACK * &#x60;COMPLETE&#x60; - COMPLETE |  [optional]
**integrationParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**linkedAccountParams** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



