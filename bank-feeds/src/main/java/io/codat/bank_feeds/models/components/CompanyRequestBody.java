/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.bank_feeds.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
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
     * Name of company being connected.
     */
    @JsonProperty("name")
    private String name;

    /**
     * A collection of user-defined key-value pairs that store custom metadata against the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private Optional<? extends Map<String, String>> tags;

    @JsonCreator
    public CompanyRequestBody(
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("name") String name,
            @JsonProperty("tags") Optional<? extends Map<String, String>> tags) {
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(tags, "tags");
        this.description = description;
        this.name = name;
        this.tags = tags;
    }
    
    public CompanyRequestBody(
            String name) {
        this(Optional.empty(), name, Optional.empty());
    }

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    /**
     * Name of company being connected.
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * A collection of user-defined key-value pairs that store custom metadata against the company.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, String>> tags() {
        return (Optional<Map<String, String>>) tags;
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
     * Name of company being connected.
     */
    public CompanyRequestBody withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * A collection of user-defined key-value pairs that store custom metadata against the company.
     */
    public CompanyRequestBody withTags(Map<String, String> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }

    /**
     * A collection of user-defined key-value pairs that store custom metadata against the company.
     */
    public CompanyRequestBody withTags(Optional<? extends Map<String, String>> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
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
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.tags, other.tags);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            description,
            name,
            tags);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CompanyRequestBody.class,
                "description", description,
                "name", name,
                "tags", tags);
    }
    
    public final static class Builder {
 
        private Optional<String> description = Optional.empty();
 
        private String name;
 
        private Optional<? extends Map<String, String>> tags = Optional.empty();  
        
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
         * Name of company being connected.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * A collection of user-defined key-value pairs that store custom metadata against the company.
         */
        public Builder tags(Map<String, String> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        /**
         * A collection of user-defined key-value pairs that store custom metadata against the company.
         */
        public Builder tags(Optional<? extends Map<String, String>> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
            return this;
        }
        
        public CompanyRequestBody build() {
            return new CompanyRequestBody(
                description,
                name,
                tags);
        }
    }
}

