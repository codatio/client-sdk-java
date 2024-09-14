/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.banking.models.operations;

import io.codat.banking.utils.Options;
import io.codat.banking.utils.RetryConfig;
import io.codat.banking.utils.Utils;
import java.util.Optional;

public class GetAccountRequestBuilder {

    private GetAccountRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetAccount sdk;

    public GetAccountRequestBuilder(SDKMethodInterfaces.MethodCallGetAccount sdk) {
        this.sdk = sdk;
    }

    public GetAccountRequestBuilder request(io.codat.banking.models.operations.GetAccountRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetAccountRequestBuilder retryConfig(io.codat.banking.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetAccountRequestBuilder retryConfig(java.util.Optional<io.codat.banking.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetAccountResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            request,
            options);
    }
}
