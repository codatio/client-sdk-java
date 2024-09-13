/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.models.shared.AccountingBillCreditNote;
import io.codat.lending.utils.Response;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetAccountingBillCreditNoteResponse implements Response {

    /**
     * Success
     */
    private JsonNullable<? extends AccountingBillCreditNote> accountingBillCreditNote;

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
    public GetAccountingBillCreditNoteResponse(
            JsonNullable<? extends AccountingBillCreditNote> accountingBillCreditNote,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(accountingBillCreditNote, "accountingBillCreditNote");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.accountingBillCreditNote = accountingBillCreditNote;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetAccountingBillCreditNoteResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(JsonNullable.undefined(), contentType, statusCode, rawResponse);
    }

    /**
     * Success
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AccountingBillCreditNote> accountingBillCreditNote() {
        return (JsonNullable<AccountingBillCreditNote>) accountingBillCreditNote;
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
    public GetAccountingBillCreditNoteResponse withAccountingBillCreditNote(AccountingBillCreditNote accountingBillCreditNote) {
        Utils.checkNotNull(accountingBillCreditNote, "accountingBillCreditNote");
        this.accountingBillCreditNote = JsonNullable.of(accountingBillCreditNote);
        return this;
    }

    /**
     * Success
     */
    public GetAccountingBillCreditNoteResponse withAccountingBillCreditNote(JsonNullable<? extends AccountingBillCreditNote> accountingBillCreditNote) {
        Utils.checkNotNull(accountingBillCreditNote, "accountingBillCreditNote");
        this.accountingBillCreditNote = accountingBillCreditNote;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetAccountingBillCreditNoteResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetAccountingBillCreditNoteResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetAccountingBillCreditNoteResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetAccountingBillCreditNoteResponse other = (GetAccountingBillCreditNoteResponse) o;
        return 
            Objects.deepEquals(this.accountingBillCreditNote, other.accountingBillCreditNote) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountingBillCreditNote,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingBillCreditNoteResponse.class,
                "accountingBillCreditNote", accountingBillCreditNote,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends AccountingBillCreditNote> accountingBillCreditNote = JsonNullable.undefined();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder accountingBillCreditNote(AccountingBillCreditNote accountingBillCreditNote) {
            Utils.checkNotNull(accountingBillCreditNote, "accountingBillCreditNote");
            this.accountingBillCreditNote = JsonNullable.of(accountingBillCreditNote);
            return this;
        }

        /**
         * Success
         */
        public Builder accountingBillCreditNote(JsonNullable<? extends AccountingBillCreditNote> accountingBillCreditNote) {
            Utils.checkNotNull(accountingBillCreditNote, "accountingBillCreditNote");
            this.accountingBillCreditNote = accountingBillCreditNote;
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
        
        public GetAccountingBillCreditNoteResponse build() {
            return new GetAccountingBillCreditNoteResponse(
                accountingBillCreditNote,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

