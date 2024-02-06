/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class Payment {

    /**
     * Payment amount.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<? extends Double> amount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bankingTransactionRefs")
    private Optional<? extends java.util.List<BankingTransactionRef>> bankingTransactionRefs;

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
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("date")
    private Optional<? extends String> date;

    /**
     * ID of the invoice, which may be a GUID but it may be something else depending on the accounting platform.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    /**
     * The type of payment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("paymentType")
    private Optional<? extends String> paymentType;

    public Payment(
            @JsonProperty("amount") Optional<? extends Double> amount,
            @JsonProperty("bankingTransactionRefs") Optional<? extends java.util.List<BankingTransactionRef>> bankingTransactionRefs,
            @JsonProperty("currency") Optional<? extends String> currency,
            @JsonProperty("currencyRate") JsonNullable<? extends Double> currencyRate,
            @JsonProperty("date") Optional<? extends String> date,
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("paymentType") Optional<? extends String> paymentType) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(bankingTransactionRefs, "bankingTransactionRefs");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(currencyRate, "currencyRate");
        Utils.checkNotNull(date, "date");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(paymentType, "paymentType");
        this.amount = amount;
        this.bankingTransactionRefs = bankingTransactionRefs;
        this.currency = currency;
        this.currencyRate = currencyRate;
        this.date = date;
        this.id = id;
        this.paymentType = paymentType;
    }

    /**
     * Payment amount.
     */
    public Optional<? extends Double> amount() {
        return amount;
    }

    public Optional<? extends java.util.List<BankingTransactionRef>> bankingTransactionRefs() {
        return bankingTransactionRefs;
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
    public Optional<? extends String> date() {
        return date;
    }

    /**
     * ID of the invoice, which may be a GUID but it may be something else depending on the accounting platform.
     */
    public Optional<? extends String> id() {
        return id;
    }

    /**
     * The type of payment.
     */
    public Optional<? extends String> paymentType() {
        return paymentType;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Payment amount.
     */
    public Payment withAmount(double amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }
    
    /**
     * Payment amount.
     */
    public Payment withAmount(Optional<? extends Double> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public Payment withBankingTransactionRefs(java.util.List<BankingTransactionRef> bankingTransactionRefs) {
        Utils.checkNotNull(bankingTransactionRefs, "bankingTransactionRefs");
        this.bankingTransactionRefs = Optional.ofNullable(bankingTransactionRefs);
        return this;
    }
    
    public Payment withBankingTransactionRefs(Optional<? extends java.util.List<BankingTransactionRef>> bankingTransactionRefs) {
        Utils.checkNotNull(bankingTransactionRefs, "bankingTransactionRefs");
        this.bankingTransactionRefs = bankingTransactionRefs;
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
    public Payment withCurrency(String currency) {
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
    public Payment withCurrency(Optional<? extends String> currency) {
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
    public Payment withCurrencyRate(double currencyRate) {
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
    public Payment withCurrencyRate(JsonNullable<? extends Double> currencyRate) {
        Utils.checkNotNull(currencyRate, "currencyRate");
        this.currencyRate = currencyRate;
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
    public Payment withDate(String date) {
        Utils.checkNotNull(date, "date");
        this.date = Optional.ofNullable(date);
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
    public Payment withDate(Optional<? extends String> date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
        return this;
    }

    /**
     * ID of the invoice, which may be a GUID but it may be something else depending on the accounting platform.
     */
    public Payment withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }
    
    /**
     * ID of the invoice, which may be a GUID but it may be something else depending on the accounting platform.
     */
    public Payment withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The type of payment.
     */
    public Payment withPaymentType(String paymentType) {
        Utils.checkNotNull(paymentType, "paymentType");
        this.paymentType = Optional.ofNullable(paymentType);
        return this;
    }
    
    /**
     * The type of payment.
     */
    public Payment withPaymentType(Optional<? extends String> paymentType) {
        Utils.checkNotNull(paymentType, "paymentType");
        this.paymentType = paymentType;
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
        Payment other = (Payment) o;
        return 
            java.util.Objects.deepEquals(this.amount, other.amount) &&
            java.util.Objects.deepEquals(this.bankingTransactionRefs, other.bankingTransactionRefs) &&
            java.util.Objects.deepEquals(this.currency, other.currency) &&
            java.util.Objects.deepEquals(this.currencyRate, other.currencyRate) &&
            java.util.Objects.deepEquals(this.date, other.date) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.paymentType, other.paymentType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            amount,
            bankingTransactionRefs,
            currency,
            currencyRate,
            date,
            id,
            paymentType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Payment.class,
                "amount", amount,
                "bankingTransactionRefs", bankingTransactionRefs,
                "currency", currency,
                "currencyRate", currencyRate,
                "date", date,
                "id", id,
                "paymentType", paymentType);
    }
    
    public final static class Builder {
 
        private Optional<? extends Double> amount = Optional.empty();
 
        private Optional<? extends java.util.List<BankingTransactionRef>> bankingTransactionRefs = Optional.empty();
 
        private Optional<? extends String> currency = Optional.empty();
 
        private JsonNullable<? extends Double> currencyRate = JsonNullable.undefined();
 
        private Optional<? extends String> date = Optional.empty();
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends String> paymentType = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Payment amount.
         */
        public Builder amount(double amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }
        
        /**
         * Payment amount.
         */
        public Builder amount(Optional<? extends Double> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        public Builder bankingTransactionRefs(java.util.List<BankingTransactionRef> bankingTransactionRefs) {
            Utils.checkNotNull(bankingTransactionRefs, "bankingTransactionRefs");
            this.bankingTransactionRefs = Optional.ofNullable(bankingTransactionRefs);
            return this;
        }
        
        public Builder bankingTransactionRefs(Optional<? extends java.util.List<BankingTransactionRef>> bankingTransactionRefs) {
            Utils.checkNotNull(bankingTransactionRefs, "bankingTransactionRefs");
            this.bankingTransactionRefs = bankingTransactionRefs;
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
        public Builder date(String date) {
            Utils.checkNotNull(date, "date");
            this.date = Optional.ofNullable(date);
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
        public Builder date(Optional<? extends String> date) {
            Utils.checkNotNull(date, "date");
            this.date = date;
            return this;
        }

        /**
         * ID of the invoice, which may be a GUID but it may be something else depending on the accounting platform.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }
        
        /**
         * ID of the invoice, which may be a GUID but it may be something else depending on the accounting platform.
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The type of payment.
         */
        public Builder paymentType(String paymentType) {
            Utils.checkNotNull(paymentType, "paymentType");
            this.paymentType = Optional.ofNullable(paymentType);
            return this;
        }
        
        /**
         * The type of payment.
         */
        public Builder paymentType(Optional<? extends String> paymentType) {
            Utils.checkNotNull(paymentType, "paymentType");
            this.paymentType = paymentType;
            return this;
        }        
        
        public Payment build() {
            return new Payment(
                amount,
                bankingTransactionRefs,
                currency,
                currencyRate,
                date,
                id,
                paymentType);
        }
    }
}
