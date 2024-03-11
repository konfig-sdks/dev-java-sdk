# PagesApi

All URIs are relative to *https://dev.to/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewPage**](PagesApi.md#createNewPage) | **POST** /api/pages | pages |
| [**getDetails**](PagesApi.md#getDetails) | **GET** /api/pages/{id} | show details for a page |
| [**listAllDetails**](PagesApi.md#listAllDetails) | **GET** /api/pages | show details for all pages |
| [**removePageById**](PagesApi.md#removePageById) | **DELETE** /api/pages/{id} | remove a page |
| [**updatePageDetails**](PagesApi.md#updatePageDetails) | **PUT** /api/pages/{id} | update details for a page |


<a name="createNewPage"></a>
# **createNewPage**
> PagesCreateNewPageResponse createNewPage().pagesCreateNewPageRequest(pagesCreateNewPageRequest).execute();

pages

This endpoint allows the client to create a new page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    String title = "title_example"; // Title of the page
    String description = "description_example"; // For internal use, helps similar pages from one another
    String slug = "slug_example"; // Used to link to this page in URLs, must be unique and URL-safe
    String bodyMarkdown = "bodyMarkdown_example"; // The text (in markdown) of the ad (required)
    String bodyJson = "bodyJson_example"; // For JSON pages, the JSON body
    Boolean isTopLevelPath = true; // If true, the page is available at '/{slug}' instead of '/page/{slug}', use with caution
    String template = "contained"; // Controls what kind of layout the page is rendered in
    try {
      PagesCreateNewPageResponse result = client
              .pages
              .createNewPage()
              .title(title)
              .description(description)
              .slug(slug)
              .bodyMarkdown(bodyMarkdown)
              .bodyJson(bodyJson)
              .isTopLevelPath(isTopLevelPath)
              .template(template)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getSlug());
      System.out.println(result.getIsTopLevelPath());
      System.out.println(result.getLandingPage());
      System.out.println(result.getBodyHtml());
      System.out.println(result.getBodyJson());
      System.out.println(result.getBodyMarkdown());
      System.out.println(result.getProcessedHtml());
      System.out.println(result.getSocialImage());
      System.out.println(result.getTemplate());
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesApi#createNewPage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagesCreateNewPageResponse> response = client
              .pages
              .createNewPage()
              .title(title)
              .description(description)
              .slug(slug)
              .bodyMarkdown(bodyMarkdown)
              .bodyJson(bodyJson)
              .isTopLevelPath(isTopLevelPath)
              .template(template)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesApi#createNewPage");
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
| **pagesCreateNewPageRequest** | [**PagesCreateNewPageRequest**](PagesCreateNewPageRequest.md)|  | [optional] |

### Return type

[**PagesCreateNewPageResponse**](PagesCreateNewPageResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

<a name="getDetails"></a>
# **getDetails**
> Page getDetails(id).execute();

show details for a page

This endpoint allows the client to retrieve details for a single Page object, specified by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    Dev client = new Dev(configuration);
    Integer id = 1; // The ID of the page.
    try {
      Page result = client
              .pages
              .getDetails(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getSlug());
      System.out.println(result.getBodyMarkdown());
      System.out.println(result.getBodyJson());
      System.out.println(result.getIsTopLevelPath());
      System.out.println(result.getSocialImage());
      System.out.println(result.getTemplate());
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Page> response = client
              .pages
              .getDetails(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesApi#getDetails");
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
| **id** | **Integer**| The ID of the page. | |

### Return type

[**Page**](Page.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

<a name="listAllDetails"></a>
# **listAllDetails**
> List&lt;Page&gt; listAllDetails().execute();

show details for all pages

This endpoint allows the client to retrieve details for all Page objects.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    Dev client = new Dev(configuration);
    try {
      List<Page> result = client
              .pages
              .listAllDetails()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesApi#listAllDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Page>> response = client
              .pages
              .listAllDetails()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesApi#listAllDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Page&gt;**](Page.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

<a name="removePageById"></a>
# **removePageById**
> Page removePageById(id).execute();

remove a page

This endpoint allows the client to delete a single Page object, specified by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    Integer id = 1; // The ID of the page.
    try {
      Page result = client
              .pages
              .removePageById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getSlug());
      System.out.println(result.getBodyMarkdown());
      System.out.println(result.getBodyJson());
      System.out.println(result.getIsTopLevelPath());
      System.out.println(result.getSocialImage());
      System.out.println(result.getTemplate());
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesApi#removePageById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Page> response = client
              .pages
              .removePageById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesApi#removePageById");
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
| **id** | **Integer**| The ID of the page. | |

### Return type

[**Page**](Page.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

<a name="updatePageDetails"></a>
# **updatePageDetails**
> Page updatePageDetails(id).page(page).execute();

update details for a page

This endpoint allows the client to retrieve details for a single Page object, specified by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    String title = "title_example"; // Title of the page
    String description = "description_example"; // For internal use, helps similar pages from one another
    String slug = "slug_example"; // Used to link to this page in URLs, must be unique and URL-safe
    String template = "contained"; // Controls what kind of layout the page is rendered in
    Integer id = 1; // The ID of the page.
    String bodyMarkdown = "bodyMarkdown_example"; // The text (in markdown) of the ad (required)
    String bodyJson = "bodyJson_example"; // For JSON pages, the JSON body
    Boolean isTopLevelPath = true; // If true, the page is available at '/{slug}' instead of '/page/{slug}', use with caution
    Object socialImage = null;
    try {
      Page result = client
              .pages
              .updatePageDetails(title, description, slug, template, id)
              .bodyMarkdown(bodyMarkdown)
              .bodyJson(bodyJson)
              .isTopLevelPath(isTopLevelPath)
              .socialImage(socialImage)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getSlug());
      System.out.println(result.getBodyMarkdown());
      System.out.println(result.getBodyJson());
      System.out.println(result.getIsTopLevelPath());
      System.out.println(result.getSocialImage());
      System.out.println(result.getTemplate());
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesApi#updatePageDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Page> response = client
              .pages
              .updatePageDetails(title, description, slug, template, id)
              .bodyMarkdown(bodyMarkdown)
              .bodyJson(bodyJson)
              .isTopLevelPath(isTopLevelPath)
              .socialImage(socialImage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesApi#updatePageDetails");
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
| **id** | **Integer**| The ID of the page. | |
| **page** | [**Page**](Page.md)|  | [optional] |

### Return type

[**Page**](Page.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

