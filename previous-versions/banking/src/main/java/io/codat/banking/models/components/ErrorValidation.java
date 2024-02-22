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

/**
 * ErrorValidation - A human-readable object describing validation decisions Codat has made. If an operation has failed because of validation errors, they will be detailed here.
 */

public class ErrorValidation {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    private JsonNullable<? extends java.util.List<ErrorValidationItem>> errors;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("warnings")
    private JsonNullable<? extends java.util.List<ErrorValidationItem>> warnings;

    public ErrorValidation(
            @JsonProperty("errors") JsonNullable<? extends java.util.List<ErrorValidationItem>> errors,
            @JsonProperty("warnings") JsonNullable<? extends java.util.List<ErrorValidationItem>> warnings) {
        Utils.checkNotNull(errors, "errors");
        Utils.checkNotNull(warnings, "warnings");
        this.errors = errors;
        this.warnings = warnings;
    }

    public JsonNullable<? extends java.util.List<ErrorValidationItem>> errors() {
        return errors;
    }

    public JsonNullable<? extends java.util.List<ErrorValidationItem>> warnings() {
        return warnings;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public ErrorValidation withErrors(java.util.List<ErrorValidationItem> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = JsonNullable.of(errors);
        return this;
    }

    public ErrorValidation withErrors(JsonNullable<? extends java.util.List<ErrorValidationItem>> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = errors;
        return this;
    }

    public ErrorValidation withWarnings(java.util.List<ErrorValidationItem> warnings) {
        Utils.checkNotNull(warnings, "warnings");
        this.warnings = JsonNullable.of(warnings);
        return this;
    }

    public ErrorValidation withWarnings(JsonNullable<? extends java.util.List<ErrorValidationItem>> warnings) {
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
        ErrorValidation other = (ErrorValidation) o;
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
        return Utils.toString(ErrorValidation.class,
                "errors", errors,
                "warnings", warnings);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends java.util.List<ErrorValidationItem>> errors = JsonNullable.undefined();
 
        private JsonNullable<? extends java.util.List<ErrorValidationItem>> warnings = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder errors(java.util.List<ErrorValidationItem> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = JsonNullable.of(errors);
            return this;
        }

        public Builder errors(JsonNullable<? extends java.util.List<ErrorValidationItem>> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = errors;
            return this;
        }

        public Builder warnings(java.util.List<ErrorValidationItem> warnings) {
            Utils.checkNotNull(warnings, "warnings");
            this.warnings = JsonNullable.of(warnings);
            return this;
        }

        public Builder warnings(JsonNullable<? extends java.util.List<ErrorValidationItem>> warnings) {
            Utils.checkNotNull(warnings, "warnings");
            this.warnings = warnings;
            return this;
        }
        
        public ErrorValidation build() {
            return new ErrorValidation(
                errors,
                warnings);
        }
    }
}

