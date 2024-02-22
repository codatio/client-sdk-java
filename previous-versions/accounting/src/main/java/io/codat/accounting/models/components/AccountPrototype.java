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


public class AccountPrototype {

    /**
     * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
     * 
     * ## Unknown currencies
     * 
     * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
     * 
     * There are only a very small number of edge cases where this currency code is returned by the Codat system.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private Optional<? extends String> currency;

    /**
     * Current balance in the account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currentBalance")
    private JsonNullable<? extends Double> currentBalance;

    /**
     * Description for the account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<? extends String> description;

    /**
     * Full category of the account. 
     * 
     * For example, `Liability.Current` or `Income.Revenue`. To determine a list of possible categories for each integration, see our examples, follow our [Create, update, delete data](https://docs.codat.io/using-the-api/push) guide, or refer to the integration's own documentation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fullyQualifiedCategory")
    private JsonNullable<? extends String> fullyQualifiedCategory;

    /**
     * Full name of the account, for example:
     * - `Cash On Hand`
     * - `Rents Held In Trust`
     * - `Fixed Asset`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fullyQualifiedName")
    private JsonNullable<? extends String> fullyQualifiedName;

    /**
     * Confirms whether the account is a bank account or not.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("isBankAccount")
    private Optional<? extends Boolean> isBankAccount;

    /**
     * Name of the account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<? extends String> name;

    /**
     * Reference given to each nominal account for a business. It ensures money is allocated to the correct account. This code isn't a unique identifier in the Codat system.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nominalCode")
    private JsonNullable<? extends String> nominalCode;

    /**
     * Status of the account
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends AccountStatus> status;

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supplementalData")
    private Optional<? extends SupplementalData> supplementalData;

    /**
     * Type of account
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends AccountType> type;

    /**
     * The validDatatypeLinks can be used to determine whether an account can be correctly mapped to another object; for example, accounts with a `type` of `income` might only support being used on an Invoice and Direct Income. For more information, see [Valid Data Type Links](/accounting-api#/schemas/ValidDataTypeLinks).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("validDatatypeLinks")
    private JsonNullable<? extends java.util.List<ValidDataTypeLinks>> validDatatypeLinks;

    public AccountPrototype(
            @JsonProperty("currency") Optional<? extends String> currency,
            @JsonProperty("currentBalance") JsonNullable<? extends Double> currentBalance,
            @JsonProperty("description") JsonNullable<? extends String> description,
            @JsonProperty("fullyQualifiedCategory") JsonNullable<? extends String> fullyQualifiedCategory,
            @JsonProperty("fullyQualifiedName") JsonNullable<? extends String> fullyQualifiedName,
            @JsonProperty("isBankAccount") Optional<? extends Boolean> isBankAccount,
            @JsonProperty("name") JsonNullable<? extends String> name,
            @JsonProperty("nominalCode") JsonNullable<? extends String> nominalCode,
            @JsonProperty("status") Optional<? extends AccountStatus> status,
            @JsonProperty("supplementalData") Optional<? extends SupplementalData> supplementalData,
            @JsonProperty("type") Optional<? extends AccountType> type,
            @JsonProperty("validDatatypeLinks") JsonNullable<? extends java.util.List<ValidDataTypeLinks>> validDatatypeLinks) {
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(currentBalance, "currentBalance");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(fullyQualifiedCategory, "fullyQualifiedCategory");
        Utils.checkNotNull(fullyQualifiedName, "fullyQualifiedName");
        Utils.checkNotNull(isBankAccount, "isBankAccount");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(nominalCode, "nominalCode");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(supplementalData, "supplementalData");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(validDatatypeLinks, "validDatatypeLinks");
        this.currency = currency;
        this.currentBalance = currentBalance;
        this.description = description;
        this.fullyQualifiedCategory = fullyQualifiedCategory;
        this.fullyQualifiedName = fullyQualifiedName;
        this.isBankAccount = isBankAccount;
        this.name = name;
        this.nominalCode = nominalCode;
        this.status = status;
        this.supplementalData = supplementalData;
        this.type = type;
        this.validDatatypeLinks = validDatatypeLinks;
    }

    /**
     * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
     * 
     * ## Unknown currencies
     * 
     * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
     * 
     * There are only a very small number of edge cases where this currency code is returned by the Codat system.
     */
    public Optional<? extends String> currency() {
        return currency;
    }

