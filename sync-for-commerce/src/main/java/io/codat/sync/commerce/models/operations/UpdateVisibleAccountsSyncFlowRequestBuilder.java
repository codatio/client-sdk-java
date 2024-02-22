/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.commerce.utils.LazySingletonValue;
import io.codat.sync.commerce.utils.Options.Builder;
import io.codat.sync.commerce.utils.Options;
import io.codat.sync.commerce.utils.Utils;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class UpdateVisibleAccountsSyncFlowRequestBuilder {

    private UpdateVisibleAccountsSyncFlowRequest request;
    private Optional<io.codat.sync.commerce.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUpdateVisibleAccountsSyncFlow sdk;

    public UpdateVisibleAccountsSyncFlowRequestBuilder(SDKMethodInterfaces.MethodCallUpdateVisibleAccountsSyncFlow sdk) {
        this.sdk = sdk;
    }

    public UpdateVisibleAccountsSyncFlowRequestBuilder request(UpdateVisibleAccountsSyncFlowRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateVisibleAccountsSyncFlowRequestBuilder retryConfig(io.codat.sync.commerce.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public UpdateVisibleAccountsSyncFlowRequestBuilder retryConfig(Optional<io.codat.sync.commerce.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public UpdateVisibleAccountsSyncFlowResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.updateVisibleAccountsSyncFlow(
            request,
            options);
    }
}