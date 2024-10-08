/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class ReportLine {

    /**
     * Identifier for the account, unique for the company in the accounting software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountId")
    private JsonNullable<String> accountId;

    /**
     * An array of ReportLine items.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("items")
    private JsonNullable<? extends List<ReportLine>> items;

    /**
     * Name of the report line item.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * Numerical value of the line item.
     */
    @JsonProperty("value")
    private BigDecimal value;

    @JsonCreator
    public ReportLine(
            @JsonProperty("accountId") JsonNullable<String> accountId,
            @JsonProperty("items") JsonNullable<? extends List<ReportLine>> items,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("value") BigDecimal value) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(items, "items");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(value, "value");
        this.accountId = accountId;
        this.items = items;
        this.name = name;
        this.value = value;
    }
    
    public ReportLine(
            BigDecimal value) {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), value);
    }

    /**
     * Identifier for the account, unique for the company in the accounting software.
     */
    @JsonIgnore
    public JsonNullable<String> accountId() {
        return accountId;
    }

    /**
     * An array of ReportLine items.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<ReportLine>> items() {
        return (JsonNullable<List<ReportLine>>) items;
    }

    /**
     * Name of the report line item.
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * Numerical value of the line item.
     */
    @JsonIgnore
    public BigDecimal value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Identifier for the account, unique for the company in the accounting software.
     */
    public ReportLine withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = JsonNullable.of(accountId);
        return this;
    }

    /**
     * Identifier for the account, unique for the company in the accounting software.
     */
    public ReportLine withAccountId(JsonNullable<String> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    /**
     * An array of ReportLine items.
     */
    public ReportLine withItems(List<ReportLine> items) {
        Utils.checkNotNull(items, "items");
        this.items = JsonNullable.of(items);
        return this;
    }

    /**
     * An array of ReportLine items.
     */
    public ReportLine withItems(JsonNullable<? extends List<ReportLine>> items) {
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
    public ReportLine withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

        /**
         * Numerical value of the line item.
         */
    public ReportLine withValue(double value) {
        this.value = BigDecimal.valueOf(value);
        return this;
    }

    /**
     * Numerical value of the line item.
     */
    public ReportLine withValue(BigDecimal value) {
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
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.items, other.items) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private JsonNullable<String> accountId = JsonNullable.undefined();
 
        private JsonNullable<? extends List<ReportLine>> items = JsonNullable.undefined();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private BigDecimal value;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Identifier for the account, unique for the company in the accounting software.
         */
        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = JsonNullable.of(accountId);
            return this;
        }

        /**
         * Identifier for the account, unique for the company in the accounting software.
         */
        public Builder accountId(JsonNullable<String> accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        /**
         * An array of ReportLine items.
         */
        public Builder items(List<ReportLine> items) {
            Utils.checkNotNull(items, "items");
            this.items = JsonNullable.of(items);
            return this;
        }

        /**
         * An array of ReportLine items.
         */
        public Builder items(JsonNullable<? extends List<ReportLine>> items) {
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
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Numerical value of the line item.
         */
        public Builder value(double value) {
            this.value = BigDecimal.valueOf(value);
            return this;
        }

        /**
         * Numerical value of the line item.
         */
        public Builder value(BigDecimal value) {
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

