/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.bank_feeds.utils.SpeakeasyMetadata;
import io.codat.bank_feeds.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetCreateOperationRequest {

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

    @JsonCreator
    public GetCreateOperationRequest(
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
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Push operation key.
     */
    @JsonIgnore
    public String pushOperationKey() {
        return pushOperationKey;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetCreateOperationRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Push operation key.
     */
    public GetCreateOperationRequest withPushOperationKey(String pushOperationKey) {
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
        GetCreateOperationRequest other = (GetCreateOperationRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.pushOperationKey, other.pushOperationKey);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            pushOperationKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCreateOperationRequest.class,
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
        
        public GetCreateOperationRequest build() {
            return new GetCreateOperationRequest(
                companyId,
                pushOperationKey);
        }
    }
}

