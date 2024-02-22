# Transactions
(*transactions()*)

## Overview

An immutable source of up-to-date information on income and expenditure.

### Available Operations

* [get](#get) - Get bank transaction
* [list](#list) - List transactions
* [~~listBankTransactions~~](#listbanktransactions) - List banking transactions :warning: **Deprecated** Use `list` instead.

## get

The *Get transaction* endpoint returns a single transaction for a given transactionId.

[Transactions](https://docs.codat.io/banking-api#/schemas/Transaction) provide an immutable source of up-to-date information on income and expenditure.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/banking?view=tab-by-data-type&dataType=banking-transactions) for integrations that support getting a specific transaction.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.banking.CodatBanking;
import io.codat.banking.models.components.*;
import io.codat.banking.models.components.Security;
import io.codat.banking.models.operations.*;
import io.codat.banking.models.operations.GetTransactionRequest;
import io.codat.banking.models.operations.GetTransactionResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatBanking sdk = CodatBanking.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetTransactionRequest req = GetTransactionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .transactionId("<value>")
                .build();

            GetTransactionResponse res = sdk.transactions().get()
                .request(req)
                .call();

            if (res.transaction().isPresent()) {
                // handle response
            }
        } catch (io.codat.banking.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [io.codat.banking.models.operations.GetTransactionRequest](../../models/operations/GetTransactionRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[Optional<? extends io.codat.banking.models.operations.GetTransactionResponse>](../../models/operations/GetTransactionResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List transactions* endpoint returns a list of [transactions](https://docs.codat.io/banking-api#/schemas/Transaction) for a given company's connection.

[Transactions](https://docs.codat.io/banking-api#/schemas/Transaction) provide an immutable source of up-to-date information on income and expenditure.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.banking.CodatBanking;
import io.codat.banking.models.components.*;
import io.codat.banking.models.components.Security;
import io.codat.banking.models.operations.*;
import io.codat.banking.models.operations.ListTransactionsRequest;
import io.codat.banking.models.operations.ListTransactionsResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatBanking sdk = CodatBanking.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListTransactionsRequest req = ListTransactionsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListTransactionsResponse res = sdk.transactions().list()
                .request(req)
                .call();

            if (res.transactions().isPresent()) {
                // handle response
            }
        } catch (io.codat.banking.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [io.codat.banking.models.operations.ListTransactionsRequest](../../models/operations/ListTransactionsRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[Optional<? extends io.codat.banking.models.operations.ListTransactionsResponse>](../../models/operations/ListTransactionsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## ~~listBankTransactions~~

The *List transactions* endpoint returns a list of [transactions](https://docs.codat.io/banking-api#/schemas/Transaction) for a given company's connection.

[Transactions](https://docs.codat.io/banking-api#/schemas/Transaction) provide an immutable source of up-to-date information on income and expenditure.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible. Use `list` instead.

### Example Usage

```java
package hello.world;

import io.codat.banking.CodatBanking;
import io.codat.banking.models.components.*;
import io.codat.banking.models.components.Security;
import io.codat.banking.models.operations.*;
import io.codat.banking.models.operations.ListBankTransactionsRequest;
import io.codat.banking.models.operations.ListBankTransactionsResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatBanking sdk = CodatBanking.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListBankTransactionsRequest req = ListBankTransactionsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListBankTransactionsResponse res = sdk.transactions().listBankTransactions()
                .request(req)
                .call();

            if (res.transactions().isPresent()) {
                // handle response
            }
        } catch (io.codat.banking.models.errors.SDKError e) {
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
| `request`                                                                                                                | [io.codat.banking.models.operations.ListBankTransactionsRequest](../../models/operations/ListBankTransactionsRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[Optional<? extends io.codat.banking.models.operations.ListBankTransactionsResponse>](../../models/operations/ListBankTransactionsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
