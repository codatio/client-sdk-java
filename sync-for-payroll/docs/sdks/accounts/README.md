# Accounts
(*accounts()*)

## Overview

Accounts

### Available Operations

* [create](#create) - Create account
* [get](#get) - Get account
* [getCreateModel](#getcreatemodel) - Get create account model
* [list](#list) - List accounts

## create

The *Create account* endpoint creates a new [account](https://docs.codat.io/sync-for-payroll-api#/schemas/Account) for a given company's connection.

[Accounts](https://docs.codat.io/sync-for-payroll-api#/schemas/Account) are the categories a business uses to record accounting transactions.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create account model](https://docs.codat.io/sync-for-payroll-api#/operations/get-create-chartOfAccounts-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=chartOfAccounts) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.components.*;
import io.codat.sync.payroll.models.components.AccountPrototype;
import io.codat.sync.payroll.models.components.AccountStatus;
import io.codat.sync.payroll.models.components.AccountType;
import io.codat.sync.payroll.models.components.Security;
import io.codat.sync.payroll.models.components.SupplementalData;
import io.codat.sync.payroll.models.components.ValidDataTypeLinks;
import io.codat.sync.payroll.models.operations.*;
import io.codat.sync.payroll.models.operations.CreateAccountRequest;
import io.codat.sync.payroll.models.operations.CreateAccountResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreateAccountRequest req = CreateAccountRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .accountPrototype(AccountPrototype.builder()
                    .currency("USD")
                    .currentBalance(0d)
                    .description("Invoices the business has issued but has not yet collected payment on.")
                    .fullyQualifiedCategory("Asset.Current")
                    .fullyQualifiedName("Cash On Hand")
                    .isBankAccount(false)
                    .name("Accounts Receivable")
                    .nominalCode("610")
                    .status(AccountStatus.ACTIVE)
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "<value>")))))
                        .build())
                    .type(AccountType.ASSET)
                    .validDatatypeLinks(java.util.List.of(
                        ValidDataTypeLinks.builder()
                            .build()))
                    .build())
                .allowSyncOnPushComplete(false)
                .timeoutInMinutes(638424)
                .build();

            CreateAccountResponse res = sdk.accounts().create()
                .request(req)
                .call();

            if (res.createAccountResponse().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payroll.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [io.codat.sync.payroll.models.operations.CreateAccountRequest](../../models/operations/CreateAccountRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[Optional<? extends io.codat.sync.payroll.models.operations.CreateAccountResponse>](../../models/operations/CreateAccountResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## get

The *Get account* endpoint returns a single account for a given `accountId`.

[Accounts](https://docs.codat.io/sync-for-payroll-api#/schemas/Account) are the categories a business uses to record accounting transactions.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=chartOfAccounts) for integrations that support getting a specific account.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-payroll-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.components.*;
import io.codat.sync.payroll.models.components.Security;
import io.codat.sync.payroll.models.operations.*;
import io.codat.sync.payroll.models.operations.GetAccountRequest;
import io.codat.sync.payroll.models.operations.GetAccountResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetAccountRequest req = GetAccountRequest.builder()
                .accountId("7110701885")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetAccountResponse res = sdk.accounts().get()
                .request(req)
                .call();

            if (res.account().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payroll.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [io.codat.sync.payroll.models.operations.GetAccountRequest](../../models/operations/GetAccountRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[Optional<? extends io.codat.sync.payroll.models.operations.GetAccountResponse>](../../models/operations/GetAccountResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCreateModel

The *Get create account model* endpoint returns the expected data for the request payload when creating an [account](https://docs.codat.io/sync-for-payroll-api#/schemas/Account) for a given company and integration.
    
[Accounts](https://docs.codat.io/sync-for-payroll-api#/schemas/Account) are the categories a business uses to record accounting transactions.
    
**Integration-specific behaviour**
    
See the *response examples* for integration-specific indicative models.
    
Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=chartOfAccounts) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.components.*;
import io.codat.sync.payroll.models.components.Security;
import io.codat.sync.payroll.models.operations.*;
import io.codat.sync.payroll.models.operations.GetCreateAccountsModelRequest;
import io.codat.sync.payroll.models.operations.GetCreateAccountsModelResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetCreateAccountsModelRequest req = GetCreateAccountsModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreateAccountsModelResponse res = sdk.accounts().getCreateModel()
                .request(req)
                .call();

            if (res.pushOption().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payroll.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [io.codat.sync.payroll.models.operations.GetCreateAccountsModelRequest](../../models/operations/GetCreateAccountsModelRequest.md) | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |


### Response

**[Optional<? extends io.codat.sync.payroll.models.operations.GetCreateAccountsModelResponse>](../../models/operations/GetCreateAccountsModelResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

﻿The *List accounts* endpoint returns a list of [accounts](https://docs.codat.io/sync-for-payroll-api#/schemas/Account) for a given company's connection.

[Accounts](https://docs.codat.io/sync-for-payroll-api#/schemas/Account) are the categories a business uses to record accounting transactions.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-payroll-api#/operations/refresh-company-data).

### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.components.*;
import io.codat.sync.payroll.models.components.Security;
import io.codat.sync.payroll.models.operations.*;
import io.codat.sync.payroll.models.operations.ListAccountsRequest;
import io.codat.sync.payroll.models.operations.ListAccountsResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListAccountsRequest req = ListAccountsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListAccountsResponse res = sdk.accounts().list()
                .request(req)
                .call();

            if (res.accounts().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payroll.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [io.codat.sync.payroll.models.operations.ListAccountsRequest](../../models/operations/ListAccountsRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends io.codat.sync.payroll.models.operations.ListAccountsResponse>](../../models/operations/ListAccountsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
