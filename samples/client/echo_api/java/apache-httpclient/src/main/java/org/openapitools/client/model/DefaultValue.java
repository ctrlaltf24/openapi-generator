/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.StringEnumRef;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * to test the default value of properties
 */
@JsonPropertyOrder({
  DefaultValue.JSON_PROPERTY_ARRAY_STRING_ENUM_REF_DEFAULT,
  DefaultValue.JSON_PROPERTY_ARRAY_STRING_ENUM_DEFAULT,
  DefaultValue.JSON_PROPERTY_ARRAY_STRING_DEFAULT,
  DefaultValue.JSON_PROPERTY_ARRAY_INTEGER_DEFAULT,
  DefaultValue.JSON_PROPERTY_ARRAY_STRING,
  DefaultValue.JSON_PROPERTY_ARRAY_STRING_NULLABLE,
  DefaultValue.JSON_PROPERTY_STRING_NULLABLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DefaultValue {
  public static final String JSON_PROPERTY_ARRAY_STRING_ENUM_REF_DEFAULT = "array_string_enum_ref_default";
  private List<StringEnumRef> arrayStringEnumRefDefault = new ArrayList<>(Arrays.asList(StringEnumRef.SUCCESS, StringEnumRef.FAILURE));

  /**
   * Gets or Sets arrayStringEnumDefault
   */
  public enum ArrayStringEnumDefaultEnum {
    SUCCESS("success"),
    
    FAILURE("failure"),
    
    UNCLASSIFIED("unclassified");

    private String value;

    ArrayStringEnumDefaultEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ArrayStringEnumDefaultEnum fromValue(String value) {
      for (ArrayStringEnumDefaultEnum b : ArrayStringEnumDefaultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ARRAY_STRING_ENUM_DEFAULT = "array_string_enum_default";
  private List<ArrayStringEnumDefaultEnum> arrayStringEnumDefault = new ArrayList<>(Arrays.asList(ArrayStringEnumDefaultEnum.SUCCESS, ArrayStringEnumDefaultEnum.FAILURE));

  public static final String JSON_PROPERTY_ARRAY_STRING_DEFAULT = "array_string_default";
  private List<String> arrayStringDefault = new ArrayList<>(Arrays.asList("failure", "skipped"));

  public static final String JSON_PROPERTY_ARRAY_INTEGER_DEFAULT = "array_integer_default";
  private List<Integer> arrayIntegerDefault = new ArrayList<>(Arrays.asList(1, 3));

  public static final String JSON_PROPERTY_ARRAY_STRING = "array_string";
  private List<String> arrayString = new ArrayList<>();

  public static final String JSON_PROPERTY_ARRAY_STRING_NULLABLE = "array_string_nullable";
  private JsonNullable<List<String>> arrayStringNullable = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_STRING_NULLABLE = "string_nullable";
  private JsonNullable<String> stringNullable = JsonNullable.<String>undefined();

  public DefaultValue() {
  }

  public DefaultValue arrayStringEnumRefDefault(List<StringEnumRef> arrayStringEnumRefDefault) {
    
    this.arrayStringEnumRefDefault = arrayStringEnumRefDefault;
    return this;
  }

  public DefaultValue addArrayStringEnumRefDefaultItem(StringEnumRef arrayStringEnumRefDefaultItem) {
    if (this.arrayStringEnumRefDefault == null) {
      this.arrayStringEnumRefDefault = new ArrayList<>(Arrays.asList(StringEnumRef.SUCCESS, StringEnumRef.FAILURE));
    }
    this.arrayStringEnumRefDefault.add(arrayStringEnumRefDefaultItem);
    return this;
  }

   /**
   * Get arrayStringEnumRefDefault
   * @return arrayStringEnumRefDefault
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARRAY_STRING_ENUM_REF_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StringEnumRef> getArrayStringEnumRefDefault() {
    return arrayStringEnumRefDefault;
  }


  @JsonProperty(JSON_PROPERTY_ARRAY_STRING_ENUM_REF_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrayStringEnumRefDefault(List<StringEnumRef> arrayStringEnumRefDefault) {
    this.arrayStringEnumRefDefault = arrayStringEnumRefDefault;
  }


  public DefaultValue arrayStringEnumDefault(List<ArrayStringEnumDefaultEnum> arrayStringEnumDefault) {
    
    this.arrayStringEnumDefault = arrayStringEnumDefault;
    return this;
  }

  public DefaultValue addArrayStringEnumDefaultItem(ArrayStringEnumDefaultEnum arrayStringEnumDefaultItem) {
    if (this.arrayStringEnumDefault == null) {
      this.arrayStringEnumDefault = new ArrayList<>(Arrays.asList(ArrayStringEnumDefaultEnum.SUCCESS, ArrayStringEnumDefaultEnum.FAILURE));
    }
    this.arrayStringEnumDefault.add(arrayStringEnumDefaultItem);
    return this;
  }

   /**
   * Get arrayStringEnumDefault
   * @return arrayStringEnumDefault
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARRAY_STRING_ENUM_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ArrayStringEnumDefaultEnum> getArrayStringEnumDefault() {
    return arrayStringEnumDefault;
  }


  @JsonProperty(JSON_PROPERTY_ARRAY_STRING_ENUM_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrayStringEnumDefault(List<ArrayStringEnumDefaultEnum> arrayStringEnumDefault) {
    this.arrayStringEnumDefault = arrayStringEnumDefault;
  }


  public DefaultValue arrayStringDefault(List<String> arrayStringDefault) {
    
    this.arrayStringDefault = arrayStringDefault;
    return this;
  }

  public DefaultValue addArrayStringDefaultItem(String arrayStringDefaultItem) {
    if (this.arrayStringDefault == null) {
      this.arrayStringDefault = new ArrayList<>(Arrays.asList("failure", "skipped"));
    }
    this.arrayStringDefault.add(arrayStringDefaultItem);
    return this;
  }

   /**
   * Get arrayStringDefault
   * @return arrayStringDefault
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARRAY_STRING_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getArrayStringDefault() {
    return arrayStringDefault;
  }


  @JsonProperty(JSON_PROPERTY_ARRAY_STRING_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrayStringDefault(List<String> arrayStringDefault) {
    this.arrayStringDefault = arrayStringDefault;
  }


  public DefaultValue arrayIntegerDefault(List<Integer> arrayIntegerDefault) {
    
    this.arrayIntegerDefault = arrayIntegerDefault;
    return this;
  }

  public DefaultValue addArrayIntegerDefaultItem(Integer arrayIntegerDefaultItem) {
    if (this.arrayIntegerDefault == null) {
      this.arrayIntegerDefault = new ArrayList<>(Arrays.asList(1, 3));
    }
    this.arrayIntegerDefault.add(arrayIntegerDefaultItem);
    return this;
  }

   /**
   * Get arrayIntegerDefault
   * @return arrayIntegerDefault
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARRAY_INTEGER_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getArrayIntegerDefault() {
    return arrayIntegerDefault;
  }


  @JsonProperty(JSON_PROPERTY_ARRAY_INTEGER_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrayIntegerDefault(List<Integer> arrayIntegerDefault) {
    this.arrayIntegerDefault = arrayIntegerDefault;
  }


  public DefaultValue arrayString(List<String> arrayString) {
    
    this.arrayString = arrayString;
    return this;
  }

  public DefaultValue addArrayStringItem(String arrayStringItem) {
    if (this.arrayString == null) {
      this.arrayString = new ArrayList<>();
    }
    this.arrayString.add(arrayStringItem);
    return this;
  }

   /**
   * Get arrayString
   * @return arrayString
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARRAY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getArrayString() {
    return arrayString;
  }


  @JsonProperty(JSON_PROPERTY_ARRAY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrayString(List<String> arrayString) {
    this.arrayString = arrayString;
  }


  public DefaultValue arrayStringNullable(List<String> arrayStringNullable) {
    this.arrayStringNullable = JsonNullable.<List<String>>of(arrayStringNullable);
    
    return this;
  }

  public DefaultValue addArrayStringNullableItem(String arrayStringNullableItem) {
    if (this.arrayStringNullable == null || !this.arrayStringNullable.isPresent()) {
      this.arrayStringNullable = JsonNullable.<List<String>>of(null);
    }
    try {
      this.arrayStringNullable.get().add(arrayStringNullableItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get arrayStringNullable
   * @return arrayStringNullable
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getArrayStringNullable() {
        return arrayStringNullable.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ARRAY_STRING_NULLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getArrayStringNullable_JsonNullable() {
    return arrayStringNullable;
  }
  
  @JsonProperty(JSON_PROPERTY_ARRAY_STRING_NULLABLE)
  public void setArrayStringNullable_JsonNullable(JsonNullable<List<String>> arrayStringNullable) {
    this.arrayStringNullable = arrayStringNullable;
  }

  public void setArrayStringNullable(List<String> arrayStringNullable) {
    this.arrayStringNullable = JsonNullable.<List<String>>of(arrayStringNullable);
  }


  public DefaultValue stringNullable(String stringNullable) {
    this.stringNullable = JsonNullable.<String>of(stringNullable);
    
    return this;
  }

   /**
   * Get stringNullable
   * @return stringNullable
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getStringNullable() {
        return stringNullable.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STRING_NULLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStringNullable_JsonNullable() {
    return stringNullable;
  }
  
  @JsonProperty(JSON_PROPERTY_STRING_NULLABLE)
  public void setStringNullable_JsonNullable(JsonNullable<String> stringNullable) {
    this.stringNullable = stringNullable;
  }

  public void setStringNullable(String stringNullable) {
    this.stringNullable = JsonNullable.<String>of(stringNullable);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultValue defaultValue = (DefaultValue) o;
    return Objects.equals(this.arrayStringEnumRefDefault, defaultValue.arrayStringEnumRefDefault) &&
        Objects.equals(this.arrayStringEnumDefault, defaultValue.arrayStringEnumDefault) &&
        Objects.equals(this.arrayStringDefault, defaultValue.arrayStringDefault) &&
        Objects.equals(this.arrayIntegerDefault, defaultValue.arrayIntegerDefault) &&
        Objects.equals(this.arrayString, defaultValue.arrayString) &&
        equalsNullable(this.arrayStringNullable, defaultValue.arrayStringNullable) &&
        equalsNullable(this.stringNullable, defaultValue.stringNullable);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayStringEnumRefDefault, arrayStringEnumDefault, arrayStringDefault, arrayIntegerDefault, arrayString, hashCodeNullable(arrayStringNullable), hashCodeNullable(stringNullable));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultValue {\n");
    sb.append("    arrayStringEnumRefDefault: ").append(toIndentedString(arrayStringEnumRefDefault)).append("\n");
    sb.append("    arrayStringEnumDefault: ").append(toIndentedString(arrayStringEnumDefault)).append("\n");
    sb.append("    arrayStringDefault: ").append(toIndentedString(arrayStringDefault)).append("\n");
    sb.append("    arrayIntegerDefault: ").append(toIndentedString(arrayIntegerDefault)).append("\n");
    sb.append("    arrayString: ").append(toIndentedString(arrayString)).append("\n");
    sb.append("    arrayStringNullable: ").append(toIndentedString(arrayStringNullable)).append("\n");
    sb.append("    stringNullable: ").append(toIndentedString(stringNullable)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `array_string_enum_ref_default` to the URL query string
    if (getArrayStringEnumRefDefault() != null) {
      for (int i = 0; i < getArrayStringEnumRefDefault().size(); i++) {
        if (getArrayStringEnumRefDefault().get(i) != null) {
          try {
            joiner.add(String.format("%sarray_string_enum_ref_default%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getArrayStringEnumRefDefault().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    // add `array_string_enum_default` to the URL query string
    if (getArrayStringEnumDefault() != null) {
      for (int i = 0; i < getArrayStringEnumDefault().size(); i++) {
        try {
          joiner.add(String.format("%sarray_string_enum_default%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getArrayStringEnumDefault().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `array_string_default` to the URL query string
    if (getArrayStringDefault() != null) {
      for (int i = 0; i < getArrayStringDefault().size(); i++) {
        try {
          joiner.add(String.format("%sarray_string_default%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getArrayStringDefault().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `array_integer_default` to the URL query string
    if (getArrayIntegerDefault() != null) {
      for (int i = 0; i < getArrayIntegerDefault().size(); i++) {
        try {
          joiner.add(String.format("%sarray_integer_default%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getArrayIntegerDefault().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `array_string` to the URL query string
    if (getArrayString() != null) {
      for (int i = 0; i < getArrayString().size(); i++) {
        try {
          joiner.add(String.format("%sarray_string%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getArrayString().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `array_string_nullable` to the URL query string
    if (getArrayStringNullable() != null) {
      for (int i = 0; i < getArrayStringNullable().size(); i++) {
        try {
          joiner.add(String.format("%sarray_string_nullable%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getArrayStringNullable().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `string_nullable` to the URL query string
    if (getStringNullable() != null) {
      try {
        joiner.add(String.format("%sstring_nullable%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStringNullable()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

