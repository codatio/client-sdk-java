# Sync
(*sync()*)

## Overview

Monitor the status of data syncs.

### Available Operations

* [getLastSuccessfulSync](#getlastsuccessfulsync) - Get last successful sync

## getLastSuccessfulSync

Use the _Get last successful sync_ endpoint to obtain the status information for the company's [most recent successful sync](https://docs.codat.io/bank-feeds-api#/schemas/CompanySyncStatus). 

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.errors.SDKError;
import io.codat.bank_feeds.models.operations.GetLastSuccessfulRequest;
import io.codat.bank_feeds.models.operations.GetLastSuccessfulResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetLastSuccessfulRequest req = GetLastSuccessfulRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetLastSuccessfulResponse res = sdk.sync().getLastSuccessfulSync()
                .request(req)
                .call();

            if (res.companySyncStatus().isPresent()) {
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

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetLastSuccessfulRequest](../../models/operations/GetLastSuccessfulRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetLastSuccessfulResponse](../../models/operations/GetLastSuccessfulResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |
