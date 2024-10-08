/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.models.shared.AccountingCreditNote;
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


public class GetAccountingCreditNoteResponse implements Response {

    /**
     * Success
     */
    private JsonNullable<? extends AccountingCreditNote> accountingCreditNote;

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
    public GetAccountingCreditNoteResponse(
            JsonNullable<? extends AccountingCreditNote> accountingCreditNote,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(accountingCreditNote, "accountingCreditNote");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.accountingCreditNote = accountingCreditNote;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetAccountingCreditNoteResponse(
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
    public JsonNullable<AccountingCreditNote> accountingCreditNote() {
        return (JsonNullable<AccountingCreditNote>) accountingCreditNote;
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
    public GetAccountingCreditNoteResponse withAccountingCreditNote(AccountingCreditNote accountingCreditNote) {
        Utils.checkNotNull(accountingCreditNote, "accountingCreditNote");
        this.accountingCreditNote = JsonNullable.of(accountingCreditNote);
        return this;
    }

    /**
     * Success
     */
    public GetAccountingCreditNoteResponse withAccountingCreditNote(JsonNullable<? extends AccountingCreditNote> accountingCreditNote) {
        Utils.checkNotNull(accountingCreditNote, "accountingCreditNote");
        this.accountingCreditNote = accountingCreditNote;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetAccountingCreditNoteResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetAccountingCreditNoteResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetAccountingCreditNoteResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetAccountingCreditNoteResponse other = (GetAccountingCreditNoteResponse) o;
        return 
            Objects.deepEquals(this.accountingCreditNote, other.accountingCreditNote) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountingCreditNote,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingCreditNoteResponse.class,
                "accountingCreditNote", accountingCreditNote,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends AccountingCreditNote> accountingCreditNote = JsonNullable.undefined();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder accountingCreditNote(AccountingCreditNote accountingCreditNote) {
            Utils.checkNotNull(accountingCreditNote, "accountingCreditNote");
            this.accountingCreditNote = JsonNullable.of(accountingCreditNote);
            return this;
        }

        /**
         * Success
         */
        public Builder accountingCreditNote(JsonNullable<? extends AccountingCreditNote> accountingCreditNote) {
            Utils.checkNotNull(accountingCreditNote, "accountingCreditNote");
            this.accountingCreditNote = accountingCreditNote;
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
        
        public GetAccountingCreditNoteResponse build() {
            return new GetAccountingCreditNoteResponse(
                accountingCreditNote,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

