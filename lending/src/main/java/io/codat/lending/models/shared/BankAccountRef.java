/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;

/**
 * BankAccountRef - Links to the Account transactions data type.
 */

public class BankAccountRef {

    /**
     * Bank account 'id' for the account transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    /**
     * bank account 'name' for the account transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    public BankAccountRef(
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("name") Optional<? extends String> name) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        this.id = id;
        this.name = name;
    }

    /**
     * Bank account 'id' for the account transaction.
     */
    public Optional<? extends String> id() {
        return id;
    }

    /**
     * bank account 'name' for the account transaction.
     */
    public Optional<? extends String> name() {
        return name;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Bank account 'id' for the account transaction.
     */
    public BankAccountRef withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }
    
    /**
     * Bank account 'id' for the account transaction.
     */
    public BankAccountRef withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * bank account 'name' for the account transaction.
     */
    public BankAccountRef withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }
    
    /**
     * bank account 'name' for the account transaction.
     */
    public BankAccountRef withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        BankAccountRef other = (BankAccountRef) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BankAccountRef.class,
                "id", id,
                "name", name);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends String> name = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Bank account 'id' for the account transaction.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }
        
        /**
         * Bank account 'id' for the account transaction.
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * bank account 'name' for the account transaction.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }
        
        /**
         * bank account 'name' for the account transaction.
         */
        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public BankAccountRef build() {
            return new BankAccountRef(
                id,
                name);
        }
    }
}

