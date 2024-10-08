/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetCommerceProductCategoryRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for a connection.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connectionId")
    private String connectionId;

    /**
     * Unique identifier for a product.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=productId")
    private String productId;

    @JsonCreator
    public GetCommerceProductCategoryRequest(
            String companyId,
            String connectionId,
            String productId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(productId, "productId");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.productId = productId;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a connection.
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * Unique identifier for a product.
     */
    @JsonIgnore
    public String productId() {
        return productId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetCommerceProductCategoryRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public GetCommerceProductCategoryRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for a product.
     */
    public GetCommerceProductCategoryRequest withProductId(String productId) {
        Utils.checkNotNull(productId, "productId");
        this.productId = productId;
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
        GetCommerceProductCategoryRequest other = (GetCommerceProductCategoryRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.productId, other.productId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            connectionId,
            productId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCommerceProductCategoryRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "productId", productId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;
 
        private String productId;  
        
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
         * Unique identifier for a connection.
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Unique identifier for a product.
         */
        public Builder productId(String productId) {
            Utils.checkNotNull(productId, "productId");
            this.productId = productId;
            return this;
        }
        
        public GetCommerceProductCategoryRequest build() {
            return new GetCommerceProductCategoryRequest(
                companyId,
                connectionId,
                productId);
        }
    }
}

