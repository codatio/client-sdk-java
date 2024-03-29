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
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

public class DirectIncomes implements
            MethodCallDownloadAccountingDirectIncomeAttachment,
            MethodCallGetAccountingDirectIncome,
            MethodCallGetAccountingDirectIncomeAttachment,
            MethodCallListAccountingDirectIncomes,
            MethodCallListAccountingDirectIncomeAttachments {
    
    private final SDKConfiguration sdkConfiguration;

    DirectIncomes(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }
    public io.codat.lending.models.operations.DownloadAccountingDirectIncomeAttachmentRequestBuilder downloadAttachment() {
        return new io.codat.lending.models.operations.DownloadAccountingDirectIncomeAttachmentRequestBuilder(this);
    }

    /**
     * Download direct income attachment
     * The *Download direct income attachment* endpoint downloads a specific attachment for a given `directIncomeId` and `attachmentId`.
     * 
     * [Direct incomes](https://docs.codat.io/lending-api#/schemas/DirectIncome) are sales of items directly to a customer where payment is received at the point of the sale.
     * 
     * Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=directIncomes) for integrations that support downloading a direct income attachment.
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.lending.models.operations.DownloadAccountingDirectIncomeAttachmentResponse downloadAttachment(
            io.codat.lending.models.operations.DownloadAccountingDirectIncomeAttachmentRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.lending.utils.Utils.generateURL(
                io.codat.lending.models.operations.DownloadAccountingDirectIncomeAttachmentRequest.class, 
                baseUrl, 
                "/companies/{companyId}/connections/{connectionId}/data/directIncomes/{directIncomeId}/attachments/{attachmentId}/download", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/octet-stream;q=0");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = io.codat.lending.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");
        io.codat.lending.models.operations.DownloadAccountingDirectIncomeAttachmentResponse.Builder resBuilder = 
            io.codat.lending.models.operations.DownloadAccountingDirectIncomeAttachmentResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);
        if ((httpRes.statusCode() == 200) && io.codat.lending.utils.Utils.matchContentType(contentType, "application/octet-stream")) {
            resBuilder.data(httpRes.body());
        }

        io.codat.lending.models.operations.DownloadAccountingDirectIncomeAttachmentResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (io.codat.lending.utils.Utils.matchContentType(contentType, "application/octet-stream")) {
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

    public io.codat.lending.models.operations.GetAccountingDirectIncomeRequestBuilder get() {
        return new io.codat.lending.models.operations.GetAccountingDirectIncomeRequestBuilder(this);
    }

    /**
     * Get direct income
     * The *Get direct income* endpoint returns a single direct income for a given directIncomeId.
     * 
     * [Direct incomes](https://docs.codat.io/lending-api#/schemas/DirectIncome) are sales of items directly to a customer where payment is received at the point of the sale.
     * 
     * Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=directIncomes) for integrations that support getting a specific direct income.
     * 
     * Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.lending.models.operations.GetAccountingDirectIncomeResponse get(
            io.codat.lending.models.operations.GetAccountingDirectIncomeRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.lending.utils.Utils.generateURL(
                io.codat.lending.models.operations.GetAccountingDirectIncomeRequest.class, 
                baseUrl, 
                "/companies/{companyId}/connections/{connectionId}/data/directIncomes/{directIncomeId}", 
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
        io.codat.lending.models.operations.GetAccountingDirectIncomeResponse.Builder resBuilder = 
            io.codat.lending.models.operations.GetAccountingDirectIncomeResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.lending.models.operations.GetAccountingDirectIncomeResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (io.codat.lending.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.lending.models.shared.AccountingDirectIncome out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.lending.models.shared.AccountingDirectIncome>() {});
                res.withAccountingDirectIncome(org.openapitools.jackson.nullable.JsonNullable.of(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 409 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
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

    public io.codat.lending.models.operations.GetAccountingDirectIncomeAttachmentRequestBuilder getAttachment() {
        return new io.codat.lending.models.operations.GetAccountingDirectIncomeAttachmentRequestBuilder(this);
    }

    /**
     * Get direct income attachment
     * The *Get direct income attachment* endpoint returns a specific attachment for a given `directIncomeId` and `attachmentId`.
     * 
     * [Direct incomes](https://docs.codat.io/lending-api#/schemas/DirectIncome) are sales of items directly to a customer where payment is received at the point of the sale.
     * 
     * Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=directIncomes) for integrations that support getting a direct income attachment.
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.lending.models.operations.GetAccountingDirectIncomeAttachmentResponse getAttachment(
            io.codat.lending.models.operations.GetAccountingDirectIncomeAttachmentRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.lending.utils.Utils.generateURL(
                io.codat.lending.models.operations.GetAccountingDirectIncomeAttachmentRequest.class, 
                baseUrl, 
                "/companies/{companyId}/connections/{connectionId}/data/directIncomes/{directIncomeId}/attachments/{attachmentId}", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = io.codat.lending.utils.Utils.getQueryParams(
                io.codat.lending.models.operations.GetAccountingDirectIncomeAttachmentRequest.class, request, null);
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
        io.codat.lending.models.operations.GetAccountingDirectIncomeAttachmentResponse.Builder resBuilder = 
            io.codat.lending.models.operations.GetAccountingDirectIncomeAttachmentResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.lending.models.operations.GetAccountingDirectIncomeAttachmentResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (io.codat.lending.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.lending.models.shared.AccountingAttachment out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.lending.models.shared.AccountingAttachment>() {});
                res.withAccountingAttachment(org.openapitools.jackson.nullable.JsonNullable.of(out));
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

    public io.codat.lending.models.operations.ListAccountingDirectIncomesRequestBuilder list() {
        return new io.codat.lending.models.operations.ListAccountingDirectIncomesRequestBuilder(this);
    }

    /**
     * List direct incomes
     * The *List direct incomes* endpoint returns a list of [direct incomes](https://docs.codat.io/lending-api#/schemas/DirectIncome) for a given company's connection.
     * 
     * [Direct incomes](https://docs.codat.io/lending-api#/schemas/DirectIncome) are sales of items directly to a customer where payment is received at the point of the sale.
     * 
     * Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
     *     
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.lending.models.operations.ListAccountingDirectIncomesResponse list(
            io.codat.lending.models.operations.ListAccountingDirectIncomesRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.lending.utils.Utils.generateURL(
                io.codat.lending.models.operations.ListAccountingDirectIncomesRequest.class, 
                baseUrl, 
                "/companies/{companyId}/connections/{connectionId}/data/directIncomes", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = io.codat.lending.utils.Utils.getQueryParams(
                io.codat.lending.models.operations.ListAccountingDirectIncomesRequest.class, request, null);
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
        io.codat.lending.models.operations.ListAccountingDirectIncomesResponse.Builder resBuilder = 
            io.codat.lending.models.operations.ListAccountingDirectIncomesResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.lending.models.operations.ListAccountingDirectIncomesResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (io.codat.lending.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.lending.models.shared.AccountingDirectIncomes out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.lending.models.shared.AccountingDirectIncomes>() {});
                res.withAccountingDirectIncomes(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 409 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
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

    public io.codat.lending.models.operations.ListAccountingDirectIncomeAttachmentsRequestBuilder listAttachments() {
        return new io.codat.lending.models.operations.ListAccountingDirectIncomeAttachmentsRequestBuilder(this);
    }

    /**
     * List direct income attachments
     * The *List direct income attachments* endpoint returns a list of attachments available to download for given `directIncomeId`.
     * 
     * [Direct incomes](https://docs.codat.io/lending-api#/schemas/DirectIncome) are sales of items directly to a customer where payment is received at the point of the sale.
     * 
     * Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=directIncomes) for integrations that support listing direct income attachments.
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.lending.models.operations.ListAccountingDirectIncomeAttachmentsResponse listAttachments(
            io.codat.lending.models.operations.ListAccountingDirectIncomeAttachmentsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.lending.utils.Utils.generateURL(
                io.codat.lending.models.operations.ListAccountingDirectIncomeAttachmentsRequest.class, 
                baseUrl, 
                "/companies/{companyId}/connections/{connectionId}/data/directIncomes/{directIncomeId}/attachments", 
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
        io.codat.lending.models.operations.ListAccountingDirectIncomeAttachmentsResponse.Builder resBuilder = 
            io.codat.lending.models.operations.ListAccountingDirectIncomeAttachmentsResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.lending.models.operations.ListAccountingDirectIncomeAttachmentsResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (io.codat.lending.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.lending.models.shared.Attachments out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.lending.models.shared.Attachments>() {});
                res.withAttachments(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 409 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
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
