/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.util.Optional;


public class PushOperationStatusChangedWebhookData {

    /**
     * Available Data types
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataType")
    private Optional<? extends DataType> dataType;

    /**
     * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pushOperationKey")
    private Optional<? extends String> pushOperationKey;

    /**
     * The current status of the push operation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends PushOperationStatus> status;

    public PushOperationStatusChangedWebhookData(
            @JsonProperty("dataType") Optional<? extends DataType> dataType,
            @JsonProperty("pushOperationKey") Optional<? extends String> pushOperationKey,
            @JsonProperty("status") Optional<? extends PushOperationStatus> status) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(pushOperationKey, "pushOperationKey");
        Utils.checkNotNull(status, "status");
        this.dataType = dataType;
        this.pushOperationKey = pushOperationKey;
        this.status = status;
    }

    /**
     * Available Data types
     */
    public Optional<? extends DataType> dataType() {
        return dataType;
    }

    /**
     * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
     */
    public Optional<? extends String> pushOperationKey() {
        return pushOperationKey;
    }

    /**
     * The current status of the push operation.
     */
    public Optional<? extends PushOperationStatus> status() {
        return status;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Available Data types
     */
    public PushOperationStatusChangedWebhookData withDataType(DataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = Optional.ofNullable(dataType);
        return this;
    }
    
    /**
     * Available Data types
     */
    public PushOperationStatusChangedWebhookData withDataType(Optional<? extends DataType> dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
     */
    public PushOperationStatusChangedWebhookData withPushOperationKey(String pushOperationKey) {
        Utils.checkNotNull(pushOperationKey, "pushOperationKey");
        this.pushOperationKey = Optional.ofNullable(pushOperationKey);
        return this;
    }
    
    /**
     * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
     */
    public PushOperationStatusChangedWebhookData withPushOperationKey(Optional<? extends String> pushOperationKey) {
        Utils.checkNotNull(pushOperationKey, "pushOperationKey");
        this.pushOperationKey = pushOperationKey;
        return this;
    }

    /**
     * The current status of the push operation.
     */
    public PushOperationStatusChangedWebhookData withStatus(PushOperationStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }
    
    /**
     * The current status of the push operation.
     */
    public PushOperationStatusChangedWebhookData withStatus(Optional<? extends PushOperationStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        PushOperationStatusChangedWebhookData other = (PushOperationStatusChangedWebhookData) o;
        return 
            java.util.Objects.deepEquals(this.dataType, other.dataType) &&
            java.util.Objects.deepEquals(this.pushOperationKey, other.pushOperationKey) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dataType,
            pushOperationKey,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PushOperationStatusChangedWebhookData.class,
                "dataType", dataType,
                "pushOperationKey", pushOperationKey,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends DataType> dataType = Optional.empty();
 
        private Optional<? extends String> pushOperationKey = Optional.empty();
 
        private Optional<? extends PushOperationStatus> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Available Data types
         */
        public Builder dataType(DataType dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = Optional.ofNullable(dataType);
            return this;
        }
        
        /**
         * Available Data types
         */
        public Builder dataType(Optional<? extends DataType> dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        /**
         * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
         */
        public Builder pushOperationKey(String pushOperationKey) {
            Utils.checkNotNull(pushOperationKey, "pushOperationKey");
            this.pushOperationKey = Optional.ofNullable(pushOperationKey);
            return this;
        }
        
        /**
         * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
         */
        public Builder pushOperationKey(Optional<? extends String> pushOperationKey) {
            Utils.checkNotNull(pushOperationKey, "pushOperationKey");
            this.pushOperationKey = pushOperationKey;
            return this;
        }

        /**
         * The current status of the push operation.
         */
        public Builder status(PushOperationStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }
        
        /**
         * The current status of the push operation.
         */
        public Builder status(Optional<? extends PushOperationStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }        
        
        public PushOperationStatusChangedWebhookData build() {
            return new PushOperationStatusChangedWebhookData(
                dataType,
                pushOperationKey,
                status);
        }
    }
}

