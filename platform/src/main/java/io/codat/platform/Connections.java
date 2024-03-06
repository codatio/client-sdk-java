/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.codat.platform.models.errors.SDKError;
import io.codat.platform.models.operations.SDKMethodInterfaces.*;
import io.codat.platform.utils.HTTPClient;
import io.codat.platform.utils.HTTPRequest;
import io.codat.platform.utils.JSON;
import io.codat.platform.utils.Options;
import io.codat.platform.utils.SerializedBody;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Manage your companies' data connections.
 */
public class Connections implements
            MethodCallCreateConnection,
            MethodCallDeleteConnection,
            MethodCallGetConnection,
            MethodCallListConnections,
            MethodCallUnlinkConnection,
            MethodCallUpdateConnectionAuthorization {

    private final SDKConfiguration sdkConfiguration;

    Connections(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public io.codat.platform.models.operations.CreateConnectionRequestBuilder create() {
        return new io.codat.platform.models.operations.CreateConnectionRequestBuilder(this);
    }

    /**
     * Create connection
     * ﻿Creates a connection for the company by providing a valid `platformKey`. 
     * 
     * Use the [List Integrations](https://docs.codat.io/platform-api#/operations/list-integrations) endpoint to access valid platform keys. 
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.platform.models.operations.CreateConnectionResponse create(
            io.codat.platform.models.operations.CreateConnectionRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.platform.utils.Utils.generateURL(
                io.codat.platform.models.operations.CreateConnectionRequest.class,
                baseUrl,
                "/companies/{companyId}/connections",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<io.codat.platform.models.operations.CreateConnectionRequest>() {});
        SerializedBody serializedRequestBody = io.codat.platform.utils.Utils.serializeRequestBody(
                _convertedRequest, "requestBody", "json", false);
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.codat.platform.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        io.codat.platform.utils.RetryConfig retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            retryConfig = io.codat.platform.utils.RetryConfig.builder()
                .backoff(io.codat.platform.utils.BackoffStrategy.builder()
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
        io.codat.platform.utils.Retries retries = io.codat.platform.utils.Retries.builder()
            .action(() -> client.send(req))
            .retryConfig(retryConfig)
            .statusCodes(statusCodes)
            .build();

        HttpResponse<InputStream> httpRes = retries.run();

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.codat.platform.models.operations.CreateConnectionResponse.Builder resBuilder = 
            io.codat.platform.models.operations.CreateConnectionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.platform.models.operations.CreateConnectionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.codat.platform.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.platform.models.shared.Connection out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.platform.models.shared.Connection>() {});
                res.withConnection(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.platform.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.platform.models.shared.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.platform.models.shared.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public io.codat.platform.models.operations.DeleteConnectionRequestBuilder delete() {
        return new io.codat.platform.models.operations.DeleteConnectionRequestBuilder(this);
    }

    /**
     * Delete connection
     * ﻿Revoke and remove a connection from a company.
     * This operation is not reversible. The end user would need to reauthorize a new data connection if you wish to view new data for this company.
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.platform.models.operations.DeleteConnectionResponse delete(
            io.codat.platform.models.operations.DeleteConnectionRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.platform.utils.Utils.generateURL(
                io.codat.platform.models.operations.DeleteConnectionRequest.class,
                baseUrl,
                "/companies/{companyId}/connections/{connectionId}",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.codat.platform.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        io.codat.platform.utils.RetryConfig retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            retryConfig = io.codat.platform.utils.RetryConfig.builder()
                .backoff(io.codat.platform.utils.BackoffStrategy.builder()
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
        io.codat.platform.utils.Retries retries = io.codat.platform.utils.Retries.builder()
            .action(() -> client.send(req))
            .retryConfig(retryConfig)
            .statusCodes(statusCodes)
            .build();

        HttpResponse<InputStream> httpRes = retries.run();

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.codat.platform.models.operations.DeleteConnectionResponse.Builder resBuilder = 
            io.codat.platform.models.operations.DeleteConnectionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.platform.models.operations.DeleteConnectionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
        } else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.platform.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.platform.models.shared.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.platform.models.shared.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public io.codat.platform.models.operations.GetConnectionRequestBuilder get() {
        return new io.codat.platform.models.operations.GetConnectionRequestBuilder(this);
    }

    /**
     * Get connection
     * ﻿Returns a specific connection for a company when valid identifiers are provided. If the identifiers are for a deleted company and/or connection, a not found response is returned.
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.platform.models.operations.GetConnectionResponse get(
            io.codat.platform.models.operations.GetConnectionRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.platform.utils.Utils.generateURL(
                io.codat.platform.models.operations.GetConnectionRequest.class,
                baseUrl,
                "/companies/{companyId}/connections/{connectionId}",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.codat.platform.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        io.codat.platform.utils.RetryConfig retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            retryConfig = io.codat.platform.utils.RetryConfig.builder()
                .backoff(io.codat.platform.utils.BackoffStrategy.builder()
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
        io.codat.platform.utils.Retries retries = io.codat.platform.utils.Retries.builder()
            .action(() -> client.send(req))
            .retryConfig(retryConfig)
            .statusCodes(statusCodes)
            .build();

        HttpResponse<InputStream> httpRes = retries.run();

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.codat.platform.models.operations.GetConnectionResponse.Builder resBuilder = 
            io.codat.platform.models.operations.GetConnectionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.platform.models.operations.GetConnectionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.codat.platform.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.platform.models.shared.Connection out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.platform.models.shared.Connection>() {});
                res.withConnection(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.platform.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.platform.models.shared.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.platform.models.shared.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public io.codat.platform.models.operations.ListConnectionsRequestBuilder list() {
        return new io.codat.platform.models.operations.ListConnectionsRequestBuilder(this);
    }

    /**
     * List connections
     * ﻿List the connections for a company.
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.platform.models.operations.ListConnectionsResponse list(
            io.codat.platform.models.operations.ListConnectionsRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.platform.utils.Utils.generateURL(
                io.codat.platform.models.operations.ListConnectionsRequest.class,
                baseUrl,
                "/companies/{companyId}/connections",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        java.util.List<NameValuePair> queryParams = io.codat.platform.utils.Utils.getQueryParams(
                io.codat.platform.models.operations.ListConnectionsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }

        HTTPClient client = io.codat.platform.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        io.codat.platform.utils.RetryConfig retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            retryConfig = io.codat.platform.utils.RetryConfig.builder()
                .backoff(io.codat.platform.utils.BackoffStrategy.builder()
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
        io.codat.platform.utils.Retries retries = io.codat.platform.utils.Retries.builder()
            .action(() -> client.send(req))
            .retryConfig(retryConfig)
            .statusCodes(statusCodes)
            .build();

        HttpResponse<InputStream> httpRes = retries.run();

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.codat.platform.models.operations.ListConnectionsResponse.Builder resBuilder = 
            io.codat.platform.models.operations.ListConnectionsResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.platform.models.operations.ListConnectionsResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.codat.platform.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.platform.models.shared.Connections out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.platform.models.shared.Connections>() {});
                res.withConnections(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.platform.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.platform.models.shared.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.platform.models.shared.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public io.codat.platform.models.operations.UnlinkConnectionRequestBuilder unlink() {
        return new io.codat.platform.models.operations.UnlinkConnectionRequestBuilder(this);
    }

    /**
     * Unlink connection
     * ﻿This allows you to deauthorize a connection, without deleting it from Codat. This means you can still view any data that has previously been pulled into Codat, and also lets you re-authorize in future if your customer wishes to resume sharing their data.
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.platform.models.operations.UnlinkConnectionResponse unlink(
            io.codat.platform.models.operations.UnlinkConnectionRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.platform.utils.Utils.generateURL(
                io.codat.platform.models.operations.UnlinkConnectionRequest.class,
                baseUrl,
                "/companies/{companyId}/connections/{connectionId}",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<io.codat.platform.models.operations.UnlinkConnectionRequest>() {});
        SerializedBody serializedRequestBody = io.codat.platform.utils.Utils.serializeRequestBody(
                _convertedRequest, "updateConnectionStatus", "json", false);
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.codat.platform.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        io.codat.platform.utils.RetryConfig retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            retryConfig = io.codat.platform.utils.RetryConfig.builder()
                .backoff(io.codat.platform.utils.BackoffStrategy.builder()
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
        io.codat.platform.utils.Retries retries = io.codat.platform.utils.Retries.builder()
            .action(() -> client.send(req))
            .retryConfig(retryConfig)
            .statusCodes(statusCodes)
            .build();

        HttpResponse<InputStream> httpRes = retries.run();

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.codat.platform.models.operations.UnlinkConnectionResponse.Builder resBuilder = 
            io.codat.platform.models.operations.UnlinkConnectionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.platform.models.operations.UnlinkConnectionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.codat.platform.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.platform.models.shared.Connection out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.platform.models.shared.Connection>() {});
                res.withConnection(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.platform.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.platform.models.shared.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.platform.models.shared.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public io.codat.platform.models.operations.UpdateConnectionAuthorizationRequestBuilder updateAuthorization() {
        return new io.codat.platform.models.operations.UpdateConnectionAuthorizationRequestBuilder(this);
    }

    /**
     * Update authorization
     * Update data connection's authorization.
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.platform.models.operations.UpdateConnectionAuthorizationResponse updateAuthorization(
            io.codat.platform.models.operations.UpdateConnectionAuthorizationRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.platform.utils.Utils.generateURL(
                io.codat.platform.models.operations.UpdateConnectionAuthorizationRequest.class,
                baseUrl,
                "/companies/{companyId}/connections/{connectionId}/authorization",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<io.codat.platform.models.operations.UpdateConnectionAuthorizationRequest>() {});
        SerializedBody serializedRequestBody = io.codat.platform.utils.Utils.serializeRequestBody(
                _convertedRequest, "requestBody", "json", false);
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.codat.platform.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        io.codat.platform.utils.RetryConfig retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            retryConfig = io.codat.platform.utils.RetryConfig.builder()
                .backoff(io.codat.platform.utils.BackoffStrategy.builder()
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
        io.codat.platform.utils.Retries retries = io.codat.platform.utils.Retries.builder()
            .action(() -> client.send(req))
            .retryConfig(retryConfig)
            .statusCodes(statusCodes)
            .build();

        HttpResponse<InputStream> httpRes = retries.run();

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.codat.platform.models.operations.UpdateConnectionAuthorizationResponse.Builder resBuilder = 
            io.codat.platform.models.operations.UpdateConnectionAuthorizationResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.platform.models.operations.UpdateConnectionAuthorizationResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.codat.platform.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.platform.models.shared.Connection out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.platform.models.shared.Connection>() {});
                res.withConnection(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.platform.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.platform.models.shared.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.platform.models.shared.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

}
