/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.Options;
import io.codat.accounting.utils.RetryConfig;
import io.codat.accounting.utils.Utils;
import java.util.Optional;

public class GetCreateUpdateSuppliersModelRequestBuilder {

    private GetCreateUpdateSuppliersModelRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetCreateUpdateSuppliersModel sdk;

    public GetCreateUpdateSuppliersModelRequestBuilder(SDKMethodInterfaces.MethodCallGetCreateUpdateSuppliersModel sdk) {
        this.sdk = sdk;
    }

    public GetCreateUpdateSuppliersModelRequestBuilder request(io.codat.accounting.models.operations.GetCreateUpdateSuppliersModelRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetCreateUpdateSuppliersModelRequestBuilder retryConfig(io.codat.accounting.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetCreateUpdateSuppliersModelRequestBuilder retryConfig(java.util.Optional<io.codat.accounting.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetCreateUpdateSuppliersModelResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getCreateUpdateModel(
            request,
            options);
    }
}
