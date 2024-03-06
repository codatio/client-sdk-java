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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Create groups and link them to your Codat companies.
 */
public class Groups implements
            MethodCallAddCompanyToGroup,
            MethodCallCreateGroup,
            MethodCallListGroups,
            MethodCallRemoveCompanyFromGroup {

    private final SDKConfiguration sdkConfiguration;

    Groups(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public io.codat.platform.models.operations.AddCompanyToGroupRequestBuilder addCompany() {
        return new io.codat.platform.models.operations.AddCompanyToGroupRequestBuilder(this);
    }

    /**
     * Add company
     * ﻿Use the *Add company* endpoint to assign a company to a group. A company can belong to multiple groups, but can only be added to one group at a time.
     * 
     * [Groups](https://docs.codat.io/platform-api#/schemas/Group) define a set of companies that are organized based on a chosen characteristic and can be managed in the same way.
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.platform.models.operations.AddCompanyToGroupResponse addCompany(
            io.codat.platform.models.operations.AddCompanyToGroupRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.platform.utils.Utils.generateURL(
                io.codat.platform.models.operations.AddCompanyToGroupRequest.class,
                baseUrl,
                "/companies/{companyId}/groups",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<io.codat.platform.models.operations.AddCompanyToGroupRequest>() {});
        SerializedBody serializedRequestBody = io.codat.platform.utils.Utils.serializeRequestBody(
                _convertedRequest, "companyGroupAssignment", "json", false);
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
        io.codat.platform.models.operations.AddCompanyToGroupResponse.Builder resBuilder = 
            io.codat.platform.models.operations.AddCompanyToGroupResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.platform.models.operations.AddCompanyToGroupResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.codat.platform.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.platform.models.shared.Company out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.platform.models.shared.Company>() {});
                res.withCompany(java.util.Optional.ofNullable(out));
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


    public io.codat.platform.models.operations.CreateGroupRequestBuilder create() {
        return new io.codat.platform.models.operations.CreateGroupRequestBuilder(this);
    }

    /**
     * Create group
     * ﻿Use the *Create group* endpoint to generate a new group that you can assign your companies to.
     * 
     * [Groups](https://docs.codat.io/platform-api#/schemas/Group) define a set of companies that are organized based on a chosen characteristic and can be managed in the same way.
     * 
     * ### Tips and traps
     * 
     * * The maximum length for the group name is 50 characters.
     * * It's possible to create up to 20 groups per client.
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.platform.models.operations.CreateGroupResponse create(
            Optional<? extends io.codat.platform.models.shared.GroupPrototype> request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.platform.utils.Utils.generateURL(
                baseUrl,
                "/groups");

        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<Optional<? extends io.codat.platform.models.shared.GroupPrototype>>() {});
        SerializedBody serializedRequestBody = io.codat.platform.utils.Utils.serializeRequestBody(
                _convertedRequest, "request", "json", false);
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
        io.codat.platform.models.operations.CreateGroupResponse.Builder resBuilder = 
            io.codat.platform.models.operations.CreateGroupResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.platform.models.operations.CreateGroupResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.codat.platform.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.platform.models.shared.Group out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.platform.models.shared.Group>() {});
                res.withGroup(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 409 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
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


    public io.codat.platform.models.operations.ListGroupsRequestBuilder list() {
        return new io.codat.platform.models.operations.ListGroupsRequestBuilder(this);
    }

    /**
     * List groups
     * Use the *List group* endpoint to return a list of all groups that currently exist for your client.
     * 
     * [Groups](https://docs.codat.io/platform-api#/schemas/Group) define a set of companies that are organized based on a chosen characteristic and can be managed in the same way.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.platform.models.operations.ListGroupsResponse list(
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.platform.utils.Utils.generateURL(
                baseUrl,
                "/groups");

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
        io.codat.platform.models.operations.ListGroupsResponse.Builder resBuilder = 
            io.codat.platform.models.operations.ListGroupsResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.platform.models.operations.ListGroupsResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.codat.platform.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.platform.models.shared.Groups out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.platform.models.shared.Groups>() {});
                res.withGroups(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
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


    public io.codat.platform.models.operations.RemoveCompanyFromGroupRequestBuilder removeCompany() {
        return new io.codat.platform.models.operations.RemoveCompanyFromGroupRequestBuilder(this);
    }

    /**
     * Remove company
     * ﻿Use the *Remove company* endpoint to remove a company from a group.
     * 
     * [Groups](https://docs.codat.io/platform-api#/schemas/Group) define a set of companies that are organized based on a chosen characteristic and can be managed in the same way.
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.platform.models.operations.RemoveCompanyFromGroupResponse removeCompany(
            io.codat.platform.models.operations.RemoveCompanyFromGroupRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.platform.utils.Utils.generateURL(
                io.codat.platform.models.operations.RemoveCompanyFromGroupRequest.class,
                baseUrl,
                "/companies/{companyId}/groups/{groupId}",
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
        io.codat.platform.models.operations.RemoveCompanyFromGroupResponse.Builder resBuilder = 
            io.codat.platform.models.operations.RemoveCompanyFromGroupResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.platform.models.operations.RemoveCompanyFromGroupResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 204) {
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
