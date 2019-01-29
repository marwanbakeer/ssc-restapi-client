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

import com.fortify.ssc.restclient.ApiException;
import com.fortify.ssc.restclient.model.ApiResult;
import com.fortify.ssc.restclient.model.ApiResultFeature;
import com.fortify.ssc.restclient.model.ApiResultListFeature;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeatureControllerApi
 */
@Ignore
public class FeatureControllerApiTest {

    private final FeatureControllerApi api = new FeatureControllerApi();

    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFeatureTest() throws ApiException {
        String fields = null;
        Integer start = null;
        Integer limit = null;
        String q = null;
        String orderby = null;
        Boolean useStableApi = null;
        ApiResultListFeature response = api.listFeature(fields, start, limit, q, orderby, useStableApi);

        // TODO: test validations
    }
    
    /**
     * read
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readFeatureTest() throws ApiException {
        String id = null;
        String fields = null;
        ApiResultFeature response = api.readFeature(id, fields);

        // TODO: test validations
    }
    
}
