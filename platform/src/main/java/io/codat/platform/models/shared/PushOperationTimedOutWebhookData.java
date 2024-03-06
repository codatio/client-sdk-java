/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class PushOperationTimedOutWebhookData {

    /**
     * Available data types
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataType")
    private Optional<? extends DataType> dataType;

    /**
     * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pushOperationGuid")
    private Optional<? extends String> pushOperationGuid;

    /**
     * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pushOperationKey")
    private Optional<? extends String> pushOperationKey;

    public PushOperationTimedOutWebhookData(
            @JsonProperty("dataType") Optional<? extends DataType> dataType,
            @JsonProperty("pushOperationGuid") Optional<? extends String> pushOperationGuid,
            @JsonProperty("pushOperationKey") Optional<? extends String> pushOperationKey) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(pushOperationGuid, "pushOperationGuid");
        Utils.checkNotNull(pushOperationKey, "pushOperationKey");
        this.dataType = dataType;
        this.pushOperationGuid = pushOperationGuid;
        this.pushOperationKey = pushOperationKey;
    }

    /**
     * Available data types
     */
    public Optional<? extends DataType> dataType() {
        return dataType;
    }

    /**
     * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
     */
    public Optional<? extends String> pushOperationGuid() {
        return pushOperationGuid;
    }

    /**
     * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
     */
    public Optional<? extends String> pushOperationKey() {
        return pushOperationKey;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Available data types
     */
    public PushOperationTimedOutWebhookData withDataType(DataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = Optional.ofNullable(dataType);
        return this;
    }

    /**
     * Available data types
     */
    public PushOperationTimedOutWebhookData withDataType(Optional<? extends DataType> dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
     */
    public PushOperationTimedOutWebhookData withPushOperationGuid(String pushOperationGuid) {
        Utils.checkNotNull(pushOperationGuid, "pushOperationGuid");
        this.pushOperationGuid = Optional.ofNullable(pushOperationGuid);
        return this;
    }

    /**
     * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
     */
    public PushOperationTimedOutWebhookData withPushOperationGuid(Optional<? extends String> pushOperationGuid) {
        Utils.checkNotNull(pushOperationGuid, "pushOperationGuid");
        this.pushOperationGuid = pushOperationGuid;
        return this;
    }

    /**
     * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
     */
    public PushOperationTimedOutWebhookData withPushOperationKey(String pushOperationKey) {
        Utils.checkNotNull(pushOperationKey, "pushOperationKey");
        this.pushOperationKey = Optional.ofNullable(pushOperationKey);
        return this;
    }

    /**
     * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
     */
    public PushOperationTimedOutWebhookData withPushOperationKey(Optional<? extends String> pushOperationKey) {
        Utils.checkNotNull(pushOperationKey, "pushOperationKey");
        this.pushOperationKey = pushOperationKey;
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
        PushOperationTimedOutWebhookData other = (PushOperationTimedOutWebhookData) o;
        return 
            java.util.Objects.deepEquals(this.dataType, other.dataType) &&
            java.util.Objects.deepEquals(this.pushOperationGuid, other.pushOperationGuid) &&
            java.util.Objects.deepEquals(this.pushOperationKey, other.pushOperationKey);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dataType,
            pushOperationGuid,
            pushOperationKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PushOperationTimedOutWebhookData.class,
                "dataType", dataType,
                "pushOperationGuid", pushOperationGuid,
                "pushOperationKey", pushOperationKey);
    }
    
    public final static class Builder {
 
        private Optional<? extends DataType> dataType = Optional.empty();
 
        private Optional<? extends String> pushOperationGuid = Optional.empty();
 
        private Optional<? extends String> pushOperationKey = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Available data types
         */
        public Builder dataType(DataType dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = Optional.ofNullable(dataType);
            return this;
        }

        /**
         * Available data types
         */
        public Builder dataType(Optional<? extends DataType> dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        /**
         * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
         */
        public Builder pushOperationGuid(String pushOperationGuid) {
            Utils.checkNotNull(pushOperationGuid, "pushOperationGuid");
            this.pushOperationGuid = Optional.ofNullable(pushOperationGuid);
            return this;
        }

        /**
         * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
         */
        public Builder pushOperationGuid(Optional<? extends String> pushOperationGuid) {
            Utils.checkNotNull(pushOperationGuid, "pushOperationGuid");
            this.pushOperationGuid = pushOperationGuid;
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
        
        public PushOperationTimedOutWebhookData build() {
            return new PushOperationTimedOutWebhookData(
                dataType,
                pushOperationGuid,
                pushOperationKey);
        }
    }
}

