/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.components;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.commerce.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;


public class SyncRange {

    @JsonProperty("dateRange")
    private DateRange dateRange;

    public SyncRange(
            @JsonProperty("dateRange") DateRange dateRange) {
        Utils.checkNotNull(dateRange, "dateRange");
        this.dateRange = dateRange;
    }

    public DateRange dateRange() {
        return dateRange;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public SyncRange withDateRange(DateRange dateRange) {
        Utils.checkNotNull(dateRange, "dateRange");
        this.dateRange = dateRange;
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
        SyncRange other = (SyncRange) o;
        return 
            java.util.Objects.deepEquals(this.dateRange, other.dateRange);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dateRange);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SyncRange.class,
                "dateRange", dateRange);
    }
    
    public final static class Builder {
 
        private DateRange dateRange;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder dateRange(DateRange dateRange) {
            Utils.checkNotNull(dateRange, "dateRange");
            this.dateRange = dateRange;
            return this;
        }
        
        public SyncRange build() {
            return new SyncRange(
                dateRange);
        }
    }
}

