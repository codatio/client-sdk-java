/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * TaxComponentRef - Taxes rates reference object depending on the rates being available on source commerce software.
 */

public class TaxComponentRef {

    /**
     * The unique identitifer of the tax component being referenced.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Name of the tax component being referenced.
     */
    @JsonProperty("name")
    private String name;

    @JsonCreator
    public TaxComponentRef(
            @JsonProperty("id") String id,
            @JsonProperty("name") String name) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        this.id = id;
        this.name = name;
    }

    /**
     * The unique identitifer of the tax component being referenced.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * Name of the tax component being referenced.
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique identitifer of the tax component being referenced.
     */
    public TaxComponentRef withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Name of the tax component being referenced.
     */
    public TaxComponentRef withName(String name) {
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
        TaxComponentRef other = (TaxComponentRef) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaxComponentRef.class,
                "id", id,
                "name", name);
    }
    
    public final static class Builder {
 
        private String id;
 
        private String name;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique identitifer of the tax component being referenced.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Name of the tax component being referenced.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public TaxComponentRef build() {
            return new TaxComponentRef(
                id,
                name);
        }
    }
}

