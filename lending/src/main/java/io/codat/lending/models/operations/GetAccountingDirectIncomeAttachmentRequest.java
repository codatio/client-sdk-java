/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetAccountingDirectIncomeAttachmentRequest {

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
     * Unique identifier for a direct income.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=directIncomeId")
    private String directIncomeId;

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=timeoutInMinutes")
    private Optional<Integer> timeoutInMinutes;

    @JsonCreator
    public GetAccountingDirectIncomeAttachmentRequest(
            String attachmentId,
            String companyId,
            String connectionId,
            String directIncomeId,
            Optional<Integer> timeoutInMinutes) {
        Utils.checkNotNull(attachmentId, "attachmentId");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(directIncomeId, "directIncomeId");
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.attachmentId = attachmentId;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.directIncomeId = directIncomeId;
        this.timeoutInMinutes = timeoutInMinutes;
    }
    
    public GetAccountingDirectIncomeAttachmentRequest(
            String attachmentId,
            String companyId,
            String connectionId,
            String directIncomeId) {
        this(attachmentId, companyId, connectionId, directIncomeId, Optional.empty());
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
     * Unique identifier for a direct income.
     */
    @JsonIgnore
    public String directIncomeId() {
        return directIncomeId;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    @JsonIgnore
    public Optional<Integer> timeoutInMinutes() {
        return timeoutInMinutes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for an attachment.
     */
    public GetAccountingDirectIncomeAttachmentRequest withAttachmentId(String attachmentId) {
        Utils.checkNotNull(attachmentId, "attachmentId");
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public GetAccountingDirectIncomeAttachmentRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public GetAccountingDirectIncomeAttachmentRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for a direct income.
     */
    public GetAccountingDirectIncomeAttachmentRequest withDirectIncomeId(String directIncomeId) {
        Utils.checkNotNull(directIncomeId, "directIncomeId");
        this.directIncomeId = directIncomeId;
        return this;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public GetAccountingDirectIncomeAttachmentRequest withTimeoutInMinutes(int timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = Optional.ofNullable(timeoutInMinutes);
        return this;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public GetAccountingDirectIncomeAttachmentRequest withTimeoutInMinutes(Optional<Integer> timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = timeoutInMinutes;
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
        GetAccountingDirectIncomeAttachmentRequest other = (GetAccountingDirectIncomeAttachmentRequest) o;
        return 
            Objects.deepEquals(this.attachmentId, other.attachmentId) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.directIncomeId, other.directIncomeId) &&
            Objects.deepEquals(this.timeoutInMinutes, other.timeoutInMinutes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            attachmentId,
            companyId,
            connectionId,
            directIncomeId,
            timeoutInMinutes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingDirectIncomeAttachmentRequest.class,
                "attachmentId", attachmentId,
                "companyId", companyId,
                "connectionId", connectionId,
                "directIncomeId", directIncomeId,
                "timeoutInMinutes", timeoutInMinutes);
    }
    
    public final static class Builder {
 
        private String attachmentId;
 
        private String companyId;
 
        private String connectionId;
 
        private String directIncomeId;
 
        private Optional<Integer> timeoutInMinutes = Optional.empty();  
        
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
         * Unique identifier for a direct income.
         */
        public Builder directIncomeId(String directIncomeId) {
            Utils.checkNotNull(directIncomeId, "directIncomeId");
            this.directIncomeId = directIncomeId;
            return this;
        }

        /**
         * Time limit for the push operation to complete before it is timed out.
         */
        public Builder timeoutInMinutes(int timeoutInMinutes) {
            Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
            this.timeoutInMinutes = Optional.ofNullable(timeoutInMinutes);
            return this;
        }

        /**
         * Time limit for the push operation to complete before it is timed out.
         */
        public Builder timeoutInMinutes(Optional<Integer> timeoutInMinutes) {
            Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        
        public GetAccountingDirectIncomeAttachmentRequest build() {
            return new GetAccountingDirectIncomeAttachmentRequest(
                attachmentId,
                companyId,
                connectionId,
                directIncomeId,
                timeoutInMinutes);
        }
    }
}

