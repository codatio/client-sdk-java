/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.SpeakeasyMetadata;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class CreateConnectionRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends CreateConnectionRequestBody> requestBody;

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    @JsonCreator
    public CreateConnectionRequest(
            Optional<? extends CreateConnectionRequestBody> requestBody,
            String companyId) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(companyId, "companyId");
        this.requestBody = requestBody;
        this.companyId = companyId;
    }
    
    public CreateConnectionRequest(
            String companyId) {
        this(Optional.empty(), companyId);
    }

    @JsonIgnore
    public Optional<? extends CreateConnectionRequestBody> requestBody() {
        return requestBody;
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

    public CreateConnectionRequest withRequestBody(CreateConnectionRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public CreateConnectionRequest withRequestBody(Optional<? extends CreateConnectionRequestBody> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public CreateConnectionRequest withCompanyId(String companyId) {
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
        CreateConnectionRequest other = (CreateConnectionRequest) o;
        return 
            java.util.Objects.deepEquals(this.requestBody, other.requestBody) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            requestBody,
            companyId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateConnectionRequest.class,
                "requestBody", requestBody,
                "companyId", companyId);
    }
    
    public final static class Builder {
 
        private Optional<? extends CreateConnectionRequestBody> requestBody = Optional.empty();
 
        private String companyId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(CreateConnectionRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        public Builder requestBody(Optional<? extends CreateConnectionRequestBody> requestBody) {
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
        
        public CreateConnectionRequest build() {
            return new CreateConnectionRequest(
                requestBody,
                companyId);
        }
    }
}

