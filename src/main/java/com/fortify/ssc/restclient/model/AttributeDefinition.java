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
import com.fortify.ssc.restclient.model.AttributeOption;
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
 * Attribute Definition DTO object.
 */
@ApiModel(description = "Attribute Definition DTO object.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class AttributeDefinition {
  /**
   * Application Entity Type
   */
  @JsonAdapter(AppEntityTypeEnum.Adapter.class)
  public enum AppEntityTypeEnum {
    PROJECT_VERSION("PROJECT_VERSION"),
    
    RUNTIME_APP("RUNTIME_APP"),
    
    NONE("NONE"),
    
    ALL("ALL");

    private String value;

    AppEntityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AppEntityTypeEnum fromValue(String text) {
      for (AppEntityTypeEnum b : AppEntityTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AppEntityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AppEntityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AppEntityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AppEntityTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("appEntityType")
  private AppEntityTypeEnum appEntityType = null;

  /**
   * Attribute Definition Category
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    TECHNICAL("TECHNICAL"),
    
    BUSINESS("BUSINESS"),
    
    DYNAMIC_SCAN_REQUEST("DYNAMIC_SCAN_REQUEST"),
    
    ORGANIZATION("ORGANIZATION");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String text) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CategoryEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("category")
  private CategoryEnum category = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("hasDefault")
  private Boolean hasDefault = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("objectVersion")
  private Integer objectVersion = null;

  @SerializedName("options")
  private List<AttributeOption> options = null;

  @SerializedName("publishVersion")
  private Integer publishVersion = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("sequenceNumber")
  private Long sequenceNumber = null;

  /**
   * System Usage Type
   */
  @JsonAdapter(SystemUsageEnum.Adapter.class)
  public enum SystemUsageEnum {
    HP_DEFINED_DELETABLE("HP_DEFINED_DELETABLE"),
    
    HP_DEFINED_NON_DELETABLE("HP_DEFINED_NON_DELETABLE"),
    
    USER_DEFINED_DELETABLE("USER_DEFINED_DELETABLE"),
    
    USER_DEFINED_NON_DELETABLE("USER_DEFINED_NON_DELETABLE");

    private String value;

    SystemUsageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SystemUsageEnum fromValue(String text) {
      for (SystemUsageEnum b : SystemUsageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SystemUsageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SystemUsageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SystemUsageEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SystemUsageEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("systemUsage")
  private SystemUsageEnum systemUsage = null;

  /**
   * Attribute Definition Type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TEXT("TEXT"),
    
    SINGLE("SINGLE"),
    
    MULTIPLE("MULTIPLE"),
    
    LONG_TEXT("LONG_TEXT"),
    
    SENSITIVE_TEXT("SENSITIVE_TEXT"),
    
    BOOLEAN("BOOLEAN"),
    
    INTEGER("INTEGER"),
    
    DATE("DATE"),
    
    FILE("FILE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public AttributeDefinition appEntityType(AppEntityTypeEnum appEntityType) {
    this.appEntityType = appEntityType;
    return this;
  }

   /**
   * Application Entity Type
   * @return appEntityType
  **/
  @ApiModelProperty(required = true, value = "Application Entity Type")
  public AppEntityTypeEnum getAppEntityType() {
    return appEntityType;
  }

  public void setAppEntityType(AppEntityTypeEnum appEntityType) {
    this.appEntityType = appEntityType;
  }

  public AttributeDefinition category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * Attribute Definition Category
   * @return category
  **/
  @ApiModelProperty(required = true, value = "Attribute Definition Category")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public AttributeDefinition description(String description) {
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

  public AttributeDefinition guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Unique string identifier for this Attribute Definition
   * @return guid
  **/
  @ApiModelProperty(required = true, value = "Unique string identifier for this Attribute Definition")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public AttributeDefinition hasDefault(Boolean hasDefault) {
    this.hasDefault = hasDefault;
    return this;
  }

   /**
   * Set to true if this Attribute Definition should be the default
   * @return hasDefault
  **/
  @ApiModelProperty(example = "false", required = true, value = "Set to true if this Attribute Definition should be the default")
  public Boolean isHasDefault() {
    return hasDefault;
  }

  public void setHasDefault(Boolean hasDefault) {
    this.hasDefault = hasDefault;
  }

  public AttributeDefinition hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Set to true if this Attribute Definition is hidden
   * @return hidden
  **/
  @ApiModelProperty(example = "false", value = "Set to true if this Attribute Definition is hidden")
  public Boolean isHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

   /**
   * ID required when referencing an existing Attribute Definition
   * @return id
  **/
  @ApiModelProperty(value = "ID required when referencing an existing Attribute Definition")
  public Long getId() {
    return id;
  }

  public AttributeDefinition name(String name) {
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

  public AttributeDefinition objectVersion(Integer objectVersion) {
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

  public AttributeDefinition options(List<AttributeOption> options) {
    this.options = options;
    return this;
  }

  public AttributeDefinition addOptionsItem(AttributeOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<AttributeOption>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * List of options (i.e. values) associated with this Attribute Definition
   * @return options
  **/
  @ApiModelProperty(value = "List of options (i.e. values) associated with this Attribute Definition")
  public List<AttributeOption> getOptions() {
    return options;
  }

  public void setOptions(List<AttributeOption> options) {
    this.options = options;
  }

  public AttributeDefinition publishVersion(Integer publishVersion) {
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

  public AttributeDefinition required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Set to true if this Attribute Definition is required
   * @return required
  **/
  @ApiModelProperty(example = "false", required = true, value = "Set to true if this Attribute Definition is required")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public AttributeDefinition sequenceNumber(Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * Get sequenceNumber
   * @return sequenceNumber
  **/
  @ApiModelProperty(value = "")
  public Long getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public AttributeDefinition systemUsage(SystemUsageEnum systemUsage) {
    this.systemUsage = systemUsage;
    return this;
  }

   /**
   * System Usage Type
   * @return systemUsage
  **/
  @ApiModelProperty(required = true, value = "System Usage Type")
  public SystemUsageEnum getSystemUsage() {
    return systemUsage;
  }

  public void setSystemUsage(SystemUsageEnum systemUsage) {
    this.systemUsage = systemUsage;
  }

  public AttributeDefinition type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Attribute Definition Type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Attribute Definition Type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeDefinition attributeDefinition = (AttributeDefinition) o;
    return Objects.equals(this.appEntityType, attributeDefinition.appEntityType) &&
        Objects.equals(this.category, attributeDefinition.category) &&
        Objects.equals(this.description, attributeDefinition.description) &&
        Objects.equals(this.guid, attributeDefinition.guid) &&
        Objects.equals(this.hasDefault, attributeDefinition.hasDefault) &&
        Objects.equals(this.hidden, attributeDefinition.hidden) &&
        Objects.equals(this.id, attributeDefinition.id) &&
        Objects.equals(this.name, attributeDefinition.name) &&
        Objects.equals(this.objectVersion, attributeDefinition.objectVersion) &&
        Objects.equals(this.options, attributeDefinition.options) &&
        Objects.equals(this.publishVersion, attributeDefinition.publishVersion) &&
        Objects.equals(this.required, attributeDefinition.required) &&
        Objects.equals(this.sequenceNumber, attributeDefinition.sequenceNumber) &&
        Objects.equals(this.systemUsage, attributeDefinition.systemUsage) &&
        Objects.equals(this.type, attributeDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appEntityType, category, description, guid, hasDefault, hidden, id, name, objectVersion, options, publishVersion, required, sequenceNumber, systemUsage, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeDefinition {\n");
    
    sb.append("    appEntityType: ").append(toIndentedString(appEntityType)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    hasDefault: ").append(toIndentedString(hasDefault)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectVersion: ").append(toIndentedString(objectVersion)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    publishVersion: ").append(toIndentedString(publishVersion)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    systemUsage: ").append(toIndentedString(systemUsage)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

