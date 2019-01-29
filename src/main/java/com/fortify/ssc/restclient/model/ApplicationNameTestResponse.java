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
 * Response of testing whether application exists
 */
@ApiModel(description = "Response of testing whether application exists")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class ApplicationNameTestResponse {
  @SerializedName("found")
  private Boolean found = null;

   /**
   * If application founds
   * @return found
  **/
  @ApiModelProperty(example = "false", value = "If application founds")
  public Boolean isFound() {
    return found;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationNameTestResponse applicationNameTestResponse = (ApplicationNameTestResponse) o;
    return Objects.equals(this.found, applicationNameTestResponse.found);
  }

  @Override
  public int hashCode() {
    return Objects.hash(found);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationNameTestResponse {\n");
    
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
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

