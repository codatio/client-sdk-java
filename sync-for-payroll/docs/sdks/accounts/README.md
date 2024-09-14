# Accounts
(*accounts()*)

## Overview

Get, create, and update Accounts.

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
import io.codat.sync.payroll.models.components.AccountPrototype;
import io.codat.sync.payroll.models.components.AccountStatus;
import io.codat.sync.payroll.models.components.AccountType;
import io.codat.sync.payroll.models.errors.SDKError;
import io.codat.sync.payroll.models.operations.CreateAccountRequest;
import io.codat.sync.payroll.models.operations.CreateAccountResponse;
import java.lang.Exception;
import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreateAccountRequest req = CreateAccountRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .accountPrototype(AccountPrototype.builder()
                    .currency("USD")
                    .currentBalance(new BigDecimal("0"))
                    .description("Invoices the business has issued but has not yet collected payment on.")
                    .fullyQualifiedCategory("Asset.Current")
                    .fullyQualifiedName("Fixed Asset")
                    .name("Accounts Receivable")
                    .nominalCode("610")
                    .status(AccountStatus.ACTIVE)
                    .type(AccountType.ASSET)
                    .build())
                .build();

            CreateAccountResponse res = sdk.accounts().create()
                .request(req)
                .call();

            if (res.createAccountResponse().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payroll.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreateAccountRequest](../../models/operations/CreateAccountRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateAccountResponse](../../models/operations/CreateAccountResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## get

The *Get account* endpoint returns a single account for a given `accountId`.

[Accounts](https://docs.codat.io/sync-for-payroll-api#/schemas/Account) are the categories a business uses to record accounting transactions.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=chartOfAccounts) for integrations that support getting a specific account.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-payroll-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.errors.SDKError;
import io.codat.sync.payroll.models.operations.GetAccountRequest;
import io.codat.sync.payroll.models.operations.GetAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetAccountRequest req = GetAccountRequest.builder()
                .accountId("13d946f0-c5d5-42bc-b092-97ece17923ab")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetAccountResponse res = sdk.accounts().get()
                .request(req)
                .call();

            if (res.account().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payroll.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetAccountRequest](../../models/operations/GetAccountRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetAccountResponse](../../models/operations/GetAccountResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 401,402,403,404,409,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


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
import io.codat.sync.payroll.models.errors.SDKError;
import io.codat.sync.payroll.models.operations.GetCreateAccountsModelRequest;
import io.codat.sync.payroll.models.operations.GetCreateAccountsModelResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
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
        } catch (io.codat.sync.payroll.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetCreateAccountsModelRequest](../../models/operations/GetCreateAccountsModelRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetCreateAccountsModelResponse](../../models/operations/GetCreateAccountsModelResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## list

﻿The *List accounts* endpoint returns a list of [accounts](https://docs.codat.io/sync-for-payroll-api#/schemas/Account) for a given company's connection.

[Accounts](https://docs.codat.io/sync-for-payroll-api#/schemas/Account) are the categories a business uses to record accounting transactions.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-payroll-api#/operations/refresh-company-data).

### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.errors.SDKError;
import io.codat.sync.payroll.models.operations.ListAccountsRequest;
import io.codat.sync.payroll.models.operations.ListAccountsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListAccountsRequest req = ListAccountsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

            ListAccountsResponse res = sdk.accounts().list()
                .request(req)
                .call();

            if (res.accounts().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payroll.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListAccountsRequest](../../models/operations/ListAccountsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListAccountsResponse](../../models/operations/ListAccountsResponse.md)**

### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/ErrorMessage          | 400,401,402,403,404,409,429,500,503 | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |
