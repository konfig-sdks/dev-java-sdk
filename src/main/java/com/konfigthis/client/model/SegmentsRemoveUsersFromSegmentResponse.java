/*
 * Forem API V1
 * Access Forem articles, users and other resources via API.         For a real-world example of Forem in action, check out [DEV](https://www.dev.to).         All endpoints can be accessed with the 'api-key' header and a accept header, but         some of them are accessible publicly without authentication.          Dates and date times, unless otherwise specified, must be in         the [RFC 3339](https://tools.ietf.org/html/rfc3339) format.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * SegmentsRemoveUsersFromSegmentResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SegmentsRemoveUsersFromSegmentResponse {
  public static final String SERIALIZED_NAME_SUCCEEDED = "succeeded";
  @SerializedName(SERIALIZED_NAME_SUCCEEDED)
  private List<Double> succeeded = null;

  public static final String SERIALIZED_NAME_FAILED = "failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  private List<String> failed = null;

  public SegmentsRemoveUsersFromSegmentResponse() {
  }

  public SegmentsRemoveUsersFromSegmentResponse succeeded(List<Double> succeeded) {
    
    
    
    
    this.succeeded = succeeded;
    return this;
  }

  public SegmentsRemoveUsersFromSegmentResponse addSucceededItem(Double succeededItem) {
    if (this.succeeded == null) {
      this.succeeded = new ArrayList<>();
    }
    this.succeeded.add(succeededItem);
    return this;
  }

   /**
   * Get succeeded
   * @return succeeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getSucceeded() {
    return succeeded;
  }


  public void setSucceeded(List<Double> succeeded) {
    
    
    
    this.succeeded = succeeded;
  }


  public SegmentsRemoveUsersFromSegmentResponse failed(List<String> failed) {
    
    
    
    
    this.failed = failed;
    return this;
  }

  public SegmentsRemoveUsersFromSegmentResponse addFailedItem(String failedItem) {
    if (this.failed == null) {
      this.failed = new ArrayList<>();
    }
    this.failed.add(failedItem);
    return this;
  }

   /**
   * Get failed
   * @return failed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getFailed() {
    return failed;
  }


  public void setFailed(List<String> failed) {
    
    
    
    this.failed = failed;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SegmentsRemoveUsersFromSegmentResponse instance itself
   */
  public SegmentsRemoveUsersFromSegmentResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentsRemoveUsersFromSegmentResponse segmentsRemoveUsersFromSegmentResponse = (SegmentsRemoveUsersFromSegmentResponse) o;
    return Objects.equals(this.succeeded, segmentsRemoveUsersFromSegmentResponse.succeeded) &&
        Objects.equals(this.failed, segmentsRemoveUsersFromSegmentResponse.failed)&&
        Objects.equals(this.additionalProperties, segmentsRemoveUsersFromSegmentResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(succeeded, failed, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentsRemoveUsersFromSegmentResponse {\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("succeeded");
    openapiFields.add("failed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SegmentsRemoveUsersFromSegmentResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SegmentsRemoveUsersFromSegmentResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SegmentsRemoveUsersFromSegmentResponse is not found in the empty JSON string", SegmentsRemoveUsersFromSegmentResponse.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("succeeded") != null && !jsonObj.get("succeeded").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `succeeded` to be an array in the JSON string but got `%s`", jsonObj.get("succeeded").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("failed") != null && !jsonObj.get("failed").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `failed` to be an array in the JSON string but got `%s`", jsonObj.get("failed").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SegmentsRemoveUsersFromSegmentResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SegmentsRemoveUsersFromSegmentResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SegmentsRemoveUsersFromSegmentResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SegmentsRemoveUsersFromSegmentResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SegmentsRemoveUsersFromSegmentResponse>() {
           @Override
           public void write(JsonWriter out, SegmentsRemoveUsersFromSegmentResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SegmentsRemoveUsersFromSegmentResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SegmentsRemoveUsersFromSegmentResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SegmentsRemoveUsersFromSegmentResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SegmentsRemoveUsersFromSegmentResponse
  * @throws IOException if the JSON string is invalid with respect to SegmentsRemoveUsersFromSegmentResponse
  */
  public static SegmentsRemoveUsersFromSegmentResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SegmentsRemoveUsersFromSegmentResponse.class);
  }

 /**
  * Convert an instance of SegmentsRemoveUsersFromSegmentResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
