# Transfers
(*transfers()*)

## Overview

Create and update transactions that represent the movement of your customers' money.

### Available Operations

* [create](#create) - Create transfer transaction

## create

Use the *Create transfer* endpoint to create or update a [transfer transaction](https://docs.codat.io/sync-for-expenses-api#/schemas/TransferTransactionRequest) in the accounting software for a given company's connection. 

Transfers record the movement of money between two bank accounts, or between a bank account and a nominal account. Use them to represent actions such as topping up a debit card account or a balance transfer to another credit card.

The `from.amount` and `to.amount` fields are in the native currency of the account.

### Supported Integrations
| Integration           | Supported |
|-----------------------|-----------|
| FreeAgent             | Yes       |
| QuickBooks Desktop    | Yes       |
| QuickBooks Online     | Yes       |
| Xero                  | Yes       |

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.AccountReference;
import io.codat.sync.expenses.models.components.From;
import io.codat.sync.expenses.models.components.To;
import io.codat.sync.expenses.models.components.TransferTransactionRequest;
import io.codat.sync.expenses.models.components.TransferTransactionRequestAccountReference;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.CreateTransferTransactionRequest;
import io.codat.sync.expenses.models.operations.CreateTransferTransactionResponse;
import java.lang.Exception;
import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        CreateTransferTransactionRequest req = CreateTransferTransactionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .transactionId("336694d8-2dca-4cb5-a28d-3ccb83e55eee")
                .transferTransactionRequest(TransferTransactionRequest.builder()
                    .date("2022-10-23T00:00:00Z")
                    .from(From.builder()
                        .accountRef(AccountReference.builder()
                            .id("<id>")
                            .build())
                        .amount(new BigDecimal("6384.24"))
                        .build())
                    .to(To.builder()
                        .accountRef(TransferTransactionRequestAccountReference.builder()
                            .id("<id>")
                            .build())
                        .amount(new BigDecimal("4174.58"))
                        .build())
                    .description("Transfer from bank account Y to bank account Z")
                    .build())
                .build();

        CreateTransferTransactionResponse res = sdk.transfers().create()
                .request(req)
                .call();

        if (res.transferTransactionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [CreateTransferTransactionRequest](../../models/operations/CreateTransferTransactionRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[CreateTransferTransactionResponse](../../models/operations/CreateTransferTransactionResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |