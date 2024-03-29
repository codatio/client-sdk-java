/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;


public class GetAccountingJournalRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for a journal.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=journalId")
    private String journalId;

    public GetAccountingJournalRequest(
            String companyId,
            String journalId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(journalId, "journalId");
        this.companyId = companyId;
        this.journalId = journalId;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a journal.
     */
    public String journalId() {
        return journalId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetAccountingJournalRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a journal.
     */
    public GetAccountingJournalRequest withJournalId(String journalId) {
        Utils.checkNotNull(journalId, "journalId");
        this.journalId = journalId;
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
        GetAccountingJournalRequest other = (GetAccountingJournalRequest) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.journalId, other.journalId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            journalId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingJournalRequest.class,
                "companyId", companyId,
                "journalId", journalId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String journalId;  
        
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
         * Unique identifier for a journal.
         */
        public Builder journalId(String journalId) {
            Utils.checkNotNull(journalId, "journalId");
            this.journalId = journalId;
            return this;
        }
        
        public GetAccountingJournalRequest build() {
            return new GetAccountingJournalRequest(
                companyId,
                journalId);
        }
    }
}

