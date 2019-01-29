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
import com.fortify.ssc.restclient.model.ApiResultAuthenticationEntity;
import com.fortify.ssc.restclient.model.ApiResultListAuthenticationEntity;
import com.fortify.ssc.restclient.model.AuthenticationEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthEntityOfProjectControllerApi {
    private ApiClient apiClient;

    public AuthEntityOfProjectControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthEntityOfProjectControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listAuthEntityOfProject
     * @param parentId parentId (required)
     * @param fields Output fields (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listAuthEntityOfProjectCall(Long parentId, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projects/{parentId}/authEntities"
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
    private com.squareup.okhttp.Call listAuthEntityOfProjectValidateBeforeCall(Long parentId, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'parentId' is set
        if (parentId == null) {
            throw new ApiException("Missing the required parameter 'parentId' when calling listAuthEntityOfProject(Async)");
        }
        

        com.squareup.okhttp.Call call = listAuthEntityOfProjectCall(parentId, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * list
     * 
     * @param parentId parentId (required)
     * @param fields Output fields (optional)
     * @return ApiResultListAuthenticationEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultListAuthenticationEntity listAuthEntityOfProject(Long parentId, String fields) throws ApiException {
        ApiResponse<ApiResultListAuthenticationEntity> resp = listAuthEntityOfProjectWithHttpInfo(parentId, fields);
        return resp.getData();
    }

    /**
     * list
     * 
     * @param parentId parentId (required)
     * @param fields Output fields (optional)
     * @return ApiResponse&lt;ApiResultListAuthenticationEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultListAuthenticationEntity> listAuthEntityOfProjectWithHttpInfo(Long parentId, String fields) throws ApiException {
        com.squareup.okhttp.Call call = listAuthEntityOfProjectValidateBeforeCall(parentId, fields, null, null);
        Type localVarReturnType = new TypeToken<ApiResultListAuthenticationEntity>(){}.getType();
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
    public com.squareup.okhttp.Call listAuthEntityOfProjectAsync(Long parentId, String fields, final ApiCallback<ApiResultListAuthenticationEntity> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listAuthEntityOfProjectValidateBeforeCall(parentId, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultListAuthenticationEntity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readAuthEntityOfProject
     * @param parentId parentId (required)
     * @param id id (required)
     * @param fields Output fields (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readAuthEntityOfProjectCall(Long parentId, Long id, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projects/{parentId}/authEntities/{id}"
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
    private com.squareup.okhttp.Call readAuthEntityOfProjectValidateBeforeCall(Long parentId, Long id, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'parentId' is set
        if (parentId == null) {
            throw new ApiException("Missing the required parameter 'parentId' when calling readAuthEntityOfProject(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling readAuthEntityOfProject(Async)");
        }
        

        com.squareup.okhttp.Call call = readAuthEntityOfProjectCall(parentId, id, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * read
     * 
     * @param parentId parentId (required)
     * @param id id (required)
     * @param fields Output fields (optional)
     * @return ApiResultAuthenticationEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultAuthenticationEntity readAuthEntityOfProject(Long parentId, Long id, String fields) throws ApiException {
        ApiResponse<ApiResultAuthenticationEntity> resp = readAuthEntityOfProjectWithHttpInfo(parentId, id, fields);
        return resp.getData();
    }

    /**
     * read
     * 
     * @param parentId parentId (required)
     * @param id id (required)
     * @param fields Output fields (optional)
     * @return ApiResponse&lt;ApiResultAuthenticationEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultAuthenticationEntity> readAuthEntityOfProjectWithHttpInfo(Long parentId, Long id, String fields) throws ApiException {
        com.squareup.okhttp.Call call = readAuthEntityOfProjectValidateBeforeCall(parentId, id, fields, null, null);
        Type localVarReturnType = new TypeToken<ApiResultAuthenticationEntity>(){}.getType();
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
    public com.squareup.okhttp.Call readAuthEntityOfProjectAsync(Long parentId, Long id, String fields, final ApiCallback<ApiResultAuthenticationEntity> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readAuthEntityOfProjectValidateBeforeCall(parentId, id, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultAuthenticationEntity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateCollectionAuthEntityOfProject
     * @param parentId parentId (required)
     * @param resources resources (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCollectionAuthEntityOfProjectCall(Long parentId, List<AuthenticationEntity> resources, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = resources;

        // create path and map variables
        String localVarPath = "/projects/{parentId}/authEntities"
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
    private com.squareup.okhttp.Call updateCollectionAuthEntityOfProjectValidateBeforeCall(Long parentId, List<AuthenticationEntity> resources, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'parentId' is set
        if (parentId == null) {
            throw new ApiException("Missing the required parameter 'parentId' when calling updateCollectionAuthEntityOfProject(Async)");
        }
        
        // verify the required parameter 'resources' is set
        if (resources == null) {
            throw new ApiException("Missing the required parameter 'resources' when calling updateCollectionAuthEntityOfProject(Async)");
        }
        

        com.squareup.okhttp.Call call = updateCollectionAuthEntityOfProjectCall(parentId, resources, progressListener, progressRequestListener);
        return call;

    }

    /**
     * updateCollection
     * 
     * @param parentId parentId (required)
     * @param resources resources (required)
     * @return ApiResultListAuthenticationEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultListAuthenticationEntity updateCollectionAuthEntityOfProject(Long parentId, List<AuthenticationEntity> resources) throws ApiException {
        ApiResponse<ApiResultListAuthenticationEntity> resp = updateCollectionAuthEntityOfProjectWithHttpInfo(parentId, resources);
        return resp.getData();
    }

    /**
     * updateCollection
     * 
     * @param parentId parentId (required)
     * @param resources resources (required)
     * @return ApiResponse&lt;ApiResultListAuthenticationEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultListAuthenticationEntity> updateCollectionAuthEntityOfProjectWithHttpInfo(Long parentId, List<AuthenticationEntity> resources) throws ApiException {
        com.squareup.okhttp.Call call = updateCollectionAuthEntityOfProjectValidateBeforeCall(parentId, resources, null, null);
        Type localVarReturnType = new TypeToken<ApiResultListAuthenticationEntity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * updateCollection (asynchronously)
     * 
     * @param parentId parentId (required)
     * @param resources resources (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCollectionAuthEntityOfProjectAsync(Long parentId, List<AuthenticationEntity> resources, final ApiCallback<ApiResultListAuthenticationEntity> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateCollectionAuthEntityOfProjectValidateBeforeCall(parentId, resources, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultListAuthenticationEntity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
