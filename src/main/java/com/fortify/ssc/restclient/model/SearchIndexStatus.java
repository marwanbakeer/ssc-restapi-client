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

/**
 * Status of search index
 */
@ApiModel(description = "Status of search index")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class SearchIndexStatus {
  @SerializedName("configured")
  private Boolean configured = null;

  @SerializedName("healthyIndex")
  private Boolean healthyIndex = null;

  @SerializedName("indexingJobRunning")
  private Boolean indexingJobRunning = null;

   /**
   * Is index configured
   * @return configured
  **/
  @ApiModelProperty(example = "false", value = "Is index configured")
  public Boolean isConfigured() {
    return configured;
  }

   /**
   * Is the index Healthy
   * @return healthyIndex
  **/
  @ApiModelProperty(example = "false", value = "Is the index Healthy")
  public Boolean isHealthyIndex() {
    return healthyIndex;
  }

   /**
   * Is the indexing job running
   * @return indexingJobRunning
  **/
  @ApiModelProperty(example = "false", value = "Is the indexing job running")
  public Boolean isIndexingJobRunning() {
    return indexingJobRunning;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchIndexStatus searchIndexStatus = (SearchIndexStatus) o;
    return Objects.equals(this.configured, searchIndexStatus.configured) &&
        Objects.equals(this.healthyIndex, searchIndexStatus.healthyIndex) &&
        Objects.equals(this.indexingJobRunning, searchIndexStatus.indexingJobRunning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configured, healthyIndex, indexingJobRunning);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchIndexStatus {\n");
    
    sb.append("    configured: ").append(toIndentedString(configured)).append("\n");
    sb.append("    healthyIndex: ").append(toIndentedString(healthyIndex)).append("\n");
    sb.append("    indexingJobRunning: ").append(toIndentedString(indexingJobRunning)).append("\n");
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

