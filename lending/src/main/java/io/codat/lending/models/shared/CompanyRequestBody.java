/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class CompanyRequestBody {

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    /**
     * Reference to the groups that the company is assigned to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("groups")
    private Optional<? extends List<GroupReference>> groups;

    /**
     * Name of company being connected.
     */
    @JsonProperty("name")
    private String name;

    @JsonCreator
    public CompanyRequestBody(
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("groups") Optional<? extends List<GroupReference>> groups,
            @JsonProperty("name") String name) {
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(groups, "groups");
        Utils.checkNotNull(name, "name");
        this.description = description;
        this.groups = groups;
        this.name = name;
    }
    
    public CompanyRequestBody(
            String name) {
        this(Optional.empty(), Optional.empty(), name);
    }

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    /**
     * Reference to the groups that the company is assigned to.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GroupReference>> groups() {
        return (Optional<List<GroupReference>>) groups;
    }

    /**
     * Name of company being connected.
     */
    @JsonIgnore
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
    public CompanyRequestBody withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Reference to the groups that the company is assigned to.
     */
    public CompanyRequestBody withGroups(List<GroupReference> groups) {
        Utils.checkNotNull(groups, "groups");
        this.groups = Optional.ofNullable(groups);
        return this;
    }

    /**
     * Reference to the groups that the company is assigned to.
     */
    public CompanyRequestBody withGroups(Optional<? extends List<GroupReference>> groups) {
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
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.groups, other.groups) &&
            Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<String> description = Optional.empty();
 
        private Optional<? extends List<GroupReference>> groups = Optional.empty();
 
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
        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Reference to the groups that the company is assigned to.
         */
        public Builder groups(List<GroupReference> groups) {
            Utils.checkNotNull(groups, "groups");
            this.groups = Optional.ofNullable(groups);
            return this;
        }

        /**
         * Reference to the groups that the company is assigned to.
         */
        public Builder groups(Optional<? extends List<GroupReference>> groups) {
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

