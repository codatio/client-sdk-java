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
import java.util.Optional;


public class Phone {

    /**
     * A phone number.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("number")
    private Optional<? extends String> number;

    /**
     * The type of phone number
     */
    @JsonProperty("type")
    private PhoneNumberType type;

    public Phone(
            @JsonProperty("number") Optional<? extends String> number,
            @JsonProperty("type") PhoneNumberType type) {
        Utils.checkNotNull(number, "number");
        Utils.checkNotNull(type, "type");
        this.number = number;
        this.type = type;
    }

    /**
     * A phone number.
     */
    public Optional<? extends String> number() {
        return number;
    }

    /**
     * The type of phone number
     */
    public PhoneNumberType type() {
        return type;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A phone number.
     */
    public Phone withNumber(String number) {
        Utils.checkNotNull(number, "number");
        this.number = Optional.ofNullable(number);
        return this;
    }
    
    /**
     * A phone number.
     */
    public Phone withNumber(Optional<? extends String> number) {
        Utils.checkNotNull(number, "number");
        this.number = number;
        return this;
    }

    /**
     * The type of phone number
     */
    public Phone withType(PhoneNumberType type) {
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
        Phone other = (Phone) o;
        return 
            java.util.Objects.deepEquals(this.number, other.number) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            number,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Phone.class,
                "number", number,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> number = Optional.empty();
 
        private PhoneNumberType type;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A phone number.
         */
        public Builder number(String number) {
            Utils.checkNotNull(number, "number");
            this.number = Optional.ofNullable(number);
            return this;
        }
        
        /**
         * A phone number.
         */
        public Builder number(Optional<? extends String> number) {
            Utils.checkNotNull(number, "number");
            this.number = number;
            return this;
        }

        /**
         * The type of phone number
         */
        public Builder type(PhoneNumberType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public Phone build() {
            return new Phone(
                number,
                type);
        }
    }
}

