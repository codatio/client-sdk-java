/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Validation - A human-readable object describing validation decisions Codat has made when pushing data into the platform. If a push has failed because of validation errors, they will be detailed here.
 */

public class Validation {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    private JsonNullable<? extends java.util.List<ValidationItem>> errors;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("warnings")
    private JsonNullable<? extends java.util.List<ValidationItem>> warnings;

    public Validation(
            @JsonProperty("errors") JsonNullable<? extends java.util.List<ValidationItem>> errors,
            @JsonProperty("warnings") JsonNullable<? extends java.util.List<ValidationItem>> warnings) {
        Utils.checkNotNull(errors, "errors");
        Utils.checkNotNull(warnings, "warnings");
        this.errors = errors;
        this.warnings = warnings;
    }

    public JsonNullable<? extends java.util.List<ValidationItem>> errors() {
        return errors;
    }

    public JsonNullable<? extends java.util.List<ValidationItem>> warnings() {
        return warnings;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public Validation withErrors(java.util.List<ValidationItem> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = JsonNullable.of(errors);
        return this;
    }

    public Validation withErrors(JsonNullable<? extends java.util.List<ValidationItem>> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = errors;
        return this;
    }

    public Validation withWarnings(java.util.List<ValidationItem> warnings) {
        Utils.checkNotNull(warnings, "warnings");
        this.warnings = JsonNullable.of(warnings);
        return this;
    }

    public Validation withWarnings(JsonNullable<? extends java.util.List<ValidationItem>> warnings) {
        Utils.checkNotNull(warnings, "warnings");
        this.warnings = warnings;
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
        Validation other = (Validation) o;
        return 
            java.util.Objects.deepEquals(this.errors, other.errors) &&
            java.util.Objects.deepEquals(this.warnings, other.warnings);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            errors,
            warnings);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Validation.class,
                "errors", errors,
                "warnings", warnings);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends java.util.List<ValidationItem>> errors = JsonNullable.undefined();
 
        private JsonNullable<? extends java.util.List<ValidationItem>> warnings = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder errors(java.util.List<ValidationItem> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = JsonNullable.of(errors);
            return this;
        }

        public Builder errors(JsonNullable<? extends java.util.List<ValidationItem>> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = errors;
            return this;
        }

        public Builder warnings(java.util.List<ValidationItem> warnings) {
            Utils.checkNotNull(warnings, "warnings");
            this.warnings = JsonNullable.of(warnings);
            return this;
        }

        public Builder warnings(JsonNullable<? extends java.util.List<ValidationItem>> warnings) {
            Utils.checkNotNull(warnings, "warnings");
            this.warnings = warnings;
            return this;
        }
        
        public Validation build() {
            return new Validation(
                errors,
                warnings);
        }
    }
}

