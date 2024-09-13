/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.accounting.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class BillPaymentLine {

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allocatedOnDate")
    private Optional<String> allocatedOnDate;

    /**
     * Amount in the bill payment currency.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("links")
    private JsonNullable<? extends List<BillPaymentLineLink>> links;

    @JsonCreator
    public BillPaymentLine(
            @JsonProperty("allocatedOnDate") Optional<String> allocatedOnDate,
            @JsonProperty("amount") BigDecimal amount,
            @JsonProperty("links") JsonNullable<? extends List<BillPaymentLineLink>> links) {
        Utils.checkNotNull(allocatedOnDate, "allocatedOnDate");
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(links, "links");
        this.allocatedOnDate = allocatedOnDate;
        this.amount = amount;
        this.links = links;
    }
    
    public BillPaymentLine(
            BigDecimal amount) {
        this(Optional.empty(), amount, JsonNullable.undefined());
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    @JsonIgnore
    public Optional<String> allocatedOnDate() {
        return allocatedOnDate;
    }

    /**
     * Amount in the bill payment currency.
     */
    @JsonIgnore
    public BigDecimal amount() {
        return amount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<BillPaymentLineLink>> links() {
        return (JsonNullable<List<BillPaymentLineLink>>) links;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public BillPaymentLine withAllocatedOnDate(String allocatedOnDate) {
        Utils.checkNotNull(allocatedOnDate, "allocatedOnDate");
        this.allocatedOnDate = Optional.ofNullable(allocatedOnDate);
        return this;
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public BillPaymentLine withAllocatedOnDate(Optional<String> allocatedOnDate) {
        Utils.checkNotNull(allocatedOnDate, "allocatedOnDate");
        this.allocatedOnDate = allocatedOnDate;
        return this;
    }

        /**
         * Amount in the bill payment currency.
         */
    public BillPaymentLine withAmount(double amount) {
        this.amount = BigDecimal.valueOf(amount);
        return this;
    }

    /**
     * Amount in the bill payment currency.
     */
    public BillPaymentLine withAmount(BigDecimal amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public BillPaymentLine withLinks(List<BillPaymentLineLink> links) {
        Utils.checkNotNull(links, "links");
        this.links = JsonNullable.of(links);
        return this;
    }

    public BillPaymentLine withLinks(JsonNullable<? extends List<BillPaymentLineLink>> links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
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
        BillPaymentLine other = (BillPaymentLine) o;
        return 
            Objects.deepEquals(this.allocatedOnDate, other.allocatedOnDate) &&
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.links, other.links);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            allocatedOnDate,
            amount,
            links);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BillPaymentLine.class,
                "allocatedOnDate", allocatedOnDate,
                "amount", amount,
                "links", links);
    }
    
    public final static class Builder {
 
        private Optional<String> allocatedOnDate = Optional.empty();
 
        private BigDecimal amount;
 
        private JsonNullable<? extends List<BillPaymentLineLink>> links = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
         * 
         * ```
         * 2020-10-08T22:40:50Z
         * 2021-01-01T00:00:00
         * ```
         * 
         * 
         * 
         * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
         * 
         * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
         * - Unqualified local time: `2021-11-15T01:00:00`
         * - UTC time offsets: `2021-11-15T01:00:00-05:00`
         * 
         * &gt; Time zones
         * &gt; 
         * &gt; Not all dates from Codat will contain information about time zones.  
         * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
         */
        public Builder allocatedOnDate(String allocatedOnDate) {
            Utils.checkNotNull(allocatedOnDate, "allocatedOnDate");
            this.allocatedOnDate = Optional.ofNullable(allocatedOnDate);
            return this;
        }

        /**
         * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
         * 
         * ```
         * 2020-10-08T22:40:50Z
         * 2021-01-01T00:00:00
         * ```
         * 
         * 
         * 
         * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
         * 
         * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
         * - Unqualified local time: `2021-11-15T01:00:00`
         * - UTC time offsets: `2021-11-15T01:00:00-05:00`
         * 
         * &gt; Time zones
         * &gt; 
         * &gt; Not all dates from Codat will contain information about time zones.  
         * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
         */
        public Builder allocatedOnDate(Optional<String> allocatedOnDate) {
            Utils.checkNotNull(allocatedOnDate, "allocatedOnDate");
            this.allocatedOnDate = allocatedOnDate;
            return this;
        }

        /**
         * Amount in the bill payment currency.
         */
        public Builder amount(double amount) {
            this.amount = BigDecimal.valueOf(amount);
            return this;
        }

        /**
         * Amount in the bill payment currency.
         */
        public Builder amount(BigDecimal amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        public Builder links(List<BillPaymentLineLink> links) {
            Utils.checkNotNull(links, "links");
            this.links = JsonNullable.of(links);
            return this;
        }

        public Builder links(JsonNullable<? extends List<BillPaymentLineLink>> links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }
        
        public BillPaymentLine build() {
            return new BillPaymentLine(
                allocatedOnDate,
                amount,
                links);
        }
    }
}

