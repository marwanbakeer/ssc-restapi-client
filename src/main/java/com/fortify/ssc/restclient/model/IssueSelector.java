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
 * Issue selector DTO object
 */
@ApiModel(description = "Issue selector DTO object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class IssueSelector {
  @SerializedName("description")
  private String description = null;

  @SerializedName("displayName")
  private String displayName = null;

  /**
   * Issue selector entity type
   */
  @JsonAdapter(EntityTypeEnum.Adapter.class)
  public enum EntityTypeEnum {
    UNDEFINED("UNDEFINED"),
    
    ISSUE("ISSUE"),
    
    EXTERNALLIST("EXTERNALLIST"),
    
    CUSTOMTAG("CUSTOMTAG"),
    
    HYBRIDTAG("HYBRIDTAG"),
    
    FOLDER("FOLDER");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntityTypeEnum fromValue(String text) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EntityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EntityTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("entityType")
  private EntityTypeEnum entityType = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("value")
  private String value = null;

  public IssueSelector description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IssueSelector displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name for issue selector
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "Display name for issue selector")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public IssueSelector entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Issue selector entity type
   * @return entityType
  **/
  @ApiModelProperty(required = true, value = "Issue selector entity type")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }

  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }

  public IssueSelector guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Issue selector global unique identifier
   * @return guid
  **/
  @ApiModelProperty(required = true, value = "Issue selector global unique identifier")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public IssueSelector value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Issue selector value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Issue selector value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueSelector issueSelector = (IssueSelector) o;
    return Objects.equals(this.description, issueSelector.description) &&
        Objects.equals(this.displayName, issueSelector.displayName) &&
        Objects.equals(this.entityType, issueSelector.entityType) &&
        Objects.equals(this.guid, issueSelector.guid) &&
        Objects.equals(this.value, issueSelector.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, entityType, guid, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueSelector {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

