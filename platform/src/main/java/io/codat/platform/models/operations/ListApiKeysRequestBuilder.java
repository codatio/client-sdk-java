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


public class ListApiKeysRequestBuilder {

    private Optional<io.codat.platform.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListApiKeys sdk;

    public ListApiKeysRequestBuilder(SDKMethodInterfaces.MethodCallListApiKeys sdk) {
        this.sdk = sdk;
    }
                
    public ListApiKeysRequestBuilder retryConfig(io.codat.platform.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ListApiKeysRequestBuilder retryConfig(Optional<io.codat.platform.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ListApiKeysResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.listApiKeys(
            options);
    }
}
