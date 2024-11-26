# Reimbursements
(*reimbursements()*)

## Overview

Create and update transactions that represent your customers' repayable spend.

### Available Operations

* [create](#create) - Create reimbursable expense transaction
* [update](#update) - Update reimbursable expense transaction

## create

Use the *Create reimbursable expense* endpoint to submit an employee expense claim in the accounting platform for a given company's connection.

[Reimbursable expense requests](https://docs.codat.io/sync-for-expenses-api#/schemas/ReimbursableExpenseTransactionRequest) are reflected in the accounting software in the form of **Bills** against an employee (who exists as a supplier in the accounting platform).

### Supported Integrations
| Integration           | Supported |
|-----------------------|-----------|
| FreeAgent             | Yes       |
| QuickBooks Desktop    | Yes       |
| QuickBooks Online     | Yes       |
| Oracle NetSuite       | Yes       |

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.ApAccountRef;
import io.codat.sync.expenses.models.components.InvoiceTo;
import io.codat.sync.expenses.models.components.InvoiceToType;
import io.codat.sync.expenses.models.components.ItemRef;
import io.codat.sync.expenses.models.components.RecordRef;
import io.codat.sync.expenses.models.components.ReimbursableExpenseTransaction;
import io.codat.sync.expenses.models.components.ReimbursableExpenseTransactionLine;
import io.codat.sync.expenses.models.components.ReimbursementContactRef;
import io.codat.sync.expenses.models.components.TrackingRef;
import io.codat.sync.expenses.models.components.TrackingRefDataType;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionRequest;
import io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionResponse;
import java.lang.Exception;
import java.math.BigDecimal;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        CreateReimbursableExpenseTransactionRequest req = CreateReimbursableExpenseTransactionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .requestBody(List.of(
                    ReimbursableExpenseTransaction.builder()
                        .contactRef(ReimbursementContactRef.builder()
                            .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                            .build())
                        .currency("GBP")
                        .dueDate("2022-10-23T00:00:00Z")
                        .id("4d7c6929-7770-412b-91bb-44d3bc71d111")
                        .issueDate("2022-10-23T00:00:00Z")
                        .apAccountRef(ApAccountRef.builder()
                            .id("8000004C-1724173136")
                            .build())
                        .lines(List.of(
                            ReimbursableExpenseTransactionLine.builder()
                                .netAmount(new BigDecimal("100"))
                                .accountRef(RecordRef.builder()
                                    .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                                    .build())
                                .description("2-night hotel stay")
                                .invoiceTo(InvoiceTo.builder()
                                    .id("80000002-1674552702")
                                    .type(InvoiceToType.CUSTOMER)
                                    .build())
                                .itemRef(ItemRef.builder()
                                    .id("80000002-1675158984")
                                    .build())
                                .taxAmount(new BigDecimal("20"))
                                .taxRateRef(RecordRef.builder()
                                    .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                                    .build())
                                .trackingRefs(List.of(
                                    TrackingRef.builder()
                                        .dataType(TrackingRefDataType.TRACKING_CATEGORIES)
                                        .id("e9a1b63d-9ff0-40e7-8038-016354b987e6")
                                        .build()))
                                .build()))
                        .notes("APPLE.COM/BILL - 09001077498 - Card Ending: 4590")
                        .build()))
                .build();

        CreateReimbursableExpenseTransactionResponse res = sdk.reimbursements().create()
                .request(req)
                .call();

        if (res.createReimbursableExpenseResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [CreateReimbursableExpenseTransactionRequest](../../models/operations/CreateReimbursableExpenseTransactionRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[CreateReimbursableExpenseTransactionResponse](../../models/operations/CreateReimbursableExpenseTransactionResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## update

The *Update reimbursable expense* endpoint updates an existing employee expense claim in the accounting platform for a given company's connection. 

Updating an existing [reimbursable expense transaction](https://docs.codat.io/sync-for-expenses-api#/schemas/UpdateReimbursableExpenseTransactionRequest) will update the existing **bill** against an employee (who exists as a supplier in the accounting software).

### Supported Integrations
| Integration           | Supported |
|-----------------------|-----------|
| FreeAgent             | Yes       |
| QuickBooks Online     | Yes       |
| Oracle NetSuite       | Yes       |

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.ApAccountRef;
import io.codat.sync.expenses.models.components.InvoiceTo;
import io.codat.sync.expenses.models.components.InvoiceToType;
import io.codat.sync.expenses.models.components.ItemRef;
import io.codat.sync.expenses.models.components.RecordRef;
import io.codat.sync.expenses.models.components.ReimbursableExpenseTransactionLine;
import io.codat.sync.expenses.models.components.ReimbursementContactRef;
import io.codat.sync.expenses.models.components.TrackingRef;
import io.codat.sync.expenses.models.components.TrackingRefDataType;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionRequest;
import io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionResponse;
import java.lang.Exception;
import java.math.BigDecimal;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        UpdateReimbursableExpenseTransactionRequest req = UpdateReimbursableExpenseTransactionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .transactionId("336694d8-2dca-4cb5-a28d-3ccb83e55eee")
                .updateReimbursableExpenseTransactionRequest(io.codat.sync.expenses.models.components.UpdateReimbursableExpenseTransactionRequest.builder()
                    .contactRef(ReimbursementContactRef.builder()
                        .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                        .build())
                    .currency("GBP")
                    .dueDate("2022-10-23T00:00:00Z")
                    .issueDate("2022-10-23T00:00:00Z")
                    .apAccountRef(ApAccountRef.builder()
                        .id("8000004C-1724173136")
                        .build())
                    .lines(List.of(
                        ReimbursableExpenseTransactionLine.builder()
                            .netAmount(new BigDecimal("100"))
                            .accountRef(RecordRef.builder()
                                .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                                .build())
                            .description("2-night hotel stay")
                            .invoiceTo(InvoiceTo.builder()
                                .id("80000002-1674552702")
                                .type(InvoiceToType.CUSTOMER)
                                .build())
                            .itemRef(ItemRef.builder()
                                .id("80000002-1675158984")
                                .build())
                            .taxAmount(new BigDecimal("20"))
                            .taxRateRef(RecordRef.builder()
                                .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                                .build())
                            .trackingRefs(List.of(
                                TrackingRef.builder()
                                    .dataType(TrackingRefDataType.TRACKING_CATEGORIES)
                                    .id("e9a1b63d-9ff0-40e7-8038-016354b987e6")
                                    .build()))
                            .build()))
                    .notes("APPLE.COM/BILL - 09001077498 - Card Ending: 4590")
                    .build())
                .build();

        UpdateReimbursableExpenseTransactionResponse res = sdk.reimbursements().update()
                .request(req)
                .call();

        if (res.createReimbursableExpenseResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [UpdateReimbursableExpenseTransactionRequest](../../models/operations/UpdateReimbursableExpenseTransactionRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[UpdateReimbursableExpenseTransactionResponse](../../models/operations/UpdateReimbursableExpenseTransactionResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |