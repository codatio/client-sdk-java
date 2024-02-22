/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payables.models.operations;

import io.codat.sync.payables.utils.SpeakeasyMetadata;
import io.codat.sync.payables.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class CreateBillRequest {

    /**
     * A unique identifier to ensure idempotent behaviour for subsequent requests.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Idempotency-Key")
    private Optional<? extends String> idempotencyKey;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends io.codat.sync.payables.models.components.BillPrototype> billPrototype;

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

    public CreateBillRequest(
            Optional<? extends String> idempotencyKey,
            Optional<? extends io.codat.sync.payables.models.components.BillPrototype> billPrototype,
            String companyId,
            String connectionId) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        Utils.checkNotNull(billPrototype, "billPrototype");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        this.idempotencyKey = idempotencyKey;
        this.billPrototype = billPrototype;
        this.companyId = companyId;
        this.connectionId = connectionId;
    }

    /**
     * A unique identifier to ensure idempotent behaviour for subsequent requests.
     */
    public Optional<? extends String> idempotencyKey() {
        return idempotencyKey;
    }

    public Optional<? extends io.codat.sync.payables.models.components.BillPrototype> billPrototype() {
        return billPrototype;
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
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier to ensure idempotent behaviour for subsequent requests.
     */
    public CreateBillRequest withIdempotencyKey(String idempotencyKey) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        this.idempotencyKey = Optional.ofNullable(idempotencyKey);
        return this;
    }
    
    /**
     * A unique identifier to ensure idempotent behaviour for subsequent requests.
     */
    public CreateBillRequest withIdempotencyKey(Optional<? extends String> idempotencyKey) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        this.idempotencyKey = idempotencyKey;
        return this;
    }

    public CreateBillRequest withBillPrototype(io.codat.sync.payables.models.components.BillPrototype billPrototype) {
        Utils.checkNotNull(billPrototype, "billPrototype");
        this.billPrototype = Optional.ofNullable(billPrototype);
        return this;
    }
    
    public CreateBillRequest withBillPrototype(Optional<? extends io.codat.sync.payables.models.components.BillPrototype> billPrototype) {
        Utils.checkNotNull(billPrototype, "billPrototype");
        this.billPrototype = billPrototype;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public CreateBillRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public CreateBillRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
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
        CreateBillRequest other = (CreateBillRequest) o;
        return 
            java.util.Objects.deepEquals(this.idempotencyKey, other.idempotencyKey) &&
            java.util.Objects.deepEquals(this.billPrototype, other.billPrototype) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            idempotencyKey,
            billPrototype,
            companyId,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBillRequest.class,
                "idempotencyKey", idempotencyKey,
                "billPrototype", billPrototype,
                "companyId", companyId,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> idempotencyKey = Optional.empty();
 
        private Optional<? extends io.codat.sync.payables.models.components.BillPrototype> billPrototype = Optional.empty();
 
        private String companyId;
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A unique identifier to ensure idempotent behaviour for subsequent requests.
         */
        public Builder idempotencyKey(String idempotencyKey) {
            Utils.checkNotNull(idempotencyKey, "idempotencyKey");
            this.idempotencyKey = Optional.ofNullable(idempotencyKey);
            return this;
        }
        
        /**
         * A unique identifier to ensure idempotent behaviour for subsequent requests.
         */
        public Builder idempotencyKey(Optional<? extends String> idempotencyKey) {
            Utils.checkNotNull(idempotencyKey, "idempotencyKey");
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        public Builder billPrototype(io.codat.sync.payables.models.components.BillPrototype billPrototype) {
            Utils.checkNotNull(billPrototype, "billPrototype");
            this.billPrototype = Optional.ofNullable(billPrototype);
            return this;
        }
        
        public Builder billPrototype(Optional<? extends io.codat.sync.payables.models.components.BillPrototype> billPrototype) {
            Utils.checkNotNull(billPrototype, "billPrototype");
            this.billPrototype = billPrototype;
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
        
        public CreateBillRequest build() {
            return new CreateBillRequest(
                idempotencyKey,
                billPrototype,
                companyId,
                connectionId);
        }
    }
}
