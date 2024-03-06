/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class CompanyRequestBody {

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<? extends String> description;

    /**
     * Reference to the groups that the company is assigned to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("groups")
    private Optional<? extends java.util.List<GroupRef>> groups;

    /**
     * Name of company being connected.
     */
    @JsonProperty("name")
    private String name;

    public CompanyRequestBody(
            @JsonProperty("description") Optional<? extends String> description,
            @JsonProperty("groups") Optional<? extends java.util.List<GroupRef>> groups,
            @JsonProperty("name") String name) {
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(groups, "groups");
        Utils.checkNotNull(name, "name");
        this.description = description;
        this.groups = groups;
        this.name = name;
    }

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    public Optional<? extends String> description() {
        return description;
    }

    /**
     * Reference to the groups that the company is assigned to.
     */
    public Optional<? extends java.util.List<GroupRef>> groups() {
        return groups;
    }

    /**
     * Name of company being connected.
     */
    public String name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    public CompanyRequestBody withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    public CompanyRequestBody withDescription(Optional<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Reference to the groups that the company is assigned to.
     */
    public CompanyRequestBody withGroups(java.util.List<GroupRef> groups) {
        Utils.checkNotNull(groups, "groups");
        this.groups = Optional.ofNullable(groups);
        return this;
    }

    /**
     * Reference to the groups that the company is assigned to.
     */
    public CompanyRequestBody withGroups(Optional<? extends java.util.List<GroupRef>> groups) {
        Utils.checkNotNull(groups, "groups");
        this.groups = groups;
        return this;
    }

    /**
     * Name of company being connected.
     */
    public CompanyRequestBody withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        CompanyRequestBody other = (CompanyRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.groups, other.groups) &&
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            description,
            groups,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CompanyRequestBody.class,
                "description", description,
                "groups", groups,
                "name", name);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> description = Optional.empty();
 
        private Optional<? extends java.util.List<GroupRef>> groups = Optional.empty();
 
        private String name;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Additional information about the company. This can be used to store foreign IDs, references, etc.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        /**
         * Additional information about the company. This can be used to store foreign IDs, references, etc.
         */
        public Builder description(Optional<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Reference to the groups that the company is assigned to.
         */
        public Builder groups(java.util.List<GroupRef> groups) {
            Utils.checkNotNull(groups, "groups");
            this.groups = Optional.ofNullable(groups);
            return this;
        }

        /**
         * Reference to the groups that the company is assigned to.
         */
        public Builder groups(Optional<? extends java.util.List<GroupRef>> groups) {
            Utils.checkNotNull(groups, "groups");
            this.groups = groups;
            return this;
        }

        /**
         * Name of company being connected.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public CompanyRequestBody build() {
            return new CompanyRequestBody(
                description,
                groups,
                name);
        }
    }
}

