# Suppliers
(*suppliers()*)

## Overview

Get, create, and update Suppliers.

### Available Operations

* [create](#create) - Create supplier
* [list](#list) - List suppliers

## create

The *Create supplier* endpoint creates a new [supplier](https://docs.codat.io/sync-for-payables-api#/schemas/Supplier) for a given company's connection.

[Suppliers](https://docs.codat.io/sync-for-payables-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.


### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.components.SupplierPrototype;
import io.codat.sync.payables.models.components.SupplierStatus;
import io.codat.sync.payables.models.errors.SDKError;
import io.codat.sync.payables.models.operations.CreateSupplierRequest;
import io.codat.sync.payables.models.operations.CreateSupplierResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncPayables sdk = CodatSyncPayables.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreateSupplierRequest req = CreateSupplierRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .supplierPrototype(SupplierPrototype.builder()
                    .status(SupplierStatus.ACTIVE)
                    .supplierName("<value>")
                    .phone("(877) 492-8687")
                    .build())
                .build();

            CreateSupplierResponse res = sdk.suppliers().create()
                .request(req)
                .call();

            if (res.supplier().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payables.models.errors.ErrorMessage e) {
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

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateSupplierRequest](../../models/operations/CreateSupplierRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateSupplierResponse](../../models/operations/CreateSupplierResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## list

The *List suppliers* endpoint returns a list of [suppliers](https://docs.codat.io/sync-for-payables-api#/schemas/Supplier) for a given company's connection.

[Suppliers](https://docs.codat.io/sync-for-payables-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.

By default, this endpoint returns a list of active and archived suppliers. You can use [querying](https://docs.codat.io/using-the-api/querying) to change that. 

For example, to retrieve only active suppliers (i.e. `status=Active`) or suppliers created within the specified number of days (e.g. `sourceModifiedDate>2023-12-15T00:00:00.000Z`), query the endpoint as follows: `/payables/suppliers?query=sourceModifiedDate>2023-12-15T00:00:00.000Z&&status=Active`.For example, to retrieve active suppliers modified after a particular date use `query=sourceModifiedDate>2023-12-15T00:00:00.000Z&&status=Active`.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.errors.SDKError;
import io.codat.sync.payables.models.operations.ListSuppliersRequest;
import io.codat.sync.payables.models.operations.ListSuppliersResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncPayables sdk = CodatSyncPayables.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListSuppliersRequest req = ListSuppliersRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .continuationToken("continuationToken=eyJwYWdlIjoyLCJwYWdlU2l6ZSI6MTAwLCJwYWdlQ291bnQiOjExfQ==")
                .build();

            ListSuppliersResponse res = sdk.suppliers().list()
                .request(req)
                .call();

            if (res.suppliers().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payables.models.errors.ErrorMessage e) {
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
| `request`                                                               | [ListSuppliersRequest](../../models/operations/ListSuppliersRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListSuppliersResponse](../../models/operations/ListSuppliersResponse.md)**

### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/ErrorMessage          | 400,401,402,403,404,409,429,500,503 | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |
