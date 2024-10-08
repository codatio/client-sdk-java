/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.bank_feeds.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * BankAccountCredentials - Result of generate credentials
 */

public class BankAccountCredentials {

    /**
     * Password to enable the bank feeds platform to securely retrieve transactions.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<String> password;

    /**
     * Username used by the bank feeds platform to retrieve transactions
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("username")
    private Optional<String> username;

    @JsonCreator
    public BankAccountCredentials(
            @JsonProperty("password") Optional<String> password,
            @JsonProperty("username") Optional<String> username) {
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(username, "username");
        this.password = password;
        this.username = username;
    }
    
    public BankAccountCredentials() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Password to enable the bank feeds platform to securely retrieve transactions.
     */
    @JsonIgnore
    public Optional<String> password() {
        return password;
    }

    /**
     * Username used by the bank feeds platform to retrieve transactions
     */
    @JsonIgnore
    public Optional<String> username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Password to enable the bank feeds platform to securely retrieve transactions.
     */
    public BankAccountCredentials withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    /**
     * Password to enable the bank feeds platform to securely retrieve transactions.
     */
    public BankAccountCredentials withPassword(Optional<String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * Username used by the bank feeds platform to retrieve transactions
     */
    public BankAccountCredentials withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = Optional.ofNullable(username);
        return this;
    }

    /**
     * Username used by the bank feeds platform to retrieve transactions
     */
    public BankAccountCredentials withUsername(Optional<String> username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
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
        BankAccountCredentials other = (BankAccountCredentials) o;
        return 
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            password,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BankAccountCredentials.class,
                "password", password,
                "username", username);
    }
    
    public final static class Builder {
 
        private Optional<String> password = Optional.empty();
 
        private Optional<String> username = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Password to enable the bank feeds platform to securely retrieve transactions.
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        /**
         * Password to enable the bank feeds platform to securely retrieve transactions.
         */
        public Builder password(Optional<String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * Username used by the bank feeds platform to retrieve transactions
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = Optional.ofNullable(username);
            return this;
        }

        /**
         * Username used by the bank feeds platform to retrieve transactions
         */
        public Builder username(Optional<String> username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public BankAccountCredentials build() {
            return new BankAccountCredentials(
                password,
                username);
        }
    }
}

