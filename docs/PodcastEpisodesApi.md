# PodcastEpisodesApi

All URIs are relative to *https://dev.to/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listByDescendingPublicationDate**](PodcastEpisodesApi.md#listByDescendingPublicationDate) | **GET** /api/podcast_episodes | Podcast Episodes |


<a name="listByDescendingPublicationDate"></a>
# **listByDescendingPublicationDate**
> List&lt;PodcastEpisodeIndex&gt; listByDescendingPublicationDate().page(page).perPage(perPage).username(username).execute();

Podcast Episodes

This endpoint allows the client to retrieve a list of podcast episodes.         \&quot;Podcast episodes\&quot; are episodes belonging to podcasts.         It will only return active (reachable) podcast episodes that belong to published podcasts available on the platform, ordered by descending publication date.         It supports pagination, each page will contain 30 articles by default.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PodcastEpisodesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    Dev client = new Dev(configuration);
    Integer page = 1; // Pagination page
    Integer perPage = 30; // Page size (the number of items to return per page). The default maximum value can be overridden by \"API_PER_PAGE_MAX\" environment variable.
    String username = "codenewbie"; // Using this parameter will retrieve episodes belonging to a specific podcast.
    try {
      List<PodcastEpisodeIndex> result = client
              .podcastEpisodes
              .listByDescendingPublicationDate()
              .page(page)
              .perPage(perPage)
              .username(username)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PodcastEpisodesApi#listByDescendingPublicationDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PodcastEpisodeIndex>> response = client
              .podcastEpisodes
              .listByDescendingPublicationDate()
              .page(page)
              .perPage(perPage)
              .username(username)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PodcastEpisodesApi#listByDescendingPublicationDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Pagination page | [optional] [default to 1] |
| **perPage** | **Integer**| Page size (the number of items to return per page). The default maximum value can be overridden by \&quot;API_PER_PAGE_MAX\&quot; environment variable. | [optional] [default to 30] |
| **username** | **String**| Using this parameter will retrieve episodes belonging to a specific podcast. | [optional] |

### Return type

[**List&lt;PodcastEpisodeIndex&gt;**](PodcastEpisodeIndex.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A List of Podcast episodes filtered by username |  -  |

