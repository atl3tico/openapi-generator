package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * XmlItemDto
 */

@JsonTypeName("XmlItem")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class XmlItemDto {

  @JsonProperty("attribute_string")
  private String attributeString;

  @JsonProperty("attribute_number")
  private BigDecimal attributeNumber;

  @JsonProperty("attribute_integer")
  private Integer attributeInteger;

  @JsonProperty("attribute_boolean")
  private Boolean attributeBoolean;

  @JsonProperty("wrapped_array")
  
  private List<Integer> wrappedArray;

  @JsonProperty("name_string")
  private String nameString;

  @JsonProperty("name_number")
  private BigDecimal nameNumber;

  @JsonProperty("name_integer")
  private Integer nameInteger;

  @JsonProperty("name_boolean")
  private Boolean nameBoolean;

  @JsonProperty("name_array")
  
  private List<Integer> nameArray;

  @JsonProperty("name_wrapped_array")
  
  private List<Integer> nameWrappedArray;

  @JsonProperty("prefix_string")
  private String prefixString;

  @JsonProperty("prefix_number")
  private BigDecimal prefixNumber;

  @JsonProperty("prefix_integer")
  private Integer prefixInteger;

  @JsonProperty("prefix_boolean")
  private Boolean prefixBoolean;

  @JsonProperty("prefix_array")
  
  private List<Integer> prefixArray;

  @JsonProperty("prefix_wrapped_array")
  
  private List<Integer> prefixWrappedArray;

  @JsonProperty("namespace_string")
  private String namespaceString;

  @JsonProperty("namespace_number")
  private BigDecimal namespaceNumber;

  @JsonProperty("namespace_integer")
  private Integer namespaceInteger;

  @JsonProperty("namespace_boolean")
  private Boolean namespaceBoolean;

  @JsonProperty("namespace_array")
  
  private List<Integer> namespaceArray;

  @JsonProperty("namespace_wrapped_array")
  
  private List<Integer> namespaceWrappedArray;

  @JsonProperty("prefix_ns_string")
  private String prefixNsString;

  @JsonProperty("prefix_ns_number")
  private BigDecimal prefixNsNumber;

  @JsonProperty("prefix_ns_integer")
  private Integer prefixNsInteger;

  @JsonProperty("prefix_ns_boolean")
  private Boolean prefixNsBoolean;

  @JsonProperty("prefix_ns_array")
  
  private List<Integer> prefixNsArray;

  @JsonProperty("prefix_ns_wrapped_array")
  
  private List<Integer> prefixNsWrappedArray;

  public XmlItemDto attributeString(String attributeString) {
    this.attributeString = attributeString;
    return this;
  }

  /**
   * Get attributeString
   * @return attributeString
  */
  
  public String getAttributeString() {
    return attributeString;
  }

  public void setAttributeString(String attributeString) {
    this.attributeString = attributeString;
  }

  public XmlItemDto attributeNumber(BigDecimal attributeNumber) {
    this.attributeNumber = attributeNumber;
    return this;
  }

  /**
   * Get attributeNumber
   * @return attributeNumber
  */
  
  public BigDecimal getAttributeNumber() {
    return attributeNumber;
  }

  public void setAttributeNumber(BigDecimal attributeNumber) {
    this.attributeNumber = attributeNumber;
  }

  public XmlItemDto attributeInteger(Integer attributeInteger) {
    this.attributeInteger = attributeInteger;
    return this;
  }

  /**
   * Get attributeInteger
   * @return attributeInteger
  */
  
  public Integer getAttributeInteger() {
    return attributeInteger;
  }

  public void setAttributeInteger(Integer attributeInteger) {
    this.attributeInteger = attributeInteger;
  }

  public XmlItemDto attributeBoolean(Boolean attributeBoolean) {
    this.attributeBoolean = attributeBoolean;
    return this;
  }

  /**
   * Get attributeBoolean
   * @return attributeBoolean
  */
  
  public Boolean getAttributeBoolean() {
    return attributeBoolean;
  }

  public void setAttributeBoolean(Boolean attributeBoolean) {
    this.attributeBoolean = attributeBoolean;
  }

  public XmlItemDto wrappedArray(List<Integer> wrappedArray) {
    this.wrappedArray = wrappedArray;
    return this;
  }

  public XmlItemDto addWrappedArrayItem(Integer wrappedArrayItem) {
    if (this.wrappedArray == null) {
      this.wrappedArray = new ArrayList<>();
    }
    this.wrappedArray.add(wrappedArrayItem);
    return this;
  }

  /**
   * Get wrappedArray
   * @return wrappedArray
  */
  
  public List<Integer> getWrappedArray() {
    return wrappedArray;
  }

  public void setWrappedArray(List<Integer> wrappedArray) {
    this.wrappedArray = wrappedArray;
  }

  public XmlItemDto nameString(String nameString) {
    this.nameString = nameString;
    return this;
  }

  /**
   * Get nameString
   * @return nameString
  */
  
  public String getNameString() {
    return nameString;
  }

  public void setNameString(String nameString) {
    this.nameString = nameString;
  }

  public XmlItemDto nameNumber(BigDecimal nameNumber) {
    this.nameNumber = nameNumber;
    return this;
  }

  /**
   * Get nameNumber
   * @return nameNumber
  */
  
  public BigDecimal getNameNumber() {
    return nameNumber;
  }

  public void setNameNumber(BigDecimal nameNumber) {
    this.nameNumber = nameNumber;
  }

  public XmlItemDto nameInteger(Integer nameInteger) {
    this.nameInteger = nameInteger;
    return this;
  }

  /**
   * Get nameInteger
   * @return nameInteger
  */
  
  public Integer getNameInteger() {
    return nameInteger;
  }

  public void setNameInteger(Integer nameInteger) {
    this.nameInteger = nameInteger;
  }

  public XmlItemDto nameBoolean(Boolean nameBoolean) {
    this.nameBoolean = nameBoolean;
    return this;
  }

  /**
   * Get nameBoolean
   * @return nameBoolean
  */
  
  public Boolean getNameBoolean() {
    return nameBoolean;
  }

  public void setNameBoolean(Boolean nameBoolean) {
    this.nameBoolean = nameBoolean;
  }

  public XmlItemDto nameArray(List<Integer> nameArray) {
    this.nameArray = nameArray;
    return this;
  }

  public XmlItemDto addNameArrayItem(Integer nameArrayItem) {
    if (this.nameArray == null) {
      this.nameArray = new ArrayList<>();
    }
    this.nameArray.add(nameArrayItem);
    return this;
  }

  /**
   * Get nameArray
   * @return nameArray
  */
  
  public List<Integer> getNameArray() {
    return nameArray;
  }

  public void setNameArray(List<Integer> nameArray) {
    this.nameArray = nameArray;
  }

  public XmlItemDto nameWrappedArray(List<Integer> nameWrappedArray) {
    this.nameWrappedArray = nameWrappedArray;
    return this;
  }

  public XmlItemDto addNameWrappedArrayItem(Integer nameWrappedArrayItem) {
    if (this.nameWrappedArray == null) {
      this.nameWrappedArray = new ArrayList<>();
    }
    this.nameWrappedArray.add(nameWrappedArrayItem);
    return this;
  }

  /**
   * Get nameWrappedArray
   * @return nameWrappedArray
  */
  
  public List<Integer> getNameWrappedArray() {
    return nameWrappedArray;
  }

  public void setNameWrappedArray(List<Integer> nameWrappedArray) {
    this.nameWrappedArray = nameWrappedArray;
  }

  public XmlItemDto prefixString(String prefixString) {
    this.prefixString = prefixString;
    return this;
  }

  /**
   * Get prefixString
   * @return prefixString
  */
  
  public String getPrefixString() {
    return prefixString;
  }

  public void setPrefixString(String prefixString) {
    this.prefixString = prefixString;
  }

  public XmlItemDto prefixNumber(BigDecimal prefixNumber) {
    this.prefixNumber = prefixNumber;
    return this;
  }

  /**
   * Get prefixNumber
   * @return prefixNumber
  */
  
  public BigDecimal getPrefixNumber() {
    return prefixNumber;
  }

  public void setPrefixNumber(BigDecimal prefixNumber) {
    this.prefixNumber = prefixNumber;
  }

  public XmlItemDto prefixInteger(Integer prefixInteger) {
    this.prefixInteger = prefixInteger;
    return this;
  }

  /**
   * Get prefixInteger
   * @return prefixInteger
  */
  
  public Integer getPrefixInteger() {
    return prefixInteger;
  }

  public void setPrefixInteger(Integer prefixInteger) {
    this.prefixInteger = prefixInteger;
  }

  public XmlItemDto prefixBoolean(Boolean prefixBoolean) {
    this.prefixBoolean = prefixBoolean;
    return this;
  }

  /**
   * Get prefixBoolean
   * @return prefixBoolean
  */
  
  public Boolean getPrefixBoolean() {
    return prefixBoolean;
  }

  public void setPrefixBoolean(Boolean prefixBoolean) {
    this.prefixBoolean = prefixBoolean;
  }

  public XmlItemDto prefixArray(List<Integer> prefixArray) {
    this.prefixArray = prefixArray;
    return this;
  }

  public XmlItemDto addPrefixArrayItem(Integer prefixArrayItem) {
    if (this.prefixArray == null) {
      this.prefixArray = new ArrayList<>();
    }
    this.prefixArray.add(prefixArrayItem);
    return this;
  }

  /**
   * Get prefixArray
   * @return prefixArray
  */
  
  public List<Integer> getPrefixArray() {
    return prefixArray;
  }

  public void setPrefixArray(List<Integer> prefixArray) {
    this.prefixArray = prefixArray;
  }

  public XmlItemDto prefixWrappedArray(List<Integer> prefixWrappedArray) {
    this.prefixWrappedArray = prefixWrappedArray;
    return this;
  }

  public XmlItemDto addPrefixWrappedArrayItem(Integer prefixWrappedArrayItem) {
    if (this.prefixWrappedArray == null) {
      this.prefixWrappedArray = new ArrayList<>();
    }
    this.prefixWrappedArray.add(prefixWrappedArrayItem);
    return this;
  }

  /**
   * Get prefixWrappedArray
   * @return prefixWrappedArray
  */
  
  public List<Integer> getPrefixWrappedArray() {
    return prefixWrappedArray;
  }

  public void setPrefixWrappedArray(List<Integer> prefixWrappedArray) {
    this.prefixWrappedArray = prefixWrappedArray;
  }

  public XmlItemDto namespaceString(String namespaceString) {
    this.namespaceString = namespaceString;
    return this;
  }

  /**
   * Get namespaceString
   * @return namespaceString
  */
  
  public String getNamespaceString() {
    return namespaceString;
  }

  public void setNamespaceString(String namespaceString) {
    this.namespaceString = namespaceString;
  }

  public XmlItemDto namespaceNumber(BigDecimal namespaceNumber) {
    this.namespaceNumber = namespaceNumber;
    return this;
  }

  /**
   * Get namespaceNumber
   * @return namespaceNumber
  */
  
  public BigDecimal getNamespaceNumber() {
    return namespaceNumber;
  }

  public void setNamespaceNumber(BigDecimal namespaceNumber) {
    this.namespaceNumber = namespaceNumber;
  }

  public XmlItemDto namespaceInteger(Integer namespaceInteger) {
    this.namespaceInteger = namespaceInteger;
    return this;
  }

  /**
   * Get namespaceInteger
   * @return namespaceInteger
  */
  
  public Integer getNamespaceInteger() {
    return namespaceInteger;
  }

  public void setNamespaceInteger(Integer namespaceInteger) {
    this.namespaceInteger = namespaceInteger;
  }

  public XmlItemDto namespaceBoolean(Boolean namespaceBoolean) {
    this.namespaceBoolean = namespaceBoolean;
    return this;
  }

  /**
   * Get namespaceBoolean
   * @return namespaceBoolean
  */
  
  public Boolean getNamespaceBoolean() {
    return namespaceBoolean;
  }

  public void setNamespaceBoolean(Boolean namespaceBoolean) {
    this.namespaceBoolean = namespaceBoolean;
  }

  public XmlItemDto namespaceArray(List<Integer> namespaceArray) {
    this.namespaceArray = namespaceArray;
    return this;
  }

  public XmlItemDto addNamespaceArrayItem(Integer namespaceArrayItem) {
    if (this.namespaceArray == null) {
      this.namespaceArray = new ArrayList<>();
    }
    this.namespaceArray.add(namespaceArrayItem);
    return this;
  }

  /**
   * Get namespaceArray
   * @return namespaceArray
  */
  
  public List<Integer> getNamespaceArray() {
    return namespaceArray;
  }

  public void setNamespaceArray(List<Integer> namespaceArray) {
    this.namespaceArray = namespaceArray;
  }

  public XmlItemDto namespaceWrappedArray(List<Integer> namespaceWrappedArray) {
    this.namespaceWrappedArray = namespaceWrappedArray;
    return this;
  }

  public XmlItemDto addNamespaceWrappedArrayItem(Integer namespaceWrappedArrayItem) {
    if (this.namespaceWrappedArray == null) {
      this.namespaceWrappedArray = new ArrayList<>();
    }
    this.namespaceWrappedArray.add(namespaceWrappedArrayItem);
    return this;
  }

  /**
   * Get namespaceWrappedArray
   * @return namespaceWrappedArray
  */
  
  public List<Integer> getNamespaceWrappedArray() {
    return namespaceWrappedArray;
  }

  public void setNamespaceWrappedArray(List<Integer> namespaceWrappedArray) {
    this.namespaceWrappedArray = namespaceWrappedArray;
  }

  public XmlItemDto prefixNsString(String prefixNsString) {
    this.prefixNsString = prefixNsString;
    return this;
  }

  /**
   * Get prefixNsString
   * @return prefixNsString
  */
  
  public String getPrefixNsString() {
    return prefixNsString;
  }

  public void setPrefixNsString(String prefixNsString) {
    this.prefixNsString = prefixNsString;
  }

  public XmlItemDto prefixNsNumber(BigDecimal prefixNsNumber) {
    this.prefixNsNumber = prefixNsNumber;
    return this;
  }

  /**
   * Get prefixNsNumber
   * @return prefixNsNumber
  */
  
  public BigDecimal getPrefixNsNumber() {
    return prefixNsNumber;
  }

  public void setPrefixNsNumber(BigDecimal prefixNsNumber) {
    this.prefixNsNumber = prefixNsNumber;
  }

  public XmlItemDto prefixNsInteger(Integer prefixNsInteger) {
    this.prefixNsInteger = prefixNsInteger;
    return this;
  }

  /**
   * Get prefixNsInteger
   * @return prefixNsInteger
  */
  
  public Integer getPrefixNsInteger() {
    return prefixNsInteger;
  }

  public void setPrefixNsInteger(Integer prefixNsInteger) {
    this.prefixNsInteger = prefixNsInteger;
  }

  public XmlItemDto prefixNsBoolean(Boolean prefixNsBoolean) {
    this.prefixNsBoolean = prefixNsBoolean;
    return this;
  }

  /**
   * Get prefixNsBoolean
   * @return prefixNsBoolean
  */
  
  public Boolean getPrefixNsBoolean() {
    return prefixNsBoolean;
  }

  public void setPrefixNsBoolean(Boolean prefixNsBoolean) {
    this.prefixNsBoolean = prefixNsBoolean;
  }

  public XmlItemDto prefixNsArray(List<Integer> prefixNsArray) {
    this.prefixNsArray = prefixNsArray;
    return this;
  }

  public XmlItemDto addPrefixNsArrayItem(Integer prefixNsArrayItem) {
    if (this.prefixNsArray == null) {
      this.prefixNsArray = new ArrayList<>();
    }
    this.prefixNsArray.add(prefixNsArrayItem);
    return this;
  }

  /**
   * Get prefixNsArray
   * @return prefixNsArray
  */
  
  public List<Integer> getPrefixNsArray() {
    return prefixNsArray;
  }

  public void setPrefixNsArray(List<Integer> prefixNsArray) {
    this.prefixNsArray = prefixNsArray;
  }

  public XmlItemDto prefixNsWrappedArray(List<Integer> prefixNsWrappedArray) {
    this.prefixNsWrappedArray = prefixNsWrappedArray;
    return this;
  }

  public XmlItemDto addPrefixNsWrappedArrayItem(Integer prefixNsWrappedArrayItem) {
    if (this.prefixNsWrappedArray == null) {
      this.prefixNsWrappedArray = new ArrayList<>();
    }
    this.prefixNsWrappedArray.add(prefixNsWrappedArrayItem);
    return this;
  }

  /**
   * Get prefixNsWrappedArray
   * @return prefixNsWrappedArray
  */
  
  public List<Integer> getPrefixNsWrappedArray() {
    return prefixNsWrappedArray;
  }

  public void setPrefixNsWrappedArray(List<Integer> prefixNsWrappedArray) {
    this.prefixNsWrappedArray = prefixNsWrappedArray;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlItemDto xmlItem = (XmlItemDto) o;
    return Objects.equals(this.attributeString, xmlItem.attributeString) &&
        Objects.equals(this.attributeNumber, xmlItem.attributeNumber) &&
        Objects.equals(this.attributeInteger, xmlItem.attributeInteger) &&
        Objects.equals(this.attributeBoolean, xmlItem.attributeBoolean) &&
        Objects.equals(this.wrappedArray, xmlItem.wrappedArray) &&
        Objects.equals(this.nameString, xmlItem.nameString) &&
        Objects.equals(this.nameNumber, xmlItem.nameNumber) &&
        Objects.equals(this.nameInteger, xmlItem.nameInteger) &&
        Objects.equals(this.nameBoolean, xmlItem.nameBoolean) &&
        Objects.equals(this.nameArray, xmlItem.nameArray) &&
        Objects.equals(this.nameWrappedArray, xmlItem.nameWrappedArray) &&
        Objects.equals(this.prefixString, xmlItem.prefixString) &&
        Objects.equals(this.prefixNumber, xmlItem.prefixNumber) &&
        Objects.equals(this.prefixInteger, xmlItem.prefixInteger) &&
        Objects.equals(this.prefixBoolean, xmlItem.prefixBoolean) &&
        Objects.equals(this.prefixArray, xmlItem.prefixArray) &&
        Objects.equals(this.prefixWrappedArray, xmlItem.prefixWrappedArray) &&
        Objects.equals(this.namespaceString, xmlItem.namespaceString) &&
        Objects.equals(this.namespaceNumber, xmlItem.namespaceNumber) &&
        Objects.equals(this.namespaceInteger, xmlItem.namespaceInteger) &&
        Objects.equals(this.namespaceBoolean, xmlItem.namespaceBoolean) &&
        Objects.equals(this.namespaceArray, xmlItem.namespaceArray) &&
        Objects.equals(this.namespaceWrappedArray, xmlItem.namespaceWrappedArray) &&
        Objects.equals(this.prefixNsString, xmlItem.prefixNsString) &&
        Objects.equals(this.prefixNsNumber, xmlItem.prefixNsNumber) &&
        Objects.equals(this.prefixNsInteger, xmlItem.prefixNsInteger) &&
        Objects.equals(this.prefixNsBoolean, xmlItem.prefixNsBoolean) &&
        Objects.equals(this.prefixNsArray, xmlItem.prefixNsArray) &&
        Objects.equals(this.prefixNsWrappedArray, xmlItem.prefixNsWrappedArray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeString, attributeNumber, attributeInteger, attributeBoolean, wrappedArray, nameString, nameNumber, nameInteger, nameBoolean, nameArray, nameWrappedArray, prefixString, prefixNumber, prefixInteger, prefixBoolean, prefixArray, prefixWrappedArray, namespaceString, namespaceNumber, namespaceInteger, namespaceBoolean, namespaceArray, namespaceWrappedArray, prefixNsString, prefixNsNumber, prefixNsInteger, prefixNsBoolean, prefixNsArray, prefixNsWrappedArray);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlItemDto {\n");
    sb.append("    attributeString: ").append(toIndentedString(attributeString)).append("\n");
    sb.append("    attributeNumber: ").append(toIndentedString(attributeNumber)).append("\n");
    sb.append("    attributeInteger: ").append(toIndentedString(attributeInteger)).append("\n");
    sb.append("    attributeBoolean: ").append(toIndentedString(attributeBoolean)).append("\n");
    sb.append("    wrappedArray: ").append(toIndentedString(wrappedArray)).append("\n");
    sb.append("    nameString: ").append(toIndentedString(nameString)).append("\n");
    sb.append("    nameNumber: ").append(toIndentedString(nameNumber)).append("\n");
    sb.append("    nameInteger: ").append(toIndentedString(nameInteger)).append("\n");
    sb.append("    nameBoolean: ").append(toIndentedString(nameBoolean)).append("\n");
    sb.append("    nameArray: ").append(toIndentedString(nameArray)).append("\n");
    sb.append("    nameWrappedArray: ").append(toIndentedString(nameWrappedArray)).append("\n");
    sb.append("    prefixString: ").append(toIndentedString(prefixString)).append("\n");
    sb.append("    prefixNumber: ").append(toIndentedString(prefixNumber)).append("\n");
    sb.append("    prefixInteger: ").append(toIndentedString(prefixInteger)).append("\n");
    sb.append("    prefixBoolean: ").append(toIndentedString(prefixBoolean)).append("\n");
    sb.append("    prefixArray: ").append(toIndentedString(prefixArray)).append("\n");
    sb.append("    prefixWrappedArray: ").append(toIndentedString(prefixWrappedArray)).append("\n");
    sb.append("    namespaceString: ").append(toIndentedString(namespaceString)).append("\n");
    sb.append("    namespaceNumber: ").append(toIndentedString(namespaceNumber)).append("\n");
    sb.append("    namespaceInteger: ").append(toIndentedString(namespaceInteger)).append("\n");
    sb.append("    namespaceBoolean: ").append(toIndentedString(namespaceBoolean)).append("\n");
    sb.append("    namespaceArray: ").append(toIndentedString(namespaceArray)).append("\n");
    sb.append("    namespaceWrappedArray: ").append(toIndentedString(namespaceWrappedArray)).append("\n");
    sb.append("    prefixNsString: ").append(toIndentedString(prefixNsString)).append("\n");
    sb.append("    prefixNsNumber: ").append(toIndentedString(prefixNsNumber)).append("\n");
    sb.append("    prefixNsInteger: ").append(toIndentedString(prefixNsInteger)).append("\n");
    sb.append("    prefixNsBoolean: ").append(toIndentedString(prefixNsBoolean)).append("\n");
    sb.append("    prefixNsArray: ").append(toIndentedString(prefixNsArray)).append("\n");
    sb.append("    prefixNsWrappedArray: ").append(toIndentedString(prefixNsWrappedArray)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
