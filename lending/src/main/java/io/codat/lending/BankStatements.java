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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Retrieve banking data from linked bank accounts.
 */
public class BankStatements implements
            MethodCallEndBankStatementUploadSession,
            MethodCallGetBankStatementUploadConfiguration,
            MethodCallSetBankStatementUploadConfiguration,
            MethodCallStartBankStatementUploadSession {
    
    private final SDKConfiguration sdkConfiguration;

    BankStatements(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }
    public io.codat.lending.models.operations.EndBankStatementUploadSessionRequestBuilder endUploadSession() {
        return new io.codat.lending.models.operations.EndBankStatementUploadSessionRequestBuilder(this);
    }

    /**
     * End upload session
     * The *End upload session* endpoint finalizes a bank statement upload session, either cancelling the dataset or triggering ingestion of the data and enrichment of uploaded transactions.
     * 
     * A session is a one-time process where bank statements can be uploaded to Codat. The session will time out if no data is uploaded for 90 minutes.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.lending.models.operations.EndBankStatementUploadSessionResponse endUploadSession(
            io.codat.lending.models.operations.EndBankStatementUploadSessionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.lending.utils.Utils.generateURL(
                io.codat.lending.models.operations.EndBankStatementUploadSessionRequest.class, 
                baseUrl, 
                "/companies/{companyId}/connections/{connectionId}/bankStatements/upload/dataset/{datasetId}/endSession", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = io.codat.lending.utils.Utils.serializeRequestBody(
                request, "endUploadSessionRequest", "json", false);
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = io.codat.lending.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");
        io.codat.lending.models.operations.EndBankStatementUploadSessionResponse.Builder resBuilder = 
            io.codat.lending.models.operations.EndBankStatementUploadSessionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.lending.models.operations.EndBankStatementUploadSessionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
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

    public io.codat.lending.models.operations.GetBankStatementUploadConfigurationRequestBuilder getUploadConfiguration() {
        return new io.codat.lending.models.operations.GetBankStatementUploadConfigurationRequestBuilder(this);
    }

    /**
     * Get upload configuration
     * The *Get upload configuration* endpoint returns the bank statement upload configuration for the data connection.
     * 
     * Bank statement upload configuration allows configuration of the source of the data to be uploaded to the *Upload data* endpoint, the provider ID for a truelayer connection, and sets the account ID of the account. Data uploaded to the *Upload data* endpoint must be for the configured account.Bank statement upload configuration is used to define the source from which data is to be uploaded as well as any source specific requirements such as the provider ID for TrueLayer. 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.lending.models.operations.GetBankStatementUploadConfigurationResponse getUploadConfiguration(
            io.codat.lending.models.operations.GetBankStatementUploadConfigurationRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.lending.utils.Utils.generateURL(
                io.codat.lending.models.operations.GetBankStatementUploadConfigurationRequest.class, 
                baseUrl, 
                "/companies/{companyId}/connections/{connectionId}/bankStatements/upload/configuration", 
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
        io.codat.lending.models.operations.GetBankStatementUploadConfigurationResponse.Builder resBuilder = 
            io.codat.lending.models.operations.GetBankStatementUploadConfigurationResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.lending.models.operations.GetBankStatementUploadConfigurationResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (io.codat.lending.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.lending.models.shared.BankStatementUploadConfiguration out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.lending.models.shared.BankStatementUploadConfiguration>() {});
                res.withBankStatementUploadConfiguration(java.util.Optional.ofNullable(out));
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

    public io.codat.lending.models.operations.SetBankStatementUploadConfigurationRequestBuilder setUploadConfiguration() {
        return new io.codat.lending.models.operations.SetBankStatementUploadConfigurationRequestBuilder(this);
    }

    /**
     * Set upload configuration
     * The *Set upload configuration* endpoint sets the bank statement upload configuration for the data connection
     * 
     * Bank statement upload configuration is used to define the source from which data is to be uploaded as well as any source specific requirements such as the provider ID for TrueLayer.
     * 
     * If configuration is already present for the data connection a Bad Request response will be returned. If there is already a data connection for the same company with the same account ID, a Bad Request response will be returned.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.lending.models.operations.SetBankStatementUploadConfigurationResponse setUploadConfiguration(
            io.codat.lending.models.operations.SetBankStatementUploadConfigurationRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.lending.utils.Utils.generateURL(
                io.codat.lending.models.operations.SetBankStatementUploadConfigurationRequest.class, 
                baseUrl, 
                "/companies/{companyId}/connections/{connectionId}/bankStatements/upload/configuration", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = io.codat.lending.utils.Utils.serializeRequestBody(
                request, "bankStatementUploadConfiguration", "json", false);
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = io.codat.lending.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");
        io.codat.lending.models.operations.SetBankStatementUploadConfigurationResponse.Builder resBuilder = 
            io.codat.lending.models.operations.SetBankStatementUploadConfigurationResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.lending.models.operations.SetBankStatementUploadConfigurationResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (io.codat.lending.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.lending.models.shared.BankStatementUploadConfiguration out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.lending.models.shared.BankStatementUploadConfiguration>() {});
                res.withBankStatementUploadConfiguration(java.util.Optional.ofNullable(out));
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

    public io.codat.lending.models.operations.StartBankStatementUploadSessionRequestBuilder startUploadSession() {
        return new io.codat.lending.models.operations.StartBankStatementUploadSessionRequestBuilder(this);
    }

    /**
     * Start upload session
     * The *Start upload session* endpoint initiates a bank statement upload session for a given company.
     * 
     * A session is a one-time session where bank statements can be uploaded to Codat.
     * 
     * If a session is already in progress for a data type bad request will be returned. The session will time out if no data is uploaded for 90 minutes.
     * Use the *Close upload session* endpoint to complete or cancel a session. 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.lending.models.operations.StartBankStatementUploadSessionResponse startUploadSession(
            io.codat.lending.models.operations.StartBankStatementUploadSessionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.lending.utils.Utils.generateURL(
                io.codat.lending.models.operations.StartBankStatementUploadSessionRequest.class, 
                baseUrl, 
                "/companies/{companyId}/connections/{connectionId}/bankStatements/upload/startSession", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = io.codat.lending.utils.Utils.serializeRequestBody(
                request, "startUploadSessionRequest", "json", false);
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = io.codat.lending.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");
        io.codat.lending.models.operations.StartBankStatementUploadSessionResponse.Builder resBuilder = 
            io.codat.lending.models.operations.StartBankStatementUploadSessionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.lending.models.operations.StartBankStatementUploadSessionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (io.codat.lending.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.lending.models.shared.PullOperation out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.lending.models.shared.PullOperation>() {});
                res.withPullOperation(java.util.Optional.ofNullable(out));
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

}
