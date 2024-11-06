# SourceAccounts
(*sourceAccounts()*)

## Overview

Provide and manage lists of source bank accounts.

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

The method of mapping the source account to the target account varies depending on the accounting software your company uses.

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

> ### Versioning
> If you are integrating the Bank Feeds API with Codat after August 1, 2024, please use the v2 version of the API, as detailed in the schema below. For integrations completed before August 1, 2024, select the v1 version from the schema dropdown below.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.AccountInfo;
import io.codat.bank_feeds.models.components.AccountType;
import io.codat.bank_feeds.models.components.RoutingInfo;
import io.codat.bank_feeds.models.components.SourceAccountV2;
import io.codat.bank_feeds.models.components.SourceAccountV2Status;
import io.codat.bank_feeds.models.components.Type;
import io.codat.bank_feeds.models.errors.ErrorMessage;
import io.codat.bank_feeds.models.operations.CreateSourceAccountRequest;
import io.codat.bank_feeds.models.operations.CreateSourceAccountRequestBody;
import io.codat.bank_feeds.models.operations.CreateSourceAccountResponse;
import java.lang.Exception;
import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        CreateSourceAccountRequest req = CreateSourceAccountRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .requestBody(CreateSourceAccountRequestBody.of(SourceAccountV2.builder()
                    .accountName("<value>")
                    .accountNumber("<value>")
                    .accountType(AccountType.LOAN)
                    .balance(new BigDecimal("1343.65"))
                    .currency("GBP")
                    .id("<id>")
                    .accountInfo(AccountInfo.builder()
                        .accountOpenDate("2023-05-23T00:00:00Z")
                        .availableBalance(new BigDecimal("400"))
                        .description("account description 2")
                        .nickname("account 1290")
                        .build())
                    .feedStartDate("2024-05-01T00:00:00Z")
                    .modifiedDate("2024-08-02T00:00:00.000Z")
                    .routingInfo(RoutingInfo.builder()
                        .bankCode("21001088")
                        .type(Type.BANKCODE)
                        .build())
                    .status(SourceAccountV2Status.PENDING)
                    .build()))
                .build();

        CreateSourceAccountResponse res = sdk.sourceAccounts().create()
                .request(req)
                .call();

        if (res.oneOf().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateSourceAccountRequest](../../models/operations/CreateSourceAccountRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateSourceAccountResponse](../../models/operations/CreateSourceAccountResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## delete

The _Delete source account_ endpoint enables you to remove a source account.

Removing a source account will also remove any mapping between the source bank feed bank accounts and the target bankfeed bank account.


### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.errors.ErrorMessage;
import io.codat.bank_feeds.models.operations.DeleteSourceAccountRequest;
import io.codat.bank_feeds.models.operations.DeleteSourceAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

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
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [DeleteSourceAccountRequest](../../models/operations/DeleteSourceAccountRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[DeleteSourceAccountResponse](../../models/operations/DeleteSourceAccountResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## deleteCredentials

The _Delete Bank Account Credentials_ endpoint serves as a comprehensive mechanism for revoking all existing authorization credentials that a company employs to establish its Bank Feed connection.

In cases where multiple credential sets have been generated, a single API call to this endpoint revokes all of them.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.errors.ErrorMessage;
import io.codat.bank_feeds.models.operations.DeleteBankFeedCredentialsRequest;
import io.codat.bank_feeds.models.operations.DeleteBankFeedCredentialsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

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
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [DeleteBankFeedCredentialsRequest](../../models/operations/DeleteBankFeedCredentialsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[DeleteBankFeedCredentialsResponse](../../models/operations/DeleteBankFeedCredentialsResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## generateCredentials

﻿The _Generate bank account credentials_ endpoint can be used to generate credentials for QuickBooks Online to authenticate the Bank Feed in the QBO portal. Each time this endpoint is called, a new set of credentials will be generated.

The old credentials will still be valid until the revoke credentials endpoint is used, which will revoke all credentials associated to the data connection.

> **For QuickBooks Online only**
>
> Only call this endpoint when onboarding SMBs that use  QuickBooks Online.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.errors.ErrorMessage;
import io.codat.bank_feeds.models.operations.GenerateCredentialsRequest;
import io.codat.bank_feeds.models.operations.GenerateCredentialsResponse;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        GenerateCredentialsRequest req = GenerateCredentialsRequest.builder()
                .requestBody("0xeCFd9fD7b9".getBytes(StandardCharsets.UTF_8))
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

        GenerateCredentialsResponse res = sdk.sourceAccounts().generateCredentials()
                .request(req)
                .call();

        if (res.bankAccountCredentials().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GenerateCredentialsRequest](../../models/operations/GenerateCredentialsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GenerateCredentialsResponse](../../models/operations/GenerateCredentialsResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## list

﻿The _List source accounts_ endpoint returns a list of [source accounts](https://docs.codat.io/bank-feeds-api#/schemas/BankFeedAccount) for a given company's connection.

[Source accounts](https://docs.codat.io/bank-feeds-api#/schemas/BankFeedAccount) are the bank's bank account within Codat's domain from which transactions are synced into the accounting platform.

> ### Versioning
> If you are integrating the Bank Feeds API with Codat after August 1, 2024, please use the v2 version of the API, as detailed in the schema below. For integrations completed before August 1, 2024, select the v1 version from the schema dropdown below.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.errors.ErrorMessage;
import io.codat.bank_feeds.models.operations.ListSourceAccountsRequest;
import io.codat.bank_feeds.models.operations.ListSourceAccountsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

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

        if (res.oneOf().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListSourceAccountsRequest](../../models/operations/ListSourceAccountsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListSourceAccountsResponse](../../models/operations/ListSourceAccountsResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## update

﻿The _Update source account_ endpoint updates a single source account for a single data connection connected to a single company.

### Tips and pitfalls

* This endpoint only updates the `accountName` field.
* Updates made here apply exclusively to source accounts and will not affect target accounts in the accounting software.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.SourceAccount;
import io.codat.bank_feeds.models.components.Status;
import io.codat.bank_feeds.models.errors.ErrorMessage;
import io.codat.bank_feeds.models.operations.UpdateSourceAccountRequest;
import io.codat.bank_feeds.models.operations.UpdateSourceAccountResponse;
import java.lang.Exception;
import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        UpdateSourceAccountRequest req = UpdateSourceAccountRequest.builder()
                .accountId("7110701885")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .sourceAccount(SourceAccount.builder()
                    .id("<id>")
                    .accountName("account-081")
                    .accountNumber("12345670")
                    .accountType("Credit")
                    .balance(new BigDecimal("99.99"))
                    .currency("GBP")
                    .feedStartDate("2022-10-23T00:00:00Z")
                    .modifiedDate("2023-01-09T14:14:14.1057478Z")
                    .sortCode("123456")
                    .status(Status.PENDING)
                    .build())
                .build();

        UpdateSourceAccountResponse res = sdk.sourceAccounts().update()
                .request(req)
                .call();

        if (res.sourceAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateSourceAccountRequest](../../models/operations/UpdateSourceAccountRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateSourceAccountResponse](../../models/operations/UpdateSourceAccountResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |