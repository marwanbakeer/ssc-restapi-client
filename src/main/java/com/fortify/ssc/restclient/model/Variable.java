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
 * Variables count issues, conditions, and other categories of numeric data.
 */
@ApiModel(description = "Variables count issues, conditions, and other categories of numeric data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class Variable {
  @SerializedName("attributeForOperation")
  private String attributeForOperation = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("folderName")
  private String folderName = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("inUse")
  private Boolean inUse = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("objectVersion")
  private Integer objectVersion = null;

  /**
   * Gets or Sets operation
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    COUNT("COUNT"),
    
    SUM("SUM");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OperationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("operation")
  private OperationEnum operation = null;

  @SerializedName("publishVersion")
  private Integer publishVersion = null;

  @SerializedName("searchString")
  private String searchString = null;

  /**
   * Gets or Sets variableType
   */
  @JsonAdapter(VariableTypeEnum.Adapter.class)
  public enum VariableTypeEnum {
    SYSTEM_DEFINED("SYSTEM_DEFINED"),
    
    USER_DEFINED("USER_DEFINED");

    private String value;

    VariableTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VariableTypeEnum fromValue(String text) {
      for (VariableTypeEnum b : VariableTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VariableTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VariableTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VariableTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VariableTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("variableType")
  private VariableTypeEnum variableType = null;

  public Variable attributeForOperation(String attributeForOperation) {
    this.attributeForOperation = attributeForOperation;
    return this;
  }

   /**
   * Get attributeForOperation
   * @return attributeForOperation
  **/
  @ApiModelProperty(value = "")
  public String getAttributeForOperation() {
    return attributeForOperation;
  }

  public void setAttributeForOperation(String attributeForOperation) {
    this.attributeForOperation = attributeForOperation;
  }

  public Variable description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Variable folderName(String folderName) {
    this.folderName = folderName;
    return this;
  }

   /**
   * Select a folder from the default filter set to associate with the variable.
   * @return folderName
  **/
  @ApiModelProperty(required = true, value = "Select a folder from the default filter set to associate with the variable.")
  public String getFolderName() {
    return folderName;
  }

  public void setFolderName(String folderName) {
    this.folderName = folderName;
  }

  public Variable guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(value = "")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public Variable inUse(Boolean inUse) {
    this.inUse = inUse;
    return this;
  }

   /**
   * Get inUse
   * @return inUse
  **/
  @ApiModelProperty(value = "")
  public Boolean isInUse() {
    return inUse;
  }

  public void setInUse(Boolean inUse) {
    this.inUse = inUse;
  }

  public Variable name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Variable objectVersion(Integer objectVersion) {
    this.objectVersion = objectVersion;
    return this;
  }

   /**
   * Get objectVersion
   * @return objectVersion
  **/
  @ApiModelProperty(value = "")
  public Integer getObjectVersion() {
    return objectVersion;
  }

  public void setObjectVersion(Integer objectVersion) {
    this.objectVersion = objectVersion;
  }

  public Variable operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(value = "")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public Variable publishVersion(Integer publishVersion) {
    this.publishVersion = publishVersion;
    return this;
  }

   /**
   * Get publishVersion
   * @return publishVersion
  **/
  @ApiModelProperty(value = "")
  public Integer getPublishVersion() {
    return publishVersion;
  }

  public void setPublishVersion(Integer publishVersion) {
    this.publishVersion = publishVersion;
  }

  public Variable searchString(String searchString) {
    this.searchString = searchString;
    return this;
  }

   /**
   * Get searchString
   * @return searchString
  **/
  @ApiModelProperty(example = "[Fortify Priority Order]:critical audited:false", required = true, value = "")
  public String getSearchString() {
    return searchString;
  }

  public void setSearchString(String searchString) {
    this.searchString = searchString;
  }

  public Variable variableType(VariableTypeEnum variableType) {
    this.variableType = variableType;
    return this;
  }

   /**
   * Get variableType
   * @return variableType
  **/
  @ApiModelProperty(value = "")
  public VariableTypeEnum getVariableType() {
    return variableType;
  }

  public void setVariableType(VariableTypeEnum variableType) {
    this.variableType = variableType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Variable variable = (Variable) o;
    return Objects.equals(this.attributeForOperation, variable.attributeForOperation) &&
        Objects.equals(this.description, variable.description) &&
        Objects.equals(this.folderName, variable.folderName) &&
        Objects.equals(this.guid, variable.guid) &&
        Objects.equals(this.id, variable.id) &&
        Objects.equals(this.inUse, variable.inUse) &&
        Objects.equals(this.name, variable.name) &&
        Objects.equals(this.objectVersion, variable.objectVersion) &&
        Objects.equals(this.operation, variable.operation) &&
        Objects.equals(this.publishVersion, variable.publishVersion) &&
        Objects.equals(this.searchString, variable.searchString) &&
        Objects.equals(this.variableType, variable.variableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeForOperation, description, folderName, guid, id, inUse, name, objectVersion, operation, publishVersion, searchString, variableType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Variable {\n");
    
    sb.append("    attributeForOperation: ").append(toIndentedString(attributeForOperation)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inUse: ").append(toIndentedString(inUse)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectVersion: ").append(toIndentedString(objectVersion)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    publishVersion: ").append(toIndentedString(publishVersion)).append("\n");
    sb.append("    searchString: ").append(toIndentedString(searchString)).append("\n");
    sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
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
