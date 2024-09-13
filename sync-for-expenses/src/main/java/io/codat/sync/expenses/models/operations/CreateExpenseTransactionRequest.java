/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.sync.expenses.models.components.ExpenseTransaction;
import io.codat.sync.expenses.utils.SpeakeasyMetadata;
import io.codat.sync.expenses.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class CreateExpenseTransactionRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends List<ExpenseTransaction>> requestBody;

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    @JsonCreator
    public CreateExpenseTransactionRequest(
            Optional<? extends List<ExpenseTransaction>> requestBody,
            String companyId) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(companyId, "companyId");
        this.requestBody = requestBody;
        this.companyId = companyId;
    }
    
    public CreateExpenseTransactionRequest(
            String companyId) {
        this(Optional.empty(), companyId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ExpenseTransaction>> requestBody() {
        return (Optional<List<ExpenseTransaction>>) requestBody;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateExpenseTransactionRequest withRequestBody(List<ExpenseTransaction> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public CreateExpenseTransactionRequest withRequestBody(Optional<? extends List<ExpenseTransaction>> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
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
            Objects.deepEquals(this.requestBody, other.requestBody) &&
            Objects.deepEquals(this.companyId, other.companyId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            requestBody,
            companyId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateExpenseTransactionRequest.class,
                "requestBody", requestBody,
                "companyId", companyId);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<ExpenseTransaction>> requestBody = Optional.empty();
 
        private String companyId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(List<ExpenseTransaction> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        public Builder requestBody(Optional<? extends List<ExpenseTransaction>> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
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
                requestBody,
                companyId);
        }
    }
}

