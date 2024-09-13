/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.platform.utils.SpeakeasyMetadata;
import io.codat.platform.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetSupplementalDataConfigurationRequest {

    /**
     * Supported supplemental data data type.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=dataType")
    private PathParamDataType dataType;

    /**
     * A unique 4-letter key to represent a platform in each integration.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=platformKey")
    private String platformKey;

    @JsonCreator
    public GetSupplementalDataConfigurationRequest(
            PathParamDataType dataType,
            String platformKey) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(platformKey, "platformKey");
        this.dataType = dataType;
        this.platformKey = platformKey;
    }

    /**
     * Supported supplemental data data type.
     */
    @JsonIgnore
    public PathParamDataType dataType() {
        return dataType;
    }

    /**
     * A unique 4-letter key to represent a platform in each integration.
     */
    @JsonIgnore
    public String platformKey() {
        return platformKey;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Supported supplemental data data type.
     */
    public GetSupplementalDataConfigurationRequest withDataType(PathParamDataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * A unique 4-letter key to represent a platform in each integration.
     */
    public GetSupplementalDataConfigurationRequest withPlatformKey(String platformKey) {
        Utils.checkNotNull(platformKey, "platformKey");
        this.platformKey = platformKey;
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
        GetSupplementalDataConfigurationRequest other = (GetSupplementalDataConfigurationRequest) o;
        return 
            Objects.deepEquals(this.dataType, other.dataType) &&
            Objects.deepEquals(this.platformKey, other.platformKey);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            dataType,
            platformKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSupplementalDataConfigurationRequest.class,
                "dataType", dataType,
                "platformKey", platformKey);
    }
    
    public final static class Builder {
 
        private PathParamDataType dataType;
 
        private String platformKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Supported supplemental data data type.
         */
        public Builder dataType(PathParamDataType dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        /**
         * A unique 4-letter key to represent a platform in each integration.
         */
        public Builder platformKey(String platformKey) {
            Utils.checkNotNull(platformKey, "platformKey");
            this.platformKey = platformKey;
            return this;
        }
        
        public GetSupplementalDataConfigurationRequest build() {
            return new GetSupplementalDataConfigurationRequest(
                dataType,
                platformKey);
        }
    }
}

