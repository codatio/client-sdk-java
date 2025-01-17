/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.platform.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ErrorMessage - Too many requests were made in a given amount of time. Wait a short period and then try again.
 */

public class ErrorMessage {

    /**
     * `True` if the error occurred transiently and can be retried.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("canBeRetried")
    private Optional<String> canBeRetried;

    /**
     * Unique identifier used to propagate to all downstream services and determine the source of the error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("correlationId")
    private Optional<String> correlationId;

    /**
     * Machine readable error code used to automate processes based on the code returned.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("detailedErrorCode")
    private Optional<Long> detailedErrorCode;

    /**
     * A brief description of the error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<String> error;

    /**
     * Codat's service the returned the error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("service")
    private Optional<String> service;

    /**
     * The HTTP status code returned by the error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("statusCode")
    private Optional<Long> statusCode;

    /**
     * A human-readable object describing validation decisions Codat has made. If an operation has failed because of validation errors, they will be detailed here.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("validation")
    private JsonNullable<? extends ErrorValidation> validation;

    @JsonCreator
    public ErrorMessage(
            @JsonProperty("canBeRetried") Optional<String> canBeRetried,
            @JsonProperty("correlationId") Optional<String> correlationId,
            @JsonProperty("detailedErrorCode") Optional<Long> detailedErrorCode,
            @JsonProperty("error") Optional<String> error,
            @JsonProperty("service") Optional<String> service,
            @JsonProperty("statusCode") Optional<Long> statusCode,
            @JsonProperty("validation") JsonNullable<? extends ErrorValidation> validation) {
        Utils.checkNotNull(canBeRetried, "canBeRetried");
        Utils.checkNotNull(correlationId, "correlationId");
        Utils.checkNotNull(detailedErrorCode, "detailedErrorCode");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(service, "service");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(validation, "validation");
        this.canBeRetried = canBeRetried;
        this.correlationId = correlationId;
        this.detailedErrorCode = detailedErrorCode;
        this.error = error;
        this.service = service;
        this.statusCode = statusCode;
        this.validation = validation;
    }
    
    public ErrorMessage() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined());
    }

    /**
     * `True` if the error occurred transiently and can be retried.
     */
    @JsonIgnore
    public Optional<String> canBeRetried() {
        return canBeRetried;
    }

    /**
     * Unique identifier used to propagate to all downstream services and determine the source of the error.
     */
    @JsonIgnore
    public Optional<String> correlationId() {
        return correlationId;
    }

    /**
     * Machine readable error code used to automate processes based on the code returned.
     */
    @JsonIgnore
    public Optional<Long> detailedErrorCode() {
        return detailedErrorCode;
    }

    /**
     * A brief description of the error.
     */
    @JsonIgnore
    public Optional<String> error() {
        return error;
    }

    /**
     * Codat's service the returned the error.
     */
    @JsonIgnore
    public Optional<String> service() {
        return service;
    }

    /**
     * The HTTP status code returned by the error.
     */
    @JsonIgnore
    public Optional<Long> statusCode() {
        return statusCode;
    }

    /**
     * A human-readable object describing validation decisions Codat has made. If an operation has failed because of validation errors, they will be detailed here.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<ErrorValidation> validation() {
        return (JsonNullable<ErrorValidation>) validation;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * `True` if the error occurred transiently and can be retried.
     */
    public ErrorMessage withCanBeRetried(String canBeRetried) {
        Utils.checkNotNull(canBeRetried, "canBeRetried");
        this.canBeRetried = Optional.ofNullable(canBeRetried);
        return this;
    }

    /**
     * `True` if the error occurred transiently and can be retried.
     */
    public ErrorMessage withCanBeRetried(Optional<String> canBeRetried) {
        Utils.checkNotNull(canBeRetried, "canBeRetried");
        this.canBeRetried = canBeRetried;
        return this;
    }

    /**
     * Unique identifier used to propagate to all downstream services and determine the source of the error.
     */
    public ErrorMessage withCorrelationId(String correlationId) {
        Utils.checkNotNull(correlationId, "correlationId");
        this.correlationId = Optional.ofNullable(correlationId);
        return this;
    }

