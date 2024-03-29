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
 * CommentsGetThreadedCommentResponseUser
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CommentsGetThreadedCommentResponseUser {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_TWITTER_USERNAME = "twitter_username";
  @SerializedName(SERIALIZED_NAME_TWITTER_USERNAME)
  private String twitterUsername;

  public static final String SERIALIZED_NAME_GITHUB_USERNAME = "github_username";
  @SerializedName(SERIALIZED_NAME_GITHUB_USERNAME)
  private String githubUsername;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Double userId;

  public static final String SERIALIZED_NAME_WEBSITE_URL = "website_url";
  @SerializedName(SERIALIZED_NAME_WEBSITE_URL)
  private String websiteUrl;

  public static final String SERIALIZED_NAME_PROFILE_IMAGE = "profile_image";
  @SerializedName(SERIALIZED_NAME_PROFILE_IMAGE)
  private String profileImage;

  public static final String SERIALIZED_NAME_PROFILE_IMAGE90 = "profile_image_90";
  @SerializedName(SERIALIZED_NAME_PROFILE_IMAGE90)
  private String profileImage90;

  public CommentsGetThreadedCommentResponseUser() {
  }

  public CommentsGetThreadedCommentResponseUser name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Kennith \"Rodney\" \\:/ Baumbach", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CommentsGetThreadedCommentResponseUser username(String username) {
    
    
    
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "username125", value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    
    
    
    this.username = username;
  }


  public CommentsGetThreadedCommentResponseUser twitterUsername(String twitterUsername) {
    
    
    
    
    this.twitterUsername = twitterUsername;
    return this;
  }

   /**
   * Get twitterUsername
   * @return twitterUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "twitter125", value = "")

  public String getTwitterUsername() {
    return twitterUsername;
  }


  public void setTwitterUsername(String twitterUsername) {
    
    
    
    this.twitterUsername = twitterUsername;
  }


  public CommentsGetThreadedCommentResponseUser githubUsername(String githubUsername) {
    
    
    
    
    this.githubUsername = githubUsername;
    return this;
  }

   /**
   * Get githubUsername
   * @return githubUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "github125", value = "")

  public String getGithubUsername() {
    return githubUsername;
  }


  public void setGithubUsername(String githubUsername) {
    
    
    
    this.githubUsername = githubUsername;
  }


  public CommentsGetThreadedCommentResponseUser userId(Double userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

  public CommentsGetThreadedCommentResponseUser userId(Integer userId) {
    
    
    
    
    this.userId = userId.doubleValue();
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1005", value = "")

  public Double getUserId() {
    return userId;
  }


  public void setUserId(Double userId) {
    
    
    
    this.userId = userId;
  }


  public CommentsGetThreadedCommentResponseUser websiteUrl(String websiteUrl) {
    
    
    
    
    this.websiteUrl = websiteUrl;
    return this;
  }

   /**
   * Get websiteUrl
   * @return websiteUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebsiteUrl() {
    return websiteUrl;
  }


  public void setWebsiteUrl(String websiteUrl) {
    
    
    
    this.websiteUrl = websiteUrl;
  }


  public CommentsGetThreadedCommentResponseUser profileImage(String profileImage) {
    
    
    
    
    this.profileImage = profileImage;
    return this;
  }

   /**
   * Get profileImage
   * @return profileImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/uploads/user/profile_image/1005/a2641bae-3a16-4238-952a-04f14ce74d1a.jpeg", value = "")

  public String getProfileImage() {
    return profileImage;
  }


  public void setProfileImage(String profileImage) {
    
    
    
    this.profileImage = profileImage;
  }


  public CommentsGetThreadedCommentResponseUser profileImage90(String profileImage90) {
    
    
    
    
    this.profileImage90 = profileImage90;
    return this;
  }

   /**
   * Get profileImage90
   * @return profileImage90
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/uploads/user/profile_image/1005/a2641bae-3a16-4238-952a-04f14ce74d1a.jpeg", value = "")

  public String getProfileImage90() {
    return profileImage90;
  }


  public void setProfileImage90(String profileImage90) {
    
    
    
    this.profileImage90 = profileImage90;
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
   * @return the CommentsGetThreadedCommentResponseUser instance itself
   */
  public CommentsGetThreadedCommentResponseUser putAdditionalProperty(String key, Object value) {
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
    CommentsGetThreadedCommentResponseUser commentsGetThreadedCommentResponseUser = (CommentsGetThreadedCommentResponseUser) o;
    return Objects.equals(this.name, commentsGetThreadedCommentResponseUser.name) &&
        Objects.equals(this.username, commentsGetThreadedCommentResponseUser.username) &&
        Objects.equals(this.twitterUsername, commentsGetThreadedCommentResponseUser.twitterUsername) &&
        Objects.equals(this.githubUsername, commentsGetThreadedCommentResponseUser.githubUsername) &&
        Objects.equals(this.userId, commentsGetThreadedCommentResponseUser.userId) &&
        Objects.equals(this.websiteUrl, commentsGetThreadedCommentResponseUser.websiteUrl) &&
        Objects.equals(this.profileImage, commentsGetThreadedCommentResponseUser.profileImage) &&
        Objects.equals(this.profileImage90, commentsGetThreadedCommentResponseUser.profileImage90)&&
        Objects.equals(this.additionalProperties, commentsGetThreadedCommentResponseUser.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, username, twitterUsername, githubUsername, userId, websiteUrl, profileImage, profileImage90, additionalProperties);
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
    sb.append("class CommentsGetThreadedCommentResponseUser {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    twitterUsername: ").append(toIndentedString(twitterUsername)).append("\n");
    sb.append("    githubUsername: ").append(toIndentedString(githubUsername)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    profileImage90: ").append(toIndentedString(profileImage90)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("username");
    openapiFields.add("twitter_username");
    openapiFields.add("github_username");
    openapiFields.add("user_id");
    openapiFields.add("website_url");
    openapiFields.add("profile_image");
    openapiFields.add("profile_image_90");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CommentsGetThreadedCommentResponseUser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CommentsGetThreadedCommentResponseUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommentsGetThreadedCommentResponseUser is not found in the empty JSON string", CommentsGetThreadedCommentResponseUser.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("twitter_username") != null && !jsonObj.get("twitter_username").isJsonNull()) && !jsonObj.get("twitter_username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twitter_username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twitter_username").toString()));
      }
      if ((jsonObj.get("github_username") != null && !jsonObj.get("github_username").isJsonNull()) && !jsonObj.get("github_username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `github_username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("github_username").toString()));
      }
      if (!jsonObj.get("website_url").isJsonNull() && (jsonObj.get("website_url") != null && !jsonObj.get("website_url").isJsonNull()) && !jsonObj.get("website_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website_url").toString()));
      }
      if ((jsonObj.get("profile_image") != null && !jsonObj.get("profile_image").isJsonNull()) && !jsonObj.get("profile_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_image").toString()));
      }
      if ((jsonObj.get("profile_image_90") != null && !jsonObj.get("profile_image_90").isJsonNull()) && !jsonObj.get("profile_image_90").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_image_90` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_image_90").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommentsGetThreadedCommentResponseUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommentsGetThreadedCommentResponseUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommentsGetThreadedCommentResponseUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommentsGetThreadedCommentResponseUser.class));

       return (TypeAdapter<T>) new TypeAdapter<CommentsGetThreadedCommentResponseUser>() {
           @Override
           public void write(JsonWriter out, CommentsGetThreadedCommentResponseUser value) throws IOException {
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
           public CommentsGetThreadedCommentResponseUser read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CommentsGetThreadedCommentResponseUser instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CommentsGetThreadedCommentResponseUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommentsGetThreadedCommentResponseUser
  * @throws IOException if the JSON string is invalid with respect to CommentsGetThreadedCommentResponseUser
  */
  public static CommentsGetThreadedCommentResponseUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommentsGetThreadedCommentResponseUser.class);
  }

 /**
  * Convert an instance of CommentsGetThreadedCommentResponseUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

