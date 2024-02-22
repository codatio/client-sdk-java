# Accounts
(*accounts()*)

## Overview

Where payments are made or received, and bank transactions are recorded.

### Available Operations

* [get](#get) - Get account
* [list](#list) - List accounts

## get

The *Get account* endpoint returns a single account for a given accountId.

[Accounts](https://docs.codat.io/banking-api#/schemas/Account) are financial accounts maintained by a bank or other financial institution.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/banking?view=tab-by-data-type&dataType=banking-accounts) for integrations that support getting a specific account.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.banking.CodatBanking;
import io.codat.banking.models.components.*;
import io.codat.banking.models.components.Security;
import io.codat.banking.models.operations.*;
import io.codat.banking.models.operations.GetAccountRequest;
import io.codat.banking.models.operations.GetAccountResponse;
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

            GetAccountRequest req = GetAccountRequest.builder()
                .accountId("7110701885")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetAccountResponse res = sdk.accounts().get()
                .request(req)
                .call();

            if (res.account().isPresent()) {
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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [io.codat.banking.models.operations.GetAccountRequest](../../models/operations/GetAccountRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[Optional<? extends io.codat.banking.models.operations.GetAccountResponse>](../../models/operations/GetAccountResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List accounts* endpoint returns a list of [accounts](https://docs.codat.io/banking-api#/schemas/Account) for a given company's connection.

[Accounts](https://docs.codat.io/banking-api#/schemas/Account) are financial accounts maintained by a bank or other financial institution.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.banking.CodatBanking;
import io.codat.banking.models.components.*;
import io.codat.banking.models.components.Security;
import io.codat.banking.models.operations.*;
import io.codat.banking.models.operations.ListAccountsRequest;
import io.codat.banking.models.operations.ListAccountsResponse;
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

            ListAccountsRequest req = ListAccountsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
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
        } catch (io.codat.banking.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [io.codat.banking.models.operations.ListAccountsRequest](../../models/operations/ListAccountsRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[Optional<? extends io.codat.banking.models.operations.ListAccountsResponse>](../../models/operations/ListAccountsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
