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
import com.fortify.ssc.restclient.model.ApiResultArtifact;
import com.fortify.ssc.restclient.model.ApiResultListArtifact;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ArtifactOfProjectVersionControllerApi
 */
@Ignore
public class ArtifactOfProjectVersionControllerApiTest {

    private final ArtifactOfProjectVersionControllerApi api = new ArtifactOfProjectVersionControllerApi();

    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listArtifactOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        String fields = null;
        Integer start = null;
        Integer limit = null;
        String q = null;
        String embed = null;
        ApiResultListArtifact response = api.listArtifactOfProjectVersion(parentId, fields, start, limit, q, embed);

        // TODO: test validations
    }
    
    /**
     * upload
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadArtifactOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        File file = null;
        String engineType = null;
        ApiResultArtifact response = api.uploadArtifactOfProjectVersion(parentId, file, engineType);

        // TODO: test validations
    }
    
}
