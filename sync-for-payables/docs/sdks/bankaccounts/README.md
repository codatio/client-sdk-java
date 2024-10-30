# BankAccounts
(*bankAccounts()*)

## Overview

Create a bank account for a given company's connection.

### Available Operations

* [create](#create) - Create bank account

## create

The *Create bank account* endpoint creates a new [bank account](https://docs.codat.io/sync-for-payables-api#/schemas/BankAccount) for a given company's connection.

[Bank accounts](https://docs.codat.io/sync-for-payables-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.components.BankAccountPrototype;
import io.codat.sync.payables.models.components.BankAccountType;
import io.codat.sync.payables.models.errors.ErrorMessage;
import io.codat.sync.payables.models.operations.CreateBankAccountRequest;
import io.codat.sync.payables.models.operations.CreateBankAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncPayables sdk = CodatSyncPayables.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        CreateBankAccountRequest req = CreateBankAccountRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .bankAccountPrototype(BankAccountPrototype.builder()
                    .accountNumber("<value>")
                    .accountType(BankAccountType.CREDIT)
                    .currency("USD")
                    .name("<value>")
                    .build())
                .build();

        CreateBankAccountResponse res = sdk.bankAccounts().create()
                .request(req)
                .call();

        if (res.bankAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateBankAccountRequest](../../models/operations/CreateBankAccountRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateBankAccountResponse](../../models/operations/CreateBankAccountResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |