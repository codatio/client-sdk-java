/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.commerce.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class Localization {

    /**
     * `True` if required.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    private Optional<? extends Boolean> required;

    /**
     * Value of the property.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text")
    private JsonNullable<? extends String> text;

    public Localization(
            @JsonProperty("required") Optional<? extends Boolean> required,
            @JsonProperty("text") JsonNullable<? extends String> text) {
        Utils.checkNotNull(required, "required");
        Utils.checkNotNull(text, "text");
        this.required = required;
        this.text = text;
    }

    /**
     * `True` if required.
     */
    public Optional<? extends Boolean> required() {
        return required;
    }

    /**
     * Value of the property.
     */
    public JsonNullable<? extends String> text() {
        return text;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * `True` if required.
     */
    public Localization withRequired(boolean required) {
        Utils.checkNotNull(required, "required");
        this.required = Optional.ofNullable(required);
        return this;
    }
    
    /**
     * `True` if required.
     */
    public Localization withRequired(Optional<? extends Boolean> required) {
        Utils.checkNotNull(required, "required");
        this.required = required;
        return this;
    }

    /**
     * Value of the property.
     */
    public Localization withText(String text) {
        Utils.checkNotNull(text, "text");
        this.text = JsonNullable.of(text);
        return this;
    }

    /**
     * Value of the property.
     */
    public Localization withText(JsonNullable<? extends String> text) {
        Utils.checkNotNull(text, "text");
        this.text = text;
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
        Localization other = (Localization) o;
        return 
            java.util.Objects.deepEquals(this.required, other.required) &&
            java.util.Objects.deepEquals(this.text, other.text);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            required,
            text);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Localization.class,
                "required", required,
                "text", text);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> required = Optional.empty();
 
        private JsonNullable<? extends String> text = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * `True` if required.
         */
        public Builder required(boolean required) {
            Utils.checkNotNull(required, "required");
            this.required = Optional.ofNullable(required);
            return this;
        }
        
        /**
         * `True` if required.
         */
        public Builder required(Optional<? extends Boolean> required) {
            Utils.checkNotNull(required, "required");
            this.required = required;
            return this;
        }

        /**
         * Value of the property.
         */
        public Builder text(String text) {
            Utils.checkNotNull(text, "text");
            this.text = JsonNullable.of(text);
            return this;
        }

        /**
         * Value of the property.
         */
        public Builder text(JsonNullable<? extends String> text) {
            Utils.checkNotNull(text, "text");
            this.text = text;
            return this;
        }
        
        public Localization build() {
            return new Localization(
                required,
                text);
        }
    }
}

