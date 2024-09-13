/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.payroll.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AccountValidDataTypeLinks - When querying Codat's data model, some data types return `validDatatypeLinks` metadata in the JSON response. This indicates where that object can be used as a reference—a _valid link_—when creating or updating other data.
 * 
 * For example, `validDatatypeLinks` might indicate the following references:
 * 
 * - Which tax rates are valid to use on the line item of a bill.
 * - Which items can be used when creating an invoice. 
 * 
 * You can use `validDatatypeLinks` to present your SMB customers with only valid choices when selecting objects from a list, for example.
 * 
 * ## `validDatatypeLinks` example
 * 
 * The following example uses the `Accounting.Accounts` data type. It shows that, on the linked integration, this account is valid as the account on a payment or bill payment; and as the account referenced on the line item of a direct income or direct cost. Because there is no valid link to Invoices or Bills, using this account on those data types will result in an error.
 * 
 * ```json validDatatypeLinks for an account
 * {
 *             "id": "bd9e85e0-0478-433d-ae9f-0b3c4f04bfe4",
 *             "nominalCode": "090",
 *             "name": "Business Bank Account",
 *             #...
 *             "validDatatypeLinks": [
 *                 {
 *                     "property": "Id",
 *                     "links": [
 *                         "Payment.AccountRef.Id",
 *                         "BillPayment.AccountRef.Id",
 *                         "DirectIncome.LineItems.AccountRef.Id",
 *                         "DirectCost.LineItems.AccountRef.Id"
 *                     ]
 *                 }
 *             ]
 *         }
 * ```
 * 
 * 
 * 
 * ## Support for `validDatatypeLinks`
 * 
 * Codat currently supports `validDatatypeLinks` for some data types on our Xero, QuickBooks Online, QuickBooks Desktop, Exact (NL), and Sage Business Cloud integrations. 
 * 
 * If you'd like us to extend support to more data types or integrations, suggest or vote for this on our &lt;a href="https://portal.productboard.com/codat/5-product-roadmap"&gt;Product Roadmap&lt;/a&gt;.
 */

public class AccountValidDataTypeLinks {

    /**
     * Supported `dataTypes` that the record can be linked to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("links")
    private JsonNullable<? extends List<String>> links;

    /**
     * The property from the account that can be linked.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("property")
    private JsonNullable<String> property;

    @JsonCreator
    public AccountValidDataTypeLinks(
            @JsonProperty("links") JsonNullable<? extends List<String>> links,
            @JsonProperty("property") JsonNullable<String> property) {
        Utils.checkNotNull(links, "links");
        Utils.checkNotNull(property, "property");
        this.links = links;
        this.property = property;
    }
    
    public AccountValidDataTypeLinks() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Supported `dataTypes` that the record can be linked to.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> links() {
        return (JsonNullable<List<String>>) links;
    }

    /**
     * The property from the account that can be linked.
     */
    @JsonIgnore
    public JsonNullable<String> property() {
        return property;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Supported `dataTypes` that the record can be linked to.
     */
    public AccountValidDataTypeLinks withLinks(List<String> links) {
        Utils.checkNotNull(links, "links");
        this.links = JsonNullable.of(links);
        return this;
    }

    /**
     * Supported `dataTypes` that the record can be linked to.
     */
    public AccountValidDataTypeLinks withLinks(JsonNullable<? extends List<String>> links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
        return this;
    }

    /**
     * The property from the account that can be linked.
     */
    public AccountValidDataTypeLinks withProperty(String property) {
        Utils.checkNotNull(property, "property");
        this.property = JsonNullable.of(property);
        return this;
    }

    /**
     * The property from the account that can be linked.
     */
    public AccountValidDataTypeLinks withProperty(JsonNullable<String> property) {
        Utils.checkNotNull(property, "property");
        this.property = property;
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
        AccountValidDataTypeLinks other = (AccountValidDataTypeLinks) o;
        return 
            Objects.deepEquals(this.links, other.links) &&
            Objects.deepEquals(this.property, other.property);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            links,
            property);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountValidDataTypeLinks.class,
                "links", links,
                "property", property);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends List<String>> links = JsonNullable.undefined();
 
        private JsonNullable<String> property = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Supported `dataTypes` that the record can be linked to.
         */
        public Builder links(List<String> links) {
            Utils.checkNotNull(links, "links");
            this.links = JsonNullable.of(links);
            return this;
        }

        /**
         * Supported `dataTypes` that the record can be linked to.
         */
        public Builder links(JsonNullable<? extends List<String>> links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }

        /**
         * The property from the account that can be linked.
         */
        public Builder property(String property) {
            Utils.checkNotNull(property, "property");
            this.property = JsonNullable.of(property);
            return this;
        }

        /**
         * The property from the account that can be linked.
         */
        public Builder property(JsonNullable<String> property) {
            Utils.checkNotNull(property, "property");
            this.property = property;
            return this;
        }
        
        public AccountValidDataTypeLinks build() {
            return new AccountValidDataTypeLinks(
                links,
                property);
        }
    }
}

