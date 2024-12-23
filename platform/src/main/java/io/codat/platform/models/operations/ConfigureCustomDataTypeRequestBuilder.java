/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import io.codat.platform.utils.Options;
import io.codat.platform.utils.RetryConfig;
import io.codat.platform.utils.Utils;
import java.util.Optional;

public class ConfigureCustomDataTypeRequestBuilder {

    private ConfigureCustomDataTypeRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallConfigureCustomDataType sdk;

    public ConfigureCustomDataTypeRequestBuilder(SDKMethodInterfaces.MethodCallConfigureCustomDataType sdk) {
        this.sdk = sdk;
    }

    public ConfigureCustomDataTypeRequestBuilder request(ConfigureCustomDataTypeRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public ConfigureCustomDataTypeRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ConfigureCustomDataTypeRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ConfigureCustomDataTypeResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.configure(
            request,
            options);
    }
}
