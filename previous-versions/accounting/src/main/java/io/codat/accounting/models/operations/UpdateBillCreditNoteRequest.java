/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.accounting.utils.LazySingletonValue;
import io.codat.accounting.utils.SpeakeasyMetadata;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class UpdateBillCreditNoteRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private JsonNullable<? extends io.codat.accounting.models.components.BillCreditNote> billCreditNote;

    /**
     * Unique identifier for a bill credit note.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=billCreditNoteId")
    private String billCreditNoteId;

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

    /**
     * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting platform, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=forceUpdate")
    private Optional<? extends Boolean> forceUpdate;

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=timeoutInMinutes")
    private Optional<? extends Integer> timeoutInMinutes;

    public UpdateBillCreditNoteRequest(
            JsonNullable<? extends io.codat.accounting.models.components.BillCreditNote> billCreditNote,
            String billCreditNoteId,
            String companyId,
            String connectionId,
            Optional<? extends Boolean> forceUpdate,
            Optional<? extends Integer> timeoutInMinutes) {
        Utils.checkNotNull(billCreditNote, "billCreditNote");
        Utils.checkNotNull(billCreditNoteId, "billCreditNoteId");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(forceUpdate, "forceUpdate");
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.billCreditNote = billCreditNote;
        this.billCreditNoteId = billCreditNoteId;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.forceUpdate = forceUpdate;
        this.timeoutInMinutes = timeoutInMinutes;
    }

    public JsonNullable<? extends io.codat.accounting.models.components.BillCreditNote> billCreditNote() {
        return billCreditNote;
    }

    /**
     * Unique identifier for a bill credit note.
     */
    public String billCreditNoteId() {
        return billCreditNoteId;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a connection.
     */
    public String connectionId() {
        return connectionId;
    }

    /**
     * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting platform, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
     */
    public Optional<? extends Boolean> forceUpdate() {
        return forceUpdate;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public Optional<? extends Integer> timeoutInMinutes() {
        return timeoutInMinutes;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public UpdateBillCreditNoteRequest withBillCreditNote(io.codat.accounting.models.components.BillCreditNote billCreditNote) {
        Utils.checkNotNull(billCreditNote, "billCreditNote");
        this.billCreditNote = JsonNullable.of(billCreditNote);
        return this;
    }

    public UpdateBillCreditNoteRequest withBillCreditNote(JsonNullable<? extends io.codat.accounting.models.components.BillCreditNote> billCreditNote) {
        Utils.checkNotNull(billCreditNote, "billCreditNote");
        this.billCreditNote = billCreditNote;
        return this;
    }

    /**
     * Unique identifier for a bill credit note.
     */
    public UpdateBillCreditNoteRequest withBillCreditNoteId(String billCreditNoteId) {
        Utils.checkNotNull(billCreditNoteId, "billCreditNoteId");
        this.billCreditNoteId = billCreditNoteId;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public UpdateBillCreditNoteRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public UpdateBillCreditNoteRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting platform, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
     */
    public UpdateBillCreditNoteRequest withForceUpdate(boolean forceUpdate) {
        Utils.checkNotNull(forceUpdate, "forceUpdate");
        this.forceUpdate = Optional.ofNullable(forceUpdate);
        return this;
    }
    
    /**
     * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting platform, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
     */
    public UpdateBillCreditNoteRequest withForceUpdate(Optional<? extends Boolean> forceUpdate) {
        Utils.checkNotNull(forceUpdate, "forceUpdate");
        this.forceUpdate = forceUpdate;
        return this;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public UpdateBillCreditNoteRequest withTimeoutInMinutes(int timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = Optional.ofNullable(timeoutInMinutes);
        return this;
    }
    
    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public UpdateBillCreditNoteRequest withTimeoutInMinutes(Optional<? extends Integer> timeoutInMinutes) {
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
        UpdateBillCreditNoteRequest other = (UpdateBillCreditNoteRequest) o;
        return 
            java.util.Objects.deepEquals(this.billCreditNote, other.billCreditNote) &&
            java.util.Objects.deepEquals(this.billCreditNoteId, other.billCreditNoteId) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.forceUpdate, other.forceUpdate) &&
            java.util.Objects.deepEquals(this.timeoutInMinutes, other.timeoutInMinutes);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            billCreditNote,
            billCreditNoteId,
            companyId,
            connectionId,
            forceUpdate,
            timeoutInMinutes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateBillCreditNoteRequest.class,
                "billCreditNote", billCreditNote,
                "billCreditNoteId", billCreditNoteId,
                "companyId", companyId,
                "connectionId", connectionId,
                "forceUpdate", forceUpdate,
                "timeoutInMinutes", timeoutInMinutes);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends io.codat.accounting.models.components.BillCreditNote> billCreditNote = JsonNullable.undefined();
 
        private String billCreditNoteId;
 
        private String companyId;
 
        private String connectionId;
 
        private Optional<? extends Boolean> forceUpdate;
 
        private Optional<? extends Integer> timeoutInMinutes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder billCreditNote(io.codat.accounting.models.components.BillCreditNote billCreditNote) {
            Utils.checkNotNull(billCreditNote, "billCreditNote");
            this.billCreditNote = JsonNullable.of(billCreditNote);
            return this;
        }

        public Builder billCreditNote(JsonNullable<? extends io.codat.accounting.models.components.BillCreditNote> billCreditNote) {
            Utils.checkNotNull(billCreditNote, "billCreditNote");
            this.billCreditNote = billCreditNote;
            return this;
        }

        /**
         * Unique identifier for a bill credit note.
         */
        public Builder billCreditNoteId(String billCreditNoteId) {
            Utils.checkNotNull(billCreditNoteId, "billCreditNoteId");
            this.billCreditNoteId = billCreditNoteId;
            return this;
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

        /**
         * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting platform, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
         */
        public Builder forceUpdate(boolean forceUpdate) {
            Utils.checkNotNull(forceUpdate, "forceUpdate");
            this.forceUpdate = Optional.ofNullable(forceUpdate);
            return this;
        }
        
        /**
         * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting platform, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
         */
        public Builder forceUpdate(Optional<? extends Boolean> forceUpdate) {
            Utils.checkNotNull(forceUpdate, "forceUpdate");
            this.forceUpdate = forceUpdate;
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
        public Builder timeoutInMinutes(Optional<? extends Integer> timeoutInMinutes) {
            Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        
        public UpdateBillCreditNoteRequest build() {
            if (forceUpdate == null) {
                forceUpdate = _SINGLETON_VALUE_ForceUpdate.value();
            }
            return new UpdateBillCreditNoteRequest(
                billCreditNote,
                billCreditNoteId,
                companyId,
                connectionId,
                forceUpdate,
                timeoutInMinutes);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_ForceUpdate =
                new LazySingletonValue<>(
                        "forceUpdate",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}
