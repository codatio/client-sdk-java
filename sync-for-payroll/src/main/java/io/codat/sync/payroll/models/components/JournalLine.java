/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.payroll.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class JournalLine {

    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountRef")
    private Optional<? extends AccountRef> accountRef;

    /**
     * Currency for the journal line item.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private JsonNullable<? extends String> currency;

    /**
     * Description of the journal line item.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<? extends String> description;

    /**
     * Amount for the journal line. Debit entries are considered positive, and credit entries are considered negative.
     */
    @JsonProperty("netAmount")
    private double netAmount;

    /**
     * List of record refs associated with the tracking information for the line (eg to a Tracking Category, or customer etc.)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tracking")
    private Optional<? extends Tracking> tracking;

    public JournalLine(
            @JsonProperty("accountRef") Optional<? extends AccountRef> accountRef,
            @JsonProperty("currency") JsonNullable<? extends String> currency,
            @JsonProperty("description") JsonNullable<? extends String> description,
            @JsonProperty("netAmount") double netAmount,
            @JsonProperty("tracking") Optional<? extends Tracking> tracking) {
        Utils.checkNotNull(accountRef, "accountRef");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(netAmount, "netAmount");
        Utils.checkNotNull(tracking, "tracking");
        this.accountRef = accountRef;
        this.currency = currency;
        this.description = description;
        this.netAmount = netAmount;
        this.tracking = tracking;
    }

    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    public Optional<? extends AccountRef> accountRef() {
        return accountRef;
    }

    /**
     * Currency for the journal line item.
     */
    public JsonNullable<? extends String> currency() {
        return currency;
    }

    /**
     * Description of the journal line item.
     */
    public JsonNullable<? extends String> description() {
        return description;
    }

    /**
     * Amount for the journal line. Debit entries are considered positive, and credit entries are considered negative.
     */
    public double netAmount() {
        return netAmount;
    }

    /**
     * List of record refs associated with the tracking information for the line (eg to a Tracking Category, or customer etc.)
     */
    public Optional<? extends Tracking> tracking() {
        return tracking;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    public JournalLine withAccountRef(AccountRef accountRef) {
        Utils.checkNotNull(accountRef, "accountRef");
        this.accountRef = Optional.ofNullable(accountRef);
        return this;
    }
    
    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    public JournalLine withAccountRef(Optional<? extends AccountRef> accountRef) {
        Utils.checkNotNull(accountRef, "accountRef");
        this.accountRef = accountRef;
        return this;
    }

    /**
     * Currency for the journal line item.
     */
    public JournalLine withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = JsonNullable.of(currency);
        return this;
    }

    /**
     * Currency for the journal line item.
     */
    public JournalLine withCurrency(JsonNullable<? extends String> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * Description of the journal line item.
     */
    public JournalLine withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Description of the journal line item.
     */
    public JournalLine withDescription(JsonNullable<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Amount for the journal line. Debit entries are considered positive, and credit entries are considered negative.
     */
    public JournalLine withNetAmount(double netAmount) {
        Utils.checkNotNull(netAmount, "netAmount");
        this.netAmount = netAmount;
        return this;
    }

    /**
     * List of record refs associated with the tracking information for the line (eg to a Tracking Category, or customer etc.)
     */
    public JournalLine withTracking(Tracking tracking) {
        Utils.checkNotNull(tracking, "tracking");
        this.tracking = Optional.ofNullable(tracking);
        return this;
    }
    
    /**
     * List of record refs associated with the tracking information for the line (eg to a Tracking Category, or customer etc.)
     */
    public JournalLine withTracking(Optional<? extends Tracking> tracking) {
        Utils.checkNotNull(tracking, "tracking");
        this.tracking = tracking;
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
        JournalLine other = (JournalLine) o;
        return 
            java.util.Objects.deepEquals(this.accountRef, other.accountRef) &&
            java.util.Objects.deepEquals(this.currency, other.currency) &&
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.netAmount, other.netAmount) &&
            java.util.Objects.deepEquals(this.tracking, other.tracking);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountRef,
            currency,
            description,
            netAmount,
            tracking);
    }
    
    @Override
    public String toString() {
        return Utils.toString(JournalLine.class,
                "accountRef", accountRef,
                "currency", currency,
                "description", description,
                "netAmount", netAmount,
                "tracking", tracking);
    }
    
    public final static class Builder {
 
        private Optional<? extends AccountRef> accountRef = Optional.empty();
 
        private JsonNullable<? extends String> currency = JsonNullable.undefined();
 
        private JsonNullable<? extends String> description = JsonNullable.undefined();
 
        private Double netAmount;
 
        private Optional<? extends Tracking> tracking = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
         */
        public Builder accountRef(AccountRef accountRef) {
            Utils.checkNotNull(accountRef, "accountRef");
            this.accountRef = Optional.ofNullable(accountRef);
            return this;
        }
        
        /**
         * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
         */
        public Builder accountRef(Optional<? extends AccountRef> accountRef) {
            Utils.checkNotNull(accountRef, "accountRef");
            this.accountRef = accountRef;
            return this;
        }

        /**
         * Currency for the journal line item.
         */
        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = JsonNullable.of(currency);
            return this;
        }

        /**
         * Currency for the journal line item.
         */
        public Builder currency(JsonNullable<? extends String> currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }

        /**
         * Description of the journal line item.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * Description of the journal line item.
         */
        public Builder description(JsonNullable<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Amount for the journal line. Debit entries are considered positive, and credit entries are considered negative.
         */
        public Builder netAmount(double netAmount) {
            Utils.checkNotNull(netAmount, "netAmount");
            this.netAmount = netAmount;
            return this;
        }

        /**
         * List of record refs associated with the tracking information for the line (eg to a Tracking Category, or customer etc.)
         */
        public Builder tracking(Tracking tracking) {
            Utils.checkNotNull(tracking, "tracking");
            this.tracking = Optional.ofNullable(tracking);
            return this;
        }
        
        /**
         * List of record refs associated with the tracking information for the line (eg to a Tracking Category, or customer etc.)
         */
        public Builder tracking(Optional<? extends Tracking> tracking) {
            Utils.checkNotNull(tracking, "tracking");
            this.tracking = tracking;
            return this;
        }
        
        public JournalLine build() {
            return new JournalLine(
                accountRef,
                currency,
                description,
                netAmount,
                tracking);
        }
    }
}

