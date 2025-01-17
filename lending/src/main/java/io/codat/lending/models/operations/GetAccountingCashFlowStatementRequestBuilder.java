/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Options;
import io.codat.lending.utils.RetryConfig;
import io.codat.lending.utils.Utils;
import java.util.Optional;

public class GetAccountingCashFlowStatementRequestBuilder {

    private GetAccountingCashFlowStatementRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetAccountingCashFlowStatement sdk;

    public GetAccountingCashFlowStatementRequestBuilder(SDKMethodInterfaces.MethodCallGetAccountingCashFlowStatement sdk) {
        this.sdk = sdk;
    }

    public GetAccountingCashFlowStatementRequestBuilder request(GetAccountingCashFlowStatementRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetAccountingCashFlowStatementRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetAccountingCashFlowStatementRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetAccountingCashFlowStatementResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            request,
            options);
    }
}
