/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.accounting.utils.SpeakeasyMetadata;
import io.codat.accounting.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetCreditNoteRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for a credit note.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=creditNoteId")
    private String creditNoteId;

    @JsonCreator
    public GetCreditNoteRequest(
            String companyId,
            String creditNoteId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(creditNoteId, "creditNoteId");
        this.companyId = companyId;
        this.creditNoteId = creditNoteId;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a credit note.
     */
    @JsonIgnore
    public String creditNoteId() {
        return creditNoteId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetCreditNoteRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a credit note.
     */
    public GetCreditNoteRequest withCreditNoteId(String creditNoteId) {
        Utils.checkNotNull(creditNoteId, "creditNoteId");
        this.creditNoteId = creditNoteId;
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
        GetCreditNoteRequest other = (GetCreditNoteRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.creditNoteId, other.creditNoteId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            creditNoteId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCreditNoteRequest.class,
                "companyId", companyId,
                "creditNoteId", creditNoteId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String creditNoteId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for a company.
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        /**
         * Unique identifier for a credit note.
         */
        public Builder creditNoteId(String creditNoteId) {
            Utils.checkNotNull(creditNoteId, "creditNoteId");
            this.creditNoteId = creditNoteId;
            return this;
        }
        
        public GetCreditNoteRequest build() {
            return new GetCreditNoteRequest(
                companyId,
                creditNoteId);
        }
    }
}

