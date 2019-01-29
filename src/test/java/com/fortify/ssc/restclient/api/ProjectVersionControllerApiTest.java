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
import com.fortify.ssc.restclient.model.ApiCollectionActionlong;
import com.fortify.ssc.restclient.model.ApiResourceAction;
import com.fortify.ssc.restclient.model.ApiResult;
import com.fortify.ssc.restclient.model.ApiResultApiActionResponse;
import com.fortify.ssc.restclient.model.ApiResultListProjectVersion;
import com.fortify.ssc.restclient.model.ApiResultProjectVersion;
import com.fortify.ssc.restclient.model.ApiResultProjectVersionRefreshResponse;
import com.fortify.ssc.restclient.model.ApiResultProjectVersionTestResponse;
import com.fortify.ssc.restclient.model.ApiResultVoid;
import com.fortify.ssc.restclient.model.ProjectVersion;
import com.fortify.ssc.restclient.model.ProjectVersionAuditByAssistantRequest;
import com.fortify.ssc.restclient.model.ProjectVersionCopyCurrentStateRequest;
import com.fortify.ssc.restclient.model.ProjectVersionCopyPartialRequest;
import com.fortify.ssc.restclient.model.ProjectVersionPurgeRequest;
import com.fortify.ssc.restclient.model.ProjectVersionRefreshRequest;
import com.fortify.ssc.restclient.model.ProjectVersionTestRequest;
import com.fortify.ssc.restclient.model.ProjectVersionTrainAuditAssistantRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectVersionControllerApi
 */
@Ignore
public class ProjectVersionControllerApiTest {

    private final ProjectVersionControllerApi api = new ProjectVersionControllerApi();

    
    /**
     * auditByAuditAssistant
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void auditByAuditAssistantProjectVersionTest() throws ApiException {
        ProjectVersionAuditByAssistantRequest resource = null;
        ApiResultVoid response = api.auditByAuditAssistantProjectVersion(resource);

        // TODO: test validations
    }
    
    /**
     * copyCurrentStateFor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyCurrentStateForProjectVersionTest() throws ApiException {
        ProjectVersionCopyCurrentStateRequest resource = null;
        ApiResultVoid response = api.copyCurrentStateForProjectVersion(resource);

        // TODO: test validations
    }
    
    /**
     * copy
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyProjectVersionTest() throws ApiException {
        ProjectVersionCopyPartialRequest resource = null;
        ApiResultVoid response = api.copyProjectVersion(resource);

        // TODO: test validations
    }
    
    /**
     * create
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProjectVersionTest() throws ApiException {
        ProjectVersion resource = null;
        ApiResultProjectVersion response = api.createProjectVersion(resource);

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
    public void deleteProjectVersionTest() throws ApiException {
        Long id = null;
        ApiResultVoid response = api.deleteProjectVersion(id);

        // TODO: test validations
    }
    
    /**
     * doAction
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void doActionProjectVersionTest() throws ApiException {
        Long id = null;
        ApiResourceAction resourceAction = null;
        ApiResultApiActionResponse response = api.doActionProjectVersion(id, resourceAction);

        // TODO: test validations
    }
    
    /**
     * doCollectionAction
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void doCollectionActionProjectVersionTest() throws ApiException {
        ApiCollectionActionlong collectionAction = null;
        ApiResultApiActionResponse response = api.doCollectionActionProjectVersion(collectionAction);

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
    public void listProjectVersionTest() throws ApiException {
        String fields = null;
        Integer start = null;
        Integer limit = null;
        String q = null;
        Boolean fulltextsearch = null;
        String orderby = null;
        Boolean includeInactive = null;
        Boolean myAssignedIssues = null;
        Boolean onlyIfHasIssues = null;
        ApiResultListProjectVersion response = api.listProjectVersion(fields, start, limit, q, fulltextsearch, orderby, includeInactive, myAssignedIssues, onlyIfHasIssues);

        // TODO: test validations
    }
    
    /**
     * purge
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void purgeProjectVersionTest() throws ApiException {
        ProjectVersionPurgeRequest resource = null;
        ApiResultVoid response = api.purgeProjectVersion(resource);

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
    public void readProjectVersionTest() throws ApiException {
        Long id = null;
        String fields = null;
        ApiResultProjectVersion response = api.readProjectVersion(id, fields);

        // TODO: test validations
    }
    
    /**
     * refresh
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshProjectVersionTest() throws ApiException {
        ProjectVersionRefreshRequest resource = null;
        ApiResultProjectVersionRefreshResponse response = api.refreshProjectVersion(resource);

        // TODO: test validations
    }
    
    /**
     * test
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testProjectVersionTest() throws ApiException {
        ProjectVersionTestRequest projectVersionTestRequest = null;
        ApiResultProjectVersionTestResponse response = api.testProjectVersion(projectVersionTestRequest);

        // TODO: test validations
    }
    
    /**
     * trainAuditAssistant
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void trainAuditAssistantProjectVersionTest() throws ApiException {
        ProjectVersionTrainAuditAssistantRequest resource = null;
        ApiResultVoid response = api.trainAuditAssistantProjectVersion(resource);

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
    public void updateProjectVersionTest() throws ApiException {
        Long id = null;
        ProjectVersion resource = null;
        ApiResultProjectVersion response = api.updateProjectVersion(id, resource);

        // TODO: test validations
    }
    
}
