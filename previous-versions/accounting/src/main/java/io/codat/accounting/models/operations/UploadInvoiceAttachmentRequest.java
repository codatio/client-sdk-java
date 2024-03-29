/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.SpeakeasyMetadata;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class UploadInvoiceAttachmentRequest {

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
     * Unique identifier for an invoice.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=invoiceId")
    private String invoiceId;

    public UploadInvoiceAttachmentRequest(
            Optional<? extends io.codat.accounting.models.components.AttachmentUpload> attachmentUpload,
            String companyId,
            String connectionId,
            String invoiceId) {
        Utils.checkNotNull(attachmentUpload, "attachmentUpload");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(invoiceId, "invoiceId");
        this.attachmentUpload = attachmentUpload;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.invoiceId = invoiceId;
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
     * Unique identifier for an invoice.
     */
    public String invoiceId() {
        return invoiceId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public UploadInvoiceAttachmentRequest withAttachmentUpload(io.codat.accounting.models.components.AttachmentUpload attachmentUpload) {
        Utils.checkNotNull(attachmentUpload, "attachmentUpload");
        this.attachmentUpload = Optional.ofNullable(attachmentUpload);
        return this;
    }
    
    public UploadInvoiceAttachmentRequest withAttachmentUpload(Optional<? extends io.codat.accounting.models.components.AttachmentUpload> attachmentUpload) {
        Utils.checkNotNull(attachmentUpload, "attachmentUpload");
        this.attachmentUpload = attachmentUpload;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public UploadInvoiceAttachmentRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public UploadInvoiceAttachmentRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for an invoice.
     */
    public UploadInvoiceAttachmentRequest withInvoiceId(String invoiceId) {
        Utils.checkNotNull(invoiceId, "invoiceId");
        this.invoiceId = invoiceId;
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
        UploadInvoiceAttachmentRequest other = (UploadInvoiceAttachmentRequest) o;
        return 
            java.util.Objects.deepEquals(this.attachmentUpload, other.attachmentUpload) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.invoiceId, other.invoiceId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            attachmentUpload,
            companyId,
            connectionId,
            invoiceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UploadInvoiceAttachmentRequest.class,
                "attachmentUpload", attachmentUpload,
                "companyId", companyId,
                "connectionId", connectionId,
                "invoiceId", invoiceId);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.accounting.models.components.AttachmentUpload> attachmentUpload = Optional.empty();
 
        private String companyId;
 
        private String connectionId;
 
        private String invoiceId;  
        
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
         * Unique identifier for an invoice.
         */
        public Builder invoiceId(String invoiceId) {
            Utils.checkNotNull(invoiceId, "invoiceId");
            this.invoiceId = invoiceId;
            return this;
        }
        
        public UploadInvoiceAttachmentRequest build() {
            return new UploadInvoiceAttachmentRequest(
                attachmentUpload,
                companyId,
                connectionId,
                invoiceId);
        }
    }
}

