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
import org.openapitools.jackson.nullable.JsonNullable;


public class ExpenseTransaction {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bankAccountRef")
    private Optional<? extends BankAccountReference> bankAccountRef;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contactRef")
    private Optional<? extends ContactRef> contactRef;

    /**
     * Currency the transaction was recorded in.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Rate to convert the total amount of the payment into the base currency for the company at the time of the payment.
     * 
     * Currency rates in Codat are implemented as the multiple of foreign currency units to each base currency unit.  
     * 
     * It is not possible to perform the currency conversion with two or more non-base currencies participating in the transaction. For example, if a company's base currency is USD, and it has a bill issued in EUR, then the bill payment must happen in USD or EUR.
     * 
     * Where the currency rate is provided by the underlying accounting platform, it will be available from Codat with the same precision (up to a maximum of 9 decimal places). 
     * 
     * For accounting platforms which do not provide an explicit currency rate, it is calculated as `baseCurrency / foreignCurrency` and will be returned to 9 decimal places.
     * 
     * ## Examples with base currency of GBP
     * 
     * | Foreign Currency | Foreign Amount | Currency Rate | Base Currency Amount (GBP) |
     * | :--------------- | :------------- | :------------ | :------------------------- |
     * | **USD**          | $20            | 0.781         | £15.62                     |
     * | **EUR**          | €20            | 0.885         | £17.70                     |
     * | **RUB**          | ₽20            | 0.011         | £0.22                      |
     * 
     * ## Examples with base currency of USD
     * 
     * | Foreign Currency | Foreign Amount | Currency Rate | Base Currency Amount (USD) |
     * | :--------------- | :------------- | :------------ | :------------------------- |
     * | **GBP**          | £20            | 1.277         | $25.54                     |
     * | **EUR**          | €20            | 1.134         | $22.68                     |
     * | **RUB**          | ₽20            | 0.015         | $0.30                      |
     * 
     * 
     * ### Integration-specific details
     * 
     * | Integration       | Scenario                                        | System behavior                                                                                                                                                      |
     * |-------------------|-------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * | QuickBooks Online | Transaction currency differs from base currency | If currency rate value is left `null`, a rate of 1 will be used by QBO by default. To override this, include the required currency rate in the expense transaction.  |
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currencyRate")
    private JsonNullable<? extends Double> currencyRate;

    /**
     * Your unique identifier for the transaction.
     */
    @JsonProperty("id")
    private String id;

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    @JsonProperty("issueDate")
    private String issueDate;

    /**
     * Array of transaction lines.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lines")
    private Optional<? extends java.util.List<ExpenseTransactionLine>> lines;

    /**
     * Name of the merchant where the purchase took place
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("merchantName")
    private Optional<? extends String> merchantName;

    /**
     * Any private, company notes about the transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("notes")
    private Optional<? extends String> notes;

    /**
     * For supported accouting platforms, setting this optional property to true will post the transaction to a drafted state.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postAsDraft")
    private JsonNullable<? extends Boolean> postAsDraft;

    /**
     * The type of transaction.
     */
    @JsonProperty("type")
    private ExpenseTransactionType type;

    public ExpenseTransaction(
            @JsonProperty("bankAccountRef") Optional<? extends BankAccountReference> bankAccountRef,
            @JsonProperty("contactRef") Optional<? extends ContactRef> contactRef,
            @JsonProperty("currency") String currency,
            @JsonProperty("currencyRate") JsonNullable<? extends Double> currencyRate,
            @JsonProperty("id") String id,
            @JsonProperty("issueDate") String issueDate,
            @JsonProperty("lines") Optional<? extends java.util.List<ExpenseTransactionLine>> lines,
            @JsonProperty("merchantName") Optional<? extends String> merchantName,
            @JsonProperty("notes") Optional<? extends String> notes,
            @JsonProperty("postAsDraft") JsonNullable<? extends Boolean> postAsDraft,
            @JsonProperty("type") ExpenseTransactionType type) {
        Utils.checkNotNull(bankAccountRef, "bankAccountRef");
        Utils.checkNotNull(contactRef, "contactRef");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(currencyRate, "currencyRate");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(issueDate, "issueDate");
        Utils.checkNotNull(lines, "lines");
        Utils.checkNotNull(merchantName, "merchantName");
        Utils.checkNotNull(notes, "notes");
        Utils.checkNotNull(postAsDraft, "postAsDraft");
        Utils.checkNotNull(type, "type");
        this.bankAccountRef = bankAccountRef;
        this.contactRef = contactRef;
        this.currency = currency;
        this.currencyRate = currencyRate;
        this.id = id;
        this.issueDate = issueDate;
        this.lines = lines;
        this.merchantName = merchantName;
        this.notes = notes;
        this.postAsDraft = postAsDraft;
        this.type = type;
    }

