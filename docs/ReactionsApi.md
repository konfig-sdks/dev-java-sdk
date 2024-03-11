# ReactionsApi

All URIs are relative to *https://dev.to/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReaction**](ReactionsApi.md#createReaction) | **POST** /api/reactions | create reaction |
| [**toggleUserReaction**](ReactionsApi.md#toggleUserReaction) | **POST** /api/reactions/toggle | toggle reaction |


<a name="createReaction"></a>
# **createReaction**
> ReactionsCreateReactionResponse createReaction(category, reactableId, reactableType).execute();

create reaction

This endpoint allows the client to create a reaction to a specified reactable (eg, Article, Comment, or User). For examples:         * \&quot;Like\&quot;ing an Article will create a new \&quot;like\&quot; Reaction from the user for that Articles         * \&quot;Like\&quot;ing that Article a second time will return the previous \&quot;like\&quot;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReactionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    String category = "like";
    Integer reactableId = 56;
    String reactableType = "Comment";
    try {
      ReactionsCreateReactionResponse result = client
              .reactions
              .createReaction(category, reactableId, reactableType)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getCategory());
      System.out.println(result.getId());
      System.out.println(result.getReactableId());
      System.out.println(result.getReactableType());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReactionsApi#createReaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReactionsCreateReactionResponse> response = client
              .reactions
              .createReaction(category, reactableId, reactableType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReactionsApi#createReaction");
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
| **category** | **String**|  | [enum: like, unicorn, exploding_head, raised_hands, fire] |
| **reactableId** | **Integer**|  | |
| **reactableType** | **String**|  | [enum: Comment, Article, User] |

### Return type

[**ReactionsCreateReactionResponse**](ReactionsCreateReactionResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

<a name="toggleUserReaction"></a>
# **toggleUserReaction**
> ReactionsToggleUserReactionResponse toggleUserReaction(category, reactableId, reactableType).execute();

toggle reaction

This endpoint allows the client to toggle the user&#39;s reaction to a specified reactable (eg, Article, Comment, or User). For examples:         * \&quot;Like\&quot;ing an Article will create a new \&quot;like\&quot; Reaction from the user for that Articles         * \&quot;Like\&quot;ing that Article a second time will remove the \&quot;like\&quot; from the user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dev;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReactionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://dev.to/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Dev client = new Dev(configuration);
    String category = "like";
    Integer reactableId = 56;
    String reactableType = "Comment";
    try {
      ReactionsToggleUserReactionResponse result = client
              .reactions
              .toggleUserReaction(category, reactableId, reactableType)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getCategory());
      System.out.println(result.getId());
      System.out.println(result.getReactableId());
      System.out.println(result.getReactableType());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReactionsApi#toggleUserReaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReactionsToggleUserReactionResponse> response = client
              .reactions
              .toggleUserReaction(category, reactableId, reactableType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReactionsApi#toggleUserReaction");
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
| **category** | **String**|  | [enum: like, unicorn, exploding_head, raised_hands, fire] |
| **reactableId** | **Integer**|  | |
| **reactableType** | **String**|  | [enum: Comment, Article, User] |

### Return type

[**ReactionsToggleUserReactionResponse**](ReactionsToggleUserReactionResponse.md)

### Authorization

[api-key](../README.md#api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

