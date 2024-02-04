/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync_for_expenses.models.operations;

import io.codat.sync_for_expenses.utils.SpeakeasyMetadata;
import io.codat.sync_for_expenses.utils.Utils;
import java.io.InputStream;
import java.util.Optional;


public class UpdateExpenseTransactionRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends io.codat.sync_for_expenses.models.shared.UpdateExpenseRequest> updateExpenseRequest;

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

    public UpdateExpenseTransactionRequest(
            Optional<? extends io.codat.sync_for_expenses.models.shared.UpdateExpenseRequest> updateExpenseRequest,
            String companyId,
            String transactionId) {
        Utils.checkNotNull(updateExpenseRequest, "updateExpenseRequest");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(transactionId, "transactionId");
        this.updateExpenseRequest = updateExpenseRequest;
        this.companyId = companyId;
        this.transactionId = transactionId;
    }

    public Optional<? extends io.codat.sync_for_expenses.models.shared.UpdateExpenseRequest> updateExpenseRequest() {
        return updateExpenseRequest;
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

    public UpdateExpenseTransactionRequest withUpdateExpenseRequest(io.codat.sync_for_expenses.models.shared.UpdateExpenseRequest updateExpenseRequest) {
        Utils.checkNotNull(updateExpenseRequest, "updateExpenseRequest");
        this.updateExpenseRequest = Optional.ofNullable(updateExpenseRequest);
        return this;
    }
    
    public UpdateExpenseTransactionRequest withUpdateExpenseRequest(Optional<? extends io.codat.sync_for_expenses.models.shared.UpdateExpenseRequest> updateExpenseRequest) {
        Utils.checkNotNull(updateExpenseRequest, "updateExpenseRequest");
        this.updateExpenseRequest = updateExpenseRequest;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public UpdateExpenseTransactionRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * The unique identifier for your SMB's transaction.
     */
    public UpdateExpenseTransactionRequest withTransactionId(String transactionId) {
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
        UpdateExpenseTransactionRequest other = (UpdateExpenseTransactionRequest) o;
        return 
            java.util.Objects.deepEquals(this.updateExpenseRequest, other.updateExpenseRequest) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.transactionId, other.transactionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            updateExpenseRequest,
            companyId,
            transactionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateExpenseTransactionRequest.class,
                "updateExpenseRequest", updateExpenseRequest,
                "companyId", companyId,
                "transactionId", transactionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.sync_for_expenses.models.shared.UpdateExpenseRequest> updateExpenseRequest = Optional.empty();
 
        private String companyId;
 
        private String transactionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder updateExpenseRequest(io.codat.sync_for_expenses.models.shared.UpdateExpenseRequest updateExpenseRequest) {
            Utils.checkNotNull(updateExpenseRequest, "updateExpenseRequest");
            this.updateExpenseRequest = Optional.ofNullable(updateExpenseRequest);
            return this;
        }
        
        public Builder updateExpenseRequest(Optional<? extends io.codat.sync_for_expenses.models.shared.UpdateExpenseRequest> updateExpenseRequest) {
            Utils.checkNotNull(updateExpenseRequest, "updateExpenseRequest");
            this.updateExpenseRequest = updateExpenseRequest;
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
        
        public UpdateExpenseTransactionRequest build() {
            return new UpdateExpenseTransactionRequest(
                updateExpenseRequest,
                companyId,
                transactionId);
        }
    }
}

