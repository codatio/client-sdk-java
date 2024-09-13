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


public class BrandingImage {

    /**
     * Image reference.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image")
    private Optional<? extends ImageReference> image;

    @JsonCreator
    public BrandingImage(
            @JsonProperty("image") Optional<? extends ImageReference> image) {
        Utils.checkNotNull(image, "image");
        this.image = image;
    }
    
    public BrandingImage() {
        this(Optional.empty());
    }

    /**
     * Image reference.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ImageReference> image() {
        return (Optional<ImageReference>) image;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Image reference.
     */
    public BrandingImage withImage(ImageReference image) {
        Utils.checkNotNull(image, "image");
        this.image = Optional.ofNullable(image);
        return this;
    }

    /**
     * Image reference.
     */
    public BrandingImage withImage(Optional<? extends ImageReference> image) {
        Utils.checkNotNull(image, "image");
        this.image = image;
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
        BrandingImage other = (BrandingImage) o;
        return 
            Objects.deepEquals(this.image, other.image);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            image);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BrandingImage.class,
                "image", image);
    }
    
    public final static class Builder {
 
        private Optional<? extends ImageReference> image = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Image reference.
         */
        public Builder image(ImageReference image) {
            Utils.checkNotNull(image, "image");
            this.image = Optional.ofNullable(image);
            return this;
        }

        /**
         * Image reference.
         */
        public Builder image(Optional<? extends ImageReference> image) {
            Utils.checkNotNull(image, "image");
            this.image = image;
            return this;
        }
        
        public BrandingImage build() {
            return new BrandingImage(
                image);
        }
    }
}

