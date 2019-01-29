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
 * Request of approving artifact
 */
@ApiModel(description = "Request of approving artifact")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class ArtifactApproveRequest {
  @SerializedName("artifactIds")
  private List<Long> artifactIds = new ArrayList<Long>();

  @SerializedName("comment")
  private String comment = null;

  public ArtifactApproveRequest artifactIds(List<Long> artifactIds) {
    this.artifactIds = artifactIds;
    return this;
  }

  public ArtifactApproveRequest addArtifactIdsItem(Long artifactIdsItem) {
    this.artifactIds.add(artifactIdsItem);
    return this;
  }

   /**
   * List containing single artifact ID to approve
   * @return artifactIds
  **/
  @ApiModelProperty(required = true, value = "List containing single artifact ID to approve")
  public List<Long> getArtifactIds() {
    return artifactIds;
  }

  public void setArtifactIds(List<Long> artifactIds) {
    this.artifactIds = artifactIds;
  }

  public ArtifactApproveRequest comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Approval comments
   * @return comment
  **/
  @ApiModelProperty(required = true, value = "Approval comments")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactApproveRequest artifactApproveRequest = (ArtifactApproveRequest) o;
    return Objects.equals(this.artifactIds, artifactApproveRequest.artifactIds) &&
        Objects.equals(this.comment, artifactApproveRequest.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactIds, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactApproveRequest {\n");
    
    sb.append("    artifactIds: ").append(toIndentedString(artifactIds)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

