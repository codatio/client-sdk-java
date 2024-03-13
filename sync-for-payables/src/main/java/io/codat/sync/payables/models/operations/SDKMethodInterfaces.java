/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payables.models.operations;

import io.codat.sync.payables.utils.Options;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class SDKMethodInterfaces {

    public interface MethodCallCreateCompany {
        io.codat.sync.payables.models.operations.CreateCompanyResponse create(
            Optional<? extends io.codat.sync.payables.models.components.CompanyRequestBody> request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDeleteCompany {
        io.codat.sync.payables.models.operations.DeleteCompanyResponse delete(
            io.codat.sync.payables.models.operations.DeleteCompanyRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCompany {
        io.codat.sync.payables.models.operations.GetCompanyResponse get(
            io.codat.sync.payables.models.operations.GetCompanyRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListCompanies {
        io.codat.sync.payables.models.operations.ListCompaniesResponse list(
            io.codat.sync.payables.models.operations.ListCompaniesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUpdateCompany {
        io.codat.sync.payables.models.operations.UpdateCompanyResponse update(
            io.codat.sync.payables.models.operations.UpdateCompanyRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCompanyInformation {
        io.codat.sync.payables.models.operations.GetCompanyInformationResponse get(
            io.codat.sync.payables.models.operations.GetCompanyInformationRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateConnection {
        io.codat.sync.payables.models.operations.CreateConnectionResponse create(
            io.codat.sync.payables.models.operations.CreateConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDeleteConnection {
        io.codat.sync.payables.models.operations.DeleteConnectionResponse delete(
            io.codat.sync.payables.models.operations.DeleteConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetConnection {
        io.codat.sync.payables.models.operations.GetConnectionResponse get(
            io.codat.sync.payables.models.operations.GetConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListConnections {
        io.codat.sync.payables.models.operations.ListConnectionsResponse list(
            io.codat.sync.payables.models.operations.ListConnectionsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUnlinkConnection {
        io.codat.sync.payables.models.operations.UnlinkConnectionResponse unlink(
            io.codat.sync.payables.models.operations.UnlinkConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateBill {
        io.codat.sync.payables.models.operations.CreateBillResponse create(
            io.codat.sync.payables.models.operations.CreateBillRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDownloadBillAttachment {
        io.codat.sync.payables.models.operations.DownloadBillAttachmentResponse downloadAttachment(
            io.codat.sync.payables.models.operations.DownloadBillAttachmentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetMappingOptionsBills {
        io.codat.sync.payables.models.operations.GetMappingOptionsBillsResponse getBillOptions(
            io.codat.sync.payables.models.operations.GetMappingOptionsBillsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListBills {
        io.codat.sync.payables.models.operations.ListBillsResponse list(
            io.codat.sync.payables.models.operations.ListBillsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListBillAttachments {
        io.codat.sync.payables.models.operations.ListBillAttachmentsResponse listAttachments(
            io.codat.sync.payables.models.operations.ListBillAttachmentsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUploadBillAttachment {
        io.codat.sync.payables.models.operations.UploadBillAttachmentResponse uploadAttachment(
            io.codat.sync.payables.models.operations.UploadBillAttachmentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateBankAccount {
        io.codat.sync.payables.models.operations.CreateBankAccountResponse create(
            io.codat.sync.payables.models.operations.CreateBankAccountRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateBillPayment {
        io.codat.sync.payables.models.operations.CreateBillPaymentResponse create(
            io.codat.sync.payables.models.operations.CreateBillPaymentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetMappingOptionsPayments {
        io.codat.sync.payables.models.operations.GetMappingOptionsPaymentsResponse getPaymentOptions(
            io.codat.sync.payables.models.operations.GetMappingOptionsPaymentsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListSuppliers {
        io.codat.sync.payables.models.operations.ListSuppliersResponse list(
            io.codat.sync.payables.models.operations.ListSuppliersRequest request,
            Optional<Options> options) throws Exception;
    }

}
