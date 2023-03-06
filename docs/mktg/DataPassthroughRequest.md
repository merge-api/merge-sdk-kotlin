
# DataPassthroughRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**method** | [**MethodEnum**](MethodEnum.md) |  | 
**path** | **kotlin.String** |  | 
**baseUrlOverride** | **kotlin.String** |  |  [optional]
**&#x60;data&#x60;** | **kotlin.String** |  |  [optional]
**multipartFormData** | [**kotlin.collections.List&lt;MultipartFormFieldRequest&gt;**](MultipartFormFieldRequest.md) | Pass an array of &#x60;MultipartFormField&#x60; objects in here instead of using the &#x60;data&#x60; param if &#x60;request_format&#x60; is set to &#x60;MULTIPART&#x60;. |  [optional]
**headers** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | The headers to use for the request (Merge will handle the account&#39;s authorization headers). &#x60;Content-Type&#x60; header is required for passthrough. Choose content type corresponding to expected format of receiving server. |  [optional]
**requestFormat** | [**RequestFormatEnum**](RequestFormatEnum.md) |  |  [optional]
**normalizeResponse** | **kotlin.Boolean** | Optional. If true, the response will always be an object of the form &#x60;{\&quot;type\&quot;: T, \&quot;value\&quot;: ...}&#x60; where &#x60;T&#x60; will be one of &#x60;string, boolean, number, null, array, object&#x60;. |  [optional]



