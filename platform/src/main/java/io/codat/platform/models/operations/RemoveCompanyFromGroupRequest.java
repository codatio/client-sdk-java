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


public class RemoveCompanyFromGroupRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for the group.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=groupId")
    private String groupId;

    @JsonCreator
    public RemoveCompanyFromGroupRequest(
            String companyId,
            String groupId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(groupId, "groupId");
        this.companyId = companyId;
        this.groupId = groupId;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for the group.
     */
    @JsonIgnore
    public String groupId() {
        return groupId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public RemoveCompanyFromGroupRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for the group.
     */
    public RemoveCompanyFromGroupRequest withGroupId(String groupId) {
        Utils.checkNotNull(groupId, "groupId");
        this.groupId = groupId;
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
        RemoveCompanyFromGroupRequest other = (RemoveCompanyFromGroupRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.groupId, other.groupId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            groupId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RemoveCompanyFromGroupRequest.class,
                "companyId", companyId,
                "groupId", groupId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String groupId;  
        
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
         * Unique identifier for the group.
         */
        public Builder groupId(String groupId) {
            Utils.checkNotNull(groupId, "groupId");
            this.groupId = groupId;
            return this;
        }
        
        public RemoveCompanyFromGroupRequest build() {
            return new RemoveCompanyFromGroupRequest(
                companyId,
                groupId);
        }
    }
}

