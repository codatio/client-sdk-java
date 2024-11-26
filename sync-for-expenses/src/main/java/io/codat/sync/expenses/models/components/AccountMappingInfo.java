/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.expenses.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class AccountMappingInfo {

    /**
     * Type of the account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountType")
    private Optional<? extends AccountMappingInfoAccountType> accountType;

    /**
     * Currency of the account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private Optional<String> currency;

    /**
     * Full account type and category of the account
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fullyQualifiedCategory")
    private Optional<String> fullyQualifiedCategory;

    /**
     * Unique identifier of account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * Confirms whether the account is a bank account or not.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("isBankAccount")
    private Optional<Boolean> isBankAccount;

    /**
     * Name of the account as it appears in the company's accounting software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * Code used to identify each nominal account in the accounting software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nominalCode")
    private JsonNullable<String> nominalCode;

    /**
     * Supported endpoints for the account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("validFor")
    private Optional<? extends List<ValidFor>> validFor;

    /**
     * Supported transaction types for the account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("validTransactionTypes")
    private Optional<? extends List<ValidTransactionTypes>> validTransactionTypes;

    @JsonCreator
    public AccountMappingInfo(
            @JsonProperty("accountType") Optional<? extends AccountMappingInfoAccountType> accountType,
            @JsonProperty("currency") Optional<String> currency,
            @JsonProperty("fullyQualifiedCategory") Optional<String> fullyQualifiedCategory,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("isBankAccount") Optional<Boolean> isBankAccount,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("nominalCode") JsonNullable<String> nominalCode,
            @JsonProperty("validFor") Optional<? extends List<ValidFor>> validFor,
            @JsonProperty("validTransactionTypes") Optional<? extends List<ValidTransactionTypes>> validTransactionTypes) {
        Utils.checkNotNull(accountType, "accountType");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(fullyQualifiedCategory, "fullyQualifiedCategory");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(isBankAccount, "isBankAccount");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(nominalCode, "nominalCode");
        Utils.checkNotNull(validFor, "validFor");
        Utils.checkNotNull(validTransactionTypes, "validTransactionTypes");
        this.accountType = accountType;
        this.currency = currency;
        this.fullyQualifiedCategory = fullyQualifiedCategory;
        this.id = id;
        this.isBankAccount = isBankAccount;
        this.name = name;
        this.nominalCode = nominalCode;
        this.validFor = validFor;
        this.validTransactionTypes = validTransactionTypes;
    }
    
    public AccountMappingInfo() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty());
    }

    /**
     * Type of the account.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountMappingInfoAccountType> accountType() {
        return (Optional<AccountMappingInfoAccountType>) accountType;
    }

    /**
     * Currency of the account.
     */
    @JsonIgnore
    public Optional<String> currency() {
        return currency;
    }

    /**
     * Full account type and category of the account
     */
    @JsonIgnore
    public Optional<String> fullyQualifiedCategory() {
        return fullyQualifiedCategory;
    }

    /**
     * Unique identifier of account.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * Confirms whether the account is a bank account or not.
     */
    @JsonIgnore
    public Optional<Boolean> isBankAccount() {
        return isBankAccount;
    }

    /**
     * Name of the account as it appears in the company's accounting software.
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * Code used to identify each nominal account in the accounting software.
     */
    @JsonIgnore
    public JsonNullable<String> nominalCode() {
        return nominalCode;
    }

    /**
     * Supported endpoints for the account.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ValidFor>> validFor() {
        return (Optional<List<ValidFor>>) validFor;
    }

    /**
     * Supported transaction types for the account.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ValidTransactionTypes>> validTransactionTypes() {
        return (Optional<List<ValidTransactionTypes>>) validTransactionTypes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Type of the account.
     */
    public AccountMappingInfo withAccountType(AccountMappingInfoAccountType accountType) {
        Utils.checkNotNull(accountType, "accountType");
        this.accountType = Optional.ofNullable(accountType);
        return this;
    }

    /**
     * Type of the account.
     */
    public AccountMappingInfo withAccountType(Optional<? extends AccountMappingInfoAccountType> accountType) {
        Utils.checkNotNull(accountType, "accountType");
        this.accountType = accountType;
        return this;
    }

    /**
     * Currency of the account.
     */
    public AccountMappingInfo withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = Optional.ofNullable(currency);
        return this;
    }

    /**
     * Currency of the account.
     */
    public AccountMappingInfo withCurrency(Optional<String> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * Full account type and category of the account
     */
    public AccountMappingInfo withFullyQualifiedCategory(String fullyQualifiedCategory) {
        Utils.checkNotNull(fullyQualifiedCategory, "fullyQualifiedCategory");
        this.fullyQualifiedCategory = Optional.ofNullable(fullyQualifiedCategory);
        return this;
    }

    /**
     * Full account type and category of the account
     */
    public AccountMappingInfo withFullyQualifiedCategory(Optional<String> fullyQualifiedCategory) {
        Utils.checkNotNull(fullyQualifiedCategory, "fullyQualifiedCategory");
        this.fullyQualifiedCategory = fullyQualifiedCategory;
        return this;
    }

    /**
     * Unique identifier of account.
     */
    public AccountMappingInfo withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Unique identifier of account.
     */
    public AccountMappingInfo withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Confirms whether the account is a bank account or not.
     */
    public AccountMappingInfo withIsBankAccount(boolean isBankAccount) {
        Utils.checkNotNull(isBankAccount, "isBankAccount");
        this.isBankAccount = Optional.ofNullable(isBankAccount);
        return this;
    }

    /**
     * Confirms whether the account is a bank account or not.
     */
    public AccountMappingInfo withIsBankAccount(Optional<Boolean> isBankAccount) {
        Utils.checkNotNull(isBankAccount, "isBankAccount");
        this.isBankAccount = isBankAccount;
        return this;
    }

    /**
     * Name of the account as it appears in the company's accounting software.
     */
    public AccountMappingInfo withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name of the account as it appears in the company's accounting software.
     */
    public AccountMappingInfo withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Code used to identify each nominal account in the accounting software.
     */
    public AccountMappingInfo withNominalCode(String nominalCode) {
        Utils.checkNotNull(nominalCode, "nominalCode");
        this.nominalCode = JsonNullable.of(nominalCode);
        return this;
    }

    /**
     * Code used to identify each nominal account in the accounting software.
     */
    public AccountMappingInfo withNominalCode(JsonNullable<String> nominalCode) {
        Utils.checkNotNull(nominalCode, "nominalCode");
        this.nominalCode = nominalCode;
        return this;
    }

    /**
     * Supported endpoints for the account.
     */
    public AccountMappingInfo withValidFor(List<ValidFor> validFor) {
        Utils.checkNotNull(validFor, "validFor");
        this.validFor = Optional.ofNullable(validFor);
        return this;
    }

    /**
     * Supported endpoints for the account.
     */
    public AccountMappingInfo withValidFor(Optional<? extends List<ValidFor>> validFor) {
        Utils.checkNotNull(validFor, "validFor");
        this.validFor = validFor;
        return this;
    }

    /**
     * Supported transaction types for the account.
     */
    public AccountMappingInfo withValidTransactionTypes(List<ValidTransactionTypes> validTransactionTypes) {
        Utils.checkNotNull(validTransactionTypes, "validTransactionTypes");
        this.validTransactionTypes = Optional.ofNullable(validTransactionTypes);
        return this;
    }

    /**
     * Supported transaction types for the account.
     */
    public AccountMappingInfo withValidTransactionTypes(Optional<? extends List<ValidTransactionTypes>> validTransactionTypes) {
        Utils.checkNotNull(validTransactionTypes, "validTransactionTypes");
        this.validTransactionTypes = validTransactionTypes;
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
        AccountMappingInfo other = (AccountMappingInfo) o;
        return 
            Objects.deepEquals(this.accountType, other.accountType) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.fullyQualifiedCategory, other.fullyQualifiedCategory) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.isBankAccount, other.isBankAccount) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.nominalCode, other.nominalCode) &&
            Objects.deepEquals(this.validFor, other.validFor) &&
            Objects.deepEquals(this.validTransactionTypes, other.validTransactionTypes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountType,
            currency,
            fullyQualifiedCategory,
            id,
            isBankAccount,
            name,
            nominalCode,
            validFor,
            validTransactionTypes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountMappingInfo.class,
                "accountType", accountType,
                "currency", currency,
                "fullyQualifiedCategory", fullyQualifiedCategory,
                "id", id,
                "isBankAccount", isBankAccount,
                "name", name,
                "nominalCode", nominalCode,
                "validFor", validFor,
                "validTransactionTypes", validTransactionTypes);
    }
    
    public final static class Builder {
 
        private Optional<? extends AccountMappingInfoAccountType> accountType = Optional.empty();
 
        private Optional<String> currency = Optional.empty();
 
        private Optional<String> fullyQualifiedCategory = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<Boolean> isBankAccount = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private JsonNullable<String> nominalCode = JsonNullable.undefined();
 
        private Optional<? extends List<ValidFor>> validFor = Optional.empty();
 
        private Optional<? extends List<ValidTransactionTypes>> validTransactionTypes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Type of the account.
         */
        public Builder accountType(AccountMappingInfoAccountType accountType) {
            Utils.checkNotNull(accountType, "accountType");
            this.accountType = Optional.ofNullable(accountType);
            return this;
        }

        /**
         * Type of the account.
         */
        public Builder accountType(Optional<? extends AccountMappingInfoAccountType> accountType) {
            Utils.checkNotNull(accountType, "accountType");
            this.accountType = accountType;
            return this;
        }

        /**
         * Currency of the account.
         */
        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = Optional.ofNullable(currency);
            return this;
        }

        /**
         * Currency of the account.
         */
        public Builder currency(Optional<String> currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }

        /**
         * Full account type and category of the account
         */
        public Builder fullyQualifiedCategory(String fullyQualifiedCategory) {
            Utils.checkNotNull(fullyQualifiedCategory, "fullyQualifiedCategory");
            this.fullyQualifiedCategory = Optional.ofNullable(fullyQualifiedCategory);
            return this;
        }

        /**
         * Full account type and category of the account
         */
        public Builder fullyQualifiedCategory(Optional<String> fullyQualifiedCategory) {
            Utils.checkNotNull(fullyQualifiedCategory, "fullyQualifiedCategory");
            this.fullyQualifiedCategory = fullyQualifiedCategory;
            return this;
        }

        /**
         * Unique identifier of account.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Unique identifier of account.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Confirms whether the account is a bank account or not.
         */
        public Builder isBankAccount(boolean isBankAccount) {
            Utils.checkNotNull(isBankAccount, "isBankAccount");
            this.isBankAccount = Optional.ofNullable(isBankAccount);
            return this;
        }

        /**
         * Confirms whether the account is a bank account or not.
         */
        public Builder isBankAccount(Optional<Boolean> isBankAccount) {
            Utils.checkNotNull(isBankAccount, "isBankAccount");
            this.isBankAccount = isBankAccount;
            return this;
        }

        /**
         * Name of the account as it appears in the company's accounting software.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Name of the account as it appears in the company's accounting software.
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Code used to identify each nominal account in the accounting software.
         */
        public Builder nominalCode(String nominalCode) {
            Utils.checkNotNull(nominalCode, "nominalCode");
            this.nominalCode = JsonNullable.of(nominalCode);
            return this;
        }

        /**
         * Code used to identify each nominal account in the accounting software.
         */
        public Builder nominalCode(JsonNullable<String> nominalCode) {
            Utils.checkNotNull(nominalCode, "nominalCode");
            this.nominalCode = nominalCode;
            return this;
        }

        /**
         * Supported endpoints for the account.
         */
        public Builder validFor(List<ValidFor> validFor) {
            Utils.checkNotNull(validFor, "validFor");
            this.validFor = Optional.ofNullable(validFor);
            return this;
        }

        /**
         * Supported endpoints for the account.
         */
        public Builder validFor(Optional<? extends List<ValidFor>> validFor) {
            Utils.checkNotNull(validFor, "validFor");
            this.validFor = validFor;
            return this;
        }

        /**
         * Supported transaction types for the account.
         */
        public Builder validTransactionTypes(List<ValidTransactionTypes> validTransactionTypes) {
            Utils.checkNotNull(validTransactionTypes, "validTransactionTypes");
            this.validTransactionTypes = Optional.ofNullable(validTransactionTypes);
            return this;
        }

        /**
         * Supported transaction types for the account.
         */
        public Builder validTransactionTypes(Optional<? extends List<ValidTransactionTypes>> validTransactionTypes) {
            Utils.checkNotNull(validTransactionTypes, "validTransactionTypes");
            this.validTransactionTypes = validTransactionTypes;
            return this;
        }
        
        public AccountMappingInfo build() {
            return new AccountMappingInfo(
                accountType,
                currency,
                fullyQualifiedCategory,
                id,
                isBankAccount,
                name,
                nominalCode,
                validFor,
                validTransactionTypes);
        }
    }
}

