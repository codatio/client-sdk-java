/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;

import io.codat.sync.expenses.utils.Options;
import io.codat.sync.expenses.utils.RetryConfig;
import io.codat.sync.expenses.utils.Utils;
import java.util.Optional;

public class GetPullOperationRequestBuilder {

    private GetPullOperationRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetPullOperation sdk;

    public GetPullOperationRequestBuilder(SDKMethodInterfaces.MethodCallGetPullOperation sdk) {
        this.sdk = sdk;
    }

    public GetPullOperationRequestBuilder request(GetPullOperationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetPullOperationRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetPullOperationRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetPullOperationResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getPullOperation(
            request,
            options);
    }
}
