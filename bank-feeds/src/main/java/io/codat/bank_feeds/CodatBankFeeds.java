/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.bank_feeds;

import io.codat.bank_feeds.models.operations.SDKMethodInterfaces.*;
import io.codat.bank_feeds.utils.HTTPClient;
import io.codat.bank_feeds.utils.RetryConfig;
import io.codat.bank_feeds.utils.SpeakeasyHTTPClient;
import io.codat.bank_feeds.utils.Utils;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Bank Feeds API: Bank Feeds API enables your SMB users to set up bank feeds from accounts in your application to supported accounting platforms.
 * 
 * A bank feed is a connection between a source bank account in your application and a target bank account in a supported accounting package.
 * 
 * [Explore product](https://docs.codat.io/bank-feeds-api/overview) | [See OpenAPI spec](https://github.com/codatio/oas)
 * 
 * ---
 * 
 * ## Endpoints
 * 
 * | Endpoints | Description |
 * | :- | :- |
 * | Companies | Create and manage your SMB users' companies. |
 * | Connections | Create new and manage existing data connections for a company. |
 * | Source accounts | Provide and manage lists of source bank accounts.   |
 * | Transactions | Create new bank account transactions for a company's connections, and see previous operations. |
 * | Account mapping | Extra functionality for building an account management UI |
 */
public class CodatBankFeeds {
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
     * Bank feed bank account mapping.
     */
    private final AccountMapping accountMapping;

    /**
     * Source accounts act as a bridge to bank accounts in accounting software.
     */
    private final SourceAccounts sourceAccounts;

    /**
     * Access bank accounts in an SMBs accounting platform.
     */
    private final BankAccounts bankAccounts;

    /**
     * Transactions represent debits and credits from a source account.
     */
    private final Transactions transactions;

    /**
     * Configure bank feeds for a company.
     */
    private final Configuration configuration;

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
     * Bank feed bank account mapping.
     */
    public AccountMapping accountMapping() {
        return accountMapping;
    }

    /**
     * Source accounts act as a bridge to bank accounts in accounting software.
     */
    public SourceAccounts sourceAccounts() {
        return sourceAccounts;
    }

    /**
     * Access bank accounts in an SMBs accounting platform.
     */
    public BankAccounts bankAccounts() {
        return bankAccounts;
    }

    /**
     * Transactions represent debits and credits from a source account.
     */
    public Transactions transactions() {
        return transactions;
    }

    /**
     * Configure bank feeds for a company.
     */
    public Configuration configuration() {
        return configuration;
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
            this.sdkConfiguration.securitySource = SecuritySource.of(io.codat.bank_feeds.models.components.Security.builder()
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
            this.sdkConfiguration.serverUrl = io.codat.bank_feeds.utils.Utils.templateUrl(serverUrl, params);
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
        public CodatBankFeeds build() {
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
            return new CodatBankFeeds(sdkConfiguration);
        }
    }

    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private CodatBankFeeds(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.companies = new Companies(sdkConfiguration);
        this.connections = new Connections(sdkConfiguration);
        this.accountMapping = new AccountMapping(sdkConfiguration);
        this.sourceAccounts = new SourceAccounts(sdkConfiguration);
        this.bankAccounts = new BankAccounts(sdkConfiguration);
        this.transactions = new Transactions(sdkConfiguration);
        this.configuration = new Configuration(sdkConfiguration);
    }

























}
