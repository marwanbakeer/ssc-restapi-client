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
import com.fortify.ssc.restclient.model.ApiResultListUserSessionState;
import com.fortify.ssc.restclient.model.UserSessionState;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserSessionStateControllerApi
 */
@Ignore
public class UserSessionStateControllerApiTest {

    private final UserSessionStateControllerApi api = new UserSessionStateControllerApi();

    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUserSessionStateTest() throws ApiException {
        Integer start = null;
        Integer limit = null;
        String q = null;
        ApiResultListUserSessionState response = api.listUserSessionState(start, limit, q);

        // TODO: test validations
    }
    
    /**
     * put
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUserSessionStateTest() throws ApiException {
        List<UserSessionState> resources = null;
        ApiResultListUserSessionState response = api.putUserSessionState(resources);

        // TODO: test validations
    }
    
}
