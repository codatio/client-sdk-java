/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.sync.payroll.models.components.TrackingCategoryTree;
import io.codat.sync.payroll.utils.Response;
import io.codat.sync.payroll.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetTrackingCategoryResponse implements Response {

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
    private JsonNullable<? extends TrackingCategoryTree> trackingCategoryTree;

    @JsonCreator
    public GetTrackingCategoryResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            JsonNullable<? extends TrackingCategoryTree> trackingCategoryTree) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(trackingCategoryTree, "trackingCategoryTree");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.trackingCategoryTree = trackingCategoryTree;
    }
    
    public GetTrackingCategoryResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, JsonNullable.undefined());
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
    public JsonNullable<TrackingCategoryTree> trackingCategoryTree() {
        return (JsonNullable<TrackingCategoryTree>) trackingCategoryTree;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetTrackingCategoryResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetTrackingCategoryResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetTrackingCategoryResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public GetTrackingCategoryResponse withTrackingCategoryTree(TrackingCategoryTree trackingCategoryTree) {
        Utils.checkNotNull(trackingCategoryTree, "trackingCategoryTree");
        this.trackingCategoryTree = JsonNullable.of(trackingCategoryTree);
        return this;
    }

    /**
     * Success
     */
    public GetTrackingCategoryResponse withTrackingCategoryTree(JsonNullable<? extends TrackingCategoryTree> trackingCategoryTree) {
        Utils.checkNotNull(trackingCategoryTree, "trackingCategoryTree");
        this.trackingCategoryTree = trackingCategoryTree;
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
        GetTrackingCategoryResponse other = (GetTrackingCategoryResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.trackingCategoryTree, other.trackingCategoryTree);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            trackingCategoryTree);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTrackingCategoryResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "trackingCategoryTree", trackingCategoryTree);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private JsonNullable<? extends TrackingCategoryTree> trackingCategoryTree = JsonNullable.undefined();  
        
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
        public Builder trackingCategoryTree(TrackingCategoryTree trackingCategoryTree) {
            Utils.checkNotNull(trackingCategoryTree, "trackingCategoryTree");
            this.trackingCategoryTree = JsonNullable.of(trackingCategoryTree);
            return this;
        }

        /**
         * Success
         */
        public Builder trackingCategoryTree(JsonNullable<? extends TrackingCategoryTree> trackingCategoryTree) {
            Utils.checkNotNull(trackingCategoryTree, "trackingCategoryTree");
            this.trackingCategoryTree = trackingCategoryTree;
            return this;
        }
        
        public GetTrackingCategoryResponse build() {
            return new GetTrackingCategoryResponse(
                contentType,
                statusCode,
                rawResponse,
                trackingCategoryTree);
        }
    }
}

