/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

/**
 * DataTypeFeature - Describes support for a given datatype and associated operations
 */

public class DataTypeFeature {

    /**
     * Available data types
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataType")
    private Optional<? extends DataType> dataType;

    @JsonProperty("supportedFeatures")
    private java.util.List<SupportedFeature> supportedFeatures;

    @JsonCreator
    public DataTypeFeature(
            @JsonProperty("dataType") Optional<? extends DataType> dataType,
            @JsonProperty("supportedFeatures") java.util.List<SupportedFeature> supportedFeatures) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(supportedFeatures, "supportedFeatures");
        this.dataType = dataType;
        this.supportedFeatures = supportedFeatures;
    }
    
    public DataTypeFeature(
            java.util.List<SupportedFeature> supportedFeatures) {
        this(Optional.empty(), supportedFeatures);
    }

    /**
     * Available data types
     */
    @JsonIgnore
    public Optional<? extends DataType> dataType() {
        return dataType;
    }

    @JsonIgnore
    public java.util.List<SupportedFeature> supportedFeatures() {
        return supportedFeatures;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Available data types
     */
    public DataTypeFeature withDataType(DataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = Optional.ofNullable(dataType);
        return this;
    }

    /**
     * Available data types
     */
    public DataTypeFeature withDataType(Optional<? extends DataType> dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    public DataTypeFeature withSupportedFeatures(java.util.List<SupportedFeature> supportedFeatures) {
        Utils.checkNotNull(supportedFeatures, "supportedFeatures");
        this.supportedFeatures = supportedFeatures;
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
        DataTypeFeature other = (DataTypeFeature) o;
        return 
            java.util.Objects.deepEquals(this.dataType, other.dataType) &&
            java.util.Objects.deepEquals(this.supportedFeatures, other.supportedFeatures);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dataType,
            supportedFeatures);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DataTypeFeature.class,
                "dataType", dataType,
                "supportedFeatures", supportedFeatures);
    }
    
    public final static class Builder {
 
        private Optional<? extends DataType> dataType = Optional.empty();
 
        private java.util.List<SupportedFeature> supportedFeatures;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Available data types
         */
        public Builder dataType(DataType dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = Optional.ofNullable(dataType);
            return this;
        }

        /**
         * Available data types
         */
        public Builder dataType(Optional<? extends DataType> dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        public Builder supportedFeatures(java.util.List<SupportedFeature> supportedFeatures) {
            Utils.checkNotNull(supportedFeatures, "supportedFeatures");
            this.supportedFeatures = supportedFeatures;
            return this;
        }
        
        public DataTypeFeature build() {
            return new DataTypeFeature(
                dataType,
                supportedFeatures);
        }
    }
}

