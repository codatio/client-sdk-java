/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.accounting.models.components.JournalPrototype;
import io.codat.accounting.utils.SpeakeasyMetadata;
import io.codat.accounting.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateJournalRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for a connection.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connectionId")
    private String connectionId;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends JournalPrototype> journalPrototype;

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=timeoutInMinutes")
    private Optional<Integer> timeoutInMinutes;

    @JsonCreator
    public CreateJournalRequest(
            String companyId,
            String connectionId,
            Optional<? extends JournalPrototype> journalPrototype,
            Optional<Integer> timeoutInMinutes) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(journalPrototype, "journalPrototype");
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.journalPrototype = journalPrototype;
        this.timeoutInMinutes = timeoutInMinutes;
    }
    
    public CreateJournalRequest(
            String companyId,
            String connectionId) {
        this(companyId, connectionId, Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a connection.
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<JournalPrototype> journalPrototype() {
        return (Optional<JournalPrototype>) journalPrototype;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    @JsonIgnore
    public Optional<Integer> timeoutInMinutes() {
        return timeoutInMinutes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public CreateJournalRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public CreateJournalRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    public CreateJournalRequest withJournalPrototype(JournalPrototype journalPrototype) {
        Utils.checkNotNull(journalPrototype, "journalPrototype");
        this.journalPrototype = Optional.ofNullable(journalPrototype);
        return this;
    }

    public CreateJournalRequest withJournalPrototype(Optional<? extends JournalPrototype> journalPrototype) {
        Utils.checkNotNull(journalPrototype, "journalPrototype");
        this.journalPrototype = journalPrototype;
        return this;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public CreateJournalRequest withTimeoutInMinutes(int timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = Optional.ofNullable(timeoutInMinutes);
        return this;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public CreateJournalRequest withTimeoutInMinutes(Optional<Integer> timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = timeoutInMinutes;
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
        CreateJournalRequest other = (CreateJournalRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.journalPrototype, other.journalPrototype) &&
            Objects.deepEquals(this.timeoutInMinutes, other.timeoutInMinutes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            connectionId,
            journalPrototype,
            timeoutInMinutes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateJournalRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "journalPrototype", journalPrototype,
                "timeoutInMinutes", timeoutInMinutes);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;
 
        private Optional<? extends JournalPrototype> journalPrototype = Optional.empty();
 
        private Optional<Integer> timeoutInMinutes = Optional.empty();  
        
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
         * Unique identifier for a connection.
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        public Builder journalPrototype(JournalPrototype journalPrototype) {
            Utils.checkNotNull(journalPrototype, "journalPrototype");
            this.journalPrototype = Optional.ofNullable(journalPrototype);
            return this;
        }

        public Builder journalPrototype(Optional<? extends JournalPrototype> journalPrototype) {
            Utils.checkNotNull(journalPrototype, "journalPrototype");
            this.journalPrototype = journalPrototype;
            return this;
        }

        /**
         * Time limit for the push operation to complete before it is timed out.
         */
        public Builder timeoutInMinutes(int timeoutInMinutes) {
            Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
            this.timeoutInMinutes = Optional.ofNullable(timeoutInMinutes);
            return this;
        }

        /**
         * Time limit for the push operation to complete before it is timed out.
         */
        public Builder timeoutInMinutes(Optional<Integer> timeoutInMinutes) {
            Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        
        public CreateJournalRequest build() {
            return new CreateJournalRequest(
                companyId,
                connectionId,
                journalPrototype,
                timeoutInMinutes);
        }
    }
}

