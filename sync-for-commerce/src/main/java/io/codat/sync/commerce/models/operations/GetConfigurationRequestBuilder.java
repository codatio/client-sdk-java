/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.operations;

import io.codat.sync.commerce.utils.Options;
import io.codat.sync.commerce.utils.RetryConfig;
import io.codat.sync.commerce.utils.Utils;
import java.util.Optional;

public class GetConfigurationRequestBuilder {

    private GetConfigurationRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetConfiguration sdk;

    public GetConfigurationRequestBuilder(SDKMethodInterfaces.MethodCallGetConfiguration sdk) {
        this.sdk = sdk;
    }

    public GetConfigurationRequestBuilder request(io.codat.sync.commerce.models.operations.GetConfigurationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetConfigurationRequestBuilder retryConfig(io.codat.sync.commerce.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetConfigurationRequestBuilder retryConfig(java.util.Optional<io.codat.sync.commerce.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetConfigurationResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getConfiguration(
            request,
            options);
    }
}
