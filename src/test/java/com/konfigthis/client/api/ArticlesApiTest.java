/*
 * Forem API V1
 * Access Forem articles, users and other resources via API.         For a real-world example of Forem in action, check out [DEV](https://www.dev.to).         All endpoints can be accessed with the 'api-key' header and a accept header, but         some of them are accessible publicly without authentication.          Dates and date times, unless otherwise specified, must be in         the [RFC 3339](https://tools.ietf.org/html/rfc3339) format.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.Article;
import com.konfigthis.client.model.ArticleArticle;
import com.konfigthis.client.model.ArticleIndex;
import com.konfigthis.client.model.ArticlesCreateNewArticleResponse;
import com.konfigthis.client.model.ArticlesUpdateByIdResponse;
import com.konfigthis.client.model.VideoArticle;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ArticlesApi
 */
@Disabled
public class ArticlesApiTest {

    private static ArticlesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ArticlesApi(apiClient);
    }

    /**
     * Publish article
     *
     * This endpoint allows the client to create a new article.  \&quot;Articles\&quot; are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewArticleTest() throws ApiException {
        ArticleArticle article = null;
        ArticlesCreateNewArticleResponse response = api.createNewArticle()
                .article(article)
                .execute();
        // TODO: test validations
    }

    /**
     * User&#39;s all articles
     *
     * This endpoint allows the client to retrieve a list of all articles on behalf of an authenticated user.  \&quot;Articles\&quot; are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.  It will return both published and unpublished articles with pagination.  Unpublished articles will be at the top of the list in reverse chronological creation order. Published articles will follow in reverse chronological publication order.  By default a page will contain 30 articles.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllUserArticlesTest() throws ApiException {
        Integer page = null;
        Integer perPage = null;
        List<ArticleIndex> response = api.getAllUserArticles()
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * Published article by id
     *
     * This endpoint allows the client to retrieve a single published article given its &#x60;id&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        Integer id = null;
        List<ArticleIndex> response = api.getById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Published article by path
     *
     * This endpoint allows the client to retrieve a single published article given its &#x60;path&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByPathTest() throws ApiException {
        String username = null;
        String slug = null;
        List<ArticleIndex> response = api.getByPath(username, slug)
                .execute();
        // TODO: test validations
    }

    /**
     * User&#39;s articles
     *
     * This endpoint allows the client to retrieve a list of published articles on behalf of an authenticated user.  \&quot;Articles\&quot; are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.  Published articles will be in reverse chronological publication order.  It will return published articles with pagination. By default a page will contain 30 articles.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPublishedListTest() throws ApiException {
        Integer page = null;
        Integer perPage = null;
        List<ArticleIndex> response = api.getPublishedList()
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * User&#39;s published articles
     *
     * This endpoint allows the client to retrieve a list of published articles on behalf of an authenticated user.  \&quot;Articles\&quot; are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.  Published articles will be in reverse chronological publication order.  It will return published articles with pagination. By default a page will contain 30 articles.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPublishedList_0Test() throws ApiException {
        Integer page = null;
        Integer perPage = null;
        List<ArticleIndex> response = api.getPublishedList_0()
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * User&#39;s unpublished articles
     *
     * This endpoint allows the client to retrieve a list of unpublished articles on behalf of an authenticated user.  \&quot;Articles\&quot; are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.  Unpublished articles will be in reverse chronological creation order.  It will return unpublished articles with pagination. By default a page will contain 30 articles.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUnpublishedListTest() throws ApiException {
        Integer page = null;
        Integer perPage = null;
        List<ArticleIndex> response = api.getUnpublishedList()
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * Organization&#39;s Articles
     *
     * This endpoint allows the client to retrieve a list of Articles belonging to the organization  It supports pagination, each page will contain &#x60;30&#x60; users by default.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listArticlesTest() throws ApiException {
        String organizationIdOrUsername = null;
        Integer page = null;
        Integer perPage = null;
        List<ArticleIndex> response = api.listArticles(organizationIdOrUsername)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * Articles with a video
     *
     * This endpoint allows the client to retrieve a list of articles that are uploaded with a video.  It will only return published video articles ordered by descending popularity.  It supports pagination, each page will contain 24 articles by default.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listByPopularityTest() throws ApiException {
        Integer page = null;
        Integer perPage = null;
        List<VideoArticle> response = api.listByPopularity()
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * Published articles sorted by published date
     *
     * This endpoint allows the client to retrieve a list of articles. ordered by descending publish date.  It supports pagination, each page will contain 30 articles by default.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listLatestPublishedTest() throws ApiException {
        Integer page = null;
        Integer perPage = null;
        List<ArticleIndex> response = api.listLatestPublished()
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * Published articles
     *
     * This endpoint allows the client to retrieve a list of articles.  \&quot;Articles\&quot; are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.  By default it will return featured, published articles ordered by descending popularity.  It supports pagination, each page will contain &#x60;30&#x60; articles by default.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPublishedArticlesTest() throws ApiException {
        Integer page = null;
        Integer perPage = null;
        String tag = null;
        String tags = null;
        String tagsExclude = null;
        String username = null;
        String state = null;
        Integer top = null;
        Integer collectionId = null;
        List<ArticleIndex> response = api.listPublishedArticles()
                .page(page)
                .perPage(perPage)
                .tag(tag)
                .tags(tags)
                .tagsExclude(tagsExclude)
                .username(username)
                .state(state)
                .top(top)
                .collectionId(collectionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Unpublish an article
     *
     * This endpoint allows the client to unpublish an article.  The user associated with the API key must have any &#39;admin&#39; or &#39;moderator&#39; role.  The article will be unpublished and will no longer be visible to the public. It will remain in the database and will set back to draft status on the author&#39;s posts dashboard. Any notifications associated with the article will be deleted. Any comments on the article will remain.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unpublishByIdTest() throws ApiException {
        Integer id = null;
        String note = null;
        api.unpublishById(id)
                .note(note)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an article by id
     *
     * This endpoint allows the client to update an existing article.  \&quot;Articles\&quot; are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByIdTest() throws ApiException {
        Integer id = null;
        ArticleArticle article = null;
        ArticlesUpdateByIdResponse response = api.updateById(id)
                .article(article)
                .execute();
        // TODO: test validations
    }

}