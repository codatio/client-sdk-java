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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * SourceAccountBatchErrorResponse - Describes the error that occured when trying to create the specified source account.
 */

public class SourceAccountBatchErrorResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("result")
    private Optional<? extends Result> result;

    /**
     * Unique ID for the source account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceAccountId")
    private Optional<String> sourceAccountId;

    @JsonCreator
    public SourceAccountBatchErrorResponse(
            @JsonProperty("result") Optional<? extends Result> result,
            @JsonProperty("sourceAccountId") Optional<String> sourceAccountId) {
        Utils.checkNotNull(result, "result");
        Utils.checkNotNull(sourceAccountId, "sourceAccountId");
        this.result = result;
        this.sourceAccountId = sourceAccountId;
    }
    
    public SourceAccountBatchErrorResponse() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Result> result() {
        return (Optional<Result>) result;
    }

    /**
     * Unique ID for the source account.
     */
    @JsonIgnore
    public Optional<String> sourceAccountId() {
        return sourceAccountId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceAccountBatchErrorResponse withResult(Result result) {
        Utils.checkNotNull(result, "result");
        this.result = Optional.ofNullable(result);
        return this;
    }

    public SourceAccountBatchErrorResponse withResult(Optional<? extends Result> result) {
        Utils.checkNotNull(result, "result");
        this.result = result;
        return this;
    }

    /**
     * Unique ID for the source account.
     */
    public SourceAccountBatchErrorResponse withSourceAccountId(String sourceAccountId) {
        Utils.checkNotNull(sourceAccountId, "sourceAccountId");
        this.sourceAccountId = Optional.ofNullable(sourceAccountId);
        return this;
    }

    /**
     * Unique ID for the source account.
     */
    public SourceAccountBatchErrorResponse withSourceAccountId(Optional<String> sourceAccountId) {
        Utils.checkNotNull(sourceAccountId, "sourceAccountId");
        this.sourceAccountId = sourceAccountId;
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
        SourceAccountBatchErrorResponse other = (SourceAccountBatchErrorResponse) o;
        return 
            Objects.deepEquals(this.result, other.result) &&
            Objects.deepEquals(this.sourceAccountId, other.sourceAccountId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            result,
            sourceAccountId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAccountBatchErrorResponse.class,
                "result", result,
                "sourceAccountId", sourceAccountId);
    }
    
    public final static class Builder {
 
        private Optional<? extends Result> result = Optional.empty();
 
        private Optional<String> sourceAccountId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder result(Result result) {
            Utils.checkNotNull(result, "result");
            this.result = Optional.ofNullable(result);
            return this;
        }

        public Builder result(Optional<? extends Result> result) {
            Utils.checkNotNull(result, "result");
            this.result = result;
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
        
        public SourceAccountBatchErrorResponse build() {
            return new SourceAccountBatchErrorResponse(
                result,
                sourceAccountId);
        }
    }
}
