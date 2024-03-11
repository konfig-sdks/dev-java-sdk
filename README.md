<div align="left">

[![Visit Dev](./header.png)](https://dev.to)

# [Dev](https://dev.to)

Access Forem articles, users and other resources via API.
        For a real-world example of Forem in action, check out [DEV](https://www.dev.to).
        All endpoints can be accessed with the 'api-key' header and a accept header, but
        some of them are accessible publicly without authentication.

        Dates and date times, unless otherwise specified, must be in
        the [RFC 3339](https://tools.ietf.org/html/rfc3339) format.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=DEV&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>dev-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:dev-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/dev-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ArticlesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    ArticleArticle article = new ArticleArticle();
    try {
      ArticlesCreateNewArticleResponse result = client
              .articles
              .createNewArticle()
              .article(article)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getTypeOf());
      System.out.println(result.getId());
      System.out.println(result.getReadablePublishDate());
      System.out.println(result.getSlug());
      System.out.println(result.getPath());
      System.out.println(result.getUrl());
      System.out.println(result.getCommentsCount());
      System.out.println(result.getPublicReactionsCount());
      System.out.println(result.getCollectionId());
      System.out.println(result.getPublishedTimestamp());
      System.out.println(result.getPositiveReactionsCount());
      System.out.println(result.getCoverImage());
      System.out.println(result.getSocialImage());
      System.out.println(result.getCanonicalUrl());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getEditedAt());
      System.out.println(result.getCrosspostedAt());
      System.out.println(result.getPublishedAt());
      System.out.println(result.getLastCommentAt());
      System.out.println(result.getReadingTimeMinutes());
      System.out.println(result.getTagList());
      System.out.println(result.getBodyHtml());
      System.out.println(result.getBodyMarkdown());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling ArticlesApi#createNewArticle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ArticlesCreateNewArticleResponse> response = client
              .articles
              .createNewArticle()
              .article(article)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ArticlesApi#createNewArticle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://dev.to/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ArticlesApi* | [**createNewArticle**](docs/ArticlesApi.md#createNewArticle) | **POST** /api/articles | Publish article
*ArticlesApi* | [**getAllUserArticles**](docs/ArticlesApi.md#getAllUserArticles) | **GET** /api/articles/me/all | User&#39;s all articles
*ArticlesApi* | [**getById**](docs/ArticlesApi.md#getById) | **GET** /api/articles/{id} | Published article by id
*ArticlesApi* | [**getByPath**](docs/ArticlesApi.md#getByPath) | **GET** /api/articles/{username}/{slug} | Published article by path
*ArticlesApi* | [**getPublishedList**](docs/ArticlesApi.md#getPublishedList) | **GET** /api/articles/me | User&#39;s articles
*ArticlesApi* | [**getPublishedList_0**](docs/ArticlesApi.md#getPublishedList_0) | **GET** /api/articles/me/published | User&#39;s published articles
*ArticlesApi* | [**getUnpublishedList**](docs/ArticlesApi.md#getUnpublishedList) | **GET** /api/articles/me/unpublished | User&#39;s unpublished articles
*ArticlesApi* | [**listArticles**](docs/ArticlesApi.md#listArticles) | **GET** /api/organizations/{organization_id_or_username}/articles | Organization&#39;s Articles
*ArticlesApi* | [**listByPopularity**](docs/ArticlesApi.md#listByPopularity) | **GET** /api/videos | Articles with a video
*ArticlesApi* | [**listLatestPublished**](docs/ArticlesApi.md#listLatestPublished) | **GET** /api/articles/latest | Published articles sorted by published date
*ArticlesApi* | [**listPublishedArticles**](docs/ArticlesApi.md#listPublishedArticles) | **GET** /api/articles | Published articles
*ArticlesApi* | [**unpublishById**](docs/ArticlesApi.md#unpublishById) | **PUT** /api/articles/{id}/unpublish | Unpublish an article
*ArticlesApi* | [**updateById**](docs/ArticlesApi.md#updateById) | **PUT** /api/articles/{id} | Update an article by id
*BillboardsApi* | [**createNewBillboard**](docs/BillboardsApi.md#createNewBillboard) | **POST** /api/billboards | Create a billboard
*BillboardsApi* | [**getById**](docs/BillboardsApi.md#getById) | **GET** /api/billboards/{id} | A billboard (by id)
*BillboardsApi* | [**getList**](docs/BillboardsApi.md#getList) | **GET** /api/billboards | Billboards
*BillboardsApi* | [**unpublishBillboard**](docs/BillboardsApi.md#unpublishBillboard) | **PUT** /api/billboards/{id}/unpublish | Unpublish a billboard
*BillboardsApi* | [**updateById**](docs/BillboardsApi.md#updateById) | **PUT** /api/billboards/{id} | Update a billboard by ID
*CommentsApi* | [**getAllThreaded**](docs/CommentsApi.md#getAllThreaded) | **GET** /api/comments | Comments
*CommentsApi* | [**getThreadedComment**](docs/CommentsApi.md#getThreadedComment) | **GET** /api/comments/{id} | Comment by id
*FollowedTagsApi* | [**getTagList**](docs/FollowedTagsApi.md#getTagList) | **GET** /api/follows/tags | Followed Tags
*FollowersApi* | [**getList**](docs/FollowersApi.md#getList) | **GET** /api/followers/users | Followers
*OrganizationsApi* | [**createNewOrganization**](docs/OrganizationsApi.md#createNewOrganization) | **POST** /api/organizations | Create an Organization
*OrganizationsApi* | [**deleteById**](docs/OrganizationsApi.md#deleteById) | **DELETE** /api/organizations/{id} | Delete an Organization by id
*OrganizationsApi* | [**getById**](docs/OrganizationsApi.md#getById) | **GET** /api/organizations/{id} | An organization (by id)
*OrganizationsApi* | [**getByUsername**](docs/OrganizationsApi.md#getByUsername) | **GET** /api/organizations/{username} | An organization (by username)
*OrganizationsApi* | [**listArticles**](docs/OrganizationsApi.md#listArticles) | **GET** /api/organizations/{organization_id_or_username}/articles | Organization&#39;s Articles
*OrganizationsApi* | [**listOfDev**](docs/OrganizationsApi.md#listOfDev) | **GET** /api/organizations | Organizations
*OrganizationsApi* | [**listUsers**](docs/OrganizationsApi.md#listUsers) | **GET** /api/organizations/{organization_id_or_username}/users | Organization&#39;s users
*OrganizationsApi* | [**updateById**](docs/OrganizationsApi.md#updateById) | **PUT** /api/organizations/{id} | Update an organization by id
*PagesApi* | [**createNewPage**](docs/PagesApi.md#createNewPage) | **POST** /api/pages | pages
*PagesApi* | [**getDetails**](docs/PagesApi.md#getDetails) | **GET** /api/pages/{id} | show details for a page
*PagesApi* | [**listAllDetails**](docs/PagesApi.md#listAllDetails) | **GET** /api/pages | show details for all pages
*PagesApi* | [**removePageById**](docs/PagesApi.md#removePageById) | **DELETE** /api/pages/{id} | remove a page
*PagesApi* | [**updatePageDetails**](docs/PagesApi.md#updatePageDetails) | **PUT** /api/pages/{id} | update details for a page
*PodcastEpisodesApi* | [**listByDescendingPublicationDate**](docs/PodcastEpisodesApi.md#listByDescendingPublicationDate) | **GET** /api/podcast_episodes | Podcast Episodes
*ProfileImagesApi* | [**getByUsername**](docs/ProfileImagesApi.md#getByUsername) | **GET** /api/profile_images/{username} | A Users or organizations profile image
*ReactionsApi* | [**createReaction**](docs/ReactionsApi.md#createReaction) | **POST** /api/reactions | create reaction
*ReactionsApi* | [**toggleUserReaction**](docs/ReactionsApi.md#toggleUserReaction) | **POST** /api/reactions/toggle | toggle reaction
*ReadinglistApi* | [**getUserReadinglist**](docs/ReadinglistApi.md#getUserReadinglist) | **GET** /api/readinglist | Readinglist
*SegmentsApi* | [**addUsersToSegment**](docs/SegmentsApi.md#addUsersToSegment) | **PUT** /api/segments/{id}/add_users | Add users to a manually managed audience segment
*SegmentsApi* | [**createManuallyManagedSegment**](docs/SegmentsApi.md#createManuallyManagedSegment) | **POST** /api/segments | Create a manually managed audience segment
*SegmentsApi* | [**deleteManuallyManagedSegment**](docs/SegmentsApi.md#deleteManuallyManagedSegment) | **DELETE** /api/segments/{id} | Delete a manually managed audience segment
*SegmentsApi* | [**getById**](docs/SegmentsApi.md#getById) | **GET** /api/segments/{id} | A manually managed audience segment
*SegmentsApi* | [**getUserListInSegment**](docs/SegmentsApi.md#getUserListInSegment) | **GET** /api/segments/{id}/users | Users in a manually managed audience segment
*SegmentsApi* | [**listAudienceSegments**](docs/SegmentsApi.md#listAudienceSegments) | **GET** /api/segments | Manually managed audience segments
*SegmentsApi* | [**removeUsersFromSegment**](docs/SegmentsApi.md#removeUsersFromSegment) | **PUT** /api/segments/{id}/remove_users | Remove users from a manually managed audience segment
*TagsApi* | [**getTagList**](docs/TagsApi.md#getTagList) | **GET** /api/follows/tags | Followed Tags
*TagsApi* | [**listByPopularity**](docs/TagsApi.md#listByPopularity) | **GET** /api/tags | Tags
*UsersApi* | [**addLimitedRole**](docs/UsersApi.md#addLimitedRole) | **PUT** /api/users/{id}/limited | Add limited role for a User
*UsersApi* | [**addTrustedRole**](docs/UsersApi.md#addTrustedRole) | **PUT** /api/users/{id}/trusted | Add trusted role for a User
*UsersApi* | [**assignSpamRole**](docs/UsersApi.md#assignSpamRole) | **PUT** /api/users/{id}/spam | Add spam role for a User
*UsersApi* | [**getAllUserArticles**](docs/UsersApi.md#getAllUserArticles) | **GET** /api/articles/me/all | User&#39;s all articles
*UsersApi* | [**getByIdOrUsername**](docs/UsersApi.md#getByIdOrUsername) | **GET** /api/users/{id} | A User
*UsersApi* | [**getInformation**](docs/UsersApi.md#getInformation) | **GET** /api/users/me | The authenticated user
*UsersApi* | [**getPublishedList**](docs/UsersApi.md#getPublishedList) | **GET** /api/articles/me | User&#39;s articles
*UsersApi* | [**getPublishedList_0**](docs/UsersApi.md#getPublishedList_0) | **GET** /api/articles/me/published | User&#39;s published articles
*UsersApi* | [**getUnpublishedList**](docs/UsersApi.md#getUnpublishedList) | **GET** /api/articles/me/unpublished | User&#39;s unpublished articles
*UsersApi* | [**inviteUser**](docs/UsersApi.md#inviteUser) | **POST** /api/admin/users | Invite a User
*UsersApi* | [**listUsers**](docs/UsersApi.md#listUsers) | **GET** /api/organizations/{organization_id_or_username}/users | Organization&#39;s users
*UsersApi* | [**removeLimits**](docs/UsersApi.md#removeLimits) | **DELETE** /api/users/{id}/limited | Remove limited for a User
*UsersApi* | [**removeSpamRole**](docs/UsersApi.md#removeSpamRole) | **DELETE** /api/users/{id}/spam | Remove spam role from a User
*UsersApi* | [**removeTrustedRole**](docs/UsersApi.md#removeTrustedRole) | **DELETE** /api/users/{id}/trusted | Remove trusted role from a User
*UsersApi* | [**suspendUser**](docs/UsersApi.md#suspendUser) | **PUT** /api/users/{id}/suspend | Suspend a User
*UsersApi* | [**unpublishUserArticlesAndComments**](docs/UsersApi.md#unpublishUserArticlesAndComments) | **PUT** /api/users/{id}/unpublish | Unpublish a User&#39;s Articles and Comments
*VideosApi* | [**listByPopularity**](docs/VideosApi.md#listByPopularity) | **GET** /api/videos | Articles with a video


## Documentation for Models

 - [Article](docs/Article.md)
 - [ArticleArticle](docs/ArticleArticle.md)
 - [ArticleFlareTag](docs/ArticleFlareTag.md)
 - [ArticleIndex](docs/ArticleIndex.md)
 - [ArticlesCreateNewArticleResponse](docs/ArticlesCreateNewArticleResponse.md)
 - [ArticlesCreateNewArticleResponseUser](docs/ArticlesCreateNewArticleResponseUser.md)
 - [ArticlesUpdateByIdResponse](docs/ArticlesUpdateByIdResponse.md)
 - [ArticlesUpdateByIdResponseUser](docs/ArticlesUpdateByIdResponseUser.md)
 - [Billboard](docs/Billboard.md)
 - [BillboardsGetByIdResponse](docs/BillboardsGetByIdResponse.md)
 - [Comment](docs/Comment.md)
 - [CommentsGetThreadedCommentResponse](docs/CommentsGetThreadedCommentResponse.md)
 - [CommentsGetThreadedCommentResponseUser](docs/CommentsGetThreadedCommentResponseUser.md)
 - [ExtendedUser](docs/ExtendedUser.md)
 - [FollowedTag](docs/FollowedTag.md)
 - [FollowersGetListResponseInner](docs/FollowersGetListResponseInner.md)
 - [MyUser](docs/MyUser.md)
 - [Organization](docs/Organization.md)
 - [OrganizationsCreateNewOrganizationResponse](docs/OrganizationsCreateNewOrganizationResponse.md)
 - [OrganizationsDeleteByIdResponse](docs/OrganizationsDeleteByIdResponse.md)
 - [OrganizationsUpdateByIdResponse](docs/OrganizationsUpdateByIdResponse.md)
 - [Page](docs/Page.md)
 - [PagesCreateNewPageRequest](docs/PagesCreateNewPageRequest.md)
 - [PagesCreateNewPageResponse](docs/PagesCreateNewPageResponse.md)
 - [PagesCreateNewPageResponseSocialImage](docs/PagesCreateNewPageResponseSocialImage.md)
 - [PodcastEpisodeIndex](docs/PodcastEpisodeIndex.md)
 - [ProfileImage](docs/ProfileImage.md)
 - [ReactionsCreateReactionResponse](docs/ReactionsCreateReactionResponse.md)
 - [ReactionsToggleUserReactionResponse](docs/ReactionsToggleUserReactionResponse.md)
 - [Segment](docs/Segment.md)
 - [SegmentUserIds](docs/SegmentUserIds.md)
 - [SegmentsAddUsersToSegmentResponse](docs/SegmentsAddUsersToSegmentResponse.md)
 - [SegmentsCreateManuallyManagedSegmentResponse](docs/SegmentsCreateManuallyManagedSegmentResponse.md)
 - [SegmentsDeleteManuallyManagedSegmentResponse](docs/SegmentsDeleteManuallyManagedSegmentResponse.md)
 - [SegmentsRemoveUsersFromSegmentResponse](docs/SegmentsRemoveUsersFromSegmentResponse.md)
 - [SharedOrganization](docs/SharedOrganization.md)
 - [SharedPodcast](docs/SharedPodcast.md)
 - [SharedUser](docs/SharedUser.md)
 - [Tag](docs/Tag.md)
 - [User](docs/User.md)
 - [UserInviteParam](docs/UserInviteParam.md)
 - [VideoArticle](docs/VideoArticle.md)
 - [VideoArticleUser](docs/VideoArticleUser.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
