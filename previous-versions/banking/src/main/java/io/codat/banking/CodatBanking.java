/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.banking;

import io.codat.banking.models.operations.SDKMethodInterfaces.*;
import io.codat.banking.utils.HTTPClient;
import io.codat.banking.utils.RetryConfig;
import io.codat.banking.utils.SpeakeasyHTTPClient;
import java.lang.String;
import java.util.Map;
import java.util.Optional;

/**
 * Banking API: Codat's standardized API for accessing banking data.
 * &gt; ### New to Codat?
 * &gt;
 * &gt; Our Banking API reference is relevant only to our existing clients.
 * &gt; Please reach out to your Codat contact so that we can find the right product for you.
 * 
 * Codat's Banking API allows you to access standardised data from over bank accounts via third party providers.
 * 
 * Standardize how you connect to your customers’ bank accounts. Retrieve bank account and bank transaction data in the same way via our partnerships with Plaid and TrueLayer.
 * 
 * &lt;!-- Start Codat Tags Table --&gt;
 * ## Endpoints
 * 
 * | Endpoints | Description |
 * | :- |:- |
 * | Accounts | Where payments are made or received, and bank transactions are recorded. |
 * | Account balances | Balances for a bank account including end-of-day batch balance or running balances per transaction. |
 * | Transactions | An immutable source of up-to-date information on income and expenditure. |
 * | Transaction categories | Hierarchical categories associated with a transaction for greater contextual meaning to transaction activity. |
 * &lt;!-- End Codat Tags Table --&gt;
 * 
 * [Read more...](https://docs.codat.io/banking-api/overview)
 * 
 * [See our OpenAPI spec](https://github.com/codatio/oas) 
 */
public class CodatBanking {


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
     * Balances for a bank account including end-of-day batch balance or running balances per transaction.
     */
    private final AccountBalances accountBalances;

    /**
     * Where payments are made or received, and bank transactions are recorded.
     */
    private final Accounts accounts;

    /**
     * Hierarchical categories associated with a transaction for greater contextual meaning to transaction activity.
     */
    private final TransactionCategories transactionCategories;

    /**
     * An immutable source of up-to-date information on income and expenditure.
     */
    private final Transactions transactions;

    /**
     * Balances for a bank account including end-of-day batch balance or running balances per transaction.
     */
    public AccountBalances accountBalances() {
        return accountBalances;
    }

    /**
     * Where payments are made or received, and bank transactions are recorded.
     */
    public Accounts accounts() {
        return accounts;
    }

    /**
     * Hierarchical categories associated with a transaction for greater contextual meaning to transaction activity.
     */
    public TransactionCategories transactionCategories() {
        return transactionCategories;
    }

    /**
     * An immutable source of up-to-date information on income and expenditure.
     */
    public Transactions transactions() {
        return transactions;
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
            this.sdkConfiguration.securitySource = SecuritySource.of(io.codat.banking.models.components.Security.builder()
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
        public Builder serverURL(String serverUrl, Map<String, String> params) {
            this.sdkConfiguration.serverUrl = io.codat.banking.utils.Utils.templateUrl(serverUrl, params);
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
        void _hooks(io.codat.banking.utils.Hooks hooks) {
            sdkConfiguration.setHooks(hooks);    
        }
        
        /**
         * Builds a new instance of the SDK.
         * @return The SDK instance.
         */
        public CodatBanking build() {
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
            return new CodatBanking(sdkConfiguration);
        }
    }
    
    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private CodatBanking(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.accountBalances = new AccountBalances(sdkConfiguration);
        this.accounts = new Accounts(sdkConfiguration);
        this.transactionCategories = new TransactionCategories(sdkConfiguration);
        this.transactions = new Transactions(sdkConfiguration);
        this.sdkConfiguration.initialize();
    }}
