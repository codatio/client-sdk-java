/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.operations;

import io.codat.sync.payroll.utils.Options;
import io.codat.sync.payroll.utils.RetryConfig;
import io.codat.sync.payroll.utils.Utils;
import java.util.Optional;

public class ListTrackingCategoriesRequestBuilder {

    private ListTrackingCategoriesRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListTrackingCategories sdk;

    public ListTrackingCategoriesRequestBuilder(SDKMethodInterfaces.MethodCallListTrackingCategories sdk) {
        this.sdk = sdk;
    }

    public ListTrackingCategoriesRequestBuilder request(io.codat.sync.payroll.models.operations.ListTrackingCategoriesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public ListTrackingCategoriesRequestBuilder retryConfig(io.codat.sync.payroll.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ListTrackingCategoriesRequestBuilder retryConfig(java.util.Optional<io.codat.sync.payroll.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ListTrackingCategoriesResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.list(
            request,
            options);
    }
}
