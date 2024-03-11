# SegmentsApi

All URIs are relative to *https://dev.to/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addUsersToSegment**](SegmentsApi.md#addUsersToSegment) | **PUT** /api/segments/{id}/add_users | Add users to a manually managed audience segment |
| [**createManuallyManagedSegment**](SegmentsApi.md#createManuallyManagedSegment) | **POST** /api/segments | Create a manually managed audience segment |
| [**deleteManuallyManagedSegment**](SegmentsApi.md#deleteManuallyManagedSegment) | **DELETE** /api/segments/{id} | Delete a manually managed audience segment |
| [**getById**](SegmentsApi.md#getById) | **GET** /api/segments/{id} | A manually managed audience segment |
| [**getUserListInSegment**](SegmentsApi.md#getUserListInSegment) | **GET** /api/segments/{id}/users | Users in a manually managed audience segment |
| [**listAudienceSegments**](SegmentsApi.md#listAudienceSegments) | **GET** /api/segments | Manually managed audience segments |
| [**removeUsersFromSegment**](SegmentsApi.md#removeUsersFromSegment) | **PUT** /api/segments/{id}/remove_users | Remove users from a manually managed audience segment |


<a name="addUsersToSegment"></a>
# **addUsersToSegment**
> SegmentsAddUsersToSegmentResponse addUsersToSegment(id).segmentUserIds(segmentUserIds).execute();

Add users to a manually managed audience segment

This endpoint allows the client to add users in bulk to an audience segment specified by ID.  Successes are users that were included in the segment (even if they were already in it), and failures are users that could not be added to the segment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SegmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    Integer id = 56;
    List<Integer> userIds = Arrays.asList();
    try {
      SegmentsAddUsersToSegmentResponse result = client
              .segments
              .addUsersToSegment(id)
              .userIds(userIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getSucceeded());
      System.out.println(result.getFailed());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#addUsersToSegment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SegmentsAddUsersToSegmentResponse> response = client
              .segments
              .addUsersToSegment(id)
              .userIds(userIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#addUsersToSegment");
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
| **segmentUserIds** | [**SegmentUserIds**](SegmentUserIds.md)|  | [optional] |

### Return type

[**SegmentsAddUsersToSegmentResponse**](SegmentsAddUsersToSegmentResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Result of adding the users to the segment. |  -  |

<a name="createManuallyManagedSegment"></a>
# **createManuallyManagedSegment**
> SegmentsCreateManuallyManagedSegmentResponse createManuallyManagedSegment().execute();

Create a manually managed audience segment

This endpoint allows the client to create a new audience segment.  An audience segment is a group of users that can be targeted by a Billboard. This API only permits managing segments you create and maintain yourself.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SegmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    try {
      SegmentsCreateManuallyManagedSegmentResponse result = client
              .segments
              .createManuallyManagedSegment()
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getTypeOf());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#createManuallyManagedSegment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SegmentsCreateManuallyManagedSegmentResponse> response = client
              .segments
              .createManuallyManagedSegment()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#createManuallyManagedSegment");
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

[**SegmentsCreateManuallyManagedSegmentResponse**](SegmentsCreateManuallyManagedSegmentResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A manually managed audience segment |  -  |

<a name="deleteManuallyManagedSegment"></a>
# **deleteManuallyManagedSegment**
> SegmentsDeleteManuallyManagedSegmentResponse deleteManuallyManagedSegment(id).execute();

Delete a manually managed audience segment

This endpoint allows the client to delete an audience segment specified by ID.  Audience segments cannot be deleted if there are still any Billboards using them.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SegmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    Integer id = 56;
    try {
      SegmentsDeleteManuallyManagedSegmentResponse result = client
              .segments
              .deleteManuallyManagedSegment(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getTypeOf());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#deleteManuallyManagedSegment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SegmentsDeleteManuallyManagedSegmentResponse> response = client
              .segments
              .deleteManuallyManagedSegment(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#deleteManuallyManagedSegment");
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

[**SegmentsDeleteManuallyManagedSegmentResponse**](SegmentsDeleteManuallyManagedSegmentResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The deleted audience segment |  -  |

<a name="getById"></a>
# **getById**
> List&lt;Segment&gt; getById(id).execute();

A manually managed audience segment

This endpoint allows the client to retrieve a single manually-managed audience segment specified by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SegmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    Integer id = 56;
    try {
      List<Segment> result = client
              .segments
              .getById(id)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Segment>> response = client
              .segments
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#getById");
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

[**List&lt;Segment&gt;**](Segment.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The audience segment |  -  |

<a name="getUserListInSegment"></a>
# **getUserListInSegment**
> List&lt;User&gt; getUserListInSegment(id).perPage(perPage).execute();

Users in a manually managed audience segment

This endpoint allows the client to retrieve a list of the users in an audience segment specified by ID. The endpoint supports pagination, and each page will contain &#x60;30&#x60; users by default.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SegmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    Integer id = 56;
    Integer perPage = 30; // Page size (the number of items to return per page). The default maximum value can be overridden by \"API_PER_PAGE_MAX\" environment variable.
    try {
      List<User> result = client
              .segments
              .getUserListInSegment(id)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#getUserListInSegment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<User>> response = client
              .segments
              .getUserListInSegment(id)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#getUserListInSegment");
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
| **perPage** | **Integer**| Page size (the number of items to return per page). The default maximum value can be overridden by \&quot;API_PER_PAGE_MAX\&quot; environment variable. | [optional] [default to 30] |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A List of users in the audience segment |  -  |

<a name="listAudienceSegments"></a>
# **listAudienceSegments**
> List&lt;Segment&gt; listAudienceSegments().perPage(perPage).execute();

Manually managed audience segments

This endpoint allows the client to retrieve a list of audience segments.  An audience segment is a group of users that can be targeted by a Billboard. This API only permits managing segments you create and maintain yourself.  The endpoint supports pagination, and each page will contain &#x60;30&#x60; segments by default.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SegmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    Integer perPage = 30; // Page size (the number of items to return per page). The default maximum value can be overridden by \"API_PER_PAGE_MAX\" environment variable.
    try {
      List<Segment> result = client
              .segments
              .listAudienceSegments()
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#listAudienceSegments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Segment>> response = client
              .segments
              .listAudienceSegments()
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#listAudienceSegments");
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

### Return type

[**List&lt;Segment&gt;**](Segment.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A List of manually managed audience segments |  -  |

<a name="removeUsersFromSegment"></a>
# **removeUsersFromSegment**
> SegmentsRemoveUsersFromSegmentResponse removeUsersFromSegment(id).segmentUserIds(segmentUserIds).execute();

Remove users from a manually managed audience segment

This endpoint allows the client to remove users in bulk from an audience segment specified by ID.  Successes are users that were removed; failures are users that weren&#39;t a part of the segment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SegmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    Integer id = 56;
    List<Integer> userIds = Arrays.asList();
    try {
      SegmentsRemoveUsersFromSegmentResponse result = client
              .segments
              .removeUsersFromSegment(id)
              .userIds(userIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getSucceeded());
      System.out.println(result.getFailed());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#removeUsersFromSegment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SegmentsRemoveUsersFromSegmentResponse> response = client
              .segments
              .removeUsersFromSegment(id)
              .userIds(userIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#removeUsersFromSegment");
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
| **segmentUserIds** | [**SegmentUserIds**](SegmentUserIds.md)|  | [optional] |

### Return type

[**SegmentsRemoveUsersFromSegmentResponse**](SegmentsRemoveUsersFromSegmentResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Result of removing the users to the segment. |  -  |

