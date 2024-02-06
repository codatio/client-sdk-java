/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AccountIdentifiers - An object containing bank account identification information.
 */

public class AccountIdentifiers {

    /**
     * The local (usually national) routing number for the account.
     * 
     * This is known by different names in different countries:
     * * BSB code (Australia)
     * * routing number (Canada, USA)
     * * sort code (UK)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bankCode")
    private JsonNullable<? extends String> bankCode;

    /**
     * The ISO 9362 code (commonly called SWIFT code, SWIFT-BIC or BIC) for the account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bic")
    private JsonNullable<? extends String> bic;

    /**
     * The international bank account number (IBAN) for the account, if known.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("iban")
    private JsonNullable<? extends String> iban;

    /**
     * A portion of the actual account `number` to help account identification where number is tokenised (Plaid only)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("maskedAccountNumber")
    private JsonNullable<? extends String> maskedAccountNumber;

    /**
     * The account number for the account. When combined with the`bankCode`, this is usually enough to uniquely identify an account within a jurisdiction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("number")
    private JsonNullable<? extends String> number;

    /**
     * Detailed account category
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subtype")
    private JsonNullable<? extends String> subtype;

    /**
     * Type of account
     */
    @JsonProperty("type")
    private AccountIdentifierType type;

    public AccountIdentifiers(
            @JsonProperty("bankCode") JsonNullable<? extends String> bankCode,
            @JsonProperty("bic") JsonNullable<? extends String> bic,
            @JsonProperty("iban") JsonNullable<? extends String> iban,
            @JsonProperty("maskedAccountNumber") JsonNullable<? extends String> maskedAccountNumber,
            @JsonProperty("number") JsonNullable<? extends String> number,
            @JsonProperty("subtype") JsonNullable<? extends String> subtype,
            @JsonProperty("type") AccountIdentifierType type) {
        Utils.checkNotNull(bankCode, "bankCode");
        Utils.checkNotNull(bic, "bic");
        Utils.checkNotNull(iban, "iban");
        Utils.checkNotNull(maskedAccountNumber, "maskedAccountNumber");
        Utils.checkNotNull(number, "number");
        Utils.checkNotNull(subtype, "subtype");
        Utils.checkNotNull(type, "type");
        this.bankCode = bankCode;
        this.bic = bic;
        this.iban = iban;
        this.maskedAccountNumber = maskedAccountNumber;
        this.number = number;
        this.subtype = subtype;
        this.type = type;
    }

    /**
     * The local (usually national) routing number for the account.
     * 
     * This is known by different names in different countries:
     * * BSB code (Australia)
     * * routing number (Canada, USA)
     * * sort code (UK)
     */
    public JsonNullable<? extends String> bankCode() {
        return bankCode;
    }

    /**
     * The ISO 9362 code (commonly called SWIFT code, SWIFT-BIC or BIC) for the account.
     */
    public JsonNullable<? extends String> bic() {
        return bic;
    }

    /**
     * The international bank account number (IBAN) for the account, if known.
     */
    public JsonNullable<? extends String> iban() {
        return iban;
    }

    /**
     * A portion of the actual account `number` to help account identification where number is tokenised (Plaid only)
     */
    public JsonNullable<? extends String> maskedAccountNumber() {
        return maskedAccountNumber;
    }

    /**
     * The account number for the account. When combined with the`bankCode`, this is usually enough to uniquely identify an account within a jurisdiction.
     */
    public JsonNullable<? extends String> number() {
        return number;
    }

    /**
     * Detailed account category
     */
    public JsonNullable<? extends String> subtype() {
        return subtype;
    }

