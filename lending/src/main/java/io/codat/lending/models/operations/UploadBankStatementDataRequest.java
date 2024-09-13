/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.models.shared.Path;
import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class UploadBankStatementDataRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private UploadBankStatementDataRequestBody requestBody;

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
     * Unique identifier for the dataset that completed its sync.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=datasetId")
    private String datasetId;

    /**
     * The endpoint path of the third-party banking service that the request body originates from. Only required if the source is not `codat`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=path")
    private Optional<? extends Path> path;

    @JsonCreator
    public UploadBankStatementDataRequest(
            UploadBankStatementDataRequestBody requestBody,
            String companyId,
            String connectionId,
            String datasetId,
            Optional<? extends Path> path) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(datasetId, "datasetId");
        Utils.checkNotNull(path, "path");
        this.requestBody = requestBody;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.datasetId = datasetId;
        this.path = path;
    }
    
    public UploadBankStatementDataRequest(
            UploadBankStatementDataRequestBody requestBody,
            String companyId,
            String connectionId,
            String datasetId) {
        this(requestBody, companyId, connectionId, datasetId, Optional.empty());
    }

    @JsonIgnore
    public UploadBankStatementDataRequestBody requestBody() {
        return requestBody;
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
     * Unique identifier for the dataset that completed its sync.
     */
    @JsonIgnore
    public String datasetId() {
        return datasetId;
    }

    /**
     * The endpoint path of the third-party banking service that the request body originates from. Only required if the source is not `codat`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Path> path() {
        return (Optional<Path>) path;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UploadBankStatementDataRequest withRequestBody(UploadBankStatementDataRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public UploadBankStatementDataRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public UploadBankStatementDataRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for the dataset that completed its sync.
     */
    public UploadBankStatementDataRequest withDatasetId(String datasetId) {
        Utils.checkNotNull(datasetId, "datasetId");
        this.datasetId = datasetId;
        return this;
    }

    /**
     * The endpoint path of the third-party banking service that the request body originates from. Only required if the source is not `codat`.
     */
    public UploadBankStatementDataRequest withPath(Path path) {
        Utils.checkNotNull(path, "path");
        this.path = Optional.ofNullable(path);
        return this;
    }

    /**
     * The endpoint path of the third-party banking service that the request body originates from. Only required if the source is not `codat`.
     */
    public UploadBankStatementDataRequest withPath(Optional<? extends Path> path) {
        Utils.checkNotNull(path, "path");
        this.path = path;
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
        UploadBankStatementDataRequest other = (UploadBankStatementDataRequest) o;
        return 
            Objects.deepEquals(this.requestBody, other.requestBody) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.datasetId, other.datasetId) &&
            Objects.deepEquals(this.path, other.path);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            requestBody,
            companyId,
            connectionId,
            datasetId,
            path);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UploadBankStatementDataRequest.class,
                "requestBody", requestBody,
                "companyId", companyId,
                "connectionId", connectionId,
                "datasetId", datasetId,
                "path", path);
    }
    
    public final static class Builder {
 
        private UploadBankStatementDataRequestBody requestBody;
 
        private String companyId;
 
        private String connectionId;
 
        private String datasetId;
 
        private Optional<? extends Path> path = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(UploadBankStatementDataRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
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
         * Unique identifier for the dataset that completed its sync.
         */
        public Builder datasetId(String datasetId) {
            Utils.checkNotNull(datasetId, "datasetId");
            this.datasetId = datasetId;
            return this;
        }

        /**
         * The endpoint path of the third-party banking service that the request body originates from. Only required if the source is not `codat`.
         */
        public Builder path(Path path) {
            Utils.checkNotNull(path, "path");
            this.path = Optional.ofNullable(path);
            return this;
        }

        /**
         * The endpoint path of the third-party banking service that the request body originates from. Only required if the source is not `codat`.
         */
        public Builder path(Optional<? extends Path> path) {
            Utils.checkNotNull(path, "path");
            this.path = path;
            return this;
        }
        
        public UploadBankStatementDataRequest build() {
            return new UploadBankStatementDataRequest(
                requestBody,
                companyId,
                connectionId,
                datasetId,
                path);
        }
    }
}
