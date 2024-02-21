/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;


public class GetAccountingBillAttachmentRequest {

    /**
     * Unique identifier for an attachment.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=attachmentId")
    private String attachmentId;

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

    public GetAccountingBillAttachmentRequest(
            String attachmentId,
            String billId,
            String companyId,
            String connectionId) {
        Utils.checkNotNull(attachmentId, "attachmentId");
        Utils.checkNotNull(billId, "billId");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        this.attachmentId = attachmentId;
        this.billId = billId;
        this.companyId = companyId;
        this.connectionId = connectionId;
    }

    /**
     * Unique identifier for an attachment.
     */
    public String attachmentId() {
        return attachmentId;
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

    /**
     * Unique identifier for an attachment.
     */
    public GetAccountingBillAttachmentRequest withAttachmentId(String attachmentId) {
        Utils.checkNotNull(attachmentId, "attachmentId");
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * Unique identifier for a bill.
     */
    public GetAccountingBillAttachmentRequest withBillId(String billId) {
        Utils.checkNotNull(billId, "billId");
        this.billId = billId;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public GetAccountingBillAttachmentRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public GetAccountingBillAttachmentRequest withConnectionId(String connectionId) {
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
        GetAccountingBillAttachmentRequest other = (GetAccountingBillAttachmentRequest) o;
        return 
            java.util.Objects.deepEquals(this.attachmentId, other.attachmentId) &&
            java.util.Objects.deepEquals(this.billId, other.billId) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            attachmentId,
            billId,
            companyId,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingBillAttachmentRequest.class,
                "attachmentId", attachmentId,
                "billId", billId,
                "companyId", companyId,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private String attachmentId;
 
        private String billId;
 
        private String companyId;
 
        private String connectionId;  
        
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
        
        public GetAccountingBillAttachmentRequest build() {
            return new GetAccountingBillAttachmentRequest(
                attachmentId,
                billId,
                companyId,
                connectionId);
        }
    }
}
