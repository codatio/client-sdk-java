/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.banking.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.banking.utils.LazySingletonValue;
import io.codat.banking.utils.Options.Builder;
import io.codat.banking.utils.Options;
import io.codat.banking.utils.Utils;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetAccountRequestBuilder {

    private GetAccountRequest request;
    private Optional<io.codat.banking.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetAccount sdk;

    public GetAccountRequestBuilder(SDKMethodInterfaces.MethodCallGetAccount sdk) {
        this.sdk = sdk;
    }

    public GetAccountRequestBuilder request(GetAccountRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAccountRequestBuilder retryConfig(io.codat.banking.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetAccountRequestBuilder retryConfig(Optional<io.codat.banking.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetAccountResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            request,
            options);
    }
}