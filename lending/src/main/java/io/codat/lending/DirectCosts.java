/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.codat.lending.models.errors.SDKError;
import io.codat.lending.models.operations.SDKMethodInterfaces.*;
import io.codat.lending.utils.HTTPClient;
import io.codat.lending.utils.HTTPRequest;
import io.codat.lending.utils.JSON;
import io.codat.lending.utils.SerializedBody;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

public class DirectCosts implements
            MethodCallCreateDirectCost,
            MethodCallGetCreateDirectCostsModel {
    
    private final SDKConfiguration sdkConfiguration;

    DirectCosts(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }
    public io.codat.lending.models.operations.CreateDirectCostRequestBuilder create() {
        return new io.codat.lending.models.operations.CreateDirectCostRequestBuilder(this);
    }

    /**
     * Create direct cost
     * The *Create direct cost* endpoint creates a new [direct cost](https://docs.codat.io/lending-api#/schemas/DirectCost) for a given company's connection.
     * 
     * [Direct costs](https://docs.codat.io/lending-api#/schemas/DirectCost) are the expenses associated with a business' operations. For example, purchases of raw materials that are paid off at the point of the purchase and service fees are considered direct costs.
     * 
     * **Integration-specific behaviour**
     * 
     * Required data may vary by integration. To see what data to post, first call [Get create direct cost model](https://docs.codat.io/lending-api#/operations/get-create-directCosts-model).
     * 
     * Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=directCosts) for integrations that support creating an account.
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.lending.models.operations.CreateDirectCostResponse create(
            io.codat.lending.models.operations.CreateDirectCostRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.lending.utils.Utils.generateURL(
                io.codat.lending.models.operations.CreateDirectCostRequest.class, 
                baseUrl, 
                "/companies/{companyId}/connections/{connectionId}/push/directCosts", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = io.codat.lending.utils.Utils.serializeRequestBody(
                request, "directCostPrototype", "json", false);
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = io.codat.lending.utils.Utils.getQueryParams(
                io.codat.lending.models.operations.CreateDirectCostRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = io.codat.lending.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");
        io.codat.lending.models.operations.CreateDirectCostResponse.Builder resBuilder = 
            io.codat.lending.models.operations.CreateDirectCostResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.lending.models.operations.CreateDirectCostResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (io.codat.lending.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.lending.models.shared.AccountingCreateDirectCostResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.lending.models.shared.AccountingCreateDirectCostResponse>() {});
                res.withAccountingCreateDirectCostResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.lending.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.lending.models.shared.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.lending.models.shared.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

    public io.codat.lending.models.operations.GetCreateDirectCostsModelRequestBuilder getCreateModel() {
        return new io.codat.lending.models.operations.GetCreateDirectCostsModelRequestBuilder(this);
    }

    /**
     * Get create direct cost model
     * The *Get create direct cost model* endpoint returns the expected data for the request payload when creating a [direct cost](https://docs.codat.io/lending-api#/schemas/DirectCost) for a given company and integration.
     * 
     * [Direct costs](https://docs.codat.io/lending-api#/schemas/DirectCost) are purchases of items that are paid off at the point of the purchase.
     * 
     * **Integration-specific behaviour**
     * 
     * See the *response examples* for integration-specific indicative models.
     * 
     * Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=directCosts) for integrations that support creating a direct cost.
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.lending.models.operations.GetCreateDirectCostsModelResponse getCreateModel(
            io.codat.lending.models.operations.GetCreateDirectCostsModelRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.lending.utils.Utils.generateURL(
                io.codat.lending.models.operations.GetCreateDirectCostsModelRequest.class, 
                baseUrl, 
                "/companies/{companyId}/connections/{connectionId}/options/directCosts", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = io.codat.lending.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");
        io.codat.lending.models.operations.GetCreateDirectCostsModelResponse.Builder resBuilder = 
            io.codat.lending.models.operations.GetCreateDirectCostsModelResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.lending.models.operations.GetCreateDirectCostsModelResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (io.codat.lending.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.lending.models.shared.PushOption out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.lending.models.shared.PushOption>() {});
                res.withPushOption(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.lending.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.lending.models.shared.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.lending.models.shared.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

}
