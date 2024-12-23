/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Options;
import io.codat.lending.utils.RetryConfig;
import io.codat.lending.utils.Utils;
import java.util.Optional;

public class ListAccountingCustomerAttachmentsRequestBuilder {

    private ListAccountingCustomerAttachmentsRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListAccountingCustomerAttachments sdk;

    public ListAccountingCustomerAttachmentsRequestBuilder(SDKMethodInterfaces.MethodCallListAccountingCustomerAttachments sdk) {
        this.sdk = sdk;
    }

    public ListAccountingCustomerAttachmentsRequestBuilder request(ListAccountingCustomerAttachmentsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public ListAccountingCustomerAttachmentsRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ListAccountingCustomerAttachmentsRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ListAccountingCustomerAttachmentsResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.listAttachments(
            request,
            options);
    }
}
