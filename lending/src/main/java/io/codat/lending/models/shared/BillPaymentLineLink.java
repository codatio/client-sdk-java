/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class BillPaymentLineLink {

    /**
     * Amount by which the balance of the linked entity is altered, in the currency of the linked entity.
     * 
     * - A negative link amount reduces the outstanding amount on the accounts payable account.
     * - A positive link amount increases the outstanding amount on the accounts payable account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private JsonNullable<? extends BigDecimal> amount;

    /**
     * Rate to convert the total amount of the payment into the base currency for the company at the time of the payment.
     * 
     * Currency rates in Codat are implemented as the multiple of foreign currency units to each base currency unit.  
     * 
     * It is not possible to perform the currency conversion with two or more non-base currencies participating in the transaction. For example, if a company's base currency is USD, and it has a bill issued in EUR, then the bill payment must happen in USD or EUR.
     * 
     * Where the currency rate is provided by the underlying accounting software, it will be available from Codat with the same precision (up to a maximum of 9 decimal places). 
     * 
     * For accounting software which do not provide an explicit currency rate, it is calculated as `baseCurrency / foreignCurrency` and will be returned to 9 decimal places.
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
     * | QuickBooks Online | Transaction currency differs from base currency | If currency rate value is left `null`, a rate of 1 will be used by QBO by default. To override this, specify a currencyRate in the request body.  |
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currencyRate")
    private JsonNullable<? extends BigDecimal> currencyRate;

    /**
     * Unique identifier of the transaction represented by the link.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

    /**
     * Types of links to bill payment lines.
     */
    @JsonProperty("type")
    private BillPaymentLineLinkType type;

    @JsonCreator
    public BillPaymentLineLink(
            @JsonProperty("amount") JsonNullable<? extends BigDecimal> amount,
            @JsonProperty("currencyRate") JsonNullable<? extends BigDecimal> currencyRate,
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("type") BillPaymentLineLinkType type) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(currencyRate, "currencyRate");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(type, "type");
        this.amount = amount;
        this.currencyRate = currencyRate;
        this.id = id;
        this.type = type;
    }
    
    public BillPaymentLineLink(
            BillPaymentLineLinkType type) {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), type);
    }

    /**
     * Amount by which the balance of the linked entity is altered, in the currency of the linked entity.
     * 
     * - A negative link amount reduces the outstanding amount on the accounts payable account.
     * - A positive link amount increases the outstanding amount on the accounts payable account.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<BigDecimal> amount() {
        return (JsonNullable<BigDecimal>) amount;
    }

    /**
     * Rate to convert the total amount of the payment into the base currency for the company at the time of the payment.
     * 
     * Currency rates in Codat are implemented as the multiple of foreign currency units to each base currency unit.  
     * 
     * It is not possible to perform the currency conversion with two or more non-base currencies participating in the transaction. For example, if a company's base currency is USD, and it has a bill issued in EUR, then the bill payment must happen in USD or EUR.
     * 
     * Where the currency rate is provided by the underlying accounting software, it will be available from Codat with the same precision (up to a maximum of 9 decimal places). 
     * 
     * For accounting software which do not provide an explicit currency rate, it is calculated as `baseCurrency / foreignCurrency` and will be returned to 9 decimal places.
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
     * | QuickBooks Online | Transaction currency differs from base currency | If currency rate value is left `null`, a rate of 1 will be used by QBO by default. To override this, specify a currencyRate in the request body.  |
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<BigDecimal> currencyRate() {
        return (JsonNullable<BigDecimal>) currencyRate;
    }

    /**
     * Unique identifier of the transaction represented by the link.
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
    }

    /**
     * Types of links to bill payment lines.
     */
    @JsonIgnore
    public BillPaymentLineLinkType type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Amount by which the balance of the linked entity is altered, in the currency of the linked entity.
     * 
     * - A negative link amount reduces the outstanding amount on the accounts payable account.
     * - A positive link amount increases the outstanding amount on the accounts payable account.
     */
    public BillPaymentLineLink withAmount(BigDecimal amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = JsonNullable.of(amount);
        return this;
    }

        /**
         * Amount by which the balance of the linked entity is altered, in the currency of the linked entity.
         * 
         * - A negative link amount reduces the outstanding amount on the accounts payable account.
         * - A positive link amount increases the outstanding amount on the accounts payable account.
         */
    public BillPaymentLineLink withAmount(double amount) {
        this.amount = JsonNullable.of(BigDecimal.valueOf(amount));
        return this;
    }

    /**
     * Amount by which the balance of the linked entity is altered, in the currency of the linked entity.
     * 
     * - A negative link amount reduces the outstanding amount on the accounts payable account.
     * - A positive link amount increases the outstanding amount on the accounts payable account.
     */
    public BillPaymentLineLink withAmount(JsonNullable<? extends BigDecimal> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * Rate to convert the total amount of the payment into the base currency for the company at the time of the payment.
     * 
     * Currency rates in Codat are implemented as the multiple of foreign currency units to each base currency unit.  
     * 
     * It is not possible to perform the currency conversion with two or more non-base currencies participating in the transaction. For example, if a company's base currency is USD, and it has a bill issued in EUR, then the bill payment must happen in USD or EUR.
     * 
     * Where the currency rate is provided by the underlying accounting software, it will be available from Codat with the same precision (up to a maximum of 9 decimal places). 
     * 
     * For accounting software which do not provide an explicit currency rate, it is calculated as `baseCurrency / foreignCurrency` and will be returned to 9 decimal places.
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
     * | QuickBooks Online | Transaction currency differs from base currency | If currency rate value is left `null`, a rate of 1 will be used by QBO by default. To override this, specify a currencyRate in the request body.  |
     */
    public BillPaymentLineLink withCurrencyRate(BigDecimal currencyRate) {
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
         * Where the currency rate is provided by the underlying accounting software, it will be available from Codat with the same precision (up to a maximum of 9 decimal places). 
         * 
         * For accounting software which do not provide an explicit currency rate, it is calculated as `baseCurrency / foreignCurrency` and will be returned to 9 decimal places.
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
         * | QuickBooks Online | Transaction currency differs from base currency | If currency rate value is left `null`, a rate of 1 will be used by QBO by default. To override this, specify a currencyRate in the request body.  |
         */
    public BillPaymentLineLink withCurrencyRate(double currencyRate) {
        this.currencyRate = JsonNullable.of(BigDecimal.valueOf(currencyRate));
        return this;
    }

    /**
     * Rate to convert the total amount of the payment into the base currency for the company at the time of the payment.
     * 
     * Currency rates in Codat are implemented as the multiple of foreign currency units to each base currency unit.  
     * 
     * It is not possible to perform the currency conversion with two or more non-base currencies participating in the transaction. For example, if a company's base currency is USD, and it has a bill issued in EUR, then the bill payment must happen in USD or EUR.
     * 
     * Where the currency rate is provided by the underlying accounting software, it will be available from Codat with the same precision (up to a maximum of 9 decimal places). 
     * 
     * For accounting software which do not provide an explicit currency rate, it is calculated as `baseCurrency / foreignCurrency` and will be returned to 9 decimal places.
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
     * | QuickBooks Online | Transaction currency differs from base currency | If currency rate value is left `null`, a rate of 1 will be used by QBO by default. To override this, specify a currencyRate in the request body.  |
     */
    public BillPaymentLineLink withCurrencyRate(JsonNullable<? extends BigDecimal> currencyRate) {
        Utils.checkNotNull(currencyRate, "currencyRate");
        this.currencyRate = currencyRate;
        return this;
    }

    /**
     * Unique identifier of the transaction represented by the link.
     */
    public BillPaymentLineLink withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier of the transaction represented by the link.
     */
    public BillPaymentLineLink withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Types of links to bill payment lines.
     */
    public BillPaymentLineLink withType(BillPaymentLineLinkType type) {
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
        BillPaymentLineLink other = (BillPaymentLineLink) o;
        return 
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.currencyRate, other.currencyRate) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            currencyRate,
            id,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BillPaymentLineLink.class,
                "amount", amount,
                "currencyRate", currencyRate,
                "id", id,
                "type", type);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends BigDecimal> amount = JsonNullable.undefined();
 
        private JsonNullable<? extends BigDecimal> currencyRate = JsonNullable.undefined();
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private BillPaymentLineLinkType type;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Amount by which the balance of the linked entity is altered, in the currency of the linked entity.
         * 
         * - A negative link amount reduces the outstanding amount on the accounts payable account.
         * - A positive link amount increases the outstanding amount on the accounts payable account.
         */
        public Builder amount(BigDecimal amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = JsonNullable.of(amount);
            return this;
        }

        /**
         * Amount by which the balance of the linked entity is altered, in the currency of the linked entity.
         * 
         * - A negative link amount reduces the outstanding amount on the accounts payable account.
         * - A positive link amount increases the outstanding amount on the accounts payable account.
         */
        public Builder amount(double amount) {
            this.amount = JsonNullable.of(BigDecimal.valueOf(amount));
            return this;
        }

        /**
         * Amount by which the balance of the linked entity is altered, in the currency of the linked entity.
         * 
         * - A negative link amount reduces the outstanding amount on the accounts payable account.
         * - A positive link amount increases the outstanding amount on the accounts payable account.
         */
        public Builder amount(JsonNullable<? extends BigDecimal> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        /**
         * Rate to convert the total amount of the payment into the base currency for the company at the time of the payment.
         * 
         * Currency rates in Codat are implemented as the multiple of foreign currency units to each base currency unit.  
         * 
         * It is not possible to perform the currency conversion with two or more non-base currencies participating in the transaction. For example, if a company's base currency is USD, and it has a bill issued in EUR, then the bill payment must happen in USD or EUR.
         * 
         * Where the currency rate is provided by the underlying accounting software, it will be available from Codat with the same precision (up to a maximum of 9 decimal places). 
         * 
         * For accounting software which do not provide an explicit currency rate, it is calculated as `baseCurrency / foreignCurrency` and will be returned to 9 decimal places.
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
         * | QuickBooks Online | Transaction currency differs from base currency | If currency rate value is left `null`, a rate of 1 will be used by QBO by default. To override this, specify a currencyRate in the request body.  |
         */
        public Builder currencyRate(BigDecimal currencyRate) {
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
         * Where the currency rate is provided by the underlying accounting software, it will be available from Codat with the same precision (up to a maximum of 9 decimal places). 
         * 
         * For accounting software which do not provide an explicit currency rate, it is calculated as `baseCurrency / foreignCurrency` and will be returned to 9 decimal places.
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
         * | QuickBooks Online | Transaction currency differs from base currency | If currency rate value is left `null`, a rate of 1 will be used by QBO by default. To override this, specify a currencyRate in the request body.  |
         */
        public Builder currencyRate(double currencyRate) {
            this.currencyRate = JsonNullable.of(BigDecimal.valueOf(currencyRate));
            return this;
        }

        /**
         * Rate to convert the total amount of the payment into the base currency for the company at the time of the payment.
         * 
         * Currency rates in Codat are implemented as the multiple of foreign currency units to each base currency unit.  
         * 
         * It is not possible to perform the currency conversion with two or more non-base currencies participating in the transaction. For example, if a company's base currency is USD, and it has a bill issued in EUR, then the bill payment must happen in USD or EUR.
         * 
         * Where the currency rate is provided by the underlying accounting software, it will be available from Codat with the same precision (up to a maximum of 9 decimal places). 
         * 
         * For accounting software which do not provide an explicit currency rate, it is calculated as `baseCurrency / foreignCurrency` and will be returned to 9 decimal places.
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
         * | QuickBooks Online | Transaction currency differs from base currency | If currency rate value is left `null`, a rate of 1 will be used by QBO by default. To override this, specify a currencyRate in the request body.  |
         */
        public Builder currencyRate(JsonNullable<? extends BigDecimal> currencyRate) {
            Utils.checkNotNull(currencyRate, "currencyRate");
            this.currencyRate = currencyRate;
            return this;
        }

        /**
         * Unique identifier of the transaction represented by the link.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * Unique identifier of the transaction represented by the link.
         */
        public Builder id(JsonNullable<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Types of links to bill payment lines.
         */
        public Builder type(BillPaymentLineLinkType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public BillPaymentLineLink build() {
            return new BillPaymentLineLink(
                amount,
                currencyRate,
                id,
                type);
        }
    }
}

