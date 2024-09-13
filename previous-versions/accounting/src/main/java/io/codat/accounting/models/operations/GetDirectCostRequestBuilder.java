/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.Options;
import io.codat.accounting.utils.RetryConfig;
import io.codat.accounting.utils.Utils;
import java.util.Optional;

public class GetDirectCostRequestBuilder {

    private GetDirectCostRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetDirectCost sdk;

    public GetDirectCostRequestBuilder(SDKMethodInterfaces.MethodCallGetDirectCost sdk) {
        this.sdk = sdk;
    }

    public GetDirectCostRequestBuilder request(io.codat.accounting.models.operations.GetDirectCostRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetDirectCostRequestBuilder retryConfig(io.codat.accounting.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetDirectCostRequestBuilder retryConfig(java.util.Optional<io.codat.accounting.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetDirectCostResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            request,
            options);
    }
}
