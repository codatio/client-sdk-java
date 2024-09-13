/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.sync.expenses.models.components.CompanyRequestBody;
import io.codat.sync.expenses.utils.SpeakeasyMetadata;
import io.codat.sync.expenses.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class UpdateCompanyRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends CompanyRequestBody> companyRequestBody;

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    @JsonCreator
    public UpdateCompanyRequest(
            Optional<? extends CompanyRequestBody> companyRequestBody,
            String companyId) {
        Utils.checkNotNull(companyRequestBody, "companyRequestBody");
        Utils.checkNotNull(companyId, "companyId");
        this.companyRequestBody = companyRequestBody;
        this.companyId = companyId;
    }
    
    public UpdateCompanyRequest(
            String companyId) {
        this(Optional.empty(), companyId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CompanyRequestBody> companyRequestBody() {
        return (Optional<CompanyRequestBody>) companyRequestBody;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateCompanyRequest withCompanyRequestBody(CompanyRequestBody companyRequestBody) {
        Utils.checkNotNull(companyRequestBody, "companyRequestBody");
        this.companyRequestBody = Optional.ofNullable(companyRequestBody);
        return this;
    }

    public UpdateCompanyRequest withCompanyRequestBody(Optional<? extends CompanyRequestBody> companyRequestBody) {
        Utils.checkNotNull(companyRequestBody, "companyRequestBody");
        this.companyRequestBody = companyRequestBody;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public UpdateCompanyRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
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
        UpdateCompanyRequest other = (UpdateCompanyRequest) o;
        return 
            Objects.deepEquals(this.companyRequestBody, other.companyRequestBody) &&
            Objects.deepEquals(this.companyId, other.companyId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyRequestBody,
            companyId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateCompanyRequest.class,
                "companyRequestBody", companyRequestBody,
                "companyId", companyId);
    }
    
    public final static class Builder {
 
        private Optional<? extends CompanyRequestBody> companyRequestBody = Optional.empty();
 
        private String companyId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder companyRequestBody(CompanyRequestBody companyRequestBody) {
            Utils.checkNotNull(companyRequestBody, "companyRequestBody");
            this.companyRequestBody = Optional.ofNullable(companyRequestBody);
            return this;
        }

        public Builder companyRequestBody(Optional<? extends CompanyRequestBody> companyRequestBody) {
            Utils.checkNotNull(companyRequestBody, "companyRequestBody");
            this.companyRequestBody = companyRequestBody;
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
        
        public UpdateCompanyRequest build() {
            return new UpdateCompanyRequest(
                companyRequestBody,
                companyId);
        }
    }
}

