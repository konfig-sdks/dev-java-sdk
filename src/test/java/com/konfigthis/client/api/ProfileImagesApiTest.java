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
import com.konfigthis.client.model.ProfileImage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProfileImagesApi
 */
@Disabled
public class ProfileImagesApiTest {

    private static ProfileImagesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ProfileImagesApi(apiClient);
    }

    /**
     * A Users or organizations profile image
     *
     * This endpoint allows the client to retrieve a user or organization profile image information by its         corresponding username.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByUsernameTest() throws ApiException {
        String username = null;
        List<ProfileImage> response = api.getByUsername(username)
                .execute();
        // TODO: test validations
    }

}
