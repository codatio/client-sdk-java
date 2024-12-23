/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.operations;

import io.codat.sync.commerce.utils.Options;
import io.codat.sync.commerce.utils.RetryConfig;
import io.codat.sync.commerce.utils.Utils;
import java.util.Optional;

public class ListIntegrationsRequestBuilder {

    private ListIntegrationsRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListIntegrations sdk;

    public ListIntegrationsRequestBuilder(SDKMethodInterfaces.MethodCallListIntegrations sdk) {
        this.sdk = sdk;
    }

    public ListIntegrationsRequestBuilder request(ListIntegrationsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public ListIntegrationsRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ListIntegrationsRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ListIntegrationsResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.list(
            request,
            options);
    }
}
