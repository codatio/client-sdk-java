/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payables.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.sync.payables.utils.SpeakeasyMetadata;
import io.codat.sync.payables.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetMappingOptionsPaymentsRequest {

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
    private Optional<String> continuationToken;

    /**
     * Codat query string allows you to filter by `status` (`status=Active||status=Archived`). [Learn more](https://docs.codat.io/using-the-api/querying) about Codat's query string.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=statusQuery")
    private Optional<String> statusQuery;

    @JsonCreator
    public GetMappingOptionsPaymentsRequest(
            String companyId,
            String connectionId,
            Optional<String> continuationToken,
            Optional<String> statusQuery) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(continuationToken, "continuationToken");
        Utils.checkNotNull(statusQuery, "statusQuery");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.continuationToken = continuationToken;
        this.statusQuery = statusQuery;
    }
    
    public GetMappingOptionsPaymentsRequest(
            String companyId,
            String connectionId) {
        this(companyId, connectionId, Optional.empty(), Optional.empty());
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
     * Retrieve the next page of results using the continuation token from the previous response.
     */
    @JsonIgnore
    public Optional<String> continuationToken() {
        return continuationToken;
    }

    /**
     * Codat query string allows you to filter by `status` (`status=Active||status=Archived`). [Learn more](https://docs.codat.io/using-the-api/querying) about Codat's query string.
     */
    @JsonIgnore
    public Optional<String> statusQuery() {
        return statusQuery;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetMappingOptionsPaymentsRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public GetMappingOptionsPaymentsRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Retrieve the next page of results using the continuation token from the previous response.
     */
    public GetMappingOptionsPaymentsRequest withContinuationToken(String continuationToken) {
        Utils.checkNotNull(continuationToken, "continuationToken");
        this.continuationToken = Optional.ofNullable(continuationToken);
        return this;
    }

    /**
     * Retrieve the next page of results using the continuation token from the previous response.
     */
    public GetMappingOptionsPaymentsRequest withContinuationToken(Optional<String> continuationToken) {
        Utils.checkNotNull(continuationToken, "continuationToken");
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * Codat query string allows you to filter by `status` (`status=Active||status=Archived`). [Learn more](https://docs.codat.io/using-the-api/querying) about Codat's query string.
     */
    public GetMappingOptionsPaymentsRequest withStatusQuery(String statusQuery) {
        Utils.checkNotNull(statusQuery, "statusQuery");
        this.statusQuery = Optional.ofNullable(statusQuery);
        return this;
    }

    /**
     * Codat query string allows you to filter by `status` (`status=Active||status=Archived`). [Learn more](https://docs.codat.io/using-the-api/querying) about Codat's query string.
     */
    public GetMappingOptionsPaymentsRequest withStatusQuery(Optional<String> statusQuery) {
        Utils.checkNotNull(statusQuery, "statusQuery");
        this.statusQuery = statusQuery;
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
        GetMappingOptionsPaymentsRequest other = (GetMappingOptionsPaymentsRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.continuationToken, other.continuationToken) &&
            Objects.deepEquals(this.statusQuery, other.statusQuery);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            connectionId,
            continuationToken,
            statusQuery);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMappingOptionsPaymentsRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "continuationToken", continuationToken,
                "statusQuery", statusQuery);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;
 
        private Optional<String> continuationToken = Optional.empty();
 
        private Optional<String> statusQuery = Optional.empty();  
        
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
        public Builder continuationToken(Optional<String> continuationToken) {
            Utils.checkNotNull(continuationToken, "continuationToken");
            this.continuationToken = continuationToken;
            return this;
        }

        /**
         * Codat query string allows you to filter by `status` (`status=Active||status=Archived`). [Learn more](https://docs.codat.io/using-the-api/querying) about Codat's query string.
         */
        public Builder statusQuery(String statusQuery) {
            Utils.checkNotNull(statusQuery, "statusQuery");
            this.statusQuery = Optional.ofNullable(statusQuery);
            return this;
        }

        /**
         * Codat query string allows you to filter by `status` (`status=Active||status=Archived`). [Learn more](https://docs.codat.io/using-the-api/querying) about Codat's query string.
         */
        public Builder statusQuery(Optional<String> statusQuery) {
            Utils.checkNotNull(statusQuery, "statusQuery");
            this.statusQuery = statusQuery;
            return this;
        }
        
        public GetMappingOptionsPaymentsRequest build() {
            return new GetMappingOptionsPaymentsRequest(
                companyId,
                connectionId,
                continuationToken,
                statusQuery);
        }
    }
}

