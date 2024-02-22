/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class PushOptionProperty {

    /**
     * A description of the property.
     */
    @JsonProperty("description")
    private String description;

    /**
     * The property's display name.
     */
    @JsonProperty("displayName")
    private String displayName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    private JsonNullable<? extends java.util.List<PushOptionChoice>> options;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("properties")
    private JsonNullable<? extends java.util.Map<String, PushOptionProperty>> properties;

    /**
     * The property is required if `True`.
     */
    @JsonProperty("required")
    private boolean required;

    /**
     * The option type.
     */
    @JsonProperty("type")
    private PushOptionType type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("validation")
    private Optional<? extends PushValidationInfo> validation;

    public PushOptionProperty(
            @JsonProperty("description") String description,
            @JsonProperty("displayName") String displayName,
            @JsonProperty("options") JsonNullable<? extends java.util.List<PushOptionChoice>> options,
            @JsonProperty("properties") JsonNullable<? extends java.util.Map<String, PushOptionProperty>> properties,
            @JsonProperty("required") boolean required,
            @JsonProperty("type") PushOptionType type,
            @JsonProperty("validation") Optional<? extends PushValidationInfo> validation) {
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(displayName, "displayName");
        Utils.checkNotNull(options, "options");
        Utils.checkNotNull(properties, "properties");
        Utils.checkNotNull(required, "required");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(validation, "validation");
        this.description = description;
        this.displayName = displayName;
        this.options = options;
        this.properties = properties;
        this.required = required;
        this.type = type;
        this.validation = validation;
    }

    /**
     * A description of the property.
     */
    public String description() {
        return description;
    }

    /**
     * The property's display name.
     */
    public String displayName() {
        return displayName;
    }

    public JsonNullable<? extends java.util.List<PushOptionChoice>> options() {
        return options;
    }

    public JsonNullable<? extends java.util.Map<String, PushOptionProperty>> properties() {
        return properties;
    }

    /**
     * The property is required if `True`.
     */
    public boolean required() {
        return required;
    }

    /**
     * The option type.
     */
    public PushOptionType type() {
        return type;
    }

    public Optional<? extends PushValidationInfo> validation() {
        return validation;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A description of the property.
     */
    public PushOptionProperty withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * The property's display name.
     */
    public PushOptionProperty withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = displayName;
        return this;
    }

    public PushOptionProperty withOptions(java.util.List<PushOptionChoice> options) {
        Utils.checkNotNull(options, "options");
        this.options = JsonNullable.of(options);
        return this;
    }

    public PushOptionProperty withOptions(JsonNullable<? extends java.util.List<PushOptionChoice>> options) {
        Utils.checkNotNull(options, "options");
        this.options = options;
        return this;
    }

    public PushOptionProperty withProperties(java.util.Map<String, PushOptionProperty> properties) {
        Utils.checkNotNull(properties, "properties");
        this.properties = JsonNullable.of(properties);
        return this;
    }

    public PushOptionProperty withProperties(JsonNullable<? extends java.util.Map<String, PushOptionProperty>> properties) {
        Utils.checkNotNull(properties, "properties");
        this.properties = properties;
        return this;
    }

    /**
     * The property is required if `True`.
     */
    public PushOptionProperty withRequired(boolean required) {
        Utils.checkNotNull(required, "required");
        this.required = required;
        return this;
    }

    /**
     * The option type.
     */
    public PushOptionProperty withType(PushOptionType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public PushOptionProperty withValidation(PushValidationInfo validation) {
        Utils.checkNotNull(validation, "validation");
        this.validation = Optional.ofNullable(validation);
        return this;
    }
    
    public PushOptionProperty withValidation(Optional<? extends PushValidationInfo> validation) {
        Utils.checkNotNull(validation, "validation");
        this.validation = validation;
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
        PushOptionProperty other = (PushOptionProperty) o;
        return 
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.displayName, other.displayName) &&
            java.util.Objects.deepEquals(this.options, other.options) &&
            java.util.Objects.deepEquals(this.properties, other.properties) &&
            java.util.Objects.deepEquals(this.required, other.required) &&
            java.util.Objects.deepEquals(this.type, other.type) &&
            java.util.Objects.deepEquals(this.validation, other.validation);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            description,
            displayName,
            options,
            properties,
            required,
            type,
            validation);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PushOptionProperty.class,
                "description", description,
                "displayName", displayName,
                "options", options,
                "properties", properties,
                "required", required,
                "type", type,
                "validation", validation);
    }
    
    public final static class Builder {
 
        private String description;
 
        private String displayName;
 
        private JsonNullable<? extends java.util.List<PushOptionChoice>> options = JsonNullable.undefined();
 
        private JsonNullable<? extends java.util.Map<String, PushOptionProperty>> properties = JsonNullable.undefined();
 
        private Boolean required;
 
        private PushOptionType type;
 
        private Optional<? extends PushValidationInfo> validation = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A description of the property.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * The property's display name.
         */
        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
            return this;
        }

        public Builder options(java.util.List<PushOptionChoice> options) {
            Utils.checkNotNull(options, "options");
            this.options = JsonNullable.of(options);
            return this;
        }

        public Builder options(JsonNullable<? extends java.util.List<PushOptionChoice>> options) {
            Utils.checkNotNull(options, "options");
            this.options = options;
            return this;
        }

        public Builder properties(java.util.Map<String, PushOptionProperty> properties) {
            Utils.checkNotNull(properties, "properties");
            this.properties = JsonNullable.of(properties);
            return this;
        }

        public Builder properties(JsonNullable<? extends java.util.Map<String, PushOptionProperty>> properties) {
            Utils.checkNotNull(properties, "properties");
            this.properties = properties;
            return this;
        }

        /**
         * The property is required if `True`.
         */
        public Builder required(boolean required) {
            Utils.checkNotNull(required, "required");
            this.required = required;
            return this;
        }

        /**
         * The option type.
         */
        public Builder type(PushOptionType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder validation(PushValidationInfo validation) {
            Utils.checkNotNull(validation, "validation");
            this.validation = Optional.ofNullable(validation);
            return this;
        }
        
        public Builder validation(Optional<? extends PushValidationInfo> validation) {
            Utils.checkNotNull(validation, "validation");
            this.validation = validation;
            return this;
        }
        
        public PushOptionProperty build() {
            return new PushOptionProperty(
                description,
                displayName,
                options,
                properties,
                required,
                type,
                validation);
        }
    }
}

