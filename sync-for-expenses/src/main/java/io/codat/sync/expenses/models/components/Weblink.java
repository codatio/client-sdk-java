/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.expenses.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Weblink - Weblink associated with the company.
 */

public class Weblink {

    /**
     * The type of the weblink.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends CompanyInformationType> type;

    /**
     * The full URL for the weblink.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    private Optional<String> url;

    @JsonCreator
    public Weblink(
            @JsonProperty("type") Optional<? extends CompanyInformationType> type,
            @JsonProperty("url") Optional<String> url) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(url, "url");
        this.type = type;
        this.url = url;
    }
    
    public Weblink() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The type of the weblink.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CompanyInformationType> type() {
        return (Optional<CompanyInformationType>) type;
    }

    /**
     * The full URL for the weblink.
     */
    @JsonIgnore
    public Optional<String> url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The type of the weblink.
     */
    public Weblink withType(CompanyInformationType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * The type of the weblink.
     */
    public Weblink withType(Optional<? extends CompanyInformationType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The full URL for the weblink.
     */
    public Weblink withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * The full URL for the weblink.
     */
    public Weblink withUrl(Optional<String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
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
        Weblink other = (Weblink) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Weblink.class,
                "type", type,
                "url", url);
    }
    
    public final static class Builder {
 
        private Optional<? extends CompanyInformationType> type = Optional.empty();
 
        private Optional<String> url = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The type of the weblink.
         */
        public Builder type(CompanyInformationType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * The type of the weblink.
         */
        public Builder type(Optional<? extends CompanyInformationType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The full URL for the weblink.
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = Optional.ofNullable(url);
            return this;
        }

        /**
         * The full URL for the weblink.
         */
        public Builder url(Optional<String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public Weblink build() {
            return new Weblink(
                type,
                url);
        }
    }
}

