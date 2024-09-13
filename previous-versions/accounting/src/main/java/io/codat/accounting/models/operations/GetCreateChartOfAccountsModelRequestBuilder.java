/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.Options;
import io.codat.accounting.utils.RetryConfig;
import io.codat.accounting.utils.Utils;
import java.util.Optional;

public class GetCreateChartOfAccountsModelRequestBuilder {

    private GetCreateChartOfAccountsModelRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetCreateChartOfAccountsModel sdk;

    public GetCreateChartOfAccountsModelRequestBuilder(SDKMethodInterfaces.MethodCallGetCreateChartOfAccountsModel sdk) {
        this.sdk = sdk;
    }

    public GetCreateChartOfAccountsModelRequestBuilder request(io.codat.accounting.models.operations.GetCreateChartOfAccountsModelRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetCreateChartOfAccountsModelRequestBuilder retryConfig(io.codat.accounting.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetCreateChartOfAccountsModelRequestBuilder retryConfig(java.util.Optional<io.codat.accounting.utils.RetryConfig> retryConfig) {
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
