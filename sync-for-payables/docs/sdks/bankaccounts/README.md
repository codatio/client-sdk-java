# BankAccounts
(*bankAccounts()*)

## Overview

Bank accounts

### Available Operations

* [create](#create) - Create bank account

## create

The *Create bank account* endpoint creates a new [bank account](https://docs.codat.io/sync-for-payables-api#/schemas/BankAccount) for a given company's connection.

[Bank accounts](https://docs.codat.io/sync-for-payables-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.components.*;
import io.codat.sync.payables.models.components.AccountType;
import io.codat.sync.payables.models.components.BankAccountPrototype;
import io.codat.sync.payables.models.components.Security;
import io.codat.sync.payables.models.operations.*;
import io.codat.sync.payables.models.operations.CreateBankAccountRequest;
import io.codat.sync.payables.models.operations.CreateBankAccountResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncPayables sdk = CodatSyncPayables.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreateBankAccountRequest req = CreateBankAccountRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .idempotencyKey("<value>")
                .bankAccountPrototype(BankAccountPrototype.builder()
                    .accountNumber("<value>")
                    .accountType(AccountType.CREDIT)
                    .currency("USD")
                    .name("<value>")
                    .nominalCode("<value>")
                    .sortCode("<value>")
                    .build())
                .build();

            CreateBankAccountResponse res = sdk.bankAccounts().create()
                .request(req)
                .call();

            if (res.bankAccount().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payables.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [io.codat.sync.payables.models.operations.CreateBankAccountRequest](../../models/operations/CreateBankAccountRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[Optional<? extends io.codat.sync.payables.models.operations.CreateBankAccountResponse>](../../models/operations/CreateBankAccountResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
