/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * DatasetStatus - The current status of the dataset.
 */
public enum DatasetStatus {
    INITIAL("Initial"),
    QUEUED("Queued"),
    FETCHING("Fetching"),
    MAP_QUEUED("MapQueued"),
    MAPPING("Mapping"),
    COMPLETE("Complete"),
    FETCH_ERROR("FetchError"),
    MAP_ERROR("MapError"),
    INTERNAL_ERROR("InternalError"),
    PROCESSING_QUEUED("ProcessingQueued"),
    PROCESSING("Processing"),
    PROCESSING_ERROR("ProcessingError"),
    VALIDATION_QUEUED("ValidationQueued"),
    VALIDATING("Validating"),
    VALIDATION_ERROR("ValidationError"),
    AUTH_ERROR("AuthError"),
    CANCELLED("Cancelled"),
    NOT_SUPPORTED("NotSupported"),
    RATE_LIMIT_ERROR("RateLimitError"),
    PERMISSIONS_ERROR("PermissionsError"),
    PREREQUISITE_NOT_MET("PrerequisiteNotMet");

    @JsonValue
    private final String value;

    private DatasetStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
