# TransactionStatus
(*transactionStatus()*)

## Overview

Monitor the status of individual transactions in data syncs.

### Available Operations

* [get](#get) - Get sync transaction
* [list](#list) - List sync transactions

## get

Gets the status of a transaction for a sync

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.GetSyncTransactionRequest;
import io.codat.sync.expenses.models.operations.GetSyncTransactionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        GetSyncTransactionRequest req = GetSyncTransactionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .syncId("6fb40d5e-b13e-11ed-afa1-0242ac120002")
                .transactionId("336694d8-2dca-4cb5-a28d-3ccb83e55eee")
                .build();

        GetSyncTransactionResponse res = sdk.transactionStatus().get()
                .request(req)
                .call();

        if (res.transactionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetSyncTransactionRequest](../../models/operations/GetSyncTransactionRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetSyncTransactionResponse](../../models/operations/GetSyncTransactionResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## list

Gets the transactions and status for a sync

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.ListSyncTransactionsRequest;
import io.codat.sync.expenses.models.operations.ListSyncTransactionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        ListSyncTransactionsRequest req = ListSyncTransactionsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .syncId("6fb40d5e-b13e-11ed-afa1-0242ac120002")
                .page(1)
                .pageSize(100)
                .build();

        ListSyncTransactionsResponse res = sdk.transactionStatus().list()
                .request(req)
                .call();

        if (res.transactions().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListSyncTransactionsRequest](../../models/operations/ListSyncTransactionsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListSyncTransactionsResponse](../../models/operations/ListSyncTransactionsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |