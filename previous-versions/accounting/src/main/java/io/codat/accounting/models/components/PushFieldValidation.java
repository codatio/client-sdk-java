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


public class PushFieldValidation {

    /**
     * Details on the validation issue.
     */
    @JsonProperty("details")
    private String details;

    /**
     * Field name that resulted in the validation issue.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("field")
    private Optional<? extends String> field;

    /**
     * Unique reference identifier for the validation issue.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ref")
    private JsonNullable<? extends String> ref;

    public PushFieldValidation(
            @JsonProperty("details") String details,
            @JsonProperty("field") Optional<? extends String> field,
            @JsonProperty("ref") JsonNullable<? extends String> ref) {
        Utils.checkNotNull(details, "details");
        Utils.checkNotNull(field, "field");
        Utils.checkNotNull(ref, "ref");
        this.details = details;
        this.field = field;
        this.ref = ref;
    }

    /**
     * Details on the validation issue.
     */
    public String details() {
        return details;
    }

    /**
     * Field name that resulted in the validation issue.
     */
    public Optional<? extends String> field() {
        return field;
    }

    /**
     * Unique reference identifier for the validation issue.
     */
    public JsonNullable<? extends String> ref() {
        return ref;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Details on the validation issue.
     */
    public PushFieldValidation withDetails(String details) {
        Utils.checkNotNull(details, "details");
        this.details = details;
        return this;
    }

    /**
     * Field name that resulted in the validation issue.
     */
    public PushFieldValidation withField(String field) {
        Utils.checkNotNull(field, "field");
        this.field = Optional.ofNullable(field);
        return this;
    }
    
    /**
     * Field name that resulted in the validation issue.
     */
    public PushFieldValidation withField(Optional<? extends String> field) {
        Utils.checkNotNull(field, "field");
        this.field = field;
        return this;
    }

    /**
     * Unique reference identifier for the validation issue.
     */
    public PushFieldValidation withRef(String ref) {
        Utils.checkNotNull(ref, "ref");
        this.ref = JsonNullable.of(ref);
        return this;
    }

    /**
     * Unique reference identifier for the validation issue.
     */
    public PushFieldValidation withRef(JsonNullable<? extends String> ref) {
        Utils.checkNotNull(ref, "ref");
        this.ref = ref;
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
        PushFieldValidation other = (PushFieldValidation) o;
        return 
            java.util.Objects.deepEquals(this.details, other.details) &&
            java.util.Objects.deepEquals(this.field, other.field) &&
            java.util.Objects.deepEquals(this.ref, other.ref);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            details,
            field,
            ref);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PushFieldValidation.class,
                "details", details,
                "field", field,
                "ref", ref);
    }
    
    public final static class Builder {
 
        private String details;
 
        private Optional<? extends String> field = Optional.empty();
 
        private JsonNullable<? extends String> ref = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Details on the validation issue.
         */
        public Builder details(String details) {
            Utils.checkNotNull(details, "details");
            this.details = details;
            return this;
        }

        /**
         * Field name that resulted in the validation issue.
         */
        public Builder field(String field) {
            Utils.checkNotNull(field, "field");
            this.field = Optional.ofNullable(field);
            return this;
        }
        
        /**
         * Field name that resulted in the validation issue.
         */
        public Builder field(Optional<? extends String> field) {
            Utils.checkNotNull(field, "field");
            this.field = field;
            return this;
        }

        /**
         * Unique reference identifier for the validation issue.
         */
        public Builder ref(String ref) {
            Utils.checkNotNull(ref, "ref");
            this.ref = JsonNullable.of(ref);
            return this;
        }

        /**
         * Unique reference identifier for the validation issue.
         */
        public Builder ref(JsonNullable<? extends String> ref) {
            Utils.checkNotNull(ref, "ref");
            this.ref = ref;
            return this;
        }
        
        public PushFieldValidation build() {
            return new PushFieldValidation(
                details,
                field,
                ref);
        }
    }
}

