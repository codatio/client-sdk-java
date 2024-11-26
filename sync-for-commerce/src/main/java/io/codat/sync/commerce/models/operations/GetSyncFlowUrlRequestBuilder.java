/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.operations;

import io.codat.sync.commerce.utils.Options;
import io.codat.sync.commerce.utils.RetryConfig;
import io.codat.sync.commerce.utils.Utils;
import java.util.Optional;

public class GetSyncFlowUrlRequestBuilder {

    private GetSyncFlowUrlRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetSyncFlowUrl sdk;

    public GetSyncFlowUrlRequestBuilder(SDKMethodInterfaces.MethodCallGetSyncFlowUrl sdk) {
        this.sdk = sdk;
    }

    public GetSyncFlowUrlRequestBuilder request(GetSyncFlowUrlRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetSyncFlowUrlRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetSyncFlowUrlRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetSyncFlowUrlResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getSyncFlowUrl(
            request,
            options);
    }
}
