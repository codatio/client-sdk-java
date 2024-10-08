/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.platform.utils.SpeakeasyMetadata;
import io.codat.platform.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetWebhookRequest {

    /**
     * Unique ID of the webhook or rule.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ruleId")
    private String ruleId;

    @JsonCreator
    public GetWebhookRequest(
            String ruleId) {
        Utils.checkNotNull(ruleId, "ruleId");
        this.ruleId = ruleId;
    }

    /**
     * Unique ID of the webhook or rule.
     */
    @JsonIgnore
    public String ruleId() {
        return ruleId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique ID of the webhook or rule.
     */
    public GetWebhookRequest withRuleId(String ruleId) {
        Utils.checkNotNull(ruleId, "ruleId");
        this.ruleId = ruleId;
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
        GetWebhookRequest other = (GetWebhookRequest) o;
        return 
            Objects.deepEquals(this.ruleId, other.ruleId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            ruleId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetWebhookRequest.class,
                "ruleId", ruleId);
    }
    
    public final static class Builder {
 
        private String ruleId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique ID of the webhook or rule.
         */
        public Builder ruleId(String ruleId) {
            Utils.checkNotNull(ruleId, "ruleId");
            this.ruleId = ruleId;
            return this;
        }
        
        public GetWebhookRequest build() {
            return new GetWebhookRequest(
                ruleId);
        }
    }
}

