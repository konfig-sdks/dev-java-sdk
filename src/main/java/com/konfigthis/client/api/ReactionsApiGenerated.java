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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.ReactionsCreateReactionResponse;
import com.konfigthis.client.model.ReactionsToggleUserReactionResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ReactionsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReactionsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ReactionsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getApiKey() == null) {
            throw new IllegalArgumentException("\"api-key\" is required but no API key was provided. Please set \"api-key\" with ApiClient#setApiKey(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createReactionCall(String category, Integer reactableId, String reactableType, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/reactions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (category != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("category", category));
        }

        if (reactableId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("reactable_id", reactableId));
        }

        if (reactableType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("reactable_type", reactableType));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api-key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createReactionValidateBeforeCall(String category, Integer reactableId, String reactableType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'category' is set
        if (category == null) {
            throw new ApiException("Missing the required parameter 'category' when calling createReaction(Async)");
        }

        // verify the required parameter 'reactableId' is set
        if (reactableId == null) {
            throw new ApiException("Missing the required parameter 'reactableId' when calling createReaction(Async)");
        }

        // verify the required parameter 'reactableType' is set
        if (reactableType == null) {
            throw new ApiException("Missing the required parameter 'reactableType' when calling createReaction(Async)");
        }

        return createReactionCall(category, reactableId, reactableType, _callback);

    }


    private ApiResponse<ReactionsCreateReactionResponse> createReactionWithHttpInfo(String category, Integer reactableId, String reactableType) throws ApiException {
        okhttp3.Call localVarCall = createReactionValidateBeforeCall(category, reactableId, reactableType, null);
        Type localVarReturnType = new TypeToken<ReactionsCreateReactionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createReactionAsync(String category, Integer reactableId, String reactableType, final ApiCallback<ReactionsCreateReactionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createReactionValidateBeforeCall(category, reactableId, reactableType, _callback);
        Type localVarReturnType = new TypeToken<ReactionsCreateReactionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateReactionRequestBuilder {
        private final String category;
        private final Integer reactableId;
        private final String reactableType;

        private CreateReactionRequestBuilder(String category, Integer reactableId, String reactableType) {
            this.category = category;
            this.reactableId = reactableId;
            this.reactableType = reactableType;
        }

        /**
         * Build call for createReaction
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return createReactionCall(category, reactableId, reactableType, _callback);
        }


        /**
         * Execute createReaction request
         * @return ReactionsCreateReactionResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
         </table>
         */
        public ReactionsCreateReactionResponse execute() throws ApiException {
            ApiResponse<ReactionsCreateReactionResponse> localVarResp = createReactionWithHttpInfo(category, reactableId, reactableType);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createReaction request with HTTP info returned
         * @return ApiResponse&lt;ReactionsCreateReactionResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ReactionsCreateReactionResponse> executeWithHttpInfo() throws ApiException {
            return createReactionWithHttpInfo(category, reactableId, reactableType);
        }

        /**
         * Execute createReaction request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ReactionsCreateReactionResponse> _callback) throws ApiException {
            return createReactionAsync(category, reactableId, reactableType, _callback);
        }
    }

    /**
     * create reaction
     * This endpoint allows the client to create a reaction to a specified reactable (eg, Article, Comment, or User). For examples:         * \&quot;Like\&quot;ing an Article will create a new \&quot;like\&quot; Reaction from the user for that Articles         * \&quot;Like\&quot;ing that Article a second time will return the previous \&quot;like\&quot;
     * @param category  (required)
     * @param reactableId  (required)
     * @param reactableType  (required)
     * @return CreateReactionRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
     </table>
     */
    public CreateReactionRequestBuilder createReaction(String category, Integer reactableId, String reactableType) throws IllegalArgumentException {
        if (category == null) throw new IllegalArgumentException("\"category\" is required but got null");
            

        if (reactableId == null) throw new IllegalArgumentException("\"reactableId\" is required but got null");
        if (reactableType == null) throw new IllegalArgumentException("\"reactableType\" is required but got null");
            

        return new CreateReactionRequestBuilder(category, reactableId, reactableType);
    }
    private okhttp3.Call toggleUserReactionCall(String category, Integer reactableId, String reactableType, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/reactions/toggle";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (category != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("category", category));
        }

        if (reactableId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("reactable_id", reactableId));
        }

        if (reactableType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("reactable_type", reactableType));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api-key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call toggleUserReactionValidateBeforeCall(String category, Integer reactableId, String reactableType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'category' is set
        if (category == null) {
            throw new ApiException("Missing the required parameter 'category' when calling toggleUserReaction(Async)");
        }

        // verify the required parameter 'reactableId' is set
        if (reactableId == null) {
            throw new ApiException("Missing the required parameter 'reactableId' when calling toggleUserReaction(Async)");
        }

        // verify the required parameter 'reactableType' is set
        if (reactableType == null) {
            throw new ApiException("Missing the required parameter 'reactableType' when calling toggleUserReaction(Async)");
        }

        return toggleUserReactionCall(category, reactableId, reactableType, _callback);

    }


    private ApiResponse<ReactionsToggleUserReactionResponse> toggleUserReactionWithHttpInfo(String category, Integer reactableId, String reactableType) throws ApiException {
        okhttp3.Call localVarCall = toggleUserReactionValidateBeforeCall(category, reactableId, reactableType, null);
        Type localVarReturnType = new TypeToken<ReactionsToggleUserReactionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call toggleUserReactionAsync(String category, Integer reactableId, String reactableType, final ApiCallback<ReactionsToggleUserReactionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = toggleUserReactionValidateBeforeCall(category, reactableId, reactableType, _callback);
        Type localVarReturnType = new TypeToken<ReactionsToggleUserReactionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ToggleUserReactionRequestBuilder {
        private final String category;
        private final Integer reactableId;
        private final String reactableType;

        private ToggleUserReactionRequestBuilder(String category, Integer reactableId, String reactableType) {
            this.category = category;
            this.reactableId = reactableId;
            this.reactableType = reactableType;
        }

        /**
         * Build call for toggleUserReaction
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return toggleUserReactionCall(category, reactableId, reactableType, _callback);
        }


        /**
         * Execute toggleUserReaction request
         * @return ReactionsToggleUserReactionResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
         </table>
         */
        public ReactionsToggleUserReactionResponse execute() throws ApiException {
            ApiResponse<ReactionsToggleUserReactionResponse> localVarResp = toggleUserReactionWithHttpInfo(category, reactableId, reactableType);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute toggleUserReaction request with HTTP info returned
         * @return ApiResponse&lt;ReactionsToggleUserReactionResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ReactionsToggleUserReactionResponse> executeWithHttpInfo() throws ApiException {
            return toggleUserReactionWithHttpInfo(category, reactableId, reactableType);
        }

        /**
         * Execute toggleUserReaction request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ReactionsToggleUserReactionResponse> _callback) throws ApiException {
            return toggleUserReactionAsync(category, reactableId, reactableType, _callback);
        }
    }

    /**
     * toggle reaction
     * This endpoint allows the client to toggle the user&#39;s reaction to a specified reactable (eg, Article, Comment, or User). For examples:         * \&quot;Like\&quot;ing an Article will create a new \&quot;like\&quot; Reaction from the user for that Articles         * \&quot;Like\&quot;ing that Article a second time will remove the \&quot;like\&quot; from the user
     * @param category  (required)
     * @param reactableId  (required)
     * @param reactableType  (required)
     * @return ToggleUserReactionRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
     </table>
     */
    public ToggleUserReactionRequestBuilder toggleUserReaction(String category, Integer reactableId, String reactableType) throws IllegalArgumentException {
        if (category == null) throw new IllegalArgumentException("\"category\" is required but got null");
            

        if (reactableId == null) throw new IllegalArgumentException("\"reactableId\" is required but got null");
        if (reactableType == null) throw new IllegalArgumentException("\"reactableType\" is required but got null");
            

        return new ToggleUserReactionRequestBuilder(category, reactableId, reactableType);
    }
}
