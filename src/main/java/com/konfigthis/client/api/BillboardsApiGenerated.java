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


import com.konfigthis.client.model.Billboard;
import com.konfigthis.client.model.BillboardsGetByIdResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class BillboardsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BillboardsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public BillboardsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call createNewBillboardCall(List<Billboard> billboard, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = billboard;

        // create path and map variables
        String localVarPath = "/api/billboards";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api-key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createNewBillboardValidateBeforeCall(List<Billboard> billboard, final ApiCallback _callback) throws ApiException {
        return createNewBillboardCall(billboard, _callback);

    }


    private ApiResponse<List<Billboard>> createNewBillboardWithHttpInfo(List<Billboard> billboard) throws ApiException {
        okhttp3.Call localVarCall = createNewBillboardValidateBeforeCall(billboard, null);
        Type localVarReturnType = new TypeToken<List<Billboard>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createNewBillboardAsync(List<Billboard> billboard, final ApiCallback<List<Billboard>> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNewBillboardValidateBeforeCall(billboard, _callback);
        Type localVarReturnType = new TypeToken<List<Billboard>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateNewBillboardRequestBuilder {
        private List<Billboard> billboard;

        private CreateNewBillboardRequestBuilder() {
        }

        /**
         * Set billboard
         * @param billboard  (optional)
         * @return CreateNewBillboardRequestBuilder
         */
        public CreateNewBillboardRequestBuilder billboard(List<Billboard> billboard) {
            this.billboard = billboard;
            return this;
        }

        /**
         * Build call for createNewBillboard
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> A billboard </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            List<Billboard> billboard = buildBodyParams();
            return createNewBillboardCall(billboard, _callback);
        }

        private List<Billboard> buildBodyParams() {
            return this.billboard;
        }

        /**
         * Execute createNewBillboard request
         * @return List&lt;Billboard&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> A billboard </td><td>  -  </td></tr>
         </table>
         */
        public List<Billboard> execute() throws ApiException {
            List<Billboard> billboard = buildBodyParams();
            ApiResponse<List<Billboard>> localVarResp = createNewBillboardWithHttpInfo(billboard);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createNewBillboard request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Billboard&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> A billboard </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Billboard>> executeWithHttpInfo() throws ApiException {
            List<Billboard> billboard = buildBodyParams();
            return createNewBillboardWithHttpInfo(billboard);
        }

        /**
         * Execute createNewBillboard request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> A billboard </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<Billboard>> _callback) throws ApiException {
            List<Billboard> billboard = buildBodyParams();
            return createNewBillboardAsync(billboard, _callback);
        }
    }

    /**
     * Create a billboard
     * This endpoint allows the client to create a new billboard.
     * @return CreateNewBillboardRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A billboard </td><td>  -  </td></tr>
     </table>
     */
    public CreateNewBillboardRequestBuilder createNewBillboard() throws IllegalArgumentException {
        return new CreateNewBillboardRequestBuilder();
    }
    private okhttp3.Call getByIdCall(Integer id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/billboards/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getByIdValidateBeforeCall(Integer id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getById(Async)");
        }

        return getByIdCall(id, _callback);

    }


    private ApiResponse<BillboardsGetByIdResponse> getByIdWithHttpInfo(Integer id) throws ApiException {
        okhttp3.Call localVarCall = getByIdValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<BillboardsGetByIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByIdAsync(Integer id, final ApiCallback<BillboardsGetByIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByIdValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<BillboardsGetByIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByIdRequestBuilder {
        private final Integer id;

        private GetByIdRequestBuilder(Integer id) {
            this.id = id;
        }

        /**
         * Build call for getById
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
            return getByIdCall(id, _callback);
        }


        /**
         * Execute getById request
         * @return BillboardsGetByIdResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
         </table>
         */
        public BillboardsGetByIdResponse execute() throws ApiException {
            ApiResponse<BillboardsGetByIdResponse> localVarResp = getByIdWithHttpInfo(id);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getById request with HTTP info returned
         * @return ApiResponse&lt;BillboardsGetByIdResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<BillboardsGetByIdResponse> executeWithHttpInfo() throws ApiException {
            return getByIdWithHttpInfo(id);
        }

        /**
         * Execute getById request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<BillboardsGetByIdResponse> _callback) throws ApiException {
            return getByIdAsync(id, _callback);
        }
    }

    /**
     * A billboard (by id)
     * This endpoint allows the client to retrieve a single billboard, via its id.
     * @param id The ID of the billboard. (required)
     * @return GetByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
     </table>
     */
    public GetByIdRequestBuilder getById(Integer id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
        return new GetByIdRequestBuilder(id);
    }
    private okhttp3.Call getListCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/billboards";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getListValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getListCall(_callback);

    }


    private ApiResponse<List<Billboard>> getListWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getListValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<Billboard>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getListAsync(final ApiCallback<List<Billboard>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getListValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<Billboard>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetListRequestBuilder {

        private GetListRequestBuilder() {
        }

        /**
         * Build call for getList
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
            return getListCall(_callback);
        }


        /**
         * Execute getList request
         * @return List&lt;Billboard&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
         </table>
         */
        public List<Billboard> execute() throws ApiException {
            ApiResponse<List<Billboard>> localVarResp = getListWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getList request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Billboard&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Billboard>> executeWithHttpInfo() throws ApiException {
            return getListWithHttpInfo();
        }

        /**
         * Execute getList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<Billboard>> _callback) throws ApiException {
            return getListAsync(_callback);
        }
    }

    /**
     * Billboards
     * This endpoint allows the client to retrieve a list of all billboards.
     * @return GetListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
     </table>
     */
    public GetListRequestBuilder getList() throws IllegalArgumentException {
        return new GetListRequestBuilder();
    }
    private okhttp3.Call unpublishBillboardCall(Integer id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/billboards/{id}/unpublish"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call unpublishBillboardValidateBeforeCall(Integer id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling unpublishBillboard(Async)");
        }

        return unpublishBillboardCall(id, _callback);

    }


    private ApiResponse<Void> unpublishBillboardWithHttpInfo(Integer id) throws ApiException {
        okhttp3.Call localVarCall = unpublishBillboardValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call unpublishBillboardAsync(Integer id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = unpublishBillboardValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class UnpublishBillboardRequestBuilder {
        private final Integer id;

        private UnpublishBillboardRequestBuilder(Integer id) {
            this.id = id;
        }

        /**
         * Build call for unpublishBillboard
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> no content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return unpublishBillboardCall(id, _callback);
        }


        /**
         * Execute unpublishBillboard request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> no content </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            unpublishBillboardWithHttpInfo(id);
        }

        /**
         * Execute unpublishBillboard request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> no content </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return unpublishBillboardWithHttpInfo(id);
        }

        /**
         * Execute unpublishBillboard request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> no content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return unpublishBillboardAsync(id, _callback);
        }
    }

    /**
     * Unpublish a billboard
     * This endpoint allows the client to remove a billboard from rotation by un-publishing it.
     * @param id The ID of the billboard to unpublish. (required)
     * @return UnpublishBillboardRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> no content </td><td>  -  </td></tr>
     </table>
     */
    public UnpublishBillboardRequestBuilder unpublishBillboard(Integer id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
        return new UnpublishBillboardRequestBuilder(id);
    }
    private okhttp3.Call updateByIdCall(Integer id, List<Billboard> billboard, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = billboard;

        // create path and map variables
        String localVarPath = "/api/billboards/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api-key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateByIdValidateBeforeCall(Integer id, List<Billboard> billboard, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateById(Async)");
        }

        return updateByIdCall(id, billboard, _callback);

    }


    private ApiResponse<List<Billboard>> updateByIdWithHttpInfo(Integer id, List<Billboard> billboard) throws ApiException {
        okhttp3.Call localVarCall = updateByIdValidateBeforeCall(id, billboard, null);
        Type localVarReturnType = new TypeToken<List<Billboard>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call updateByIdAsync(Integer id, List<Billboard> billboard, final ApiCallback<List<Billboard>> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateByIdValidateBeforeCall(id, billboard, _callback);
        Type localVarReturnType = new TypeToken<List<Billboard>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UpdateByIdRequestBuilder {
        private final Integer id;
        private List<Billboard> billboard;

        private UpdateByIdRequestBuilder(Integer id) {
            this.id = id;
        }

        /**
         * Set billboard
         * @param billboard  (optional)
         * @return UpdateByIdRequestBuilder
         */
        public UpdateByIdRequestBuilder billboard(List<Billboard> billboard) {
            this.billboard = billboard;
            return this;
        }

        /**
         * Build call for updateById
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
            List<Billboard> billboard = buildBodyParams();
            return updateByIdCall(id, billboard, _callback);
        }

        private List<Billboard> buildBodyParams() {
            return this.billboard;
        }

        /**
         * Execute updateById request
         * @return List&lt;Billboard&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
         </table>
         */
        public List<Billboard> execute() throws ApiException {
            List<Billboard> billboard = buildBodyParams();
            ApiResponse<List<Billboard>> localVarResp = updateByIdWithHttpInfo(id, billboard);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute updateById request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Billboard&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Billboard>> executeWithHttpInfo() throws ApiException {
            List<Billboard> billboard = buildBodyParams();
            return updateByIdWithHttpInfo(id, billboard);
        }

        /**
         * Execute updateById request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<Billboard>> _callback) throws ApiException {
            List<Billboard> billboard = buildBodyParams();
            return updateByIdAsync(id, billboard, _callback);
        }
    }

    /**
     * Update a billboard by ID
     * This endpoint allows the client to update the attributes of a single billboard, via its id.
     * @param id The ID of the billboard. (required)
     * @return UpdateByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
     </table>
     */
    public UpdateByIdRequestBuilder updateById(Integer id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
        return new UpdateByIdRequestBuilder(id);
    }
}
