/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class CreateReimbursableExpenseRequest {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("items")
    private Optional<? extends java.util.List<java.util.List<ReimbursableExpenseTransaction>>> items;

    public CreateReimbursableExpenseRequest(
            @JsonProperty("items") Optional<? extends java.util.List<java.util.List<ReimbursableExpenseTransaction>>> items) {
        Utils.checkNotNull(items, "items");
        this.items = items;
    }

    public Optional<? extends java.util.List<java.util.List<ReimbursableExpenseTransaction>>> items() {
        return items;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateReimbursableExpenseRequest withItems(java.util.List<java.util.List<ReimbursableExpenseTransaction>> items) {
        Utils.checkNotNull(items, "items");
        this.items = Optional.ofNullable(items);
        return this;
    }

    public CreateReimbursableExpenseRequest withItems(Optional<? extends java.util.List<java.util.List<ReimbursableExpenseTransaction>>> items) {
        Utils.checkNotNull(items, "items");
        this.items = items;
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
        CreateReimbursableExpenseRequest other = (CreateReimbursableExpenseRequest) o;
        return 
            java.util.Objects.deepEquals(this.items, other.items);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            items);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateReimbursableExpenseRequest.class,
                "items", items);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<java.util.List<ReimbursableExpenseTransaction>>> items = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder items(java.util.List<java.util.List<ReimbursableExpenseTransaction>> items) {
            Utils.checkNotNull(items, "items");
            this.items = Optional.ofNullable(items);
            return this;
        }

        public Builder items(Optional<? extends java.util.List<java.util.List<ReimbursableExpenseTransaction>>> items) {
            Utils.checkNotNull(items, "items");
            this.items = items;
            return this;
        }
        
        public CreateReimbursableExpenseRequest build() {
            return new CreateReimbursableExpenseRequest(
                items);
        }
    }
}

