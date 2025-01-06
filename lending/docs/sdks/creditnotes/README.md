# CreditNotes
(*accountsReceivable().creditNotes()*)

## Overview

### Available Operations

* [get](#get) - Get credit note
* [list](#list) - List credit notes

## get

The *Get credit note* endpoint returns a single credit note for a given creditNoteId.

[Credit notes](https://docs.codat.io/lending-api#/schemas/CreditNote) are issued to a customer to indicate debt, typically with reference to a previously issued invoice and/or purchase.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetAccountingCreditNoteRequest;
import io.codat.lending.models.operations.GetAccountingCreditNoteResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetAccountingCreditNoteRequest req = GetAccountingCreditNoteRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .creditNoteId("<value>")
                .build();

        GetAccountingCreditNoteResponse res = sdk.accountsReceivable().creditNotes().get()
                .request(req)
                .call();

        if (res.accountingCreditNote().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetAccountingCreditNoteRequest](../../models/operations/GetAccountingCreditNoteRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetAccountingCreditNoteResponse](../../models/operations/GetAccountingCreditNoteResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 401, 402, 403, 404, 409, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## list

The *List credit notes* endpoint returns a list of [credit notes](https://docs.codat.io/lending-api#/schemas/CreditNote) for a given company's connection.

[Credit notes](https://docs.codat.io/lending-api#/schemas/CreditNote) are issued to a customer to indicate debt, typically with reference to a previously issued invoice and/or purchase.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.ListAccountingCreditNotesRequest;
import io.codat.lending.models.operations.ListAccountingCreditNotesResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        ListAccountingCreditNotesRequest req = ListAccountingCreditNotesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        ListAccountingCreditNotesResponse res = sdk.accountsReceivable().creditNotes().list()
                .request(req)
                .call();

        if (res.accountingCreditNotes().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListAccountingCreditNotesRequest](../../models/operations/ListAccountingCreditNotesRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListAccountingCreditNotesResponse](../../models/operations/ListAccountingCreditNotesResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/ErrorMessage                  | 400, 401, 402, 403, 404, 409, 429, 500, 503 | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |