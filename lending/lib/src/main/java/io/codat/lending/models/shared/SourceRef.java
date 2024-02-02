/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.util.Optional;

/**
 * SourceRef - A source reference containing the `sourceType` object "Banking".
 */

public class SourceRef {

    /**
     * The data source type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceType")
    private Optional<? extends String> sourceType;

    public SourceRef(
            @JsonProperty("sourceType") Optional<? extends String> sourceType) {
        Utils.checkNotNull(sourceType, "sourceType");
        this.sourceType = sourceType;
    }

    /**
     * The data source type.
     */
    public Optional<? extends String> sourceType() {
        return sourceType;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The data source type.
     */
    public SourceRef withSourceType(String sourceType) {
        Utils.checkNotNull(sourceType, "sourceType");
        this.sourceType = Optional.ofNullable(sourceType);
        return this;
    }
    
    /**
     * The data source type.
     */
    public SourceRef withSourceType(Optional<? extends String> sourceType) {
        Utils.checkNotNull(sourceType, "sourceType");
        this.sourceType = sourceType;
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
        SourceRef other = (SourceRef) o;
        return 
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceRef.class,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> sourceType = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The data source type.
         */
        public Builder sourceType(String sourceType) {
            Utils.checkNotNull(sourceType, "sourceType");
            this.sourceType = Optional.ofNullable(sourceType);
            return this;
        }
        
        /**
         * The data source type.
         */
        public Builder sourceType(Optional<? extends String> sourceType) {
            Utils.checkNotNull(sourceType, "sourceType");
            this.sourceType = sourceType;
            return this;
        }        
        
        public SourceRef build() {
            return new SourceRef(
                sourceType);
        }
    }
}

