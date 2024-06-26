/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.models.errors.SDKError;
import io.codat.platform.utils.LazySingletonValue;
import io.codat.platform.utils.Options.Builder;
import io.codat.platform.utils.Options;
import io.codat.platform.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class SetConnectionManagementCorsSettingsRequestBuilder {

    private Optional<? extends io.codat.platform.models.shared.ConnectionManagementAllowedOrigins> request = Optional.empty();
    private Optional<io.codat.platform.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallSetConnectionManagementCorsSettings sdk;

    public SetConnectionManagementCorsSettingsRequestBuilder(SDKMethodInterfaces.MethodCallSetConnectionManagementCorsSettings sdk) {
        this.sdk = sdk;
    }
                
    public SetConnectionManagementCorsSettingsRequestBuilder request(io.codat.platform.models.shared.ConnectionManagementAllowedOrigins request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public SetConnectionManagementCorsSettingsRequestBuilder request(Optional<? extends io.codat.platform.models.shared.ConnectionManagementAllowedOrigins> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public SetConnectionManagementCorsSettingsRequestBuilder retryConfig(io.codat.platform.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public SetConnectionManagementCorsSettingsRequestBuilder retryConfig(Optional<io.codat.platform.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public SetConnectionManagementCorsSettingsResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.set(
            request,
            options);
    }
}
