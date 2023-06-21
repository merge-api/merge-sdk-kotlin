
# Issue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errorDescription** | **kotlin.String** |  | 
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**status** | [**IssueStatusEnum**](IssueStatusEnum.md) | Status of the issue. Options: (&#39;ONGOING&#39;, &#39;RESOLVED&#39;)  * &#x60;ONGOING&#x60; - ONGOING * &#x60;RESOLVED&#x60; - RESOLVED |  [optional]
**endUser** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] [readonly]
**firstIncidentTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**lastIncidentTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**isMuted** | **kotlin.Boolean** |  |  [optional] [readonly]
**errorDetails** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] [readonly]



