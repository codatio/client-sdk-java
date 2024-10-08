/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.operations;

import io.codat.bank_feeds.utils.Options;
import io.codat.bank_feeds.utils.RetryConfig;
import io.codat.bank_feeds.utils.Utils;
import java.util.Optional;

public class SetConfigurationRequestBuilder {

    private SetConfigurationRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallSetConfiguration sdk;

    public SetConfigurationRequestBuilder(SDKMethodInterfaces.MethodCallSetConfiguration sdk) {
        this.sdk = sdk;
    }

    public SetConfigurationRequestBuilder request(io.codat.bank_feeds.models.operations.SetConfigurationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public SetConfigurationRequestBuilder retryConfig(io.codat.bank_feeds.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public SetConfigurationRequestBuilder retryConfig(java.util.Optional<io.codat.bank_feeds.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public SetConfigurationResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.set(
            request,
            options);
    }
}
