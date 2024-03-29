/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.accounting.utils.LazySingletonValue;
import io.codat.accounting.utils.SpeakeasyMetadata;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class UpdateBillRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private JsonNullable<? extends io.codat.accounting.models.components.Bill> bill;

    /**
     * Unique identifier for a bill.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=billId")
    private String billId;

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
     * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting platform, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=forceUpdate")
    private Optional<? extends Boolean> forceUpdate;

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=timeoutInMinutes")
    private Optional<? extends Integer> timeoutInMinutes;

    public UpdateBillRequest(
            JsonNullable<? extends io.codat.accounting.models.components.Bill> bill,
            String billId,
            String companyId,
            String connectionId,
            Optional<? extends Boolean> forceUpdate,
            Optional<? extends Integer> timeoutInMinutes) {
        Utils.checkNotNull(bill, "bill");
        Utils.checkNotNull(billId, "billId");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(forceUpdate, "forceUpdate");
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.bill = bill;
        this.billId = billId;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.forceUpdate = forceUpdate;
        this.timeoutInMinutes = timeoutInMinutes;
    }

    public JsonNullable<? extends io.codat.accounting.models.components.Bill> bill() {
        return bill;
    }

    /**
     * Unique identifier for a bill.
     */
    public String billId() {
        return billId;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a connection.
     */
    public String connectionId() {
        return connectionId;
    }

    /**
     * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting platform, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
     */
    public Optional<? extends Boolean> forceUpdate() {
        return forceUpdate;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public Optional<? extends Integer> timeoutInMinutes() {
        return timeoutInMinutes;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public UpdateBillRequest withBill(io.codat.accounting.models.components.Bill bill) {
        Utils.checkNotNull(bill, "bill");
        this.bill = JsonNullable.of(bill);
        return this;
    }

    public UpdateBillRequest withBill(JsonNullable<? extends io.codat.accounting.models.components.Bill> bill) {
        Utils.checkNotNull(bill, "bill");
        this.bill = bill;
        return this;
    }

    /**
     * Unique identifier for a bill.
     */
    public UpdateBillRequest withBillId(String billId) {
        Utils.checkNotNull(billId, "billId");
        this.billId = billId;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public UpdateBillRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public UpdateBillRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting platform, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
     */
    public UpdateBillRequest withForceUpdate(boolean forceUpdate) {
        Utils.checkNotNull(forceUpdate, "forceUpdate");
        this.forceUpdate = Optional.ofNullable(forceUpdate);
        return this;
    }
    
    /**
     * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting platform, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
     */
    public UpdateBillRequest withForceUpdate(Optional<? extends Boolean> forceUpdate) {
        Utils.checkNotNull(forceUpdate, "forceUpdate");
        this.forceUpdate = forceUpdate;
        return this;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public UpdateBillRequest withTimeoutInMinutes(int timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = Optional.ofNullable(timeoutInMinutes);
        return this;
    }
    
    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public UpdateBillRequest withTimeoutInMinutes(Optional<? extends Integer> timeoutInMinutes) {
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
        UpdateBillRequest other = (UpdateBillRequest) o;
        return 
            java.util.Objects.deepEquals(this.bill, other.bill) &&
            java.util.Objects.deepEquals(this.billId, other.billId) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.forceUpdate, other.forceUpdate) &&
            java.util.Objects.deepEquals(this.timeoutInMinutes, other.timeoutInMinutes);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            bill,
            billId,
            companyId,
            connectionId,
            forceUpdate,
            timeoutInMinutes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateBillRequest.class,
                "bill", bill,
                "billId", billId,
                "companyId", companyId,
                "connectionId", connectionId,
                "forceUpdate", forceUpdate,
                "timeoutInMinutes", timeoutInMinutes);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends io.codat.accounting.models.components.Bill> bill = JsonNullable.undefined();
 
        private String billId;
 
        private String companyId;
 
        private String connectionId;
 
        private Optional<? extends Boolean> forceUpdate;
 
        private Optional<? extends Integer> timeoutInMinutes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder bill(io.codat.accounting.models.components.Bill bill) {
            Utils.checkNotNull(bill, "bill");
            this.bill = JsonNullable.of(bill);
            return this;
        }

        public Builder bill(JsonNullable<? extends io.codat.accounting.models.components.Bill> bill) {
            Utils.checkNotNull(bill, "bill");
            this.bill = bill;
            return this;
        }

        /**
         * Unique identifier for a bill.
         */
        public Builder billId(String billId) {
            Utils.checkNotNull(billId, "billId");
            this.billId = billId;
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
         * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting platform, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
         */
        public Builder forceUpdate(boolean forceUpdate) {
            Utils.checkNotNull(forceUpdate, "forceUpdate");
            this.forceUpdate = Optional.ofNullable(forceUpdate);
            return this;
        }
        
        /**
         * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting platform, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
         */
        public Builder forceUpdate(Optional<? extends Boolean> forceUpdate) {
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
        public Builder timeoutInMinutes(Optional<? extends Integer> timeoutInMinutes) {
            Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        
        public UpdateBillRequest build() {
            if (forceUpdate == null) {
                forceUpdate = _SINGLETON_VALUE_ForceUpdate.value();
            }
            return new UpdateBillRequest(
                bill,
                billId,
                companyId,
                connectionId,
                forceUpdate,
                timeoutInMinutes);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_ForceUpdate =
                new LazySingletonValue<>(
                        "forceUpdate",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}

