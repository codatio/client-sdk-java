/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payables.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.sync.payables.utils.SpeakeasyMetadata;
import io.codat.sync.payables.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DownloadBillAttachmentRequest {

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

    @JsonCreator
    public DownloadBillAttachmentRequest(
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
    @JsonIgnore
    public String attachmentId() {
        return attachmentId;
    }

    /**
     * Unique identifier for a bill.
     */
    @JsonIgnore
    public String billId() {
        return billId;
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
     * Unique identifier for an attachment.
     */
    public DownloadBillAttachmentRequest withAttachmentId(String attachmentId) {
        Utils.checkNotNull(attachmentId, "attachmentId");
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * Unique identifier for a bill.
     */
    public DownloadBillAttachmentRequest withBillId(String billId) {
        Utils.checkNotNull(billId, "billId");
        this.billId = billId;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public DownloadBillAttachmentRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public DownloadBillAttachmentRequest withConnectionId(String connectionId) {
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
        DownloadBillAttachmentRequest other = (DownloadBillAttachmentRequest) o;
        return 
            Objects.deepEquals(this.attachmentId, other.attachmentId) &&
            Objects.deepEquals(this.billId, other.billId) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            attachmentId,
            billId,
            companyId,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DownloadBillAttachmentRequest.class,
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
        
        public DownloadBillAttachmentRequest build() {
            return new DownloadBillAttachmentRequest(
                attachmentId,
                billId,
                companyId,
                connectionId);
        }
    }
}

