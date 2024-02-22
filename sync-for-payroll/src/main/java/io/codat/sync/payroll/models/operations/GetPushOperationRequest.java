/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.operations;

import io.codat.sync.payroll.utils.SpeakeasyMetadata;
import io.codat.sync.payroll.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;


public class GetPushOperationRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Push operation key.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=pushOperationKey")
    private String pushOperationKey;

    public GetPushOperationRequest(
            String companyId,
            String pushOperationKey) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(pushOperationKey, "pushOperationKey");
        this.companyId = companyId;
        this.pushOperationKey = pushOperationKey;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }

    /**
     * Push operation key.
     */
    public String pushOperationKey() {
        return pushOperationKey;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetPushOperationRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Push operation key.
     */
    public GetPushOperationRequest withPushOperationKey(String pushOperationKey) {
        Utils.checkNotNull(pushOperationKey, "pushOperationKey");
        this.pushOperationKey = pushOperationKey;
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
        GetPushOperationRequest other = (GetPushOperationRequest) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.pushOperationKey, other.pushOperationKey);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            pushOperationKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetPushOperationRequest.class,
                "companyId", companyId,
                "pushOperationKey", pushOperationKey);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String pushOperationKey;  
        
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
         * Push operation key.
         */
        public Builder pushOperationKey(String pushOperationKey) {
            Utils.checkNotNull(pushOperationKey, "pushOperationKey");
            this.pushOperationKey = pushOperationKey;
            return this;
        }
        
        public GetPushOperationRequest build() {
            return new GetPushOperationRequest(
                companyId,
                pushOperationKey);
        }
    }
}
