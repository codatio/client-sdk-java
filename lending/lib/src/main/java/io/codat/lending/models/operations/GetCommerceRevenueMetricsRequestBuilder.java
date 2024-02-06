/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

import io.codat.lending.CodatLending;
import io.codat.lending.utils.Utils;
import io.codat.lending.utils.LazySingletonValue;

public class GetCommerceRevenueMetricsRequestBuilder {

    private GetCommerceRevenueMetricsRequest request;

    private final SDKMethodInterfaces.MethodCallGetCommerceRevenueMetrics sdk;
    
    public GetCommerceRevenueMetricsRequestBuilder(SDKMethodInterfaces.MethodCallGetCommerceRevenueMetrics sdk) {
        this.sdk = sdk;
    }
             
    public GetCommerceRevenueMetricsRequestBuilder request(GetCommerceRevenueMetricsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetCommerceRevenueMetricsResponse call() throws Exception {
        return sdk.getRevenue(
            request);
    }
}