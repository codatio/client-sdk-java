/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.platform.models.shared.SchemaDataType;
import io.codat.platform.utils.SpeakeasyMetadata;
import io.codat.platform.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class RefreshDataTypeRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Optionally, provide a data connection id to only queue pull operations on that connection.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=connectionId")
    private Optional<String> connectionId;

    /**
     * The key of a Codat data type.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=dataType")
    private SchemaDataType dataType;

    @JsonCreator
    public RefreshDataTypeRequest(
            String companyId,
            Optional<String> connectionId,
            SchemaDataType dataType) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(dataType, "dataType");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.dataType = dataType;
    }
    
    public RefreshDataTypeRequest(
            String companyId,
            SchemaDataType dataType) {
        this(companyId, Optional.empty(), dataType);
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Optionally, provide a data connection id to only queue pull operations on that connection.
     */
    @JsonIgnore
    public Optional<String> connectionId() {
        return connectionId;
    }

    /**
     * The key of a Codat data type.
     */
    @JsonIgnore
    public SchemaDataType dataType() {
        return dataType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public RefreshDataTypeRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Optionally, provide a data connection id to only queue pull operations on that connection.
     */
    public RefreshDataTypeRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = Optional.ofNullable(connectionId);
        return this;
    }

    /**
     * Optionally, provide a data connection id to only queue pull operations on that connection.
     */
    public RefreshDataTypeRequest withConnectionId(Optional<String> connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * The key of a Codat data type.
     */
    public RefreshDataTypeRequest withDataType(SchemaDataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
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
        RefreshDataTypeRequest other = (RefreshDataTypeRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.dataType, other.dataType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            connectionId,
            dataType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RefreshDataTypeRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "dataType", dataType);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private Optional<String> connectionId = Optional.empty();
 
        private SchemaDataType dataType;  
        
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
         * Optionally, provide a data connection id to only queue pull operations on that connection.
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = Optional.ofNullable(connectionId);
            return this;
        }

        /**
         * Optionally, provide a data connection id to only queue pull operations on that connection.
         */
        public Builder connectionId(Optional<String> connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        /**
         * The key of a Codat data type.
         */
        public Builder dataType(SchemaDataType dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }
        
        public RefreshDataTypeRequest build() {
            return new RefreshDataTypeRequest(
                companyId,
                connectionId,
                dataType);
        }
    }
}

