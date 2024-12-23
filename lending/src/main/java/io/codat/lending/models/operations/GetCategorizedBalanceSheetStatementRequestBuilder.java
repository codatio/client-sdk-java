/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Options;
import io.codat.lending.utils.RetryConfig;
import io.codat.lending.utils.Utils;
import java.util.Optional;

public class GetCategorizedBalanceSheetStatementRequestBuilder {

    private GetCategorizedBalanceSheetStatementRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetCategorizedBalanceSheetStatement sdk;

    public GetCategorizedBalanceSheetStatementRequestBuilder(SDKMethodInterfaces.MethodCallGetCategorizedBalanceSheetStatement sdk) {
        this.sdk = sdk;
    }

    public GetCategorizedBalanceSheetStatementRequestBuilder request(GetCategorizedBalanceSheetStatementRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetCategorizedBalanceSheetStatementRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetCategorizedBalanceSheetStatementRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetCategorizedBalanceSheetStatementResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getCategorizedAccounts(
            request,
            options);
    }
}