    /**
     * Unique identifier used to propagate to all downstream services and determine the source of the error.
     */
    public ErrorMessage withCorrelationId(Optional<String> correlationId) {
        Utils.checkNotNull(correlationId, "correlationId");
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Machine readable error code used to automate processes based on the code returned.
     */
    public ErrorMessage withDetailedErrorCode(long detailedErrorCode) {
        Utils.checkNotNull(detailedErrorCode, "detailedErrorCode");
        this.detailedErrorCode = Optional.ofNullable(detailedErrorCode);
        return this;
    }

    /**
     * Machine readable error code used to automate processes based on the code returned.
     */
    public ErrorMessage withDetailedErrorCode(Optional<Long> detailedErrorCode) {
        Utils.checkNotNull(detailedErrorCode, "detailedErrorCode");
        this.detailedErrorCode = detailedErrorCode;
        return this;
    }

    /**
     * A brief description of the error.
     */
    public ErrorMessage withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * A brief description of the error.
     */
    public ErrorMessage withError(Optional<String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * Codat's service the returned the error.
     */
    public ErrorMessage withService(String service) {
        Utils.checkNotNull(service, "service");
        this.service = Optional.ofNullable(service);
        return this;
    }

    /**
     * Codat's service the returned the error.
     */
    public ErrorMessage withService(Optional<String> service) {
        Utils.checkNotNull(service, "service");
        this.service = service;
        return this;
    }

    /**
     * The HTTP status code returned by the error.
     */
    public ErrorMessage withStatusCode(long statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = Optional.ofNullable(statusCode);
        return this;
    }

    /**
     * The HTTP status code returned by the error.
     */
    public ErrorMessage withStatusCode(Optional<Long> statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * A human-readable object describing validation decisions Codat has made. If an operation has failed because of validation errors, they will be detailed here.
     */
    public ErrorMessage withValidation(ErrorValidation validation) {
        Utils.checkNotNull(validation, "validation");
        this.validation = JsonNullable.of(validation);
        return this;
    }

    /**
     * A human-readable object describing validation decisions Codat has made. If an operation has failed because of validation errors, they will be detailed here.
     */
    public ErrorMessage withValidation(JsonNullable<? extends ErrorValidation> validation) {
        Utils.checkNotNull(validation, "validation");
        this.validation = validation;
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
        ErrorMessage other = (ErrorMessage) o;
        return 
            Objects.deepEquals(this.canBeRetried, other.canBeRetried) &&
            Objects.deepEquals(this.correlationId, other.correlationId) &&
            Objects.deepEquals(this.detailedErrorCode, other.detailedErrorCode) &&
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.service, other.service) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.validation, other.validation);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            canBeRetried,
            correlationId,
            detailedErrorCode,
            error,
            service,
            statusCode,
            validation);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ErrorMessage.class,
                "canBeRetried", canBeRetried,
                "correlationId", correlationId,
                "detailedErrorCode", detailedErrorCode,
                "error", error,
                "service", service,
                "statusCode", statusCode,
                "validation", validation);
    }
    
    public final static class Builder {
 
        private Optional<String> canBeRetried = Optional.empty();
 
        private Optional<String> correlationId = Optional.empty();
 
        private Optional<Long> detailedErrorCode = Optional.empty();
 
        private Optional<String> error = Optional.empty();
 
        private Optional<String> service = Optional.empty();
 
        private Optional<Long> statusCode = Optional.empty();
 
        private JsonNullable<? extends ErrorValidation> validation = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * `True` if the error occurred transiently and can be retried.
         */
        public Builder canBeRetried(String canBeRetried) {
            Utils.checkNotNull(canBeRetried, "canBeRetried");
            this.canBeRetried = Optional.ofNullable(canBeRetried);
            return this;
        }

        /**
         * `True` if the error occurred transiently and can be retried.
         */
        public Builder canBeRetried(Optional<String> canBeRetried) {
            Utils.checkNotNull(canBeRetried, "canBeRetried");
            this.canBeRetried = canBeRetried;
            return this;
        }

        /**
         * Unique identifier used to propagate to all downstream services and determine the source of the error.
         */
        public Builder correlationId(String correlationId) {
            Utils.checkNotNull(correlationId, "correlationId");
            this.correlationId = Optional.ofNullable(correlationId);
            return this;
        }

        /**
         * Unique identifier used to propagate to all downstream services and determine the source of the error.
         */
        public Builder correlationId(Optional<String> correlationId) {
            Utils.checkNotNull(correlationId, "correlationId");
            this.correlationId = correlationId;
            return this;
        }

        /**
         * Machine readable error code used to automate processes based on the code returned.
         */
        public Builder detailedErrorCode(long detailedErrorCode) {
            Utils.checkNotNull(detailedErrorCode, "detailedErrorCode");
            this.detailedErrorCode = Optional.ofNullable(detailedErrorCode);
            return this;
        }

        /**
         * Machine readable error code used to automate processes based on the code returned.
         */
        public Builder detailedErrorCode(Optional<Long> detailedErrorCode) {
            Utils.checkNotNull(detailedErrorCode, "detailedErrorCode");
            this.detailedErrorCode = detailedErrorCode;
            return this;
        }

        /**
         * A brief description of the error.
         */
        public Builder error(String error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        /**
         * A brief description of the error.
         */
        public Builder error(Optional<String> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        /**
         * Codat's service the returned the error.
         */
        public Builder service(String service) {
            Utils.checkNotNull(service, "service");
            this.service = Optional.ofNullable(service);
            return this;
        }

        /**
         * Codat's service the returned the error.
         */
        public Builder service(Optional<String> service) {
            Utils.checkNotNull(service, "service");
            this.service = service;
            return this;
        }

        /**
         * The HTTP status code returned by the error.
         */
        public Builder statusCode(long statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = Optional.ofNullable(statusCode);
            return this;
        }

        /**
         * The HTTP status code returned by the error.
         */
        public Builder statusCode(Optional<Long> statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * A human-readable object describing validation decisions Codat has made. If an operation has failed because of validation errors, they will be detailed here.
         */
        public Builder validation(ErrorValidation validation) {
            Utils.checkNotNull(validation, "validation");
            this.validation = JsonNullable.of(validation);
            return this;
        }

        /**
         * A human-readable object describing validation decisions Codat has made. If an operation has failed because of validation errors, they will be detailed here.
         */
        public Builder validation(JsonNullable<? extends ErrorValidation> validation) {
            Utils.checkNotNull(validation, "validation");
            this.validation = validation;
            return this;
        }
        
        public ErrorMessage build() {
            return new ErrorMessage(
                canBeRetried,
                correlationId,
                detailedErrorCode,
                error,
                service,
                statusCode,
                validation);
        }
    }
}

