/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payables.models.operations;

import io.codat.sync.payables.utils.Options;
import io.codat.sync.payables.utils.RetryConfig;
import io.codat.sync.payables.utils.Utils;
import java.util.Optional;

public class ListCompaniesRequestBuilder {

    private ListCompaniesRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListCompanies sdk;

    public ListCompaniesRequestBuilder(SDKMethodInterfaces.MethodCallListCompanies sdk) {
        this.sdk = sdk;
    }

    public ListCompaniesRequestBuilder request(ListCompaniesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public ListCompaniesRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ListCompaniesRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ListCompaniesResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.list(
            request,
            options);
    }
}
