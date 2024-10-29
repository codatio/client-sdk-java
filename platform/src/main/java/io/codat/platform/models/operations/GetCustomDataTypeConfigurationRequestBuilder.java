/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import io.codat.platform.utils.Options;
import io.codat.platform.utils.RetryConfig;
import io.codat.platform.utils.Utils;
import java.util.Optional;

public class GetCustomDataTypeConfigurationRequestBuilder {

    private GetCustomDataTypeConfigurationRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetCustomDataTypeConfiguration sdk;

    public GetCustomDataTypeConfigurationRequestBuilder(SDKMethodInterfaces.MethodCallGetCustomDataTypeConfiguration sdk) {
        this.sdk = sdk;
    }

    public GetCustomDataTypeConfigurationRequestBuilder request(GetCustomDataTypeConfigurationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetCustomDataTypeConfigurationRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetCustomDataTypeConfigurationRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetCustomDataTypeConfigurationResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getConfiguration(
            request,
            options);
    }
}
