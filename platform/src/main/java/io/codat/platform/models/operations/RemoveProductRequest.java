/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.platform.utils.SpeakeasyMetadata;
import io.codat.platform.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class RemoveProductRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Human-readable product identifier for a product.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=productIdentifier")
    private String productIdentifier;

    @JsonCreator
    public RemoveProductRequest(
            String companyId,
            String productIdentifier) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(productIdentifier, "productIdentifier");
        this.companyId = companyId;
        this.productIdentifier = productIdentifier;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Human-readable product identifier for a product.
     */
    @JsonIgnore
    public String productIdentifier() {
        return productIdentifier;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public RemoveProductRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Human-readable product identifier for a product.
     */
    public RemoveProductRequest withProductIdentifier(String productIdentifier) {
        Utils.checkNotNull(productIdentifier, "productIdentifier");
        this.productIdentifier = productIdentifier;
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
        RemoveProductRequest other = (RemoveProductRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.productIdentifier, other.productIdentifier);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            productIdentifier);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RemoveProductRequest.class,
                "companyId", companyId,
                "productIdentifier", productIdentifier);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String productIdentifier;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for a company.
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        /**
         * Human-readable product identifier for a product.
         */
        public Builder productIdentifier(String productIdentifier) {
            Utils.checkNotNull(productIdentifier, "productIdentifier");
            this.productIdentifier = productIdentifier;
            return this;
        }
        
        public RemoveProductRequest build() {
            return new RemoveProductRequest(
                companyId,
                productIdentifier);
        }
    }
}

