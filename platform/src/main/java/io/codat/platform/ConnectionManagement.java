/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.errors.SDKError;
import io.codat.platform.models.operations.GetConnectionManagementAccessTokenRequest;
import io.codat.platform.models.operations.GetConnectionManagementAccessTokenRequestBuilder;
import io.codat.platform.models.operations.GetConnectionManagementAccessTokenResponse;
import io.codat.platform.models.operations.SDKMethodInterfaces.*;
import io.codat.platform.models.shared.ConnectionManagementAccessToken;
import io.codat.platform.utils.BackoffStrategy;
import io.codat.platform.utils.HTTPClient;
import io.codat.platform.utils.HTTPRequest;
import io.codat.platform.utils.Hook.AfterErrorContextImpl;
import io.codat.platform.utils.Hook.AfterSuccessContextImpl;
import io.codat.platform.utils.Hook.BeforeRequestContextImpl;
import io.codat.platform.utils.Options;
import io.codat.platform.utils.Retries.NonRetryableException;
import io.codat.platform.utils.Retries;
import io.codat.platform.utils.RetryConfig;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit; 

/**
 * Configure UI and retrieve access tokens for authentication used by **Connections SDK**.
 */
public class ConnectionManagement implements
            MethodCallGetConnectionManagementAccessToken {

    private final SDKConfiguration sdkConfiguration;
    private final CorsSettings corsSettings;

    ConnectionManagement(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.corsSettings = new CorsSettings(this.sdkConfiguration);
    }

    public final CorsSettings corsSettings() {
        return corsSettings;
    }


    /**
     * Get access token
     * ﻿Use the *Get access token* endpoint to retrieve a new access token for use with the [Connections SDK](https://docs.codat.io/auth-flow/optimize/connection-management). The token is only valid for one hour and applies to a single company.
     * 
     * The embeddable [Connections SDK](https://docs.codat.io/auth-flow/optimize/connection-management) lets your customers control access to their data by allowing them to manage their existing connections.
     * @return The call builder
     */
    public GetConnectionManagementAccessTokenRequestBuilder getAccessToken() {
        return new GetConnectionManagementAccessTokenRequestBuilder(this);
    }

    /**
     * Get access token
     * ﻿Use the *Get access token* endpoint to retrieve a new access token for use with the [Connections SDK](https://docs.codat.io/auth-flow/optimize/connection-management). The token is only valid for one hour and applies to a single company.
     * 
     * The embeddable [Connections SDK](https://docs.codat.io/auth-flow/optimize/connection-management) lets your customers control access to their data by allowing them to manage their existing connections.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetConnectionManagementAccessTokenResponse getAccessToken(
            GetConnectionManagementAccessTokenRequest request) throws Exception {
        return getAccessToken(request, Optional.empty());
    }
    
    /**
     * Get access token
     * ﻿Use the *Get access token* endpoint to retrieve a new access token for use with the [Connections SDK](https://docs.codat.io/auth-flow/optimize/connection-management). The token is only valid for one hour and applies to a single company.
     * 
     * The embeddable [Connections SDK](https://docs.codat.io/auth-flow/optimize/connection-management) lets your customers control access to their data by allowing them to manage their existing connections.
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetConnectionManagementAccessTokenResponse getAccessToken(
            GetConnectionManagementAccessTokenRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetConnectionManagementAccessTokenRequest.class,
                _baseUrl,
                "/companies/{companyId}/connectionManagement/accessToken",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HTTPRequest _finalReq = _req;
        RetryConfig _retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            _retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            _retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            _retryConfig = RetryConfig.builder()
                .backoff(BackoffStrategy.builder()
                            .initialInterval(500, TimeUnit.MILLISECONDS)
                            .maxInterval(60000, TimeUnit.MILLISECONDS)
                            .baseFactor((double)(1.5))
                            .maxElapsedTime(3600000, TimeUnit.MILLISECONDS)
                            .retryConnectError(true)
                            .build())
                .build();
        }
        List<String> _statusCodes = new ArrayList<>();
        _statusCodes.add("408");
        _statusCodes.add("429");
        _statusCodes.add("5XX");
        Retries _retries = Retries.builder()
            .action(() -> {
                HttpRequest _r = null;
                try {
                    _r = sdkConfiguration.hooks()
                        .beforeRequest(
                            new BeforeRequestContextImpl(
                                "get-connection-management-access-token", 
                                Optional.of(List.of()), 
                                sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl(
                                "get-connection-management-access-token",
                                 Optional.of(List.of()),
                                 sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl(
                         "get-connection-management-access-token", 
                         Optional.of(List.of()), 
                         sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetConnectionManagementAccessTokenResponse.Builder _resBuilder = 
            GetConnectionManagementAccessTokenResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetConnectionManagementAccessTokenResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ConnectionManagementAccessToken _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ConnectionManagementAccessToken>() {});
                _res.withConnectionManagementAccessToken(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "402", "403", "404", "429", "500", "503")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ErrorMessage _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ErrorMessage>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}
