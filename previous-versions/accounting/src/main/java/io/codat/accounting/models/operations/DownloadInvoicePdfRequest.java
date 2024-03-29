/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.SpeakeasyMetadata;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;


public class DownloadInvoicePdfRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for an invoice.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=invoiceId")
    private String invoiceId;

    public DownloadInvoicePdfRequest(
            String companyId,
            String invoiceId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(invoiceId, "invoiceId");
        this.companyId = companyId;
        this.invoiceId = invoiceId;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for an invoice.
     */
    public String invoiceId() {
        return invoiceId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public DownloadInvoicePdfRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for an invoice.
     */
    public DownloadInvoicePdfRequest withInvoiceId(String invoiceId) {
        Utils.checkNotNull(invoiceId, "invoiceId");
        this.invoiceId = invoiceId;
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
        DownloadInvoicePdfRequest other = (DownloadInvoicePdfRequest) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.invoiceId, other.invoiceId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            invoiceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DownloadInvoicePdfRequest.class,
                "companyId", companyId,
                "invoiceId", invoiceId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String invoiceId;  
        
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
         * Unique identifier for an invoice.
         */
        public Builder invoiceId(String invoiceId) {
            Utils.checkNotNull(invoiceId, "invoiceId");
            this.invoiceId = invoiceId;
            return this;
        }
        
        public DownloadInvoicePdfRequest build() {
            return new DownloadInvoicePdfRequest(
                companyId,
                invoiceId);
        }
    }
}

