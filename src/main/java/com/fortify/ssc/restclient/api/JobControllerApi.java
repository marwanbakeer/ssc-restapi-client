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


import com.fortify.ssc.restclient.model.ApiResourceAction;
import com.fortify.ssc.restclient.model.ApiResult;
import com.fortify.ssc.restclient.model.ApiResultApiActionResponse;
import com.fortify.ssc.restclient.model.ApiResultJob;
import com.fortify.ssc.restclient.model.ApiResultListJob;
import com.fortify.ssc.restclient.model.ApiResultVoid;
import com.fortify.ssc.restclient.model.Job;
import com.fortify.ssc.restclient.model.JobCancelRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JobControllerApi {
    private ApiClient apiClient;

    public JobControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public JobControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for cancelJob
     * @param resource resource (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cancelJobCall(JobCancelRequest resource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = resource;

        // create path and map variables
        String localVarPath = "/jobs/action/cancel";

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
    private com.squareup.okhttp.Call cancelJobValidateBeforeCall(JobCancelRequest resource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'resource' is set
        if (resource == null) {
            throw new ApiException("Missing the required parameter 'resource' when calling cancelJob(Async)");
        }
        

        com.squareup.okhttp.Call call = cancelJobCall(resource, progressListener, progressRequestListener);
        return call;

    }

    /**
     * cancel
     * 
     * @param resource resource (required)
     * @return ApiResultVoid
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultVoid cancelJob(JobCancelRequest resource) throws ApiException {
        ApiResponse<ApiResultVoid> resp = cancelJobWithHttpInfo(resource);
        return resp.getData();
    }

    /**
     * cancel
     * 
     * @param resource resource (required)
     * @return ApiResponse&lt;ApiResultVoid&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultVoid> cancelJobWithHttpInfo(JobCancelRequest resource) throws ApiException {
        com.squareup.okhttp.Call call = cancelJobValidateBeforeCall(resource, null, null);
        Type localVarReturnType = new TypeToken<ApiResultVoid>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * cancel (asynchronously)
     * 
     * @param resource resource (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelJobAsync(JobCancelRequest resource, final ApiCallback<ApiResultVoid> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cancelJobValidateBeforeCall(resource, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultVoid>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for doActionJob
     * @param jobName jobName (required)
     * @param resourceAction resourceAction (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call doActionJobCall(String jobName, ApiResourceAction resourceAction, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = resourceAction;

        // create path and map variables
        String localVarPath = "/jobs/{jobName}/action"
            .replaceAll("\\{" + "jobName" + "\\}", apiClient.escapeString(jobName.toString()));

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
    private com.squareup.okhttp.Call doActionJobValidateBeforeCall(String jobName, ApiResourceAction resourceAction, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'jobName' is set
        if (jobName == null) {
            throw new ApiException("Missing the required parameter 'jobName' when calling doActionJob(Async)");
        }
        
        // verify the required parameter 'resourceAction' is set
        if (resourceAction == null) {
            throw new ApiException("Missing the required parameter 'resourceAction' when calling doActionJob(Async)");
        }
        

        com.squareup.okhttp.Call call = doActionJobCall(jobName, resourceAction, progressListener, progressRequestListener);
        return call;

    }

    /**
     * doAction
     * 
     * @param jobName jobName (required)
     * @param resourceAction resourceAction (required)
     * @return ApiResultApiActionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultApiActionResponse doActionJob(String jobName, ApiResourceAction resourceAction) throws ApiException {
        ApiResponse<ApiResultApiActionResponse> resp = doActionJobWithHttpInfo(jobName, resourceAction);
        return resp.getData();
    }

    /**
     * doAction
     * 
     * @param jobName jobName (required)
     * @param resourceAction resourceAction (required)
     * @return ApiResponse&lt;ApiResultApiActionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultApiActionResponse> doActionJobWithHttpInfo(String jobName, ApiResourceAction resourceAction) throws ApiException {
        com.squareup.okhttp.Call call = doActionJobValidateBeforeCall(jobName, resourceAction, null, null);
        Type localVarReturnType = new TypeToken<ApiResultApiActionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * doAction (asynchronously)
     * 
     * @param jobName jobName (required)
     * @param resourceAction resourceAction (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call doActionJobAsync(String jobName, ApiResourceAction resourceAction, final ApiCallback<ApiResultApiActionResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = doActionJobValidateBeforeCall(jobName, resourceAction, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultApiActionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listJob
     * @param fields Output fields (optional)
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param q A search query (optional)
     * @param orderby Fields to order by (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listJobCall(String fields, Integer start, Integer limit, String q, String orderby, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/jobs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
        if (orderby != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orderby", orderby));

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
    private com.squareup.okhttp.Call listJobValidateBeforeCall(String fields, Integer start, Integer limit, String q, String orderby, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listJobCall(fields, start, limit, q, orderby, progressListener, progressRequestListener);
        return call;

    }

    /**
     * list
     * 
     * @param fields Output fields (optional)
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param q A search query (optional)
     * @param orderby Fields to order by (optional)
     * @return ApiResultListJob
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultListJob listJob(String fields, Integer start, Integer limit, String q, String orderby) throws ApiException {
        ApiResponse<ApiResultListJob> resp = listJobWithHttpInfo(fields, start, limit, q, orderby);
        return resp.getData();
    }

    /**
     * list
     * 
     * @param fields Output fields (optional)
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param q A search query (optional)
     * @param orderby Fields to order by (optional)
     * @return ApiResponse&lt;ApiResultListJob&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultListJob> listJobWithHttpInfo(String fields, Integer start, Integer limit, String q, String orderby) throws ApiException {
        com.squareup.okhttp.Call call = listJobValidateBeforeCall(fields, start, limit, q, orderby, null, null);
        Type localVarReturnType = new TypeToken<ApiResultListJob>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * list (asynchronously)
     * 
     * @param fields Output fields (optional)
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param q A search query (optional)
     * @param orderby Fields to order by (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listJobAsync(String fields, Integer start, Integer limit, String q, String orderby, final ApiCallback<ApiResultListJob> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listJobValidateBeforeCall(fields, start, limit, q, orderby, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultListJob>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readJob
     * @param jobName jobName (required)
     * @param fields Output fields (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readJobCall(String jobName, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/jobs/{jobName}"
            .replaceAll("\\{" + "jobName" + "\\}", apiClient.escapeString(jobName.toString()));

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
    private com.squareup.okhttp.Call readJobValidateBeforeCall(String jobName, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'jobName' is set
        if (jobName == null) {
            throw new ApiException("Missing the required parameter 'jobName' when calling readJob(Async)");
        }
        

        com.squareup.okhttp.Call call = readJobCall(jobName, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * read
     * 
     * @param jobName jobName (required)
     * @param fields Output fields (optional)
     * @return ApiResultJob
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultJob readJob(String jobName, String fields) throws ApiException {
        ApiResponse<ApiResultJob> resp = readJobWithHttpInfo(jobName, fields);
        return resp.getData();
    }

    /**
     * read
     * 
     * @param jobName jobName (required)
     * @param fields Output fields (optional)
     * @return ApiResponse&lt;ApiResultJob&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultJob> readJobWithHttpInfo(String jobName, String fields) throws ApiException {
        com.squareup.okhttp.Call call = readJobValidateBeforeCall(jobName, fields, null, null);
        Type localVarReturnType = new TypeToken<ApiResultJob>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * read (asynchronously)
     * 
     * @param jobName jobName (required)
     * @param fields Output fields (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readJobAsync(String jobName, String fields, final ApiCallback<ApiResultJob> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readJobValidateBeforeCall(jobName, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultJob>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateJob
     * @param jobName jobName (required)
     * @param resource resource (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateJobCall(String jobName, Job resource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = resource;

        // create path and map variables
        String localVarPath = "/jobs/{jobName}"
            .replaceAll("\\{" + "jobName" + "\\}", apiClient.escapeString(jobName.toString()));

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
    private com.squareup.okhttp.Call updateJobValidateBeforeCall(String jobName, Job resource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'jobName' is set
        if (jobName == null) {
            throw new ApiException("Missing the required parameter 'jobName' when calling updateJob(Async)");
        }
        
        // verify the required parameter 'resource' is set
        if (resource == null) {
            throw new ApiException("Missing the required parameter 'resource' when calling updateJob(Async)");
        }
        

        com.squareup.okhttp.Call call = updateJobCall(jobName, resource, progressListener, progressRequestListener);
        return call;

    }

    /**
     * update
     * 
     * @param jobName jobName (required)
     * @param resource resource (required)
     * @return ApiResultJob
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultJob updateJob(String jobName, Job resource) throws ApiException {
        ApiResponse<ApiResultJob> resp = updateJobWithHttpInfo(jobName, resource);
        return resp.getData();
    }

    /**
     * update
     * 
     * @param jobName jobName (required)
     * @param resource resource (required)
     * @return ApiResponse&lt;ApiResultJob&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultJob> updateJobWithHttpInfo(String jobName, Job resource) throws ApiException {
        com.squareup.okhttp.Call call = updateJobValidateBeforeCall(jobName, resource, null, null);
        Type localVarReturnType = new TypeToken<ApiResultJob>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * update (asynchronously)
     * 
     * @param jobName jobName (required)
     * @param resource resource (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateJobAsync(String jobName, Job resource, final ApiCallback<ApiResultJob> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateJobValidateBeforeCall(jobName, resource, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultJob>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}