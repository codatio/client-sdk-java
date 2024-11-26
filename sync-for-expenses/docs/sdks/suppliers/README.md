# Suppliers
(*suppliers()*)

## Overview

Get, create, and update suppliers.

### Available Operations

* [create](#create) - Create supplier
* [get](#get) - Get supplier
* [list](#list) - List suppliers
* [update](#update) - Update supplier

## create

The *Create supplier* endpoint creates a new [supplier](https://docs.codat.io/sync-for-expenses-api#/schemas/Supplier) for a given company's connection.

[Suppliers](https://docs.codat.io/sync-for-expenses-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update supplier model](https://docs.codat.io/sync-for-expenses-api#/operations/get-create-update-suppliers-model).


### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.AccountingAddressType;
import io.codat.sync.expenses.models.components.Items;
import io.codat.sync.expenses.models.components.Metadata;
import io.codat.sync.expenses.models.components.SupplementalData;
import io.codat.sync.expenses.models.components.Supplier;
import io.codat.sync.expenses.models.components.SupplierStatus;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.CreateSupplierRequest;
import io.codat.sync.expenses.models.operations.CreateSupplierResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        CreateSupplierRequest req = CreateSupplierRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .supplier(Supplier.builder()
                    .status(SupplierStatus.ACTIVE)
                    .addresses(List.of(
                        Items.builder()
                            .type(AccountingAddressType.BILLING)
                            .city("Bakersfield")
                            .country("USA")
                            .line1("Unit 51")
                            .line2("Bakersfield Industrial Estate")
                            .region("California")
                            .build()))
                    .contactName("Kelly's Industrial Supplies")
                    .defaultCurrency("string")
                    .emailAddress("sales@kellysupplies.com")
                    .id("C520FFD4-F6F6-4FC2-A6D2-5D7088B2B14F")
                    .metadata(Metadata.builder()
                        .isDeleted(true)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .phone("07999 999999")
                    .registrationNumber("string")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .supplementalData(SupplementalData.builder()
                        .content(Map.ofEntries(
                            Map.entry("property1", Map.ofEntries(
                                Map.entry("property1", Optional.empty()),
                                Map.entry("property2", Optional.empty()))),
                            Map.entry("property2", Map.ofEntries(
                                Map.entry("property1", Optional.empty()),
                                Map.entry("property2", Optional.empty())))))
                        .build())
                    .supplierName("Kelly's Industrial Supplies")
                    .taxNumber("string")
                    .build())
                .build();

        CreateSupplierResponse res = sdk.suppliers().create()
                .request(req)
                .call();

        if (res.createSupplierResponse().isPresent()) {
            // handle response
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

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## get

The *Get supplier* endpoint returns a single supplier for a given supplierId.

[Suppliers](https://docs.codat.io/sync-for-expenses-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-expenses-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.GetSupplierRequest;
import io.codat.sync.expenses.models.operations.GetSupplierResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        GetSupplierRequest req = GetSupplierRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .supplierId("7110701885")
                .build();

        GetSupplierResponse res = sdk.suppliers().get()
                .request(req)
                .call();

        if (res.supplier().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetSupplierRequest](../../models/operations/GetSupplierRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetSupplierResponse](../../models/operations/GetSupplierResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 401, 402, 403, 404, 409, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## list

The *List suppliers* endpoint returns a list of [suppliers](https://docs.codat.io/sync-for-expenses-api#/schemas/Supplier) for a given company's connection.

[Suppliers](https://docs.codat.io/sync-for-expenses-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-expenses-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.ListSuppliersRequest;
import io.codat.sync.expenses.models.operations.ListSuppliersResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        ListSuppliersRequest req = ListSuppliersRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        ListSuppliersResponse res = sdk.suppliers().list()
                .request(req)
                .call();

        if (res.suppliers().isPresent()) {
            // handle response
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

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/ErrorMessage                  | 400, 401, 402, 403, 404, 409, 429, 500, 503 | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |

## update

The *Update supplier* endpoint updates an existing [supplier](https://docs.codat.io/sync-for-expenses-api#/schemas/Supplier) for a given company's connection.

[Suppliers](https://docs.codat.io/sync-for-expenses-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update supplier model](https://docs.codat.io/sync-for-expenses-api#/operations/get-create-update-suppliers-model).

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.AccountingAddressType;
import io.codat.sync.expenses.models.components.Items;
import io.codat.sync.expenses.models.components.Metadata;
import io.codat.sync.expenses.models.components.SupplementalData;
import io.codat.sync.expenses.models.components.Supplier;
import io.codat.sync.expenses.models.components.SupplierStatus;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.UpdateSupplierRequest;
import io.codat.sync.expenses.models.operations.UpdateSupplierResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        UpdateSupplierRequest req = UpdateSupplierRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .supplierId("EILBDVJVNUAGVKRQ")
                .supplier(Supplier.builder()
                    .status(SupplierStatus.ACTIVE)
                    .addresses(List.of(
                        Items.builder()
                            .type(AccountingAddressType.BILLING)
                            .city("Bakersfield")
                            .country("USA")
                            .line1("Unit 51")
                            .line2("Bakersfield Industrial Estate")
                            .region("California")
                            .build()))
                    .contactName("Kelly's Industrial Supplies")
                    .defaultCurrency("string")
                    .emailAddress("sales@kellysupplies.com")
                    .id("C520FFD4-F6F6-4FC2-A6D2-5D7088B2B14F")
                    .metadata(Metadata.builder()
                        .isDeleted(true)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .phone("07999 999999")
                    .registrationNumber("string")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .supplementalData(SupplementalData.builder()
                        .content(Map.ofEntries(
                            Map.entry("property1", Map.ofEntries(
                                Map.entry("property1", Optional.empty()),
                                Map.entry("property2", Optional.empty()))),
                            Map.entry("property2", Map.ofEntries(
                                Map.entry("property1", Optional.empty()),
                                Map.entry("property2", Optional.empty())))))
                        .build())
                    .supplierName("Kelly's Industrial Supplies")
                    .taxNumber("string")
                    .build())
                .build();

        UpdateSupplierResponse res = sdk.suppliers().update()
                .request(req)
                .call();

        if (res.updateSupplierResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateSupplierRequest](../../models/operations/UpdateSupplierRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateSupplierResponse](../../models/operations/UpdateSupplierResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |