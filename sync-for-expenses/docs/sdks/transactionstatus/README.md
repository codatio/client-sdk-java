# TransactionStatus
(*transactionStatus()*)

## Overview

Retrieve the status of transactions within a sync.

### Available Operations

* [get](#get) - Get sync transaction
* [list](#list) - List sync transactions

## get

Gets the status of a transaction for a sync

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.GetSyncTransactionRequest;
import io.codat.sync.expenses.models.operations.GetSyncTransactionResponse;
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
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [io.codat.sync.expenses.models.operations.GetSyncTransactionRequest](../../models/operations/GetSyncTransactionRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.GetSyncTransactionResponse>](../../models/operations/GetSyncTransactionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## list

Gets the transactions and status for a sync

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.ListSyncTransactionsRequest;
import io.codat.sync.expenses.models.operations.ListSyncTransactionsResponse;
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
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [io.codat.sync.expenses.models.operations.ListSyncTransactionsRequest](../../models/operations/ListSyncTransactionsRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.ListSyncTransactionsResponse>](../../models/operations/ListSyncTransactionsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
