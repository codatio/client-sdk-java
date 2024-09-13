/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.Options;
import io.codat.accounting.utils.RetryConfig;
import io.codat.accounting.utils.Utils;
import java.util.Optional;

public class ListInvoiceAttachmentsRequestBuilder {

    private ListInvoiceAttachmentsRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListInvoiceAttachments sdk;

    public ListInvoiceAttachmentsRequestBuilder(SDKMethodInterfaces.MethodCallListInvoiceAttachments sdk) {
        this.sdk = sdk;
    }

    public ListInvoiceAttachmentsRequestBuilder request(io.codat.accounting.models.operations.ListInvoiceAttachmentsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public ListInvoiceAttachmentsRequestBuilder retryConfig(io.codat.accounting.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ListInvoiceAttachmentsRequestBuilder retryConfig(java.util.Optional<io.codat.accounting.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ListInvoiceAttachmentsResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.listAttachments(
            request,
            options);
    }
}
