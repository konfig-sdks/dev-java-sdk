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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ReactionsCreateReactionResponse;
import com.konfigthis.client.model.ReactionsToggleUserReactionResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReactionsApi
 */
@Disabled
public class ReactionsApiTest {

    private static ReactionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ReactionsApi(apiClient);
    }

    /**
     * create reaction
     *
     * This endpoint allows the client to create a reaction to a specified reactable (eg, Article, Comment, or User). For examples:         * \&quot;Like\&quot;ing an Article will create a new \&quot;like\&quot; Reaction from the user for that Articles         * \&quot;Like\&quot;ing that Article a second time will return the previous \&quot;like\&quot;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createReactionTest() throws ApiException {
        String category = null;
        Integer reactableId = null;
        String reactableType = null;
        ReactionsCreateReactionResponse response = api.createReaction(category, reactableId, reactableType)
                .execute();
        // TODO: test validations
    }

    /**
     * toggle reaction
     *
     * This endpoint allows the client to toggle the user&#39;s reaction to a specified reactable (eg, Article, Comment, or User). For examples:         * \&quot;Like\&quot;ing an Article will create a new \&quot;like\&quot; Reaction from the user for that Articles         * \&quot;Like\&quot;ing that Article a second time will remove the \&quot;like\&quot; from the user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toggleUserReactionTest() throws ApiException {
        String category = null;
        Integer reactableId = null;
        String reactableType = null;
        ReactionsToggleUserReactionResponse response = api.toggleUserReaction(category, reactableId, reactableType)
                .execute();
        // TODO: test validations
    }

}
