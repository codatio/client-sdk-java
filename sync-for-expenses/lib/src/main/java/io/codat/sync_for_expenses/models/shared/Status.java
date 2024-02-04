/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync_for_expenses.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.sync_for_expenses.utils.Utils;
import java.io.InputStream;

/**
 * Status - The current status of the pull operation.
 */
public enum Status {
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
    ROUTING("Routing"),
    ROUTING_ERROR("RoutingError"),
    NOT_SUPPORTED("NotSupported"),
    RATE_LIMIT_ERROR("RateLimitError"),
    PERMISSIONS_ERROR("PermissionsError"),
    PREREQUISITE_NOT_MET("PrerequisiteNotMet");

    @JsonValue
    private final String value;

    private Status(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
