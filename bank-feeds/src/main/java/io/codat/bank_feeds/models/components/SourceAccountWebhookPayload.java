/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.bank_feeds.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class SourceAccountWebhookPayload {

    /**
     * Unique identifier for your SMB in Codat.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("companyId")
    private Optional<String> companyId;

    /**
     * Unique identifier for a company's data connection.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("connectionId")
    private Optional<String> connectionId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("referenceCompany")
    private Optional<? extends CompanyReference> referenceCompany;

    /**
     * The target bank account in a supported accounting software for ingestion into a bank feed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceAccount")
    private Optional<? extends SourceAccount> sourceAccount;

    @JsonCreator
    public SourceAccountWebhookPayload(
            @JsonProperty("companyId") Optional<String> companyId,
            @JsonProperty("connectionId") Optional<String> connectionId,
            @JsonProperty("referenceCompany") Optional<? extends CompanyReference> referenceCompany,
            @JsonProperty("sourceAccount") Optional<? extends SourceAccount> sourceAccount) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(referenceCompany, "referenceCompany");
        Utils.checkNotNull(sourceAccount, "sourceAccount");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.referenceCompany = referenceCompany;
        this.sourceAccount = sourceAccount;
    }
    
    public SourceAccountWebhookPayload() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    @JsonIgnore
    public Optional<String> companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a company's data connection.
     */
    @JsonIgnore
    public Optional<String> connectionId() {
        return connectionId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CompanyReference> referenceCompany() {
        return (Optional<CompanyReference>) referenceCompany;
    }

    /**
     * The target bank account in a supported accounting software for ingestion into a bank feed.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceAccount> sourceAccount() {
        return (Optional<SourceAccount>) sourceAccount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    public SourceAccountWebhookPayload withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = Optional.ofNullable(companyId);
        return this;
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    public SourceAccountWebhookPayload withCompanyId(Optional<String> companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a company's data connection.
     */
    public SourceAccountWebhookPayload withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = Optional.ofNullable(connectionId);
        return this;
    }

    /**
     * Unique identifier for a company's data connection.
     */
    public SourceAccountWebhookPayload withConnectionId(Optional<String> connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    public SourceAccountWebhookPayload withReferenceCompany(CompanyReference referenceCompany) {
        Utils.checkNotNull(referenceCompany, "referenceCompany");
        this.referenceCompany = Optional.ofNullable(referenceCompany);
        return this;
    }

    public SourceAccountWebhookPayload withReferenceCompany(Optional<? extends CompanyReference> referenceCompany) {
        Utils.checkNotNull(referenceCompany, "referenceCompany");
        this.referenceCompany = referenceCompany;
        return this;
    }

    /**
     * The target bank account in a supported accounting software for ingestion into a bank feed.
     */
    public SourceAccountWebhookPayload withSourceAccount(SourceAccount sourceAccount) {
        Utils.checkNotNull(sourceAccount, "sourceAccount");
        this.sourceAccount = Optional.ofNullable(sourceAccount);
        return this;
    }

    /**
     * The target bank account in a supported accounting software for ingestion into a bank feed.
     */
    public SourceAccountWebhookPayload withSourceAccount(Optional<? extends SourceAccount> sourceAccount) {
        Utils.checkNotNull(sourceAccount, "sourceAccount");
        this.sourceAccount = sourceAccount;
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
        SourceAccountWebhookPayload other = (SourceAccountWebhookPayload) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.referenceCompany, other.referenceCompany) &&
            Objects.deepEquals(this.sourceAccount, other.sourceAccount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            connectionId,
            referenceCompany,
            sourceAccount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAccountWebhookPayload.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "referenceCompany", referenceCompany,
                "sourceAccount", sourceAccount);
    }
    
    public final static class Builder {
 
        private Optional<String> companyId = Optional.empty();
 
        private Optional<String> connectionId = Optional.empty();
 
        private Optional<? extends CompanyReference> referenceCompany = Optional.empty();
 
        private Optional<? extends SourceAccount> sourceAccount = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for your SMB in Codat.
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = Optional.ofNullable(companyId);
            return this;
        }

        /**
         * Unique identifier for your SMB in Codat.
         */
        public Builder companyId(Optional<String> companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        /**
         * Unique identifier for a company's data connection.
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = Optional.ofNullable(connectionId);
            return this;
        }

        /**
         * Unique identifier for a company's data connection.
         */
        public Builder connectionId(Optional<String> connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        public Builder referenceCompany(CompanyReference referenceCompany) {
            Utils.checkNotNull(referenceCompany, "referenceCompany");
            this.referenceCompany = Optional.ofNullable(referenceCompany);
            return this;
        }

        public Builder referenceCompany(Optional<? extends CompanyReference> referenceCompany) {
            Utils.checkNotNull(referenceCompany, "referenceCompany");
            this.referenceCompany = referenceCompany;
            return this;
        }

        /**
         * The target bank account in a supported accounting software for ingestion into a bank feed.
         */
        public Builder sourceAccount(SourceAccount sourceAccount) {
            Utils.checkNotNull(sourceAccount, "sourceAccount");
            this.sourceAccount = Optional.ofNullable(sourceAccount);
            return this;
        }

        /**
         * The target bank account in a supported accounting software for ingestion into a bank feed.
         */
        public Builder sourceAccount(Optional<? extends SourceAccount> sourceAccount) {
            Utils.checkNotNull(sourceAccount, "sourceAccount");
            this.sourceAccount = sourceAccount;
            return this;
        }
        
        public SourceAccountWebhookPayload build() {
            return new SourceAccountWebhookPayload(
                companyId,
                connectionId,
                referenceCompany,
                sourceAccount);
        }
    }
}

