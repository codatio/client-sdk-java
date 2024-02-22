/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payroll;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.codat.sync.payroll.models.errors.SDKError;
import io.codat.sync.payroll.models.operations.SDKMethodInterfaces.*;
import io.codat.sync.payroll.utils.HTTPClient;
import io.codat.sync.payroll.utils.HTTPRequest;
import io.codat.sync.payroll.utils.JSON;
import io.codat.sync.payroll.utils.Options;
import io.codat.sync.payroll.utils.SerializedBody;
import io.codat.sync.payroll.utils.Utils;
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
 * Journals
 */
public class Journals implements
            MethodCallCreateJournal,
            MethodCallGetJournal,
            MethodCallGetCreateJournalModel,
            MethodCallListJournals {

    private final SDKConfiguration sdkConfiguration;

    Journals(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public io.codat.sync.payroll.models.operations.CreateJournalRequestBuilder create() {
        return new io.codat.sync.payroll.models.operations.CreateJournalRequestBuilder(this);
    }

    /**
     * Create journal
     * The *Create journal* endpoint creates a new [journal](https://docs.codat.io/sync-for-payroll-api#/schemas/Journal) for a given company's connection.
     * 
     * [Journals](https://docs.codat.io/sync-for-payroll-api#/schemas/Journal) are used to record all the financial transactions of a company.
     * 
     * **Integration-specific behaviour**
     * 
     * Required data may vary by integration. To see what data to post, first call [Get create journal model](https://docs.codat.io/sync-for-payroll-api#/operations/get-create-journals-model).
     * 
     * Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=journals) for integrations that support creating a journal.
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.sync.payroll.models.operations.CreateJournalResponse create(
            io.codat.sync.payroll.models.operations.CreateJournalRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.sync.payroll.utils.Utils.generateURL(
                io.codat.sync.payroll.models.operations.CreateJournalRequest.class,
                baseUrl,
                "/companies/{companyId}/connections/{connectionId}/push/journals",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        SerializedBody serializedRequestBody = io.codat.sync.payroll.utils.Utils.serializeRequestBody(
                request, "journalPrototype", "json", false);
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        java.util.List<NameValuePair> queryParams = io.codat.sync.payroll.utils.Utils.getQueryParams(
                io.codat.sync.payroll.models.operations.CreateJournalRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }

        HTTPClient client = io.codat.sync.payroll.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        io.codat.sync.payroll.utils.RetryConfig retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            retryConfig = io.codat.sync.payroll.utils.RetryConfig.builder()
                .backoff(io.codat.sync.payroll.utils.BackoffStrategy.builder()
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
        io.codat.sync.payroll.utils.Retries retries = io.codat.sync.payroll.utils.Retries.builder()
            .action(() -> client.send(req))
            .retryConfig(retryConfig)
            .statusCodes(statusCodes)
            .build();

        HttpResponse<InputStream> httpRes = retries.run();

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.codat.sync.payroll.models.operations.CreateJournalResponse.Builder resBuilder = 
            io.codat.sync.payroll.models.operations.CreateJournalResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.sync.payroll.models.operations.CreateJournalResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.codat.sync.payroll.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync.payroll.models.components.CreateJournalResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync.payroll.models.components.CreateJournalResponse>() {});
                res.withCreateJournalResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.sync.payroll.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync.payroll.models.components.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync.payroll.models.components.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public io.codat.sync.payroll.models.operations.GetJournalRequestBuilder get() {
        return new io.codat.sync.payroll.models.operations.GetJournalRequestBuilder(this);
    }

    /**
     * Get journal
     * The *Get journal* endpoint returns a single journal for a given `journalId`.
     * 
     * [Journals](https://docs.codat.io/sync-for-payroll-api#/schemas/Journal) are used to record all the financial transactions of a company.
     * 
     * Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=journals) for integrations that support getting a specific journal.
     * 
     * Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-payroll-api#/operations/refresh-company-data).
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.sync.payroll.models.operations.GetJournalResponse get(
            io.codat.sync.payroll.models.operations.GetJournalRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.sync.payroll.utils.Utils.generateURL(
                io.codat.sync.payroll.models.operations.GetJournalRequest.class,
                baseUrl,
                "/companies/{companyId}/data/journals/{journalId}",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.codat.sync.payroll.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        io.codat.sync.payroll.utils.RetryConfig retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            retryConfig = io.codat.sync.payroll.utils.RetryConfig.builder()
                .backoff(io.codat.sync.payroll.utils.BackoffStrategy.builder()
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
        io.codat.sync.payroll.utils.Retries retries = io.codat.sync.payroll.utils.Retries.builder()
            .action(() -> client.send(req))
            .retryConfig(retryConfig)
            .statusCodes(statusCodes)
            .build();

        HttpResponse<InputStream> httpRes = retries.run();

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.codat.sync.payroll.models.operations.GetJournalResponse.Builder resBuilder = 
            io.codat.sync.payroll.models.operations.GetJournalResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.sync.payroll.models.operations.GetJournalResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.codat.sync.payroll.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync.payroll.models.components.Journal out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync.payroll.models.components.Journal>() {});
                res.withJournal(org.openapitools.jackson.nullable.JsonNullable.of(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 409 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.sync.payroll.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync.payroll.models.components.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync.payroll.models.components.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public io.codat.sync.payroll.models.operations.GetCreateJournalModelRequestBuilder getCreateModel() {
        return new io.codat.sync.payroll.models.operations.GetCreateJournalModelRequestBuilder(this);
    }

    /**
     * Get create journal model
     * The *Get create journal model* endpoint returns the expected data for the request payload when creating a [journal](https://docs.codat.io/sync-for-payroll-api#/schemas/Journal) for a given company and integration.
     * 
     * [Journals](https://docs.codat.io/sync-for-payroll-api#/schemas/Journal) are used to record all the financial transactions of a company.
     * 
     * **Integration-specific behaviour**
     * 
     * See the *response examples* for integration-specific indicative models.
     * 
     * Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=journals) for integrations that support creating a journal.
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.sync.payroll.models.operations.GetCreateJournalModelResponse getCreateModel(
            io.codat.sync.payroll.models.operations.GetCreateJournalModelRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.sync.payroll.utils.Utils.generateURL(
                io.codat.sync.payroll.models.operations.GetCreateJournalModelRequest.class,
                baseUrl,
                "/companies/{companyId}/connections/{connectionId}/options/journals",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.codat.sync.payroll.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        io.codat.sync.payroll.utils.RetryConfig retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            retryConfig = io.codat.sync.payroll.utils.RetryConfig.builder()
                .backoff(io.codat.sync.payroll.utils.BackoffStrategy.builder()
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
        io.codat.sync.payroll.utils.Retries retries = io.codat.sync.payroll.utils.Retries.builder()
            .action(() -> client.send(req))
            .retryConfig(retryConfig)
            .statusCodes(statusCodes)
            .build();

        HttpResponse<InputStream> httpRes = retries.run();

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.codat.sync.payroll.models.operations.GetCreateJournalModelResponse.Builder resBuilder = 
            io.codat.sync.payroll.models.operations.GetCreateJournalModelResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.sync.payroll.models.operations.GetCreateJournalModelResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.codat.sync.payroll.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync.payroll.models.components.PushOption out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync.payroll.models.components.PushOption>() {});
                res.withPushOption(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.sync.payroll.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync.payroll.models.components.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync.payroll.models.components.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public io.codat.sync.payroll.models.operations.ListJournalsRequestBuilder list() {
        return new io.codat.sync.payroll.models.operations.ListJournalsRequestBuilder(this);
    }

    /**
     * List journals
     * The *List journals* endpoint returns a list of [journals](https://docs.codat.io/sync-for-payroll-api#/schemas/Journal) for a given company's connection.
     * 
     * [Journals](https://docs.codat.io/sync-for-payroll-api#/schemas/Journal) are used to record all the financial transactions of a company.
     * 
     * Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-payroll-api#/operations/refresh-company-data).
     *     
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.sync.payroll.models.operations.ListJournalsResponse list(
            io.codat.sync.payroll.models.operations.ListJournalsRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.sync.payroll.utils.Utils.generateURL(
                io.codat.sync.payroll.models.operations.ListJournalsRequest.class,
                baseUrl,
                "/companies/{companyId}/data/journals",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        java.util.List<NameValuePair> queryParams = io.codat.sync.payroll.utils.Utils.getQueryParams(
                io.codat.sync.payroll.models.operations.ListJournalsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }

        HTTPClient client = io.codat.sync.payroll.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        io.codat.sync.payroll.utils.RetryConfig retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            retryConfig = io.codat.sync.payroll.utils.RetryConfig.builder()
                .backoff(io.codat.sync.payroll.utils.BackoffStrategy.builder()
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
        io.codat.sync.payroll.utils.Retries retries = io.codat.sync.payroll.utils.Retries.builder()
            .action(() -> client.send(req))
            .retryConfig(retryConfig)
            .statusCodes(statusCodes)
            .build();

        HttpResponse<InputStream> httpRes = retries.run();

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.codat.sync.payroll.models.operations.ListJournalsResponse.Builder resBuilder = 
            io.codat.sync.payroll.models.operations.ListJournalsResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.sync.payroll.models.operations.ListJournalsResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.codat.sync.payroll.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync.payroll.models.components.Journals out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync.payroll.models.components.Journals>() {});
                res.withJournals(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 409 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.sync.payroll.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync.payroll.models.components.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync.payroll.models.components.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

}