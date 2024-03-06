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

/**
 * BrandingButton - Button branding references.
 */

public class BrandingButton {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default")
    private Optional<? extends BrandingImage> default_;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hover")
    private Optional<? extends BrandingImage> hover;

    public BrandingButton(
            @JsonProperty("default") Optional<? extends BrandingImage> default_,
            @JsonProperty("hover") Optional<? extends BrandingImage> hover) {
        Utils.checkNotNull(default_, "default_");
        Utils.checkNotNull(hover, "hover");
        this.default_ = default_;
        this.hover = hover;
    }

    public Optional<? extends BrandingImage> default_() {
        return default_;
    }

    public Optional<? extends BrandingImage> hover() {
        return hover;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BrandingButton withDefault(BrandingImage default_) {
        Utils.checkNotNull(default_, "default_");
        this.default_ = Optional.ofNullable(default_);
        return this;
    }

    public BrandingButton withDefault(Optional<? extends BrandingImage> default_) {
        Utils.checkNotNull(default_, "default_");
        this.default_ = default_;
        return this;
    }

    public BrandingButton withHover(BrandingImage hover) {
        Utils.checkNotNull(hover, "hover");
        this.hover = Optional.ofNullable(hover);
        return this;
    }

    public BrandingButton withHover(Optional<? extends BrandingImage> hover) {
        Utils.checkNotNull(hover, "hover");
        this.hover = hover;
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
        BrandingButton other = (BrandingButton) o;
        return 
            java.util.Objects.deepEquals(this.default_, other.default_) &&
            java.util.Objects.deepEquals(this.hover, other.hover);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            default_,
            hover);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BrandingButton.class,
                "default_", default_,
                "hover", hover);
    }
    
    public final static class Builder {
 
        private Optional<? extends BrandingImage> default_ = Optional.empty();
 
        private Optional<? extends BrandingImage> hover = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder default_(BrandingImage default_) {
            Utils.checkNotNull(default_, "default_");
            this.default_ = Optional.ofNullable(default_);
            return this;
        }

        public Builder default_(Optional<? extends BrandingImage> default_) {
            Utils.checkNotNull(default_, "default_");
            this.default_ = default_;
            return this;
        }

        public Builder hover(BrandingImage hover) {
            Utils.checkNotNull(hover, "hover");
            this.hover = Optional.ofNullable(hover);
            return this;
        }

        public Builder hover(Optional<? extends BrandingImage> hover) {
            Utils.checkNotNull(hover, "hover");
            this.hover = hover;
            return this;
        }
        
        public BrandingButton build() {
            return new BrandingButton(
                default_,
                hover);
        }
    }
}

