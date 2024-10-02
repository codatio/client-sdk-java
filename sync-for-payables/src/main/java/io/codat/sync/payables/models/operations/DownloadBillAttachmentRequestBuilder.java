/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payables.models.operations;

import io.codat.sync.payables.utils.Options;
import io.codat.sync.payables.utils.RetryConfig;
import io.codat.sync.payables.utils.Utils;
import java.util.Optional;

public class DownloadBillAttachmentRequestBuilder {

    private DownloadBillAttachmentRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallDownloadBillAttachment sdk;

    public DownloadBillAttachmentRequestBuilder(SDKMethodInterfaces.MethodCallDownloadBillAttachment sdk) {
        this.sdk = sdk;
    }

    public DownloadBillAttachmentRequestBuilder request(DownloadBillAttachmentRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public DownloadBillAttachmentRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public DownloadBillAttachmentRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public DownloadBillAttachmentResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.downloadAttachment(
            request,
            options);
    }
}
