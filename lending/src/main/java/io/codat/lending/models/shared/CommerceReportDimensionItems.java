/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class CommerceReportDimensionItems {

    /**
     * The dimension's items index.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    private Optional<? extends Long> index;

    public CommerceReportDimensionItems(
            @JsonProperty("index") Optional<? extends Long> index) {
        Utils.checkNotNull(index, "index");
        this.index = index;
    }

    /**
     * The dimension's items index.
     */
    public Optional<? extends Long> index() {
        return index;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The dimension's items index.
     */
    public CommerceReportDimensionItems withIndex(long index) {
        Utils.checkNotNull(index, "index");
        this.index = Optional.ofNullable(index);
        return this;
    }
    
    /**
     * The dimension's items index.
     */
    public CommerceReportDimensionItems withIndex(Optional<? extends Long> index) {
        Utils.checkNotNull(index, "index");
        this.index = index;
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
        CommerceReportDimensionItems other = (CommerceReportDimensionItems) o;
        return 
            java.util.Objects.deepEquals(this.index, other.index);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            index);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CommerceReportDimensionItems.class,
                "index", index);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> index = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The dimension's items index.
         */
        public Builder index(long index) {
            Utils.checkNotNull(index, "index");
            this.index = Optional.ofNullable(index);
            return this;
        }
        
        /**
         * The dimension's items index.
         */
        public Builder index(Optional<? extends Long> index) {
            Utils.checkNotNull(index, "index");
            this.index = index;
            return this;
        }
        
        public CommerceReportDimensionItems build() {
            return new CommerceReportDimensionItems(
                index);
        }
    }
}
