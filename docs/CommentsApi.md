# CommentsApi

All URIs are relative to *https://dev.to/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllThreaded**](CommentsApi.md#getAllThreaded) | **GET** /api/comments | Comments |
| [**getThreadedComment**](CommentsApi.md#getThreadedComment) | **GET** /api/comments/{id} | Comment by id |


<a name="getAllThreaded"></a>
# **getAllThreaded**
> List&lt;Comment&gt; getAllThreaded().perPage(perPage).aId(aId).pId(pId).page(page).execute();

Comments

This endpoint allows the client to retrieve all comments belonging to an article or podcast episode as threaded conversations.  It will return the all top level comments with their nested comments as threads. See the format specification for further details.  It supports pagination, each page will contain &#x60;50&#x60; top level comments (and as many child comments they have) by default.  If the page parameter is not passed, all comments of an article or podcast will be returned. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    Dev client = new Dev(configuration);
    Integer perPage = 30; // Page size (the number of items to return per page). The default maximum value can be overridden by \"API_PER_PAGE_MAX\" environment variable.
    String aId = "321"; // Article identifier.
    String pId = "321"; // Podcast Episode identifier.
    Integer page = 1; // Pagination page
    try {
      List<Comment> result = client
              .comments
              .getAllThreaded()
              .perPage(perPage)
              .aId(aId)
              .pId(pId)
              .page(page)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#getAllThreaded");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Comment>> response = client
              .comments
              .getAllThreaded()
              .perPage(perPage)
              .aId(aId)
              .pId(pId)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#getAllThreaded");
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
| **perPage** | **Integer**| Page size (the number of items to return per page). The default maximum value can be overridden by \&quot;API_PER_PAGE_MAX\&quot; environment variable. | [optional] [default to 30] |
| **aId** | **String**| Article identifier. | [optional] |
| **pId** | **String**| Podcast Episode identifier. | [optional] |
| **page** | **Integer**| Pagination page | [optional] [default to 1] |

### Return type

[**List&lt;Comment&gt;**](Comment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A List of Comments |  -  |

<a name="getThreadedComment"></a>
# **getThreadedComment**
> CommentsGetThreadedCommentResponse getThreadedComment(id).execute();

Comment by id

This endpoint allows the client to retrieve a comment as well as his descendants comments.    It will return the required comment (the root) with its nested descendants as a thread.    See the format specification for further details.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    Dev client = new Dev(configuration);
    Integer id = 321; // Comment identifier.
    try {
      CommentsGetThreadedCommentResponse result = client
              .comments
              .getThreadedComment(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getTypeOf());
      System.out.println(result.getIdCode());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getBodyHtml());
      System.out.println(result.getUser());
      System.out.println(result.getChildren());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#getThreadedComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommentsGetThreadedCommentResponse> response = client
              .comments
              .getThreadedComment(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#getThreadedComment");
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
| **id** | **Integer**| Comment identifier. | |

### Return type

[**CommentsGetThreadedCommentResponse**](CommentsGetThreadedCommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A List of the Comments |  -  |

