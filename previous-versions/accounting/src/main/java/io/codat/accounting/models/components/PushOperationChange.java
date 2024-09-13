/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.accounting.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class PushOperationChange {

    /**
     * Unique identifier for the attachment created otherwise null.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attachmentId")
    private JsonNullable<String> attachmentId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("recordRef")
    private Optional<? extends PushOperationRef> recordRef;

    /**
     * Type of change being applied to record in third party platform.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends PushChangeType> type;

    @JsonCreator
    public PushOperationChange(
            @JsonProperty("attachmentId") JsonNullable<String> attachmentId,
            @JsonProperty("recordRef") Optional<? extends PushOperationRef> recordRef,
            @JsonProperty("type") Optional<? extends PushChangeType> type) {
        Utils.checkNotNull(attachmentId, "attachmentId");
        Utils.checkNotNull(recordRef, "recordRef");
        Utils.checkNotNull(type, "type");
        this.attachmentId = attachmentId;
        this.recordRef = recordRef;
        this.type = type;
    }
    
    public PushOperationChange() {
        this(JsonNullable.undefined(), Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier for the attachment created otherwise null.
     */
    @JsonIgnore
    public JsonNullable<String> attachmentId() {
        return attachmentId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PushOperationRef> recordRef() {
        return (Optional<PushOperationRef>) recordRef;
    }

    /**
     * Type of change being applied to record in third party platform.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PushChangeType> type() {
        return (Optional<PushChangeType>) type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for the attachment created otherwise null.
     */
    public PushOperationChange withAttachmentId(String attachmentId) {
        Utils.checkNotNull(attachmentId, "attachmentId");
        this.attachmentId = JsonNullable.of(attachmentId);
        return this;
    }

    /**
     * Unique identifier for the attachment created otherwise null.
     */
    public PushOperationChange withAttachmentId(JsonNullable<String> attachmentId) {
        Utils.checkNotNull(attachmentId, "attachmentId");
        this.attachmentId = attachmentId;
        return this;
    }

    public PushOperationChange withRecordRef(PushOperationRef recordRef) {
        Utils.checkNotNull(recordRef, "recordRef");
        this.recordRef = Optional.ofNullable(recordRef);
        return this;
    }

    public PushOperationChange withRecordRef(Optional<? extends PushOperationRef> recordRef) {
        Utils.checkNotNull(recordRef, "recordRef");
        this.recordRef = recordRef;
        return this;
    }

    /**
     * Type of change being applied to record in third party platform.
     */
    public PushOperationChange withType(PushChangeType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Type of change being applied to record in third party platform.
     */
    public PushOperationChange withType(Optional<? extends PushChangeType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        PushOperationChange other = (PushOperationChange) o;
        return 
            Objects.deepEquals(this.attachmentId, other.attachmentId) &&
            Objects.deepEquals(this.recordRef, other.recordRef) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            attachmentId,
            recordRef,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PushOperationChange.class,
                "attachmentId", attachmentId,
                "recordRef", recordRef,
                "type", type);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> attachmentId = JsonNullable.undefined();
 
        private Optional<? extends PushOperationRef> recordRef = Optional.empty();
 
        private Optional<? extends PushChangeType> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for the attachment created otherwise null.
         */
        public Builder attachmentId(String attachmentId) {
            Utils.checkNotNull(attachmentId, "attachmentId");
            this.attachmentId = JsonNullable.of(attachmentId);
            return this;
        }

        /**
         * Unique identifier for the attachment created otherwise null.
         */
        public Builder attachmentId(JsonNullable<String> attachmentId) {
            Utils.checkNotNull(attachmentId, "attachmentId");
            this.attachmentId = attachmentId;
            return this;
        }

        public Builder recordRef(PushOperationRef recordRef) {
            Utils.checkNotNull(recordRef, "recordRef");
            this.recordRef = Optional.ofNullable(recordRef);
            return this;
        }

        public Builder recordRef(Optional<? extends PushOperationRef> recordRef) {
            Utils.checkNotNull(recordRef, "recordRef");
            this.recordRef = recordRef;
            return this;
        }

        /**
         * Type of change being applied to record in third party platform.
         */
        public Builder type(PushChangeType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * Type of change being applied to record in third party platform.
         */
        public Builder type(Optional<? extends PushChangeType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public PushOperationChange build() {
            return new PushOperationChange(
                attachmentId,
                recordRef,
                type);
        }
    }
}

