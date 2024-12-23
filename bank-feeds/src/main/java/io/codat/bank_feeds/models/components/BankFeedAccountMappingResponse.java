/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.bank_feeds.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class BankFeedAccountMappingResponse {

    /**
     * Error returned during the post request
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private JsonNullable<String> error;

    /**
     * Unique ID for the source account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceAccountId")
    private Optional<String> sourceAccountId;

    /**
     * Status of the POST request.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private JsonNullable<String> status;

    /**
     * Unique ID for the target account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("targetAccountId")
    private JsonNullable<String> targetAccountId;

    @JsonCreator
    public BankFeedAccountMappingResponse(
            @JsonProperty("error") JsonNullable<String> error,
            @JsonProperty("sourceAccountId") Optional<String> sourceAccountId,
            @JsonProperty("status") JsonNullable<String> status,
            @JsonProperty("targetAccountId") JsonNullable<String> targetAccountId) {
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(sourceAccountId, "sourceAccountId");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(targetAccountId, "targetAccountId");
        this.error = error;
        this.sourceAccountId = sourceAccountId;
        this.status = status;
        this.targetAccountId = targetAccountId;
    }
    
    public BankFeedAccountMappingResponse() {
        this(JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Error returned during the post request
     */
    @JsonIgnore
    public JsonNullable<String> error() {
        return error;
    }

    /**
     * Unique ID for the source account.
     */
    @JsonIgnore
    public Optional<String> sourceAccountId() {
        return sourceAccountId;
    }

    /**
     * Status of the POST request.
     */
    @JsonIgnore
    public JsonNullable<String> status() {
        return status;
    }

    /**
     * Unique ID for the target account.
     */
    @JsonIgnore
    public JsonNullable<String> targetAccountId() {
        return targetAccountId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Error returned during the post request
     */
    public BankFeedAccountMappingResponse withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = JsonNullable.of(error);
        return this;
    }

    /**
     * Error returned during the post request
     */
    public BankFeedAccountMappingResponse withError(JsonNullable<String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * Unique ID for the source account.
     */
    public BankFeedAccountMappingResponse withSourceAccountId(String sourceAccountId) {
        Utils.checkNotNull(sourceAccountId, "sourceAccountId");
        this.sourceAccountId = Optional.ofNullable(sourceAccountId);
        return this;
    }

    /**
     * Unique ID for the source account.
     */
    public BankFeedAccountMappingResponse withSourceAccountId(Optional<String> sourceAccountId) {
        Utils.checkNotNull(sourceAccountId, "sourceAccountId");
        this.sourceAccountId = sourceAccountId;
        return this;
    }

    /**
     * Status of the POST request.
     */
    public BankFeedAccountMappingResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = JsonNullable.of(status);
        return this;
    }

    /**
     * Status of the POST request.
     */
    public BankFeedAccountMappingResponse withStatus(JsonNullable<String> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Unique ID for the target account.
     */
    public BankFeedAccountMappingResponse withTargetAccountId(String targetAccountId) {
        Utils.checkNotNull(targetAccountId, "targetAccountId");
        this.targetAccountId = JsonNullable.of(targetAccountId);
        return this;
    }

    /**
     * Unique ID for the target account.
     */
    public BankFeedAccountMappingResponse withTargetAccountId(JsonNullable<String> targetAccountId) {
        Utils.checkNotNull(targetAccountId, "targetAccountId");
        this.targetAccountId = targetAccountId;
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
        BankFeedAccountMappingResponse other = (BankFeedAccountMappingResponse) o;
        return 
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.sourceAccountId, other.sourceAccountId) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.targetAccountId, other.targetAccountId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            error,
            sourceAccountId,
            status,
            targetAccountId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BankFeedAccountMappingResponse.class,
                "error", error,
                "sourceAccountId", sourceAccountId,
                "status", status,
                "targetAccountId", targetAccountId);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> error = JsonNullable.undefined();
 
        private Optional<String> sourceAccountId = Optional.empty();
 
        private JsonNullable<String> status = JsonNullable.undefined();
 
        private JsonNullable<String> targetAccountId = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Error returned during the post request
         */
        public Builder error(String error) {
            Utils.checkNotNull(error, "error");
            this.error = JsonNullable.of(error);
            return this;
        }

        /**
         * Error returned during the post request
         */
        public Builder error(JsonNullable<String> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        /**
         * Unique ID for the source account.
         */
        public Builder sourceAccountId(String sourceAccountId) {
            Utils.checkNotNull(sourceAccountId, "sourceAccountId");
            this.sourceAccountId = Optional.ofNullable(sourceAccountId);
            return this;
        }

        /**
         * Unique ID for the source account.
         */
        public Builder sourceAccountId(Optional<String> sourceAccountId) {
            Utils.checkNotNull(sourceAccountId, "sourceAccountId");
            this.sourceAccountId = sourceAccountId;
            return this;
        }

        /**
         * Status of the POST request.
         */
        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = JsonNullable.of(status);
            return this;
        }

        /**
         * Status of the POST request.
         */
        public Builder status(JsonNullable<String> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Unique ID for the target account.
         */
        public Builder targetAccountId(String targetAccountId) {
            Utils.checkNotNull(targetAccountId, "targetAccountId");
            this.targetAccountId = JsonNullable.of(targetAccountId);
            return this;
        }

        /**
         * Unique ID for the target account.
         */
        public Builder targetAccountId(JsonNullable<String> targetAccountId) {
            Utils.checkNotNull(targetAccountId, "targetAccountId");
            this.targetAccountId = targetAccountId;
            return this;
        }
        
        public BankFeedAccountMappingResponse build() {
            return new BankFeedAccountMappingResponse(
                error,
                sourceAccountId,
                status,
                targetAccountId);
        }
    }
}

