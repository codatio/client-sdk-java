/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync_for_expenses.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync_for_expenses.utils.Utils;
import java.io.InputStream;
import java.util.Optional;


public class Attachment {

    /**
     * Unique ID of company in Codat
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("companyId")
    private Optional<? extends String> companyId;

    /**
     * Unique identifier of attachment
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    /**
     * Unique identifier of transaction
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transactionId")
    private Optional<? extends String> transactionId;

    public Attachment(
            @JsonProperty("companyId") Optional<? extends String> companyId,
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("transactionId") Optional<? extends String> transactionId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(transactionId, "transactionId");
        this.companyId = companyId;
        this.id = id;
        this.transactionId = transactionId;
    }

    /**
     * Unique ID of company in Codat
     */
    public Optional<? extends String> companyId() {
        return companyId;
    }

    /**
     * Unique identifier of attachment
     */
    public Optional<? extends String> id() {
        return id;
    }

    /**
     * Unique identifier of transaction
     */
    public Optional<? extends String> transactionId() {
        return transactionId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique ID of company in Codat
     */
    public Attachment withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = Optional.ofNullable(companyId);
        return this;
    }
    
    /**
     * Unique ID of company in Codat
     */
    public Attachment withCompanyId(Optional<? extends String> companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier of attachment
     */
    public Attachment withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }
    
    /**
     * Unique identifier of attachment
     */
    public Attachment withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of transaction
     */
    public Attachment withTransactionId(String transactionId) {
        Utils.checkNotNull(transactionId, "transactionId");
        this.transactionId = Optional.ofNullable(transactionId);
        return this;
    }
    
    /**
     * Unique identifier of transaction
     */
    public Attachment withTransactionId(Optional<? extends String> transactionId) {
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
        Attachment other = (Attachment) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.transactionId, other.transactionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            id,
            transactionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Attachment.class,
                "companyId", companyId,
                "id", id,
                "transactionId", transactionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> companyId = Optional.empty();
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends String> transactionId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique ID of company in Codat
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = Optional.ofNullable(companyId);
            return this;
        }
        
        /**
         * Unique ID of company in Codat
         */
        public Builder companyId(Optional<? extends String> companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        /**
         * Unique identifier of attachment
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }
        
        /**
         * Unique identifier of attachment
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Unique identifier of transaction
         */
        public Builder transactionId(String transactionId) {
            Utils.checkNotNull(transactionId, "transactionId");
            this.transactionId = Optional.ofNullable(transactionId);
            return this;
        }
        
        /**
         * Unique identifier of transaction
         */
        public Builder transactionId(Optional<? extends String> transactionId) {
            Utils.checkNotNull(transactionId, "transactionId");
            this.transactionId = transactionId;
            return this;
        }        
        
        public Attachment build() {
            return new Attachment(
                companyId,
                id,
                transactionId);
        }
    }
}

