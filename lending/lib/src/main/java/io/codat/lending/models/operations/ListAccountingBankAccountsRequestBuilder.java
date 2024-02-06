/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

import io.codat.lending.CodatLending;
import io.codat.lending.utils.Utils;
import io.codat.lending.utils.LazySingletonValue;

public class ListAccountingBankAccountsRequestBuilder {

    private ListAccountingBankAccountsRequest request;

    private final SDKMethodInterfaces.MethodCallListAccountingBankAccounts sdk;
    
    public ListAccountingBankAccountsRequestBuilder(SDKMethodInterfaces.MethodCallListAccountingBankAccounts sdk) {
        this.sdk = sdk;
    }
             
    public ListAccountingBankAccountsRequestBuilder request(ListAccountingBankAccountsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListAccountingBankAccountsResponse call() throws Exception {
        return sdk.list(
            request);
    }
}