# BankAccounts
(*bankAccounts()*)

## Overview

Access bank accounts in an SMBs accounting software.

### Available Operations

* [create](#create) - Create bank account
* [getCreateModel](#getcreatemodel) - Get create/update bank account model
* [list](#list) - List bank accounts

## create

The *Create bank account* endpoint creates a new [bank account](https://docs.codat.io/bank-feeds-api#/schemas/BankAccount) for a given company's connection.

[Bank accounts](https://docs.codat.io/bank-feeds-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update bank account model](https://docs.codat.io/bank-feeds-api#/operations/get-create-update-bankAccounts-model).

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.BankAccountPrototype;
import io.codat.bank_feeds.models.components.BankAccountStatus;
import io.codat.bank_feeds.models.errors.ErrorMessage;
import io.codat.bank_feeds.models.operations.CreateBankAccountRequest;
import io.codat.bank_feeds.models.operations.CreateBankAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        CreateBankAccountRequest req = CreateBankAccountRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .bankAccountPrototype(BankAccountPrototype.builder()
                    .currency("USD")
                    .status(BankAccountStatus.ACTIVE)
                    .build())
                .build();

        CreateBankAccountResponse res = sdk.bankAccounts().create()
                .request(req)
                .call();

        if (res.bankAccountCreateResponse().isPresent()) {
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

## getCreateModel

The *Get create/update bank account model* endpoint returns the expected data for the request payload when creating and updating a [bank account](https://docs.codat.io/bank-feeds-api#/schemas/BankAccount) for a given company and integration.

[Bank accounts](https://docs.codat.io/bank-feeds-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.


### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.errors.ErrorMessage;
import io.codat.bank_feeds.models.operations.GetCreateBankAccountsModelRequest;
import io.codat.bank_feeds.models.operations.GetCreateBankAccountsModelResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        GetCreateBankAccountsModelRequest req = GetCreateBankAccountsModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

        GetCreateBankAccountsModelResponse res = sdk.bankAccounts().getCreateModel()
                .request(req)
                .call();

        if (res.pushOption().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetCreateBankAccountsModelRequest](../../models/operations/GetCreateBankAccountsModelRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetCreateBankAccountsModelResponse](../../models/operations/GetCreateBankAccountsModelResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## list

The *List bank accounts* endpoint returns a list of [bank accounts](https://docs.codat.io/bank-feeds-api#/schemas/BankAccount) for a given company's connection.

[Bank accounts](https://docs.codat.io/bank-feeds-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/bank-feeds-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.errors.ErrorMessage;
import io.codat.bank_feeds.models.operations.ListBankAccountsRequest;
import io.codat.bank_feeds.models.operations.ListBankAccountsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        ListBankAccountsRequest req = ListBankAccountsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        ListBankAccountsResponse res = sdk.bankAccounts().list()
                .request(req)
                .call();

        if (res.bankAccounts().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListBankAccountsRequest](../../models/operations/ListBankAccountsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListBankAccountsResponse](../../models/operations/ListBankAccountsResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/ErrorMessage                  | 400, 401, 402, 403, 404, 409, 429, 500, 503 | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |