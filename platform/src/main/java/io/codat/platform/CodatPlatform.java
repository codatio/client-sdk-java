/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform;

import io.codat.platform.models.operations.SDKMethodInterfaces.*;
import io.codat.platform.utils.HTTPClient;
import io.codat.platform.utils.RetryConfig;
import io.codat.platform.utils.SpeakeasyHTTPClient;
import java.lang.String;
import java.util.Map;
import java.util.Optional;

/**
 * Platform API: Platform API
 * An API for the common components of all of Codat's products.
 * 
 * These end points cover creating and managing your companies, data connections, and integrations.
 * 
 * [Read about the building blocks of Codat...](https://docs.codat.io/core-concepts/companies) | [See our OpenAPI spec](https://github.com/codatio/oas) 
 * 
 * ---
 * &lt;!-- Start Codat Tags Table --&gt;
 * ## Endpoints
 * 
 * | Endpoints | Description |
 * | :- |:- |
 * | Companies | Create and manage your SMB users' companies. |
 * | Connections | Create new and manage existing data connections for a company. |
 * | Connection management | Configure connection management UI and retrieve access tokens for authentication. |
 * | Groups | Define and manage sets of companies based on a chosen characteristic. |
 * | Webhooks | Create and manage webhooks that listen to Codat's events. |
 * | Integrations | Get a list of integrations supported by Codat and their logos. |
 * | Refresh data | Initiate data refreshes, view pull status and history. |
 * | Settings | Manage company profile configuration, sync settings, and API keys. |
 * | Push data | Initiate and monitor Create, Update, and Delete operations. |
 * | Supplemental data | Configure and pull additional data you can include in Codat's standard data types. |
 * | Custom data type | Configure and pull additional data types that are not included in Codat's standardized data model. |
 * &lt;!-- End Codat Tags Table --&gt;
 */
public class CodatPlatform {


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
     * Manage company profile configuration, sync settings, and API keys.
     */
    private final Settings settings;

    /**
     * Create and manage your SMB users' companies.
     */
    private final Companies companies;

    /**
     * Configure UI and retrieve access tokens for authentication used by **Connections SDK**.
     */
    private final ConnectionManagement connectionManagement;

    /**
     * Create new and manage existing data connections for a company.
     */
    private final Connections connections;

    /**
     * Configure and pull additional data types that are not included in Codat's standardized data model.
     */
    private final CustomDataType customDataType;

    /**
     * Initiate and monitor Create, Update, and Delete operations.
     */
    private final PushData pushData;

    /**
     * Initiate data refreshes, view pull status and history.
     */
    private final RefreshData refreshData;

    /**
     * Define and manage sets of companies based on a chosen characteristic.
     */
    private final Groups groups;

    /**
     * Get a list of integrations supported by Codat and their logos.
     */
    private final Integrations integrations;

    /**
     * Configure and pull additional data you can include in Codat's standard data types.
     */
    private final SupplementalData supplementalData;

    /**
     * Create and manage webhooks that listen to Codat's events.
     */
    private final Webhooks webhooks;

    /**
     * Manage company profile configuration, sync settings, and API keys.
     */
    public Settings settings() {
        return settings;
    }

    /**
     * Create and manage your SMB users' companies.
     */
    public Companies companies() {
        return companies;
    }

    /**
     * Configure UI and retrieve access tokens for authentication used by **Connections SDK**.
     */
    public ConnectionManagement connectionManagement() {
        return connectionManagement;
    }

    /**
     * Create new and manage existing data connections for a company.
     */
    public Connections connections() {
        return connections;
    }

    /**
     * Configure and pull additional data types that are not included in Codat's standardized data model.
     */
    public CustomDataType customDataType() {
        return customDataType;
    }

    /**
     * Initiate and monitor Create, Update, and Delete operations.
     */
    public PushData pushData() {
        return pushData;
    }

    /**
     * Initiate data refreshes, view pull status and history.
     */
    public RefreshData refreshData() {
        return refreshData;
    }

    /**
     * Define and manage sets of companies based on a chosen characteristic.
     */
    public Groups groups() {
        return groups;
    }

    /**
     * Get a list of integrations supported by Codat and their logos.
     */
    public Integrations integrations() {
        return integrations;
    }

    /**
     * Configure and pull additional data you can include in Codat's standard data types.
     */
    public SupplementalData supplementalData() {
        return supplementalData;
    }

    /**
     * Create and manage webhooks that listen to Codat's events.
     */
    public Webhooks webhooks() {
        return webhooks;
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
         * Configures the SDK to use the provided security details.
         *
         * @param security The security details to use for all requests.
         * @return The builder instance.
         */
        public Builder security(io.codat.platform.models.shared.Security security) {
            this.sdkConfiguration.securitySource = SecuritySource.of(security);
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
        public Builder serverURL(String serverUrl, Map<String, String> params) {
            this.sdkConfiguration.serverUrl = io.codat.platform.utils.Utils.templateUrl(serverUrl, params);
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
        // Visible for testing, will be accessed via reflection
        void _hooks(io.codat.platform.utils.Hooks hooks) {
            sdkConfiguration.setHooks(hooks);    
        }
        
        /**
         * Builds a new instance of the SDK.
         * @return The SDK instance.
         */
        public CodatPlatform build() {
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
            return new CodatPlatform(sdkConfiguration);
        }
    }
    
    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private CodatPlatform(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.settings = new Settings(sdkConfiguration);
        this.companies = new Companies(sdkConfiguration);
        this.connectionManagement = new ConnectionManagement(sdkConfiguration);
        this.connections = new Connections(sdkConfiguration);
        this.customDataType = new CustomDataType(sdkConfiguration);
        this.pushData = new PushData(sdkConfiguration);
        this.refreshData = new RefreshData(sdkConfiguration);
        this.groups = new Groups(sdkConfiguration);
        this.integrations = new Integrations(sdkConfiguration);
        this.supplementalData = new SupplementalData(sdkConfiguration);
        this.webhooks = new Webhooks(sdkConfiguration);
        this.sdkConfiguration.initialize();
    }}
