/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.commerce.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * BrandingLogo - Logo branding references.
 */

public class BrandingLogo {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("full")
    private Optional<? extends BrandingImage> full;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("square")
    private Optional<? extends BrandingImage> square;

    @JsonCreator
    public BrandingLogo(
            @JsonProperty("full") Optional<? extends BrandingImage> full,
            @JsonProperty("square") Optional<? extends BrandingImage> square) {
        Utils.checkNotNull(full, "full");
        Utils.checkNotNull(square, "square");
        this.full = full;
        this.square = square;
    }
    
    public BrandingLogo() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BrandingImage> full() {
        return (Optional<BrandingImage>) full;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BrandingImage> square() {
        return (Optional<BrandingImage>) square;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BrandingLogo withFull(BrandingImage full) {
        Utils.checkNotNull(full, "full");
        this.full = Optional.ofNullable(full);
        return this;
    }

    public BrandingLogo withFull(Optional<? extends BrandingImage> full) {
        Utils.checkNotNull(full, "full");
        this.full = full;
        return this;
    }

    public BrandingLogo withSquare(BrandingImage square) {
        Utils.checkNotNull(square, "square");
        this.square = Optional.ofNullable(square);
        return this;
    }

    public BrandingLogo withSquare(Optional<? extends BrandingImage> square) {
        Utils.checkNotNull(square, "square");
        this.square = square;
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
        BrandingLogo other = (BrandingLogo) o;
        return 
            Objects.deepEquals(this.full, other.full) &&
            Objects.deepEquals(this.square, other.square);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            full,
            square);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BrandingLogo.class,
                "full", full,
                "square", square);
    }
    
    public final static class Builder {
 
        private Optional<? extends BrandingImage> full = Optional.empty();
 
        private Optional<? extends BrandingImage> square = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder full(BrandingImage full) {
            Utils.checkNotNull(full, "full");
            this.full = Optional.ofNullable(full);
            return this;
        }

        public Builder full(Optional<? extends BrandingImage> full) {
            Utils.checkNotNull(full, "full");
            this.full = full;
            return this;
        }

        public Builder square(BrandingImage square) {
            Utils.checkNotNull(square, "square");
            this.square = Optional.ofNullable(square);
            return this;
        }

        public Builder square(Optional<? extends BrandingImage> square) {
            Utils.checkNotNull(square, "square");
            this.square = square;
            return this;
        }
        
        public BrandingLogo build() {
            return new BrandingLogo(
                full,
                square);
        }
    }
}

