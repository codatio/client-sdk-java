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


public class CreateExpenseTransactionRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends io.codat.sync.expenses.models.components.CreateExpenseRequest> createExpenseRequest;

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    public CreateExpenseTransactionRequest(
            Optional<? extends io.codat.sync.expenses.models.components.CreateExpenseRequest> createExpenseRequest,
            String companyId) {
        Utils.checkNotNull(createExpenseRequest, "createExpenseRequest");
        Utils.checkNotNull(companyId, "companyId");
        this.createExpenseRequest = createExpenseRequest;
        this.companyId = companyId;
    }

    public Optional<? extends io.codat.sync.expenses.models.components.CreateExpenseRequest> createExpenseRequest() {
        return createExpenseRequest;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateExpenseTransactionRequest withCreateExpenseRequest(io.codat.sync.expenses.models.components.CreateExpenseRequest createExpenseRequest) {
        Utils.checkNotNull(createExpenseRequest, "createExpenseRequest");
        this.createExpenseRequest = Optional.ofNullable(createExpenseRequest);
        return this;
    }

    public CreateExpenseTransactionRequest withCreateExpenseRequest(Optional<? extends io.codat.sync.expenses.models.components.CreateExpenseRequest> createExpenseRequest) {
        Utils.checkNotNull(createExpenseRequest, "createExpenseRequest");
        this.createExpenseRequest = createExpenseRequest;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public CreateExpenseTransactionRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
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
        CreateExpenseTransactionRequest other = (CreateExpenseTransactionRequest) o;
        return 
            java.util.Objects.deepEquals(this.createExpenseRequest, other.createExpenseRequest) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            createExpenseRequest,
            companyId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateExpenseTransactionRequest.class,
                "createExpenseRequest", createExpenseRequest,
                "companyId", companyId);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.sync.expenses.models.components.CreateExpenseRequest> createExpenseRequest = Optional.empty();
 
        private String companyId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createExpenseRequest(io.codat.sync.expenses.models.components.CreateExpenseRequest createExpenseRequest) {
            Utils.checkNotNull(createExpenseRequest, "createExpenseRequest");
            this.createExpenseRequest = Optional.ofNullable(createExpenseRequest);
            return this;
        }

        public Builder createExpenseRequest(Optional<? extends io.codat.sync.expenses.models.components.CreateExpenseRequest> createExpenseRequest) {
            Utils.checkNotNull(createExpenseRequest, "createExpenseRequest");
            this.createExpenseRequest = createExpenseRequest;
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
        
        public CreateExpenseTransactionRequest build() {
            return new CreateExpenseTransactionRequest(
                createExpenseRequest,
                companyId);
        }
    }
}

