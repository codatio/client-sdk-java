# Bills
(*bills()*)

## Overview

Bills

### Available Operations

* [create](#create) - Create bill
* [list](#list) - List bills

## create

The *Create bill* endpoint creates a new [bill](https://docs.codat.io/sync-for-payables-api#/schemas/Bill) for a given company's connection.

[Bills](https://docs.codat.io/sync-for-payables-api#/schemas/Bill) are invoices that represent the SMB's financial obligations to their supplier for a purchase of goods or services.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.components.*;
import io.codat.sync.payables.models.components.BillAccountRef;
import io.codat.sync.payables.models.components.BillLineItem;
import io.codat.sync.payables.models.components.BillPrototype;
import io.codat.sync.payables.models.components.BillStatus;
import io.codat.sync.payables.models.components.BillTaxRateRef;
import io.codat.sync.payables.models.components.Security;
import io.codat.sync.payables.models.components.SupplierRef;
import io.codat.sync.payables.models.operations.*;
import io.codat.sync.payables.models.operations.CreateBillRequest;
import io.codat.sync.payables.models.operations.CreateBillResponse;
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

            CreateBillRequest req = CreateBillRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .idempotencyKey("<value>")
                .billPrototype(BillPrototype.builder()
                    .currency("USD")
                    .dueDate("2022-10-23T00:00:00Z")
                    .issueDate("2022-10-23T00:00:00Z")
                    .status(BillStatus.OPEN)
                    .supplierRef(SupplierRef.builder()
                            .id("<value>")
                            .supplierName("<value>")
                            .build())
                    .amountDue(8592.13d)
                    .currencyRate(4174.58d)
                    .lineItems(java.util.List.of(
                        BillLineItem.builder()
                            .accountRef(BillAccountRef.builder()
                                    .id("<id>")
                                    .build())
                            .quantity(7865.46d)
                            .taxRateRef(BillTaxRateRef.builder()
                                    .id("<id>")
                                    .build())
                            .unitAmount(690.25d)
                            .build()))
                    .reference("<value>")
                    .totalAmount(9967.06d)
                    .build())
                .build();

            CreateBillResponse res = sdk.bills().create()
                .request(req)
                .call();

            if (res.bill().isPresent()) {
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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [io.codat.sync.payables.models.operations.CreateBillRequest](../../models/operations/CreateBillRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[Optional<? extends io.codat.sync.payables.models.operations.CreateBillResponse>](../../models/operations/CreateBillResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List bills* endpoint returns a list of [bills](https://docs.codat.io/sync-for-payables-api#/schemas/Bill) for a given company's connection.

[Bills](https://docs.codat.io/sync-for-payables-api#/schemas/Bill) are invoices that represent the SMB's financial obligations to their supplier for a purchase of goods or services.

By default, the endpoint will return all bills with a status of 'Open' & 'PartiallyPaid' to show all oustanding bills.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.components.*;
import io.codat.sync.payables.models.components.Security;
import io.codat.sync.payables.models.operations.*;
import io.codat.sync.payables.models.operations.ListBillsRequest;
import io.codat.sync.payables.models.operations.ListBillsResponse;
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

            ListBillsRequest req = ListBillsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .query("<value>")
                .build();

            ListBillsResponse res = sdk.bills().list()
                .request(req)
                .call();

            if (res.bills().isPresent()) {
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

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [io.codat.sync.payables.models.operations.ListBillsRequest](../../models/operations/ListBillsRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[Optional<? extends io.codat.sync.payables.models.operations.ListBillsResponse>](../../models/operations/ListBillsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
