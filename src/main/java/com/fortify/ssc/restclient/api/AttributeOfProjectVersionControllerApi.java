/*
 * Fortify Software Security Center API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1:18.20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.fortify.ssc.restclient.api;

import com.fortify.ssc.restclient.ApiCallback;
import com.fortify.ssc.restclient.ApiClient;
import com.fortify.ssc.restclient.ApiException;
import com.fortify.ssc.restclient.ApiResponse;
import com.fortify.ssc.restclient.Configuration;
import com.fortify.ssc.restclient.Pair;
import com.fortify.ssc.restclient.ProgressRequestBody;
import com.fortify.ssc.restclient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.fortify.ssc.restclient.model.ApiResult;
import com.fortify.ssc.restclient.model.ApiResultAttribute;
import com.fortify.ssc.restclient.model.ApiResultListAttribute;
import com.fortify.ssc.restclient.model.Attribute;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttributeOfProjectVersionControllerApi {
    private ApiClient apiClient;

    public AttributeOfProjectVersionControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AttributeOfProjectVersionControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createAttributeOfProjectVersion
     * @param parentId parentId (required)
     * @param resource resource (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createAttributeOfProjectVersionCall(Long parentId, Attribute resource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = resource;

        // create path and map variables
        String localVarPath = "/projectVersions/{parentId}/attributes"
            .replaceAll("\\{" + "parentId" + "\\}", apiClient.escapeString(parentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "FortifyToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createAttributeOfProjectVersionValidateBeforeCall(Long parentId, Attribute resource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'parentId' is set
        if (parentId == null) {
            throw new ApiException("Missing the required parameter 'parentId' when calling createAttributeOfProjectVersion(Async)");
        }
        
        // verify the required parameter 'resource' is set
        if (resource == null) {
            throw new ApiException("Missing the required parameter 'resource' when calling createAttributeOfProjectVersion(Async)");
        }
        

        com.squareup.okhttp.Call call = createAttributeOfProjectVersionCall(parentId, resource, progressListener, progressRequestListener);
        return call;

    }

    /**
     * create
     * 
     * @param parentId parentId (required)
     * @param resource resource (required)
     * @return ApiResultAttribute
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultAttribute createAttributeOfProjectVersion(Long parentId, Attribute resource) throws ApiException {
        ApiResponse<ApiResultAttribute> resp = createAttributeOfProjectVersionWithHttpInfo(parentId, resource);
        return resp.getData();
    }

    /**
     * create
     * 
     * @param parentId parentId (required)
     * @param resource resource (required)
     * @return ApiResponse&lt;ApiResultAttribute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultAttribute> createAttributeOfProjectVersionWithHttpInfo(Long parentId, Attribute resource) throws ApiException {
        com.squareup.okhttp.Call call = createAttributeOfProjectVersionValidateBeforeCall(parentId, resource, null, null);
        Type localVarReturnType = new TypeToken<ApiResultAttribute>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * create (asynchronously)
     * 
     * @param parentId parentId (required)
     * @param resource resource (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAttributeOfProjectVersionAsync(Long parentId, Attribute resource, final ApiCallback<ApiResultAttribute> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createAttributeOfProjectVersionValidateBeforeCall(parentId, resource, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultAttribute>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listAttributeOfProjectVersion
     * @param parentId parentId (required)
     * @param fields Output fields (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listAttributeOfProjectVersionCall(Long parentId, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projectVersions/{parentId}/attributes"
            .replaceAll("\\{" + "parentId" + "\\}", apiClient.escapeString(parentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "FortifyToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listAttributeOfProjectVersionValidateBeforeCall(Long parentId, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'parentId' is set
        if (parentId == null) {
            throw new ApiException("Missing the required parameter 'parentId' when calling listAttributeOfProjectVersion(Async)");
        }
        

        com.squareup.okhttp.Call call = listAttributeOfProjectVersionCall(parentId, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * list
     * 
     * @param parentId parentId (required)
     * @param fields Output fields (optional)
     * @return ApiResultListAttribute
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultListAttribute listAttributeOfProjectVersion(Long parentId, String fields) throws ApiException {
        ApiResponse<ApiResultListAttribute> resp = listAttributeOfProjectVersionWithHttpInfo(parentId, fields);
        return resp.getData();
    }

    /**
     * list
     * 
     * @param parentId parentId (required)
     * @param fields Output fields (optional)
     * @return ApiResponse&lt;ApiResultListAttribute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultListAttribute> listAttributeOfProjectVersionWithHttpInfo(Long parentId, String fields) throws ApiException {
        com.squareup.okhttp.Call call = listAttributeOfProjectVersionValidateBeforeCall(parentId, fields, null, null);
        Type localVarReturnType = new TypeToken<ApiResultListAttribute>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * list (asynchronously)
     * 
     * @param parentId parentId (required)
     * @param fields Output fields (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAttributeOfProjectVersionAsync(Long parentId, String fields, final ApiCallback<ApiResultListAttribute> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listAttributeOfProjectVersionValidateBeforeCall(parentId, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultListAttribute>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readAttributeOfProjectVersion
     * @param parentId parentId (required)
     * @param id id (required)
     * @param fields Output fields (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readAttributeOfProjectVersionCall(Long parentId, Long id, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projectVersions/{parentId}/attributes/{id}"
            .replaceAll("\\{" + "parentId" + "\\}", apiClient.escapeString(parentId.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "FortifyToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call readAttributeOfProjectVersionValidateBeforeCall(Long parentId, Long id, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'parentId' is set
        if (parentId == null) {
            throw new ApiException("Missing the required parameter 'parentId' when calling readAttributeOfProjectVersion(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling readAttributeOfProjectVersion(Async)");
        }
        

        com.squareup.okhttp.Call call = readAttributeOfProjectVersionCall(parentId, id, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * read
     * 
     * @param parentId parentId (required)
     * @param id id (required)
     * @param fields Output fields (optional)
     * @return ApiResultAttribute
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultAttribute readAttributeOfProjectVersion(Long parentId, Long id, String fields) throws ApiException {
        ApiResponse<ApiResultAttribute> resp = readAttributeOfProjectVersionWithHttpInfo(parentId, id, fields);
        return resp.getData();
    }

    /**
     * read
     * 
     * @param parentId parentId (required)
     * @param id id (required)
     * @param fields Output fields (optional)
     * @return ApiResponse&lt;ApiResultAttribute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultAttribute> readAttributeOfProjectVersionWithHttpInfo(Long parentId, Long id, String fields) throws ApiException {
        com.squareup.okhttp.Call call = readAttributeOfProjectVersionValidateBeforeCall(parentId, id, fields, null, null);
        Type localVarReturnType = new TypeToken<ApiResultAttribute>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * read (asynchronously)
     * 
     * @param parentId parentId (required)
     * @param id id (required)
     * @param fields Output fields (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readAttributeOfProjectVersionAsync(Long parentId, Long id, String fields, final ApiCallback<ApiResultAttribute> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = readAttributeOfProjectVersionValidateBeforeCall(parentId, id, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultAttribute>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateCollectionAttributeOfProjectVersion
     * @param parentId parentId (required)
     * @param data data (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCollectionAttributeOfProjectVersionCall(Long parentId, List<Attribute> data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;

        // create path and map variables
        String localVarPath = "/projectVersions/{parentId}/attributes"
            .replaceAll("\\{" + "parentId" + "\\}", apiClient.escapeString(parentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "FortifyToken" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateCollectionAttributeOfProjectVersionValidateBeforeCall(Long parentId, List<Attribute> data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'parentId' is set
        if (parentId == null) {
            throw new ApiException("Missing the required parameter 'parentId' when calling updateCollectionAttributeOfProjectVersion(Async)");
        }
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling updateCollectionAttributeOfProjectVersion(Async)");
        }
        

        com.squareup.okhttp.Call call = updateCollectionAttributeOfProjectVersionCall(parentId, data, progressListener, progressRequestListener);
        return call;

    }

    /**
     * updateCollection
     * 
     * @param parentId parentId (required)
     * @param data data (required)
     * @return ApiResultListAttribute
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultListAttribute updateCollectionAttributeOfProjectVersion(Long parentId, List<Attribute> data) throws ApiException {
        ApiResponse<ApiResultListAttribute> resp = updateCollectionAttributeOfProjectVersionWithHttpInfo(parentId, data);
        return resp.getData();
    }

    /**
     * updateCollection
     * 
     * @param parentId parentId (required)
     * @param data data (required)
     * @return ApiResponse&lt;ApiResultListAttribute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultListAttribute> updateCollectionAttributeOfProjectVersionWithHttpInfo(Long parentId, List<Attribute> data) throws ApiException {
        com.squareup.okhttp.Call call = updateCollectionAttributeOfProjectVersionValidateBeforeCall(parentId, data, null, null);
        Type localVarReturnType = new TypeToken<ApiResultListAttribute>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * updateCollection (asynchronously)
     * 
     * @param parentId parentId (required)
     * @param data data (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCollectionAttributeOfProjectVersionAsync(Long parentId, List<Attribute> data, final ApiCallback<ApiResultListAttribute> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateCollectionAttributeOfProjectVersionValidateBeforeCall(parentId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultListAttribute>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
