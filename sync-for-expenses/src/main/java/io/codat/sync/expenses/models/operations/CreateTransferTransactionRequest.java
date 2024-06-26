/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.utils.SpeakeasyMetadata;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class CreateTransferTransactionRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends io.codat.sync.expenses.models.components.CreateTransferRequest> createTransferRequest;

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * The unique identifier for your SMB's transaction.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=transactionId")
    private String transactionId;

    public CreateTransferTransactionRequest(
            Optional<? extends io.codat.sync.expenses.models.components.CreateTransferRequest> createTransferRequest,
            String companyId,
            String transactionId) {
        Utils.checkNotNull(createTransferRequest, "createTransferRequest");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(transactionId, "transactionId");
        this.createTransferRequest = createTransferRequest;
        this.companyId = companyId;
        this.transactionId = transactionId;
    }

    public Optional<? extends io.codat.sync.expenses.models.components.CreateTransferRequest> createTransferRequest() {
        return createTransferRequest;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }

    /**
     * The unique identifier for your SMB's transaction.
     */
    public String transactionId() {
        return transactionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateTransferTransactionRequest withCreateTransferRequest(io.codat.sync.expenses.models.components.CreateTransferRequest createTransferRequest) {
        Utils.checkNotNull(createTransferRequest, "createTransferRequest");
        this.createTransferRequest = Optional.ofNullable(createTransferRequest);
        return this;
    }

    public CreateTransferTransactionRequest withCreateTransferRequest(Optional<? extends io.codat.sync.expenses.models.components.CreateTransferRequest> createTransferRequest) {
        Utils.checkNotNull(createTransferRequest, "createTransferRequest");
        this.createTransferRequest = createTransferRequest;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public CreateTransferTransactionRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * The unique identifier for your SMB's transaction.
     */
    public CreateTransferTransactionRequest withTransactionId(String transactionId) {
        Utils.checkNotNull(transactionId, "transactionId");
        this.transactionId = transactionId;
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
        CreateTransferTransactionRequest other = (CreateTransferTransactionRequest) o;
        return 
            java.util.Objects.deepEquals(this.createTransferRequest, other.createTransferRequest) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.transactionId, other.transactionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            createTransferRequest,
            companyId,
            transactionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTransferTransactionRequest.class,
                "createTransferRequest", createTransferRequest,
                "companyId", companyId,
                "transactionId", transactionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.sync.expenses.models.components.CreateTransferRequest> createTransferRequest = Optional.empty();
 
        private String companyId;
 
        private String transactionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createTransferRequest(io.codat.sync.expenses.models.components.CreateTransferRequest createTransferRequest) {
            Utils.checkNotNull(createTransferRequest, "createTransferRequest");
            this.createTransferRequest = Optional.ofNullable(createTransferRequest);
            return this;
        }

        public Builder createTransferRequest(Optional<? extends io.codat.sync.expenses.models.components.CreateTransferRequest> createTransferRequest) {
            Utils.checkNotNull(createTransferRequest, "createTransferRequest");
            this.createTransferRequest = createTransferRequest;
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
         * The unique identifier for your SMB's transaction.
         */
        public Builder transactionId(String transactionId) {
            Utils.checkNotNull(transactionId, "transactionId");
            this.transactionId = transactionId;
            return this;
        }
        
        public CreateTransferTransactionRequest build() {
            return new CreateTransferTransactionRequest(
                createTransferRequest,
                companyId,
                transactionId);
        }
    }
}

