/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class PushOptionChoice {

    /**
     * A description of the property.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<? extends String> description;

    /**
     * The property's display name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("displayName")
    private Optional<? extends String> displayName;

    /**
     * The property is required if `True`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    private Optional<? extends Boolean> required;

    /**
     * The option type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends PushOptionType> type;

    /**
     * Allowed value for field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private Optional<? extends String> value;

    public PushOptionChoice(
            @JsonProperty("description") Optional<? extends String> description,
            @JsonProperty("displayName") Optional<? extends String> displayName,
            @JsonProperty("required") Optional<? extends Boolean> required,
            @JsonProperty("type") Optional<? extends PushOptionType> type,
            @JsonProperty("value") Optional<? extends String> value) {
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(displayName, "displayName");
        Utils.checkNotNull(required, "required");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(value, "value");
        this.description = description;
        this.displayName = displayName;
        this.required = required;
        this.type = type;
        this.value = value;
    }

    /**
     * A description of the property.
     */
    public Optional<? extends String> description() {
        return description;
    }

    /**
     * The property's display name.
     */
    public Optional<? extends String> displayName() {
        return displayName;
    }

    /**
     * The property is required if `True`.
     */
    public Optional<? extends Boolean> required() {
        return required;
    }

    /**
     * The option type.
     */
    public Optional<? extends PushOptionType> type() {
        return type;
    }

    /**
     * Allowed value for field.
     */
    public Optional<? extends String> value() {
        return value;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A description of the property.
     */
    public PushOptionChoice withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }
    
    /**
     * A description of the property.
     */
    public PushOptionChoice withDescription(Optional<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * The property's display name.
     */
    public PushOptionChoice withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = Optional.ofNullable(displayName);
        return this;
    }
    
    /**
     * The property's display name.
     */
    public PushOptionChoice withDisplayName(Optional<? extends String> displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = displayName;
        return this;
    }

    /**
     * The property is required if `True`.
     */
    public PushOptionChoice withRequired(boolean required) {
        Utils.checkNotNull(required, "required");
        this.required = Optional.ofNullable(required);
        return this;
    }
    
    /**
     * The property is required if `True`.
     */
    public PushOptionChoice withRequired(Optional<? extends Boolean> required) {
        Utils.checkNotNull(required, "required");
        this.required = required;
        return this;
    }

    /**
     * The option type.
     */
    public PushOptionChoice withType(PushOptionType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }
    
    /**
     * The option type.
     */
    public PushOptionChoice withType(Optional<? extends PushOptionType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Allowed value for field.
     */
    public PushOptionChoice withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = Optional.ofNullable(value);
        return this;
    }
    
    /**
     * Allowed value for field.
     */
    public PushOptionChoice withValue(Optional<? extends String> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        PushOptionChoice other = (PushOptionChoice) o;
        return 
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.displayName, other.displayName) &&
            java.util.Objects.deepEquals(this.required, other.required) &&
            java.util.Objects.deepEquals(this.type, other.type) &&
            java.util.Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            description,
            displayName,
            required,
            type,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PushOptionChoice.class,
                "description", description,
                "displayName", displayName,
                "required", required,
                "type", type,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> description = Optional.empty();
 
        private Optional<? extends String> displayName = Optional.empty();
 
        private Optional<? extends Boolean> required = Optional.empty();
 
        private Optional<? extends PushOptionType> type = Optional.empty();
 
        private Optional<? extends String> value = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A description of the property.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }
        
        /**
         * A description of the property.
         */
        public Builder description(Optional<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * The property's display name.
         */
        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = Optional.ofNullable(displayName);
            return this;
        }
        
        /**
         * The property's display name.
         */
        public Builder displayName(Optional<? extends String> displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
            return this;
        }

        /**
         * The property is required if `True`.
         */
        public Builder required(boolean required) {
            Utils.checkNotNull(required, "required");
            this.required = Optional.ofNullable(required);
            return this;
        }
        
        /**
         * The property is required if `True`.
         */
        public Builder required(Optional<? extends Boolean> required) {
            Utils.checkNotNull(required, "required");
            this.required = required;
            return this;
        }

        /**
         * The option type.
         */
        public Builder type(PushOptionType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }
        
        /**
         * The option type.
         */
        public Builder type(Optional<? extends PushOptionType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Allowed value for field.
         */
        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = Optional.ofNullable(value);
            return this;
        }
        
        /**
         * Allowed value for field.
         */
        public Builder value(Optional<? extends String> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public PushOptionChoice build() {
            return new PushOptionChoice(
                description,
                displayName,
                required,
                type,
                value);
        }
    }
}
