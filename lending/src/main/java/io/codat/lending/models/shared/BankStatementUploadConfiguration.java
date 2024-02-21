/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;

/**
 * BankStatementUploadConfiguration - Settings for uploading banking data to Codat
 */

public class BankStatementUploadConfiguration {

    /**
     * The ID of the account in the 3rd party platform
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountId")
    private Optional<? extends String> accountId;

    /**
     * The truelayer provider ID, required if source is truelayer, ignored otherwise
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("providerId")
    private Optional<? extends String> providerId;

    /**
     * The source or format of the banking data e.g. Codat
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source")
    private Optional<? extends Source> source;

    public BankStatementUploadConfiguration(
            @JsonProperty("accountId") Optional<? extends String> accountId,
            @JsonProperty("providerId") Optional<? extends String> providerId,
            @JsonProperty("source") Optional<? extends Source> source) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(providerId, "providerId");
        Utils.checkNotNull(source, "source");
        this.accountId = accountId;
        this.providerId = providerId;
        this.source = source;
    }

    /**
     * The ID of the account in the 3rd party platform
     */
    public Optional<? extends String> accountId() {
        return accountId;
    }

    /**
     * The truelayer provider ID, required if source is truelayer, ignored otherwise
     */
    public Optional<? extends String> providerId() {
        return providerId;
    }

    /**
     * The source or format of the banking data e.g. Codat
     */
    public Optional<? extends Source> source() {
        return source;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the account in the 3rd party platform
     */
    public BankStatementUploadConfiguration withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = Optional.ofNullable(accountId);
        return this;
    }
    
    /**
     * The ID of the account in the 3rd party platform
     */
    public BankStatementUploadConfiguration withAccountId(Optional<? extends String> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    /**
     * The truelayer provider ID, required if source is truelayer, ignored otherwise
     */
    public BankStatementUploadConfiguration withProviderId(String providerId) {
        Utils.checkNotNull(providerId, "providerId");
        this.providerId = Optional.ofNullable(providerId);
        return this;
    }
    
    /**
     * The truelayer provider ID, required if source is truelayer, ignored otherwise
     */
    public BankStatementUploadConfiguration withProviderId(Optional<? extends String> providerId) {
        Utils.checkNotNull(providerId, "providerId");
        this.providerId = providerId;
        return this;
    }

    /**
     * The source or format of the banking data e.g. Codat
     */
    public BankStatementUploadConfiguration withSource(Source source) {
        Utils.checkNotNull(source, "source");
        this.source = Optional.ofNullable(source);
        return this;
    }
    
    /**
     * The source or format of the banking data e.g. Codat
     */
    public BankStatementUploadConfiguration withSource(Optional<? extends Source> source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankStatementUploadConfiguration other = (BankStatementUploadConfiguration) o;
        return 
            java.util.Objects.deepEquals(this.accountId, other.accountId) &&
            java.util.Objects.deepEquals(this.providerId, other.providerId) &&
            java.util.Objects.deepEquals(this.source, other.source);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountId,
            providerId,
            source);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BankStatementUploadConfiguration.class,
                "accountId", accountId,
                "providerId", providerId,
                "source", source);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> accountId = Optional.empty();
 
        private Optional<? extends String> providerId = Optional.empty();
 
        private Optional<? extends Source> source = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the account in the 3rd party platform
         */
        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = Optional.ofNullable(accountId);
            return this;
        }
        
        /**
         * The ID of the account in the 3rd party platform
         */
        public Builder accountId(Optional<? extends String> accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        /**
         * The truelayer provider ID, required if source is truelayer, ignored otherwise
         */
        public Builder providerId(String providerId) {
            Utils.checkNotNull(providerId, "providerId");
            this.providerId = Optional.ofNullable(providerId);
            return this;
        }
        
        /**
         * The truelayer provider ID, required if source is truelayer, ignored otherwise
         */
        public Builder providerId(Optional<? extends String> providerId) {
            Utils.checkNotNull(providerId, "providerId");
            this.providerId = providerId;
            return this;
        }

        /**
         * The source or format of the banking data e.g. Codat
         */
        public Builder source(Source source) {
            Utils.checkNotNull(source, "source");
            this.source = Optional.ofNullable(source);
            return this;
        }
        
        /**
         * The source or format of the banking data e.g. Codat
         */
        public Builder source(Optional<? extends Source> source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }
        
        public BankStatementUploadConfiguration build() {
            return new BankStatementUploadConfiguration(
                accountId,
                providerId,
                source);
        }
    }
}
