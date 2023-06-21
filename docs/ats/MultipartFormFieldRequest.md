
# MultipartFormFieldRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the form field | 
**&#x60;data&#x60;** | **kotlin.String** | The data for the form field. | 
**encoding** | [**EncodingEnum**](EncodingEnum.md) | The encoding of the value of &#x60;data&#x60;. Defaults to &#x60;RAW&#x60; if not defined.  * &#x60;RAW&#x60; - RAW * &#x60;BASE64&#x60; - BASE64 * &#x60;GZIP_BASE64&#x60; - GZIP_BASE64 |  [optional]
**fileName** | **kotlin.String** | The file name of the form field, if the field is for a file. |  [optional]
**contentType** | **kotlin.String** | The MIME type of the file, if the field is for a file. |  [optional]



