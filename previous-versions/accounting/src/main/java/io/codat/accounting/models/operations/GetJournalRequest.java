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


public class GetJournalRequest {

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

    @JsonCreator
    public GetJournalRequest(
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
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a journal.
     */
    @JsonIgnore
    public String journalId() {
        return journalId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetJournalRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a journal.
     */
    public GetJournalRequest withJournalId(String journalId) {
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
        GetJournalRequest other = (GetJournalRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.journalId, other.journalId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            journalId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetJournalRequest.class,
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
        
        public GetJournalRequest build() {
            return new GetJournalRequest(
                companyId,
                journalId);
        }
    }
}