    public Optional<? extends BankAccountReference> bankAccountRef() {
        return bankAccountRef;
    }

    public Optional<? extends ContactRef> contactRef() {
        return contactRef;
    }

    /**
     * Currency the transaction was recorded in.
     */
    public String currency() {
        return currency;
    }

    /**
     * Rate to convert the total amount of the payment into the base currency for the company at the time of the payment.
     * 
     * Currency rates in Codat are implemented as the multiple of foreign currency units to each base currency unit.  
     * 
     * It is not possible to perform the currency conversion with two or more non-base currencies participating in the transaction. For example, if a company's base currency is USD, and it has a bill issued in EUR, then the bill payment must happen in USD or EUR.
     * 
     * Where the currency rate is provided by the underlying accounting platform, it will be available from Codat with the same precision (up to a maximum of 9 decimal places). 
     * 
     * For accounting platforms which do not provide an explicit currency rate, it is calculated as `baseCurrency / foreignCurrency` and will be returned to 9 decimal places.
     * 
     * ## Examples with base currency of GBP
     * 
     * | Foreign Currency | Foreign Amount | Currency Rate | Base Currency Amount (GBP) |
     * | :--------------- | :------------- | :------------ | :------------------------- |
     * | **USD**          | $20            | 0.781         | £15.62                     |
     * | **EUR**          | €20            | 0.885         | £17.70                     |
     * | **RUB**          | ₽20            | 0.011         | £0.22                      |
     * 
     * ## Examples with base currency of USD
     * 
     * | Foreign Currency | Foreign Amount | Currency Rate | Base Currency Amount (USD) |
     * | :--------------- | :------------- | :------------ | :------------------------- |
     * | **GBP**          | £20            | 1.277         | $25.54                     |
     * | **EUR**          | €20            | 1.134         | $22.68                     |
     * | **RUB**          | ₽20            | 0.015         | $0.30                      |
     * 
     * 
     * ### Integration-specific details
     * 
     * | Integration       | Scenario                                        | System behavior                                                                                                                                                      |
     * |-------------------|-------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * | QuickBooks Online | Transaction currency differs from base currency | If currency rate value is left `null`, a rate of 1 will be used by QBO by default. To override this, include the required currency rate in the expense transaction.  |
     */
    public JsonNullable<? extends Double> currencyRate() {
        return currencyRate;
    }

