# Transfers
(*transfers()*)

## Overview

Create transfer transactions.

### Available Operations

* [createTransfer](#createtransfer) - Create transfer transaction

## createTransfer

Use the *Create transfer* endpoint to create or update a [transfer transaction](https://docs.codat.io/sync-for-expenses-api#/schemas/TransferTransaction) in the accounting platform for a given company's connection. 

Transfers record the movement of money between two bank accounts, or between a bank account and a nominal account. Use them to represent actions such as topping up a debit card account or a balance transfer to another credit card.

The `from.amount` and `to.amount` fields are in the native currency of the account.


### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.AccountRef;
import io.codat.sync.expenses.models.components.CreateTransferRequest;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.components.TransferDetails;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.CreateTransferTransactionRequest;
import io.codat.sync.expenses.models.operations.CreateTransferTransactionResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreateTransferTransactionRequest req = CreateTransferTransactionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .transactionId("336694d8-2dca-4cb5-a28d-3ccb83e55eee")
                .createTransferRequest(CreateTransferRequest.builder()
                    .date("2022-10-23T00:00:00Z")
                    .description("APPLE.COM/BILL - 09001077498 - Card Ending: 4590")
                    .from(TransferDetails.builder()
                        .accountRef(AccountRef.builder()
                            .id("<id>")
                            .name("<value>")
                            .build())
                        .amount(new BigDecimal("3461.5"))
                        .build())
                    .to(TransferDetails.builder()
                        .accountRef(AccountRef.builder()
                            .id("<id>")
                            .name("<value>")
                            .build())
                        .amount(new BigDecimal("3686.64"))
                        .build())
                    .build())
                .build();

            CreateTransferTransactionResponse res = sdk.transfers().createTransfer()
                .request(req)
                .call();

            if (res.createTransferResponse().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [io.codat.sync.expenses.models.operations.CreateTransferTransactionRequest](../../models/operations/CreateTransferTransactionRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.CreateTransferTransactionResponse>](../../models/operations/CreateTransferTransactionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
