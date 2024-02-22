/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.operations;

import io.codat.bank_feeds.utils.Options;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class SDKMethodInterfaces {

    public interface MethodCallCreateCompany {
        io.codat.bank_feeds.models.operations.CreateCompanyResponse create(
            Optional<? extends io.codat.bank_feeds.models.components.CompanyRequestBody> request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDeleteCompany {
        io.codat.bank_feeds.models.operations.DeleteCompanyResponse delete(
            io.codat.bank_feeds.models.operations.DeleteCompanyRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCompany {
        io.codat.bank_feeds.models.operations.GetCompanyResponse get(
            io.codat.bank_feeds.models.operations.GetCompanyRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListCompanies {
        io.codat.bank_feeds.models.operations.ListCompaniesResponse list(
            io.codat.bank_feeds.models.operations.ListCompaniesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUpdateCompany {
        io.codat.bank_feeds.models.operations.UpdateCompanyResponse update(
            io.codat.bank_feeds.models.operations.UpdateCompanyRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateConnection {
        io.codat.bank_feeds.models.operations.CreateConnectionResponse create(
            io.codat.bank_feeds.models.operations.CreateConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDeleteConnection {
        io.codat.bank_feeds.models.operations.DeleteConnectionResponse delete(
            io.codat.bank_feeds.models.operations.DeleteConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetConnection {
        io.codat.bank_feeds.models.operations.GetConnectionResponse get(
            io.codat.bank_feeds.models.operations.GetConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListConnections {
        io.codat.bank_feeds.models.operations.ListConnectionsResponse list(
            io.codat.bank_feeds.models.operations.ListConnectionsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUnlinkConnection {
        io.codat.bank_feeds.models.operations.UnlinkConnectionResponse unlink(
            io.codat.bank_feeds.models.operations.UnlinkConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateBankAccountMapping {
        io.codat.bank_feeds.models.operations.CreateBankAccountMappingResponse create(
            io.codat.bank_feeds.models.operations.CreateBankAccountMappingRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetBankAccountMapping {
        io.codat.bank_feeds.models.operations.GetBankAccountMappingResponse get(
            io.codat.bank_feeds.models.operations.GetBankAccountMappingRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateSourceAccount {
        io.codat.bank_feeds.models.operations.CreateSourceAccountResponse create(
            io.codat.bank_feeds.models.operations.CreateSourceAccountRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDeleteSourceAccount {
        io.codat.bank_feeds.models.operations.DeleteSourceAccountResponse delete(
            io.codat.bank_feeds.models.operations.DeleteSourceAccountRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDeleteBankFeedCredentials {
        io.codat.bank_feeds.models.operations.DeleteBankFeedCredentialsResponse deleteCredentials(
            io.codat.bank_feeds.models.operations.DeleteBankFeedCredentialsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGenerateCredentials {
        io.codat.bank_feeds.models.operations.GenerateCredentialsResponse generateCredentials(
            io.codat.bank_feeds.models.operations.GenerateCredentialsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListSourceAccounts {
        io.codat.bank_feeds.models.operations.ListSourceAccountsResponse list(
            io.codat.bank_feeds.models.operations.ListSourceAccountsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUpdateSourceAccount {
        io.codat.bank_feeds.models.operations.UpdateSourceAccountResponse update(
            io.codat.bank_feeds.models.operations.UpdateSourceAccountRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateBankAccount {
        io.codat.bank_feeds.models.operations.CreateBankAccountResponse create(
            io.codat.bank_feeds.models.operations.CreateBankAccountRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCreateBankAccountsModel {
        io.codat.bank_feeds.models.operations.GetCreateBankAccountsModelResponse getCreateModel(
            io.codat.bank_feeds.models.operations.GetCreateBankAccountsModelRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListBankAccounts {
        io.codat.bank_feeds.models.operations.ListBankAccountsResponse list(
            io.codat.bank_feeds.models.operations.ListBankAccountsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateBankTransactions {
        io.codat.bank_feeds.models.operations.CreateBankTransactionsResponse create(
            io.codat.bank_feeds.models.operations.CreateBankTransactionsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCreateOperation {
        io.codat.bank_feeds.models.operations.GetCreateOperationResponse getCreateOperation(
            io.codat.bank_feeds.models.operations.GetCreateOperationRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListCreateOperations {
        io.codat.bank_feeds.models.operations.ListCreateOperationsResponse listCreateOperations(
            io.codat.bank_feeds.models.operations.ListCreateOperationsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetConfiguration {
        io.codat.bank_feeds.models.operations.GetConfigurationResponse get(
            io.codat.bank_feeds.models.operations.GetConfigurationRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallSetConfiguration {
        io.codat.bank_feeds.models.operations.SetConfigurationResponse set(
            io.codat.bank_feeds.models.operations.SetConfigurationRequest request,
            Optional<Options> options) throws Exception;
    }

}