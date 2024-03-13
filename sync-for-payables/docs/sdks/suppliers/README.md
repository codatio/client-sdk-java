# Suppliers
(*suppliers()*)

## Overview

Suppliers

### Available Operations

* [list](#list) - List suppliers

## list

The *List suppliers* endpoint returns a list of [suppliers](https://docs.codat.io/sync-for-payables-api#/schemas/Supplier) for a given company's connection.

[Suppliers](https://docs.codat.io/sync-for-payables-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.

By default, this endpoint returns a list of active suppliers. You can use [querying](https://docs.codat.io/using-the-api/querying) to change that. 

For example, to retrieve only suppliers associated with unpaid bills (i.e. `balance>0`) or suppliers created within the specified number of days (e.g. `sourceModifiedDate>2023-12-15T00:00:00.000Z`), query the endpoint as follows: `/payables/suppliers?query=sourceModifiedDate>2023-12-15T00:00:00.000Z||balance>0`.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.components.*;
import io.codat.sync.payables.models.components.Security;
import io.codat.sync.payables.models.operations.*;
import io.codat.sync.payables.models.operations.ListSuppliersRequest;
import io.codat.sync.payables.models.operations.ListSuppliersResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncPayables sdk = CodatSyncPayables.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListSuppliersRequest req = ListSuppliersRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .continuationToken("continuationToken=eyJwYWdlIjoyLCJwYWdlU2l6ZSI6MTAwLCJwYWdlQ291bnQiOjExfQ==")
                .query("<value>")
                .build();

            ListSuppliersResponse res = sdk.suppliers().list()
                .request(req)
                .call();

            if (res.suppliers().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payables.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [io.codat.sync.payables.models.operations.ListSuppliersRequest](../../models/operations/ListSuppliersRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[Optional<? extends io.codat.sync.payables.models.operations.ListSuppliersResponse>](../../models/operations/ListSuppliersResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
