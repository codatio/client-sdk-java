/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.accounting.utils.LazySingletonValue;
import io.codat.accounting.utils.Options.Builder;
import io.codat.accounting.utils.Options;
import io.codat.accounting.utils.Utils;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetCreateItemsModelRequestBuilder {

    private GetCreateItemsModelRequest request;
    private Optional<io.codat.accounting.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetCreateItemsModel sdk;

    public GetCreateItemsModelRequestBuilder(SDKMethodInterfaces.MethodCallGetCreateItemsModel sdk) {
        this.sdk = sdk;
    }

    public GetCreateItemsModelRequestBuilder request(GetCreateItemsModelRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetCreateItemsModelRequestBuilder retryConfig(io.codat.accounting.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetCreateItemsModelRequestBuilder retryConfig(Optional<io.codat.accounting.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetCreateItemsModelResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getCreateModel(
            request,
            options);
    }
}