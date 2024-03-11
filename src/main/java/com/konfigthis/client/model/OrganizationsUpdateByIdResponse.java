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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * OrganizationsUpdateByIdResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OrganizationsUpdateByIdResponse {
  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Double id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROFILE_IMAGE = "profile_image";
  @SerializedName(SERIALIZED_NAME_PROFILE_IMAGE)
  private String profileImage;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_TAG_LINE = "tag_line";
  @SerializedName(SERIALIZED_NAME_TAG_LINE)
  private String tagLine;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public OrganizationsUpdateByIdResponse() {
  }

  public OrganizationsUpdateByIdResponse summary(String summary) {
    
    
    
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "An updated summary for the organization.", value = "")

  public String getSummary() {
    return summary;
  }


  public void setSummary(String summary) {
    
    
    
    this.summary = summary;
  }


  public OrganizationsUpdateByIdResponse id(Double id) {
    
    
    
    
    this.id = id;
    return this;
  }

  public OrganizationsUpdateByIdResponse id(Integer id) {
    
    
    
    
    this.id = id.doubleValue();
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "24", value = "")

  public Double getId() {
    return id;
  }


  public void setId(Double id) {
    
    
    
    this.id = id;
  }


  public OrganizationsUpdateByIdResponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Reinger, Gleichner and Rogahn", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public OrganizationsUpdateByIdResponse profileImage(String profileImage) {
    
    
    
    
    this.profileImage = profileImage;
    return this;
  }

   /**
   * Get profileImage
   * @return profileImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/uploads/organization/profile_image/24/1b9f0d37-acb7-4b80-b950-d621f5c5463d.png", value = "")

  public String getProfileImage() {
    return profileImage;
  }


  public void setProfileImage(String profileImage) {
    
    
    
    this.profileImage = profileImage;
  }


  public OrganizationsUpdateByIdResponse slug(String slug) {
    
    
    
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "org23", value = "")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    
    
    
    this.slug = slug;
  }


  public OrganizationsUpdateByIdResponse tagLine(String tagLine) {
    
    
    
    
    this.tagLine = tagLine;
    return this;
  }

   /**
   * Get tagLine
   * @return tagLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTagLine() {
    return tagLine;
  }


  public void setTagLine(String tagLine) {
    
    
    
    this.tagLine = tagLine;
  }


  public OrganizationsUpdateByIdResponse url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://kertzmann.io/clora.mcglynn", value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
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
   * @return the OrganizationsUpdateByIdResponse instance itself
   */
  public OrganizationsUpdateByIdResponse putAdditionalProperty(String key, Object value) {
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
    OrganizationsUpdateByIdResponse organizationsUpdateByIdResponse = (OrganizationsUpdateByIdResponse) o;
    return Objects.equals(this.summary, organizationsUpdateByIdResponse.summary) &&
        Objects.equals(this.id, organizationsUpdateByIdResponse.id) &&
        Objects.equals(this.name, organizationsUpdateByIdResponse.name) &&
        Objects.equals(this.profileImage, organizationsUpdateByIdResponse.profileImage) &&
        Objects.equals(this.slug, organizationsUpdateByIdResponse.slug) &&
        Objects.equals(this.tagLine, organizationsUpdateByIdResponse.tagLine) &&
        Objects.equals(this.url, organizationsUpdateByIdResponse.url)&&
        Objects.equals(this.additionalProperties, organizationsUpdateByIdResponse.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, id, name, profileImage, slug, tagLine, url, additionalProperties);
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
    sb.append("class OrganizationsUpdateByIdResponse {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    tagLine: ").append(toIndentedString(tagLine)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("summary");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("profile_image");
    openapiFields.add("slug");
    openapiFields.add("tag_line");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrganizationsUpdateByIdResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrganizationsUpdateByIdResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrganizationsUpdateByIdResponse is not found in the empty JSON string", OrganizationsUpdateByIdResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) && !jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("profile_image") != null && !jsonObj.get("profile_image").isJsonNull()) && !jsonObj.get("profile_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_image").toString()));
      }
      if ((jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonNull()) && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if (!jsonObj.get("tag_line").isJsonNull() && (jsonObj.get("tag_line") != null && !jsonObj.get("tag_line").isJsonNull()) && !jsonObj.get("tag_line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag_line").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrganizationsUpdateByIdResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrganizationsUpdateByIdResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrganizationsUpdateByIdResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrganizationsUpdateByIdResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OrganizationsUpdateByIdResponse>() {
           @Override
           public void write(JsonWriter out, OrganizationsUpdateByIdResponse value) throws IOException {
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
           public OrganizationsUpdateByIdResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrganizationsUpdateByIdResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrganizationsUpdateByIdResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrganizationsUpdateByIdResponse
  * @throws IOException if the JSON string is invalid with respect to OrganizationsUpdateByIdResponse
  */
  public static OrganizationsUpdateByIdResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrganizationsUpdateByIdResponse.class);
  }

 /**
  * Convert an instance of OrganizationsUpdateByIdResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

