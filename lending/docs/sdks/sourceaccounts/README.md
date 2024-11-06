# SourceAccounts
(*loanWriteback().sourceAccounts()*)

## Overview

### Available Operations

* [create](#create) - Create source account
* [createMapping](#createmapping) - Create bank feed account mapping

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

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.CreateSourceAccountRequest;
import io.codat.lending.models.operations.CreateSourceAccountRequestBody;
import io.codat.lending.models.operations.CreateSourceAccountResponse;
import io.codat.lending.models.shared.AccountInfo;
import io.codat.lending.models.shared.RoutingInfo;
import io.codat.lending.models.shared.Security;
import io.codat.lending.models.shared.SourceAccountV2;
import io.codat.lending.models.shared.SourceAccountV2AccountType;
import io.codat.lending.models.shared.SourceAccountV2Status;
import io.codat.lending.models.shared.Type;
import java.lang.Exception;
import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        CreateSourceAccountRequest req = CreateSourceAccountRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .requestBody(CreateSourceAccountRequestBody.of(SourceAccountV2.builder()
                    .accountName("<value>")
                    .accountNumber("<value>")
                    .accountType(SourceAccountV2AccountType.LOAN)
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

        CreateSourceAccountResponse res = sdk.loanWriteback().sourceAccounts().create()
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

## createMapping

﻿The *Create bank account mapping* endpoint creates a new mapping between a source bank account and a potential account in the accounting software (target account).

A bank feed account mapping is a specified link between the source account (provided by the Codat user) and the target account (the end user's account in the underlying software).

To find valid target account options, first call the [List bank feed account mappings](https://docs.codat.io//bank-feeds-api#/operations/get-bank-account-mapping) endpoint.

> **For custom builds only**
>
> Only use this endpoint if you are building your own account management UI.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.CreateBankAccountMappingRequest;
import io.codat.lending.models.operations.CreateBankAccountMappingResponse;
import io.codat.lending.models.shared.BankFeedBankAccountMapping;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        CreateBankAccountMappingRequest req = CreateBankAccountMappingRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .bankFeedBankAccountMapping(BankFeedBankAccountMapping.builder()
                    .sourceAccountId("<id>")
                    .targetAccountId("account-081")
                    .build())
                .build();

        CreateBankAccountMappingResponse res = sdk.loanWriteback().sourceAccounts().createMapping()
                .request(req)
                .call();

        if (res.bankFeedBankAccountMappingResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateBankAccountMappingRequest](../../models/operations/CreateBankAccountMappingRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateBankAccountMappingResponse](../../models/operations/CreateBankAccountMappingResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |