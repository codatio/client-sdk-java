/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class AccountingPaymentAllocation {

    @JsonProperty("allocation")
    private Allocation allocation;

    @JsonProperty("payment")
    private PaymentAllocationPayment payment;

    @JsonCreator
    public AccountingPaymentAllocation(
            @JsonProperty("allocation") Allocation allocation,
            @JsonProperty("payment") PaymentAllocationPayment payment) {
        Utils.checkNotNull(allocation, "allocation");
        Utils.checkNotNull(payment, "payment");
        this.allocation = allocation;
        this.payment = payment;
    }

    @JsonIgnore
    public Allocation allocation() {
        return allocation;
    }

    @JsonIgnore
    public PaymentAllocationPayment payment() {
        return payment;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AccountingPaymentAllocation withAllocation(Allocation allocation) {
        Utils.checkNotNull(allocation, "allocation");
        this.allocation = allocation;
        return this;
    }

    public AccountingPaymentAllocation withPayment(PaymentAllocationPayment payment) {
        Utils.checkNotNull(payment, "payment");
        this.payment = payment;
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
        AccountingPaymentAllocation other = (AccountingPaymentAllocation) o;
        return 
            Objects.deepEquals(this.allocation, other.allocation) &&
            Objects.deepEquals(this.payment, other.payment);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            allocation,
            payment);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingPaymentAllocation.class,
                "allocation", allocation,
                "payment", payment);
    }
    
    public final static class Builder {
 
        private Allocation allocation;
 
        private PaymentAllocationPayment payment;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder allocation(Allocation allocation) {
            Utils.checkNotNull(allocation, "allocation");
            this.allocation = allocation;
            return this;
        }

        public Builder payment(PaymentAllocationPayment payment) {
            Utils.checkNotNull(payment, "payment");
            this.payment = payment;
            return this;
        }
        
        public AccountingPaymentAllocation build() {
            return new AccountingPaymentAllocation(
                allocation,
                payment);
        }
    }
}

