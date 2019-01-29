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
import com.fortify.ssc.restclient.model.CustomTag;
import com.fortify.ssc.restclient.model.EntityStateIdentifier;
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
 * Request of updating custom tag from the issues
 */
@ApiModel(description = "Request of updating custom tag from the issues")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class IssueUpdateTagRequest {
  @SerializedName("customTagAudit")
  private CustomTag customTagAudit = null;

  @SerializedName("issues")
  private List<EntityStateIdentifier> issues = new ArrayList<EntityStateIdentifier>();

  public IssueUpdateTagRequest customTagAudit(CustomTag customTagAudit) {
    this.customTagAudit = customTagAudit;
    return this;
  }

   /**
   * Custom tag values that are set for the issue.
   * @return customTagAudit
  **/
  @ApiModelProperty(required = true, value = "Custom tag values that are set for the issue.")
  public CustomTag getCustomTagAudit() {
    return customTagAudit;
  }

  public void setCustomTagAudit(CustomTag customTagAudit) {
    this.customTagAudit = customTagAudit;
  }

  public IssueUpdateTagRequest issues(List<EntityStateIdentifier> issues) {
    this.issues = issues;
    return this;
  }

  public IssueUpdateTagRequest addIssuesItem(EntityStateIdentifier issuesItem) {
    this.issues.add(issuesItem);
    return this;
  }

   /**
   * Issues to audit
   * @return issues
  **/
  @ApiModelProperty(required = true, value = "Issues to audit")
  public List<EntityStateIdentifier> getIssues() {
    return issues;
  }

  public void setIssues(List<EntityStateIdentifier> issues) {
    this.issues = issues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueUpdateTagRequest issueUpdateTagRequest = (IssueUpdateTagRequest) o;
    return Objects.equals(this.customTagAudit, issueUpdateTagRequest.customTagAudit) &&
        Objects.equals(this.issues, issueUpdateTagRequest.issues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customTagAudit, issues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueUpdateTagRequest {\n");
    
    sb.append("    customTagAudit: ").append(toIndentedString(customTagAudit)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
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

