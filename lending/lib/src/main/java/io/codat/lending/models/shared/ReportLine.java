/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import org.openapitools.jackson.nullable.JsonNullable;


public class ReportLine {

    /**
     * Identifier for the account, unique for the company in the accounting platform.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountId")
    private JsonNullable<? extends String> accountId;

    /**
     * An array of ReportLine items.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("items")
    private JsonNullable<? extends java.util.List<ReportLine>> items;

    /**
     * Name of the report line item.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<? extends String> name;

    /**
     * Numerical value of the line item.
     */
    @JsonProperty("value")
    private double value;

    public ReportLine(
            @JsonProperty("accountId") JsonNullable<? extends String> accountId,
            @JsonProperty("items") JsonNullable<? extends java.util.List<ReportLine>> items,
            @JsonProperty("name") JsonNullable<? extends String> name,
            @JsonProperty("value") double value) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(items, "items");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(value, "value");
        this.accountId = accountId;
        this.items = items;
        this.name = name;
        this.value = value;
    }

    /**
     * Identifier for the account, unique for the company in the accounting platform.
     */
    public JsonNullable<? extends String> accountId() {
        return accountId;
    }

    /**
     * An array of ReportLine items.
     */
    public JsonNullable<? extends java.util.List<ReportLine>> items() {
        return items;
    }

    /**
     * Name of the report line item.
     */
    public JsonNullable<? extends String> name() {
        return name;
    }

    /**
     * Numerical value of the line item.
     */
    public double value() {
        return value;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Identifier for the account, unique for the company in the accounting platform.
     */
    public ReportLine withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = JsonNullable.of(accountId);
        return this;
    }

    /**
     * Identifier for the account, unique for the company in the accounting platform.
     */
    public ReportLine withAccountId(JsonNullable<? extends String> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    /**
     * An array of ReportLine items.
     */
    public ReportLine withItems(java.util.List<ReportLine> items) {
        Utils.checkNotNull(items, "items");
        this.items = JsonNullable.of(items);
        return this;
    }

    /**
     * An array of ReportLine items.
     */
    public ReportLine withItems(JsonNullable<? extends java.util.List<ReportLine>> items) {
        Utils.checkNotNull(items, "items");
        this.items = items;
        return this;
    }

    /**
     * Name of the report line item.
     */
    public ReportLine withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Name of the report line item.
     */
    public ReportLine withName(JsonNullable<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Numerical value of the line item.
     */
    public ReportLine withValue(double value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        ReportLine other = (ReportLine) o;
        return 
            java.util.Objects.deepEquals(this.accountId, other.accountId) &&
            java.util.Objects.deepEquals(this.items, other.items) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountId,
            items,
            name,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReportLine.class,
                "accountId", accountId,
                "items", items,
                "name", name,
                "value", value);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends String> accountId = JsonNullable.undefined();
 
        private JsonNullable<? extends java.util.List<ReportLine>> items = JsonNullable.undefined();
 
        private JsonNullable<? extends String> name = JsonNullable.undefined();
 
        private Double value;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Identifier for the account, unique for the company in the accounting platform.
         */
        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = JsonNullable.of(accountId);
            return this;
        }

        /**
         * Identifier for the account, unique for the company in the accounting platform.
         */
        public Builder accountId(JsonNullable<? extends String> accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        /**
         * An array of ReportLine items.
         */
        public Builder items(java.util.List<ReportLine> items) {
            Utils.checkNotNull(items, "items");
            this.items = JsonNullable.of(items);
            return this;
        }

        /**
         * An array of ReportLine items.
         */
        public Builder items(JsonNullable<? extends java.util.List<ReportLine>> items) {
            Utils.checkNotNull(items, "items");
            this.items = items;
            return this;
        }

        /**
         * Name of the report line item.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * Name of the report line item.
         */
        public Builder name(JsonNullable<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Numerical value of the line item.
         */
        public Builder value(double value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }        
        
        public ReportLine build() {
            return new ReportLine(
                accountId,
                items,
                name,
                value);
        }
    }
}