    /**
     * Type of account
     */
    public AccountIdentifierType type() {
        return type;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The local (usually national) routing number for the account.
     * 
     * This is known by different names in different countries:
     * * BSB code (Australia)
     * * routing number (Canada, USA)
     * * sort code (UK)
     */
    public AccountIdentifiers withBankCode(String bankCode) {
        Utils.checkNotNull(bankCode, "bankCode");
        this.bankCode = JsonNullable.of(bankCode);
        return this;
    }

    /**
     * The local (usually national) routing number for the account.
     * 
     * This is known by different names in different countries:
     * * BSB code (Australia)
     * * routing number (Canada, USA)
     * * sort code (UK)
     */
    public AccountIdentifiers withBankCode(JsonNullable<? extends String> bankCode) {
        Utils.checkNotNull(bankCode, "bankCode");
        this.bankCode = bankCode;
        return this;
    }

    /**
     * The ISO 9362 code (commonly called SWIFT code, SWIFT-BIC or BIC) for the account.
     */
    public AccountIdentifiers withBic(String bic) {
        Utils.checkNotNull(bic, "bic");
        this.bic = JsonNullable.of(bic);
        return this;
    }

    /**
     * The ISO 9362 code (commonly called SWIFT code, SWIFT-BIC or BIC) for the account.
     */
    public AccountIdentifiers withBic(JsonNullable<? extends String> bic) {
        Utils.checkNotNull(bic, "bic");
        this.bic = bic;
        return this;
    }

    /**
     * The international bank account number (IBAN) for the account, if known.
     */
    public AccountIdentifiers withIban(String iban) {
        Utils.checkNotNull(iban, "iban");
        this.iban = JsonNullable.of(iban);
        return this;
    }

    /**
     * The international bank account number (IBAN) for the account, if known.
     */
    public AccountIdentifiers withIban(JsonNullable<? extends String> iban) {
        Utils.checkNotNull(iban, "iban");
        this.iban = iban;
        return this;
    }

    /**
     * A portion of the actual account `number` to help account identification where number is tokenised (Plaid only)
     */
    public AccountIdentifiers withMaskedAccountNumber(String maskedAccountNumber) {
        Utils.checkNotNull(maskedAccountNumber, "maskedAccountNumber");
        this.maskedAccountNumber = JsonNullable.of(maskedAccountNumber);
        return this;
    }

    /**
     * A portion of the actual account `number` to help account identification where number is tokenised (Plaid only)
     */
    public AccountIdentifiers withMaskedAccountNumber(JsonNullable<? extends String> maskedAccountNumber) {
        Utils.checkNotNull(maskedAccountNumber, "maskedAccountNumber");
        this.maskedAccountNumber = maskedAccountNumber;
        return this;
    }

    /**
     * The account number for the account. When combined with the`bankCode`, this is usually enough to uniquely identify an account within a jurisdiction.
     */
    public AccountIdentifiers withNumber(String number) {
        Utils.checkNotNull(number, "number");
        this.number = JsonNullable.of(number);
        return this;
    }

    /**
     * The account number for the account. When combined with the`bankCode`, this is usually enough to uniquely identify an account within a jurisdiction.
     */
    public AccountIdentifiers withNumber(JsonNullable<? extends String> number) {
        Utils.checkNotNull(number, "number");
        this.number = number;
        return this;
    }

    /**
     * Detailed account category
     */
    public AccountIdentifiers withSubtype(String subtype) {
        Utils.checkNotNull(subtype, "subtype");
        this.subtype = JsonNullable.of(subtype);
        return this;
    }

    /**
     * Detailed account category
     */
    public AccountIdentifiers withSubtype(JsonNullable<? extends String> subtype) {
        Utils.checkNotNull(subtype, "subtype");
        this.subtype = subtype;
        return this;
    }

    /**
     * Type of account
     */
    public AccountIdentifiers withType(AccountIdentifierType type) {
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
        AccountIdentifiers other = (AccountIdentifiers) o;
        return 
            java.util.Objects.deepEquals(this.bankCode, other.bankCode) &&
            java.util.Objects.deepEquals(this.bic, other.bic) &&
            java.util.Objects.deepEquals(this.iban, other.iban) &&
            java.util.Objects.deepEquals(this.maskedAccountNumber, other.maskedAccountNumber) &&
            java.util.Objects.deepEquals(this.number, other.number) &&
            java.util.Objects.deepEquals(this.subtype, other.subtype) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            bankCode,
            bic,
            iban,
            maskedAccountNumber,
            number,
            subtype,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountIdentifiers.class,
                "bankCode", bankCode,
                "bic", bic,
                "iban", iban,
                "maskedAccountNumber", maskedAccountNumber,
                "number", number,
                "subtype", subtype,
                "type", type);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends String> bankCode = JsonNullable.undefined();
 
        private JsonNullable<? extends String> bic = JsonNullable.undefined();
 
        private JsonNullable<? extends String> iban = JsonNullable.undefined();
 
        private JsonNullable<? extends String> maskedAccountNumber = JsonNullable.undefined();
 
        private JsonNullable<? extends String> number = JsonNullable.undefined();
 
        private JsonNullable<? extends String> subtype = JsonNullable.undefined();
 
        private AccountIdentifierType type;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The local (usually national) routing number for the account.
         * 
         * This is known by different names in different countries:
         * * BSB code (Australia)
         * * routing number (Canada, USA)
         * * sort code (UK)
         */
        public Builder bankCode(String bankCode) {
            Utils.checkNotNull(bankCode, "bankCode");
            this.bankCode = JsonNullable.of(bankCode);
            return this;
        }

        /**
         * The local (usually national) routing number for the account.
         * 
         * This is known by different names in different countries:
         * * BSB code (Australia)
         * * routing number (Canada, USA)
         * * sort code (UK)
         */
        public Builder bankCode(JsonNullable<? extends String> bankCode) {
            Utils.checkNotNull(bankCode, "bankCode");
            this.bankCode = bankCode;
            return this;
        }

        /**
         * The ISO 9362 code (commonly called SWIFT code, SWIFT-BIC or BIC) for the account.
         */
        public Builder bic(String bic) {
            Utils.checkNotNull(bic, "bic");
            this.bic = JsonNullable.of(bic);
            return this;
        }

        /**
         * The ISO 9362 code (commonly called SWIFT code, SWIFT-BIC or BIC) for the account.
         */
        public Builder bic(JsonNullable<? extends String> bic) {
            Utils.checkNotNull(bic, "bic");
            this.bic = bic;
            return this;
        }

        /**
         * The international bank account number (IBAN) for the account, if known.
         */
        public Builder iban(String iban) {
            Utils.checkNotNull(iban, "iban");
            this.iban = JsonNullable.of(iban);
            return this;
        }

        /**
         * The international bank account number (IBAN) for the account, if known.
         */
        public Builder iban(JsonNullable<? extends String> iban) {
            Utils.checkNotNull(iban, "iban");
            this.iban = iban;
            return this;
        }

        /**
         * A portion of the actual account `number` to help account identification where number is tokenised (Plaid only)
         */
        public Builder maskedAccountNumber(String maskedAccountNumber) {
            Utils.checkNotNull(maskedAccountNumber, "maskedAccountNumber");
            this.maskedAccountNumber = JsonNullable.of(maskedAccountNumber);
            return this;
        }

        /**
         * A portion of the actual account `number` to help account identification where number is tokenised (Plaid only)
         */
        public Builder maskedAccountNumber(JsonNullable<? extends String> maskedAccountNumber) {
            Utils.checkNotNull(maskedAccountNumber, "maskedAccountNumber");
            this.maskedAccountNumber = maskedAccountNumber;
            return this;
        }

        /**
         * The account number for the account. When combined with the`bankCode`, this is usually enough to uniquely identify an account within a jurisdiction.
         */
        public Builder number(String number) {
            Utils.checkNotNull(number, "number");
            this.number = JsonNullable.of(number);
            return this;
        }

        /**
         * The account number for the account. When combined with the`bankCode`, this is usually enough to uniquely identify an account within a jurisdiction.
         */
        public Builder number(JsonNullable<? extends String> number) {
            Utils.checkNotNull(number, "number");
            this.number = number;
            return this;
        }

        /**
         * Detailed account category
         */
        public Builder subtype(String subtype) {
            Utils.checkNotNull(subtype, "subtype");
            this.subtype = JsonNullable.of(subtype);
            return this;
        }

        /**
         * Detailed account category
         */
        public Builder subtype(JsonNullable<? extends String> subtype) {
            Utils.checkNotNull(subtype, "subtype");
            this.subtype = subtype;
            return this;
        }

        /**
         * Type of account
         */
        public Builder type(AccountIdentifierType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }        
        
        public AccountIdentifiers build() {
            return new AccountIdentifiers(
                bankCode,
                bic,
                iban,
                maskedAccountNumber,
                number,
                subtype,
                type);
        }
    }
}
