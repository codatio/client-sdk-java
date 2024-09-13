/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.models.shared.AccountingDirectCosts;
import io.codat.lending.utils.Response;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class ListAccountingDirectCostsResponse implements Response {

    /**
     * Success
     */
    private Optional<? extends AccountingDirectCosts> accountingDirectCosts;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ListAccountingDirectCostsResponse(
            Optional<? extends AccountingDirectCosts> accountingDirectCosts,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(accountingDirectCosts, "accountingDirectCosts");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.accountingDirectCosts = accountingDirectCosts;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListAccountingDirectCostsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, statusCode, rawResponse);
    }

    /**
     * Success
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountingDirectCosts> accountingDirectCosts() {
        return (Optional<AccountingDirectCosts>) accountingDirectCosts;
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Success
     */
    public ListAccountingDirectCostsResponse withAccountingDirectCosts(AccountingDirectCosts accountingDirectCosts) {
        Utils.checkNotNull(accountingDirectCosts, "accountingDirectCosts");
        this.accountingDirectCosts = Optional.ofNullable(accountingDirectCosts);
        return this;
    }

    /**
     * Success
     */
    public ListAccountingDirectCostsResponse withAccountingDirectCosts(Optional<? extends AccountingDirectCosts> accountingDirectCosts) {
        Utils.checkNotNull(accountingDirectCosts, "accountingDirectCosts");
        this.accountingDirectCosts = accountingDirectCosts;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public ListAccountingDirectCostsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListAccountingDirectCostsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListAccountingDirectCostsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
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
        ListAccountingDirectCostsResponse other = (ListAccountingDirectCostsResponse) o;
        return 
            Objects.deepEquals(this.accountingDirectCosts, other.accountingDirectCosts) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountingDirectCosts,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListAccountingDirectCostsResponse.class,
                "accountingDirectCosts", accountingDirectCosts,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends AccountingDirectCosts> accountingDirectCosts = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder accountingDirectCosts(AccountingDirectCosts accountingDirectCosts) {
            Utils.checkNotNull(accountingDirectCosts, "accountingDirectCosts");
            this.accountingDirectCosts = Optional.ofNullable(accountingDirectCosts);
            return this;
        }

        /**
         * Success
         */
        public Builder accountingDirectCosts(Optional<? extends AccountingDirectCosts> accountingDirectCosts) {
            Utils.checkNotNull(accountingDirectCosts, "accountingDirectCosts");
            this.accountingDirectCosts = accountingDirectCosts;
            return this;
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }
        
        public ListAccountingDirectCostsResponse build() {
            return new ListAccountingDirectCostsResponse(
                accountingDirectCosts,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

