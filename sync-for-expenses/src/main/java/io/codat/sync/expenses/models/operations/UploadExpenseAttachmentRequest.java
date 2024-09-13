/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.sync.expenses.models.components.AttachmentUpload;
import io.codat.sync.expenses.utils.SpeakeasyMetadata;
import io.codat.sync.expenses.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class UploadExpenseAttachmentRequest {

    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    private Optional<? extends AttachmentUpload> attachmentUpload;

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for a sync.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=syncId")
    private String syncId;

    /**
     * The unique identifier for your SMB's transaction.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=transactionId")
    private String transactionId;

    @JsonCreator
    public UploadExpenseAttachmentRequest(
            Optional<? extends AttachmentUpload> attachmentUpload,
            String companyId,
            String syncId,
            String transactionId) {
        Utils.checkNotNull(attachmentUpload, "attachmentUpload");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(syncId, "syncId");
        Utils.checkNotNull(transactionId, "transactionId");
        this.attachmentUpload = attachmentUpload;
        this.companyId = companyId;
        this.syncId = syncId;
        this.transactionId = transactionId;
    }
    
    public UploadExpenseAttachmentRequest(
            String companyId,
            String syncId,
            String transactionId) {
        this(Optional.empty(), companyId, syncId, transactionId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AttachmentUpload> attachmentUpload() {
        return (Optional<AttachmentUpload>) attachmentUpload;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a sync.
     */
    @JsonIgnore
    public String syncId() {
        return syncId;
    }

    /**
     * The unique identifier for your SMB's transaction.
     */
    @JsonIgnore
    public String transactionId() {
        return transactionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UploadExpenseAttachmentRequest withAttachmentUpload(AttachmentUpload attachmentUpload) {
        Utils.checkNotNull(attachmentUpload, "attachmentUpload");
        this.attachmentUpload = Optional.ofNullable(attachmentUpload);
        return this;
    }

    public UploadExpenseAttachmentRequest withAttachmentUpload(Optional<? extends AttachmentUpload> attachmentUpload) {
        Utils.checkNotNull(attachmentUpload, "attachmentUpload");
        this.attachmentUpload = attachmentUpload;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public UploadExpenseAttachmentRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a sync.
     */
    public UploadExpenseAttachmentRequest withSyncId(String syncId) {
        Utils.checkNotNull(syncId, "syncId");
        this.syncId = syncId;
        return this;
    }

    /**
     * The unique identifier for your SMB's transaction.
     */
    public UploadExpenseAttachmentRequest withTransactionId(String transactionId) {
        Utils.checkNotNull(transactionId, "transactionId");
        this.transactionId = transactionId;
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
        UploadExpenseAttachmentRequest other = (UploadExpenseAttachmentRequest) o;
        return 
            Objects.deepEquals(this.attachmentUpload, other.attachmentUpload) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.syncId, other.syncId) &&
            Objects.deepEquals(this.transactionId, other.transactionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            attachmentUpload,
            companyId,
            syncId,
            transactionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UploadExpenseAttachmentRequest.class,
                "attachmentUpload", attachmentUpload,
                "companyId", companyId,
                "syncId", syncId,
                "transactionId", transactionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends AttachmentUpload> attachmentUpload = Optional.empty();
 
        private String companyId;
 
        private String syncId;
 
        private String transactionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder attachmentUpload(AttachmentUpload attachmentUpload) {
            Utils.checkNotNull(attachmentUpload, "attachmentUpload");
            this.attachmentUpload = Optional.ofNullable(attachmentUpload);
            return this;
        }

        public Builder attachmentUpload(Optional<? extends AttachmentUpload> attachmentUpload) {
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
         * Unique identifier for a sync.
         */
        public Builder syncId(String syncId) {
            Utils.checkNotNull(syncId, "syncId");
            this.syncId = syncId;
            return this;
        }

        /**
         * The unique identifier for your SMB's transaction.
         */
        public Builder transactionId(String transactionId) {
            Utils.checkNotNull(transactionId, "transactionId");
            this.transactionId = transactionId;
            return this;
        }
        
        public UploadExpenseAttachmentRequest build() {
            return new UploadExpenseAttachmentRequest(
                attachmentUpload,
                companyId,
                syncId,
                transactionId);
        }
    }
}

