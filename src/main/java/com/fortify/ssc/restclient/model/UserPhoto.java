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
 * User photo object
 */
@ApiModel(description = "User photo object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class UserPhoto {
  @SerializedName("photo")
  private byte[] photo = null;

  @SerializedName("photoMimeType")
  private String photoMimeType = null;

  public UserPhoto photo(byte[] photo) {
    this.photo = photo;
    return this;
  }

   /**
   * Photo in byte array
   * @return photo
  **/
  @ApiModelProperty(required = true, value = "Photo in byte array")
  public byte[] getPhoto() {
    return photo;
  }

  public void setPhoto(byte[] photo) {
    this.photo = photo;
  }

  public UserPhoto photoMimeType(String photoMimeType) {
    this.photoMimeType = photoMimeType;
    return this;
  }

   /**
   * Mime type of user photo. Eg .bmp, .jpg etc
   * @return photoMimeType
  **/
  @ApiModelProperty(required = true, value = "Mime type of user photo. Eg .bmp, .jpg etc")
  public String getPhotoMimeType() {
    return photoMimeType;
  }

  public void setPhotoMimeType(String photoMimeType) {
    this.photoMimeType = photoMimeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPhoto userPhoto = (UserPhoto) o;
    return Objects.equals(this.photo, userPhoto.photo) &&
        Objects.equals(this.photoMimeType, userPhoto.photoMimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(photo, photoMimeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPhoto {\n");
    
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    photoMimeType: ").append(toIndentedString(photoMimeType)).append("\n");
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

