/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.models.shared.BankFeedBankAccountMapping;
import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateBankAccountMappingRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends BankFeedBankAccountMapping> bankFeedBankAccountMapping;

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for a connection.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connectionId")
    private String connectionId;

    @JsonCreator
    public CreateBankAccountMappingRequest(
            Optional<? extends BankFeedBankAccountMapping> bankFeedBankAccountMapping,
            String companyId,
            String connectionId) {
        Utils.checkNotNull(bankFeedBankAccountMapping, "bankFeedBankAccountMapping");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        this.bankFeedBankAccountMapping = bankFeedBankAccountMapping;
        this.companyId = companyId;
        this.connectionId = connectionId;
    }
    
    public CreateBankAccountMappingRequest(
            String companyId,
            String connectionId) {
        this(Optional.empty(), companyId, connectionId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BankFeedBankAccountMapping> bankFeedBankAccountMapping() {
        return (Optional<BankFeedBankAccountMapping>) bankFeedBankAccountMapping;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a connection.
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateBankAccountMappingRequest withBankFeedBankAccountMapping(BankFeedBankAccountMapping bankFeedBankAccountMapping) {
        Utils.checkNotNull(bankFeedBankAccountMapping, "bankFeedBankAccountMapping");
        this.bankFeedBankAccountMapping = Optional.ofNullable(bankFeedBankAccountMapping);
        return this;
    }

    public CreateBankAccountMappingRequest withBankFeedBankAccountMapping(Optional<? extends BankFeedBankAccountMapping> bankFeedBankAccountMapping) {
        Utils.checkNotNull(bankFeedBankAccountMapping, "bankFeedBankAccountMapping");
        this.bankFeedBankAccountMapping = bankFeedBankAccountMapping;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public CreateBankAccountMappingRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public CreateBankAccountMappingRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
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
        CreateBankAccountMappingRequest other = (CreateBankAccountMappingRequest) o;
        return 
            Objects.deepEquals(this.bankFeedBankAccountMapping, other.bankFeedBankAccountMapping) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            bankFeedBankAccountMapping,
            companyId,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBankAccountMappingRequest.class,
                "bankFeedBankAccountMapping", bankFeedBankAccountMapping,
                "companyId", companyId,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends BankFeedBankAccountMapping> bankFeedBankAccountMapping = Optional.empty();
 
        private String companyId;
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder bankFeedBankAccountMapping(BankFeedBankAccountMapping bankFeedBankAccountMapping) {
            Utils.checkNotNull(bankFeedBankAccountMapping, "bankFeedBankAccountMapping");
            this.bankFeedBankAccountMapping = Optional.ofNullable(bankFeedBankAccountMapping);
            return this;
        }

        public Builder bankFeedBankAccountMapping(Optional<? extends BankFeedBankAccountMapping> bankFeedBankAccountMapping) {
            Utils.checkNotNull(bankFeedBankAccountMapping, "bankFeedBankAccountMapping");
            this.bankFeedBankAccountMapping = bankFeedBankAccountMapping;
            return this;
        }

        /**
         * Unique identifier for a company.
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        /**
         * Unique identifier for a connection.
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }
        
        public CreateBankAccountMappingRequest build() {
            return new CreateBankAccountMappingRequest(
                bankFeedBankAccountMapping,
                companyId,
                connectionId);
        }
    }
}
