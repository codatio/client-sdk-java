/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.Options;
import io.codat.accounting.utils.RetryConfig;
import io.codat.accounting.utils.Utils;
import java.util.Optional;

public class UploadBillAttachmentRequestBuilder {

    private UploadBillAttachmentRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUploadBillAttachment sdk;

    public UploadBillAttachmentRequestBuilder(SDKMethodInterfaces.MethodCallUploadBillAttachment sdk) {
        this.sdk = sdk;
    }

    public UploadBillAttachmentRequestBuilder request(io.codat.accounting.models.operations.UploadBillAttachmentRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public UploadBillAttachmentRequestBuilder retryConfig(io.codat.accounting.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public UploadBillAttachmentRequestBuilder retryConfig(java.util.Optional<io.codat.accounting.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public UploadBillAttachmentResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.uploadAttachment(
            request,
            options);
    }
}
