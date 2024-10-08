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


public class DownloadAccountingDirectCostAttachmentRequest {

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
     * Unique identifier for a direct cost.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=directCostId")
    private String directCostId;

    @JsonCreator
    public DownloadAccountingDirectCostAttachmentRequest(
            String attachmentId,
            String companyId,
            String connectionId,
            String directCostId) {
        Utils.checkNotNull(attachmentId, "attachmentId");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(directCostId, "directCostId");
        this.attachmentId = attachmentId;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.directCostId = directCostId;
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
     * Unique identifier for a direct cost.
     */
    @JsonIgnore
    public String directCostId() {
        return directCostId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for an attachment.
     */
    public DownloadAccountingDirectCostAttachmentRequest withAttachmentId(String attachmentId) {
        Utils.checkNotNull(attachmentId, "attachmentId");
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public DownloadAccountingDirectCostAttachmentRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public DownloadAccountingDirectCostAttachmentRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for a direct cost.
     */
    public DownloadAccountingDirectCostAttachmentRequest withDirectCostId(String directCostId) {
        Utils.checkNotNull(directCostId, "directCostId");
        this.directCostId = directCostId;
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
        DownloadAccountingDirectCostAttachmentRequest other = (DownloadAccountingDirectCostAttachmentRequest) o;
        return 
            Objects.deepEquals(this.attachmentId, other.attachmentId) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.directCostId, other.directCostId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            attachmentId,
            companyId,
            connectionId,
            directCostId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DownloadAccountingDirectCostAttachmentRequest.class,
                "attachmentId", attachmentId,
                "companyId", companyId,
                "connectionId", connectionId,
                "directCostId", directCostId);
    }
    
    public final static class Builder {
 
        private String attachmentId;
 
        private String companyId;
 
        private String connectionId;
 
        private String directCostId;  
        
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
         * Unique identifier for a direct cost.
         */
        public Builder directCostId(String directCostId) {
            Utils.checkNotNull(directCostId, "directCostId");
            this.directCostId = directCostId;
            return this;
        }
        
        public DownloadAccountingDirectCostAttachmentRequest build() {
            return new DownloadAccountingDirectCostAttachmentRequest(
                attachmentId,
                companyId,
                connectionId,
                directCostId);
        }
    }
}

