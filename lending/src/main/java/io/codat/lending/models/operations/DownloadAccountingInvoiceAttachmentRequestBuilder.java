/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Options;
import io.codat.lending.utils.RetryConfig;
import io.codat.lending.utils.Utils;
import java.util.Optional;

public class DownloadAccountingInvoiceAttachmentRequestBuilder {

    private DownloadAccountingInvoiceAttachmentRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallDownloadAccountingInvoiceAttachment sdk;

    public DownloadAccountingInvoiceAttachmentRequestBuilder(SDKMethodInterfaces.MethodCallDownloadAccountingInvoiceAttachment sdk) {
        this.sdk = sdk;
    }

    public DownloadAccountingInvoiceAttachmentRequestBuilder request(io.codat.lending.models.operations.DownloadAccountingInvoiceAttachmentRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public DownloadAccountingInvoiceAttachmentRequestBuilder retryConfig(io.codat.lending.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public DownloadAccountingInvoiceAttachmentRequestBuilder retryConfig(java.util.Optional<io.codat.lending.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public DownloadAccountingInvoiceAttachmentResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.downloadAttachment(
            request,
            options);
    }
}
