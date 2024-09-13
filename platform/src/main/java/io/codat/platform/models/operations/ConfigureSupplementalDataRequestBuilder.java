/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import io.codat.platform.utils.Options;
import io.codat.platform.utils.RetryConfig;
import io.codat.platform.utils.Utils;
import java.util.Optional;

public class ConfigureSupplementalDataRequestBuilder {

    private ConfigureSupplementalDataRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallConfigureSupplementalData sdk;

    public ConfigureSupplementalDataRequestBuilder(SDKMethodInterfaces.MethodCallConfigureSupplementalData sdk) {
        this.sdk = sdk;
    }

    public ConfigureSupplementalDataRequestBuilder request(io.codat.platform.models.operations.ConfigureSupplementalDataRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public ConfigureSupplementalDataRequestBuilder retryConfig(io.codat.platform.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ConfigureSupplementalDataRequestBuilder retryConfig(java.util.Optional<io.codat.platform.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ConfigureSupplementalDataResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.configure(
            request,
            options);
    }
}
