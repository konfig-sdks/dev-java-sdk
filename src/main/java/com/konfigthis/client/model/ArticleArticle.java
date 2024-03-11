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
 * ArticleArticle
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ArticleArticle {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private String tags;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BODY_MARKDOWN = "body_markdown";
  @SerializedName(SERIALIZED_NAME_BODY_MARKDOWN)
  private String bodyMarkdown;

  public static final String SERIALIZED_NAME_PUBLISHED = "published";
  @SerializedName(SERIALIZED_NAME_PUBLISHED)
  private Boolean published = false;

  public static final String SERIALIZED_NAME_SERIES = "series";
  @SerializedName(SERIALIZED_NAME_SERIES)
  private String series;

  public static final String SERIALIZED_NAME_MAIN_IMAGE = "main_image";
  @SerializedName(SERIALIZED_NAME_MAIN_IMAGE)
  private String mainImage;

  public static final String SERIALIZED_NAME_CANONICAL_URL = "canonical_url";
  @SerializedName(SERIALIZED_NAME_CANONICAL_URL)
  private String canonicalUrl;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organization_id";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private Integer organizationId;

  public ArticleArticle() {
  }

  public ArticleArticle tags(String tags) {
    
    
    
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTags() {
    return tags;
  }


  public void setTags(String tags) {
    
    
    
    this.tags = tags;
  }


  public ArticleArticle title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public ArticleArticle description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ArticleArticle bodyMarkdown(String bodyMarkdown) {
    
    
    
    
    this.bodyMarkdown = bodyMarkdown;
    return this;
  }

   /**
   * Get bodyMarkdown
   * @return bodyMarkdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBodyMarkdown() {
    return bodyMarkdown;
  }


  public void setBodyMarkdown(String bodyMarkdown) {
    
    
    
    this.bodyMarkdown = bodyMarkdown;
  }


  public ArticleArticle published(Boolean published) {
    
    
    
    
    this.published = published;
    return this;
  }

   /**
   * Get published
   * @return published
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getPublished() {
    return published;
  }


  public void setPublished(Boolean published) {
    
    
    
    this.published = published;
  }


  public ArticleArticle series(String series) {
    
    
    
    
    this.series = series;
    return this;
  }

   /**
   * Get series
   * @return series
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeries() {
    return series;
  }


  public void setSeries(String series) {
    
    
    
    this.series = series;
  }


  public ArticleArticle mainImage(String mainImage) {
    
    
    
    
    this.mainImage = mainImage;
    return this;
  }

   /**
   * Get mainImage
   * @return mainImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMainImage() {
    return mainImage;
  }


  public void setMainImage(String mainImage) {
    
    
    
    this.mainImage = mainImage;
  }


  public ArticleArticle canonicalUrl(String canonicalUrl) {
    
    
    
    
    this.canonicalUrl = canonicalUrl;
    return this;
  }

   /**
   * Get canonicalUrl
   * @return canonicalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCanonicalUrl() {
    return canonicalUrl;
  }


  public void setCanonicalUrl(String canonicalUrl) {
    
    
    
    this.canonicalUrl = canonicalUrl;
  }


  public ArticleArticle organizationId(Integer organizationId) {
    
    
    
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(Integer organizationId) {
    
    
    
    this.organizationId = organizationId;
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
   * @return the ArticleArticle instance itself
   */
  public ArticleArticle putAdditionalProperty(String key, Object value) {
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
    ArticleArticle articleArticle = (ArticleArticle) o;
    return Objects.equals(this.tags, articleArticle.tags) &&
        Objects.equals(this.title, articleArticle.title) &&
        Objects.equals(this.description, articleArticle.description) &&
        Objects.equals(this.bodyMarkdown, articleArticle.bodyMarkdown) &&
        Objects.equals(this.published, articleArticle.published) &&
        Objects.equals(this.series, articleArticle.series) &&
        Objects.equals(this.mainImage, articleArticle.mainImage) &&
        Objects.equals(this.canonicalUrl, articleArticle.canonicalUrl) &&
        Objects.equals(this.organizationId, articleArticle.organizationId)&&
        Objects.equals(this.additionalProperties, articleArticle.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, title, description, bodyMarkdown, published, series, mainImage, canonicalUrl, organizationId, additionalProperties);
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
    sb.append("class ArticleArticle {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    bodyMarkdown: ").append(toIndentedString(bodyMarkdown)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    mainImage: ").append(toIndentedString(mainImage)).append("\n");
    sb.append("    canonicalUrl: ").append(toIndentedString(canonicalUrl)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
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
    openapiFields.add("tags");
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("body_markdown");
    openapiFields.add("published");
    openapiFields.add("series");
    openapiFields.add("main_image");
    openapiFields.add("canonical_url");
    openapiFields.add("organization_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ArticleArticle
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ArticleArticle.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArticleArticle is not found in the empty JSON string", ArticleArticle.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) && !jsonObj.get("tags").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("body_markdown") != null && !jsonObj.get("body_markdown").isJsonNull()) && !jsonObj.get("body_markdown").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body_markdown` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body_markdown").toString()));
      }
      if (!jsonObj.get("series").isJsonNull() && (jsonObj.get("series") != null && !jsonObj.get("series").isJsonNull()) && !jsonObj.get("series").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `series` to be a primitive type in the JSON string but got `%s`", jsonObj.get("series").toString()));
      }
      if (!jsonObj.get("main_image").isJsonNull() && (jsonObj.get("main_image") != null && !jsonObj.get("main_image").isJsonNull()) && !jsonObj.get("main_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `main_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("main_image").toString()));
      }
      if (!jsonObj.get("canonical_url").isJsonNull() && (jsonObj.get("canonical_url") != null && !jsonObj.get("canonical_url").isJsonNull()) && !jsonObj.get("canonical_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `canonical_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("canonical_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArticleArticle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArticleArticle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArticleArticle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArticleArticle.class));

       return (TypeAdapter<T>) new TypeAdapter<ArticleArticle>() {
           @Override
           public void write(JsonWriter out, ArticleArticle value) throws IOException {
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
           public ArticleArticle read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ArticleArticle instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ArticleArticle given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArticleArticle
  * @throws IOException if the JSON string is invalid with respect to ArticleArticle
  */
  public static ArticleArticle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArticleArticle.class);
  }

 /**
  * Convert an instance of ArticleArticle to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
