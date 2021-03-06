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
import com.fortify.ssc.restclient.model.TraceNodeDto;
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
 * Issue analysis trace node DTO.
 */
@ApiModel(description = "Issue analysis trace node DTO.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class TraceNodeDto {
  @SerializedName("childNodes")
  private List<TraceNodeDto> childNodes = new ArrayList<TraceNodeDto>();

  @SerializedName("detail")
  private Boolean detail = null;

  @SerializedName("evidence")
  private String evidence = null;

  @SerializedName("file")
  private String file = null;

  @SerializedName("fullPath")
  private String fullPath = null;

  @SerializedName("line")
  private Integer line = null;

  /**
   * Type of the trace node.
   */
  @JsonAdapter(NodeTypeEnum.Adapter.class)
  public enum NodeTypeEnum {
    IN_CALL("IN_CALL"),
    
    OUT_CALL("OUT_CALL"),
    
    IN_OUT_CALL("IN_OUT_CALL"),
    
    READ("READ"),
    
    READ_GLOBAL("READ_GLOBAL"),
    
    ASSIGN("ASSIGN"),
    
    ASSIGN_GLOBAL("ASSIGN_GLOBAL"),
    
    ALIAS("ALIAS"),
    
    COMPARE("COMPARE"),
    
    RETURN("RETURN"),
    
    REF("REF"),
    
    DEREF("DEREF"),
    
    END_SCOPE("END_SCOPE"),
    
    JUMP("JUMP"),
    
    BRANCH_TAKEN("BRANCH_TAKEN"),
    
    BRANCH_NOT_TAKEN("BRANCH_NOT_TAKEN"),
    
    EXTERNAL_ENTRY("EXTERNAL_ENTRY"),
    
    RUNTIME_SINK("RUNTIME_SINK"),
    
    RUNTIME_SOURCE("RUNTIME_SOURCE"),
    
    RUNTIME_VALIDATION("RUNTIME_VALIDATION"),
    
    RUNTIME_TRACE("RUNTIME_TRACE"),
    
    TRACE_RUNTIME_SOURCE("TRACE_RUNTIME_SOURCE"),
    
    TRACE_RUNTIME_SINK("TRACE_RUNTIME_SINK"),
    
    TAINT_CHANGE("TAINT_CHANGE"),
    
    GENERIC("GENERIC");

    private String value;

    NodeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NodeTypeEnum fromValue(String text) {
      for (NodeTypeEnum b : NodeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NodeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NodeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NodeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NodeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("nodeType")
  private NodeTypeEnum nodeType = null;

  @SerializedName("primary")
  private Boolean primary = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("toolTip")
  private String toolTip = null;

  public TraceNodeDto childNodes(List<TraceNodeDto> childNodes) {
    this.childNodes = childNodes;
    return this;
  }

  public TraceNodeDto addChildNodesItem(TraceNodeDto childNodesItem) {
    this.childNodes.add(childNodesItem);
    return this;
  }

   /**
   * Child nodes of the current node.
   * @return childNodes
  **/
  @ApiModelProperty(required = true, value = "Child nodes of the current node.")
  public List<TraceNodeDto> getChildNodes() {
    return childNodes;
  }

  public void setChildNodes(List<TraceNodeDto> childNodes) {
    this.childNodes = childNodes;
  }

   /**
   * Detail node marker.
   * @return detail
  **/
  @ApiModelProperty(example = "false", required = true, value = "Detail node marker.")
  public Boolean isDetail() {
    return detail;
  }

   /**
   * Node evidence text.
   * @return evidence
  **/
  @ApiModelProperty(required = true, value = "Node evidence text.")
  public String getEvidence() {
    return evidence;
  }

   /**
   * Name of the file associated with this node.
   * @return file
  **/
  @ApiModelProperty(required = true, value = "Name of the file associated with this node.")
  public String getFile() {
    return file;
  }

   /**
   * Full path to source file associated with this node.
   * @return fullPath
  **/
  @ApiModelProperty(required = true, value = "Full path to source file associated with this node.")
  public String getFullPath() {
    return fullPath;
  }

   /**
   * Source file line number where issue was found.
   * @return line
  **/
  @ApiModelProperty(required = true, value = "Source file line number where issue was found.")
  public Integer getLine() {
    return line;
  }

   /**
   * Type of the trace node.
   * @return nodeType
  **/
  @ApiModelProperty(required = true, value = "Type of the trace node.")
  public NodeTypeEnum getNodeType() {
    return nodeType;
  }

   /**
   * Primry node marker.
   * @return primary
  **/
  @ApiModelProperty(example = "false", required = true, value = "Primry node marker.")
  public Boolean isPrimary() {
    return primary;
  }

   /**
   * Node display text.
   * @return text
  **/
  @ApiModelProperty(required = true, value = "Node display text.")
  public String getText() {
    return text;
  }

   /**
   * Node description/tooltip.
   * @return toolTip
  **/
  @ApiModelProperty(required = true, value = "Node description/tooltip.")
  public String getToolTip() {
    return toolTip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceNodeDto traceNodeDto = (TraceNodeDto) o;
    return Objects.equals(this.childNodes, traceNodeDto.childNodes) &&
        Objects.equals(this.detail, traceNodeDto.detail) &&
        Objects.equals(this.evidence, traceNodeDto.evidence) &&
        Objects.equals(this.file, traceNodeDto.file) &&
        Objects.equals(this.fullPath, traceNodeDto.fullPath) &&
        Objects.equals(this.line, traceNodeDto.line) &&
        Objects.equals(this.nodeType, traceNodeDto.nodeType) &&
        Objects.equals(this.primary, traceNodeDto.primary) &&
        Objects.equals(this.text, traceNodeDto.text) &&
        Objects.equals(this.toolTip, traceNodeDto.toolTip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childNodes, detail, evidence, file, fullPath, line, nodeType, primary, text, toolTip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceNodeDto {\n");
    
    sb.append("    childNodes: ").append(toIndentedString(childNodes)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    evidence: ").append(toIndentedString(evidence)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    toolTip: ").append(toIndentedString(toolTip)).append("\n");
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

