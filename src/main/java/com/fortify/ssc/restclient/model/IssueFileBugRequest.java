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
import com.fortify.ssc.restclient.model.BugParam;
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
 * Request of filing the bug from the issues
 */
@ApiModel(description = "Request of filing the bug from the issues")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class IssueFileBugRequest {
  @SerializedName("bugParams")
  private List<BugParam> bugParams = new ArrayList<BugParam>();

  @SerializedName("filterBy")
  private List<String> filterBy = new ArrayList<String>();

  @SerializedName("filterSet")
  private String filterSet = null;

  @SerializedName("issueInstanceIds")
  private List<String> issueInstanceIds = new ArrayList<String>();

  public IssueFileBugRequest bugParams(List<BugParam> bugParams) {
    this.bugParams = bugParams;
    return this;
  }

  public IssueFileBugRequest addBugParamsItem(BugParam bugParamsItem) {
    this.bugParams.add(bugParamsItem);
    return this;
  }

   /**
   * Bug param to file the bug
   * @return bugParams
  **/
  @ApiModelProperty(required = true, value = "Bug param to file the bug")
  public List<BugParam> getBugParams() {
    return bugParams;
  }

  public void setBugParams(List<BugParam> bugParams) {
    this.bugParams = bugParams;
  }

  public IssueFileBugRequest filterBy(List<String> filterBy) {
    this.filterBy = filterBy;
    return this;
  }

  public IssueFileBugRequest addFilterByItem(String filterByItem) {
    this.filterBy.add(filterByItem);
    return this;
  }

   /**
   * Filter by property
   * @return filterBy
  **/
  @ApiModelProperty(required = true, value = "Filter by property")
  public List<String> getFilterBy() {
    return filterBy;
  }

  public void setFilterBy(List<String> filterBy) {
    this.filterBy = filterBy;
  }

  public IssueFileBugRequest filterSet(String filterSet) {
    this.filterSet = filterSet;
    return this;
  }

   /**
   * Filterset
   * @return filterSet
  **/
  @ApiModelProperty(required = true, value = "Filterset")
  public String getFilterSet() {
    return filterSet;
  }

  public void setFilterSet(String filterSet) {
    this.filterSet = filterSet;
  }

  public IssueFileBugRequest issueInstanceIds(List<String> issueInstanceIds) {
    this.issueInstanceIds = issueInstanceIds;
    return this;
  }

  public IssueFileBugRequest addIssueInstanceIdsItem(String issueInstanceIdsItem) {
    this.issueInstanceIds.add(issueInstanceIdsItem);
    return this;
  }

   /**
   * Instance id of issues that need to be filed as bugs
   * @return issueInstanceIds
  **/
  @ApiModelProperty(required = true, value = "Instance id of issues that need to be filed as bugs")
  public List<String> getIssueInstanceIds() {
    return issueInstanceIds;
  }

  public void setIssueInstanceIds(List<String> issueInstanceIds) {
    this.issueInstanceIds = issueInstanceIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueFileBugRequest issueFileBugRequest = (IssueFileBugRequest) o;
    return Objects.equals(this.bugParams, issueFileBugRequest.bugParams) &&
        Objects.equals(this.filterBy, issueFileBugRequest.filterBy) &&
        Objects.equals(this.filterSet, issueFileBugRequest.filterSet) &&
        Objects.equals(this.issueInstanceIds, issueFileBugRequest.issueInstanceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bugParams, filterBy, filterSet, issueInstanceIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueFileBugRequest {\n");
    
    sb.append("    bugParams: ").append(toIndentedString(bugParams)).append("\n");
    sb.append("    filterBy: ").append(toIndentedString(filterBy)).append("\n");
    sb.append("    filterSet: ").append(toIndentedString(filterSet)).append("\n");
    sb.append("    issueInstanceIds: ").append(toIndentedString(issueInstanceIds)).append("\n");
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

