# AccountMapping
(*accountMapping()*)

## Overview

Extra functionality for building an account management UI.

### Available Operations

* [create](#create) - Create bank feed account mapping
* [get](#get) - List bank feed account mappings

## create

﻿The *Create bank account mapping* endpoint creates a new mapping between a source bank account and a potential account in the accounting software (target account).

A bank feed account mapping is a specified link between the source account (provided by the Codat user) and the target account (the end users account in the underlying platform).

To find valid target account options, first call list bank feed account mappings.

This endpoint is only needed if building an account management UI.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.BankFeedAccountMapping;
import io.codat.bank_feeds.models.errors.SDKError;
import io.codat.bank_feeds.models.operations.CreateBankAccountMappingRequest;
import io.codat.bank_feeds.models.operations.CreateBankAccountMappingResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreateBankAccountMappingRequest req = CreateBankAccountMappingRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .bankFeedAccountMapping(BankFeedAccountMapping.builder()
                    .sourceAccountId("<value>")
                    .build())
                .build();

            CreateBankAccountMappingResponse res = sdk.accountMapping().create()
                .request(req)
                .call();

            if (res.bankFeedAccountMappingResponse().isPresent()) {
                // handle response
            }
        } catch (io.codat.bank_feeds.models.errors.ErrorMessage e) {
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

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateBankAccountMappingRequest](../../models/operations/CreateBankAccountMappingRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateBankAccountMappingResponse](../../models/operations/CreateBankAccountMappingResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## get

﻿The *List bank account mappings* endpoint returns information about a source bank account and any current or potential target mapping accounts.

A bank feed account mapping is a specified link between the source account (provided by the Codat user) and the target account (the end users account in the underlying platform).

This endpoint is only needed if building an account management UI.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.errors.SDKError;
import io.codat.bank_feeds.models.operations.GetBankAccountMappingRequest;
import io.codat.bank_feeds.models.operations.GetBankAccountMappingResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetBankAccountMappingRequest req = GetBankAccountMappingRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetBankAccountMappingResponse res = sdk.accountMapping().get()
                .request(req)
                .call();

            if (res.bankFeedMapping().isPresent()) {
                // handle response
            }
        } catch (io.codat.bank_feeds.models.errors.ErrorMessage e) {
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

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetBankAccountMappingRequest](../../models/operations/GetBankAccountMappingRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetBankAccountMappingResponse](../../models/operations/GetBankAccountMappingResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |
