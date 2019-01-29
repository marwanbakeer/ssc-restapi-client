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
import com.fortify.ssc.restclient.model.ApiResultCustomTag;
import com.fortify.ssc.restclient.model.ApiResultListCustomTag;
import com.fortify.ssc.restclient.model.ApiResultVoid;
import com.fortify.ssc.restclient.model.CustomTag;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomTagControllerApi
 */
@Ignore
public class CustomTagControllerApiTest {

    private final CustomTagControllerApi api = new CustomTagControllerApi();

    
    /**
     * create
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCustomTagTest() throws ApiException {
        CustomTag data = null;
        ApiResultCustomTag response = api.createCustomTag(data);

        // TODO: test validations
    }
    
    /**
     * delete
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomTagTest() throws ApiException {
        Long id = null;
        ApiResultVoid response = api.deleteCustomTag(id);

        // TODO: test validations
    }
    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCustomTagTest() throws ApiException {
        String fields = null;
        Integer start = null;
        Integer limit = null;
        String q = null;
        String orderby = null;
        ApiResultListCustomTag response = api.listCustomTag(fields, start, limit, q, orderby);

        // TODO: test validations
    }
    
    /**
     * multiDelete
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void multiDeleteCustomTagTest() throws ApiException {
        String ids = null;
        ApiResultVoid response = api.multiDeleteCustomTag(ids);

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
    public void readCustomTagTest() throws ApiException {
        Long id = null;
        String fields = null;
        ApiResultCustomTag response = api.readCustomTag(id, fields);

        // TODO: test validations
    }
    
    /**
     * update
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomTagTest() throws ApiException {
        Long id = null;
        CustomTag resource = null;
        ApiResultCustomTag response = api.updateCustomTag(id, resource);

        // TODO: test validations
    }
    
}
