# Adjustments
(*adjustments()*)

## Overview

Create transactions that represent your adjustments to your customers' spend.

### Available Operations

* [create](#create) - Create adjustment transaction

## create

Use the *Create adjustment expense* endpoint to create an [adjustment](https://docs.codat.io/sync-for-expenses-api#/schemas/AdjustmentTransactionRequest) in the accounting software for a given company's connection. 

Adjustments represent write-offs and transaction alterations, such as foreign exchange adjustments, in the form of a journal entry. 

### Supported Integrations

| Integration           | Supported |
|-----------------------|-----------|
| QuickBooks Desktop    | Yes       |

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.AdjustmentTransactionLine;
import io.codat.sync.expenses.models.components.AdjustmentTransactionRequest;
import io.codat.sync.expenses.models.components.InvoiceTo;
import io.codat.sync.expenses.models.components.InvoiceToType;
import io.codat.sync.expenses.models.components.RecordRef;
import io.codat.sync.expenses.models.components.TrackingRefAdjustmentTransaction;
import io.codat.sync.expenses.models.components.TrackingRefAdjustmentTransactionDataType;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.CreateAdjustmentTransactionRequest;
import io.codat.sync.expenses.models.operations.CreateAdjustmentTransactionResponse;
import java.lang.Exception;
import java.math.BigDecimal;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        CreateAdjustmentTransactionRequest req = CreateAdjustmentTransactionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .requestBody(List.of(
                    AdjustmentTransactionRequest.builder()
                        .currency("Tenge")
                        .date("2022-10-23T00:00:00Z")
                        .id("621cf021-cd9c-4f54-a033-15211a509a30")
                        .lines(List.of(
                            AdjustmentTransactionLine.builder()
                                .accountRef(RecordRef.builder()
                                    .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                                    .build())
                                .amount(new BigDecimal("50"))
                                .description("APPLE.COM/BILL - 09001077498 - Card Ending: 4590")
                                .invoiceTo(InvoiceTo.builder()
                                    .id("80000002-1674552702")
                                    .type(InvoiceToType.CUSTOMER)
                                    .build())
                                .trackingRefs(List.of(
                                    TrackingRefAdjustmentTransaction.builder()
                                        .dataType(TrackingRefAdjustmentTransactionDataType.TRACKING_CATEGORIES)
                                        .id("e9a1b63d-9ff0-40e7-8038-016354b987e6")
                                        .build()))
                                .build()))
                        .build()))
                .build();

        CreateAdjustmentTransactionResponse res = sdk.adjustments().create()
                .request(req)
                .call();

        if (res.adjustmentTransactionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [CreateAdjustmentTransactionRequest](../../models/operations/CreateAdjustmentTransactionRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[CreateAdjustmentTransactionResponse](../../models/operations/CreateAdjustmentTransactionResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |