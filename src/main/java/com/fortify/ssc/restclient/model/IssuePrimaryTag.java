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
 * Store the information about issue primary custom tag
 */
@ApiModel(description = "Store the information about issue primary custom tag")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class IssuePrimaryTag {
  @SerializedName("tagGuid")
  private String tagGuid = null;

  @SerializedName("tagId")
  private Long tagId = null;

  @SerializedName("tagName")
  private String tagName = null;

  @SerializedName("tagValue")
  private String tagValue = null;

  public IssuePrimaryTag tagGuid(String tagGuid) {
    this.tagGuid = tagGuid;
    return this;
  }

   /**
   * Get tagGuid
   * @return tagGuid
  **/
  @ApiModelProperty(value = "")
  public String getTagGuid() {
    return tagGuid;
  }

  public void setTagGuid(String tagGuid) {
    this.tagGuid = tagGuid;
  }

  public IssuePrimaryTag tagId(Long tagId) {
    this.tagId = tagId;
    return this;
  }

   /**
   * Get tagId
   * @return tagId
  **/
  @ApiModelProperty(value = "")
  public Long getTagId() {
    return tagId;
  }

  public void setTagId(Long tagId) {
    this.tagId = tagId;
  }

  public IssuePrimaryTag tagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

   /**
   * Get tagName
   * @return tagName
  **/
  @ApiModelProperty(value = "")
  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }

  public IssuePrimaryTag tagValue(String tagValue) {
    this.tagValue = tagValue;
    return this;
  }

   /**
   * Get tagValue
   * @return tagValue
  **/
  @ApiModelProperty(value = "")
  public String getTagValue() {
    return tagValue;
  }

  public void setTagValue(String tagValue) {
    this.tagValue = tagValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuePrimaryTag issuePrimaryTag = (IssuePrimaryTag) o;
    return Objects.equals(this.tagGuid, issuePrimaryTag.tagGuid) &&
        Objects.equals(this.tagId, issuePrimaryTag.tagId) &&
        Objects.equals(this.tagName, issuePrimaryTag.tagName) &&
        Objects.equals(this.tagValue, issuePrimaryTag.tagValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagGuid, tagId, tagName, tagValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuePrimaryTag {\n");
    
    sb.append("    tagGuid: ").append(toIndentedString(tagGuid)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    tagValue: ").append(toIndentedString(tagValue)).append("\n");
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

