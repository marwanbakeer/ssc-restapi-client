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
 * Request for revoking tokens by value
 */
@ApiModel(description = "Request for revoking tokens by value")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class AuthTokenRevokeRequest {
  @SerializedName("tokens")
  private List<String> tokens = new ArrayList<String>();

  public AuthTokenRevokeRequest tokens(List<String> tokens) {
    this.tokens = tokens;
    return this;
  }

  public AuthTokenRevokeRequest addTokensItem(String tokensItem) {
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * A list of tokens (atleast one) to revoke
   * @return tokens
  **/
  @ApiModelProperty(required = true, value = "A list of tokens (atleast one) to revoke")
  public List<String> getTokens() {
    return tokens;
  }

  public void setTokens(List<String> tokens) {
    this.tokens = tokens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthTokenRevokeRequest authTokenRevokeRequest = (AuthTokenRevokeRequest) o;
    return Objects.equals(this.tokens, authTokenRevokeRequest.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthTokenRevokeRequest {\n");
    
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
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

