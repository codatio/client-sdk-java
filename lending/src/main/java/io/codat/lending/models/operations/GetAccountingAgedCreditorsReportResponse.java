/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.models.shared.AccountingAgedCreditorReport;
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


public class GetAccountingAgedCreditorsReportResponse implements Response {

    /**
     * OK
     */
    private Optional<? extends AccountingAgedCreditorReport> accountingAgedCreditorReport;

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
    public GetAccountingAgedCreditorsReportResponse(
            Optional<? extends AccountingAgedCreditorReport> accountingAgedCreditorReport,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(accountingAgedCreditorReport, "accountingAgedCreditorReport");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.accountingAgedCreditorReport = accountingAgedCreditorReport;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetAccountingAgedCreditorsReportResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, statusCode, rawResponse);
    }

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountingAgedCreditorReport> accountingAgedCreditorReport() {
        return (Optional<AccountingAgedCreditorReport>) accountingAgedCreditorReport;
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
     * OK
     */
    public GetAccountingAgedCreditorsReportResponse withAccountingAgedCreditorReport(AccountingAgedCreditorReport accountingAgedCreditorReport) {
        Utils.checkNotNull(accountingAgedCreditorReport, "accountingAgedCreditorReport");
        this.accountingAgedCreditorReport = Optional.ofNullable(accountingAgedCreditorReport);
        return this;
    }

    /**
     * OK
     */
    public GetAccountingAgedCreditorsReportResponse withAccountingAgedCreditorReport(Optional<? extends AccountingAgedCreditorReport> accountingAgedCreditorReport) {
        Utils.checkNotNull(accountingAgedCreditorReport, "accountingAgedCreditorReport");
        this.accountingAgedCreditorReport = accountingAgedCreditorReport;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetAccountingAgedCreditorsReportResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetAccountingAgedCreditorsReportResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetAccountingAgedCreditorsReportResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetAccountingAgedCreditorsReportResponse other = (GetAccountingAgedCreditorsReportResponse) o;
        return 
            Objects.deepEquals(this.accountingAgedCreditorReport, other.accountingAgedCreditorReport) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountingAgedCreditorReport,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingAgedCreditorsReportResponse.class,
                "accountingAgedCreditorReport", accountingAgedCreditorReport,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends AccountingAgedCreditorReport> accountingAgedCreditorReport = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder accountingAgedCreditorReport(AccountingAgedCreditorReport accountingAgedCreditorReport) {
            Utils.checkNotNull(accountingAgedCreditorReport, "accountingAgedCreditorReport");
            this.accountingAgedCreditorReport = Optional.ofNullable(accountingAgedCreditorReport);
            return this;
        }

        /**
         * OK
         */
        public Builder accountingAgedCreditorReport(Optional<? extends AccountingAgedCreditorReport> accountingAgedCreditorReport) {
            Utils.checkNotNull(accountingAgedCreditorReport, "accountingAgedCreditorReport");
            this.accountingAgedCreditorReport = accountingAgedCreditorReport;
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
        
        public GetAccountingAgedCreditorsReportResponse build() {
            return new GetAccountingAgedCreditorsReportResponse(
                accountingAgedCreditorReport,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

