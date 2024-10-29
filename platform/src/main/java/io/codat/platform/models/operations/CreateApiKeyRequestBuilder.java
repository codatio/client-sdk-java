/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import io.codat.platform.models.shared.CreateApiKey;
import io.codat.platform.utils.Options;
import io.codat.platform.utils.RetryConfig;
import io.codat.platform.utils.Utils;
import java.util.Optional;

public class CreateApiKeyRequestBuilder {

    private Optional<? extends CreateApiKey> request = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateApiKey sdk;

    public CreateApiKeyRequestBuilder(SDKMethodInterfaces.MethodCallCreateApiKey sdk) {
        this.sdk = sdk;
    }
                
    public CreateApiKeyRequestBuilder request(CreateApiKey request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public CreateApiKeyRequestBuilder request(Optional<? extends CreateApiKey> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public CreateApiKeyRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public CreateApiKeyRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public CreateApiKeyResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.createApiKey(
            request,
            options);
    }
}
