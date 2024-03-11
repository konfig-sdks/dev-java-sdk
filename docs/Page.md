

# Page

Representation of a page object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Title of the page |  |
|**description** | **String** | For internal use, helps similar pages from one another |  |
|**slug** | **String** | Used to link to this page in URLs, must be unique and URL-safe |  |
|**bodyMarkdown** | **String** | The text (in markdown) of the ad (required) |  [optional] |
|**bodyJson** | **String** | For JSON pages, the JSON body |  [optional] |
|**isTopLevelPath** | **Boolean** | If true, the page is available at &#39;/{slug}&#39; instead of &#39;/page/{slug}&#39;, use with caution |  [optional] |
|**socialImage** | **Object** |  |  [optional] |
|**template** | [**TemplateEnum**](#TemplateEnum) | Controls what kind of layout the page is rendered in |  |



## Enum: TemplateEnum

| Name | Value |
|---- | -----|
| CONTAINED | &quot;contained&quot; |
| FULL_WITHIN_LAYOUT | &quot;full_within_layout&quot; |
| NAV_BAR_INCLUDED | &quot;nav_bar_included&quot; |
| JSON | &quot;json&quot; |



