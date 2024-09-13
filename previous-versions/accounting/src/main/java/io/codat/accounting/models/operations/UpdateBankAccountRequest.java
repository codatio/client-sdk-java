/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.accounting.models.components.BankAccount;
import io.codat.accounting.utils.LazySingletonValue;
import io.codat.accounting.utils.SpeakeasyMetadata;
import io.codat.accounting.utils.Utils;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class UpdateBankAccountRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private JsonNullable<? extends BankAccount> bankAccount;

    /**
     * Unique identifier for a bank account.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=bankAccountId")
    private String bankAccountId;

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
     * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting software, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=forceUpdate")
    private Optional<Boolean> forceUpdate;

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=timeoutInMinutes")
    private Optional<Integer> timeoutInMinutes;

    @JsonCreator
    public UpdateBankAccountRequest(
            JsonNullable<? extends BankAccount> bankAccount,
            String bankAccountId,
            String companyId,
            String connectionId,
            Optional<Boolean> forceUpdate,
            Optional<Integer> timeoutInMinutes) {
        Utils.checkNotNull(bankAccount, "bankAccount");
        Utils.checkNotNull(bankAccountId, "bankAccountId");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(forceUpdate, "forceUpdate");
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.bankAccount = bankAccount;
        this.bankAccountId = bankAccountId;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.forceUpdate = forceUpdate;
        this.timeoutInMinutes = timeoutInMinutes;
    }
    
    public UpdateBankAccountRequest(
            String bankAccountId,
            String companyId,
            String connectionId) {
        this(JsonNullable.undefined(), bankAccountId, companyId, connectionId, Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<BankAccount> bankAccount() {
        return (JsonNullable<BankAccount>) bankAccount;
    }

    /**
     * Unique identifier for a bank account.
     */
    @JsonIgnore
    public String bankAccountId() {
        return bankAccountId;
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
     * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting software, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
     */
    @JsonIgnore
    public Optional<Boolean> forceUpdate() {
        return forceUpdate;
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

    public UpdateBankAccountRequest withBankAccount(BankAccount bankAccount) {
        Utils.checkNotNull(bankAccount, "bankAccount");
        this.bankAccount = JsonNullable.of(bankAccount);
        return this;
    }

    public UpdateBankAccountRequest withBankAccount(JsonNullable<? extends BankAccount> bankAccount) {
        Utils.checkNotNull(bankAccount, "bankAccount");
        this.bankAccount = bankAccount;
        return this;
    }

    /**
     * Unique identifier for a bank account.
     */
    public UpdateBankAccountRequest withBankAccountId(String bankAccountId) {
        Utils.checkNotNull(bankAccountId, "bankAccountId");
        this.bankAccountId = bankAccountId;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public UpdateBankAccountRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public UpdateBankAccountRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting software, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
     */
    public UpdateBankAccountRequest withForceUpdate(boolean forceUpdate) {
        Utils.checkNotNull(forceUpdate, "forceUpdate");
        this.forceUpdate = Optional.ofNullable(forceUpdate);
        return this;
    }

    /**
     * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting software, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
     */
    public UpdateBankAccountRequest withForceUpdate(Optional<Boolean> forceUpdate) {
        Utils.checkNotNull(forceUpdate, "forceUpdate");
        this.forceUpdate = forceUpdate;
        return this;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public UpdateBankAccountRequest withTimeoutInMinutes(int timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = Optional.ofNullable(timeoutInMinutes);
        return this;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public UpdateBankAccountRequest withTimeoutInMinutes(Optional<Integer> timeoutInMinutes) {
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
        UpdateBankAccountRequest other = (UpdateBankAccountRequest) o;
        return 
            Objects.deepEquals(this.bankAccount, other.bankAccount) &&
            Objects.deepEquals(this.bankAccountId, other.bankAccountId) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.forceUpdate, other.forceUpdate) &&
            Objects.deepEquals(this.timeoutInMinutes, other.timeoutInMinutes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            bankAccount,
            bankAccountId,
            companyId,
            connectionId,
            forceUpdate,
            timeoutInMinutes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateBankAccountRequest.class,
                "bankAccount", bankAccount,
                "bankAccountId", bankAccountId,
                "companyId", companyId,
                "connectionId", connectionId,
                "forceUpdate", forceUpdate,
                "timeoutInMinutes", timeoutInMinutes);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends BankAccount> bankAccount = JsonNullable.undefined();
 
        private String bankAccountId;
 
        private String companyId;
 
        private String connectionId;
 
        private Optional<Boolean> forceUpdate;
 
        private Optional<Integer> timeoutInMinutes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder bankAccount(BankAccount bankAccount) {
            Utils.checkNotNull(bankAccount, "bankAccount");
            this.bankAccount = JsonNullable.of(bankAccount);
            return this;
        }

        public Builder bankAccount(JsonNullable<? extends BankAccount> bankAccount) {
            Utils.checkNotNull(bankAccount, "bankAccount");
            this.bankAccount = bankAccount;
            return this;
        }

        /**
         * Unique identifier for a bank account.
         */
        public Builder bankAccountId(String bankAccountId) {
            Utils.checkNotNull(bankAccountId, "bankAccountId");
            this.bankAccountId = bankAccountId;
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
         * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting software, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
         */
        public Builder forceUpdate(boolean forceUpdate) {
            Utils.checkNotNull(forceUpdate, "forceUpdate");
            this.forceUpdate = Optional.ofNullable(forceUpdate);
            return this;
        }

        /**
         * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting software, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
         */
        public Builder forceUpdate(Optional<Boolean> forceUpdate) {
            Utils.checkNotNull(forceUpdate, "forceUpdate");
            this.forceUpdate = forceUpdate;
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
        
        public UpdateBankAccountRequest build() {
            if (forceUpdate == null) {
                forceUpdate = _SINGLETON_VALUE_ForceUpdate.value();
            }            return new UpdateBankAccountRequest(
                bankAccount,
                bankAccountId,
                companyId,
                connectionId,
                forceUpdate,
                timeoutInMinutes);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_ForceUpdate =
                new LazySingletonValue<>(
                        "forceUpdate",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}

