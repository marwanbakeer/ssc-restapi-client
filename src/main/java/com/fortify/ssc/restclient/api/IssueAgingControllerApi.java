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
import com.fortify.ssc.restclient.model.ApiResultListIssueAgingDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IssueAgingControllerApi {
    private ApiClient apiClient;

    public IssueAgingControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IssueAgingControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listIssueAging
     * @param orderby Fields to order by (optional)
     * @param fields Output fields (optional)
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param filterby filterby (optional)
     * @param aggregateby aggregateby (optional)
     * @param groupguid groupguid (optional)
     * @param groupvalue groupvalue (optional)
     * @param name name (optional)
     * @param numberOfApplicationVersions numberOfApplicationVersions (optional)
     * @param linesOfCode linesOfCode (optional)
     * @param issuesPendingReview issuesPendingReview (optional)
     * @param openIssues openIssues (optional)
     * @param filesScanned filesScanned (optional)
     * @param bugDensity bugDensity (optional)
     * @param averageDaysToReview averageDaysToReview (optional)
     * @param averageDaysToRemediate averageDaysToRemediate (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listIssueAgingCall(String orderby, String fields, Integer start, Integer limit, String filterby, String aggregateby, String groupguid, String groupvalue, String name, String numberOfApplicationVersions, String linesOfCode, String issuesPendingReview, String openIssues, String filesScanned, String bugDensity, String averageDaysToReview, String averageDaysToRemediate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/issueaging";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (orderby != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orderby", orderby));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (filterby != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filterby", filterby));
        if (aggregateby != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("aggregateby", aggregateby));
        if (groupguid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("groupguid", groupguid));
        if (groupvalue != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("groupvalue", groupvalue));
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
        if (numberOfApplicationVersions != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("numberOfApplicationVersions", numberOfApplicationVersions));
        if (linesOfCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("linesOfCode", linesOfCode));
        if (issuesPendingReview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("issuesPendingReview", issuesPendingReview));
        if (openIssues != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("openIssues", openIssues));
        if (filesScanned != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filesScanned", filesScanned));
        if (bugDensity != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("bugDensity", bugDensity));
        if (averageDaysToReview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("averageDaysToReview", averageDaysToReview));
        if (averageDaysToRemediate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("averageDaysToRemediate", averageDaysToRemediate));

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
    private com.squareup.okhttp.Call listIssueAgingValidateBeforeCall(String orderby, String fields, Integer start, Integer limit, String filterby, String aggregateby, String groupguid, String groupvalue, String name, String numberOfApplicationVersions, String linesOfCode, String issuesPendingReview, String openIssues, String filesScanned, String bugDensity, String averageDaysToReview, String averageDaysToRemediate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listIssueAgingCall(orderby, fields, start, limit, filterby, aggregateby, groupguid, groupvalue, name, numberOfApplicationVersions, linesOfCode, issuesPendingReview, openIssues, filesScanned, bugDensity, averageDaysToReview, averageDaysToRemediate, progressListener, progressRequestListener);
        return call;

    }

    /**
     * list
     * 
     * @param orderby Fields to order by (optional)
     * @param fields Output fields (optional)
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param filterby filterby (optional)
     * @param aggregateby aggregateby (optional)
     * @param groupguid groupguid (optional)
     * @param groupvalue groupvalue (optional)
     * @param name name (optional)
     * @param numberOfApplicationVersions numberOfApplicationVersions (optional)
     * @param linesOfCode linesOfCode (optional)
     * @param issuesPendingReview issuesPendingReview (optional)
     * @param openIssues openIssues (optional)
     * @param filesScanned filesScanned (optional)
     * @param bugDensity bugDensity (optional)
     * @param averageDaysToReview averageDaysToReview (optional)
     * @param averageDaysToRemediate averageDaysToRemediate (optional)
     * @return ApiResultListIssueAgingDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultListIssueAgingDto listIssueAging(String orderby, String fields, Integer start, Integer limit, String filterby, String aggregateby, String groupguid, String groupvalue, String name, String numberOfApplicationVersions, String linesOfCode, String issuesPendingReview, String openIssues, String filesScanned, String bugDensity, String averageDaysToReview, String averageDaysToRemediate) throws ApiException {
        ApiResponse<ApiResultListIssueAgingDto> resp = listIssueAgingWithHttpInfo(orderby, fields, start, limit, filterby, aggregateby, groupguid, groupvalue, name, numberOfApplicationVersions, linesOfCode, issuesPendingReview, openIssues, filesScanned, bugDensity, averageDaysToReview, averageDaysToRemediate);
        return resp.getData();
    }

    /**
     * list
     * 
     * @param orderby Fields to order by (optional)
     * @param fields Output fields (optional)
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param filterby filterby (optional)
     * @param aggregateby aggregateby (optional)
     * @param groupguid groupguid (optional)
     * @param groupvalue groupvalue (optional)
     * @param name name (optional)
     * @param numberOfApplicationVersions numberOfApplicationVersions (optional)
     * @param linesOfCode linesOfCode (optional)
     * @param issuesPendingReview issuesPendingReview (optional)
     * @param openIssues openIssues (optional)
     * @param filesScanned filesScanned (optional)
     * @param bugDensity bugDensity (optional)
     * @param averageDaysToReview averageDaysToReview (optional)
     * @param averageDaysToRemediate averageDaysToRemediate (optional)
     * @return ApiResponse&lt;ApiResultListIssueAgingDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultListIssueAgingDto> listIssueAgingWithHttpInfo(String orderby, String fields, Integer start, Integer limit, String filterby, String aggregateby, String groupguid, String groupvalue, String name, String numberOfApplicationVersions, String linesOfCode, String issuesPendingReview, String openIssues, String filesScanned, String bugDensity, String averageDaysToReview, String averageDaysToRemediate) throws ApiException {
        com.squareup.okhttp.Call call = listIssueAgingValidateBeforeCall(orderby, fields, start, limit, filterby, aggregateby, groupguid, groupvalue, name, numberOfApplicationVersions, linesOfCode, issuesPendingReview, openIssues, filesScanned, bugDensity, averageDaysToReview, averageDaysToRemediate, null, null);
        Type localVarReturnType = new TypeToken<ApiResultListIssueAgingDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * list (asynchronously)
     * 
     * @param orderby Fields to order by (optional)
     * @param fields Output fields (optional)
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param filterby filterby (optional)
     * @param aggregateby aggregateby (optional)
     * @param groupguid groupguid (optional)
     * @param groupvalue groupvalue (optional)
     * @param name name (optional)
     * @param numberOfApplicationVersions numberOfApplicationVersions (optional)
     * @param linesOfCode linesOfCode (optional)
     * @param issuesPendingReview issuesPendingReview (optional)
     * @param openIssues openIssues (optional)
     * @param filesScanned filesScanned (optional)
     * @param bugDensity bugDensity (optional)
     * @param averageDaysToReview averageDaysToReview (optional)
     * @param averageDaysToRemediate averageDaysToRemediate (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listIssueAgingAsync(String orderby, String fields, Integer start, Integer limit, String filterby, String aggregateby, String groupguid, String groupvalue, String name, String numberOfApplicationVersions, String linesOfCode, String issuesPendingReview, String openIssues, String filesScanned, String bugDensity, String averageDaysToReview, String averageDaysToRemediate, final ApiCallback<ApiResultListIssueAgingDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listIssueAgingValidateBeforeCall(orderby, fields, start, limit, filterby, aggregateby, groupguid, groupvalue, name, numberOfApplicationVersions, linesOfCode, issuesPendingReview, openIssues, filesScanned, bugDensity, averageDaysToReview, averageDaysToRemediate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultListIssueAgingDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
