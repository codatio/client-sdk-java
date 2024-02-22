/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payroll;

import io.codat.sync.payroll.models.operations.SDKMethodInterfaces.*;
import io.codat.sync.payroll.utils.HTTPClient;
import io.codat.sync.payroll.utils.RetryConfig;
import io.codat.sync.payroll.utils.SpeakeasyHTTPClient;
import io.codat.sync.payroll.utils.Utils;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Sync for Payroll: The API for Sync for Payroll. 
 * 
 * Sync for Payroll is an API and a set of supporting tools built to help integrate your customers' payroll data from their HR and payroll platforms into their accounting platforms and to support its reconciliation.
 * 
 * [Explore product](https://docs.codat.io/payroll/overview) | [See OpenAPI spec](https://github.com/codatio/oas)
 * 
 * ---
 * 
 * ## Endpoints
 * 
 * | Endpoints            | Description                                                                                                |
 * |:---------------------|:-----------------------------------------------------------------------------------------------------------|
 * | Companies            | Create and manage your SMB users' companies.                                                               |
 * | Connections          | Create new and manage existing data connections for a company.                                             |
 * | Accounts             | Get, create, and update Accounts.                                                           |
 * | Journal entries      | Get, create, and update Journal entries.                                                           |
 * | Journals             | Get, create, and update Journals.                                                           |
 * | Tracking categories  | Get, create, and update Tracking Categories for additional categorization of payroll components.                                                           |
 * | Company info         | View company profile from the source platform.                                                             |
 * | Manage data          | Control how data is retrieved from an integration.                                                         |
 */
public class CodatSyncPayroll {
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
     * Create and manage your Codat companies.
     */
    private final Companies companies;

    /**
     * Manage your companies' data connections.
     */
    private final Connections connections;

    /**
     * Accounts
     */
    private final Accounts accounts;

    /**
     * Journal entries
     */
    private final JournalEntries journalEntries;

    /**
     * Journals
     */
    private final Journals journals;

    /**
     * Asynchronously retrieve data from an integration to refresh data in Codat.
     */
    private final ManageData manageData;

    /**
     * View company information fetched from the source platform.
     */
    private final CompanyInfo companyInfo;

    /**
     * Tracking categories
     */
    private final TrackingCategories trackingCategories;

    /**
     * Create and manage your Codat companies.
     */
    public Companies companies() {
        return companies;
    }

    /**
     * Manage your companies' data connections.
     */
    public Connections connections() {
        return connections;
    }

    /**
     * Accounts
     */
    public Accounts accounts() {
        return accounts;
    }

    /**
     * Journal entries
     */
    public JournalEntries journalEntries() {
        return journalEntries;
    }

    /**
     * Journals
     */
    public Journals journals() {
        return journals;
    }

    /**
     * Asynchronously retrieve data from an integration to refresh data in Codat.
     */
    public ManageData manageData() {
        return manageData;
    }

    /**
     * View company information fetched from the source platform.
     */
    public CompanyInfo companyInfo() {
        return companyInfo;
    }

    /**
     * Tracking categories
     */
    public TrackingCategories trackingCategories() {
        return trackingCategories;
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
            this.sdkConfiguration.securitySource = SecuritySource.of(io.codat.sync.payroll.models.components.Security.builder()
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
            this.sdkConfiguration.serverUrl = io.codat.sync.payroll.utils.Utils.templateUrl(serverUrl, params);
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
        public CodatSyncPayroll build() {
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
            return new CodatSyncPayroll(sdkConfiguration);
        }
    }

    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private CodatSyncPayroll(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.companies = new Companies(sdkConfiguration);
        this.connections = new Connections(sdkConfiguration);
        this.accounts = new Accounts(sdkConfiguration);
        this.journalEntries = new JournalEntries(sdkConfiguration);
        this.journals = new Journals(sdkConfiguration);
        this.manageData = new ManageData(sdkConfiguration);
        this.companyInfo = new CompanyInfo(sdkConfiguration);
        this.trackingCategories = new TrackingCategories(sdkConfiguration);
    }
































}