    /**
     * Your unique identifier for the transaction.
     */
    public String id() {
        return id;
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public String issueDate() {
        return issueDate;
    }

    /**
     * Array of transaction lines.
     */
    public Optional<? extends java.util.List<ExpenseTransactionLine>> lines() {
        return lines;
    }

    /**
     * Name of the merchant where the purchase took place
     */
    public Optional<? extends String> merchantName() {
        return merchantName;
    }

    /**
     * Any private, company notes about the transaction.
     */
    public Optional<? extends String> notes() {
        return notes;
    }

    /**
     * For supported accouting platforms, setting this optional property to true will post the transaction to a drafted state.
     */
    public JsonNullable<? extends Boolean> postAsDraft() {
        return postAsDraft;
    }

    /**
     * The type of transaction.
     */
    public ExpenseTransactionType type() {
        return type;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public ExpenseTransaction withBankAccountRef(BankAccountReference bankAccountRef) {
        Utils.checkNotNull(bankAccountRef, "bankAccountRef");
        this.bankAccountRef = Optional.ofNullable(bankAccountRef);
        return this;
    }
    
    public ExpenseTransaction withBankAccountRef(Optional<? extends BankAccountReference> bankAccountRef) {
        Utils.checkNotNull(bankAccountRef, "bankAccountRef");
        this.bankAccountRef = bankAccountRef;
        return this;
    }

    public ExpenseTransaction withContactRef(ContactRef contactRef) {
        Utils.checkNotNull(contactRef, "contactRef");
        this.contactRef = Optional.ofNullable(contactRef);
        return this;
    }
    
    public ExpenseTransaction withContactRef(Optional<? extends ContactRef> contactRef) {
        Utils.checkNotNull(contactRef, "contactRef");
        this.contactRef = contactRef;
        return this;
    }

    /**
     * Currency the transaction was recorded in.
     */
    public ExpenseTransaction withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * Rate to convert the total amount of the payment into the base currency for the company at the time of the payment.
     * 
     * Currency rates in Codat are implemented as the multiple of foreign currency units to each base currency unit.  
     * 
     * It is not possible to perform the currency conversion with two or more non-base currencies participating in the transaction. For example, if a company's base currency is USD, and it has a bill issued in EUR, then the bill payment must happen in USD or EUR.
     * 
     * Where the currency rate is provided by the underlying accounting platform, it will be available from Codat with the same precision (up to a maximum of 9 decimal places). 
     * 
     * For accounting platforms which do not provide an explicit currency rate, it is calculated as `baseCurrency / foreignCurrency` and will be returned to 9 decimal places.
     * 
     * ## Examples with base currency of GBP
     * 
     * | Foreign Currency | Foreign Amount | Currency Rate | Base Currency Amount (GBP) |
     * | :--------------- | :------------- | :------------ | :------------------------- |
     * | **USD**          | $20            | 0.781         | £15.62                     |
     * | **EUR**          | €20            | 0.885         | £17.70                     |
     * | **RUB**          | ₽20            | 0.011         | £0.22                      |
     * 
     * ## Examples with base currency of USD
     * 
     * | Foreign Currency | Foreign Amount | Currency Rate | Base Currency Amount (USD) |
     * | :--------------- | :------------- | :------------ | :------------------------- |
     * | **GBP**          | £20            | 1.277         | $25.54                     |
     * | **EUR**          | €20            | 1.134         | $22.68                     |
     * | **RUB**          | ₽20            | 0.015         | $0.30                      |
     * 
     * 
     * ### Integration-specific details
     * 
     * | Integration       | Scenario                                        | System behavior                                                                                                                                                      |
     * |-------------------|-------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * | QuickBooks Online | Transaction currency differs from base currency | If currency rate value is left `null`, a rate of 1 will be used by QBO by default. To override this, include the required currency rate in the expense transaction.  |
     */
    public ExpenseTransaction withCurrencyRate(double currencyRate) {
        Utils.checkNotNull(currencyRate, "currencyRate");
        this.currencyRate = JsonNullable.of(currencyRate);
        return this;
    }

    /**
     * Rate to convert the total amount of the payment into the base currency for the company at the time of the payment.
     * 
     * Currency rates in Codat are implemented as the multiple of foreign currency units to each base currency unit.  
     * 
     * It is not possible to perform the currency conversion with two or more non-base currencies participating in the transaction. For example, if a company's base currency is USD, and it has a bill issued in EUR, then the bill payment must happen in USD or EUR.
     * 
     * Where the currency rate is provided by the underlying accounting platform, it will be available from Codat with the same precision (up to a maximum of 9 decimal places). 
     * 
     * For accounting platforms which do not provide an explicit currency rate, it is calculated as `baseCurrency / foreignCurrency` and will be returned to 9 decimal places.
     * 
     * ## Examples with base currency of GBP
     * 
     * | Foreign Currency | Foreign Amount | Currency Rate | Base Currency Amount (GBP) |
     * | :--------------- | :------------- | :------------ | :------------------------- |
     * | **USD**          | $20            | 0.781         | £15.62                     |
     * | **EUR**          | €20            | 0.885         | £17.70                     |
     * | **RUB**          | ₽20            | 0.011         | £0.22                      |
     * 
     * ## Examples with base currency of USD
     * 
     * | Foreign Currency | Foreign Amount | Currency Rate | Base Currency Amount (USD) |
     * | :--------------- | :------------- | :------------ | :------------------------- |
     * | **GBP**          | £20            | 1.277         | $25.54                     |
     * | **EUR**          | €20            | 1.134         | $22.68                     |
     * | **RUB**          | ₽20            | 0.015         | $0.30                      |
     * 
     * 
     * ### Integration-specific details
     * 
     * | Integration       | Scenario                                        | System behavior                                                                                                                                                      |
     * |-------------------|-------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * | QuickBooks Online | Transaction currency differs from base currency | If currency rate value is left `null`, a rate of 1 will be used by QBO by default. To override this, include the required currency rate in the expense transaction.  |
     */
    public ExpenseTransaction withCurrencyRate(JsonNullable<? extends Double> currencyRate) {
        Utils.checkNotNull(currencyRate, "currencyRate");
        this.currencyRate = currencyRate;
        return this;
    }

    /**
     * Your unique identifier for the transaction.
     */
    public ExpenseTransaction withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public ExpenseTransaction withIssueDate(String issueDate) {
        Utils.checkNotNull(issueDate, "issueDate");
        this.issueDate = issueDate;
        return this;
    }

    /**
     * Array of transaction lines.
     */
    public ExpenseTransaction withLines(java.util.List<ExpenseTransactionLine> lines) {
        Utils.checkNotNull(lines, "lines");
        this.lines = Optional.ofNullable(lines);
        return this;
    }
    
    /**
     * Array of transaction lines.
     */
    public ExpenseTransaction withLines(Optional<? extends java.util.List<ExpenseTransactionLine>> lines) {
        Utils.checkNotNull(lines, "lines");
        this.lines = lines;
        return this;
    }

    /**
     * Name of the merchant where the purchase took place
     */
    public ExpenseTransaction withMerchantName(String merchantName) {
        Utils.checkNotNull(merchantName, "merchantName");
        this.merchantName = Optional.ofNullable(merchantName);
        return this;
    }
    
    /**
     * Name of the merchant where the purchase took place
     */
    public ExpenseTransaction withMerchantName(Optional<? extends String> merchantName) {
        Utils.checkNotNull(merchantName, "merchantName");
        this.merchantName = merchantName;
        return this;
    }

    /**
     * Any private, company notes about the transaction.
     */
    public ExpenseTransaction withNotes(String notes) {
        Utils.checkNotNull(notes, "notes");
        this.notes = Optional.ofNullable(notes);
        return this;
    }
    
    /**
     * Any private, company notes about the transaction.
     */
    public ExpenseTransaction withNotes(Optional<? extends String> notes) {
        Utils.checkNotNull(notes, "notes");
        this.notes = notes;
        return this;
    }

    /**
     * For supported accouting platforms, setting this optional property to true will post the transaction to a drafted state.
     */
    public ExpenseTransaction withPostAsDraft(boolean postAsDraft) {
        Utils.checkNotNull(postAsDraft, "postAsDraft");
        this.postAsDraft = JsonNullable.of(postAsDraft);
        return this;
    }

    /**
     * For supported accouting platforms, setting this optional property to true will post the transaction to a drafted state.
     */
    public ExpenseTransaction withPostAsDraft(JsonNullable<? extends Boolean> postAsDraft) {
        Utils.checkNotNull(postAsDraft, "postAsDraft");
        this.postAsDraft = postAsDraft;
        return this;
    }

    /**
     * The type of transaction.
     */
    public ExpenseTransaction withType(ExpenseTransactionType type) {
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
        ExpenseTransaction other = (ExpenseTransaction) o;
        return 
            java.util.Objects.deepEquals(this.bankAccountRef, other.bankAccountRef) &&
            java.util.Objects.deepEquals(this.contactRef, other.contactRef) &&
            java.util.Objects.deepEquals(this.currency, other.currency) &&
            java.util.Objects.deepEquals(this.currencyRate, other.currencyRate) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.issueDate, other.issueDate) &&
            java.util.Objects.deepEquals(this.lines, other.lines) &&
            java.util.Objects.deepEquals(this.merchantName, other.merchantName) &&
            java.util.Objects.deepEquals(this.notes, other.notes) &&
            java.util.Objects.deepEquals(this.postAsDraft, other.postAsDraft) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            bankAccountRef,
            contactRef,
            currency,
            currencyRate,
            id,
            issueDate,
            lines,
            merchantName,
            notes,
            postAsDraft,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExpenseTransaction.class,
                "bankAccountRef", bankAccountRef,
                "contactRef", contactRef,
                "currency", currency,
                "currencyRate", currencyRate,
                "id", id,
                "issueDate", issueDate,
                "lines", lines,
                "merchantName", merchantName,
                "notes", notes,
                "postAsDraft", postAsDraft,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<? extends BankAccountReference> bankAccountRef = Optional.empty();
 
        private Optional<? extends ContactRef> contactRef = Optional.empty();
 
        private String currency;
 
        private JsonNullable<? extends Double> currencyRate = JsonNullable.undefined();
 
        private String id;
 
        private String issueDate;
 
        private Optional<? extends java.util.List<ExpenseTransactionLine>> lines = Optional.empty();
 
        private Optional<? extends String> merchantName = Optional.empty();
 
        private Optional<? extends String> notes = Optional.empty();
 
        private JsonNullable<? extends Boolean> postAsDraft = JsonNullable.undefined();
 
        private ExpenseTransactionType type;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder bankAccountRef(BankAccountReference bankAccountRef) {
            Utils.checkNotNull(bankAccountRef, "bankAccountRef");
            this.bankAccountRef = Optional.ofNullable(bankAccountRef);
            return this;
        }
        
        public Builder bankAccountRef(Optional<? extends BankAccountReference> bankAccountRef) {
            Utils.checkNotNull(bankAccountRef, "bankAccountRef");
            this.bankAccountRef = bankAccountRef;
            return this;
        }

        public Builder contactRef(ContactRef contactRef) {
            Utils.checkNotNull(contactRef, "contactRef");
            this.contactRef = Optional.ofNullable(contactRef);
            return this;
        }
        
        public Builder contactRef(Optional<? extends ContactRef> contactRef) {
            Utils.checkNotNull(contactRef, "contactRef");
            this.contactRef = contactRef;
            return this;
        }

        /**
         * Currency the transaction was recorded in.
         */
        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }

        /**
         * Rate to convert the total amount of the payment into the base currency for the company at the time of the payment.
         * 
         * Currency rates in Codat are implemented as the multiple of foreign currency units to each base currency unit.  
         * 
         * It is not possible to perform the currency conversion with two or more non-base currencies participating in the transaction. For example, if a company's base currency is USD, and it has a bill issued in EUR, then the bill payment must happen in USD or EUR.
         * 
         * Where the currency rate is provided by the underlying accounting platform, it will be available from Codat with the same precision (up to a maximum of 9 decimal places). 
         * 
         * For accounting platforms which do not provide an explicit currency rate, it is calculated as `baseCurrency / foreignCurrency` and will be returned to 9 decimal places.
         * 
         * ## Examples with base currency of GBP
         * 
         * | Foreign Currency | Foreign Amount | Currency Rate | Base Currency Amount (GBP) |
         * | :--------------- | :------------- | :------------ | :------------------------- |
         * | **USD**          | $20            | 0.781         | £15.62                     |
         * | **EUR**          | €20            | 0.885         | £17.70                     |
         * | **RUB**          | ₽20            | 0.011         | £0.22                      |
         * 
         * ## Examples with base currency of USD
         * 
         * | Foreign Currency | Foreign Amount | Currency Rate | Base Currency Amount (USD) |
         * | :--------------- | :------------- | :------------ | :------------------------- |
         * | **GBP**          | £20            | 1.277         | $25.54                     |
         * | **EUR**          | €20            | 1.134         | $22.68                     |
         * | **RUB**          | ₽20            | 0.015         | $0.30                      |
         * 
         * 
         * ### Integration-specific details
         * 
         * | Integration       | Scenario                                        | System behavior                                                                                                                                                      |
         * |-------------------|-------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
         * | QuickBooks Online | Transaction currency differs from base currency | If currency rate value is left `null`, a rate of 1 will be used by QBO by default. To override this, include the required currency rate in the expense transaction.  |
         */
        public Builder currencyRate(double currencyRate) {
            Utils.checkNotNull(currencyRate, "currencyRate");
            this.currencyRate = JsonNullable.of(currencyRate);
            return this;
        }

        /**
         * Rate to convert the total amount of the payment into the base currency for the company at the time of the payment.
         * 
         * Currency rates in Codat are implemented as the multiple of foreign currency units to each base currency unit.  
         * 
         * It is not possible to perform the currency conversion with two or more non-base currencies participating in the transaction. For example, if a company's base currency is USD, and it has a bill issued in EUR, then the bill payment must happen in USD or EUR.
         * 
         * Where the currency rate is provided by the underlying accounting platform, it will be available from Codat with the same precision (up to a maximum of 9 decimal places). 
         * 
         * For accounting platforms which do not provide an explicit currency rate, it is calculated as `baseCurrency / foreignCurrency` and will be returned to 9 decimal places.
         * 
         * ## Examples with base currency of GBP
         * 
         * | Foreign Currency | Foreign Amount | Currency Rate | Base Currency Amount (GBP) |
         * | :--------------- | :------------- | :------------ | :------------------------- |
         * | **USD**          | $20            | 0.781         | £15.62                     |
         * | **EUR**          | €20            | 0.885         | £17.70                     |
         * | **RUB**          | ₽20            | 0.011         | £0.22                      |
         * 
         * ## Examples with base currency of USD
         * 
         * | Foreign Currency | Foreign Amount | Currency Rate | Base Currency Amount (USD) |
         * | :--------------- | :------------- | :------------ | :------------------------- |
         * | **GBP**          | £20            | 1.277         | $25.54                     |
         * | **EUR**          | €20            | 1.134         | $22.68                     |
         * | **RUB**          | ₽20            | 0.015         | $0.30                      |
         * 
         * 
         * ### Integration-specific details
         * 
         * | Integration       | Scenario                                        | System behavior                                                                                                                                                      |
         * |-------------------|-------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
         * | QuickBooks Online | Transaction currency differs from base currency | If currency rate value is left `null`, a rate of 1 will be used by QBO by default. To override this, include the required currency rate in the expense transaction.  |
         */
        public Builder currencyRate(JsonNullable<? extends Double> currencyRate) {
            Utils.checkNotNull(currencyRate, "currencyRate");
            this.currencyRate = currencyRate;
            return this;
        }

        /**
         * Your unique identifier for the transaction.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
         * 
         * ```
         * 2020-10-08T22:40:50Z
         * 2021-01-01T00:00:00
         * ```
         * 
         * 
         * 
         * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
         * 
         * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
         * - Unqualified local time: `2021-11-15T01:00:00`
         * - UTC time offsets: `2021-11-15T01:00:00-05:00`
         * 
         * &gt; Time zones
         * &gt; 
         * &gt; Not all dates from Codat will contain information about time zones.  
         * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
         */
        public Builder issueDate(String issueDate) {
            Utils.checkNotNull(issueDate, "issueDate");
            this.issueDate = issueDate;
            return this;
        }

        /**
         * Array of transaction lines.
         */
        public Builder lines(java.util.List<ExpenseTransactionLine> lines) {
            Utils.checkNotNull(lines, "lines");
            this.lines = Optional.ofNullable(lines);
            return this;
        }
        
        /**
         * Array of transaction lines.
         */
        public Builder lines(Optional<? extends java.util.List<ExpenseTransactionLine>> lines) {
            Utils.checkNotNull(lines, "lines");
            this.lines = lines;
            return this;
        }

        /**
         * Name of the merchant where the purchase took place
         */
        public Builder merchantName(String merchantName) {
            Utils.checkNotNull(merchantName, "merchantName");
            this.merchantName = Optional.ofNullable(merchantName);
            return this;
        }
        
        /**
         * Name of the merchant where the purchase took place
         */
        public Builder merchantName(Optional<? extends String> merchantName) {
            Utils.checkNotNull(merchantName, "merchantName");
            this.merchantName = merchantName;
            return this;
        }

        /**
         * Any private, company notes about the transaction.
         */
        public Builder notes(String notes) {
            Utils.checkNotNull(notes, "notes");
            this.notes = Optional.ofNullable(notes);
            return this;
        }
        
        /**
         * Any private, company notes about the transaction.
         */
        public Builder notes(Optional<? extends String> notes) {
            Utils.checkNotNull(notes, "notes");
            this.notes = notes;
            return this;
        }

        /**
         * For supported accouting platforms, setting this optional property to true will post the transaction to a drafted state.
         */
        public Builder postAsDraft(boolean postAsDraft) {
            Utils.checkNotNull(postAsDraft, "postAsDraft");
            this.postAsDraft = JsonNullable.of(postAsDraft);
            return this;
        }

        /**
         * For supported accouting platforms, setting this optional property to true will post the transaction to a drafted state.
         */
        public Builder postAsDraft(JsonNullable<? extends Boolean> postAsDraft) {
            Utils.checkNotNull(postAsDraft, "postAsDraft");
            this.postAsDraft = postAsDraft;
            return this;
        }

        /**
         * The type of transaction.
         */
        public Builder type(ExpenseTransactionType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public ExpenseTransaction build() {
            return new ExpenseTransaction(
                bankAccountRef,
                contactRef,
                currency,
                currencyRate,
                id,
                issueDate,
                lines,
                merchantName,
                notes,
                postAsDraft,
                type);
        }
    }
}

