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
 * Dynamic Scan Requests Summary object
 */
@ApiModel(description = "Dynamic Scan Requests Summary object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class DynamicScanRequestsSummary {
  @SerializedName("canEditOrCancel")
  private Boolean canEditOrCancel = null;

  @SerializedName("canSubmit")
  private Boolean canSubmit = null;

  @SerializedName("dynamicScanDisabled")
  private Boolean dynamicScanDisabled = null;

  @SerializedName("dynamicScanDisabledMessage")
  private String dynamicScanDisabledMessage = null;

  @SerializedName("lastScanId")
  private Long lastScanId = null;

  @SerializedName("lastScanSummary")
  private String lastScanSummary = null;

  public DynamicScanRequestsSummary canEditOrCancel(Boolean canEditOrCancel) {
    this.canEditOrCancel = canEditOrCancel;
    return this;
  }

   /**
   * Flag that indicates whether the user may edit or cancel the dynamic scan request
   * @return canEditOrCancel
  **/
  @ApiModelProperty(example = "false", value = "Flag that indicates whether the user may edit or cancel the dynamic scan request")
  public Boolean isCanEditOrCancel() {
    return canEditOrCancel;
  }

  public void setCanEditOrCancel(Boolean canEditOrCancel) {
    this.canEditOrCancel = canEditOrCancel;
  }

  public DynamicScanRequestsSummary canSubmit(Boolean canSubmit) {
    this.canSubmit = canSubmit;
    return this;
  }

   /**
   * Flag that indicates whether the user can submit dynamic scan requests
   * @return canSubmit
  **/
  @ApiModelProperty(example = "false", value = "Flag that indicates whether the user can submit dynamic scan requests")
  public Boolean isCanSubmit() {
    return canSubmit;
  }

  public void setCanSubmit(Boolean canSubmit) {
    this.canSubmit = canSubmit;
  }

  public DynamicScanRequestsSummary dynamicScanDisabled(Boolean dynamicScanDisabled) {
    this.dynamicScanDisabled = dynamicScanDisabled;
    return this;
  }

   /**
   * Flag that indicates whether dynamic scan request is disabled
   * @return dynamicScanDisabled
  **/
  @ApiModelProperty(example = "false", value = "Flag that indicates whether dynamic scan request is disabled")
  public Boolean isDynamicScanDisabled() {
    return dynamicScanDisabled;
  }

  public void setDynamicScanDisabled(Boolean dynamicScanDisabled) {
    this.dynamicScanDisabled = dynamicScanDisabled;
  }

  public DynamicScanRequestsSummary dynamicScanDisabledMessage(String dynamicScanDisabledMessage) {
    this.dynamicScanDisabledMessage = dynamicScanDisabledMessage;
    return this;
  }

   /**
   * A message indicating the reason for why dynamic scan is disabled
   * @return dynamicScanDisabledMessage
  **/
  @ApiModelProperty(value = "A message indicating the reason for why dynamic scan is disabled")
  public String getDynamicScanDisabledMessage() {
    return dynamicScanDisabledMessage;
  }

  public void setDynamicScanDisabledMessage(String dynamicScanDisabledMessage) {
    this.dynamicScanDisabledMessage = dynamicScanDisabledMessage;
  }

  public DynamicScanRequestsSummary lastScanId(Long lastScanId) {
    this.lastScanId = lastScanId;
    return this;
  }

   /**
   * The id of the last dynamic scan request
   * @return lastScanId
  **/
  @ApiModelProperty(value = "The id of the last dynamic scan request")
  public Long getLastScanId() {
    return lastScanId;
  }

  public void setLastScanId(Long lastScanId) {
    this.lastScanId = lastScanId;
  }

  public DynamicScanRequestsSummary lastScanSummary(String lastScanSummary) {
    this.lastScanSummary = lastScanSummary;
    return this;
  }

   /**
   * Holds information about the last dynamic scan request
   * @return lastScanSummary
  **/
  @ApiModelProperty(value = "Holds information about the last dynamic scan request")
  public String getLastScanSummary() {
    return lastScanSummary;
  }

  public void setLastScanSummary(String lastScanSummary) {
    this.lastScanSummary = lastScanSummary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicScanRequestsSummary dynamicScanRequestsSummary = (DynamicScanRequestsSummary) o;
    return Objects.equals(this.canEditOrCancel, dynamicScanRequestsSummary.canEditOrCancel) &&
        Objects.equals(this.canSubmit, dynamicScanRequestsSummary.canSubmit) &&
        Objects.equals(this.dynamicScanDisabled, dynamicScanRequestsSummary.dynamicScanDisabled) &&
        Objects.equals(this.dynamicScanDisabledMessage, dynamicScanRequestsSummary.dynamicScanDisabledMessage) &&
        Objects.equals(this.lastScanId, dynamicScanRequestsSummary.lastScanId) &&
        Objects.equals(this.lastScanSummary, dynamicScanRequestsSummary.lastScanSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canEditOrCancel, canSubmit, dynamicScanDisabled, dynamicScanDisabledMessage, lastScanId, lastScanSummary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicScanRequestsSummary {\n");
    
    sb.append("    canEditOrCancel: ").append(toIndentedString(canEditOrCancel)).append("\n");
    sb.append("    canSubmit: ").append(toIndentedString(canSubmit)).append("\n");
    sb.append("    dynamicScanDisabled: ").append(toIndentedString(dynamicScanDisabled)).append("\n");
    sb.append("    dynamicScanDisabledMessage: ").append(toIndentedString(dynamicScanDisabledMessage)).append("\n");
    sb.append("    lastScanId: ").append(toIndentedString(lastScanId)).append("\n");
    sb.append("    lastScanSummary: ").append(toIndentedString(lastScanSummary)).append("\n");
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

