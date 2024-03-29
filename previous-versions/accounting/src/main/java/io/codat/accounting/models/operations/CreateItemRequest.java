/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.SpeakeasyMetadata;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class CreateItemRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private JsonNullable<? extends io.codat.accounting.models.components.Item> item;

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
     * Time limit for the push operation to complete before it is timed out.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=timeoutInMinutes")
    private Optional<? extends Integer> timeoutInMinutes;

    public CreateItemRequest(
            JsonNullable<? extends io.codat.accounting.models.components.Item> item,
            String companyId,
            String connectionId,
            Optional<? extends Integer> timeoutInMinutes) {
        Utils.checkNotNull(item, "item");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.item = item;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.timeoutInMinutes = timeoutInMinutes;
    }

    public JsonNullable<? extends io.codat.accounting.models.components.Item> item() {
        return item;
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
     * Time limit for the push operation to complete before it is timed out.
     */
    public Optional<? extends Integer> timeoutInMinutes() {
        return timeoutInMinutes;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public CreateItemRequest withItem(io.codat.accounting.models.components.Item item) {
        Utils.checkNotNull(item, "item");
        this.item = JsonNullable.of(item);
        return this;
    }

    public CreateItemRequest withItem(JsonNullable<? extends io.codat.accounting.models.components.Item> item) {
        Utils.checkNotNull(item, "item");
        this.item = item;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public CreateItemRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public CreateItemRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public CreateItemRequest withTimeoutInMinutes(int timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = Optional.ofNullable(timeoutInMinutes);
        return this;
    }
    
    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public CreateItemRequest withTimeoutInMinutes(Optional<? extends Integer> timeoutInMinutes) {
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
        CreateItemRequest other = (CreateItemRequest) o;
        return 
            java.util.Objects.deepEquals(this.item, other.item) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.timeoutInMinutes, other.timeoutInMinutes);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            item,
            companyId,
            connectionId,
            timeoutInMinutes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateItemRequest.class,
                "item", item,
                "companyId", companyId,
                "connectionId", connectionId,
                "timeoutInMinutes", timeoutInMinutes);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends io.codat.accounting.models.components.Item> item = JsonNullable.undefined();
 
        private String companyId;
 
        private String connectionId;
 
        private Optional<? extends Integer> timeoutInMinutes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder item(io.codat.accounting.models.components.Item item) {
            Utils.checkNotNull(item, "item");
            this.item = JsonNullable.of(item);
            return this;
        }

        public Builder item(JsonNullable<? extends io.codat.accounting.models.components.Item> item) {
            Utils.checkNotNull(item, "item");
            this.item = item;
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
        
        public CreateItemRequest build() {
            return new CreateItemRequest(
                item,
                companyId,
                connectionId,
                timeoutInMinutes);
        }
    }
}

