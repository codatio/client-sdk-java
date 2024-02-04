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
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Create and manage your Codat companies.
 */
public class Companies implements
            MethodCallCreateCompany,
            MethodCallDeleteCompany,
            MethodCallGetCompany,
            MethodCallListCompanies,
            MethodCallUpdateCompany {
    
    private final SDKConfiguration sdkConfiguration;

    Companies(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }
    public io.codat.sync_for_expenses.models.operations.CreateCompanyRequestBuilder createCompany() {
        return new io.codat.sync_for_expenses.models.operations.CreateCompanyRequestBuilder(this);
    }

    /**
     * Create company
     * ﻿Use the *Create company* endpoint to create a new [company](https://docs.codat.io/sync-for-expenses-api#/schemas/Company) that represents your customer in Codat. 
     * 
     * A [company](https://docs.codat.io/sync-for-expenses-api#/schemas/Company) represents a business sharing access to their data.
     * Each company can have multiple [connections](https://docs.codat.io/sync-for-expenses-api#/schemas/Connection) to different data sources, such as one connection to Xero for accounting data, two connections to Plaid for two bank accounts, and a connection to Zettle for POS data.
     * 
     * If forbidden characters (see `name` pattern) are present in the request, a company will be created with the forbidden characters removed. For example, `Company (Codat[1])` with be created as `Company Codat1`.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.sync_for_expenses.models.operations.CreateCompanyResponse createCompany(
            Optional<? extends io.codat.sync_for_expenses.models.shared.CompanyRequestBody> request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.sync_for_expenses.utils.Utils.generateURL(
                baseUrl,
                "/companies");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = io.codat.sync_for_expenses.utils.Utils.serializeRequestBody(
                request, "request", "json", false);
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

        io.codat.sync_for_expenses.models.operations.CreateCompanyResponse.Builder resBuilder = 
            io.codat.sync_for_expenses.models.operations.CreateCompanyResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.sync_for_expenses.models.operations.CreateCompanyResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (io.codat.sync_for_expenses.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync_for_expenses.models.shared.Company out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync_for_expenses.models.shared.Company>() {});
                res.withCompany(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
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

    public io.codat.sync_for_expenses.models.operations.DeleteCompanyRequestBuilder deleteCompany() {
        return new io.codat.sync_for_expenses.models.operations.DeleteCompanyRequestBuilder(this);
    }

    /**
     * Delete a company
     * ﻿The *Delete company* endpoint permanently deletes a [company](https://docs.codat.io/sync-for-expenses-api#/schemas/Company), its [connections](https://docs.codat.io/sync-for-expenses-api#/schemas/Connection) and any cached data. This operation is irreversible.
     * 
     * A [company](https://docs.codat.io/sync-for-expenses-api#/schemas/Company) represents a business sharing access to their data.
     * Each company can have multiple [connections](https://docs.codat.io/sync-for-expenses-api#/schemas/Connection) to different data sources, such as one connection to Xero for accounting data, two connections to Plaid for two bank accounts, and a connection to Zettle for POS data.
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.sync_for_expenses.models.operations.DeleteCompanyResponse deleteCompany(
            io.codat.sync_for_expenses.models.operations.DeleteCompanyRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.sync_for_expenses.utils.Utils.generateURL(
                io.codat.sync_for_expenses.models.operations.DeleteCompanyRequest.class, 
                baseUrl, 
                "/companies/{companyId}", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
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

        io.codat.sync_for_expenses.models.operations.DeleteCompanyResponse.Builder resBuilder = 
            io.codat.sync_for_expenses.models.operations.DeleteCompanyResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.sync_for_expenses.models.operations.DeleteCompanyResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 204) {
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

    public io.codat.sync_for_expenses.models.operations.GetCompanyRequestBuilder getCompany() {
        return new io.codat.sync_for_expenses.models.operations.GetCompanyRequestBuilder(this);
    }

    /**
     * Get company
     * ﻿The *Get company* endpoint returns a single company for a given `companyId`.
     * 
     * A [company](https://docs.codat.io/sync-for-expenses-api#/schemas/Company) represents a business sharing access to their data.
     * Each company can have multiple [connections](https://docs.codat.io/sync-for-expenses-api#/schemas/Connection) to different data sources, such as one connection to Xero for accounting data, two connections to Plaid for two bank accounts, and a connection to Zettle for POS data.
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.sync_for_expenses.models.operations.GetCompanyResponse getCompany(
            io.codat.sync_for_expenses.models.operations.GetCompanyRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.sync_for_expenses.utils.Utils.generateURL(
                io.codat.sync_for_expenses.models.operations.GetCompanyRequest.class, 
                baseUrl, 
                "/companies/{companyId}", 
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

        io.codat.sync_for_expenses.models.operations.GetCompanyResponse.Builder resBuilder = 
            io.codat.sync_for_expenses.models.operations.GetCompanyResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.sync_for_expenses.models.operations.GetCompanyResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (io.codat.sync_for_expenses.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync_for_expenses.models.shared.Company out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync_for_expenses.models.shared.Company>() {});
                res.withCompany(java.util.Optional.ofNullable(out));
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

    public io.codat.sync_for_expenses.models.operations.ListCompaniesRequestBuilder listCompanies() {
        return new io.codat.sync_for_expenses.models.operations.ListCompaniesRequestBuilder(this);
    }

    /**
     * List companies
     * ﻿The *List companies* endpoint returns a list of [companies] associated to your instances.
     * 
     * A [company](https://docs.codat.io/sync-for-expenses-api#/schemas/Company) represents a business sharing access to their data.
     * Each company can have multiple [connections](https://docs.codat.io/sync-for-expenses-api#/schemas/Connection) to different data sources, such as one connection to Xero for accounting data, two connections to Plaid for two bank accounts, and a connection to Zettle for POS data.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.sync_for_expenses.models.operations.ListCompaniesResponse listCompanies(
            io.codat.sync_for_expenses.models.operations.ListCompaniesRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.sync_for_expenses.utils.Utils.generateURL(
                baseUrl,
                "/companies");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = io.codat.sync_for_expenses.utils.Utils.getQueryParams(
                io.codat.sync_for_expenses.models.operations.ListCompaniesRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = io.codat.sync_for_expenses.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        io.codat.sync_for_expenses.models.operations.ListCompaniesResponse.Builder resBuilder = 
            io.codat.sync_for_expenses.models.operations.ListCompaniesResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.sync_for_expenses.models.operations.ListCompaniesResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (io.codat.sync_for_expenses.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync_for_expenses.models.shared.Companies out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync_for_expenses.models.shared.Companies>() {});
                res.withCompanies(java.util.Optional.ofNullable(out));
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

    public io.codat.sync_for_expenses.models.operations.UpdateCompanyRequestBuilder updateCompany() {
        return new io.codat.sync_for_expenses.models.operations.UpdateCompanyRequestBuilder(this);
    }

    /**
     * Update company
     * ﻿Use the *Update company* endpoint to update both the name and description of the company. 
     * If you use [groups](https://docs.codat.io/sync-for-expenses-api#/schemas/Group) to manage a set of companies, use the [Add company](https://docs.codat.io/sync-for-expenses-api#/operations/add-company-to-group) or [Remove company](https://docs.codat.io/sync-for-expenses-api#/operations/remove-company-from-group) endpoints to add or remove a company from a group.
     * 
     * A [company](https://docs.codat.io/sync-for-expenses-api#/schemas/Company) represents a business sharing access to their data.
     * Each company can have multiple [connections](https://docs.codat.io/sync-for-expenses-api#/schemas/Connection) to different data sources, such as one connection to Xero for accounting data, two connections to Plaid for two bank accounts, and a connection to Zettle for POS data.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.codat.sync_for_expenses.models.operations.UpdateCompanyResponse updateCompany(
            io.codat.sync_for_expenses.models.operations.UpdateCompanyRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.codat.sync_for_expenses.utils.Utils.generateURL(
                io.codat.sync_for_expenses.models.operations.UpdateCompanyRequest.class, 
                baseUrl, 
                "/companies/{companyId}", 
                request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = io.codat.sync_for_expenses.utils.Utils.serializeRequestBody(
                request, "companyRequestBody", "json", false);
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

        io.codat.sync_for_expenses.models.operations.UpdateCompanyResponse.Builder resBuilder = 
            io.codat.sync_for_expenses.models.operations.UpdateCompanyResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.sync_for_expenses.models.operations.UpdateCompanyResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (io.codat.sync_for_expenses.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync_for_expenses.models.shared.Company out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync_for_expenses.models.shared.Company>() {});
                res.withCompany(java.util.Optional.ofNullable(out));
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

}
