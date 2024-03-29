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


public class DataIntegrityConnectionId {

    /**
     * An array of strings. The connection IDs for the type specified in the url.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source")
    private Optional<? extends java.util.List<String>> source;

    /**
     * An array of strings. The connection IDs for the type being matched to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("target")
    private Optional<? extends java.util.List<String>> target;

    public DataIntegrityConnectionId(
            @JsonProperty("source") Optional<? extends java.util.List<String>> source,
            @JsonProperty("target") Optional<? extends java.util.List<String>> target) {
        Utils.checkNotNull(source, "source");
        Utils.checkNotNull(target, "target");
        this.source = source;
        this.target = target;
    }

    /**
     * An array of strings. The connection IDs for the type specified in the url.
     */
    public Optional<? extends java.util.List<String>> source() {
        return source;
    }

    /**
     * An array of strings. The connection IDs for the type being matched to.
     */
    public Optional<? extends java.util.List<String>> target() {
        return target;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * An array of strings. The connection IDs for the type specified in the url.
     */
    public DataIntegrityConnectionId withSource(java.util.List<String> source) {
        Utils.checkNotNull(source, "source");
        this.source = Optional.ofNullable(source);
        return this;
    }
    
    /**
     * An array of strings. The connection IDs for the type specified in the url.
     */
    public DataIntegrityConnectionId withSource(Optional<? extends java.util.List<String>> source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }

    /**
     * An array of strings. The connection IDs for the type being matched to.
     */
    public DataIntegrityConnectionId withTarget(java.util.List<String> target) {
        Utils.checkNotNull(target, "target");
        this.target = Optional.ofNullable(target);
        return this;
    }
    
    /**
     * An array of strings. The connection IDs for the type being matched to.
     */
    public DataIntegrityConnectionId withTarget(Optional<? extends java.util.List<String>> target) {
        Utils.checkNotNull(target, "target");
        this.target = target;
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
        DataIntegrityConnectionId other = (DataIntegrityConnectionId) o;
        return 
            java.util.Objects.deepEquals(this.source, other.source) &&
            java.util.Objects.deepEquals(this.target, other.target);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            source,
            target);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DataIntegrityConnectionId.class,
                "source", source,
                "target", target);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<String>> source = Optional.empty();
 
        private Optional<? extends java.util.List<String>> target = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * An array of strings. The connection IDs for the type specified in the url.
         */
        public Builder source(java.util.List<String> source) {
            Utils.checkNotNull(source, "source");
            this.source = Optional.ofNullable(source);
            return this;
        }
        
        /**
         * An array of strings. The connection IDs for the type specified in the url.
         */
        public Builder source(Optional<? extends java.util.List<String>> source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }

        /**
         * An array of strings. The connection IDs for the type being matched to.
         */
        public Builder target(java.util.List<String> target) {
            Utils.checkNotNull(target, "target");
            this.target = Optional.ofNullable(target);
            return this;
        }
        
        /**
         * An array of strings. The connection IDs for the type being matched to.
         */
        public Builder target(Optional<? extends java.util.List<String>> target) {
            Utils.checkNotNull(target, "target");
            this.target = target;
            return this;
        }
        
        public DataIntegrityConnectionId build() {
            return new DataIntegrityConnectionId(
                source,
                target);
        }
    }
}

