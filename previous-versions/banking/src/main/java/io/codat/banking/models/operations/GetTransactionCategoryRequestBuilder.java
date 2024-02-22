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


public class GetTransactionCategoryRequestBuilder {

    private GetTransactionCategoryRequest request;
    private Optional<io.codat.banking.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetTransactionCategory sdk;

    public GetTransactionCategoryRequestBuilder(SDKMethodInterfaces.MethodCallGetTransactionCategory sdk) {
        this.sdk = sdk;
    }

    public GetTransactionCategoryRequestBuilder request(GetTransactionCategoryRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetTransactionCategoryRequestBuilder retryConfig(io.codat.banking.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetTransactionCategoryRequestBuilder retryConfig(Optional<io.codat.banking.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetTransactionCategoryResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            request,
            options);
    }
}