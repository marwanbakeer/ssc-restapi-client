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
import com.fortify.ssc.restclient.model.ApiResultListProjectVersionIssueDetails;
import com.fortify.ssc.restclient.model.ApiResultProjectVersionIssueDetails;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueDetailControllerApi
 */
@Ignore
public class IssueDetailControllerApiTest {

    private final IssueDetailControllerApi api = new IssueDetailControllerApi();

    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIssueDetailTest() throws ApiException {
        String projectName = null;
        String projectVersionName = null;
        String instanceId = null;
        ApiResultListProjectVersionIssueDetails response = api.listIssueDetail(projectName, projectVersionName, instanceId);

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
    public void readIssueDetailTest() throws ApiException {
        Long id = null;
        String filterset = null;
        ApiResultProjectVersionIssueDetails response = api.readIssueDetail(id, filterset);

        // TODO: test validations
    }
    
}