    /**
     * Current balance in the account.
     */
    public JsonNullable<? extends Double> currentBalance() {
        return currentBalance;
    }

    /**
     * Description for the account.
     */
    public JsonNullable<? extends String> description() {
        return description;
    }

    /**
     * Full category of the account. 
     * 
     * For example, `Liability.Current` or `Income.Revenue`. To determine a list of possible categories for each integration, see our examples, follow our [Create, update, delete data](https://docs.codat.io/using-the-api/push) guide, or refer to the integration's own documentation.
     */
    public JsonNullable<? extends String> fullyQualifiedCategory() {
        return fullyQualifiedCategory;
    }

    /**
     * Full name of the account, for example:
     * - `Cash On Hand`
     * - `Rents Held In Trust`
     * - `Fixed Asset`
     */
    public JsonNullable<? extends String> fullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * Confirms whether the account is a bank account or not.
     */
    public Optional<? extends Boolean> isBankAccount() {
        return isBankAccount;
    }

    /**
     * Name of the account.
     */
    public JsonNullable<? extends String> name() {
        return name;
    }

    /**
     * Reference given to each nominal account for a business. It ensures money is allocated to the correct account. This code isn't a unique identifier in the Codat system.
     */
    public JsonNullable<? extends String> nominalCode() {
        return nominalCode;
    }

    /**
     * Status of the account
     */
    public Optional<? extends AccountStatus> status() {
        return status;
    }

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    public Optional<? extends SupplementalData> supplementalData() {
        return supplementalData;
    }

    /**
     * Type of account
     */
    public Optional<? extends AccountType> type() {
        return type;
    }

    /**
     * The validDatatypeLinks can be used to determine whether an account can be correctly mapped to another object; for example, accounts with a `type` of `income` might only support being used on an Invoice and Direct Income. For more information, see [Valid Data Type Links](/accounting-api#/schemas/ValidDataTypeLinks).
     */
    public JsonNullable<? extends java.util.List<ValidDataTypeLinks>> validDatatypeLinks() {
        return validDatatypeLinks;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
     * 
     * ## Unknown currencies
     * 
     * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
     * 
     * There are only a very small number of edge cases where this currency code is returned by the Codat system.
     */
    public AccountPrototype withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = Optional.ofNullable(currency);
        return this;
    }
    
