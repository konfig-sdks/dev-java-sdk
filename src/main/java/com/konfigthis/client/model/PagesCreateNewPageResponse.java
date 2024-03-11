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
import com.konfigthis.client.model.PagesCreateNewPageResponseSocialImage;
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
 * PagesCreateNewPageResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PagesCreateNewPageResponse {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Double id;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_IS_TOP_LEVEL_PATH = "is_top_level_path";
  @SerializedName(SERIALIZED_NAME_IS_TOP_LEVEL_PATH)
  private Boolean isTopLevelPath;

  public static final String SERIALIZED_NAME_LANDING_PAGE = "landing_page";
  @SerializedName(SERIALIZED_NAME_LANDING_PAGE)
  private Boolean landingPage;

  public static final String SERIALIZED_NAME_BODY_HTML = "body_html";
  @SerializedName(SERIALIZED_NAME_BODY_HTML)
  private String bodyHtml;

  public static final String SERIALIZED_NAME_BODY_JSON = "body_json";
  @SerializedName(SERIALIZED_NAME_BODY_JSON)
  private String bodyJson;

  public static final String SERIALIZED_NAME_BODY_MARKDOWN = "body_markdown";
  @SerializedName(SERIALIZED_NAME_BODY_MARKDOWN)
  private String bodyMarkdown;

  public static final String SERIALIZED_NAME_PROCESSED_HTML = "processed_html";
  @SerializedName(SERIALIZED_NAME_PROCESSED_HTML)
  private String processedHtml;

  public static final String SERIALIZED_NAME_SOCIAL_IMAGE = "social_image";
  @SerializedName(SERIALIZED_NAME_SOCIAL_IMAGE)
  private PagesCreateNewPageResponseSocialImage socialImage;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public PagesCreateNewPageResponse() {
  }

  public PagesCreateNewPageResponse title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Example Page", value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public PagesCreateNewPageResponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a new page", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public PagesCreateNewPageResponse id(Double id) {
    
    
    
    
    this.id = id;
    return this;
  }

  public PagesCreateNewPageResponse id(Integer id) {
    
    
    
    
    this.id = id.doubleValue();
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public Double getId() {
    return id;
  }


  public void setId(Double id) {
    
    
    
    this.id = id;
  }


  public PagesCreateNewPageResponse slug(String slug) {
    
    
    
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example1", value = "")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    
    
    
    this.slug = slug;
  }


  public PagesCreateNewPageResponse isTopLevelPath(Boolean isTopLevelPath) {
    
    
    
    
    this.isTopLevelPath = isTopLevelPath;
    return this;
  }

   /**
   * Get isTopLevelPath
   * @return isTopLevelPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsTopLevelPath() {
    return isTopLevelPath;
  }


  public void setIsTopLevelPath(Boolean isTopLevelPath) {
    
    
    
    this.isTopLevelPath = isTopLevelPath;
  }


  public PagesCreateNewPageResponse landingPage(Boolean landingPage) {
    
    
    
    
    this.landingPage = landingPage;
    return this;
  }

   /**
   * Get landingPage
   * @return landingPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getLandingPage() {
    return landingPage;
  }


  public void setLandingPage(Boolean landingPage) {
    
    
    
    this.landingPage = landingPage;
  }


  public PagesCreateNewPageResponse bodyHtml(String bodyHtml) {
    
    
    
    
    this.bodyHtml = bodyHtml;
    return this;
  }

   /**
   * Get bodyHtml
   * @return bodyHtml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBodyHtml() {
    return bodyHtml;
  }


  public void setBodyHtml(String bodyHtml) {
    
    
    
    this.bodyHtml = bodyHtml;
  }


  public PagesCreateNewPageResponse bodyJson(String bodyJson) {
    
    
    
    
    this.bodyJson = bodyJson;
    return this;
  }

   /**
   * Get bodyJson
   * @return bodyJson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBodyJson() {
    return bodyJson;
  }


  public void setBodyJson(String bodyJson) {
    
    
    
    this.bodyJson = bodyJson;
  }


  public PagesCreateNewPageResponse bodyMarkdown(String bodyMarkdown) {
    
    
    
    
    this.bodyMarkdown = bodyMarkdown;
    return this;
  }

   /**
   * Get bodyMarkdown
   * @return bodyMarkdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "# Hi, this is a New Page Yep, it's an a new page", value = "")

  public String getBodyMarkdown() {
    return bodyMarkdown;
  }


  public void setBodyMarkdown(String bodyMarkdown) {
    
    
    
    this.bodyMarkdown = bodyMarkdown;
  }


  public PagesCreateNewPageResponse processedHtml(String processedHtml) {
    
    
    
    
    this.processedHtml = processedHtml;
    return this;
  }

   /**
   * Get processedHtml
   * @return processedHtml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<h1>   <a name=\"hi-this-is-a-new-page\" href=\"#hi-this-is-a-new-page\">   </a>   Hi, this is a New Page </h1>  <p>Yep, it's an a new page</p>  ", value = "")

  public String getProcessedHtml() {
    return processedHtml;
  }


  public void setProcessedHtml(String processedHtml) {
    
    
    
    this.processedHtml = processedHtml;
  }


  public PagesCreateNewPageResponse socialImage(PagesCreateNewPageResponseSocialImage socialImage) {
    
    
    
    
    this.socialImage = socialImage;
    return this;
  }

   /**
   * Get socialImage
   * @return socialImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PagesCreateNewPageResponseSocialImage getSocialImage() {
    return socialImage;
  }


  public void setSocialImage(PagesCreateNewPageResponseSocialImage socialImage) {
    
    
    
    this.socialImage = socialImage;
  }


  public PagesCreateNewPageResponse template(String template) {
    
    
    
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "contained", value = "")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    
    
    
    this.template = template;
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
   * @return the PagesCreateNewPageResponse instance itself
   */
  public PagesCreateNewPageResponse putAdditionalProperty(String key, Object value) {
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
    PagesCreateNewPageResponse pagesCreateNewPageResponse = (PagesCreateNewPageResponse) o;
    return Objects.equals(this.title, pagesCreateNewPageResponse.title) &&
        Objects.equals(this.description, pagesCreateNewPageResponse.description) &&
        Objects.equals(this.id, pagesCreateNewPageResponse.id) &&
        Objects.equals(this.slug, pagesCreateNewPageResponse.slug) &&
        Objects.equals(this.isTopLevelPath, pagesCreateNewPageResponse.isTopLevelPath) &&
        Objects.equals(this.landingPage, pagesCreateNewPageResponse.landingPage) &&
        Objects.equals(this.bodyHtml, pagesCreateNewPageResponse.bodyHtml) &&
        Objects.equals(this.bodyJson, pagesCreateNewPageResponse.bodyJson) &&
        Objects.equals(this.bodyMarkdown, pagesCreateNewPageResponse.bodyMarkdown) &&
        Objects.equals(this.processedHtml, pagesCreateNewPageResponse.processedHtml) &&
        Objects.equals(this.socialImage, pagesCreateNewPageResponse.socialImage) &&
        Objects.equals(this.template, pagesCreateNewPageResponse.template)&&
        Objects.equals(this.additionalProperties, pagesCreateNewPageResponse.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, id, slug, isTopLevelPath, landingPage, bodyHtml, bodyJson, bodyMarkdown, processedHtml, socialImage, template, additionalProperties);
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
    sb.append("class PagesCreateNewPageResponse {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    isTopLevelPath: ").append(toIndentedString(isTopLevelPath)).append("\n");
    sb.append("    landingPage: ").append(toIndentedString(landingPage)).append("\n");
    sb.append("    bodyHtml: ").append(toIndentedString(bodyHtml)).append("\n");
    sb.append("    bodyJson: ").append(toIndentedString(bodyJson)).append("\n");
    sb.append("    bodyMarkdown: ").append(toIndentedString(bodyMarkdown)).append("\n");
    sb.append("    processedHtml: ").append(toIndentedString(processedHtml)).append("\n");
    sb.append("    socialImage: ").append(toIndentedString(socialImage)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("slug");
    openapiFields.add("is_top_level_path");
    openapiFields.add("landing_page");
    openapiFields.add("body_html");
    openapiFields.add("body_json");
    openapiFields.add("body_markdown");
    openapiFields.add("processed_html");
    openapiFields.add("social_image");
    openapiFields.add("template");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PagesCreateNewPageResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PagesCreateNewPageResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PagesCreateNewPageResponse is not found in the empty JSON string", PagesCreateNewPageResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonNull()) && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if (!jsonObj.get("body_html").isJsonNull() && (jsonObj.get("body_html") != null && !jsonObj.get("body_html").isJsonNull()) && !jsonObj.get("body_html").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body_html` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body_html").toString()));
      }
      if (!jsonObj.get("body_json").isJsonNull() && (jsonObj.get("body_json") != null && !jsonObj.get("body_json").isJsonNull()) && !jsonObj.get("body_json").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body_json` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body_json").toString()));
      }
      if ((jsonObj.get("body_markdown") != null && !jsonObj.get("body_markdown").isJsonNull()) && !jsonObj.get("body_markdown").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body_markdown` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body_markdown").toString()));
      }
      if ((jsonObj.get("processed_html") != null && !jsonObj.get("processed_html").isJsonNull()) && !jsonObj.get("processed_html").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processed_html` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processed_html").toString()));
      }
      // validate the optional field `social_image`
      if (jsonObj.get("social_image") != null && !jsonObj.get("social_image").isJsonNull()) {
        PagesCreateNewPageResponseSocialImage.validateJsonObject(jsonObj.getAsJsonObject("social_image"));
      }
      if ((jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull()) && !jsonObj.get("template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PagesCreateNewPageResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PagesCreateNewPageResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PagesCreateNewPageResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PagesCreateNewPageResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PagesCreateNewPageResponse>() {
           @Override
           public void write(JsonWriter out, PagesCreateNewPageResponse value) throws IOException {
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
           public PagesCreateNewPageResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PagesCreateNewPageResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PagesCreateNewPageResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PagesCreateNewPageResponse
  * @throws IOException if the JSON string is invalid with respect to PagesCreateNewPageResponse
  */
  public static PagesCreateNewPageResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PagesCreateNewPageResponse.class);
  }

 /**
  * Convert an instance of PagesCreateNewPageResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
