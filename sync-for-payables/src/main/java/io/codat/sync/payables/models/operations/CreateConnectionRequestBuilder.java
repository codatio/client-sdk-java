/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payables.models.operations;

import io.codat.sync.payables.utils.Options;
import io.codat.sync.payables.utils.RetryConfig;
import io.codat.sync.payables.utils.Utils;
import java.util.Optional;

public class CreateConnectionRequestBuilder {

    private CreateConnectionRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateConnection sdk;

    public CreateConnectionRequestBuilder(SDKMethodInterfaces.MethodCallCreateConnection sdk) {
        this.sdk = sdk;
    }

    public CreateConnectionRequestBuilder request(io.codat.sync.payables.models.operations.CreateConnectionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public CreateConnectionRequestBuilder retryConfig(io.codat.sync.payables.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public CreateConnectionRequestBuilder retryConfig(java.util.Optional<io.codat.sync.payables.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public CreateConnectionResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.create(
            request,
            options);
    }
}
