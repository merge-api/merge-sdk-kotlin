
# AccountIntegration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Company name. | 
**categories** | [**kotlin.collections.List&lt;CategoriesEnum&gt;**](CategoriesEnum.md) | Category or categories this integration belongs to. Multiple categories should be comma separated, i.e. [ats, hris]. |  [optional]
**image** | [**java.net.URI**](java.net.URI.md) | Company logo in rectangular shape. &lt;b&gt;Upload an image with a clear background.&lt;/b&gt; |  [optional]
**squareImage** | [**java.net.URI**](java.net.URI.md) | Company logo in square shape. &lt;b&gt;Upload an image with a white background.&lt;/b&gt; |  [optional]
**color** | **kotlin.String** | The color of this integration used for buttons and text throughout the app and landing pages. &lt;b&gt;Choose a darker, saturated color.&lt;/b&gt; |  [optional]
**slug** | **kotlin.String** |  |  [optional] [readonly]
**isInBeta** | **kotlin.Boolean** | If checked, this integration will not appear in the linking flow, and will appear elsewhere with a Beta tag. |  [optional]
**apiEndpointsToDocumentationUrls** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Mapping of API endpoints to documentation urls for support. Example: {&#39;GET&#39;: [[&#39;/common-model-scopes&#39;, &#39;https://docs.merge.dev/accounting/common-model-scopes/#common_model_scopes_retrieve&#39;],[&#39;/common-model-actions&#39;, &#39;https://docs.merge.dev/accounting/common-model-actions/#common_model_actions_retrieve&#39;]], &#39;POST&#39;: []} |  [optional]



