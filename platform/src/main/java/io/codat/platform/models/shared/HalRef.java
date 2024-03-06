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


public class HalRef {

    /**
     * Uri hypertext reference.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("href")
    private Optional<? extends String> href;

    public HalRef(
            @JsonProperty("href") Optional<? extends String> href) {
        Utils.checkNotNull(href, "href");
        this.href = href;
    }

    /**
     * Uri hypertext reference.
     */
    public Optional<? extends String> href() {
        return href;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Uri hypertext reference.
     */
    public HalRef withHref(String href) {
        Utils.checkNotNull(href, "href");
        this.href = Optional.ofNullable(href);
        return this;
    }

    /**
     * Uri hypertext reference.
     */
    public HalRef withHref(Optional<? extends String> href) {
        Utils.checkNotNull(href, "href");
        this.href = href;
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
        HalRef other = (HalRef) o;
        return 
            java.util.Objects.deepEquals(this.href, other.href);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            href);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HalRef.class,
                "href", href);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> href = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Uri hypertext reference.
         */
        public Builder href(String href) {
            Utils.checkNotNull(href, "href");
            this.href = Optional.ofNullable(href);
            return this;
        }

        /**
         * Uri hypertext reference.
         */
        public Builder href(Optional<? extends String> href) {
            Utils.checkNotNull(href, "href");
            this.href = href;
            return this;
        }
        
        public HalRef build() {
            return new HalRef(
                href);
        }
    }
}

