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
import com.fortify.ssc.restclient.model.ReportParameterOption;
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
 * Report Parameter DTO object
 */
@ApiModel(description = "Report Parameter DTO object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class ReportParameter {
  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("paramOrder")
  private Integer paramOrder = null;

  @SerializedName("reportDefinitionId")
  private Long reportDefinitionId = null;

  @SerializedName("reportParameterOptions")
  private List<ReportParameterOption> reportParameterOptions = null;

  /**
   * Report parameter type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SINGLE_PROJECT("SINGLE_PROJECT"),
    
    SINGLE_RUNTIME_APP("SINGLE_RUNTIME_APP"),
    
    SINGLE_SSA_PROJECT("SINGLE_SSA_PROJECT"),
    
    MULTI_PROJECT("MULTI_PROJECT"),
    
    MULTI_RUNTIME_APP("MULTI_RUNTIME_APP"),
    
    MULTI_SSA_PROJECT("MULTI_SSA_PROJECT"),
    
    PROJECT_ATTRIBUTE("PROJECT_ATTRIBUTE"),
    
    STRING("STRING"),
    
    BOOLEAN("BOOLEAN"),
    
    DATE("DATE"),
    
    SINGLE_SELECT_DEFAULT("SINGLE_SELECT_DEFAULT"),
    
    METADEF_GUID("METADEF_GUID");

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

  public ReportParameter description(String description) {
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

  public ReportParameter id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ReportParameter identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Report parameter identifier
   * @return identifier
  **/
  @ApiModelProperty(required = true, value = "Report parameter identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public ReportParameter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReportParameter paramOrder(Integer paramOrder) {
    this.paramOrder = paramOrder;
    return this;
  }

   /**
   * Order in which the parameter should appear
   * @return paramOrder
  **/
  @ApiModelProperty(value = "Order in which the parameter should appear")
  public Integer getParamOrder() {
    return paramOrder;
  }

  public void setParamOrder(Integer paramOrder) {
    this.paramOrder = paramOrder;
  }

  public ReportParameter reportDefinitionId(Long reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
    return this;
  }

   /**
   * Report definition identifier
   * @return reportDefinitionId
  **/
  @ApiModelProperty(required = true, value = "Report definition identifier")
  public Long getReportDefinitionId() {
    return reportDefinitionId;
  }

  public void setReportDefinitionId(Long reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
  }

  public ReportParameter reportParameterOptions(List<ReportParameterOption> reportParameterOptions) {
    this.reportParameterOptions = reportParameterOptions;
    return this;
  }

  public ReportParameter addReportParameterOptionsItem(ReportParameterOption reportParameterOptionsItem) {
    if (this.reportParameterOptions == null) {
      this.reportParameterOptions = new ArrayList<ReportParameterOption>();
    }
    this.reportParameterOptions.add(reportParameterOptionsItem);
    return this;
  }

   /**
   * Report parameter options
   * @return reportParameterOptions
  **/
  @ApiModelProperty(value = "Report parameter options")
  public List<ReportParameterOption> getReportParameterOptions() {
    return reportParameterOptions;
  }

  public void setReportParameterOptions(List<ReportParameterOption> reportParameterOptions) {
    this.reportParameterOptions = reportParameterOptions;
  }

  public ReportParameter type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Report parameter type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Report parameter type")
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
    ReportParameter reportParameter = (ReportParameter) o;
    return Objects.equals(this.description, reportParameter.description) &&
        Objects.equals(this.id, reportParameter.id) &&
        Objects.equals(this.identifier, reportParameter.identifier) &&
        Objects.equals(this.name, reportParameter.name) &&
        Objects.equals(this.paramOrder, reportParameter.paramOrder) &&
        Objects.equals(this.reportDefinitionId, reportParameter.reportDefinitionId) &&
        Objects.equals(this.reportParameterOptions, reportParameter.reportParameterOptions) &&
        Objects.equals(this.type, reportParameter.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, identifier, name, paramOrder, reportDefinitionId, reportParameterOptions, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportParameter {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paramOrder: ").append(toIndentedString(paramOrder)).append("\n");
    sb.append("    reportDefinitionId: ").append(toIndentedString(reportDefinitionId)).append("\n");
    sb.append("    reportParameterOptions: ").append(toIndentedString(reportParameterOptions)).append("\n");
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

