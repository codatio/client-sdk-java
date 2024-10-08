/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.platform.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class CompanyReference {

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    /**
     * Unique identifier for your SMB in Codat.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * The name of the company
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonCreator
    public CompanyReference(
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") Optional<String> name) {
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        this.description = description;
        this.id = id;
        this.name = name;
    }
    
    public CompanyReference() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * The name of the company
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    public CompanyReference withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    public CompanyReference withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    public CompanyReference withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    public CompanyReference withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The name of the company
     */
    public CompanyReference withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The name of the company
     */
    public CompanyReference withName(Optional<String> name) {
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
        CompanyReference other = (CompanyReference) o;
        return 
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            description,
            id,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CompanyReference.class,
                "description", description,
                "id", id,
                "name", name);
    }
    
    public final static class Builder {
 
        private Optional<String> description = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> name = Optional.empty();  
        
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
         * Unique identifier for your SMB in Codat.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Unique identifier for your SMB in Codat.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The name of the company
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * The name of the company
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public CompanyReference build() {
            return new CompanyReference(
                description,
                id,
                name);
        }
    }
}

