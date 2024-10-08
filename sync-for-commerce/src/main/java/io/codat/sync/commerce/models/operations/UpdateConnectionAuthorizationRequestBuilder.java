/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.operations;

import io.codat.sync.commerce.utils.Options;
import io.codat.sync.commerce.utils.RetryConfig;
import io.codat.sync.commerce.utils.Utils;
import java.util.Optional;

public class UpdateConnectionAuthorizationRequestBuilder {

    private UpdateConnectionAuthorizationRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUpdateConnectionAuthorization sdk;

    public UpdateConnectionAuthorizationRequestBuilder(SDKMethodInterfaces.MethodCallUpdateConnectionAuthorization sdk) {
        this.sdk = sdk;
    }

    public UpdateConnectionAuthorizationRequestBuilder request(io.codat.sync.commerce.models.operations.UpdateConnectionAuthorizationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public UpdateConnectionAuthorizationRequestBuilder retryConfig(io.codat.sync.commerce.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public UpdateConnectionAuthorizationRequestBuilder retryConfig(java.util.Optional<io.codat.sync.commerce.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public UpdateConnectionAuthorizationResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.updateAuthorization(
            request,
            options);
    }
}
