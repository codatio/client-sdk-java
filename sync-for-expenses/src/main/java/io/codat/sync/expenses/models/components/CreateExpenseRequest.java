/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class CreateExpenseRequest {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("items")
    private Optional<? extends java.util.List<ExpenseTransaction>> items;

    public CreateExpenseRequest(
            @JsonProperty("items") Optional<? extends java.util.List<ExpenseTransaction>> items) {
        Utils.checkNotNull(items, "items");
        this.items = items;
    }

    public Optional<? extends java.util.List<ExpenseTransaction>> items() {
        return items;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public CreateExpenseRequest withItems(java.util.List<ExpenseTransaction> items) {
        Utils.checkNotNull(items, "items");
        this.items = Optional.ofNullable(items);
        return this;
    }
    
    public CreateExpenseRequest withItems(Optional<? extends java.util.List<ExpenseTransaction>> items) {
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
        CreateExpenseRequest other = (CreateExpenseRequest) o;
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
        return Utils.toString(CreateExpenseRequest.class,
                "items", items);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<ExpenseTransaction>> items = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder items(java.util.List<ExpenseTransaction> items) {
            Utils.checkNotNull(items, "items");
            this.items = Optional.ofNullable(items);
            return this;
        }
        
        public Builder items(Optional<? extends java.util.List<ExpenseTransaction>> items) {
            Utils.checkNotNull(items, "items");
            this.items = items;
            return this;
        }
        
        public CreateExpenseRequest build() {
            return new CreateExpenseRequest(
                items);
        }
    }
}
