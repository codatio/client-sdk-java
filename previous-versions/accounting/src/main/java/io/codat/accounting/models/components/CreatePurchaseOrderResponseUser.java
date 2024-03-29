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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CreatePurchaseOrderResponseUser - The user who created the purchase order in the accounting system
 */

public class CreatePurchaseOrderResponseUser {

    /**
     * Email address of the user.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private JsonNullable<? extends String> email;

    /**
     * First name of the user.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("firstName")
    private JsonNullable<? extends String> firstName;

    /**
     * Last name of the user.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastName")
    private JsonNullable<? extends String> lastName;

    public CreatePurchaseOrderResponseUser(
            @JsonProperty("email") JsonNullable<? extends String> email,
            @JsonProperty("firstName") JsonNullable<? extends String> firstName,
            @JsonProperty("lastName") JsonNullable<? extends String> lastName) {
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Email address of the user.
     */
    public JsonNullable<? extends String> email() {
        return email;
    }

    /**
     * First name of the user.
     */
    public JsonNullable<? extends String> firstName() {
        return firstName;
    }

    /**
     * Last name of the user.
     */
    public JsonNullable<? extends String> lastName() {
        return lastName;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Email address of the user.
     */
    public CreatePurchaseOrderResponseUser withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = JsonNullable.of(email);
        return this;
    }

    /**
     * Email address of the user.
     */
    public CreatePurchaseOrderResponseUser withEmail(JsonNullable<? extends String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * First name of the user.
     */
    public CreatePurchaseOrderResponseUser withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = JsonNullable.of(firstName);
        return this;
    }

    /**
     * First name of the user.
     */
    public CreatePurchaseOrderResponseUser withFirstName(JsonNullable<? extends String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    /**
     * Last name of the user.
     */
    public CreatePurchaseOrderResponseUser withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = JsonNullable.of(lastName);
        return this;
    }

    /**
     * Last name of the user.
     */
    public CreatePurchaseOrderResponseUser withLastName(JsonNullable<? extends String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
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
        CreatePurchaseOrderResponseUser other = (CreatePurchaseOrderResponseUser) o;
        return 
            java.util.Objects.deepEquals(this.email, other.email) &&
            java.util.Objects.deepEquals(this.firstName, other.firstName) &&
            java.util.Objects.deepEquals(this.lastName, other.lastName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            email,
            firstName,
            lastName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreatePurchaseOrderResponseUser.class,
                "email", email,
                "firstName", firstName,
                "lastName", lastName);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends String> email = JsonNullable.undefined();
 
        private JsonNullable<? extends String> firstName = JsonNullable.undefined();
 
        private JsonNullable<? extends String> lastName = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Email address of the user.
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = JsonNullable.of(email);
            return this;
        }

        /**
         * Email address of the user.
         */
        public Builder email(JsonNullable<? extends String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * First name of the user.
         */
        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = JsonNullable.of(firstName);
            return this;
        }

        /**
         * First name of the user.
         */
        public Builder firstName(JsonNullable<? extends String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        /**
         * Last name of the user.
         */
        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = JsonNullable.of(lastName);
            return this;
        }

        /**
         * Last name of the user.
         */
        public Builder lastName(JsonNullable<? extends String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }
        
        public CreatePurchaseOrderResponseUser build() {
            return new CreatePurchaseOrderResponseUser(
                email,
                firstName,
                lastName);
        }
    }
}

