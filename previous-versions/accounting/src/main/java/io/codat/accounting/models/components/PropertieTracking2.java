/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import org.openapitools.jackson.nullable.JsonNullable;


public class PropertieTracking2 {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("recordRefs")
    private JsonNullable<? extends java.util.List<TrackingRecordRef>> recordRefs;

    public PropertieTracking2(
            @JsonProperty("recordRefs") JsonNullable<? extends java.util.List<TrackingRecordRef>> recordRefs) {
        Utils.checkNotNull(recordRefs, "recordRefs");
        this.recordRefs = recordRefs;
    }

    public JsonNullable<? extends java.util.List<TrackingRecordRef>> recordRefs() {
        return recordRefs;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public PropertieTracking2 withRecordRefs(java.util.List<TrackingRecordRef> recordRefs) {
        Utils.checkNotNull(recordRefs, "recordRefs");
        this.recordRefs = JsonNullable.of(recordRefs);
        return this;
    }

    public PropertieTracking2 withRecordRefs(JsonNullable<? extends java.util.List<TrackingRecordRef>> recordRefs) {
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
        PropertieTracking2 other = (PropertieTracking2) o;
        return 
            java.util.Objects.deepEquals(this.recordRefs, other.recordRefs);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            recordRefs);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PropertieTracking2.class,
                "recordRefs", recordRefs);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends java.util.List<TrackingRecordRef>> recordRefs = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder recordRefs(java.util.List<TrackingRecordRef> recordRefs) {
            Utils.checkNotNull(recordRefs, "recordRefs");
            this.recordRefs = JsonNullable.of(recordRefs);
            return this;
        }

        public Builder recordRefs(JsonNullable<? extends java.util.List<TrackingRecordRef>> recordRefs) {
            Utils.checkNotNull(recordRefs, "recordRefs");
            this.recordRefs = recordRefs;
            return this;
        }
        
        public PropertieTracking2 build() {
            return new PropertieTracking2(
                recordRefs);
        }
    }
}

