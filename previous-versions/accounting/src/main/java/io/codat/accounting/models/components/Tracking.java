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
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class Tracking {

    /**
     * Links the current record to the underlying record or data type that created it. 
     * 
     * For example, if a journal entry is generated based on an invoice, this property allows you to connect the journal entry to the underlying invoice in our data model. 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invoiceTo")
    private Optional<? extends RecordReference> invoiceTo;

    @JsonProperty("recordRefs")
    private List<TrackingRecordRef> recordRefs;

    @JsonCreator
    public Tracking(
            @JsonProperty("invoiceTo") Optional<? extends RecordReference> invoiceTo,
            @JsonProperty("recordRefs") List<TrackingRecordRef> recordRefs) {
        Utils.checkNotNull(invoiceTo, "invoiceTo");
        Utils.checkNotNull(recordRefs, "recordRefs");
        this.invoiceTo = invoiceTo;
        this.recordRefs = recordRefs;
    }
    
    public Tracking(
            List<TrackingRecordRef> recordRefs) {
        this(Optional.empty(), recordRefs);
    }

    /**
     * Links the current record to the underlying record or data type that created it. 
     * 
     * For example, if a journal entry is generated based on an invoice, this property allows you to connect the journal entry to the underlying invoice in our data model. 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RecordReference> invoiceTo() {
        return (Optional<RecordReference>) invoiceTo;
    }

    @JsonIgnore
    public List<TrackingRecordRef> recordRefs() {
        return recordRefs;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Links the current record to the underlying record or data type that created it. 
     * 
     * For example, if a journal entry is generated based on an invoice, this property allows you to connect the journal entry to the underlying invoice in our data model. 
     */
    public Tracking withInvoiceTo(RecordReference invoiceTo) {
        Utils.checkNotNull(invoiceTo, "invoiceTo");
        this.invoiceTo = Optional.ofNullable(invoiceTo);
        return this;
    }

    /**
     * Links the current record to the underlying record or data type that created it. 
     * 
     * For example, if a journal entry is generated based on an invoice, this property allows you to connect the journal entry to the underlying invoice in our data model. 
     */
    public Tracking withInvoiceTo(Optional<? extends RecordReference> invoiceTo) {
        Utils.checkNotNull(invoiceTo, "invoiceTo");
        this.invoiceTo = invoiceTo;
        return this;
    }

    public Tracking withRecordRefs(List<TrackingRecordRef> recordRefs) {
        Utils.checkNotNull(recordRefs, "recordRefs");
        this.recordRefs = recordRefs;
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
        Tracking other = (Tracking) o;
        return 
            Objects.deepEquals(this.invoiceTo, other.invoiceTo) &&
            Objects.deepEquals(this.recordRefs, other.recordRefs);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            invoiceTo,
            recordRefs);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Tracking.class,
                "invoiceTo", invoiceTo,
                "recordRefs", recordRefs);
    }
    
    public final static class Builder {
 
        private Optional<? extends RecordReference> invoiceTo = Optional.empty();
 
        private List<TrackingRecordRef> recordRefs;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Links the current record to the underlying record or data type that created it. 
         * 
         * For example, if a journal entry is generated based on an invoice, this property allows you to connect the journal entry to the underlying invoice in our data model. 
         */
        public Builder invoiceTo(RecordReference invoiceTo) {
            Utils.checkNotNull(invoiceTo, "invoiceTo");
            this.invoiceTo = Optional.ofNullable(invoiceTo);
            return this;
        }

        /**
         * Links the current record to the underlying record or data type that created it. 
         * 
         * For example, if a journal entry is generated based on an invoice, this property allows you to connect the journal entry to the underlying invoice in our data model. 
         */
        public Builder invoiceTo(Optional<? extends RecordReference> invoiceTo) {
            Utils.checkNotNull(invoiceTo, "invoiceTo");
            this.invoiceTo = invoiceTo;
            return this;
        }

        public Builder recordRefs(List<TrackingRecordRef> recordRefs) {
            Utils.checkNotNull(recordRefs, "recordRefs");
            this.recordRefs = recordRefs;
            return this;
        }
        
        public Tracking build() {
            return new Tracking(
                invoiceTo,
                recordRefs);
        }
    }
}

