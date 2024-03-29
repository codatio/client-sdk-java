/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import org.openapitools.jackson.nullable.JsonNullable;


public class ProjectRef {

    /**
     * Unique identifier to the project reference.
     */
    @JsonProperty("id")
    private String id;

    /**
     * The project's name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<? extends String> name;

    public ProjectRef(
            @JsonProperty("id") String id,
            @JsonProperty("name") JsonNullable<? extends String> name) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        this.id = id;
        this.name = name;
    }

    /**
     * Unique identifier to the project reference.
     */
    public String id() {
        return id;
    }

    /**
     * The project's name.
     */
    public JsonNullable<? extends String> name() {
        return name;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier to the project reference.
     */
    public ProjectRef withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The project's name.
     */
    public ProjectRef withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The project's name.
     */
    public ProjectRef withName(JsonNullable<? extends String> name) {
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
        ProjectRef other = (ProjectRef) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ProjectRef.class,
                "id", id,
                "name", name);
    }
    
    public final static class Builder {
 
        private String id;
 
        private JsonNullable<? extends String> name = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier to the project reference.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The project's name.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The project's name.
         */
        public Builder name(JsonNullable<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public ProjectRef build() {
            return new ProjectRef(
                id,
                name);
        }
    }
}

