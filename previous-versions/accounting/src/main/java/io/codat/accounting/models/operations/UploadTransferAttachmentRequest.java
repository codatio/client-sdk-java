/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.SpeakeasyMetadata;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class UploadTransferAttachmentRequest {

    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    private Optional<? extends io.codat.accounting.models.components.AttachmentUpload> attachmentUpload;

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
     * Unique identifier for a transfer.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=transferId")
    private String transferId;

    public UploadTransferAttachmentRequest(
            Optional<? extends io.codat.accounting.models.components.AttachmentUpload> attachmentUpload,
            String companyId,
            String connectionId,
            String transferId) {
        Utils.checkNotNull(attachmentUpload, "attachmentUpload");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(transferId, "transferId");
        this.attachmentUpload = attachmentUpload;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.transferId = transferId;
    }

    public Optional<? extends io.codat.accounting.models.components.AttachmentUpload> attachmentUpload() {
        return attachmentUpload;
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
     * Unique identifier for a transfer.
     */
    public String transferId() {
        return transferId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public UploadTransferAttachmentRequest withAttachmentUpload(io.codat.accounting.models.components.AttachmentUpload attachmentUpload) {
        Utils.checkNotNull(attachmentUpload, "attachmentUpload");
        this.attachmentUpload = Optional.ofNullable(attachmentUpload);
        return this;
    }
    
    public UploadTransferAttachmentRequest withAttachmentUpload(Optional<? extends io.codat.accounting.models.components.AttachmentUpload> attachmentUpload) {
        Utils.checkNotNull(attachmentUpload, "attachmentUpload");
        this.attachmentUpload = attachmentUpload;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public UploadTransferAttachmentRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public UploadTransferAttachmentRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for a transfer.
     */
    public UploadTransferAttachmentRequest withTransferId(String transferId) {
        Utils.checkNotNull(transferId, "transferId");
        this.transferId = transferId;
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
        UploadTransferAttachmentRequest other = (UploadTransferAttachmentRequest) o;
        return 
            java.util.Objects.deepEquals(this.attachmentUpload, other.attachmentUpload) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.transferId, other.transferId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            attachmentUpload,
            companyId,
            connectionId,
            transferId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UploadTransferAttachmentRequest.class,
                "attachmentUpload", attachmentUpload,
                "companyId", companyId,
                "connectionId", connectionId,
                "transferId", transferId);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.accounting.models.components.AttachmentUpload> attachmentUpload = Optional.empty();
 
        private String companyId;
 
        private String connectionId;
 
        private String transferId;  
        
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
         * Unique identifier for a transfer.
         */
        public Builder transferId(String transferId) {
            Utils.checkNotNull(transferId, "transferId");
            this.transferId = transferId;
            return this;
        }
        
        public UploadTransferAttachmentRequest build() {
            return new UploadTransferAttachmentRequest(
                attachmentUpload,
                companyId,
                connectionId,
                transferId);
        }
    }
}
