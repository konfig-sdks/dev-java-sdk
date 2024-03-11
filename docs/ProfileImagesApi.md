# ProfileImagesApi

All URIs are relative to *https://dev.to/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByUsername**](ProfileImagesApi.md#getByUsername) | **GET** /api/profile_images/{username} | A Users or organizations profile image |


<a name="getByUsername"></a>
# **getByUsername**
> List&lt;ProfileImage&gt; getByUsername(username).execute();

A Users or organizations profile image

This endpoint allows the client to retrieve a user or organization profile image information by its         corresponding username.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfileImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    String username = "janedoe"; // The parameter is the username of the user or the username of the organization.
    try {
      List<ProfileImage> result = client
              .profileImages
              .getByUsername(username)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileImagesApi#getByUsername");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ProfileImage>> response = client
              .profileImages
              .getByUsername(username)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileImagesApi#getByUsername");
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
| **username** | **String**| The parameter is the username of the user or the username of the organization. | |

### Return type

[**List&lt;ProfileImage&gt;**](ProfileImage.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An object containing profile image details |  -  |

