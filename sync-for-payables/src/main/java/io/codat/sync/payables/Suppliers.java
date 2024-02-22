/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payables;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.codat.sync.payables.models.errors.SDKError;
import io.codat.sync.payables.models.operations.SDKMethodInterfaces.*;
import io.codat.sync.payables.utils.HTTPClient;
import io.codat.sync.payables.utils.HTTPRequest;
import io.codat.sync.payables.utils.JSON;
import io.codat.sync.payables.utils.Options;
import io.codat.sync.payables.utils.Utils;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Suppliers
 */
public class Suppliers implements
            MethodCallListSuppliers {

    private final SDKConfiguration sdkConfiguration;

    Suppliers(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public io.codat.sync.payables.models.operations.ListSuppliersRequestBuilder list() {
        return new io.codat.sync.payables.models.operations.ListSuppliersRequestBuilder(this);
    }

    /**
     * List suppliers
     * The *List suppliers* endpoint returns a list of [suppliers](https://docs.codat.io/sync-for-payables-api#/schemas/Supplier) for a given company's connection.
     * 
     * [Suppliers](https://docs.codat.io/sync-for-payables-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.
     * 
     * By default, this endpoint returns a list of active suppliers. You can use [querying](https://docs.codat.io/using-the-api/querying) to change that. 
     * 
     * For example, to retrieve only suppliers associated with unpaid bills (i.e. `balance&gt;0`) or suppliers created within the specified number of days (e.g. `sourceModifiedDate&gt;2023-12-15T00:00:00.000Z`), query the endpoint as follows: `/payables/suppliers?query=sourceModifiedDate&gt;2023-12-15T00:00:00.000Z||balance&gt;0`.
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.sync.payables.models.operations.ListSuppliersResponse list(
            io.codat.sync.payables.models.operations.ListSuppliersRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.sync.payables.utils.Utils.generateURL(
                io.codat.sync.payables.models.operations.ListSuppliersRequest.class,
                baseUrl,
                "/companies/{companyId}/connections/{connectionId}/payables/suppliers",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        java.util.List<NameValuePair> queryParams = io.codat.sync.payables.utils.Utils.getQueryParams(
                io.codat.sync.payables.models.operations.ListSuppliersRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }

        HTTPClient client = io.codat.sync.payables.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        io.codat.sync.payables.utils.RetryConfig retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            retryConfig = io.codat.sync.payables.utils.RetryConfig.builder()
                .backoff(io.codat.sync.payables.utils.BackoffStrategy.builder()
                            .initialInterval(500L, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .maxInterval(60000L, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .baseFactor((double)(1.5))
                            .maxElapsedTime(3600000L, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .retryConnectError(true)
                            .build())
                .build();
        }

        List<String> statusCodes = new java.util.ArrayList<String>();
        statusCodes.add("408");
        statusCodes.add("429");
        statusCodes.add("5XX");
        io.codat.sync.payables.utils.Retries retries = io.codat.sync.payables.utils.Retries.builder()
            .action(() -> client.send(req))
            .retryConfig(retryConfig)
            .statusCodes(statusCodes)
            .build();

        HttpResponse<InputStream> httpRes = retries.run();

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.codat.sync.payables.models.operations.ListSuppliersResponse.Builder resBuilder = 
            io.codat.sync.payables.models.operations.ListSuppliersResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.sync.payables.models.operations.ListSuppliersResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.codat.sync.payables.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync.payables.models.components.Suppliers out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync.payables.models.components.Suppliers>() {});
                res.withSuppliers(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 409 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.sync.payables.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync.payables.models.components.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync.payables.models.components.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

}