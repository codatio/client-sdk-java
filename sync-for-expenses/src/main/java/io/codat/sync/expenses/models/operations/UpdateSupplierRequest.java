/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.models.components.Supplier;
import io.codat.sync.expenses.utils.LazySingletonValue;
import io.codat.sync.expenses.utils.SpeakeasyMetadata;
import io.codat.sync.expenses.utils.Utils;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class UpdateSupplierRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private JsonNullable<? extends Supplier> supplier;

    /**
     * Allow a sync upon push completion.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=allowSyncOnPushComplete")
    private Optional<Boolean> allowSyncOnPushComplete;

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
     * Unique identifier for a supplier.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=supplierId")
    private String supplierId;

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=timeoutInMinutes")
    private Optional<Integer> timeoutInMinutes;

    @JsonCreator
    public UpdateSupplierRequest(
            JsonNullable<? extends Supplier> supplier,
            Optional<Boolean> allowSyncOnPushComplete,
            String companyId,
            String connectionId,
            Optional<Boolean> forceUpdate,
            String supplierId,
            Optional<Integer> timeoutInMinutes) {
        Utils.checkNotNull(supplier, "supplier");
        Utils.checkNotNull(allowSyncOnPushComplete, "allowSyncOnPushComplete");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(forceUpdate, "forceUpdate");
        Utils.checkNotNull(supplierId, "supplierId");
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.supplier = supplier;
        this.allowSyncOnPushComplete = allowSyncOnPushComplete;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.forceUpdate = forceUpdate;
        this.supplierId = supplierId;
        this.timeoutInMinutes = timeoutInMinutes;
    }
    
    public UpdateSupplierRequest(
            String companyId,
            String connectionId,
            String supplierId) {
        this(JsonNullable.undefined(), Optional.empty(), companyId, connectionId, Optional.empty(), supplierId, Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Supplier> supplier() {
        return (JsonNullable<Supplier>) supplier;
    }

    /**
     * Allow a sync upon push completion.
     */
    @JsonIgnore
    public Optional<Boolean> allowSyncOnPushComplete() {
        return allowSyncOnPushComplete;
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
     * Unique identifier for a supplier.
     */
    @JsonIgnore
    public String supplierId() {
        return supplierId;
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

    public UpdateSupplierRequest withSupplier(Supplier supplier) {
        Utils.checkNotNull(supplier, "supplier");
        this.supplier = JsonNullable.of(supplier);
        return this;
    }

    public UpdateSupplierRequest withSupplier(JsonNullable<? extends Supplier> supplier) {
        Utils.checkNotNull(supplier, "supplier");
        this.supplier = supplier;
        return this;
    }

    /**
     * Allow a sync upon push completion.
     */
    public UpdateSupplierRequest withAllowSyncOnPushComplete(boolean allowSyncOnPushComplete) {
        Utils.checkNotNull(allowSyncOnPushComplete, "allowSyncOnPushComplete");
        this.allowSyncOnPushComplete = Optional.ofNullable(allowSyncOnPushComplete);
        return this;
    }

    /**
     * Allow a sync upon push completion.
     */
    public UpdateSupplierRequest withAllowSyncOnPushComplete(Optional<Boolean> allowSyncOnPushComplete) {
        Utils.checkNotNull(allowSyncOnPushComplete, "allowSyncOnPushComplete");
        this.allowSyncOnPushComplete = allowSyncOnPushComplete;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public UpdateSupplierRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public UpdateSupplierRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting software, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
     */
    public UpdateSupplierRequest withForceUpdate(boolean forceUpdate) {
        Utils.checkNotNull(forceUpdate, "forceUpdate");
        this.forceUpdate = Optional.ofNullable(forceUpdate);
        return this;
    }

    /**
     * When updating data in the destination platform Codat checks the `sourceModifiedDate` against the `lastupdated` date from the accounting software, if they're different Codat will return an error suggesting you should initiate another pull of the data. If this is set to `true` then the update will override this check.
     */
    public UpdateSupplierRequest withForceUpdate(Optional<Boolean> forceUpdate) {
        Utils.checkNotNull(forceUpdate, "forceUpdate");
        this.forceUpdate = forceUpdate;
        return this;
    }

    /**
     * Unique identifier for a supplier.
     */
    public UpdateSupplierRequest withSupplierId(String supplierId) {
        Utils.checkNotNull(supplierId, "supplierId");
        this.supplierId = supplierId;
        return this;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public UpdateSupplierRequest withTimeoutInMinutes(int timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = Optional.ofNullable(timeoutInMinutes);
        return this;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public UpdateSupplierRequest withTimeoutInMinutes(Optional<Integer> timeoutInMinutes) {
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
        UpdateSupplierRequest other = (UpdateSupplierRequest) o;
        return 
            Objects.deepEquals(this.supplier, other.supplier) &&
            Objects.deepEquals(this.allowSyncOnPushComplete, other.allowSyncOnPushComplete) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.forceUpdate, other.forceUpdate) &&
            Objects.deepEquals(this.supplierId, other.supplierId) &&
            Objects.deepEquals(this.timeoutInMinutes, other.timeoutInMinutes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            supplier,
            allowSyncOnPushComplete,
            companyId,
            connectionId,
            forceUpdate,
            supplierId,
            timeoutInMinutes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateSupplierRequest.class,
                "supplier", supplier,
                "allowSyncOnPushComplete", allowSyncOnPushComplete,
                "companyId", companyId,
                "connectionId", connectionId,
                "forceUpdate", forceUpdate,
                "supplierId", supplierId,
                "timeoutInMinutes", timeoutInMinutes);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends Supplier> supplier = JsonNullable.undefined();
 
        private Optional<Boolean> allowSyncOnPushComplete;
 
        private String companyId;
 
        private String connectionId;
 
        private Optional<Boolean> forceUpdate;
 
        private String supplierId;
 
        private Optional<Integer> timeoutInMinutes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder supplier(Supplier supplier) {
            Utils.checkNotNull(supplier, "supplier");
            this.supplier = JsonNullable.of(supplier);
            return this;
        }

        public Builder supplier(JsonNullable<? extends Supplier> supplier) {
            Utils.checkNotNull(supplier, "supplier");
            this.supplier = supplier;
            return this;
        }

        /**
         * Allow a sync upon push completion.
         */
        public Builder allowSyncOnPushComplete(boolean allowSyncOnPushComplete) {
            Utils.checkNotNull(allowSyncOnPushComplete, "allowSyncOnPushComplete");
            this.allowSyncOnPushComplete = Optional.ofNullable(allowSyncOnPushComplete);
            return this;
        }

        /**
         * Allow a sync upon push completion.
         */
        public Builder allowSyncOnPushComplete(Optional<Boolean> allowSyncOnPushComplete) {
            Utils.checkNotNull(allowSyncOnPushComplete, "allowSyncOnPushComplete");
            this.allowSyncOnPushComplete = allowSyncOnPushComplete;
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
         * Unique identifier for a supplier.
         */
        public Builder supplierId(String supplierId) {
            Utils.checkNotNull(supplierId, "supplierId");
            this.supplierId = supplierId;
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
        
        public UpdateSupplierRequest build() {
            if (allowSyncOnPushComplete == null) {
                allowSyncOnPushComplete = _SINGLETON_VALUE_AllowSyncOnPushComplete.value();
            }
            if (forceUpdate == null) {
                forceUpdate = _SINGLETON_VALUE_ForceUpdate.value();
            }            return new UpdateSupplierRequest(
                supplier,
                allowSyncOnPushComplete,
                companyId,
                connectionId,
                forceUpdate,
                supplierId,
                timeoutInMinutes);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_AllowSyncOnPushComplete =
                new LazySingletonValue<>(
                        "allowSyncOnPushComplete",
                        "true",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_ForceUpdate =
                new LazySingletonValue<>(
                        "forceUpdate",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}

