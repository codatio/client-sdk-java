/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.models.shared.EnhancedFinancialReport;
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


public class GetCategorizedBalanceSheetStatementResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends EnhancedFinancialReport> enhancedFinancialReport;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetCategorizedBalanceSheetStatementResponse(
            String contentType,
            Optional<? extends EnhancedFinancialReport> enhancedFinancialReport,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(enhancedFinancialReport, "enhancedFinancialReport");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.enhancedFinancialReport = enhancedFinancialReport;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetCategorizedBalanceSheetStatementResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<EnhancedFinancialReport> enhancedFinancialReport() {
        return (Optional<EnhancedFinancialReport>) enhancedFinancialReport;
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
     * HTTP response content type for this operation
     */
    public GetCategorizedBalanceSheetStatementResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public GetCategorizedBalanceSheetStatementResponse withEnhancedFinancialReport(EnhancedFinancialReport enhancedFinancialReport) {
        Utils.checkNotNull(enhancedFinancialReport, "enhancedFinancialReport");
        this.enhancedFinancialReport = Optional.ofNullable(enhancedFinancialReport);
        return this;
    }

    /**
     * OK
     */
    public GetCategorizedBalanceSheetStatementResponse withEnhancedFinancialReport(Optional<? extends EnhancedFinancialReport> enhancedFinancialReport) {
        Utils.checkNotNull(enhancedFinancialReport, "enhancedFinancialReport");
        this.enhancedFinancialReport = enhancedFinancialReport;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetCategorizedBalanceSheetStatementResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetCategorizedBalanceSheetStatementResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetCategorizedBalanceSheetStatementResponse other = (GetCategorizedBalanceSheetStatementResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.enhancedFinancialReport, other.enhancedFinancialReport) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            enhancedFinancialReport,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCategorizedBalanceSheetStatementResponse.class,
                "contentType", contentType,
                "enhancedFinancialReport", enhancedFinancialReport,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends EnhancedFinancialReport> enhancedFinancialReport = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
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
         * OK
         */
        public Builder enhancedFinancialReport(EnhancedFinancialReport enhancedFinancialReport) {
            Utils.checkNotNull(enhancedFinancialReport, "enhancedFinancialReport");
            this.enhancedFinancialReport = Optional.ofNullable(enhancedFinancialReport);
            return this;
        }

        /**
         * OK
         */
        public Builder enhancedFinancialReport(Optional<? extends EnhancedFinancialReport> enhancedFinancialReport) {
            Utils.checkNotNull(enhancedFinancialReport, "enhancedFinancialReport");
            this.enhancedFinancialReport = enhancedFinancialReport;
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
        
        public GetCategorizedBalanceSheetStatementResponse build() {
            return new GetCategorizedBalanceSheetStatementResponse(
                contentType,
                enhancedFinancialReport,
                statusCode,
                rawResponse);
        }
    }
}

