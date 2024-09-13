/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.models.shared.AccountingAgedDebtorReport;
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


public class GetAccountingAgedDebtorsReportResponse implements Response {

    /**
     * OK
     */
    private Optional<? extends AccountingAgedDebtorReport> accountingAgedDebtorReport;

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
    public GetAccountingAgedDebtorsReportResponse(
            Optional<? extends AccountingAgedDebtorReport> accountingAgedDebtorReport,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(accountingAgedDebtorReport, "accountingAgedDebtorReport");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.accountingAgedDebtorReport = accountingAgedDebtorReport;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetAccountingAgedDebtorsReportResponse(
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
    public Optional<AccountingAgedDebtorReport> accountingAgedDebtorReport() {
        return (Optional<AccountingAgedDebtorReport>) accountingAgedDebtorReport;
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
    public GetAccountingAgedDebtorsReportResponse withAccountingAgedDebtorReport(AccountingAgedDebtorReport accountingAgedDebtorReport) {
        Utils.checkNotNull(accountingAgedDebtorReport, "accountingAgedDebtorReport");
        this.accountingAgedDebtorReport = Optional.ofNullable(accountingAgedDebtorReport);
        return this;
    }

    /**
     * OK
     */
    public GetAccountingAgedDebtorsReportResponse withAccountingAgedDebtorReport(Optional<? extends AccountingAgedDebtorReport> accountingAgedDebtorReport) {
        Utils.checkNotNull(accountingAgedDebtorReport, "accountingAgedDebtorReport");
        this.accountingAgedDebtorReport = accountingAgedDebtorReport;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetAccountingAgedDebtorsReportResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetAccountingAgedDebtorsReportResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetAccountingAgedDebtorsReportResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetAccountingAgedDebtorsReportResponse other = (GetAccountingAgedDebtorsReportResponse) o;
        return 
            Objects.deepEquals(this.accountingAgedDebtorReport, other.accountingAgedDebtorReport) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountingAgedDebtorReport,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingAgedDebtorsReportResponse.class,
                "accountingAgedDebtorReport", accountingAgedDebtorReport,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends AccountingAgedDebtorReport> accountingAgedDebtorReport = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder accountingAgedDebtorReport(AccountingAgedDebtorReport accountingAgedDebtorReport) {
            Utils.checkNotNull(accountingAgedDebtorReport, "accountingAgedDebtorReport");
            this.accountingAgedDebtorReport = Optional.ofNullable(accountingAgedDebtorReport);
            return this;
        }

        /**
         * OK
         */
        public Builder accountingAgedDebtorReport(Optional<? extends AccountingAgedDebtorReport> accountingAgedDebtorReport) {
            Utils.checkNotNull(accountingAgedDebtorReport, "accountingAgedDebtorReport");
            this.accountingAgedDebtorReport = accountingAgedDebtorReport;
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
        
        public GetAccountingAgedDebtorsReportResponse build() {
            return new GetAccountingAgedDebtorsReportResponse(
                accountingAgedDebtorReport,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

