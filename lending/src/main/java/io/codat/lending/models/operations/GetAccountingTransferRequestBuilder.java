/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Options;
import io.codat.lending.utils.RetryConfig;
import io.codat.lending.utils.Utils;
import java.util.Optional;

public class GetAccountingTransferRequestBuilder {

    private GetAccountingTransferRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetAccountingTransfer sdk;

    public GetAccountingTransferRequestBuilder(SDKMethodInterfaces.MethodCallGetAccountingTransfer sdk) {
        this.sdk = sdk;
    }

    public GetAccountingTransferRequestBuilder request(io.codat.lending.models.operations.GetAccountingTransferRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetAccountingTransferRequestBuilder retryConfig(io.codat.lending.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetAccountingTransferRequestBuilder retryConfig(java.util.Optional<io.codat.lending.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetAccountingTransferResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            request,
            options);
    }
}
