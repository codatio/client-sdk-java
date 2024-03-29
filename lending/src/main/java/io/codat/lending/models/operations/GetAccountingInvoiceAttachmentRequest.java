/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;


public class GetAccountingInvoiceAttachmentRequest {

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
     * Unique identifier for an invoice.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=invoiceId")
    private String invoiceId;

    public GetAccountingInvoiceAttachmentRequest(
            String attachmentId,
            String companyId,
            String connectionId,
            String invoiceId) {
        Utils.checkNotNull(attachmentId, "attachmentId");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(invoiceId, "invoiceId");
        this.attachmentId = attachmentId;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.invoiceId = invoiceId;
    }

    /**
     * Unique identifier for an attachment.
     */
    public String attachmentId() {
        return attachmentId;
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

    /**
     * Unique identifier for an attachment.
     */
    public GetAccountingInvoiceAttachmentRequest withAttachmentId(String attachmentId) {
        Utils.checkNotNull(attachmentId, "attachmentId");
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public GetAccountingInvoiceAttachmentRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public GetAccountingInvoiceAttachmentRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for an invoice.
     */
    public GetAccountingInvoiceAttachmentRequest withInvoiceId(String invoiceId) {
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
        GetAccountingInvoiceAttachmentRequest other = (GetAccountingInvoiceAttachmentRequest) o;
        return 
            java.util.Objects.deepEquals(this.attachmentId, other.attachmentId) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.invoiceId, other.invoiceId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            attachmentId,
            companyId,
            connectionId,
            invoiceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingInvoiceAttachmentRequest.class,
                "attachmentId", attachmentId,
                "companyId", companyId,
                "connectionId", connectionId,
                "invoiceId", invoiceId);
    }
    
    public final static class Builder {
 
        private String attachmentId;
 
        private String companyId;
 
        private String connectionId;
 
        private String invoiceId;  
        
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
         * Unique identifier for an invoice.
         */
        public Builder invoiceId(String invoiceId) {
            Utils.checkNotNull(invoiceId, "invoiceId");
            this.invoiceId = invoiceId;
            return this;
        }
        
        public GetAccountingInvoiceAttachmentRequest build() {
            return new GetAccountingInvoiceAttachmentRequest(
                attachmentId,
                companyId,
                connectionId,
                invoiceId);
        }
    }
}

