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
import com.fortify.ssc.restclient.model.ApiResourceAction;
import com.fortify.ssc.restclient.model.ApiResult;
import com.fortify.ssc.restclient.model.ApiResultApiActionResponse;
import com.fortify.ssc.restclient.model.ApiResultArtifact;
import com.fortify.ssc.restclient.model.ApiResultVoid;
import com.fortify.ssc.restclient.model.ArtifactApproveRequest;
import com.fortify.ssc.restclient.model.ArtifactPurgeRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ArtifactControllerApi
 */
@Ignore
public class ArtifactControllerApiTest {

    private final ArtifactControllerApi api = new ArtifactControllerApi();

    
    /**
     * approve
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void approveArtifactTest() throws ApiException {
        ArtifactApproveRequest resource = null;
        ApiResultVoid response = api.approveArtifact(resource);

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
    public void deleteArtifactTest() throws ApiException {
        Long id = null;
        ApiResultVoid response = api.deleteArtifact(id);

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
    public void doActionArtifactTest() throws ApiException {
        Long id = null;
        ApiResourceAction resourceAction = null;
        ApiResultApiActionResponse response = api.doActionArtifact(id, resourceAction);

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
    public void purgeArtifactTest() throws ApiException {
        ArtifactPurgeRequest resource = null;
        ApiResultVoid response = api.purgeArtifact(resource);

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
    public void readArtifactTest() throws ApiException {
        Long id = null;
        String fields = null;
        String embed = null;
        ApiResultArtifact response = api.readArtifact(id, fields, embed);

        // TODO: test validations
    }
    
}
