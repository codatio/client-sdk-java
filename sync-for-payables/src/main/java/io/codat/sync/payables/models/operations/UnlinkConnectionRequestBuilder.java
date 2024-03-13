/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payables.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.payables.models.errors.SDKError;
import io.codat.sync.payables.utils.LazySingletonValue;
import io.codat.sync.payables.utils.Options.Builder;
import io.codat.sync.payables.utils.Options;
import io.codat.sync.payables.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class UnlinkConnectionRequestBuilder {

    private UnlinkConnectionRequest request;
    private Optional<io.codat.sync.payables.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUnlinkConnection sdk;

    public UnlinkConnectionRequestBuilder(SDKMethodInterfaces.MethodCallUnlinkConnection sdk) {
        this.sdk = sdk;
    }

    public UnlinkConnectionRequestBuilder request(UnlinkConnectionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public UnlinkConnectionRequestBuilder retryConfig(io.codat.sync.payables.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public UnlinkConnectionRequestBuilder retryConfig(Optional<io.codat.sync.payables.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public UnlinkConnectionResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.unlink(
            request,
            options);
    }
}
