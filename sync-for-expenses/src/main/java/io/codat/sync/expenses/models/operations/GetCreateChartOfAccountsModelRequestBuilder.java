/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;

import io.codat.sync.expenses.utils.Options;
import io.codat.sync.expenses.utils.RetryConfig;
import io.codat.sync.expenses.utils.Utils;
import java.util.Optional;

public class GetCreateChartOfAccountsModelRequestBuilder {

    private GetCreateChartOfAccountsModelRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetCreateChartOfAccountsModel sdk;

    public GetCreateChartOfAccountsModelRequestBuilder(SDKMethodInterfaces.MethodCallGetCreateChartOfAccountsModel sdk) {
        this.sdk = sdk;
    }

    public GetCreateChartOfAccountsModelRequestBuilder request(io.codat.sync.expenses.models.operations.GetCreateChartOfAccountsModelRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetCreateChartOfAccountsModelRequestBuilder retryConfig(io.codat.sync.expenses.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetCreateChartOfAccountsModelRequestBuilder retryConfig(java.util.Optional<io.codat.sync.expenses.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetCreateChartOfAccountsModelResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getCreateModel(
            request,
            options);
    }
}
