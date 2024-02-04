/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync_for_expenses;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.codat.sync_for_expenses.models.errors.SDKError;
import io.codat.sync_for_expenses.models.operations.SDKMethodInterfaces.*;
import io.codat.sync_for_expenses.utils.HTTPClient;
import io.codat.sync_for_expenses.utils.HTTPRequest;
import io.codat.sync_for_expenses.utils.JSON;
import io.codat.sync_for_expenses.utils.SerializedBody;
import io.codat.sync_for_expenses.utils.Utils;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Manage mapping options and sync configuration.
 */
public class Configuration implements
            MethodCallGetCompanyConfiguration,
            MethodCallGetMappingOptions,
            MethodCallSetCompanyConfiguration {
    
    private final SDKConfiguration sdkConfiguration;

    Configuration(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }
    public io.codat.sync_for_expenses.models.operations.GetCompanyConfigurationRequestBuilder getCompanyConfiguration() {
        return new io.codat.sync_for_expenses.models.operations.GetCompanyConfigurationRequestBuilder(this);
    }

    /**
     * Get company configuration
     * Gets a companies expense sync configuration
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.sync_for_expenses.models.operations.GetCompanyConfigurationResponse getCompanyConfiguration(
            io.codat.sync_for_expenses.models.operations.GetCompanyConfigurationRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.sync_for_expenses.utils.Utils.generateURL(
                io.codat.sync_for_expenses.models.operations.GetCompanyConfigurationRequest.class, 
                baseUrl, 
                "/companies/{companyId}/sync/expenses/config", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = io.codat.sync_for_expenses.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        io.codat.sync_for_expenses.models.operations.GetCompanyConfigurationResponse.Builder resBuilder = 
            io.codat.sync_for_expenses.models.operations.GetCompanyConfigurationResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.sync_for_expenses.models.operations.GetCompanyConfigurationResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (io.codat.sync_for_expenses.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync_for_expenses.models.shared.CompanyConfiguration out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync_for_expenses.models.shared.CompanyConfiguration>() {});
                res.withCompanyConfiguration(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.sync_for_expenses.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync_for_expenses.models.shared.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync_for_expenses.models.shared.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

    public io.codat.sync_for_expenses.models.operations.GetMappingOptionsRequestBuilder getMappingOptions() {
        return new io.codat.sync_for_expenses.models.operations.GetMappingOptionsRequestBuilder(this);
    }

    /**
     * Mapping options
     * Gets the expense mapping options for a companies accounting software
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.sync_for_expenses.models.operations.GetMappingOptionsResponse getMappingOptions(
            io.codat.sync_for_expenses.models.operations.GetMappingOptionsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.sync_for_expenses.utils.Utils.generateURL(
                io.codat.sync_for_expenses.models.operations.GetMappingOptionsRequest.class, 
                baseUrl, 
                "/companies/{companyId}/sync/expenses/mappingOptions", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = io.codat.sync_for_expenses.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        io.codat.sync_for_expenses.models.operations.GetMappingOptionsResponse.Builder resBuilder = 
            io.codat.sync_for_expenses.models.operations.GetMappingOptionsResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.sync_for_expenses.models.operations.GetMappingOptionsResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (io.codat.sync_for_expenses.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync_for_expenses.models.shared.MappingOptions out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync_for_expenses.models.shared.MappingOptions>() {});
                res.withMappingOptions(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.sync_for_expenses.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync_for_expenses.models.shared.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync_for_expenses.models.shared.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

    public io.codat.sync_for_expenses.models.operations.SetCompanyConfigurationRequestBuilder setCompanyConfiguration() {
        return new io.codat.sync_for_expenses.models.operations.SetCompanyConfigurationRequestBuilder(this);
    }

    /**
     * Set company configuration
     * Sets a companies expense sync configuration
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.sync_for_expenses.models.operations.SetCompanyConfigurationResponse setCompanyConfiguration(
            io.codat.sync_for_expenses.models.operations.SetCompanyConfigurationRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.sync_for_expenses.utils.Utils.generateURL(
                io.codat.sync_for_expenses.models.operations.SetCompanyConfigurationRequest.class, 
                baseUrl, 
                "/companies/{companyId}/sync/expenses/config", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = io.codat.sync_for_expenses.utils.Utils.serializeRequestBody(
                request, "companyConfiguration", "json", false);
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = io.codat.sync_for_expenses.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        io.codat.sync_for_expenses.models.operations.SetCompanyConfigurationResponse.Builder resBuilder = 
            io.codat.sync_for_expenses.models.operations.SetCompanyConfigurationResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.sync_for_expenses.models.operations.SetCompanyConfigurationResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (io.codat.sync_for_expenses.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync_for_expenses.models.shared.CompanyConfiguration out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync_for_expenses.models.shared.CompanyConfiguration>() {});
                res.withCompanyConfiguration(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.sync_for_expenses.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync_for_expenses.models.shared.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync_for_expenses.models.shared.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

}
