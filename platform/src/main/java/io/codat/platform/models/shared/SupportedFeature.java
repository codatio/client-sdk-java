/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class SupportedFeature {

    /**
     * The current release state of the feature.
     */
    @JsonProperty("featureState")
    private FeatureState featureState;

    /**
     * The type of feature.
     */
    @JsonProperty("featureType")
    private FeatureType featureType;

    @JsonCreator
    public SupportedFeature(
            @JsonProperty("featureState") FeatureState featureState,
            @JsonProperty("featureType") FeatureType featureType) {
        Utils.checkNotNull(featureState, "featureState");
        Utils.checkNotNull(featureType, "featureType");
        this.featureState = featureState;
        this.featureType = featureType;
    }

    /**
     * The current release state of the feature.
     */
    @JsonIgnore
    public FeatureState featureState() {
        return featureState;
    }

    /**
     * The type of feature.
     */
    @JsonIgnore
    public FeatureType featureType() {
        return featureType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The current release state of the feature.
     */
    public SupportedFeature withFeatureState(FeatureState featureState) {
        Utils.checkNotNull(featureState, "featureState");
        this.featureState = featureState;
        return this;
    }

    /**
     * The type of feature.
     */
    public SupportedFeature withFeatureType(FeatureType featureType) {
        Utils.checkNotNull(featureType, "featureType");
        this.featureType = featureType;
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
        SupportedFeature other = (SupportedFeature) o;
        return 
            java.util.Objects.deepEquals(this.featureState, other.featureState) &&
            java.util.Objects.deepEquals(this.featureType, other.featureType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            featureState,
            featureType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SupportedFeature.class,
                "featureState", featureState,
                "featureType", featureType);
    }
    
    public final static class Builder {
 
        private FeatureState featureState;
 
        private FeatureType featureType;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The current release state of the feature.
         */
        public Builder featureState(FeatureState featureState) {
            Utils.checkNotNull(featureState, "featureState");
            this.featureState = featureState;
            return this;
        }

        /**
         * The type of feature.
         */
        public Builder featureType(FeatureType featureType) {
            Utils.checkNotNull(featureType, "featureType");
            this.featureType = featureType;
            return this;
        }
        
        public SupportedFeature build() {
            return new SupportedFeature(
                featureState,
                featureType);
        }
    }
}

