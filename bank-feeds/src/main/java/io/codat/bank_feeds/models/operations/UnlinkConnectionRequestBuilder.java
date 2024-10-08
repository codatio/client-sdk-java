/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.operations;

import io.codat.bank_feeds.utils.Options;
import io.codat.bank_feeds.utils.RetryConfig;
import io.codat.bank_feeds.utils.Utils;
import java.util.Optional;

public class UnlinkConnectionRequestBuilder {

    private UnlinkConnectionRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUnlinkConnection sdk;

    public UnlinkConnectionRequestBuilder(SDKMethodInterfaces.MethodCallUnlinkConnection sdk) {
        this.sdk = sdk;
    }

    public UnlinkConnectionRequestBuilder request(io.codat.bank_feeds.models.operations.UnlinkConnectionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public UnlinkConnectionRequestBuilder retryConfig(io.codat.bank_feeds.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public UnlinkConnectionRequestBuilder retryConfig(java.util.Optional<io.codat.bank_feeds.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public UnlinkConnectionResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.unlink(
            request,
            options);
    }
}
