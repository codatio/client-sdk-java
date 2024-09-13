/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.operations;

import io.codat.bank_feeds.utils.Options;
import io.codat.bank_feeds.utils.RetryConfig;
import io.codat.bank_feeds.utils.Utils;
import java.util.Optional;

public class ListCompaniesRequestBuilder {

    private ListCompaniesRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListCompanies sdk;

    public ListCompaniesRequestBuilder(SDKMethodInterfaces.MethodCallListCompanies sdk) {
        this.sdk = sdk;
    }

    public ListCompaniesRequestBuilder request(io.codat.bank_feeds.models.operations.ListCompaniesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public ListCompaniesRequestBuilder retryConfig(io.codat.bank_feeds.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ListCompaniesRequestBuilder retryConfig(java.util.Optional<io.codat.bank_feeds.utils.RetryConfig> retryConfig) {
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
