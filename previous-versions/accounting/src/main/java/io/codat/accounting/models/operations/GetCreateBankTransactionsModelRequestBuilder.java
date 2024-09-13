/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.Options;
import io.codat.accounting.utils.RetryConfig;
import io.codat.accounting.utils.Utils;
import java.util.Optional;

public class GetCreateBankTransactionsModelRequestBuilder {

    private GetCreateBankTransactionsModelRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetCreateBankTransactionsModel sdk;

    public GetCreateBankTransactionsModelRequestBuilder(SDKMethodInterfaces.MethodCallGetCreateBankTransactionsModel sdk) {
        this.sdk = sdk;
    }

    public GetCreateBankTransactionsModelRequestBuilder request(io.codat.accounting.models.operations.GetCreateBankTransactionsModelRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetCreateBankTransactionsModelRequestBuilder retryConfig(io.codat.accounting.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetCreateBankTransactionsModelRequestBuilder retryConfig(java.util.Optional<io.codat.accounting.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetCreateBankTransactionsModelResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getCreateModel(
            request,
            options);
    }
}
