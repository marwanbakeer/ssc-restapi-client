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
import com.fortify.ssc.restclient.model.ApiResultListResponsibilityAssignment;
import com.fortify.ssc.restclient.model.ApiResultResponsibilityAssignment;
import com.fortify.ssc.restclient.model.ResponsibilityAssignment;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResponsibilityAssignmentOfProjectVersionControllerApi
 */
@Ignore
public class ResponsibilityAssignmentOfProjectVersionControllerApiTest {

    private final ResponsibilityAssignmentOfProjectVersionControllerApi api = new ResponsibilityAssignmentOfProjectVersionControllerApi();

    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listResponsibilityAssignmentOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        String fields = null;
        Integer start = null;
        Integer limit = null;
        String q = null;
        ApiResultListResponsibilityAssignment response = api.listResponsibilityAssignmentOfProjectVersion(parentId, fields, start, limit, q);

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
    public void readResponsibilityAssignmentOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        String guid = null;
        String fields = null;
        ApiResultResponsibilityAssignment response = api.readResponsibilityAssignmentOfProjectVersion(parentId, guid, fields);

        // TODO: test validations
    }
    
    /**
     * updateCollection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCollectionResponsibilityAssignmentOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        List<ResponsibilityAssignment> data = null;
        ApiResultListResponsibilityAssignment response = api.updateCollectionResponsibilityAssignmentOfProjectVersion(parentId, data);

        // TODO: test validations
    }
    
}