    /**
     * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
     * 
     * ## Unknown currencies
     * 
     * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
     * 
     * There are only a very small number of edge cases where this currency code is returned by the Codat system.
     */
    public AccountPrototype withCurrency(Optional<? extends String> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * Current balance in the account.
     */
    public AccountPrototype withCurrentBalance(double currentBalance) {
        Utils.checkNotNull(currentBalance, "currentBalance");
        this.currentBalance = JsonNullable.of(currentBalance);
        return this;
    }

    /**
     * Current balance in the account.
     */
    public AccountPrototype withCurrentBalance(JsonNullable<? extends Double> currentBalance) {
        Utils.checkNotNull(currentBalance, "currentBalance");
        this.currentBalance = currentBalance;
        return this;
    }

    /**
     * Description for the account.
     */
    public AccountPrototype withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Description for the account.
     */
    public AccountPrototype withDescription(JsonNullable<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Full category of the account. 
     * 
     * For example, `Liability.Current` or `Income.Revenue`. To determine a list of possible categories for each integration, see our examples, follow our [Create, update, delete data](https://docs.codat.io/using-the-api/push) guide, or refer to the integration's own documentation.
     */
    public AccountPrototype withFullyQualifiedCategory(String fullyQualifiedCategory) {
        Utils.checkNotNull(fullyQualifiedCategory, "fullyQualifiedCategory");
        this.fullyQualifiedCategory = JsonNullable.of(fullyQualifiedCategory);
        return this;
    }

    /**
     * Full category of the account. 
     * 
     * For example, `Liability.Current` or `Income.Revenue`. To determine a list of possible categories for each integration, see our examples, follow our [Create, update, delete data](https://docs.codat.io/using-the-api/push) guide, or refer to the integration's own documentation.
     */
    public AccountPrototype withFullyQualifiedCategory(JsonNullable<? extends String> fullyQualifiedCategory) {
        Utils.checkNotNull(fullyQualifiedCategory, "fullyQualifiedCategory");
        this.fullyQualifiedCategory = fullyQualifiedCategory;
        return this;
    }

    /**
     * Full name of the account, for example:
     * - `Cash On Hand`
     * - `Rents Held In Trust`
     * - `Fixed Asset`
     */
    public AccountPrototype withFullyQualifiedName(String fullyQualifiedName) {
        Utils.checkNotNull(fullyQualifiedName, "fullyQualifiedName");
        this.fullyQualifiedName = JsonNullable.of(fullyQualifiedName);
        return this;
    }

    /**
     * Full name of the account, for example:
     * - `Cash On Hand`
     * - `Rents Held In Trust`
     * - `Fixed Asset`
     */
    public AccountPrototype withFullyQualifiedName(JsonNullable<? extends String> fullyQualifiedName) {
        Utils.checkNotNull(fullyQualifiedName, "fullyQualifiedName");
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }

    /**
     * Confirms whether the account is a bank account or not.
     */
    public AccountPrototype withIsBankAccount(boolean isBankAccount) {
        Utils.checkNotNull(isBankAccount, "isBankAccount");
        this.isBankAccount = Optional.ofNullable(isBankAccount);
        return this;
    }
    
    /**
     * Confirms whether the account is a bank account or not.
     */
    public AccountPrototype withIsBankAccount(Optional<? extends Boolean> isBankAccount) {
        Utils.checkNotNull(isBankAccount, "isBankAccount");
        this.isBankAccount = isBankAccount;
        return this;
    }

    /**
     * Name of the account.
     */
    public AccountPrototype withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Name of the account.
     */
    public AccountPrototype withName(JsonNullable<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Reference given to each nominal account for a business. It ensures money is allocated to the correct account. This code isn't a unique identifier in the Codat system.
     */
    public AccountPrototype withNominalCode(String nominalCode) {
        Utils.checkNotNull(nominalCode, "nominalCode");
        this.nominalCode = JsonNullable.of(nominalCode);
        return this;
    }

    /**
     * Reference given to each nominal account for a business. It ensures money is allocated to the correct account. This code isn't a unique identifier in the Codat system.
     */
    public AccountPrototype withNominalCode(JsonNullable<? extends String> nominalCode) {
        Utils.checkNotNull(nominalCode, "nominalCode");
        this.nominalCode = nominalCode;
        return this;
    }

    /**
     * Status of the account
     */
    public AccountPrototype withStatus(AccountStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }
    
    /**
     * Status of the account
     */
    public AccountPrototype withStatus(Optional<? extends AccountStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    public AccountPrototype withSupplementalData(SupplementalData supplementalData) {
        Utils.checkNotNull(supplementalData, "supplementalData");
        this.supplementalData = Optional.ofNullable(supplementalData);
        return this;
    }
    
    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    public AccountPrototype withSupplementalData(Optional<? extends SupplementalData> supplementalData) {
        Utils.checkNotNull(supplementalData, "supplementalData");
        this.supplementalData = supplementalData;
        return this;
    }

    /**
     * Type of account
     */
    public AccountPrototype withType(AccountType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }
    
    /**
     * Type of account
     */
    public AccountPrototype withType(Optional<? extends AccountType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The validDatatypeLinks can be used to determine whether an account can be correctly mapped to another object; for example, accounts with a `type` of `income` might only support being used on an Invoice and Direct Income. For more information, see [Valid Data Type Links](/accounting-api#/schemas/ValidDataTypeLinks).
     */
    public AccountPrototype withValidDatatypeLinks(java.util.List<ValidDataTypeLinks> validDatatypeLinks) {
        Utils.checkNotNull(validDatatypeLinks, "validDatatypeLinks");
        this.validDatatypeLinks = JsonNullable.of(validDatatypeLinks);
        return this;
    }

    /**
     * The validDatatypeLinks can be used to determine whether an account can be correctly mapped to another object; for example, accounts with a `type` of `income` might only support being used on an Invoice and Direct Income. For more information, see [Valid Data Type Links](/accounting-api#/schemas/ValidDataTypeLinks).
     */
    public AccountPrototype withValidDatatypeLinks(JsonNullable<? extends java.util.List<ValidDataTypeLinks>> validDatatypeLinks) {
        Utils.checkNotNull(validDatatypeLinks, "validDatatypeLinks");
        this.validDatatypeLinks = validDatatypeLinks;
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
        AccountPrototype other = (AccountPrototype) o;
        return 
            java.util.Objects.deepEquals(this.currency, other.currency) &&
            java.util.Objects.deepEquals(this.currentBalance, other.currentBalance) &&
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.fullyQualifiedCategory, other.fullyQualifiedCategory) &&
            java.util.Objects.deepEquals(this.fullyQualifiedName, other.fullyQualifiedName) &&
            java.util.Objects.deepEquals(this.isBankAccount, other.isBankAccount) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.nominalCode, other.nominalCode) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.supplementalData, other.supplementalData) &&
            java.util.Objects.deepEquals(this.type, other.type) &&
            java.util.Objects.deepEquals(this.validDatatypeLinks, other.validDatatypeLinks);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            currency,
            currentBalance,
            description,
            fullyQualifiedCategory,
            fullyQualifiedName,
            isBankAccount,
            name,
            nominalCode,
            status,
            supplementalData,
            type,
            validDatatypeLinks);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountPrototype.class,
                "currency", currency,
                "currentBalance", currentBalance,
                "description", description,
                "fullyQualifiedCategory", fullyQualifiedCategory,
                "fullyQualifiedName", fullyQualifiedName,
                "isBankAccount", isBankAccount,
                "name", name,
                "nominalCode", nominalCode,
                "status", status,
                "supplementalData", supplementalData,
                "type", type,
                "validDatatypeLinks", validDatatypeLinks);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> currency = Optional.empty();
 
        private JsonNullable<? extends Double> currentBalance = JsonNullable.undefined();
 
        private JsonNullable<? extends String> description = JsonNullable.undefined();
 
        private JsonNullable<? extends String> fullyQualifiedCategory = JsonNullable.undefined();
 
        private JsonNullable<? extends String> fullyQualifiedName = JsonNullable.undefined();
 
        private Optional<? extends Boolean> isBankAccount = Optional.empty();
 
        private JsonNullable<? extends String> name = JsonNullable.undefined();
 
        private JsonNullable<? extends String> nominalCode = JsonNullable.undefined();
 
        private Optional<? extends AccountStatus> status = Optional.empty();
 
        private Optional<? extends SupplementalData> supplementalData = Optional.empty();
 
        private Optional<? extends AccountType> type = Optional.empty();
 
        private JsonNullable<? extends java.util.List<ValidDataTypeLinks>> validDatatypeLinks = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
         * 
         * ## Unknown currencies
         * 
         * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
         * 
         * There are only a very small number of edge cases where this currency code is returned by the Codat system.
         */
        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = Optional.ofNullable(currency);
            return this;
        }
        
        /**
         * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
         * 
         * ## Unknown currencies
         * 
         * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
         * 
         * There are only a very small number of edge cases where this currency code is returned by the Codat system.
         */
        public Builder currency(Optional<? extends String> currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }

        /**
         * Current balance in the account.
         */
        public Builder currentBalance(double currentBalance) {
            Utils.checkNotNull(currentBalance, "currentBalance");
            this.currentBalance = JsonNullable.of(currentBalance);
            return this;
        }

        /**
         * Current balance in the account.
         */
        public Builder currentBalance(JsonNullable<? extends Double> currentBalance) {
            Utils.checkNotNull(currentBalance, "currentBalance");
            this.currentBalance = currentBalance;
            return this;
        }

        /**
         * Description for the account.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * Description for the account.
         */
        public Builder description(JsonNullable<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Full category of the account. 
         * 
         * For example, `Liability.Current` or `Income.Revenue`. To determine a list of possible categories for each integration, see our examples, follow our [Create, update, delete data](https://docs.codat.io/using-the-api/push) guide, or refer to the integration's own documentation.
         */
        public Builder fullyQualifiedCategory(String fullyQualifiedCategory) {
            Utils.checkNotNull(fullyQualifiedCategory, "fullyQualifiedCategory");
            this.fullyQualifiedCategory = JsonNullable.of(fullyQualifiedCategory);
            return this;
        }

        /**
         * Full category of the account. 
         * 
         * For example, `Liability.Current` or `Income.Revenue`. To determine a list of possible categories for each integration, see our examples, follow our [Create, update, delete data](https://docs.codat.io/using-the-api/push) guide, or refer to the integration's own documentation.
         */
        public Builder fullyQualifiedCategory(JsonNullable<? extends String> fullyQualifiedCategory) {
            Utils.checkNotNull(fullyQualifiedCategory, "fullyQualifiedCategory");
            this.fullyQualifiedCategory = fullyQualifiedCategory;
            return this;
        }

        /**
         * Full name of the account, for example:
         * - `Cash On Hand`
         * - `Rents Held In Trust`
         * - `Fixed Asset`
         */
        public Builder fullyQualifiedName(String fullyQualifiedName) {
            Utils.checkNotNull(fullyQualifiedName, "fullyQualifiedName");
            this.fullyQualifiedName = JsonNullable.of(fullyQualifiedName);
            return this;
        }

        /**
         * Full name of the account, for example:
         * - `Cash On Hand`
         * - `Rents Held In Trust`
         * - `Fixed Asset`
         */
        public Builder fullyQualifiedName(JsonNullable<? extends String> fullyQualifiedName) {
            Utils.checkNotNull(fullyQualifiedName, "fullyQualifiedName");
            this.fullyQualifiedName = fullyQualifiedName;
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
        public Builder isBankAccount(Optional<? extends Boolean> isBankAccount) {
            Utils.checkNotNull(isBankAccount, "isBankAccount");
            this.isBankAccount = isBankAccount;
            return this;
        }

        /**
         * Name of the account.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * Name of the account.
         */
        public Builder name(JsonNullable<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Reference given to each nominal account for a business. It ensures money is allocated to the correct account. This code isn't a unique identifier in the Codat system.
         */
        public Builder nominalCode(String nominalCode) {
            Utils.checkNotNull(nominalCode, "nominalCode");
            this.nominalCode = JsonNullable.of(nominalCode);
            return this;
        }

        /**
         * Reference given to each nominal account for a business. It ensures money is allocated to the correct account. This code isn't a unique identifier in the Codat system.
         */
        public Builder nominalCode(JsonNullable<? extends String> nominalCode) {
            Utils.checkNotNull(nominalCode, "nominalCode");
            this.nominalCode = nominalCode;
            return this;
        }

        /**
         * Status of the account
         */
        public Builder status(AccountStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }
        
        /**
         * Status of the account
         */
        public Builder status(Optional<? extends AccountStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Supplemental data is additional data you can include in our standard data types. 
         * 
         * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
         */
        public Builder supplementalData(SupplementalData supplementalData) {
            Utils.checkNotNull(supplementalData, "supplementalData");
            this.supplementalData = Optional.ofNullable(supplementalData);
            return this;
        }
        
        /**
         * Supplemental data is additional data you can include in our standard data types. 
         * 
         * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
         */
        public Builder supplementalData(Optional<? extends SupplementalData> supplementalData) {
            Utils.checkNotNull(supplementalData, "supplementalData");
            this.supplementalData = supplementalData;
            return this;
        }

        /**
         * Type of account
         */
        public Builder type(AccountType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }
        
        /**
         * Type of account
         */
        public Builder type(Optional<? extends AccountType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The validDatatypeLinks can be used to determine whether an account can be correctly mapped to another object; for example, accounts with a `type` of `income` might only support being used on an Invoice and Direct Income. For more information, see [Valid Data Type Links](/accounting-api#/schemas/ValidDataTypeLinks).
         */
        public Builder validDatatypeLinks(java.util.List<ValidDataTypeLinks> validDatatypeLinks) {
            Utils.checkNotNull(validDatatypeLinks, "validDatatypeLinks");
            this.validDatatypeLinks = JsonNullable.of(validDatatypeLinks);
            return this;
        }

        /**
         * The validDatatypeLinks can be used to determine whether an account can be correctly mapped to another object; for example, accounts with a `type` of `income` might only support being used on an Invoice and Direct Income. For more information, see [Valid Data Type Links](/accounting-api#/schemas/ValidDataTypeLinks).
         */
        public Builder validDatatypeLinks(JsonNullable<? extends java.util.List<ValidDataTypeLinks>> validDatatypeLinks) {
            Utils.checkNotNull(validDatatypeLinks, "validDatatypeLinks");
            this.validDatatypeLinks = validDatatypeLinks;
            return this;
        }
        
        public AccountPrototype build() {
            return new AccountPrototype(
                currency,
                currentBalance,
                description,
                fullyQualifiedCategory,
                fullyQualifiedName,
                isBankAccount,
                name,
                nominalCode,
                status,
                supplementalData,
                type,
                validDatatypeLinks);
        }
    }
}

