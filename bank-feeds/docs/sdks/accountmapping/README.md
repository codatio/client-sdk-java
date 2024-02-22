# AccountMapping
(*accountMapping()*)

## Overview

Bank feed bank account mapping.

### Available Operations

* [create](#create) - Create bank feed account mapping
* [get](#get) - List bank feed account mappings

## create

﻿The *Create bank account mapping* endpoint creates a new mapping between a source bank account and a potential account in the accounting platform (target account).

A bank feed account mapping is a specified link between the source account (provided by the Codat user) and the target account (the end users account in the underlying platform).

To find valid target account options, first call list bank feed account mappings.

This endpoint is only needed if building an account management UI.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.components.Zero;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.CreateBankAccountMappingRequest;
import io.codat.bank_feeds.models.operations.CreateBankAccountMappingResponse;
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

            CreateBankAccountMappingRequest req = CreateBankAccountMappingRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .zero(Zero.builder()
                    .feedStartDate("2022-10-23T00:00:00Z")
                    .sourceAccountId("<value>")
                    .targetAccountId("<value>")
                    .build())
                .build();

            CreateBankAccountMappingResponse res = sdk.accountMapping().create()
                .request(req)
                .call();

            if (res.bankFeedAccountMappingResponse().isPresent()) {
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

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [io.codat.bank_feeds.models.operations.CreateBankAccountMappingRequest](../../models/operations/CreateBankAccountMappingRequest.md) | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.CreateBankAccountMappingResponse>](../../models/operations/CreateBankAccountMappingResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## get

﻿The *List bank account mappings* endpoint returns information about a source bank account and any current or potential target mapping accounts.

A bank feed account mapping is a specified link between the source account (provided by the Codat user) and the target account (the end users account in the underlying platform).

This endpoint is only needed if building an account management UI.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.GetBankAccountMappingRequest;
import io.codat.bank_feeds.models.operations.GetBankAccountMappingResponse;
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
        } catch (io.codat.bank_feeds.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [io.codat.bank_feeds.models.operations.GetBankAccountMappingRequest](../../models/operations/GetBankAccountMappingRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.GetBankAccountMappingResponse>](../../models/operations/GetBankAccountMappingResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
