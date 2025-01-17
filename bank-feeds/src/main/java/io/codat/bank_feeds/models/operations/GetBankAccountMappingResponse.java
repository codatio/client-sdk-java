/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.bank_feeds.models.components.BankFeedMapping;
import io.codat.bank_feeds.utils.Response;
import io.codat.bank_feeds.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class GetBankAccountMappingResponse implements Response {

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

    /**
     * Success
     */
    private Optional<? extends List<BankFeedMapping>> bankFeedMappings;

    @JsonCreator
    public GetBankAccountMappingResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends List<BankFeedMapping>> bankFeedMappings) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(bankFeedMappings, "bankFeedMappings");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.bankFeedMappings = bankFeedMappings;
    }
    
    public GetBankAccountMappingResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
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

    /**
     * Success
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<BankFeedMapping>> bankFeedMappings() {
        return (Optional<List<BankFeedMapping>>) bankFeedMappings;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetBankAccountMappingResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetBankAccountMappingResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetBankAccountMappingResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public GetBankAccountMappingResponse withBankFeedMappings(List<BankFeedMapping> bankFeedMappings) {
        Utils.checkNotNull(bankFeedMappings, "bankFeedMappings");
        this.bankFeedMappings = Optional.ofNullable(bankFeedMappings);
        return this;
    }

    /**
     * Success
     */
    public GetBankAccountMappingResponse withBankFeedMappings(Optional<? extends List<BankFeedMapping>> bankFeedMappings) {
        Utils.checkNotNull(bankFeedMappings, "bankFeedMappings");
        this.bankFeedMappings = bankFeedMappings;
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
        GetBankAccountMappingResponse other = (GetBankAccountMappingResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.bankFeedMappings, other.bankFeedMappings);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            bankFeedMappings);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBankAccountMappingResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "bankFeedMappings", bankFeedMappings);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends List<BankFeedMapping>> bankFeedMappings = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        /**
         * Success
         */
        public Builder bankFeedMappings(List<BankFeedMapping> bankFeedMappings) {
            Utils.checkNotNull(bankFeedMappings, "bankFeedMappings");
            this.bankFeedMappings = Optional.ofNullable(bankFeedMappings);
            return this;
        }

        /**
         * Success
         */
        public Builder bankFeedMappings(Optional<? extends List<BankFeedMapping>> bankFeedMappings) {
            Utils.checkNotNull(bankFeedMappings, "bankFeedMappings");
            this.bankFeedMappings = bankFeedMappings;
            return this;
        }
        
        public GetBankAccountMappingResponse build() {
            return new GetBankAccountMappingResponse(
                contentType,
                statusCode,
                rawResponse,
                bankFeedMappings);
        }
    }
}

