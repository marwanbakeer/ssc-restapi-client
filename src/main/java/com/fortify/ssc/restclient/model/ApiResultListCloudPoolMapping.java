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
import com.fortify.ssc.restclient.model.CloudPoolMapping;
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
 * ApiResultListCloudPoolMapping
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class ApiResultListCloudPoolMapping {
  @SerializedName("count")
  private Long count = null;

  @SerializedName("data")
  private List<CloudPoolMapping> data = null;

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

  public ApiResultListCloudPoolMapping count(Long count) {
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

  public ApiResultListCloudPoolMapping data(List<CloudPoolMapping> data) {
    this.data = data;
    return this;
  }

  public ApiResultListCloudPoolMapping addDataItem(CloudPoolMapping dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<CloudPoolMapping>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<CloudPoolMapping> getData() {
    return data;
  }

  public void setData(List<CloudPoolMapping> data) {
    this.data = data;
  }

  public ApiResultListCloudPoolMapping errorCode(Integer errorCode) {
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

  public ApiResultListCloudPoolMapping links(Object links) {
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

  public ApiResultListCloudPoolMapping message(String message) {
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

  public ApiResultListCloudPoolMapping responseCode(Integer responseCode) {
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

  public ApiResultListCloudPoolMapping stackTrace(String stackTrace) {
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

  public ApiResultListCloudPoolMapping successCount(Long successCount) {
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
    ApiResultListCloudPoolMapping apiResultListCloudPoolMapping = (ApiResultListCloudPoolMapping) o;
    return Objects.equals(this.count, apiResultListCloudPoolMapping.count) &&
        Objects.equals(this.data, apiResultListCloudPoolMapping.data) &&
        Objects.equals(this.errorCode, apiResultListCloudPoolMapping.errorCode) &&
        Objects.equals(this.links, apiResultListCloudPoolMapping.links) &&
        Objects.equals(this.message, apiResultListCloudPoolMapping.message) &&
        Objects.equals(this.responseCode, apiResultListCloudPoolMapping.responseCode) &&
        Objects.equals(this.stackTrace, apiResultListCloudPoolMapping.stackTrace) &&
        Objects.equals(this.successCount, apiResultListCloudPoolMapping.successCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data, errorCode, links, message, responseCode, stackTrace, successCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResultListCloudPoolMapping {\n");
    
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

