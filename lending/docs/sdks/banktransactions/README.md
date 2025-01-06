# BankTransactions
(*loanWriteback().bankTransactions()*)

## Overview

### Available Operations

* [create](#create) - Create bank account transactions
* [getCreateModel](#getcreatemodel) - Get create bank account transactions model

## create

The *Create bank account transactions* endpoint creates new [bank account transactions](https://docs.codat.io/lending-api#/schemas/BankTransactions) for a given company's connection.

[Bank account transactions](https://docs.codat.io/lending-api#/schemas/BankTransactions) are records of money that has moved in and out of an SMB's bank account.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create bank transaction model](https://docs.codat.io/lending-api#/operations/get-create-bankTransactions-model).


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.CreateBankTransactionsRequest;
import io.codat.lending.models.operations.CreateBankTransactionsResponse;
import io.codat.lending.models.shared.AccountingCreateBankTransactions;
import io.codat.lending.models.shared.CreateBankAccountTransaction;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        CreateBankTransactionsRequest req = CreateBankTransactionsRequest.builder()
                .accountId("9wg4lep4ush5cxs79pl8sozmsndbaukll3ind4g7buqbm1h2")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .accountingCreateBankTransactions(AccountingCreateBankTransactions.builder()
                    .accountId("7110701885")
                    .transactions(List.of(
                        CreateBankAccountTransaction.builder()
                            .date("2022-10-23T00:00:00Z")
                            .build()))
                    .build())
                .build();

        CreateBankTransactionsResponse res = sdk.loanWriteback().bankTransactions().create()
                .request(req)
                .call();

        if (res.accountingCreateBankTransactionsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateBankTransactionsRequest](../../models/operations/CreateBankTransactionsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateBankTransactionsResponse](../../models/operations/CreateBankTransactionsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## getCreateModel

The *Get create bank account transactions model* endpoint returns the expected data for the request payload when creating [bank account transactions](https://docs.codat.io/lending-api#/schemas/BankTransactions) for a given company and integration.

[Bank account transactions](https://docs.codat.io/lending-api#/schemas/BankTransactions) are records of money that has moved in and out of an SMB's bank account.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetCreateBankTransactionsModelRequest;
import io.codat.lending.models.operations.GetCreateBankTransactionsModelResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetCreateBankTransactionsModelRequest req = GetCreateBankTransactionsModelRequest.builder()
                .accountId("13d946f0-c5d5-42bc-b092-97ece17923ab")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

        GetCreateBankTransactionsModelResponse res = sdk.loanWriteback().bankTransactions().getCreateModel()
                .request(req)
                .call();

        if (res.pushOption().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [GetCreateBankTransactionsModelRequest](../../models/operations/GetCreateBankTransactionsModelRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[GetCreateBankTransactionsModelResponse](../../models/operations/GetCreateBankTransactionsModelResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |