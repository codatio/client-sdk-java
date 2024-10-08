/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.models.shared.DataIntegrityDataType;
import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetDataIntegritySummariesRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * A key for a Codat data type.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=dataType")
    private DataIntegrityDataType dataType;

    /**
     * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    private Optional<String> query;

    @JsonCreator
    public GetDataIntegritySummariesRequest(
            String companyId,
            DataIntegrityDataType dataType,
            Optional<String> query) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(query, "query");
        this.companyId = companyId;
        this.dataType = dataType;
        this.query = query;
    }
    
    public GetDataIntegritySummariesRequest(
            String companyId,
            DataIntegrityDataType dataType) {
        this(companyId, dataType, Optional.empty());
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * A key for a Codat data type.
     */
    @JsonIgnore
    public DataIntegrityDataType dataType() {
        return dataType;
    }

    /**
     * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
     */
    @JsonIgnore
    public Optional<String> query() {
        return query;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetDataIntegritySummariesRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * A key for a Codat data type.
     */
    public GetDataIntegritySummariesRequest withDataType(DataIntegrityDataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
     */
    public GetDataIntegritySummariesRequest withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = Optional.ofNullable(query);
        return this;
    }

    /**
     * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
     */
    public GetDataIntegritySummariesRequest withQuery(Optional<String> query) {
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
        GetDataIntegritySummariesRequest other = (GetDataIntegritySummariesRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.dataType, other.dataType) &&
            Objects.deepEquals(this.query, other.query);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            dataType,
            query);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetDataIntegritySummariesRequest.class,
                "companyId", companyId,
                "dataType", dataType,
                "query", query);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private DataIntegrityDataType dataType;
 
        private Optional<String> query = Optional.empty();  
        
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
         * A key for a Codat data type.
         */
        public Builder dataType(DataIntegrityDataType dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        /**
         * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
         */
        public Builder query(String query) {
            Utils.checkNotNull(query, "query");
            this.query = Optional.ofNullable(query);
            return this;
        }

        /**
         * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
         */
        public Builder query(Optional<String> query) {
            Utils.checkNotNull(query, "query");
            this.query = query;
            return this;
        }
        
        public GetDataIntegritySummariesRequest build() {
            return new GetDataIntegritySummariesRequest(
                companyId,
                dataType,
                query);
        }
    }
}

