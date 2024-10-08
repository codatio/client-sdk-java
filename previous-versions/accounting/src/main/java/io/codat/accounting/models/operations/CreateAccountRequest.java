/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.accounting.models.components.AccountPrototype;
import io.codat.accounting.utils.SpeakeasyMetadata;
import io.codat.accounting.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateAccountRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends AccountPrototype> accountPrototype;

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for a connection.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connectionId")
    private String connectionId;

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=timeoutInMinutes")
    private Optional<Integer> timeoutInMinutes;

    @JsonCreator
    public CreateAccountRequest(
            Optional<? extends AccountPrototype> accountPrototype,
            String companyId,
            String connectionId,
            Optional<Integer> timeoutInMinutes) {
        Utils.checkNotNull(accountPrototype, "accountPrototype");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.accountPrototype = accountPrototype;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.timeoutInMinutes = timeoutInMinutes;
    }
    
    public CreateAccountRequest(
            String companyId,
            String connectionId) {
        this(Optional.empty(), companyId, connectionId, Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountPrototype> accountPrototype() {
        return (Optional<AccountPrototype>) accountPrototype;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a connection.
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    @JsonIgnore
    public Optional<Integer> timeoutInMinutes() {
        return timeoutInMinutes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateAccountRequest withAccountPrototype(AccountPrototype accountPrototype) {
        Utils.checkNotNull(accountPrototype, "accountPrototype");
        this.accountPrototype = Optional.ofNullable(accountPrototype);
        return this;
    }

    public CreateAccountRequest withAccountPrototype(Optional<? extends AccountPrototype> accountPrototype) {
        Utils.checkNotNull(accountPrototype, "accountPrototype");
        this.accountPrototype = accountPrototype;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public CreateAccountRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public CreateAccountRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public CreateAccountRequest withTimeoutInMinutes(int timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = Optional.ofNullable(timeoutInMinutes);
        return this;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public CreateAccountRequest withTimeoutInMinutes(Optional<Integer> timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = timeoutInMinutes;
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
        CreateAccountRequest other = (CreateAccountRequest) o;
        return 
            Objects.deepEquals(this.accountPrototype, other.accountPrototype) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.timeoutInMinutes, other.timeoutInMinutes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountPrototype,
            companyId,
            connectionId,
            timeoutInMinutes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateAccountRequest.class,
                "accountPrototype", accountPrototype,
                "companyId", companyId,
                "connectionId", connectionId,
                "timeoutInMinutes", timeoutInMinutes);
    }
    
    public final static class Builder {
 
        private Optional<? extends AccountPrototype> accountPrototype = Optional.empty();
 
        private String companyId;
 
        private String connectionId;
 
        private Optional<Integer> timeoutInMinutes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountPrototype(AccountPrototype accountPrototype) {
            Utils.checkNotNull(accountPrototype, "accountPrototype");
            this.accountPrototype = Optional.ofNullable(accountPrototype);
            return this;
        }

        public Builder accountPrototype(Optional<? extends AccountPrototype> accountPrototype) {
            Utils.checkNotNull(accountPrototype, "accountPrototype");
            this.accountPrototype = accountPrototype;
            return this;
        }

        /**
         * Unique identifier for a company.
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        /**
         * Unique identifier for a connection.
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Time limit for the push operation to complete before it is timed out.
         */
        public Builder timeoutInMinutes(int timeoutInMinutes) {
            Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
            this.timeoutInMinutes = Optional.ofNullable(timeoutInMinutes);
            return this;
        }

        /**
         * Time limit for the push operation to complete before it is timed out.
         */
        public Builder timeoutInMinutes(Optional<Integer> timeoutInMinutes) {
            Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        
        public CreateAccountRequest build() {
            return new CreateAccountRequest(
                accountPrototype,
                companyId,
                connectionId,
                timeoutInMinutes);
        }
    }
}

