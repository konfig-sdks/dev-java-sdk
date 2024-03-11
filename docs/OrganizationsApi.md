# OrganizationsApi

All URIs are relative to *https://dev.to/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewOrganization**](OrganizationsApi.md#createNewOrganization) | **POST** /api/organizations | Create an Organization |
| [**deleteById**](OrganizationsApi.md#deleteById) | **DELETE** /api/organizations/{id} | Delete an Organization by id |
| [**getById**](OrganizationsApi.md#getById) | **GET** /api/organizations/{id} | An organization (by id) |
| [**getByUsername**](OrganizationsApi.md#getByUsername) | **GET** /api/organizations/{username} | An organization (by username) |
| [**listArticles**](OrganizationsApi.md#listArticles) | **GET** /api/organizations/{organization_id_or_username}/articles | Organization&#39;s Articles |
| [**listOfDev**](OrganizationsApi.md#listOfDev) | **GET** /api/organizations | Organizations |
| [**listUsers**](OrganizationsApi.md#listUsers) | **GET** /api/organizations/{organization_id_or_username}/users | Organization&#39;s users |
| [**updateById**](OrganizationsApi.md#updateById) | **PUT** /api/organizations/{id} | Update an organization by id |


<a name="createNewOrganization"></a>
# **createNewOrganization**
> OrganizationsCreateNewOrganizationResponse createNewOrganization().organization(organization).execute();

Create an Organization

This endpoint allows the client to create an organization with the provided parameters.         It requires a token from a user with &#x60;admin&#x60; privileges.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    String summary = "summary_example";
    String typeOf = "typeOf_example";
    String username = "username_example";
    String name = "name_example";
    String twitterUsername = "twitterUsername_example";
    String githubUsername = "githubUsername_example";
    String url = "url_example";
    String location = "location_example";
    String joinedAt = "joinedAt_example";
    String techStack = "techStack_example";
    String tagLine = "tagLine_example";
    String story = "story_example";
    try {
      OrganizationsCreateNewOrganizationResponse result = client
              .organizations
              .createNewOrganization()
              .summary(summary)
              .typeOf(typeOf)
              .username(username)
              .name(name)
              .twitterUsername(twitterUsername)
              .githubUsername(githubUsername)
              .url(url)
              .location(location)
              .joinedAt(joinedAt)
              .techStack(techStack)
              .tagLine(tagLine)
              .story(story)
              .execute();
      System.out.println(result);
      System.out.println(result.getSummary());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getProfileImage());
      System.out.println(result.getSlug());
      System.out.println(result.getTagLine());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#createNewOrganization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationsCreateNewOrganizationResponse> response = client
              .organizations
              .createNewOrganization()
              .summary(summary)
              .typeOf(typeOf)
              .username(username)
              .name(name)
              .twitterUsername(twitterUsername)
              .githubUsername(githubUsername)
              .url(url)
              .location(location)
              .joinedAt(joinedAt)
              .techStack(techStack)
              .tagLine(tagLine)
              .story(story)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#createNewOrganization");
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
| **organization** | [**Organization**](Organization.md)|  | [optional] |

### Return type

[**OrganizationsCreateNewOrganizationResponse**](OrganizationsCreateNewOrganizationResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful |  -  |
| **401** | Unauthorized |  -  |

<a name="deleteById"></a>
# **deleteById**
> OrganizationsDeleteByIdResponse deleteById(id).execute();

Delete an Organization by id

This endpoint allows the client to delete a single organization, specified by id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    Integer id = 1; // The ID of the organization.
    try {
      OrganizationsDeleteByIdResponse result = client
              .organizations
              .deleteById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationsDeleteByIdResponse> response = client
              .organizations
              .deleteById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#deleteById");
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
| **id** | **Integer**| The ID of the organization. | |

### Return type

[**OrganizationsDeleteByIdResponse**](OrganizationsDeleteByIdResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

<a name="getById"></a>
# **getById**
> List&lt;Organization&gt; getById(id).execute();

An organization (by id)

This endpoint allows the client to retrieve a single organization by their id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    Dev client = new Dev(configuration);
    Integer id = 56;
    try {
      List<Organization> result = client
              .organizations
              .getById(id)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Organization>> response = client
              .organizations
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#getById");
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
| **id** | **Integer**|  | |

### Return type

[**List&lt;Organization&gt;**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Organization |  -  |

<a name="getByUsername"></a>
# **getByUsername**
> List&lt;Organization&gt; getByUsername(username).execute();

An organization (by username)

This endpoint allows the client to retrieve a single organization by their username

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    Dev client = new Dev(configuration);
    String username = "username_example";
    try {
      List<Organization> result = client
              .organizations
              .getByUsername(username)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#getByUsername");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Organization>> response = client
              .organizations
              .getByUsername(username)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#getByUsername");
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
| **username** | **String**|  | |

### Return type

[**List&lt;Organization&gt;**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Organization |  -  |

<a name="listArticles"></a>
# **listArticles**
> List&lt;ArticleIndex&gt; listArticles(organizationIdOrUsername).page(page).perPage(perPage).execute();

Organization&#39;s Articles

This endpoint allows the client to retrieve a list of Articles belonging to the organization  It supports pagination, each page will contain &#x60;30&#x60; users by default.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    Dev client = new Dev(configuration);
    String organizationIdOrUsername = "organizationIdOrUsername_example";
    Integer page = 1; // Pagination page
    Integer perPage = 30; // Page size (the number of items to return per page). The default maximum value can be overridden by \"API_PER_PAGE_MAX\" environment variable.
    try {
      List<ArticleIndex> result = client
              .organizations
              .listArticles(organizationIdOrUsername)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#listArticles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ArticleIndex>> response = client
              .organizations
              .listArticles(organizationIdOrUsername)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#listArticles");
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
| **organizationIdOrUsername** | **String**|  | |
| **page** | **Integer**| Pagination page | [optional] [default to 1] |
| **perPage** | **Integer**| Page size (the number of items to return per page). The default maximum value can be overridden by \&quot;API_PER_PAGE_MAX\&quot; environment variable. | [optional] [default to 30] |

### Return type

[**List&lt;ArticleIndex&gt;**](ArticleIndex.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Organization&#39;s Articles (with ID) |  -  |

<a name="listOfDev"></a>
# **listOfDev**
> List&lt;Organization&gt; listOfDev().page(page).perPage(perPage).execute();

Organizations

This endpoint allows the client to retrieve a list of Dev organizations.    It supports pagination, each page will contain 10 tags by default.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    Dev client = new Dev(configuration);
    Integer page = 1; // Pagination page
    Integer perPage = 10; // Page size (the number of items to return per page). The default maximum value can be overridden by \"API_PER_PAGE_MAX\" environment variable.
    try {
      List<Organization> result = client
              .organizations
              .listOfDev()
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#listOfDev");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Organization>> response = client
              .organizations
              .listOfDev()
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#listOfDev");
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
| **perPage** | **Integer**| Page size (the number of items to return per page). The default maximum value can be overridden by \&quot;API_PER_PAGE_MAX\&quot; environment variable. | [optional] [default to 10] |

### Return type

[**List&lt;Organization&gt;**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of all organizations |  -  |

<a name="listUsers"></a>
# **listUsers**
> List&lt;User&gt; listUsers(organizationIdOrUsername).page(page).perPage(perPage).execute();

Organization&#39;s users

This endpoint allows the client to retrieve a list of users belonging to the organization  It supports pagination, each page will contain &#x60;30&#x60; users by default.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    Dev client = new Dev(configuration);
    String organizationIdOrUsername = "organizationIdOrUsername_example";
    Integer page = 1; // Pagination page
    Integer perPage = 30; // Page size (the number of items to return per page). The default maximum value can be overridden by \"API_PER_PAGE_MAX\" environment variable.
    try {
      List<User> result = client
              .organizations
              .listUsers(organizationIdOrUsername)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#listUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<User>> response = client
              .organizations
              .listUsers(organizationIdOrUsername)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#listUsers");
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
| **organizationIdOrUsername** | **String**|  | |
| **page** | **Integer**| Pagination page | [optional] [default to 1] |
| **perPage** | **Integer**| Page size (the number of items to return per page). The default maximum value can be overridden by \&quot;API_PER_PAGE_MAX\&quot; environment variable. | [optional] [default to 30] |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Organization&#39;s users (with ID) |  -  |

<a name="updateById"></a>
# **updateById**
> OrganizationsUpdateByIdResponse updateById(id).organization(organization).execute();

Update an organization by id

This endpoint allows the client to update an existing organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    Integer id = 123; // The ID of the organization to update.
    String summary = "summary_example";
    String typeOf = "typeOf_example";
    String username = "username_example";
    String name = "name_example";
    String twitterUsername = "twitterUsername_example";
    String githubUsername = "githubUsername_example";
    String url = "url_example";
    String location = "location_example";
    String joinedAt = "joinedAt_example";
    String techStack = "techStack_example";
    String tagLine = "tagLine_example";
    String story = "story_example";
    try {
      OrganizationsUpdateByIdResponse result = client
              .organizations
              .updateById(id)
              .summary(summary)
              .typeOf(typeOf)
              .username(username)
              .name(name)
              .twitterUsername(twitterUsername)
              .githubUsername(githubUsername)
              .url(url)
              .location(location)
              .joinedAt(joinedAt)
              .techStack(techStack)
              .tagLine(tagLine)
              .story(story)
              .execute();
      System.out.println(result);
      System.out.println(result.getSummary());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getProfileImage());
      System.out.println(result.getSlug());
      System.out.println(result.getTagLine());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationsUpdateByIdResponse> response = client
              .organizations
              .updateById(id)
              .summary(summary)
              .typeOf(typeOf)
              .username(username)
              .name(name)
              .twitterUsername(twitterUsername)
              .githubUsername(githubUsername)
              .url(url)
              .location(location)
              .joinedAt(joinedAt)
              .techStack(techStack)
              .tagLine(tagLine)
              .story(story)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#updateById");
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
| **id** | **Integer**| The ID of the organization to update. | |
| **organization** | [**Organization**](Organization.md)|  | [optional] |

### Return type

[**OrganizationsUpdateByIdResponse**](OrganizationsUpdateByIdResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Organization |  -  |

