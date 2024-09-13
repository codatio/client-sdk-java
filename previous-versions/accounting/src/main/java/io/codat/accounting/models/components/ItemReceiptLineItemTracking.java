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
import org.openapitools.jackson.nullable.JsonNullable;


public class ItemReceiptLineItemTracking {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("recordRefs")
    private JsonNullable<? extends List<TrackingRecordRef>> recordRefs;

    @JsonCreator
    public ItemReceiptLineItemTracking(
            @JsonProperty("recordRefs") JsonNullable<? extends List<TrackingRecordRef>> recordRefs) {
        Utils.checkNotNull(recordRefs, "recordRefs");
        this.recordRefs = recordRefs;
    }
    
    public ItemReceiptLineItemTracking() {
        this(JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<TrackingRecordRef>> recordRefs() {
        return (JsonNullable<List<TrackingRecordRef>>) recordRefs;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ItemReceiptLineItemTracking withRecordRefs(List<TrackingRecordRef> recordRefs) {
        Utils.checkNotNull(recordRefs, "recordRefs");
        this.recordRefs = JsonNullable.of(recordRefs);
        return this;
    }

    public ItemReceiptLineItemTracking withRecordRefs(JsonNullable<? extends List<TrackingRecordRef>> recordRefs) {
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
        ItemReceiptLineItemTracking other = (ItemReceiptLineItemTracking) o;
        return 
            Objects.deepEquals(this.recordRefs, other.recordRefs);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            recordRefs);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ItemReceiptLineItemTracking.class,
                "recordRefs", recordRefs);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends List<TrackingRecordRef>> recordRefs = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder recordRefs(List<TrackingRecordRef> recordRefs) {
            Utils.checkNotNull(recordRefs, "recordRefs");
            this.recordRefs = JsonNullable.of(recordRefs);
            return this;
        }

        public Builder recordRefs(JsonNullable<? extends List<TrackingRecordRef>> recordRefs) {
            Utils.checkNotNull(recordRefs, "recordRefs");
            this.recordRefs = recordRefs;
            return this;
        }
        
        public ItemReceiptLineItemTracking build() {
            return new ItemReceiptLineItemTracking(
                recordRefs);
        }
    }
}

