# Transactions
(*transactions()*)

## Overview

Transactions represent debits and credits from a source account.

### Available Operations

* [create](#create) - Create bank transactions
* [getCreateOperation](#getcreateoperation) - Get create operation
* [listCreateOperations](#listcreateoperations) - List create operations

## create

﻿The *Create bank transactions* endpoint creates new [bank transactions](https://docs.codat.io/bank-feeds-api#/schemas/BankTransactions) for a given company's connection.

[Bank transactions](https://docs.codat.io/bank-feeds-api#/schemas/BankTransactions) are records of monetary amounts that have moved in and out of an SMB's bank account.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create bank transaction model](https://docs.codat.io/bank-feeds-api#/operations/get-create-bankTransactions-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=bankTransactions) for integrations that support creating a bank account transactions.


### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.BankTransactionType;
import io.codat.bank_feeds.models.components.BankTransactions;
import io.codat.bank_feeds.models.components.CreateBankTransactions;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.CreateBankTransactionsRequest;
import io.codat.bank_feeds.models.operations.CreateBankTransactionsResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreateBankTransactionsRequest req = CreateBankTransactionsRequest.builder()
                .accountId("9wg4lep4ush5cxs79pl8sozmsndbaukll3ind4g7buqbm1h2")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .createBankTransactions(CreateBankTransactions.builder()
                    .accountId("7110701885")
                    .transactions(java.util.List.of(
                        BankTransactions.builder()
                            .amount(999.99d)
                            .balance(-999.99d)
                            .counterparty("ACME INC")
                            .date("2022-10-23T00:00:00Z")
                            .description("Debit for Payment Id sdp-1-57379a43-c4b8-49f5-bd7c-699189ee7a60")
                            .id("716422529")
                            .reconciled(false)
                            .reference("reference for transaction")
                            .build()))
                    .build())
                .allowSyncOnPushComplete(false)
                .timeoutInMinutes(859213)
                .build();

            CreateBankTransactionsResponse res = sdk.transactions().create()
                .request(req)
                .call();

            if (res.createBankTransactionsResponse().isPresent()) {
                // handle response
            }
        } catch (io.codat.bank_feeds.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [io.codat.bank_feeds.models.operations.CreateBankTransactionsRequest](../../models/operations/CreateBankTransactionsRequest.md) | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.CreateBankTransactionsResponse>](../../models/operations/CreateBankTransactionsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCreateOperation

Retrieve push operation.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.GetCreateOperationRequest;
import io.codat.bank_feeds.models.operations.GetCreateOperationResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetCreateOperationRequest req = GetCreateOperationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .pushOperationKey("1fb73c31-a851-46c2-ab8a-5ce6e25b57b8")
                .build();

            GetCreateOperationResponse res = sdk.transactions().getCreateOperation()
                .request(req)
                .call();

            if (res.pushOperation().isPresent()) {
                // handle response
            }
        } catch (io.codat.bank_feeds.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [io.codat.bank_feeds.models.operations.GetCreateOperationRequest](../../models/operations/GetCreateOperationRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.GetCreateOperationResponse>](../../models/operations/GetCreateOperationResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## listCreateOperations

List create operations.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.ListCreateOperationsRequest;
import io.codat.bank_feeds.models.operations.ListCreateOperationsResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListCreateOperationsRequest req = ListCreateOperationsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListCreateOperationsResponse res = sdk.transactions().listCreateOperations()
                .request(req)
                .call();

            if (res.pushOperations().isPresent()) {
                // handle response
            }
        } catch (io.codat.bank_feeds.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [io.codat.bank_feeds.models.operations.ListCreateOperationsRequest](../../models/operations/ListCreateOperationsRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.ListCreateOperationsResponse>](../../models/operations/ListCreateOperationsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
