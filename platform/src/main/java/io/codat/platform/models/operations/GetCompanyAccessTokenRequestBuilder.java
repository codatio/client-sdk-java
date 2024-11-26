/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import io.codat.platform.utils.Options;
import io.codat.platform.utils.RetryConfig;
import io.codat.platform.utils.Utils;
import java.util.Optional;

public class GetCompanyAccessTokenRequestBuilder {

    private GetCompanyAccessTokenRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetCompanyAccessToken sdk;

    public GetCompanyAccessTokenRequestBuilder(SDKMethodInterfaces.MethodCallGetCompanyAccessToken sdk) {
        this.sdk = sdk;
    }

    public GetCompanyAccessTokenRequestBuilder request(GetCompanyAccessTokenRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetCompanyAccessTokenRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetCompanyAccessTokenRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetCompanyAccessTokenResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getAccessToken(
            request,
            options);
    }
}