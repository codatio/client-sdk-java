/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.banking.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.banking.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import org.openapitools.jackson.nullable.JsonNullable;


public class ErrorValidationItem {

    /**
     * Unique identifier for a validation item.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("itemId")
    private JsonNullable<? extends String> itemId;

    /**
     * A message outlining validation item's issue.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private JsonNullable<? extends String> message;

    /**
     * Name of validator.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("validatorName")
    private JsonNullable<? extends String> validatorName;

    public ErrorValidationItem(
            @JsonProperty("itemId") JsonNullable<? extends String> itemId,
            @JsonProperty("message") JsonNullable<? extends String> message,
            @JsonProperty("validatorName") JsonNullable<? extends String> validatorName) {
        Utils.checkNotNull(itemId, "itemId");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(validatorName, "validatorName");
        this.itemId = itemId;
        this.message = message;
        this.validatorName = validatorName;
    }

    /**
     * Unique identifier for a validation item.
     */
    public JsonNullable<? extends String> itemId() {
        return itemId;
    }

    /**
     * A message outlining validation item's issue.
     */
    public JsonNullable<? extends String> message() {
        return message;
    }

    /**
     * Name of validator.
     */
    public JsonNullable<? extends String> validatorName() {
        return validatorName;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a validation item.
     */
    public ErrorValidationItem withItemId(String itemId) {
        Utils.checkNotNull(itemId, "itemId");
        this.itemId = JsonNullable.of(itemId);
        return this;
    }

    /**
     * Unique identifier for a validation item.
     */
    public ErrorValidationItem withItemId(JsonNullable<? extends String> itemId) {
        Utils.checkNotNull(itemId, "itemId");
        this.itemId = itemId;
        return this;
    }

    /**
     * A message outlining validation item's issue.
     */
    public ErrorValidationItem withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = JsonNullable.of(message);
        return this;
    }

    /**
     * A message outlining validation item's issue.
     */
    public ErrorValidationItem withMessage(JsonNullable<? extends String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    /**
     * Name of validator.
     */
    public ErrorValidationItem withValidatorName(String validatorName) {
        Utils.checkNotNull(validatorName, "validatorName");
        this.validatorName = JsonNullable.of(validatorName);
        return this;
    }

    /**
     * Name of validator.
     */
    public ErrorValidationItem withValidatorName(JsonNullable<? extends String> validatorName) {
        Utils.checkNotNull(validatorName, "validatorName");
        this.validatorName = validatorName;
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
        ErrorValidationItem other = (ErrorValidationItem) o;
        return 
            java.util.Objects.deepEquals(this.itemId, other.itemId) &&
            java.util.Objects.deepEquals(this.message, other.message) &&
            java.util.Objects.deepEquals(this.validatorName, other.validatorName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            itemId,
            message,
            validatorName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ErrorValidationItem.class,
                "itemId", itemId,
                "message", message,
                "validatorName", validatorName);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends String> itemId = JsonNullable.undefined();
 
        private JsonNullable<? extends String> message = JsonNullable.undefined();
 
        private JsonNullable<? extends String> validatorName = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for a validation item.
         */
        public Builder itemId(String itemId) {
            Utils.checkNotNull(itemId, "itemId");
            this.itemId = JsonNullable.of(itemId);
            return this;
        }

        /**
         * Unique identifier for a validation item.
         */
        public Builder itemId(JsonNullable<? extends String> itemId) {
            Utils.checkNotNull(itemId, "itemId");
            this.itemId = itemId;
            return this;
        }

        /**
         * A message outlining validation item's issue.
         */
        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = JsonNullable.of(message);
            return this;
        }

        /**
         * A message outlining validation item's issue.
         */
        public Builder message(JsonNullable<? extends String> message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        /**
         * Name of validator.
         */
        public Builder validatorName(String validatorName) {
            Utils.checkNotNull(validatorName, "validatorName");
            this.validatorName = JsonNullable.of(validatorName);
            return this;
        }

        /**
         * Name of validator.
         */
        public Builder validatorName(JsonNullable<? extends String> validatorName) {
            Utils.checkNotNull(validatorName, "validatorName");
            this.validatorName = validatorName;
            return this;
        }
        
        public ErrorValidationItem build() {
            return new ErrorValidationItem(
                itemId,
                message,
                validatorName);
        }
    }
}
