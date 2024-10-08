/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GenerateLoanTransactionsRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Data source type.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sourceType")
    private QueryParamSourceType sourceType;

    @JsonCreator
    public GenerateLoanTransactionsRequest(
            String companyId,
            QueryParamSourceType sourceType) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(sourceType, "sourceType");
        this.companyId = companyId;
        this.sourceType = sourceType;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Data source type.
     */
    @JsonIgnore
    public QueryParamSourceType sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GenerateLoanTransactionsRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Data source type.
     */
    public GenerateLoanTransactionsRequest withSourceType(QueryParamSourceType sourceType) {
        Utils.checkNotNull(sourceType, "sourceType");
        this.sourceType = sourceType;
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
        GenerateLoanTransactionsRequest other = (GenerateLoanTransactionsRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GenerateLoanTransactionsRequest.class,
                "companyId", companyId,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private QueryParamSourceType sourceType;  
        
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
         * Data source type.
         */
        public Builder sourceType(QueryParamSourceType sourceType) {
            Utils.checkNotNull(sourceType, "sourceType");
            this.sourceType = sourceType;
            return this;
        }
        
        public GenerateLoanTransactionsRequest build() {
            return new GenerateLoanTransactionsRequest(
                companyId,
                sourceType);
        }
    }
}

