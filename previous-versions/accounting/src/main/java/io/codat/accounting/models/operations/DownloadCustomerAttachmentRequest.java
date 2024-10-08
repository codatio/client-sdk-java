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


public class DownloadCustomerAttachmentRequest {

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
     * Unique identifier for a customer.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=customerId")
    private String customerId;

    @JsonCreator
    public DownloadCustomerAttachmentRequest(
            String attachmentId,
            String companyId,
            String connectionId,
            String customerId) {
        Utils.checkNotNull(attachmentId, "attachmentId");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(customerId, "customerId");
        this.attachmentId = attachmentId;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.customerId = customerId;
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
     * Unique identifier for a customer.
     */
    @JsonIgnore
    public String customerId() {
        return customerId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for an attachment.
     */
    public DownloadCustomerAttachmentRequest withAttachmentId(String attachmentId) {
        Utils.checkNotNull(attachmentId, "attachmentId");
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public DownloadCustomerAttachmentRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public DownloadCustomerAttachmentRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for a customer.
     */
    public DownloadCustomerAttachmentRequest withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
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
        DownloadCustomerAttachmentRequest other = (DownloadCustomerAttachmentRequest) o;
        return 
            Objects.deepEquals(this.attachmentId, other.attachmentId) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.customerId, other.customerId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            attachmentId,
            companyId,
            connectionId,
            customerId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DownloadCustomerAttachmentRequest.class,
                "attachmentId", attachmentId,
                "companyId", companyId,
                "connectionId", connectionId,
                "customerId", customerId);
    }
    
    public final static class Builder {
 
        private String attachmentId;
 
        private String companyId;
 
        private String connectionId;
 
        private String customerId;  
        
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
         * Unique identifier for a customer.
         */
        public Builder customerId(String customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = customerId;
            return this;
        }
        
        public DownloadCustomerAttachmentRequest build() {
            return new DownloadCustomerAttachmentRequest(
                attachmentId,
                companyId,
                connectionId,
                customerId);
        }
    }
}

