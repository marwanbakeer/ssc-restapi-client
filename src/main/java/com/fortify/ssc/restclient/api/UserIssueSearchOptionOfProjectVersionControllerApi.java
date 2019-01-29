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
import com.fortify.ssc.restclient.model.ApiResultIssueSearchOption;
import com.fortify.ssc.restclient.model.ApiResultListIssueSearchOption;
import com.fortify.ssc.restclient.model.IssueSearchOption;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserIssueSearchOptionOfProjectVersionControllerApi {
    private ApiClient apiClient;

    public UserIssueSearchOptionOfProjectVersionControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserIssueSearchOptionOfProjectVersionControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listUserIssueSearchOptionOfProjectVersion
     * @param parentId parentId (required)
     * @param fields Output fields (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call listUserIssueSearchOptionOfProjectVersionCall(Long parentId, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projectVersions/{parentId}/issueSearchOptions"
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

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listUserIssueSearchOptionOfProjectVersionValidateBeforeCall(Long parentId, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'parentId' is set
        if (parentId == null) {
            throw new ApiException("Missing the required parameter 'parentId' when calling listUserIssueSearchOptionOfProjectVersion(Async)");
        }
        

        com.squareup.okhttp.Call call = listUserIssueSearchOptionOfProjectVersionCall(parentId, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * list
     * 
     * @param parentId parentId (required)
     * @param fields Output fields (optional)
     * @return ApiResultListIssueSearchOption
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResultListIssueSearchOption listUserIssueSearchOptionOfProjectVersion(Long parentId, String fields) throws ApiException {
        ApiResponse<ApiResultListIssueSearchOption> resp = listUserIssueSearchOptionOfProjectVersionWithHttpInfo(parentId, fields);
        return resp.getData();
    }

    /**
     * list
     * 
     * @param parentId parentId (required)
     * @param fields Output fields (optional)
     * @return ApiResponse&lt;ApiResultListIssueSearchOption&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<ApiResultListIssueSearchOption> listUserIssueSearchOptionOfProjectVersionWithHttpInfo(Long parentId, String fields) throws ApiException {
        com.squareup.okhttp.Call call = listUserIssueSearchOptionOfProjectVersionValidateBeforeCall(parentId, fields, null, null);
        Type localVarReturnType = new TypeToken<ApiResultListIssueSearchOption>(){}.getType();
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
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call listUserIssueSearchOptionOfProjectVersionAsync(Long parentId, String fields, final ApiCallback<ApiResultListIssueSearchOption> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listUserIssueSearchOptionOfProjectVersionValidateBeforeCall(parentId, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultListIssueSearchOption>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readUserIssueSearchOptionOfProjectVersion
     * @param parentId parentId (required)
     * @param optionType optionType (required)
     * @param fields Output fields (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call readUserIssueSearchOptionOfProjectVersionCall(Long parentId, String optionType, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projectVersions/{parentId}/issueSearchOptions/{optionType}"
            .replaceAll("\\{" + "parentId" + "\\}", apiClient.escapeString(parentId.toString()))
            .replaceAll("\\{" + "optionType" + "\\}", apiClient.escapeString(optionType.toString()));

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

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call readUserIssueSearchOptionOfProjectVersionValidateBeforeCall(Long parentId, String optionType, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'parentId' is set
        if (parentId == null) {
            throw new ApiException("Missing the required parameter 'parentId' when calling readUserIssueSearchOptionOfProjectVersion(Async)");
        }
        
        // verify the required parameter 'optionType' is set
        if (optionType == null) {
            throw new ApiException("Missing the required parameter 'optionType' when calling readUserIssueSearchOptionOfProjectVersion(Async)");
        }
        

        com.squareup.okhttp.Call call = readUserIssueSearchOptionOfProjectVersionCall(parentId, optionType, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * read
     * 
     * @param parentId parentId (required)
     * @param optionType optionType (required)
     * @param fields Output fields (optional)
     * @return ApiResultIssueSearchOption
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResultIssueSearchOption readUserIssueSearchOptionOfProjectVersion(Long parentId, String optionType, String fields) throws ApiException {
        ApiResponse<ApiResultIssueSearchOption> resp = readUserIssueSearchOptionOfProjectVersionWithHttpInfo(parentId, optionType, fields);
        return resp.getData();
    }

    /**
     * read
     * 
     * @param parentId parentId (required)
     * @param optionType optionType (required)
     * @param fields Output fields (optional)
     * @return ApiResponse&lt;ApiResultIssueSearchOption&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<ApiResultIssueSearchOption> readUserIssueSearchOptionOfProjectVersionWithHttpInfo(Long parentId, String optionType, String fields) throws ApiException {
        com.squareup.okhttp.Call call = readUserIssueSearchOptionOfProjectVersionValidateBeforeCall(parentId, optionType, fields, null, null);
        Type localVarReturnType = new TypeToken<ApiResultIssueSearchOption>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * read (asynchronously)
     * 
     * @param parentId parentId (required)
     * @param optionType optionType (required)
     * @param fields Output fields (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call readUserIssueSearchOptionOfProjectVersionAsync(Long parentId, String optionType, String fields, final ApiCallback<ApiResultIssueSearchOption> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readUserIssueSearchOptionOfProjectVersionValidateBeforeCall(parentId, optionType, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultIssueSearchOption>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateUserIssueSearchOptionOfProjectVersion
     * @param parentId parentId (required)
     * @param resources resources (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call updateUserIssueSearchOptionOfProjectVersionCall(Long parentId, List<IssueSearchOption> resources, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = resources;

        // create path and map variables
        String localVarPath = "/projectVersions/{parentId}/issueSearchOptions"
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

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateUserIssueSearchOptionOfProjectVersionValidateBeforeCall(Long parentId, List<IssueSearchOption> resources, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'parentId' is set
        if (parentId == null) {
            throw new ApiException("Missing the required parameter 'parentId' when calling updateUserIssueSearchOptionOfProjectVersion(Async)");
        }
        
        // verify the required parameter 'resources' is set
        if (resources == null) {
            throw new ApiException("Missing the required parameter 'resources' when calling updateUserIssueSearchOptionOfProjectVersion(Async)");
        }
        

        com.squareup.okhttp.Call call = updateUserIssueSearchOptionOfProjectVersionCall(parentId, resources, progressListener, progressRequestListener);
        return call;

    }

    /**
     * update
     * 
     * @param parentId parentId (required)
     * @param resources resources (required)
     * @return ApiResultListIssueSearchOption
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResultListIssueSearchOption updateUserIssueSearchOptionOfProjectVersion(Long parentId, List<IssueSearchOption> resources) throws ApiException {
        ApiResponse<ApiResultListIssueSearchOption> resp = updateUserIssueSearchOptionOfProjectVersionWithHttpInfo(parentId, resources);
        return resp.getData();
    }

    /**
     * update
     * 
     * @param parentId parentId (required)
     * @param resources resources (required)
     * @return ApiResponse&lt;ApiResultListIssueSearchOption&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<ApiResultListIssueSearchOption> updateUserIssueSearchOptionOfProjectVersionWithHttpInfo(Long parentId, List<IssueSearchOption> resources) throws ApiException {
        com.squareup.okhttp.Call call = updateUserIssueSearchOptionOfProjectVersionValidateBeforeCall(parentId, resources, null, null);
        Type localVarReturnType = new TypeToken<ApiResultListIssueSearchOption>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * update (asynchronously)
     * 
     * @param parentId parentId (required)
     * @param resources resources (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call updateUserIssueSearchOptionOfProjectVersionAsync(Long parentId, List<IssueSearchOption> resources, final ApiCallback<ApiResultListIssueSearchOption> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateUserIssueSearchOptionOfProjectVersionValidateBeforeCall(parentId, resources, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultListIssueSearchOption>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}