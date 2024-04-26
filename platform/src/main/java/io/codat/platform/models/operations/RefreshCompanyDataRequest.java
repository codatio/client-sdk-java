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


public class RefreshCompanyDataRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    @JsonCreator
    public RefreshCompanyDataRequest(
            String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
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

    /**
     * Unique identifier for a company.
     */
    public RefreshCompanyDataRequest withCompanyId(String companyId) {
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
        RefreshCompanyDataRequest other = (RefreshCompanyDataRequest) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RefreshCompanyDataRequest.class,
                "companyId", companyId);
    }
    
    public final static class Builder {
 
        private String companyId;  
        
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
        
        public RefreshCompanyDataRequest build() {
            return new RefreshCompanyDataRequest(
                companyId);
        }
    }
}

