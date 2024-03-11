# BillboardsApi

All URIs are relative to *https://dev.to/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewBillboard**](BillboardsApi.md#createNewBillboard) | **POST** /api/billboards | Create a billboard |
| [**getById**](BillboardsApi.md#getById) | **GET** /api/billboards/{id} | A billboard (by id) |
| [**getList**](BillboardsApi.md#getList) | **GET** /api/billboards | Billboards |
| [**unpublishBillboard**](BillboardsApi.md#unpublishBillboard) | **PUT** /api/billboards/{id}/unpublish | Unpublish a billboard |
| [**updateById**](BillboardsApi.md#updateById) | **PUT** /api/billboards/{id} | Update a billboard by ID |


<a name="createNewBillboard"></a>
# **createNewBillboard**
> List&lt;Billboard&gt; createNewBillboard().billboard(billboard).execute();

Create a billboard

This endpoint allows the client to create a new billboard.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BillboardsApi;
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
      List<Billboard> result = client
              .billboards
              .createNewBillboard()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillboardsApi#createNewBillboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Billboard>> response = client
              .billboards
              .createNewBillboard()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BillboardsApi#createNewBillboard");
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
| **billboard** | [**List&lt;Billboard&gt;**](Billboard.md)|  | [optional] |

### Return type

[**List&lt;Billboard&gt;**](Billboard.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A billboard |  -  |

<a name="getById"></a>
# **getById**
> BillboardsGetByIdResponse getById(id).execute();

A billboard (by id)

This endpoint allows the client to retrieve a single billboard, via its id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BillboardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    Integer id = 123; // The ID of the billboard.
    try {
      BillboardsGetByIdResponse result = client
              .billboards
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getApproved());
      System.out.println(result.getAudienceSegmentId());
      System.out.println(result.getBodyMarkdown());
      System.out.println(result.getCachedTagList());
      System.out.println(result.getClicksCount());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatorId());
      System.out.println(result.getCustomDisplayLabel());
      System.out.println(result.getDisplayTo());
      System.out.println(result.getExcludeArticleIds());
      System.out.println(result.getImpressionsCount());
      System.out.println(result.getName());
      System.out.println(result.getOrganizationId());
      System.out.println(result.getPlacementArea());
      System.out.println(result.getPriority());
      System.out.println(result.getProcessedHtml());
      System.out.println(result.getPublished());
      System.out.println(result.getRenderMode());
      System.out.println(result.getSuccessRate());
      System.out.println(result.getTemplate());
      System.out.println(result.getTypeOf());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getWeight());
      System.out.println(result.getAudienceSegmentType());
      System.out.println(result.getTagList());
      System.out.println(result.getTargetGeolocations());
    } catch (ApiException e) {
      System.err.println("Exception when calling BillboardsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BillboardsGetByIdResponse> response = client
              .billboards
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BillboardsApi#getById");
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
| **id** | **Integer**| The ID of the billboard. | |

### Return type

[**BillboardsGetByIdResponse**](BillboardsGetByIdResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

<a name="getList"></a>
# **getList**
> List&lt;Billboard&gt; getList().execute();

Billboards

This endpoint allows the client to retrieve a list of all billboards.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BillboardsApi;
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
      List<Billboard> result = client
              .billboards
              .getList()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillboardsApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Billboard>> response = client
              .billboards
              .getList()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BillboardsApi#getList");
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

[**List&lt;Billboard&gt;**](Billboard.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

<a name="unpublishBillboard"></a>
# **unpublishBillboard**
> unpublishBillboard(id).execute();

Unpublish a billboard

This endpoint allows the client to remove a billboard from rotation by un-publishing it.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BillboardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    Integer id = 123; // The ID of the billboard to unpublish.
    try {
      client
              .billboards
              .unpublishBillboard(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BillboardsApi#unpublishBillboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .billboards
              .unpublishBillboard(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BillboardsApi#unpublishBillboard");
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
| **id** | **Integer**| The ID of the billboard to unpublish. | |

### Return type

null (empty response body)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no content |  -  |

<a name="updateById"></a>
# **updateById**
> List&lt;Billboard&gt; updateById(id).billboard(billboard).execute();

Update a billboard by ID

This endpoint allows the client to update the attributes of a single billboard, via its id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BillboardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    Integer id = 123; // The ID of the billboard.
    try {
      List<Billboard> result = client
              .billboards
              .updateById(id)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillboardsApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Billboard>> response = client
              .billboards
              .updateById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BillboardsApi#updateById");
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
| **id** | **Integer**| The ID of the billboard. | |
| **billboard** | [**List&lt;Billboard&gt;**](Billboard.md)|  | [optional] |

### Return type

[**List&lt;Billboard&gt;**](Billboard.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

