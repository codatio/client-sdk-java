/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Options;
import io.codat.lending.utils.RetryConfig;
import io.codat.lending.utils.Utils;
import java.util.Optional;

public class GetExcelReportGenerationStatusRequestBuilder {

    private GetExcelReportGenerationStatusRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetExcelReportGenerationStatus sdk;

    public GetExcelReportGenerationStatusRequestBuilder(SDKMethodInterfaces.MethodCallGetExcelReportGenerationStatus sdk) {
        this.sdk = sdk;
    }

    public GetExcelReportGenerationStatusRequestBuilder request(GetExcelReportGenerationStatusRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetExcelReportGenerationStatusRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetExcelReportGenerationStatusRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetExcelReportGenerationStatusResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getStatus(
            request,
            options);
    }
}
