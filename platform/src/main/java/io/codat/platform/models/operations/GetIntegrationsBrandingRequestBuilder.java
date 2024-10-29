/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import io.codat.platform.utils.Options;
import io.codat.platform.utils.RetryConfig;
import io.codat.platform.utils.Utils;
import java.util.Optional;

public class GetIntegrationsBrandingRequestBuilder {

    private GetIntegrationsBrandingRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetIntegrationsBranding sdk;

    public GetIntegrationsBrandingRequestBuilder(SDKMethodInterfaces.MethodCallGetIntegrationsBranding sdk) {
        this.sdk = sdk;
    }

    public GetIntegrationsBrandingRequestBuilder request(GetIntegrationsBrandingRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetIntegrationsBrandingRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetIntegrationsBrandingRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetIntegrationsBrandingResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getBranding(
            request,
            options);
    }
}
