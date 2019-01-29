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
import com.fortify.ssc.restclient.model.IssueAuditComment;
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
 * ApiResultListIssueAuditComment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class ApiResultListIssueAuditComment {
  @SerializedName("count")
  private Long count = null;

  @SerializedName("data")
  private List<IssueAuditComment> data = null;

  @SerializedName("errorCode")
  private Integer errorCode = null;

  @SerializedName("links")
  private Object links = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("responseCode")
  private Integer responseCode = null;

  @SerializedName("stackTrace")
  private String stackTrace = null;

  @SerializedName("successCount")
  private Long successCount = null;

  public ApiResultListIssueAuditComment count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public ApiResultListIssueAuditComment data(List<IssueAuditComment> data) {
    this.data = data;
    return this;
  }

  public ApiResultListIssueAuditComment addDataItem(IssueAuditComment dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<IssueAuditComment>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<IssueAuditComment> getData() {
    return data;
  }

  public void setData(List<IssueAuditComment> data) {
    this.data = data;
  }

  public ApiResultListIssueAuditComment errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(value = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public ApiResultListIssueAuditComment links(Object links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Object getLinks() {
    return links;
  }

  public void setLinks(Object links) {
    this.links = links;
  }

  public ApiResultListIssueAuditComment message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ApiResultListIssueAuditComment responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Get responseCode
   * @return responseCode
  **/
  @ApiModelProperty(value = "")
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  public ApiResultListIssueAuditComment stackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

   /**
   * Get stackTrace
   * @return stackTrace
  **/
  @ApiModelProperty(value = "")
  public String getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
  }

  public ApiResultListIssueAuditComment successCount(Long successCount) {
    this.successCount = successCount;
    return this;
  }

   /**
   * Get successCount
   * @return successCount
  **/
  @ApiModelProperty(value = "")
  public Long getSuccessCount() {
    return successCount;
  }

  public void setSuccessCount(Long successCount) {
    this.successCount = successCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResultListIssueAuditComment apiResultListIssueAuditComment = (ApiResultListIssueAuditComment) o;
    return Objects.equals(this.count, apiResultListIssueAuditComment.count) &&
        Objects.equals(this.data, apiResultListIssueAuditComment.data) &&
        Objects.equals(this.errorCode, apiResultListIssueAuditComment.errorCode) &&
        Objects.equals(this.links, apiResultListIssueAuditComment.links) &&
        Objects.equals(this.message, apiResultListIssueAuditComment.message) &&
        Objects.equals(this.responseCode, apiResultListIssueAuditComment.responseCode) &&
        Objects.equals(this.stackTrace, apiResultListIssueAuditComment.stackTrace) &&
        Objects.equals(this.successCount, apiResultListIssueAuditComment.successCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data, errorCode, links, message, responseCode, stackTrace, successCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResultListIssueAuditComment {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
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

