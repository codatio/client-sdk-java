/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.SpeakeasyMetadata;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class UploadBillAttachmentRequest {

    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    private Optional<? extends io.codat.accounting.models.components.AttachmentUpload> attachmentUpload;

    /**
     * Unique identifier for a bill.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=billId")
    private String billId;

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

    public UploadBillAttachmentRequest(
            Optional<? extends io.codat.accounting.models.components.AttachmentUpload> attachmentUpload,
            String billId,
            String companyId,
            String connectionId) {
        Utils.checkNotNull(attachmentUpload, "attachmentUpload");
        Utils.checkNotNull(billId, "billId");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        this.attachmentUpload = attachmentUpload;
        this.billId = billId;
        this.companyId = companyId;
        this.connectionId = connectionId;
    }

    public Optional<? extends io.codat.accounting.models.components.AttachmentUpload> attachmentUpload() {
        return attachmentUpload;
    }

    /**
     * Unique identifier for a bill.
     */
    public String billId() {
        return billId;
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
    
    public final static Builder builder() {
        return new Builder();
    }

    public UploadBillAttachmentRequest withAttachmentUpload(io.codat.accounting.models.components.AttachmentUpload attachmentUpload) {
        Utils.checkNotNull(attachmentUpload, "attachmentUpload");
        this.attachmentUpload = Optional.ofNullable(attachmentUpload);
        return this;
    }
    
    public UploadBillAttachmentRequest withAttachmentUpload(Optional<? extends io.codat.accounting.models.components.AttachmentUpload> attachmentUpload) {
        Utils.checkNotNull(attachmentUpload, "attachmentUpload");
        this.attachmentUpload = attachmentUpload;
        return this;
    }

    /**
     * Unique identifier for a bill.
     */
    public UploadBillAttachmentRequest withBillId(String billId) {
        Utils.checkNotNull(billId, "billId");
        this.billId = billId;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public UploadBillAttachmentRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public UploadBillAttachmentRequest withConnectionId(String connectionId) {
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
        UploadBillAttachmentRequest other = (UploadBillAttachmentRequest) o;
        return 
            java.util.Objects.deepEquals(this.attachmentUpload, other.attachmentUpload) &&
            java.util.Objects.deepEquals(this.billId, other.billId) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            attachmentUpload,
            billId,
            companyId,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UploadBillAttachmentRequest.class,
                "attachmentUpload", attachmentUpload,
                "billId", billId,
                "companyId", companyId,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.accounting.models.components.AttachmentUpload> attachmentUpload = Optional.empty();
 
        private String billId;
 
        private String companyId;
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder attachmentUpload(io.codat.accounting.models.components.AttachmentUpload attachmentUpload) {
            Utils.checkNotNull(attachmentUpload, "attachmentUpload");
            this.attachmentUpload = Optional.ofNullable(attachmentUpload);
            return this;
        }
        
        public Builder attachmentUpload(Optional<? extends io.codat.accounting.models.components.AttachmentUpload> attachmentUpload) {
            Utils.checkNotNull(attachmentUpload, "attachmentUpload");
            this.attachmentUpload = attachmentUpload;
            return this;
        }

        /**
         * Unique identifier for a bill.
         */
        public Builder billId(String billId) {
            Utils.checkNotNull(billId, "billId");
            this.billId = billId;
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
        
        public UploadBillAttachmentRequest build() {
            return new UploadBillAttachmentRequest(
                attachmentUpload,
                billId,
                companyId,
                connectionId);
        }
    }
}

