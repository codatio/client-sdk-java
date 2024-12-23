/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Options;
import io.codat.lending.utils.RetryConfig;
import io.codat.lending.utils.Utils;
import java.util.Optional;

public class GetDataIntegrityStatusRequestBuilder {

    private GetDataIntegrityStatusRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetDataIntegrityStatus sdk;

    public GetDataIntegrityStatusRequestBuilder(SDKMethodInterfaces.MethodCallGetDataIntegrityStatus sdk) {
        this.sdk = sdk;
    }

    public GetDataIntegrityStatusRequestBuilder request(GetDataIntegrityStatusRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetDataIntegrityStatusRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetDataIntegrityStatusRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetDataIntegrityStatusResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.status(
            request,
            options);
    }
}
