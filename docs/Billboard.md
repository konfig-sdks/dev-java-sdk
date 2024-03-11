

# Billboard

Billboard, aka Widget, ex. Display Ad

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The ID of the Billboard |  [optional] |
|**name** | **String** | For internal use, helps distinguish ads from one another |  |
|**bodyMarkdown** | **String** | The text (in markdown) of the ad (required) |  |
|**approved** | **Boolean** | Ad must be both published and approved to be in rotation |  [optional] |
|**published** | **Boolean** | Ad must be both published and approved to be in rotation |  [optional] |
|**organizationId** | **Integer** | Identifies the organization to which the ad belongs |  [optional] |
|**creatorId** | **Integer** | Identifies the user who created the ad. |  [optional] |
|**placementArea** | [**PlacementAreaEnum**](#PlacementAreaEnum) | Identifies which area of site layout the ad can appear in |  |
|**tagList** | **String** | Tags on which this ad can be displayed (blank is all/any tags) |  [optional] |
|**excludeArticleIds** | **String** | Articles this ad should *not* appear on (blank means no articles are disallowed, and this ad can appear next to any/all articles). Comma-separated list of integer Article IDs |  [optional] |
|**audienceSegmentId** | **Integer** | Specifies a specific audience segment who will see this billboard |  [optional] |
|**audienceSegmentType** | [**AudienceSegmentTypeEnum**](#AudienceSegmentTypeEnum) | Specifies a group of users who will see this billboard (must match audience_segment_id if both provided) |  [optional] |
|**targetGeolocations** | **List&lt;String&gt;** | Locations to show this billboard in (blank means it will be shown in all locations). Specified as a comma-separated list or array of ISO 3166-2 country and optionally region codes) |  [optional] |
|**displayTo** | [**DisplayToEnum**](#DisplayToEnum) | Potentially limits visitors to whom the ad is visible |  [optional] |
|**typeOf** | [**TypeOfEnum**](#TypeOfEnum) | Types of the billboards: in_house (created by admins), community (created by an entity, appears on entity&#39;s content), external ( created by an entity, or a non-entity, can appear everywhere)  |  [optional] |



## Enum: PlacementAreaEnum

| Name | Value |
|---- | -----|
| SIDEBAR_LEFT | &quot;sidebar_left&quot; |
| SIDEBAR_LEFT_2 | &quot;sidebar_left_2&quot; |
| SIDEBAR_RIGHT | &quot;sidebar_right&quot; |
| FEED_FIRST | &quot;feed_first&quot; |
| FEED_SECOND | &quot;feed_second&quot; |
| FEED_THIRD | &quot;feed_third&quot; |
| HOME_HERO | &quot;home_hero&quot; |
| POST_SIDEBAR | &quot;post_sidebar&quot; |
| POST_COMMENTS | &quot;post_comments&quot; |



## Enum: AudienceSegmentTypeEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;manual&quot; |
| TRUSTED | &quot;trusted&quot; |
| POSTED | &quot;posted&quot; |
| NO_POSTS_YET | &quot;no_posts_yet&quot; |
| DARK_THEME | &quot;dark_theme&quot; |
| LIGHT_THEME | &quot;light_theme&quot; |
| NO_EXPERIENCE | &quot;no_experience&quot; |
| EXPERIENCE1 | &quot;experience1&quot; |
| EXPERIENCE2 | &quot;experience2&quot; |
| EXPERIENCE3 | &quot;experience3&quot; |
| EXPERIENCE4 | &quot;experience4&quot; |
| EXPERIENCE5 | &quot;experience5&quot; |



## Enum: DisplayToEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| LOGGED_IN | &quot;logged_in&quot; |
| LOGGED_OUT | &quot;logged_out&quot; |



## Enum: TypeOfEnum

| Name | Value |
|---- | -----|
| IN_HOUSE | &quot;in_house&quot; |
| COMMUNITY | &quot;community&quot; |
| EXTERNAL | &quot;external&quot; |



