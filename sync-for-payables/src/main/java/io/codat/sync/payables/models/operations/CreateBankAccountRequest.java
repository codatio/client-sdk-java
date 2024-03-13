/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payables.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.payables.utils.SpeakeasyMetadata;
import io.codat.sync.payables.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class CreateBankAccountRequest {

    /**
     * A unique identifier to ensure idempotent behaviour for subsequent requests.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Idempotency-Key")
    private Optional<? extends String> idempotencyKey;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends io.codat.sync.payables.models.components.BankAccountPrototype> bankAccountPrototype;

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

    public CreateBankAccountRequest(
            Optional<? extends String> idempotencyKey,
            Optional<? extends io.codat.sync.payables.models.components.BankAccountPrototype> bankAccountPrototype,
            String companyId,
            String connectionId) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        Utils.checkNotNull(bankAccountPrototype, "bankAccountPrototype");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        this.idempotencyKey = idempotencyKey;
        this.bankAccountPrototype = bankAccountPrototype;
        this.companyId = companyId;
        this.connectionId = connectionId;
    }

    /**
     * A unique identifier to ensure idempotent behaviour for subsequent requests.
     */
    public Optional<? extends String> idempotencyKey() {
        return idempotencyKey;
    }

    public Optional<? extends io.codat.sync.payables.models.components.BankAccountPrototype> bankAccountPrototype() {
        return bankAccountPrototype;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a connection.
     */
    public String connectionId() {
        return connectionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier to ensure idempotent behaviour for subsequent requests.
     */
    public CreateBankAccountRequest withIdempotencyKey(String idempotencyKey) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        this.idempotencyKey = Optional.ofNullable(idempotencyKey);
        return this;
    }

    /**
     * A unique identifier to ensure idempotent behaviour for subsequent requests.
     */
    public CreateBankAccountRequest withIdempotencyKey(Optional<? extends String> idempotencyKey) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        this.idempotencyKey = idempotencyKey;
        return this;
    }

    public CreateBankAccountRequest withBankAccountPrototype(io.codat.sync.payables.models.components.BankAccountPrototype bankAccountPrototype) {
        Utils.checkNotNull(bankAccountPrototype, "bankAccountPrototype");
        this.bankAccountPrototype = Optional.ofNullable(bankAccountPrototype);
        return this;
    }

    public CreateBankAccountRequest withBankAccountPrototype(Optional<? extends io.codat.sync.payables.models.components.BankAccountPrototype> bankAccountPrototype) {
        Utils.checkNotNull(bankAccountPrototype, "bankAccountPrototype");
        this.bankAccountPrototype = bankAccountPrototype;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public CreateBankAccountRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public CreateBankAccountRequest withConnectionId(String connectionId) {
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
        CreateBankAccountRequest other = (CreateBankAccountRequest) o;
        return 
            java.util.Objects.deepEquals(this.idempotencyKey, other.idempotencyKey) &&
            java.util.Objects.deepEquals(this.bankAccountPrototype, other.bankAccountPrototype) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            idempotencyKey,
            bankAccountPrototype,
            companyId,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBankAccountRequest.class,
                "idempotencyKey", idempotencyKey,
                "bankAccountPrototype", bankAccountPrototype,
                "companyId", companyId,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> idempotencyKey = Optional.empty();
 
        private Optional<? extends io.codat.sync.payables.models.components.BankAccountPrototype> bankAccountPrototype = Optional.empty();
 
        private String companyId;
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A unique identifier to ensure idempotent behaviour for subsequent requests.
         */
        public Builder idempotencyKey(String idempotencyKey) {
            Utils.checkNotNull(idempotencyKey, "idempotencyKey");
            this.idempotencyKey = Optional.ofNullable(idempotencyKey);
            return this;
        }

        /**
         * A unique identifier to ensure idempotent behaviour for subsequent requests.
         */
        public Builder idempotencyKey(Optional<? extends String> idempotencyKey) {
            Utils.checkNotNull(idempotencyKey, "idempotencyKey");
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        public Builder bankAccountPrototype(io.codat.sync.payables.models.components.BankAccountPrototype bankAccountPrototype) {
            Utils.checkNotNull(bankAccountPrototype, "bankAccountPrototype");
            this.bankAccountPrototype = Optional.ofNullable(bankAccountPrototype);
            return this;
        }

        public Builder bankAccountPrototype(Optional<? extends io.codat.sync.payables.models.components.BankAccountPrototype> bankAccountPrototype) {
            Utils.checkNotNull(bankAccountPrototype, "bankAccountPrototype");
            this.bankAccountPrototype = bankAccountPrototype;
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
        
        public CreateBankAccountRequest build() {
            return new CreateBankAccountRequest(
                idempotencyKey,
                bankAccountPrototype,
                companyId,
                connectionId);
        }
    }
}
