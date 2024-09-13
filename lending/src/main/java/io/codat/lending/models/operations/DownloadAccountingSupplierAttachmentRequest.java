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


public class DownloadAccountingSupplierAttachmentRequest {

    /**
     * Unique identifier for an attachment.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=attachmentId")
    private String attachmentId;

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
    public DownloadAccountingSupplierAttachmentRequest(
            String attachmentId,
            String companyId,
            String connectionId,
            String supplierId) {
        Utils.checkNotNull(attachmentId, "attachmentId");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(supplierId, "supplierId");
        this.attachmentId = attachmentId;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.supplierId = supplierId;
    }

    /**
     * Unique identifier for an attachment.
     */
    @JsonIgnore
    public String attachmentId() {
        return attachmentId;
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
     * Unique identifier for an attachment.
     */
    public DownloadAccountingSupplierAttachmentRequest withAttachmentId(String attachmentId) {
        Utils.checkNotNull(attachmentId, "attachmentId");
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public DownloadAccountingSupplierAttachmentRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public DownloadAccountingSupplierAttachmentRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for a supplier.
     */
    public DownloadAccountingSupplierAttachmentRequest withSupplierId(String supplierId) {
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
        DownloadAccountingSupplierAttachmentRequest other = (DownloadAccountingSupplierAttachmentRequest) o;
        return 
            Objects.deepEquals(this.attachmentId, other.attachmentId) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.supplierId, other.supplierId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            attachmentId,
            companyId,
            connectionId,
            supplierId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DownloadAccountingSupplierAttachmentRequest.class,
                "attachmentId", attachmentId,
                "companyId", companyId,
                "connectionId", connectionId,
                "supplierId", supplierId);
    }
    
    public final static class Builder {
 
        private String attachmentId;
 
        private String companyId;
 
        private String connectionId;
 
        private String supplierId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for an attachment.
         */
        public Builder attachmentId(String attachmentId) {
            Utils.checkNotNull(attachmentId, "attachmentId");
            this.attachmentId = attachmentId;
            return this;
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
        
        public DownloadAccountingSupplierAttachmentRequest build() {
            return new DownloadAccountingSupplierAttachmentRequest(
                attachmentId,
                companyId,
                connectionId,
                supplierId);
        }
    }
}

