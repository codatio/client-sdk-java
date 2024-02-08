/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.util.Optional;


public class CompanyGroupAssignment {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("groupId")
    private Optional<? extends String> groupId;

    public CompanyGroupAssignment(
            @JsonProperty("groupId") Optional<? extends String> groupId) {
        Utils.checkNotNull(groupId, "groupId");
        this.groupId = groupId;
    }

    public Optional<? extends String> groupId() {
        return groupId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public CompanyGroupAssignment withGroupId(String groupId) {
        Utils.checkNotNull(groupId, "groupId");
        this.groupId = Optional.ofNullable(groupId);
        return this;
    }
    
    public CompanyGroupAssignment withGroupId(Optional<? extends String> groupId) {
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
        CompanyGroupAssignment other = (CompanyGroupAssignment) o;
        return 
            java.util.Objects.deepEquals(this.groupId, other.groupId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            groupId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CompanyGroupAssignment.class,
                "groupId", groupId);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> groupId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder groupId(String groupId) {
            Utils.checkNotNull(groupId, "groupId");
            this.groupId = Optional.ofNullable(groupId);
            return this;
        }
        
        public Builder groupId(Optional<? extends String> groupId) {
            Utils.checkNotNull(groupId, "groupId");
            this.groupId = groupId;
            return this;
        }        
        
        public CompanyGroupAssignment build() {
            return new CompanyGroupAssignment(
                groupId);
        }
    }
}

