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


public class GetDirectIncomeRequest {

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
     * Unique identifier for a direct income.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=directIncomeId")
    private String directIncomeId;

    @JsonCreator
    public GetDirectIncomeRequest(
            String companyId,
            String connectionId,
            String directIncomeId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(directIncomeId, "directIncomeId");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.directIncomeId = directIncomeId;
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

    /**
     * Unique identifier for a direct income.
     */
    @JsonIgnore
    public String directIncomeId() {
        return directIncomeId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetDirectIncomeRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public GetDirectIncomeRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for a direct income.
     */
    public GetDirectIncomeRequest withDirectIncomeId(String directIncomeId) {
        Utils.checkNotNull(directIncomeId, "directIncomeId");
        this.directIncomeId = directIncomeId;
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
        GetDirectIncomeRequest other = (GetDirectIncomeRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.directIncomeId, other.directIncomeId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            connectionId,
            directIncomeId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetDirectIncomeRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "directIncomeId", directIncomeId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;
 
        private String directIncomeId;  
        
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
         * Unique identifier for a direct income.
         */
        public Builder directIncomeId(String directIncomeId) {
            Utils.checkNotNull(directIncomeId, "directIncomeId");
            this.directIncomeId = directIncomeId;
            return this;
        }
        
        public GetDirectIncomeRequest build() {
            return new GetDirectIncomeRequest(
                companyId,
                connectionId,
                directIncomeId);
        }
    }
}

