/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payables.models.operations;

import io.codat.sync.payables.utils.Options;
import io.codat.sync.payables.utils.RetryConfig;
import io.codat.sync.payables.utils.Utils;
import java.util.Optional;

public class GetConnectionRequestBuilder {

    private GetConnectionRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetConnection sdk;

    public GetConnectionRequestBuilder(SDKMethodInterfaces.MethodCallGetConnection sdk) {
        this.sdk = sdk;
    }

    public GetConnectionRequestBuilder request(io.codat.sync.payables.models.operations.GetConnectionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetConnectionRequestBuilder retryConfig(io.codat.sync.payables.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetConnectionRequestBuilder retryConfig(java.util.Optional<io.codat.sync.payables.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetConnectionResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            request,
            options);
    }
}
