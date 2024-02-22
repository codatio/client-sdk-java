/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.commerce;

import io.codat.sync.commerce.models.operations.SDKMethodInterfaces.*;
import io.codat.sync.commerce.utils.HTTPClient;
import io.codat.sync.commerce.utils.RetryConfig;
import io.codat.sync.commerce.utils.SpeakeasyHTTPClient;
import io.codat.sync.commerce.utils.Utils;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Sync for Commerce: The API for Sync for Commerce. 
 * 
 * Sync for Commerce automatically replicates and reconciles sales data from a merchant’s source PoS, Payments, and eCommerce systems into their accounting software. This eliminates manual processing by merchants and transforms their ability to run and grow their business.
 *   
 * [Read More...](https://docs.codat.io/commerce/overview)
 * 
 * Not seeing the endpoints you're expecting? We've [reorganized our products](https://docs.codat.io/updates/230901-new-products), and you may be using a [different version of Sync for Commerce](https://docs.codat.io/sync-for-commerce-v1-api#/).
 */
public class CodatSyncCommerce {
    /**
     * SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] SERVERS = {
        /**
         * Production
         */
        "https://api.codat.io",
    };

    /**
     * Configure preferences for any given Sync for Commerce company using sync flow.
     */
    private final SyncFlowSettings syncFlowSettings;

    /**
     * Advanced company management and sync preferences.
     */
    private final AdvancedControls advancedControls;

    /**
     * Create new and manage existing Sync for Commerce connections using the Sync flow UI.
     */
    private final Connections connections;

    /**
     * Initiate and monitor the sync of company data into accounting software.
     */
    private final Sync sync;

    /**
     * View useful information about codat's integrations.
     */
    private final Integrations integrations;

    /**
     * Configure preferences for any given Sync for Commerce company using sync flow.
     */
    public SyncFlowSettings syncFlowSettings() {
        return syncFlowSettings;
    }

    /**
     * Advanced company management and sync preferences.
     */
    public AdvancedControls advancedControls() {
        return advancedControls;
    }

    /**
     * Create new and manage existing Sync for Commerce connections using the Sync flow UI.
     */
    public Connections connections() {
        return connections;
    }

    /**
     * Initiate and monitor the sync of company data into accounting software.
     */
    public Sync sync() {
        return sync;
    }

    /**
     * View useful information about codat's integrations.
     */
    public Integrations integrations() {
        return integrations;
    }

    private final SDKConfiguration sdkConfiguration;

    /**
     * The Builder class allows the configuration of a new instance of the SDK.
     */
    public static class Builder {

        private final SDKConfiguration sdkConfiguration = new SDKConfiguration();

        private Builder() {
        }

        /**
         * Allows the default HTTP client to be overridden with a custom implementation.
         *
         * @param client The HTTP client to use for all requests.
         * @return The builder instance.
         */
        public Builder client(HTTPClient client) {
            this.sdkConfiguration.defaultClient = client;
            return this;
        }
        /**
         * Configures the SDK security to use the provided secret.
         *
         * @param authHeader The secret to use for all requests.
         * @return The builder instance.
         */
        public Builder authHeader(String authHeader) {
            this.sdkConfiguration.securitySource = SecuritySource.of(io.codat.sync.commerce.models.components.Security.builder()
              .authHeader(authHeader)
              .build());
            return this;
        }

        /**
         * Configures the SDK to use a custom security source.
         * @param securitySource The security source to use for all requests.
         * @return The builder instance.
         */
        public Builder securitySource(SecuritySource securitySource) {
            this.sdkConfiguration.securitySource = securitySource;
            return this;
        }
        
        /**
         * Overrides the default server URL.
         *
         * @param serverUrl The server URL to use for all requests.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl) {
            this.sdkConfiguration.serverUrl = serverUrl;
            return this;
        }

        /**
         * Overrides the default server URL  with a templated URL populated with the provided parameters.
         *
         * @param serverUrl The server URL to use for all requests.
         * @param params The parameters to use when templating the URL.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl, java.util.Map<String, String> params) {
            this.sdkConfiguration.serverUrl = io.codat.sync.commerce.utils.Utils.templateUrl(serverUrl, params);
            return this;
        }
        
        /**
         * Overrides the default server by index.
         *
         * @param serverIdx The server to use for all requests.
         * @return The builder instance.
         */
        public Builder serverIndex(int serverIdx) {
            this.sdkConfiguration.serverIdx = serverIdx;
            this.sdkConfiguration.serverUrl = SERVERS[serverIdx];
            return this;
        }
        
        /**
         * Overrides the default configuration for retries
         *
         * @param retryConfig The retry configuration to use for all requests.
         * @return The builder instance.
         */
        public Builder retryConfig(RetryConfig retryConfig) {
            this.sdkConfiguration.retryConfig = Optional.of(retryConfig);
            return this;
        }
        /**
         * Builds a new instance of the SDK.
         * @return The SDK instance.
         */
        public CodatSyncCommerce build() {
            if (sdkConfiguration.defaultClient == null) {
                sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
            }
	    if (sdkConfiguration.securitySource == null) {
	    	sdkConfiguration.securitySource = SecuritySource.of(null);
	    }
            if (sdkConfiguration.serverUrl == null || sdkConfiguration.serverUrl.isBlank()) {
                sdkConfiguration.serverUrl = SERVERS[0];
                sdkConfiguration.serverIdx = 0;
            }
            if (sdkConfiguration.serverUrl.endsWith("/")) {
                sdkConfiguration.serverUrl = sdkConfiguration.serverUrl.substring(0, sdkConfiguration.serverUrl.length() - 1);
            }
            return new CodatSyncCommerce(sdkConfiguration);
        }
    }

    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private CodatSyncCommerce(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.syncFlowSettings = new SyncFlowSettings(sdkConfiguration);
        this.advancedControls = new AdvancedControls(sdkConfiguration);
        this.connections = new Connections(sdkConfiguration);
        this.sync = new Sync(sdkConfiguration);
        this.integrations = new Integrations(sdkConfiguration);
    }





















}
