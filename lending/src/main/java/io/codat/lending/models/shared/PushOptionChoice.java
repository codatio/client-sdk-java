/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class PushOptionChoice {

    /**
     * A description of the property.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    /**
     * The property's display name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("displayName")
    private Optional<String> displayName;

    /**
     * The property is required if `True`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    private Optional<Boolean> required;

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
    private Optional<String> value;

    @JsonCreator
    public PushOptionChoice(
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("displayName") Optional<String> displayName,
            @JsonProperty("required") Optional<Boolean> required,
            @JsonProperty("type") Optional<? extends PushOptionType> type,
            @JsonProperty("value") Optional<String> value) {
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
    
    public PushOptionChoice() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * A description of the property.
     */
    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    /**
     * The property's display name.
     */
    @JsonIgnore
    public Optional<String> displayName() {
        return displayName;
    }

    /**
     * The property is required if `True`.
     */
    @JsonIgnore
    public Optional<Boolean> required() {
        return required;
    }

    /**
     * The option type.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PushOptionType> type() {
        return (Optional<PushOptionType>) type;
    }

    /**
     * Allowed value for field.
     */
    @JsonIgnore
    public Optional<String> value() {
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
    public PushOptionChoice withDescription(Optional<String> description) {
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
    public PushOptionChoice withDisplayName(Optional<String> displayName) {
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
    public PushOptionChoice withRequired(Optional<Boolean> required) {
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
    public PushOptionChoice withValue(Optional<String> value) {
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
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.displayName, other.displayName) &&
            Objects.deepEquals(this.required, other.required) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<String> description = Optional.empty();
 
        private Optional<String> displayName = Optional.empty();
 
        private Optional<Boolean> required = Optional.empty();
 
        private Optional<? extends PushOptionType> type = Optional.empty();
 
        private Optional<String> value = Optional.empty();  
        
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
        public Builder description(Optional<String> description) {
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
        public Builder displayName(Optional<String> displayName) {
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
        public Builder required(Optional<Boolean> required) {
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
        public Builder value(Optional<String> value) {
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

