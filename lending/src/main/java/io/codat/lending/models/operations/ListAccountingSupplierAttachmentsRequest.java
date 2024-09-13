/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ListAccountingSupplierAttachmentsRequest {

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
     * Unique identifier for a supplier.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=supplierId")
    private String supplierId;

    @JsonCreator
    public ListAccountingSupplierAttachmentsRequest(
            String companyId,
            String connectionId,
            String supplierId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(supplierId, "supplierId");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.supplierId = supplierId;
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
     * Unique identifier for a supplier.
     */
    @JsonIgnore
    public String supplierId() {
        return supplierId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public ListAccountingSupplierAttachmentsRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public ListAccountingSupplierAttachmentsRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for a supplier.
     */
    public ListAccountingSupplierAttachmentsRequest withSupplierId(String supplierId) {
        Utils.checkNotNull(supplierId, "supplierId");
        this.supplierId = supplierId;
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
        ListAccountingSupplierAttachmentsRequest other = (ListAccountingSupplierAttachmentsRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.supplierId, other.supplierId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            connectionId,
            supplierId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListAccountingSupplierAttachmentsRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "supplierId", supplierId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;
 
        private String supplierId;  
        
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
         * Unique identifier for a supplier.
         */
        public Builder supplierId(String supplierId) {
            Utils.checkNotNull(supplierId, "supplierId");
            this.supplierId = supplierId;
            return this;
        }
        
        public ListAccountingSupplierAttachmentsRequest build() {
            return new ListAccountingSupplierAttachmentsRequest(
                companyId,
                connectionId,
                supplierId);
        }
    }
}

