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


package com.fortify.ssc.restclient.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Request of refreshing the project versions and triggering the historical snapshot job
 */
@ApiModel(description = "Request of refreshing the project versions and triggering the historical snapshot job")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class ProjectVersionRefreshRequest {
  @SerializedName("projectVersionIds")
  private List<Long> projectVersionIds = new ArrayList<Long>();

  public ProjectVersionRefreshRequest projectVersionIds(List<Long> projectVersionIds) {
    this.projectVersionIds = projectVersionIds;
    return this;
  }

  public ProjectVersionRefreshRequest addProjectVersionIdsItem(Long projectVersionIdsItem) {
    this.projectVersionIds.add(projectVersionIdsItem);
    return this;
  }

   /**
   * List containing single project version ID to refresh
   * @return projectVersionIds
  **/
  @ApiModelProperty(required = true, value = "List containing single project version ID to refresh")
  public List<Long> getProjectVersionIds() {
    return projectVersionIds;
  }

  public void setProjectVersionIds(List<Long> projectVersionIds) {
    this.projectVersionIds = projectVersionIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectVersionRefreshRequest projectVersionRefreshRequest = (ProjectVersionRefreshRequest) o;
    return Objects.equals(this.projectVersionIds, projectVersionRefreshRequest.projectVersionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectVersionIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectVersionRefreshRequest {\n");
    
    sb.append("    projectVersionIds: ").append(toIndentedString(projectVersionIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

