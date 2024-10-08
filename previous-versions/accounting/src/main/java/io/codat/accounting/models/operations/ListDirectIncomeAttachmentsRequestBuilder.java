/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.Options;
import io.codat.accounting.utils.RetryConfig;
import io.codat.accounting.utils.Utils;
import java.util.Optional;

public class ListDirectIncomeAttachmentsRequestBuilder {

    private ListDirectIncomeAttachmentsRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListDirectIncomeAttachments sdk;

    public ListDirectIncomeAttachmentsRequestBuilder(SDKMethodInterfaces.MethodCallListDirectIncomeAttachments sdk) {
        this.sdk = sdk;
    }

    public ListDirectIncomeAttachmentsRequestBuilder request(io.codat.accounting.models.operations.ListDirectIncomeAttachmentsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public ListDirectIncomeAttachmentsRequestBuilder retryConfig(io.codat.accounting.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ListDirectIncomeAttachmentsRequestBuilder retryConfig(java.util.Optional<io.codat.accounting.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ListDirectIncomeAttachmentsResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.listAttachments(
            request,
            options);
    }
}
