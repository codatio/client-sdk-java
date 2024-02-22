# BankAccounts
(*bankAccounts()*)

## Overview

Access bank accounts in an SMBs accounting platform.

### Available Operations

* [create](#create) - Create bank account
* [getCreateModel](#getcreatemodel) - Get create/update bank account model
* [list](#list) - List bank accounts

## create

The *Create bank account* endpoint creates a new [bank account](https://docs.codat.io/bank-feeds-api#/schemas/BankAccount) for a given company's connection.

[Bank accounts](https://docs.codat.io/bank-feeds-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update bank account model](https://docs.codat.io/bank-feeds-api#/operations/get-create-update-bankAccounts-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=bankAccounts) for integrations that support creating an account.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.BankAccountPrototype;
import io.codat.bank_feeds.models.components.BankAccountType;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.CreateBankAccountRequest;
import io.codat.bank_feeds.models.operations.CreateBankAccountResponse;
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

            CreateBankAccountRequest req = CreateBankAccountRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .bankAccountPrototype(BankAccountPrototype.builder()
                    .accountName("<value>")
                    .accountNumber("<value>")
                    .accountType(BankAccountType.CREDIT)
                    .availableBalance(4893.82d)
                    .balance(6384.24d)
                    .currency("EUR")
                    .iBan("IE8210U901078857930905")
                    .institution("<value>")
                    .nominalCode("<value>")
                    .overdraftLimit(2303.13d)
                    .sortCode("<value>")
                    .build())
                .timeoutInMinutes(207565)
                .build();

            CreateBankAccountResponse res = sdk.bankAccounts().create()
                .request(req)
                .call();

            if (res.bankAccountCreateResponse().isPresent()) {
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

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [io.codat.bank_feeds.models.operations.CreateBankAccountRequest](../../models/operations/CreateBankAccountRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.CreateBankAccountResponse>](../../models/operations/CreateBankAccountResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCreateModel

The *Get create/update bank account model* endpoint returns the expected data for the request payload when creating and updating a [bank account](https://docs.codat.io/bank-feeds-api#/schemas/BankAccount) for a given company and integration.

[Bank accounts](https://docs.codat.io/bank-feeds-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=bankAccounts) for integrations that support creating and updating a bank account.


### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.GetCreateBankAccountsModelRequest;
import io.codat.bank_feeds.models.operations.GetCreateBankAccountsModelResponse;
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
        } catch (io.codat.bank_feeds.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [io.codat.bank_feeds.models.operations.GetCreateBankAccountsModelRequest](../../models/operations/GetCreateBankAccountsModelRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.GetCreateBankAccountsModelResponse>](../../models/operations/GetCreateBankAccountsModelResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List bank accounts* endpoint returns a list of [bank accounts](https://docs.codat.io/bank-feeds-api#/schemas/BankAccount) for a given company's connection.

[Bank accounts](https://docs.codat.io/bank-feeds-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/bank-feeds-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.ListBankAccountsRequest;
import io.codat.bank_feeds.models.operations.ListBankAccountsResponse;
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

            ListBankAccountsRequest req = ListBankAccountsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListBankAccountsResponse res = sdk.bankAccounts().list()
                .request(req)
                .call();

            if (res.bankAccounts().isPresent()) {
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

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [io.codat.bank_feeds.models.operations.ListBankAccountsRequest](../../models/operations/ListBankAccountsRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.ListBankAccountsResponse>](../../models/operations/ListBankAccountsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
