# Suppliers
(*suppliers()*)

## Overview

Suppliers

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

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=suppliers) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.AccountingAddressType;
import io.codat.sync.expenses.models.components.Items;
import io.codat.sync.expenses.models.components.Metadata;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.components.SupplementalData;
import io.codat.sync.expenses.models.components.Supplier;
import io.codat.sync.expenses.models.components.SupplierStatus;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.CreateSupplierRequest;
import io.codat.sync.expenses.models.operations.CreateSupplierResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreateSupplierRequest req = CreateSupplierRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .supplier(Supplier.builder()
                    .status(SupplierStatus.ACTIVE)
                    .addresses(java.util.List.of(
                        Items.builder()
                            .type(AccountingAddressType.BILLING)
                            .build()))
                    .contactName("<value>")
                    .defaultCurrency("<value>")
                    .emailAddress("Haylie78@hotmail.com")
                    .id("<id>")
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .phone("01224 658 999")
                    .registrationNumber("<value>")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "<value>")))))
                        .build())
                    .supplierName("<value>")
                    .taxNumber("<value>")
                    .build())
                .allowSyncOnPushComplete(false)
                .timeoutInMinutes(376844)
                .build();

            CreateSupplierResponse res = sdk.suppliers().create()
                .request(req)
                .call();

            if (res.createSupplierResponse().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [io.codat.sync.expenses.models.operations.CreateSupplierRequest](../../models/operations/CreateSupplierRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.CreateSupplierResponse>](../../models/operations/CreateSupplierResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## get

The *Get supplier* endpoint returns a single supplier for a given supplierId.

[Suppliers](https://docs.codat.io/sync-for-expenses-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=suppliers) for integrations that support getting a specific supplier.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-expenses-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.GetSupplierRequest;
import io.codat.sync.expenses.models.operations.GetSupplierResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
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
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [io.codat.sync.expenses.models.operations.GetSupplierRequest](../../models/operations/GetSupplierRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.GetSupplierResponse>](../../models/operations/GetSupplierResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## list

The *List suppliers* endpoint returns a list of [suppliers](https://docs.codat.io/sync-for-expenses-api#/schemas/Supplier) for a given company's connection.

[Suppliers](https://docs.codat.io/sync-for-expenses-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-expenses-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.ListSuppliersRequest;
import io.codat.sync.expenses.models.operations.ListSuppliersResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListSuppliersRequest req = ListSuppliersRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListSuppliersResponse res = sdk.suppliers().list()
                .request(req)
                .call();

            if (res.suppliers().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
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
| `request`                                                                                                        | [io.codat.sync.expenses.models.operations.ListSuppliersRequest](../../models/operations/ListSuppliersRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.ListSuppliersResponse>](../../models/operations/ListSuppliersResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## update

The *Update supplier* endpoint updates an existing [supplier](https://docs.codat.io/sync-for-expenses-api#/schemas/Supplier) for a given company's connection.

[Suppliers](https://docs.codat.io/sync-for-expenses-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update supplier model](https://docs.codat.io/sync-for-expenses-api#/operations/get-create-update-suppliers-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=suppliers) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.AccountingAddressType;
import io.codat.sync.expenses.models.components.Items;
import io.codat.sync.expenses.models.components.Metadata;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.components.SupplementalData;
import io.codat.sync.expenses.models.components.Supplier;
import io.codat.sync.expenses.models.components.SupplierStatus;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.UpdateSupplierRequest;
import io.codat.sync.expenses.models.operations.UpdateSupplierResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            UpdateSupplierRequest req = UpdateSupplierRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .supplierId("EILBDVJVNUAGVKRQ")
                .supplier(Supplier.builder()
                    .status(SupplierStatus.UNKNOWN)
                    .addresses(java.util.List.of(
                        Items.builder()
                            .type(AccountingAddressType.UNKNOWN)
                            .build()))
                    .contactName("<value>")
                    .defaultCurrency("<value>")
                    .emailAddress("Mellie62@yahoo.com")
                    .id("<id>")
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .phone("(877) 492-8687")
                    .registrationNumber("<value>")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "<value>")))))
                        .build())
                    .supplierName("<value>")
                    .taxNumber("<value>")
                    .build())
                .allowSyncOnPushComplete(false)
                .forceUpdate(false)
                .timeoutInMinutes(984008)
                .build();

            UpdateSupplierResponse res = sdk.suppliers().update()
                .request(req)
                .call();

            if (res.updateSupplierResponse().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [io.codat.sync.expenses.models.operations.UpdateSupplierRequest](../../models/operations/UpdateSupplierRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.UpdateSupplierResponse>](../../models/operations/UpdateSupplierResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
