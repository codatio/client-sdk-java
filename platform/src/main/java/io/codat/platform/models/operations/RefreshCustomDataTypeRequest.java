/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.SpeakeasyMetadata;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class RefreshCustomDataTypeRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for a connection.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connectionId")
    private String connectionId;

    /**
     * Unique identifier for a custom data type.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=customDataIdentifier")
    private String customDataIdentifier;

    public RefreshCustomDataTypeRequest(
            String companyId,
            String connectionId,
            String customDataIdentifier) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(customDataIdentifier, "customDataIdentifier");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.customDataIdentifier = customDataIdentifier;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a connection.
     */
    public String connectionId() {
        return connectionId;
    }

    /**
     * Unique identifier for a custom data type.
     */
    public String customDataIdentifier() {
        return customDataIdentifier;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public RefreshCustomDataTypeRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public RefreshCustomDataTypeRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for a custom data type.
     */
    public RefreshCustomDataTypeRequest withCustomDataIdentifier(String customDataIdentifier) {
        Utils.checkNotNull(customDataIdentifier, "customDataIdentifier");
        this.customDataIdentifier = customDataIdentifier;
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
        RefreshCustomDataTypeRequest other = (RefreshCustomDataTypeRequest) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.customDataIdentifier, other.customDataIdentifier);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            connectionId,
            customDataIdentifier);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RefreshCustomDataTypeRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "customDataIdentifier", customDataIdentifier);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;
 
        private String customDataIdentifier;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for a company.
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        /**
         * Unique identifier for a connection.
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Unique identifier for a custom data type.
         */
        public Builder customDataIdentifier(String customDataIdentifier) {
            Utils.checkNotNull(customDataIdentifier, "customDataIdentifier");
            this.customDataIdentifier = customDataIdentifier;
            return this;
        }
        
        public RefreshCustomDataTypeRequest build() {
            return new RefreshCustomDataTypeRequest(
                companyId,
                connectionId,
                customDataIdentifier);
        }
    }
}

