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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class ValidationItem {

    /**
     * Unique identifier for a validation item.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("itemId")
    private JsonNullable<String> itemId;

    /**
     * A message outlining validation item's issue.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private JsonNullable<String> message;

    /**
     * Name of validator.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("validatorName")
    private JsonNullable<String> validatorName;

    @JsonCreator
    public ValidationItem(
            @JsonProperty("itemId") JsonNullable<String> itemId,
            @JsonProperty("message") JsonNullable<String> message,
            @JsonProperty("validatorName") JsonNullable<String> validatorName) {
        Utils.checkNotNull(itemId, "itemId");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(validatorName, "validatorName");
        this.itemId = itemId;
        this.message = message;
        this.validatorName = validatorName;
    }
    
    public ValidationItem() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Unique identifier for a validation item.
     */
    @JsonIgnore
    public JsonNullable<String> itemId() {
        return itemId;
    }

    /**
     * A message outlining validation item's issue.
     */
    @JsonIgnore
    public JsonNullable<String> message() {
        return message;
    }

    /**
     * Name of validator.
     */
    @JsonIgnore
    public JsonNullable<String> validatorName() {
        return validatorName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a validation item.
     */
    public ValidationItem withItemId(String itemId) {
        Utils.checkNotNull(itemId, "itemId");
        this.itemId = JsonNullable.of(itemId);
        return this;
    }

    /**
     * Unique identifier for a validation item.
     */
    public ValidationItem withItemId(JsonNullable<String> itemId) {
        Utils.checkNotNull(itemId, "itemId");
        this.itemId = itemId;
        return this;
    }

    /**
     * A message outlining validation item's issue.
     */
    public ValidationItem withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = JsonNullable.of(message);
        return this;
    }

    /**
     * A message outlining validation item's issue.
     */
    public ValidationItem withMessage(JsonNullable<String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    /**
     * Name of validator.
     */
    public ValidationItem withValidatorName(String validatorName) {
        Utils.checkNotNull(validatorName, "validatorName");
        this.validatorName = JsonNullable.of(validatorName);
        return this;
    }

    /**
     * Name of validator.
     */
    public ValidationItem withValidatorName(JsonNullable<String> validatorName) {
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
        ValidationItem other = (ValidationItem) o;
        return 
            Objects.deepEquals(this.itemId, other.itemId) &&
            Objects.deepEquals(this.message, other.message) &&
            Objects.deepEquals(this.validatorName, other.validatorName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            itemId,
            message,
            validatorName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ValidationItem.class,
                "itemId", itemId,
                "message", message,
                "validatorName", validatorName);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> itemId = JsonNullable.undefined();
 
        private JsonNullable<String> message = JsonNullable.undefined();
 
        private JsonNullable<String> validatorName = JsonNullable.undefined();  
        
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
        public Builder itemId(JsonNullable<String> itemId) {
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
        public Builder message(JsonNullable<String> message) {
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
        public Builder validatorName(JsonNullable<String> validatorName) {
            Utils.checkNotNull(validatorName, "validatorName");
            this.validatorName = validatorName;
            return this;
        }
        
        public ValidationItem build() {
            return new ValidationItem(
                itemId,
                message,
                validatorName);
        }
    }
}

