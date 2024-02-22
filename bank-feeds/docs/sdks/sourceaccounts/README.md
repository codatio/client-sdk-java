# SourceAccounts
(*sourceAccounts()*)

## Overview

Source accounts act as a bridge to bank accounts in accounting software.

### Available Operations

* [create](#create) - Create source account
* [delete](#delete) - Delete source account
* [deleteCredentials](#deletecredentials) - Delete all source account credentials
* [generateCredentials](#generatecredentials) - Generate source account credentials
* [list](#list) - List source accounts
* [update](#update) - Update source account

## create

The _Create Source Account_ endpoint allows you to create a representation of a bank account within Codat's domain. The company can then map the source account to an existing or new target account in their accounting software.

#### Account mapping variability

The method of mapping the source account to the target account varies depending on the accounting package your company uses.

#### Mapping options:

1. **API Mapping**: Integrate the mapping journey directly into your application for a seamless user experience.
2. **Codat UI Mapping**: If you prefer a quicker setup, you can utilize Codat's provided user interface for mapping.
3. **Accounting Platform Mapping**: For some accounting software, the mapping process must be conducted within the software itself.

### Integration-specific behaviour

| Bank Feed Integration | API Mapping | Codat UI Mapping | Accounting Platform Mapping |
| --------------------- | ----------- | ---------------- | --------------------------- |
| Xero                  | ✅          | ✅               |                             |
| FreeAgent             | ✅          | ✅               |                             |
| Oracle NetSuite       | ✅          | ✅               |                             |
| Exact Online (NL)     | ✅          | ✅               |                             |
| QuickBooks Online     |             |                  | ✅                          |
| Sage                  |             |                  | ✅                          |

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.components.SourceAccount;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.CreateSourceAccountRequest;
import io.codat.bank_feeds.models.operations.CreateSourceAccountResponse;
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

            CreateSourceAccountRequest req = CreateSourceAccountRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .sourceAccount(SourceAccount.builder()
                    .id("<value>")
                    .accountName("<value>")
                    .accountNumber("<value>")
                    .accountType("<value>")
                    .balance(4865.89d)
                    .currency("USD")
                    .feedStartDate("2022-10-23T00:00:00Z")
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .sortCode("<value>")
                    .status("<value>")
                    .build())
                .build();

            CreateSourceAccountResponse res = sdk.sourceAccounts().create()
                .request(req)
                .call();

            if (res.sourceAccount().isPresent()) {
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

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [io.codat.bank_feeds.models.operations.CreateSourceAccountRequest](../../models/operations/CreateSourceAccountRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.CreateSourceAccountResponse>](../../models/operations/CreateSourceAccountResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## delete

The _Delete source account_ endpoint enables you to remove a source account.

Removing a source account will also remove any mapping between the source bank feed bank accounts and the target bankfeed bank account.


### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.DeleteSourceAccountRequest;
import io.codat.bank_feeds.models.operations.DeleteSourceAccountResponse;
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

            DeleteSourceAccountRequest req = DeleteSourceAccountRequest.builder()
                .accountId("7110701885")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            DeleteSourceAccountResponse res = sdk.sourceAccounts().delete()
                .request(req)
                .call();

            // handle response
        } catch (io.codat.bank_feeds.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [io.codat.bank_feeds.models.operations.DeleteSourceAccountRequest](../../models/operations/DeleteSourceAccountRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.DeleteSourceAccountResponse>](../../models/operations/DeleteSourceAccountResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## deleteCredentials

The _Delete Bank Account Credentials_ endpoint serves as a comprehensive mechanism for revoking all existing authorization credentials that a company employs to establish its Bank Feed connection.

In cases where multiple credential sets have been generated, a single API call to this endpoint revokes all of them.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.DeleteBankFeedCredentialsRequest;
import io.codat.bank_feeds.models.operations.DeleteBankFeedCredentialsResponse;
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

            DeleteBankFeedCredentialsRequest req = DeleteBankFeedCredentialsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            DeleteBankFeedCredentialsResponse res = sdk.sourceAccounts().deleteCredentials()
                .request(req)
                .call();

            // handle response
        } catch (io.codat.bank_feeds.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [io.codat.bank_feeds.models.operations.DeleteBankFeedCredentialsRequest](../../models/operations/DeleteBankFeedCredentialsRequest.md) | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.DeleteBankFeedCredentialsResponse>](../../models/operations/DeleteBankFeedCredentialsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## generateCredentials

﻿The _Generate Bank Account Credentials_ endpoint can be used to generate credentials for QuickBooks Online to use for authentication of the Bank Feed in their portal, each time this is used a new set of credentials will be generated.

The old credentials will still be valid until the revoke credentials endpoint is used, which will revoke all credentials associated to the data connection.


### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.GenerateCredentialsRequest;
import io.codat.bank_feeds.models.operations.GenerateCredentialsResponse;
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

            GenerateCredentialsRequest req = GenerateCredentialsRequest.builder()
                .requestBody("0xeDCfFBde9E".getBytes())
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GenerateCredentialsResponse res = sdk.sourceAccounts().generateCredentials()
                .request(req)
                .call();

            if (res.bankAccountCredentials().isPresent()) {
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

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [io.codat.bank_feeds.models.operations.GenerateCredentialsRequest](../../models/operations/GenerateCredentialsRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.GenerateCredentialsResponse>](../../models/operations/GenerateCredentialsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

﻿The _List source accounts_ endpoint returns a list of [source accounts](https://docs.codat.io/bank-feeds-api#/schemas/BankFeedAccount) for a given company's connection.

[source accounts](https://docs.codat.io/bank-feeds-api#/schemas/BankFeedAccount) are the bank's bank account within Codat's domain from which transactions are synced into the accounting platform.


### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.ListSourceAccountsRequest;
import io.codat.bank_feeds.models.operations.ListSourceAccountsResponse;
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

            ListSourceAccountsRequest req = ListSourceAccountsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            ListSourceAccountsResponse res = sdk.sourceAccounts().list()
                .request(req)
                .call();

            if (res.sourceAccounts().isPresent()) {
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
| `request`                                                                                                               | [io.codat.bank_feeds.models.operations.ListSourceAccountsRequest](../../models/operations/ListSourceAccountsRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.ListSourceAccountsResponse>](../../models/operations/ListSourceAccountsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## update

﻿The _Update source account_ endpoint updates a single source account for a single data connection connected to a single company.


### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.components.SourceAccount;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.UpdateSourceAccountRequest;
import io.codat.bank_feeds.models.operations.UpdateSourceAccountResponse;
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

            UpdateSourceAccountRequest req = UpdateSourceAccountRequest.builder()
                .accountId("EILBDVJVNUAGVKRQ")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .sourceAccount(SourceAccount.builder()
                    .id("<value>")
                    .accountName("<value>")
                    .accountNumber("<value>")
                    .accountType("<value>")
                    .balance(245.55d)
                    .currency("USD")
                    .feedStartDate("2022-10-23T00:00:00Z")
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .sortCode("<value>")
                    .status("<value>")
                    .build())
                .build();

            UpdateSourceAccountResponse res = sdk.sourceAccounts().update()
                .request(req)
                .call();

            if (res.sourceAccount().isPresent()) {
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

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [io.codat.bank_feeds.models.operations.UpdateSourceAccountRequest](../../models/operations/UpdateSourceAccountRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.UpdateSourceAccountResponse>](../../models/operations/UpdateSourceAccountResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
