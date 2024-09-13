/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.accounting.utils.SpeakeasyMetadata;
import io.codat.accounting.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetCreateUpdateCreditNotesModelRequest {

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

    @JsonCreator
    public GetCreateUpdateCreditNotesModelRequest(
            String companyId,
            String connectionId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        this.companyId = companyId;
        this.connectionId = connectionId;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a connection.
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetCreateUpdateCreditNotesModelRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public GetCreateUpdateCreditNotesModelRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
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
        GetCreateUpdateCreditNotesModelRequest other = (GetCreateUpdateCreditNotesModelRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCreateUpdateCreditNotesModelRequest.class,
                "companyId", companyId,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;  
        
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
        
        public GetCreateUpdateCreditNotesModelRequest build() {
            return new GetCreateUpdateCreditNotesModelRequest(
                companyId,
                connectionId);
        }
    }
}

