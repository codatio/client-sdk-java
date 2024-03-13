/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payables.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.payables.utils.SpeakeasyMetadata;
import io.codat.sync.payables.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class ListBillsRequest {

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
     * Retrieve the next page of results using the continuation token from the previous response.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=continuationToken")
    private Optional<? extends String> continuationToken;

    /**
     * Codat query string allows you to filter by `status` and `sourceModifiedDate`. Learn more about Codat's query string [here](https://docs.codat.io/using-the-api/querying).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    private Optional<? extends String> query;

    public ListBillsRequest(
            String companyId,
            String connectionId,
            Optional<? extends String> continuationToken,
            Optional<? extends String> query) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(continuationToken, "continuationToken");
        Utils.checkNotNull(query, "query");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.continuationToken = continuationToken;
        this.query = query;
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
     * Retrieve the next page of results using the continuation token from the previous response.
     */
    public Optional<? extends String> continuationToken() {
        return continuationToken;
    }

    /**
     * Codat query string allows you to filter by `status` and `sourceModifiedDate`. Learn more about Codat's query string [here](https://docs.codat.io/using-the-api/querying).
     */
    public Optional<? extends String> query() {
        return query;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public ListBillsRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public ListBillsRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Retrieve the next page of results using the continuation token from the previous response.
     */
    public ListBillsRequest withContinuationToken(String continuationToken) {
        Utils.checkNotNull(continuationToken, "continuationToken");
        this.continuationToken = Optional.ofNullable(continuationToken);
        return this;
    }

    /**
     * Retrieve the next page of results using the continuation token from the previous response.
     */
    public ListBillsRequest withContinuationToken(Optional<? extends String> continuationToken) {
        Utils.checkNotNull(continuationToken, "continuationToken");
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * Codat query string allows you to filter by `status` and `sourceModifiedDate`. Learn more about Codat's query string [here](https://docs.codat.io/using-the-api/querying).
     */
    public ListBillsRequest withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = Optional.ofNullable(query);
        return this;
    }

    /**
     * Codat query string allows you to filter by `status` and `sourceModifiedDate`. Learn more about Codat's query string [here](https://docs.codat.io/using-the-api/querying).
     */
    public ListBillsRequest withQuery(Optional<? extends String> query) {
        Utils.checkNotNull(query, "query");
        this.query = query;
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
        ListBillsRequest other = (ListBillsRequest) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.continuationToken, other.continuationToken) &&
            java.util.Objects.deepEquals(this.query, other.query);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            connectionId,
            continuationToken,
            query);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListBillsRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "continuationToken", continuationToken,
                "query", query);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;
 
        private Optional<? extends String> continuationToken = Optional.empty();
 
        private Optional<? extends String> query = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
         * Retrieve the next page of results using the continuation token from the previous response.
         */
        public Builder continuationToken(String continuationToken) {
            Utils.checkNotNull(continuationToken, "continuationToken");
            this.continuationToken = Optional.ofNullable(continuationToken);
            return this;
        }

        /**
         * Retrieve the next page of results using the continuation token from the previous response.
         */
        public Builder continuationToken(Optional<? extends String> continuationToken) {
            Utils.checkNotNull(continuationToken, "continuationToken");
            this.continuationToken = continuationToken;
            return this;
        }

        /**
         * Codat query string allows you to filter by `status` and `sourceModifiedDate`. Learn more about Codat's query string [here](https://docs.codat.io/using-the-api/querying).
         */
        public Builder query(String query) {
            Utils.checkNotNull(query, "query");
            this.query = Optional.ofNullable(query);
            return this;
        }

        /**
         * Codat query string allows you to filter by `status` and `sourceModifiedDate`. Learn more about Codat's query string [here](https://docs.codat.io/using-the-api/querying).
         */
        public Builder query(Optional<? extends String> query) {
            Utils.checkNotNull(query, "query");
            this.query = query;
            return this;
        }
        
        public ListBillsRequest build() {
            return new ListBillsRequest(
                companyId,
                connectionId,
                continuationToken,
                query);
        }
    }
}

