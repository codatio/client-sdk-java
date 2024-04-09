/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payables;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.payables.models.operations.SDKMethodInterfaces.*;
import io.codat.sync.payables.utils.HTTPClient;
import io.codat.sync.payables.utils.RetryConfig;
import io.codat.sync.payables.utils.SpeakeasyHTTPClient;
import io.codat.sync.payables.utils.Utils;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Bill pay kit: The API reference for the Bill Pay kit. 
 * 
 * The bill pay kit is an API and a set of supporting tools designed to integrate a bill pay flow into your app as quickly as possible. It's ideal for facilitating essential bill payment processes within your SMB's accounting platforms.
 * 
 * [Explore product](https://docs.codat.io/payables/bill-pay-kit) | [See OpenAPI spec](https://github.com/codatio/oas)
 * 
 */
public class CodatSyncPayables {
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
     * View company profile from the source platform.
     */
    private final CompanyInformation companyInformation;

    /**
     * Manage your companies' data connections.
     */
    private final Connections connections;

    /**
     * Bills
     */
    private final Bills bills;

    /**
     * Bank accounts
     */
    private final BankAccounts bankAccounts;

    /**
     * Bill payments
     */
    private final BillPayments billPayments;

    /**
     * Suppliers
     */
    private final Suppliers suppliers;

    /**
     * Create and manage your Codat companies.
     */
    public Companies companies() {
        return companies;
    }

    /**
     * View company profile from the source platform.
     */
    public CompanyInformation companyInformation() {
        return companyInformation;
    }

    /**
     * Manage your companies' data connections.
     */
    public Connections connections() {
        return connections;
    }

    /**
     * Bills
     */
    public Bills bills() {
        return bills;
    }

    /**
     * Bank accounts
     */
    public BankAccounts bankAccounts() {
        return bankAccounts;
    }

    /**
     * Bill payments
     */
    public BillPayments billPayments() {
        return billPayments;
    }

    /**
     * Suppliers
     */
    public Suppliers suppliers() {
        return suppliers;
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
            this.sdkConfiguration.securitySource = SecuritySource.of(io.codat.sync.payables.models.components.Security.builder()
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
            this.sdkConfiguration.serverUrl = io.codat.sync.payables.utils.Utils.templateUrl(serverUrl, params);
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
        public CodatSyncPayables build() {
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
            return new CodatSyncPayables(sdkConfiguration);
        }
    }

    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private CodatSyncPayables(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.companies = new Companies(sdkConfiguration);
        this.companyInformation = new CompanyInformation(sdkConfiguration);
        this.connections = new Connections(sdkConfiguration);
        this.bills = new Bills(sdkConfiguration);
        this.bankAccounts = new BankAccounts(sdkConfiguration);
        this.billPayments = new BillPayments(sdkConfiguration);
        this.suppliers = new Suppliers(sdkConfiguration);
    }





















}
